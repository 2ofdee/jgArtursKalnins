package lv.Homework5;

public class BookEqualsTest{
    public static void main(String[] args) {
        Book book = new Book();

        book.setAuthor("Rainis");
        book.setTitle("Zelta Zirgs");
        book.setPageCount(329);

        Book book2 = new Book();

        book2.setAuthor("Lovecraft");
        book2.setTitle("Zelta Zirgs");
        book2.setPageCount(329);


        if(book.equals(book2)){
            System.out.println("These books are the same!");
        } else {
            System.out.println("These books are different!");
            System.out.println("book1: "+book.toString());
            System.out.println("book2: "+book2.toString());
        }



    }


}
