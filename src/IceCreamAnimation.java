import javax.swing.JFrame;

public class IceCreamAnimation {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        AnimationPanel panel = new AnimationPanel();

        frame.add(panel);
        frame.setTitle("Ice Cream Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
