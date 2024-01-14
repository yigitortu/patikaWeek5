import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());


        books.add(new Book("Telepati", 100, "Taylor", "2020"));
        books.add(new Book("Olasılıksız", 250, "Katlin", "2005"));
        books.add(new Book("Tutuklu", 150, "Cabbar", "2012"));

        for (Book kitap: books
             ) {
            System.out.println(kitap.getBookName());
        }





    }
}