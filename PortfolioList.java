import java.util.ArrayList;

/**
 * Created by DJ on 6/27/2017.
 *     This program uses the StockHolding class that we wrote in the lab for Writing Classes.
 Write a class PortfolioList.  A PortfolioList object maintains a portfolio of StockHolding objects.  A PortfolioList
 */
public class PortfolioList {


//    keeps an ArrayList<StockHolding>
    ArrayList<StockHolding> sH = new ArrayList<>();
//
//
//    has a no-argument constructor

    public PortfolioList()
    {

    }


//    mutators:
// adds the given StockHolding to the portfolio
    void add(StockHolding stock)
    {
        sH.add(stock);
    }

// removes the StockHolding with the given ticker from the portfolio
    void remove(String ticker)
    {
        for( int i= 0; i< sH.size(); i++)
        {
            String info = sH.get(i).getTicker();
            if (info.equals(ticker))
            {
                sH.remove(i);
            }
        }



    }


//    accessors:
// returns a reference to the portfolio element having the given ticker.  The method should return null if there is no such element
    StockHolding find(String ticker)
    {
        for( int i= 0; i < sH.size(); i++)
        {
            String info = sH.get(i).getTicker();
            if (info.equals(ticker))
            {
                return sH.get(i);
            }
            else
            {

                return null;
            }
        }

       return null;
    }


// returns a string containing the toString values of each element separated by newline characters (\n)
    String tooString()
    {
        String allStrings = "";
        for (int i = 0; i< sH.size(); i++)
        {
            allStrings = allStrings + sH.get(i).toString() + "\n";
        }


            return allStrings;
    }


}
