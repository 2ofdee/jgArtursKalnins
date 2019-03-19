package lv.Homework5;

public class Book {
    private String author;
    private String title;
    private int pageCount;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean equals(Book book) {
        return title.equals(book.getTitle())
                && author.equals(book.getAuthor())
                && pageCount == book.getPageCount();
    }

    @Override
    public String toString() {
        return String.format("{ author: %s,\n" +
                "title: %s,\n" +
                "page count: %s }",
                author, title, pageCount);
    }
}

