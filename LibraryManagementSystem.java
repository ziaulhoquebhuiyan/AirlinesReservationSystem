class Library {
    String name;
    List<Book> books;
    List<Member> members;

    void addBook(Book book) {}
    void removeBook(Book book) {}
}

class Book {
    String title;
    String author;
    String ISBN;
    boolean status;

    void checkout(Member member) {}
    void returnBook() {}
}

class Member {
    String name;
    String memberID;
    List<Book> borrowedBooks;

    void borrowBook(Book book) {}
    void returnBook(Book book) {}
}

class Librarian {
    String name;
    String employeeID;

    void issueBook(Book book, Member member) {}
    void collectBook(Book book, Member member) {}
}