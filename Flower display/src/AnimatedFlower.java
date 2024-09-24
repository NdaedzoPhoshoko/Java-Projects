import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedFlower extends JPanel implements ActionListener {

    private static final int PETAL_COUNT = 4;
    private static final int PETAL_RADIUS = 100;
    private double angleOffset = 0.0;

    private Timer timer;

    public AnimatedFlower() {
        timer = new Timer(30, this); // Timer updates every 30 milliseconds
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the background color
        setBackground(Color.WHITE);

        // Draw the flower
        drawFlower(g2d, getWidth() / 2, getHeight() / 2, PETAL_RADIUS);
    }

    private void drawFlower(Graphics2D g2d, int centerX, int centerY, int radius) {
        g2d.setColor(Color.BLACK); // Color of flower center
        g2d.fill(new Ellipse2D.Double(centerX - radius / 4, centerY - radius / 4, radius / 2, radius / 2));

        g2d.setColor(Color.RED); // Color of petals
        double angleStep = 2 * Math.PI / PETAL_COUNT;

        for (int i = 0; i < PETAL_COUNT; i++) {
            double petalAngle = i * angleStep + angleOffset;
            int petalX = (int) (centerX + radius * 1 * Math.cos(petalAngle));
            int petalY = (int) (centerY + radius * 1 * Math.sin(petalAngle));
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

    @Override
    public void actionPerformed(ActionEvent e) {
        angleOffset += 0.05; // Increment angle for animation
        repaint(); // Request repaint to update the animation
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animated Flower");
        AnimatedFlower panel = new AnimatedFlower();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
