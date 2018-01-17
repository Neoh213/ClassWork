/**
 * Created by DJ on 6/27/2017.
 * //    Write a class PortfolioDriver that contains only a main method.  The main method should create two PortfolioList objects.
 //    It should add two StockHolding objects to one portfolio, and 4 to the other.  It should print both portfolios.
 //    It should find and print the toString value of a stock in one portfolio.
 //    It should delete all of the StockHolding objects from the portfolio with 4 objects, and print the portfolio.
 */
public class PortfolioDriver {
    public static void main (String [] args)
    {
        //two portfolios
        PortfolioList test1 = new PortfolioList();
        PortfolioList test2 = new PortfolioList();

        //four stockholding objects
        StockHolding first = new StockHolding("FIRST", 19, 103.97);
        StockHolding second = new StockHolding("SECOND", 19, 103.97);
        StockHolding third = new StockHolding("THIRD", 19, 103.97);
        StockHolding fourth = new StockHolding("FOURTH", 19, 103.97);

        //add 2 to test1 and 4 to test2
        test1.add(first);
        test1.add(second);
        test2.add(first);
        test2.add(second);
        test2.add(third);
        test2.add(fourth);

        //print the two portfolios
        System.out.println(test1.tooString());
        System.out.println(test2.tooString());

        //find and print the toString value of a stock in test1 portfolio
        System.out.println(test1.find("FIRST"));

        test2.remove("FIRST");
        test2.remove("SECOND");
        test2.remove("THIRD");
        test2.remove("FOURTH");

        System.out.println(test2.tooString());


    }
}
