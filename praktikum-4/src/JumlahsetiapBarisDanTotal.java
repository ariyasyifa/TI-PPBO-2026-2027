import java.util.Scanner;

public class JumlahsetiapBarisDanTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        System.out.println("Masukan elemen matriks 3x3:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Baris " + (baris + 1) + ", kolom " + (kolom + 1) + ": ");
                matriks[baris][kolom] = input.nextInt();
            }
        }

        System.out.println("Matriks:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();
        }
        int totalMatriks = 0;

        System.out.println("Jumlah setiap baris:");

        for (int baris = 0; baris < 3; baris++) {
            int totalbaris = 0;
            for (int kolom = 0; kolom < 3; kolom++) {
                totalbaris += matriks[baris][kolom];
            }
            System.out.println("Baris " + (baris + 1) + "=" + totalbaris);
            totalMatriks += totalbaris;
        }
        System.out.println("total seluruh elemen = " + totalMatriks);
    }
}

