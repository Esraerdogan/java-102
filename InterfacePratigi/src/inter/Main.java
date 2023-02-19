package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : " );
        double price = input.nextDouble();

        System.out.println("Kart no giriniz : ");
        String cardNumber = input.nextLine();

        System.out.println("Son kullanım tarihi giriniz : ");
        String date = input.nextLine();

        System.out.println("Güvenlik kodu giriniz : ");
        String cvc = input.nextLine();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası" );
        System.out.println("Banka Seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1 :
                ABankasi aPos = new ABankasi("A Bankası", "234655658798","2564265984");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, date ,cvc);
                break;

            case  2 :
                BBankasi bPos = new BBankasi("B Bankası", "234655658798","2564265984");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,date,cvc);
            default:
                System.out.println("Geçerli banka giriniz !");
        }

    }
}
