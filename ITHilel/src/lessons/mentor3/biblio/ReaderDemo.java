package lessons.mentor3.biblio;/*
Created by Pavel Gryshchenko on 24.08.2022
*/

public class ReaderDemo {
    public static void main(String[] args) {
        Reader sam = new Reader("Sam", 1, "philosophy", "09/01/2000", "050-90-90-425");
        Reader greg = new Reader("Greg", 2, "management", "05/12/1989", "067-00-36-587");
        Reader jim = new Reader("Jim", 3, "biology", "25/07/1999", "098-56-78-545");

        Reader[] readers = {sam, greg, jim};

        Book cobzarBook = new Book("Shevschenko", "Kobzar");
        Book javaBook = new Book("Shield", "Java for beginners");

        Book[] books = {cobzarBook, javaBook};

        sam.returnBook(4);
        sam.takeBook(125);
        System.out.println(sam.toString());
        System.out.println(javaBook.toString());
        printReaders(readers);
        printBooks(books);
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("List of readers:");
        for (Reader myReader : readers) {
            System.out.println(myReader.toString());
        }
        System.out.println();
    }

    private static void printBooks(Book[] books) {
        System.out.println("List of books");
        for (Book myBook :
                books) {
            System.out.println(myBook.toString());
        }
        System.out.println();
    }
}
