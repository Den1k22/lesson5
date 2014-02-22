package pack;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class buttons extends JFrame
{
    public buttons()
    {
        initUI();
    }

    public final void initUI()
    {
        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);

        basic.add(Box.createVerticalGlue());

        JPanel bottom = new JPanel();
        bottom.setAlignmentX(1f);
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));

        JButton[] butt = new JButton[10];
         for (int i =0;i<10;i++)
         {
             butt[i] = new JButton();
             butt[i].setText(" "+(i+1));
             butt[i].setBounds(0, 0, 30, 20);
             bottom.add(Box.createRigidArea(new Dimension(5, 0)));
             bottom.add(butt[i]);
         }
        bottom.add(Box.createRigidArea(new Dimension(25, 0)));

        basic.add(bottom);
        basic.add(Box.createRigidArea(new Dimension(0, 200)));

        setTitle("Many buttons");
        setSize(550, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                buttons ex = new buttons();
                ex.setVisible(true);
            }
        });
    }
}
