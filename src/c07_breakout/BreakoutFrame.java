package c07_breakout;

import javax.swing.JFrame;

public class BreakoutFrame extends JFrame {
    public BreakoutFrame() {
        add(new Board());
        setTitle("Breakout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGHT);
        setLocationRelativeTo(null);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);
    }
}
