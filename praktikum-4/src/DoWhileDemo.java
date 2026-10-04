import java.util.Scanner;
public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukan angka (0 untuk berhenti): ");
            angka = sc.nextInt();
            System.out.println("Anda memasukan: " + angka);
        } while (angka != 0);
        System.out.println("Program berhenti. ");
    }
}
