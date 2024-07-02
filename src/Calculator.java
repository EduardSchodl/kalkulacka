import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator
{
    protected static double a;
    protected static double b;
    protected static double lastResult;
    protected static String lastOperation;
    protected static Double lastDigit;
    protected static double currentResult;
    protected static String operace;

    static String[] func = {"AC", "C", "DEL"};
    static String[] opers = {"/", "*", "+", "-", "=", "%"};
    static String[] specials = {"+/-", "."};
    static ArrayList<String> specialsList = new ArrayList<>(Arrays.asList(specials));
    static ArrayList<String> opersList = new ArrayList<>(Arrays.asList(opers));
    static ArrayList<String> funcList = new ArrayList<>(Arrays.asList(func));

    SetWin okno;
    ClassPanel panel;
    ClassPanel1 panel1;
    public static ClassText1 text1Class;
    public static ClassText textClass;
    GBCon cell;

    public static void main(String[] args)
    {
        Calculator main = new Calculator();
    }

    public Calculator()
    {
        nastaveni();

        pridaniBtn();

        SwingUtilities.updateComponentTreeUI(okno);
    }

    protected void nastaveni()
    {
        okno = new SetWin(null);

        panel = new ClassPanel();
        panel1 = new ClassPanel1();
        text1Class = new ClassText1();
        textClass = new ClassText(new Font("SansSerif", Font.BOLD, 30));
        cell = new GBCon();

        okno.add(panel, BorderLayout.CENTER);
        okno.add(text1Class, BorderLayout.PAGE_START);

        panel.add(panel1, BorderLayout.CENTER);
        panel.add(textClass, BorderLayout.PAGE_START);
    }

    protected void pridaniBtn() {
        int index = 9;

        for(int x = 0; x < 3; x++)
        {
            panel1.add(new FuncBtn(func[x], x, 0, cell), cell);
        }

        for (int y = 1; y < 5; y++) {
            for (int x = 2; x >= 0; x--) {
                BtnNums btn = new BtnNums(String.valueOf(index), x , y, cell);
                if (index > -1) {
                    if (index == 0) {
                        cell.gridx = 1;
                    }
                    panel1.add(btn, cell);
                    index--;
                }
            }
        }

        for (int y = 0; y < 5; y++)
        {
            panel1.add(new OperationBtn(opers[y], 3, y, cell), cell);
        }

        panel1.add(new SpecialBtn(specials[0], 0, 4, cell), cell);
        panel1.add(new SpecialBtn(specials[1], 2, 4, cell), cell);

        panel1.add(new OperationBtn(opers[5], 0, 5, cell), cell);

        textClass.addKeyListener(new KeyboardListen());
    }
}