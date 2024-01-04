import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;

public class PuzzleSolver {

    public static void main(String[] args) {
        // URL of the Azure BLOB Storage container
        String containerUrl = "https://inversionrecruitment.blob.core.windows.net/find-the-code";

        // Directory to save the downloaded images
        String downloadDirectory = "Downloaded_images";

        // Create the download directory if it doesn't exist
        try {
            Files.createDirectories(Path.of(downloadDirectory));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Download each of the 1200 png files
        for (int i = 1; i <= 1200; i++) {
            String imageUrl = containerUrl + "/(" + i + ").png";
            if(Files.notExists(Path.of(downloadDirectory+"/" + i + ".png"), LinkOption.NOFOLLOW_LINKS))
            {
                downloadImage(imageUrl, downloadDirectory, i + ".png");
            }  
        }

        // Write an algorithm to solve the puzzle and place the tiles in the correct order
        int rows = 30;
        int columns = 40;

        // Create a BufferedImage to store the solved puzzle
        BufferedImage solvedPuzzle = new BufferedImage(columns * 50, rows * 50, BufferedImage.TYPE_INT_ARGB);

        // Solve the puzzle
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int tileNumber = row * columns + col + 1;
                String tileImagePath = downloadDirectory + File.separator + tileNumber + ".png";
                BufferedImage tile = loadImage(tileImagePath);

                // Calculate the position to paste the tile in the solved puzzle
                int x = col * 50;
                int y = row * 50;

                // Paste the tile into the solved puzzle
                //TODO put the algorithm for choosing the right tile here
                solvedPuzzle.getGraphics().drawImage(tile, x, y, null);
            }
        }

        // Save the solved puzzle
        saveImage(solvedPuzzle, "SolvedPuzzle image/solved_puzzle.png");
        // You need to implement this part based on your specific puzzle details and image arrangement logic
        // The javax.imageio package can be useful for image manipulation tasks
    }

    private static void downloadImage(String imageUrl, String destinationDirectory, String fileName) {
        try (InputStream in = new URL(imageUrl).openStream()) {
            Path destinationPath = Path.of(destinationDirectory, fileName);
            Files.copy(in, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Add your puzzle-solving algorithm here using the BufferedImage class and its methods
    private static BufferedImage loadImage(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void saveImage(BufferedImage image, String outputPath) {
        try {
            ImageIO.write(image, "png", new File(outputPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // For example: BufferedImage image = loadImage("path/to/some/image.png");
}
