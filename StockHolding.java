/**
 * Created by DJ on 6/24/2017.
 */
public class StockHolding {

//    Write a class StockHolding.  The purpose of a StockHolding object is to represent a single stock in someone's investment portfolio.
//    The StockHolding class has the following specification:
//
//
//    instance variable of type String for the ticker symbol of the stock
    private String ticker;
//    instance variable of type int for the number of shares held
    private int numShares;
//    instance variable of type double for the initial price of one share
    private double startPrice;
//    instance variable of type double for the current price of one share
    private double finPrice;
//
//    constructor
// current share price is initialized to the same value as initialPrice
   StockHolding(String ticker, int numberShares, double initialPrice)
   {
       this.ticker = ticker;
       this.numShares = numberShares;
       this.startPrice= initialPrice;
       this.finPrice = initialPrice;
   }

//
//    accessors

    public String getTicker() {
        return ticker;
    }

    public int getNumShares() {
        return numShares;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public double getFinPrice() {
        return finPrice;
    }

    // number of shares * initial price
    public double getInitialCost()
    {
        return numShares*startPrice;
    }

    // number of shares * current price
    public double getCurrentValue()
    {
        return numShares*finPrice;
    }
// number of shares * (current price - initial price)
   public double getCurrentProfit()
   {
       return numShares * (finPrice - startPrice);
   }

    @Override
//    // Stock AAPL, 19, shares bought at 103.97, current price 105.5
    public String toString() {
        return "Stock "+ ticker +
                " , "+ numShares +
                ", shares bought at " + startPrice +
                ", current price " + finPrice;
    }

//
//    mutators
void setCurrentSharePrice(double sharePrice)
{
    this.finPrice = sharePrice;
}


}

