import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email giriniz : ");
        String email = scanner.nextLine();
        System.out.println("Şifre giriniz : ");
        int sifre = scanner.nextInt();
    }
}
