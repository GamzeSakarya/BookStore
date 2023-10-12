package com.company;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Set<Book> booksByName = new TreeSet<>();
        Set<Book> booksByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount)); // Kitapları sayfa sayısına göre sıralayan set


        Book book1 = new Book("Kinyas ve Kayra", 200, "Hakan Günday", "2000");
        Book book2 = new Book("Yeraltından Notlar", 300, "Fyodor Dostoyevski", "1864");
        Book book3 = new Book("Şeker Portakalı", 250, "José Mauro de Vasconcelos", "1968");
        Book book4 = new Book("Bilinmeyen Bir Kadının Mektubu", 350, "Stefan Zweig", "1922");
        Book book5 = new Book("1984", 150, "George Orwell", "1949");


        booksByName.add(book1);
        booksByName.add(book2);
        booksByName.add(book3);
        booksByName.add(book4);
        booksByName.add(book5);

        booksByPageCount.add(book1);
        booksByPageCount.add(book2);
        booksByPageCount.add(book3);
        booksByPageCount.add(book4);
        booksByPageCount.add(book5);

        System.out.println("Kitaplar isme göre sıralandı:");
        for (Book book : booksByName) {
            System.out.println(book);
        }

        System.out.println("\nKitaplar sayfa sayısına göre sıralandı:");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}

