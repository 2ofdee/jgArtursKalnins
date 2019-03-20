package lv.Homework5;

//Vajag nodemonstrēt arī to ka grāmatas sakrīt
public class BookEqualsTest{
    public static void main(String[] args) {
        //izveido metodi createRainisBook
        Book book = new Book();

        book.setAuthor("Rainis");
        book.setTitle("Zelta Zirgs");
        book.setPageCount(329);

        //izveido metodi createLoveCraftBook
        Book book2 = new Book();

        book2.setAuthor("Lovecraft");
        book2.setTitle("Zelta Zirgs");
        book2.setPageCount(329);

//lieka rinda un salīdzinšanu var iznest atsevišķā metodē
        //tas ļaus vienkārši nodemonstrēt gan to ka equals ir true un false gadījumus
        if(book.equals(book2)){
            System.out.println("These books are the same!");
        } else {
            System.out.println("These books are different!");
            System.out.println("book1: "+book.toString());
            System.out.println("book2: "+book2.toString());
        }



    }


}
