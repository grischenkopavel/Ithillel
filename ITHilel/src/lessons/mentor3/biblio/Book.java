package lessons.mentor3.biblio;/*
Created by Pavel Gryshchenko on 23.08.2022
*/

class Book {
    private String bookAuthor;
    private String bookName;

    public String getBookAuthor() {
        return this.bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookAuthor, String bookName) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
