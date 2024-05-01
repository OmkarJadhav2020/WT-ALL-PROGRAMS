import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class MouseEventsExample extends JFrame
{
    JLabel label;
    public MouseEventsExample()
    {
        label = new JLabel("Enter the rectangle");
        label.setBounds(100,100,200,200);
        Border border = BorderFactory.createLineBorder(Color.black,2);
        label.setBorder(border);
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                label.setText("You just clicked me at (" + e.getX() + ',' + e.getY() + ")");
            }
            @Override
            public void mousePressed(MouseEvent e)
            {
                label.setText("You just pressed now release me");
                getContentPane().setBackground(Color.CYAN);
            }
            @Override
            public void mouseReleased(MouseEvent e)
            {
                label.setText("Your just released me");
                getContentPane().setBackground(Color.white);
            }
            @Override
            public void mouseEntered(MouseEvent e)
            {
                label.setText("You are now at (" + e.getX() + "," + e.getY() + ")");
            }
            @Override
            public void mouseExited(MouseEvent e)
            {
                label.setText("Don't leave me alone :( ");
                
            }
        });
        
        add(label);
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventsExample();
    }    
}