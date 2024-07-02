import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnNums extends JButton implements ActionListener
{
    BtnNums(String cislo, int x, int y, GBCon cell)
    {
        setBackground(new Color(200, 200, 200));
        setText(cislo);
        addActionListener(this);
        cell.fill = GridBagConstraints.BOTH;
        cell.gridx = x;
        cell.gridy = y;
        cell.weightx = 1.0;
        cell.weighty = 1.0;
        cell.gridwidth = 1;
    }

    public BtnNums() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = getText();
        new InsertToLabel().NumsBtns(btn);
    }

    public void keybListen(String btn)
    {
        new InsertToLabel().NumsBtns(btn);
    }
}
