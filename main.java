public class main {
    public static void main(String[] args) {
        //declare variables 
        double salesTaxRate = .05;
        double purchasePrice = 20;
        double salesTaxTotal;

        //process the tota purchase price of the item
        salesTaxTotal = purchasePrice * salesTaxRate;

        //output
        System.out.println("The Purchase price is: " + purchasePrice);
        System.out.println("The sales tax total is: " + salesTaxTotal);
       

    }
}