package org.example;

import java.io.FileWriter; import java.io.IOException; import java.util.ArrayList; import java.util.List;

public class BookstoreManager {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){ books.add(book); }

    public void displayBooks(){
        System.out.println("\n--- Available Books ---");
        for(Book book:books)
            System.out.printf("%d | %s | %s | Rs. %.2f%n",book.getId(),book.getTitle(),book.getAuthor(),book.getPrice());
    }

    public Purchase createPurchase(int purchaseId, Customer customer, int... bookIds){
        Purchase purchase=new Purchase(purchaseId,customer);
        for(int id:bookIds)
            for(Book book:books)
                if(book.getId()==id) purchase.addBook(book);

        double total=0;
        for(Book book:purchase.getBooks()) total += book.getPrice();

        String invoice="===== BOOKSTORE INVOICE =====\nCustomer: "+customer.getName()+"\n";
        for(Book book:purchase.getBooks())
            invoice += book.getTitle()+" - Rs. "+String.format("%.2f",book.getPrice())+"\n";
        invoice += "Total: Rs. "+String.format("%.2f",total)+"\n";

        try(FileWriter writer=new FileWriter("invoice.txt")){ writer.write(invoice); }
        catch(IOException e){ System.out.println("Invoice file error: "+e.getMessage()); }

        System.out.println(invoice);
        return purchase;
    }
}