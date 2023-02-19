public class Patika {
    public static void main (String[] args){
        Calisan c1 = new Calisan("Mustafa Çetindağ", "055015623564","mcetindag@gmail.com");

        Akademisyen a1 = new Akademisyen("Lale Yılmaz","05002304554","lalee@gmail.com","CENG","Doçent");

        Memur m1 = new Memur("Ali Bal", "05002125615","bal@gmail.com","Bilgi İşlem","09:00-18:00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Esra Erdoğan", "05539183448","erdoganesra371@gmail.com","CENG","Yazılım Mühendisi");
        o1.derseGir();



    }
}
