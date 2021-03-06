package lv.Homework3;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;
//dzēšam nevajadzīgāš tukšās rindas

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateActualPrice(){
//dzēšam nevajadzīgāš tukšās rindas
        return regularPrice - (regularPrice * (discount / 100)) ;
//dzēšam nevajadzīgāš tukšās rindas
    }

    public void printInformation() {
//koda formatēšana "ctrl + alt + l"
        System.out.println("Product information:");
        System.out.println(String.format("Product Name: %s",name ));
        System.out.println(String.format("Regular price of the product is: %s EUR",regularPrice ));
        System.out.println("Discount for this product is "+ discount +"%");
        System.out.println(String.format("Actual price after discount is applied is %.2f EUR",calculateActualPrice()));

    }

}
