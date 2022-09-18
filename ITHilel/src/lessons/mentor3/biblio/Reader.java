package lessons.mentor3.biblio;/*
Created by Pavel Gryshchenko on 23.08.2022
*/

class Reader {
    private String name;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader(String name, int ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", faculty='" + faculty + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    void takeBook(int bookQuantity) {
        System.out.println(this.name + " took " + bookQuantity + " book(s)");
    }

    void takeBook(Book[] book) {
        System.out.println(this.name + " took " + " below book(s)");
        for (Book myBook : book) {
            System.out.println(myBook.getBookName() + myBook.getBookAuthor() + "\n");
        }
    }

    void returnBook(int bookQuantity) {
        System.out.println(this.name + " returned " + bookQuantity + " book(s)");
    }

    void returnBook(Book[] book) {
        System.out.println(this.name + " returned " + " below book(s)");
        for (Book myBook : book) {
            System.out.println(myBook.getBookName() + " returned " + myBook.getBookAuthor());
        }
    }
}

