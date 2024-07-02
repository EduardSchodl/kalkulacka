import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ClassText extends JLabel
{
    ClassText(Font customFont)
    {
        setFont(customFont);
        setPreferredSize(new Dimension(400, 100));
        setBorder(new EmptyBorder(0,20,0,0));
        setOpaque(true);
        setBackground(new Color(255, 161, 205));
    }
}
