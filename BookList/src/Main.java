
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<Book>();
        books.add(new Book("İnsan Neyle Yaşar",96,"Tolstoy",1885));
        books.add(new Book("Çocukluk",105,"Tolstoy",1962));
        books.add(new Book("Sırça Köşk",105,"Sabahattin Ali",1941));
        books.add(new Book("Beyin",215,"David Eagleman",1275));
        books.add(new Book("Homo Deus",56,"Yuval Noah Harari",1448));

        for (Book book : books){
            System.out.println("Kitap adı : " + book.getName());
            System.out.println("Sayfa sayısı : " + book.getPageNum());
            System.out.println("Yazar adı : " + book.getAuthorName());
            System.out.println("Yayın tarihi : " + book.getPublishDate());
            System.out.println("------------------------------");
        }

        System.out.println("****Sayfa sayısına göre sıralama****");

        books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });

        books.add(new Book("İnsan Neyle Yaşar",96,"Tolstoy",1885));
        books.add(new Book("Çocukluk",105,"Tolstoy",1962));
        books.add(new Book("Sırça Köşk",105,"Sabahattin Ali",1941));
        books.add(new Book("Beyin",215,"David Eagleman",1275));
        books.add(new Book("Homo Deus",56,"Yuval Noah Harari",1448));
        System.out.println("------------------------------");

        for (Book book : books){
            System.out.println("Kitap adı : " + book.getName());
            System.out.println("Sayfa sayısı : " + book.getPageNum());
            System.out.println("Yazar adı : " + book.getAuthorName());
            System.out.println("Yayın tarihi : " + book.getPublishDate());
            System.out.println("------------------------------");
        }
    }
}