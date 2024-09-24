import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FlowerDisplay extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the background color
        setBackground(Color.WHITE);

        // Draw flower with petals
        drawFlower(g2d, 200, 200, 100);
    }

    private void drawFlower(Graphics2D g2d, int centerX, int centerY, int radius) {
        g2d.setColor(Color.YELLOW); // Color of flower center
        g2d.fill(new Ellipse2D.Double(centerX - radius / 4, centerY - radius / 4, radius / 2, radius / 2));

        g2d.setColor(Color.RED); // Color of petals
        int petalCount = 6;
        double angle = 2 * Math.PI / petalCount;

        for (int i = 0; i < petalCount; i++) {
            double petalAngle = i * angle;
            int petalX = (int) (centerX + radius * Math.cos(petalAngle));
            int petalY = (int) (centerY + radius * Math.sin(petalAngle));
            drawPetal(g2d, petalX, petalY, radius / 2);
        }
    }

    private void drawPetal(Graphics2D g2d, int centerX, int centerY, int petalRadius) {
        g2d.fill(new Ellipse2D.Double(centerX - petalRadius, centerY - petalRadius / 2, petalRadius * 2, petalRadius));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flower Display");
        FlowerDisplay panel = new FlowerDisplay();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
