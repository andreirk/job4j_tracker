package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[3];
        for (int i = 0; i < 3; i++) {
            Book book = new Book();
            book.setName("Clean Code" + i);
            books[i] = book;
        }

        for (Book book : books
                ) {
            System.out.println("The book is: " + book.getName());
        }
    }
}
