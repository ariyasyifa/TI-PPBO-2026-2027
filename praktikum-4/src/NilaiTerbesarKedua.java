import java.util.Scanner;
public class NilaiTerbesarKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah data: ");
        int jumlah = input.nextInt();
        int [] angka = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        int terbesar = angka [0];
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 1; i < jumlah; i++) {
            if (angka[i] > terbesar) {
                terbesarKedua =terbesar;
                terbesar = angka[i];
            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {
                terbesarKedua = angka[i];
            }
        }
        System.out.println("Nilai terbesar = " + terbesar);
        System.out.println("Nilai terbesar kedua = " + terbesarKedua);
    }
}
