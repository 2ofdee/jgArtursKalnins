package lv.Homework4;

public class StockMarket {

    public static void main(String[] args) {
        StockClass ibm = new StockClass("IBM",150 );

        ibm.updatePrice(150.37);
        ibm.updatePrice(149.82);
        ibm.updatePrice(150.12);

        ibm.printInformation();


    }
}

