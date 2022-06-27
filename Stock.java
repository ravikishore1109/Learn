public class Stock {
    private int shares;
    private double price;
    private int shareCapital;

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public int getShareCapital() {
        return shareCapital;
    }

    public void buy(double p, int n)
    {
        shares+=n;
        price=p;
        shareCapital+=(n*p);
    }
    public void sell(double p, int n)
    {
        if(n<=getShares()) {
            shares -= n;
            price = p;
            shareCapital -= (n * p);
        }
        else {
            System.out.println("Not enough quantity to sell");
        }
    }
    public double average()
    {
        return getShareCapital()/getShares();
    }
}
