import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class DetailedFlowerDisplay extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the background color
        setBackground(Color.WHITE);

        // Draw the flower
        drawFlower(g2d, 250, 250, 100);
    }

    private void drawFlower(Graphics2D g2d, int centerX, int centerY, int radius) {
        g2d.setColor(Color.YELLOW); // Color of flower center
        g2d.fill(new Ellipse2D.Double(centerX - radius / 4, centerY - radius / 4, radius / 2, radius / 2));

        g2d.setColor(Color.PINK); // Color of petals
        int petalCount = 8;
        double angle = 2 * Math.PI / petalCount;

        for (int i = 0; i < petalCount; i++) {
            double petalAngle = i * angle;
            int petalX = (int) (centerX + radius * 0.8 * Math.cos(petalAngle));
            int petalY = (int) (centerY + radius * 0.8 * Math.sin(petalAngle));
            drawPetal(g2d, petalX, petalY, radius / 2);
        }
    }

    private void drawPetal(Graphics2D g2d, int centerX, int centerY, int petalRadius) {
        GeneralPath petal = new GeneralPath();
        petal.moveTo(centerX, centerY);
        petal.quadTo(centerX + petalRadius, centerY - petalRadius, centerX, centerY - 2 * petalRadius);
        petal.quadTo(centerX - petalRadius, centerY - petalRadius, centerX, centerY);
        g2d.fill(petal);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Detailed Flower Display");
        DetailedFlowerDisplay panel = new DetailedFlowerDisplay();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
