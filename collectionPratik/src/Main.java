import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // HASHSET -- > HASHLEYEREK KÜME OLUŞTURUR.
        /*HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);

        for (Integer sayi: hSet) {System.out.println(sayi);} // 20 10 30

        // ITERATOR -- > GEZMEYİ SAĞLAR
        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        itr.next(); // küme içerisindeki bir sonraki değere gitmeyi sağlar

        // LINKEDHASHSET -- > ÇİFT YÖNLÜ LİSTELEME YAPAN BİR ELEMAN

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        // iiçerisine veri atalım
        lSet.add(10);
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);

        Iterator<Integer> itr1 = lSet.iterator();

        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }*/


        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Pazartesi");
        days.add("Salı");
        days.add("Çarşamba");
        days.add("Perşembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");

        days.remove("Pazar");

        for (String day : days) {
            System.out.println(day);
        }

        // ögrencileri hem adına göre hem soyismine göre sıralamak istiyorsak TreeSet kullanıcaz.
        // comparator kullanıcaz.








    }
}