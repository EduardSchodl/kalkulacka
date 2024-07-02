import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationBtn extends JButton implements ActionListener
{
    StringBuffer text;
    String keyb;

    OperationBtn(String label, int x, int y, GBCon cell)
    {
        addActionListener(this);
        setBackground(new Color(170, 170, 170));
        setText(label);
        cell.fill = GridBagConstraints.BOTH;
        cell.gridx = x;
        cell.gridy = y;
        cell.weightx = 1.0;
        cell.weighty = 1.0;
        if(label.equalsIgnoreCase("%"))
        {
            cell.gridwidth = 4;
        }
        else
        {
            cell.gridwidth = 1;
        }
    }

    public OperationBtn() {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String btn = getText();
        new InsertToLabel().OperationBtns(btn);
    }

    protected void keybListen(String btn)
    {
        new InsertToLabel().OperationBtns(btn);
    }
}