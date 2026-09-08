import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan nama: ");
        String nama = sc.nextLine();
        System.out.println("Masukan umur: ");
        int umur = sc.nextInt();

        System.out.println("Halo " + ", umur Anda " + umur +" tahun.");
    }

}
