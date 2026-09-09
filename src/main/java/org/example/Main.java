package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookstoreManager manager=new BookstoreManager();
        manager.addBook(new Book(1,"Clean Code","Robert C. Martin",4500));
        manager.addBook(new Book(2,"Effective Java","Joshua Bloch",5200));
        manager.addBook(new Book(3,"Head First Java","Kathy Sierra",3900));
        manager.displayBooks();
        Customer customer=new Customer(101,"Adeesha Bhanuka","adeesha@example.com");
        manager.createPurchase(1001,customer,1,3);
    }
}