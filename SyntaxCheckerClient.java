/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programing Assignment
 */ 

public class SyntaxCheckerClient
{

    public static void main(String[] args)
    {

        SyntaxChecker test = new SyntaxChecker("{(<[","})>]","(abc(*def)");
        System.out.println(test.validate());

        SyntaxChecker test2 = new SyntaxChecker("{(<[","})>]","[{}]");
        System.out.println(test2.validate());

        SyntaxChecker test3 = new SyntaxChecker("{(<[","})>]","[");
        System.out.println(test3.validate());

        SyntaxChecker test4 = new SyntaxChecker("{(<[","})>]","[{<()>}]");
        System.out.println(test4.validate());

        SyntaxChecker test5 = new SyntaxChecker("{(<[","})>]","{<html[value=4]*(12)>{$x}}");
        System.out.println(test5.validate());

        SyntaxChecker test6 = new SyntaxChecker("{(<[","})>]","[one]<two>{three}(four)");
        System.out.println(test6.validate());

        SyntaxChecker test7 = new SyntaxChecker("{(<[","})>]","car(cdr(a)(b)))");
        System.out.println(test7.validate());

        SyntaxChecker test8 = new SyntaxChecker("{(<[","})>]","car(cdr(a)(b))");
        System.out.println(test8.validate());


    }

}
