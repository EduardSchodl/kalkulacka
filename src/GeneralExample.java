import javax.swing.*;

abstract public class GeneralExample extends JFrame
{
    protected String[] charactery = new String[]{"AC", "C", "DEL", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "=", "%"};
    protected String[] specialcharactery = new String[]{"AC", "C", "DEL", "/", "*", "-", "+", "+/-", ".", "=", "%"};
    protected Boolean[] flags = new Boolean[charactery.length];
    protected JButton[] buttons = new JButton[charactery.length];
/*
    public GeneralExample(String titulekOkna)
    {
        // Inicializace rodice
        super(titulekOkna);

        // Nastaveni rozlozeni
        //nastaveniRozlozeni();

        //nastaveni();

        //buttonsBackground();

        // "Naplneni" okna
        //pridaniKomponent();

        // Nastaveni "spolecnych" parametru okna
        //nastaveniOkna();
    }

 */

    //abstract protected void nastaveni();

    //abstract protected void buttonsBackground();

    protected void nastaveniOkna()
    {
        // Ukonceni aplikace
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Velikost okna
        setSize(500, 600);

        // Donastaveni okna
//        setResizable(false);
        setLocationRelativeTo(null);

        // Okno se vytvorilo, ALE musi byt videt
        setVisible(true);
    }

    //abstract protected void pridaniKomponent();

    protected void nastaveniRozlozeni()
    {
        // "Virtualni" metoda
    }
}

