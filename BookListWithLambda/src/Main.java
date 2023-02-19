import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Gece Yarısı Kütüphanesi", 283, "Matt Haig", 2022);
        Book b2 = new Book("Atomik Alışkanlıklar", 352, "James Clear", 2020);
        Book b3 = new Book("Şeker Portakalı", 182, "Jose Mauro De Vanconcelos", 2019);
        Book b4 = new Book("Simyacı", 184, "Paulo Coelho", 2021);
        Book b5 = new Book("Yaşamak", 210, "Yu Hua", 2019);
        Book b6 = new Book("İnsan Olmak", 192, "Engin Geçtan", 2021);
        Book b7 = new Book("Saatleri Ayarlama Enstitüsü", 382, "Ahmet Hamdi Tanpınar", 2017);
        Book b8 = new Book("İnsan Geleceğini Nasıl Kurar?", 288, "İlber Ortaylı", 2022);
        Book b9 = new Book("Cesur Yeni Dünya", 272, "Aldous Huxley", 2021);
        Book b10 = new Book("İnsanın Anlam Arayışı", 170, "Viktor Emil Frankl", 2019);

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        System.out.println("İlk Sıralama");

        books.stream().forEach(kitap -> System.out.println(kitap.getName() + " - " + kitap.getPageNumber() + " - " + kitap.getAuthorName() + " - " + kitap.getPublishingDate()));
        System.out.println("Sayfa sayısına göre sıralama");
        books.stream().filter(sayfa -> sayfa.getPageNumber() > 60)
                .forEach(sayfa -> System.out.println(sayfa.getPageNumber()));


        Map<String, String> bookList = new HashMap<>();
        bookList.put("Gece Yarısı Kütüphanesi","Matt Haig");
        bookList.put("Atomik Alışkanlıklar", "James Clear");
        bookList.put("Şeker Portakalı", "Jose Mauro De Vanconcelos");
        bookList.put("Simyacı", "Paulo Coelho");
        bookList.put("Yaşamak", "Yu Hua");
        bookList.put("İnsan Olmak", "Engin Geçtan");
        bookList.put("Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi Tanpınar");
        bookList.put("İnsan Geleceğini Nasıl Kurar?", "İlber Ortaylı");
        bookList.put("Cesur Yeni Dünya", "Aldous Huxley");
        bookList.put("İnsanın Anlam Arayışı", "Viktor Emil Frankl");

        System.out.println("İsim ve Yazar Olacak Şekilde Sıralama");

        System.out.println(bookList);


    }

}