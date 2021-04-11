/* Nam Phu Nguyen (Logan)
   CS142 
   Programing Assignment
 */ 
import java.util.*;

public class SyntaxChecker {

    private String expression; // expression to validate
    private Stack<String> stack; // holds opening symbols ONLY
    private String open; // opening symbols
    private String close; // closing symbols

    // TODO: initialize the instance variables expression, stack, open, close
    public SyntaxChecker(String open, String close, String exp)
    {
        //same name using this.open for indicating private variables
        stack = new Stack<>();
        expression = exp;
        this.close = close;
        this.open = open;

    }

    // TODO complete the checkExpressions method that determines if the expression
    // has a closing symbol for every opening symbol
    // @return true if the expression is valid, false otherwise
    public boolean checkExpression()
    {

        boolean result = false;
        String[] closeArr = close.split("");
        String[] openArr = open.split("");
        String[] expArr = expression.split("");
        int indexClose=0;

        for (String expCh : expArr) {
            for (String o : openArr) {
                if (expCh.equals(o)) {
                    stack.push(expCh);

                }
            }
            for (String l : closeArr) {
                if (expCh.equals(l)) {
                    indexClose = close.indexOf(expCh);

                    if (stack.isEmpty()) {
                        return false;
                    } else if (indexClose != open.indexOf(stack.peek())){
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }

        }
        if (stack.isEmpty()) {
            result = true;
        }


        return result;

    }


    // This method calls the checkExpression method and will determine if the
    // expression is valid (every opening symbol, has a closing symbol)
    // A string is return with a validation message
    // @return a validation message
    public String validate()
    {
        String result="";

        if (checkExpression()==true)
            result += expression + " is correct\n";
        else
            result += expression + " is incorrect\n";


        return result;
    }


    public String toString()
    {
        return "Expression: " + expression + "\nStack: " + stack + "\nOpen: " + open + "Close: " + close;
    }

}
