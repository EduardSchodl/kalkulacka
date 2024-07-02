import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialBtn extends JButton implements ActionListener
{
    StringBuffer text;
    String keyb;

    SpecialBtn(String label, int x, int y, GBCon cell)
    {
        setBackground(new Color(170, 170, 170));
        setText(label);
        addActionListener(this);
        cell.fill = GridBagConstraints.BOTH;
        cell.gridx = x;
        cell.gridy = y;
        cell.weightx = 1.0;
        cell.weighty = 1.0;
        cell.gridwidth = 1;
    }

    public SpecialBtn() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = getText();
        new InsertToLabel().SpecialBtns(btn);
    }

    protected void keybListen(String btn)
    {
        new InsertToLabel().SpecialBtns(btn);
    }
}
