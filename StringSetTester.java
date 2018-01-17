/**
 * Created by DJ on 6/27/2017.
 * //        Write a class StringSetTester that has a main method.  It should ask the user for the number of Strings to add to a StringSet object.  Afterward, use StringSet's
 //        size and numChars methods to print information about the collection of Strings entered.  Also print the number of Strings that are exactly 5 and 7 characters long.
 //
 //        Hint:  because Scanner's nextInt and nextLine process whitespace differently, you may want to use code similar to the following
 //
 //        Scanner kybd = new Scanner(System.in);
 //        System.out.print("How many strings will you enter? ");
 //        int numStr = kybd.nextInt();  // stops after the number, leaves end of line or other whitespace
 //        kybd.nextLine();              // "eats" everything up to and including the next newline
 // the next kybd.nextLine() will read user input
 */
import java.util.Scanner;
public class StringSetTester {

    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        StringSet test = new StringSet();
        System.out.print("How many strings will you enter? ");

        int numStrings = input.nextInt();

        for(int i = 1; i <=numStrings; i++)
        {
            test.add(input.next());
        }

        System.out.println(test.size());
        System.out.println(test.numChars());
        System.out.println("There are " + test.countStrings(5) + " strings that are 5 characters long");
        System.out.println("There are " + test.countStrings(7) + " strings that are 7 characters long");

    }
}
