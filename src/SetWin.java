import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SetWin extends JFrame
{
    SetWin(ImageIcon icon)
    {
        setTitle("Kalkulačka");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 600));
        setLocationRelativeTo(null);
        setBounds(5,5,5,5);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        setIconImage(icon != null ? icon.getImage() : null);
        setVisible(true);
        pack();
    }
}