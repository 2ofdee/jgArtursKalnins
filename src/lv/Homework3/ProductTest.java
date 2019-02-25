package lv.Homework3;

import java.util.Scanner;

//Ok - šādi arī to varēja risināt
public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product myProduct = new Product();
//dzēšam nevajadzīgāš tukšās rindas

        System.out.println("what is the name of your product?");
        myProduct.setName(scanner.next());

        System.out.println("What is the price of your product?");
        myProduct.setRegularPrice(scanner.nextDouble());

        System.out.println("what Percent is the discount of your product?");
        myProduct.setDiscount(scanner.nextDouble());

        myProduct.printInformation();

    }
}
