public class Calculation
{
    protected static String calculate(double a, double b, String operace)
    {
        double vysledek;
        String result = null;

        switch (operace)
        {
            case "+":
                vysledek = a+b;
                result = String.valueOf(vysledek);
                break;
            case "-":
                vysledek = a-b;
                result = String.valueOf(vysledek);
                break;
            case "/":
                if(b == 0)
                {
                    result = "Nulou nelze dělit";
                }
                else
                {
                    vysledek = a/b;
                    result = String.valueOf(vysledek);
                }
                break;
            case "*":
                vysledek = a*b;
                result = String.valueOf(vysledek);
                break;
        }
        System.out.println(a +" "+operace+" "+b);
        return result;
    }
}
