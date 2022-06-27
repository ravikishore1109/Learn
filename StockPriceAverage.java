import java.util.Scanner;

public class StockPriceAverage {
    private static double p;
    private static int n;
    public static void main(String[] args) {
        Stock s1 = new Stock();
        while (true) {
            System.out.println("Enter your option: \n1: Buy stock \n2: Sell stock \n3: Get average price of stock \n4:Exit");
            Scanner sc=new Scanner(System.in);
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    inputPriceQuantity(sc);
                    s1.buy(p,n);
                    break;
                case 2:
                    inputPriceQuantity(sc);
                    s1.sell(p,n);
                    break;
                case 3:
                    System.out.println(s1.average());
                    break;
                case 4: System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private static void inputPriceQuantity(Scanner sc) {
        System.out.println("Enter the price and no of shares");
        p= sc.nextDouble();
        n= sc.nextInt();
    }
}
