import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class KeyboardListen implements KeyListener
{

    KeyboardListen()
    {
        Calculator.textClass.requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //unused
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //unused
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String btnPressed = String.valueOf(e.getKeyChar());

        if(Calculator.funcList.contains(btnPressed))
        {
            new FuncBtn().keybListen(btnPressed);
        }
        else if(Calculator.opersList.contains(btnPressed))
        {
            new OperationBtn().keybListen(btnPressed);
        }
        else if(Calculator.specialsList.contains(btnPressed))
        {
            new SpecialBtn().keybListen(btnPressed);
        }
        else if(btnPressed.matches("[0-9]+"))
        {
            new BtnNums().keybListen(btnPressed);
        }
        else
        {
            return;
        }
    }
}
