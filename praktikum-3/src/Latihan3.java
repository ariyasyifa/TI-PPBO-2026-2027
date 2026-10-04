import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Nasi goreng");
                break;
            case 2:
                System.out.println("Mie ayam");
                break;
            case 3:
                System.out.println("Bakso");
                break;
            case 4:
                System.out.println("Ayam geprek");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
