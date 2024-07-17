import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationPanel extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 100;
    private int step = 5;
    private Color[] colors = {Color.pink, Color.yellow, Color.green, Color.orange, Color.red, Color.blue};
    private int colorIndex = 0;

    AnimationPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.cyan);
        Timer timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawIceCream(g);
    }

    private void drawIceCream(Graphics g) {

        g.setColor(new Color(139, 69, 19));
        int[] xPoints = {x + 50, x + 70, x + 90};
        int[] yPoints = {y + 100, y + 200, y + 100};
        g.fillPolygon(xPoints, yPoints, 3);


        g.setColor(colors[colorIndex]);
        g.fillOval(x + 50, y + 50, 40, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += step;
        if (x > getWidth() - 100 || x < 0) {
            step = -step;
        }

        colorIndex = (colorIndex + 1) % colors.length;
        repaint();
    }
}

