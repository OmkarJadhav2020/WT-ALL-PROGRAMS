import javax.swing.*;

public class SimpleMessageSwing extends JFrame
{
    public SimpleMessageSwing()
    {
        JLabel label = new JLabel("This is simple message");
        add(label);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleMessageSwing();
    }
}