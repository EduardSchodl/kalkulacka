public class InsertToLabel
{
    StringBuffer text;

    protected void FuncBtns(String btn)
    {
        text = new StringBuffer(Calculator.textClass.getText());

        switch(btn)
        {
            case "DEL":
                if(text.length() == 0)
                {
                    return;
                }
                text.deleteCharAt(text.length() - 1);
                Calculator.lastOperation = "";
                break;
            case "C":
                text = new StringBuffer();
                Calculator.a = 0;
                Calculator.b = 0;
                Calculator.lastResult = 0;
                Calculator.currentResult = 0;
                Calculator.operace = null;
                Calculator.lastOperation = "";
                Calculator.text1Class.setText("");
                break;
            case "AC":
                if(text.length() != 0)
                {
                    text = new StringBuffer();
                    Calculator.lastOperation = "";
                }
                break;
        }
        Calculator.textClass.setText(String.valueOf(text));
        Calculator.textClass.requestFocus();
    }

    protected void NumsBtns(String btn)
    {
        Calculator.textClass.setText(Calculator.textClass.getText() + btn);
        Calculator.textClass.requestFocus();
    }

    protected void OperationBtns(String btn)
    {
        text = new StringBuffer(Calculator.textClass.getText());

        switch(btn)
        {
            case "=":
                if(!Double.isNaN(Calculator.a) && text.length() != 0)
                {
                    if(Calculator.lastOperation.equalsIgnoreCase("="))
                    {
                        Calculator.b = Calculator.lastDigit;
                        Calculator.a = Calculator.currentResult;
                    }
                    else
                    {
                        Calculator.b = Double.parseDouble(String.valueOf(text));
                    }

                    if (Calculator.operace != null)
                    {
                        new Calculation();
                        text = new StringBuffer(Calculation.calculate(Calculator.a, Calculator.b, Calculator.operace));
                        Calculator.text1Class.setText(Calculator.a + " " + Calculator.operace+ " "+ Calculator.b + " = " + text);
                        Calculator.lastResult = Calculator.currentResult;
                        Calculator.lastOperation = "=";
                        Calculator.lastDigit = Calculator.b;
                        Calculator.currentResult = Double.parseDouble(String.valueOf(text));
                    }
                }
                break;
            case "+":
                if(text.length() != 0)
                {
                    Calculator.a = Double.parseDouble(String.valueOf(text));
                    Calculator.operace = "+";
                    Calculator.lastOperation = "";
                    text = new StringBuffer();
                }
                break;
            case "-":
                if(text.length() != 0)
                {
                    Calculator.a = Double.parseDouble(String.valueOf(text));
                    Calculator.operace = "-";
                    Calculator.lastOperation = "";
                    text = new StringBuffer();
                }
                break;
            case "/":
                if(text.length() != 0)
                {
                    Calculator.a = Double.parseDouble(String.valueOf(text));
                    Calculator.operace = "/";
                    Calculator.lastOperation = "";
                    text = new StringBuffer();
                }
                break;
            case "*":
                if(text.length() != 0)
                {
                    Calculator.lastOperation = "";
                    Calculator.a = Double.parseDouble(String.valueOf(text));
                    Calculator.operace = "*";
                    text = new StringBuffer();
                }
                break;
            case "%":
                if(text.indexOf("%") == -1 && text.length() != 0 && Calculator.a != 0 && Calculator.operace != null)
                {
                    Calculator.lastOperation = "";
                    if(Calculator.operace.equalsIgnoreCase("+") || Calculator.operace.equalsIgnoreCase("-"))
                    {
                        double d = Double.parseDouble(String.valueOf(text))/100;
                        double f = (Calculator.a / (1 / d));
                        text = new StringBuffer(String.valueOf(Double.valueOf(f)));
                    }
                    else
                    {
                        double c = Double.parseDouble(String.valueOf(text));
                        text = new StringBuffer(String.valueOf(c /100));
                    }
                }
                break;
        }
        Calculator.textClass.setText(String.valueOf(text));
        Calculator.textClass.requestFocus();
    }

    protected void SpecialBtns(String btn)
    {
        text = new StringBuffer(Calculator.textClass.getText());

        switch(btn)
        {
            case "+/-":
                if(text.length() != 0)
                {
                    Calculator.lastOperation = "";
                    double c = Double.parseDouble(String.valueOf(text));
                    text = new StringBuffer(String.valueOf(c*-1));
                }
                break;
            case ".":
                if(text.indexOf(".") == -1)
                {
                    Calculator.lastOperation = "";
                    text.append(".");
                }
                break;
        }
        Calculator.textClass.setText(String.valueOf(text));
        Calculator.textClass.requestFocus();
    }
}