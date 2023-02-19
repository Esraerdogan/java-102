package inter;

public interface IBanka {
    final String hostIpAdress = "127.0.0.1";
     boolean connect (String ipAdress);
    boolean payment (double price, String cardNumber, String date, String cvc);
}
