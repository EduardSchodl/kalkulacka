import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ClassText1 extends JLabel
{
    ClassText1()
    {
        setBackground(new Color(200, 138, 255));
        setPreferredSize(new Dimension(400,50));
        setOpaque(true);
        setVisible(true);
        setBorder(new EmptyBorder(0,0,0,20));
    }
}
