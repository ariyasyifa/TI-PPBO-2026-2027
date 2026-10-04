import java.util.Scanner;

public class PolaSegitigaDanPersegi {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukan tinggi/ukuran: ");
            int ukuran = input.nextInt();

            System.out.println("Segitiga terbalik:");

            for (int i = ukuran; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Persegi:");

            for (int i = 1; i <= ukuran; i++) {
                for (int j = 1; j <= ukuran; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

