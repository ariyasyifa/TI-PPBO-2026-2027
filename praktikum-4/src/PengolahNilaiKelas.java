import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //KM (Kriteria ketuntasan Minimal)
        final double KKM = 70;

        //Membaca jumlah mahasiswa
        System.out.print("Masukan jumlah mahasiswa: ");
        int N = input.nextInt();

        //Membuat array untuk menyimpan nilai mahasiswa
        double[] nilai = new double[N];

        //Membaca nilai masing-masing mahasiswa menggunakan for loop
        for (int i = 0; i < N; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        //Variable untuk menghitung total, nilai tertinggi, dan nilai terendah
        double total = 0;
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah =nilai[0];

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        //Menghitung rata rata, nilai teringgi, nilai terendah,
        //jumlah mahasiswa lulus dan tidak lulus
        for (int i = 0; i < N; i++) {

            total += nilai[i];

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        //menghitung nilai rata rata kelas
        double rataRata = total / N;

        //menampilkan nilai sebelum diurutkan
        System.out.println("\n===========================");
        System.out.println("      HASIL PENGOLAH NILAI");
        System.out.println("============================");

        System.out.println("\nNilai sebelum diurutkan:");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        // proses bubble sort untuk mengurutkan nilai dari kecil ke besar
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {

                if (nilai[j] >nilai[j + 1]) {

                    //menukar posisi dua nilai
                    double temp = nilai[j];
                    nilai[j + 1] = temp;
                }
            }
        }

        //menampilkan nilai setelah di urutkan
        System.out.println("\n\nNilai setelah diurutkan (ascending):");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        //menampilkan laporan hasil pengolahan nilai
        System.out.println("\n\n===============================");
        System.out.println("           LAPORAN NILAI");
        System.out.printf("Nilai rata rata   : %.2f%n", rataRata);
        System.out.printf("Nilai tertinggi   : %.2f%n", nilaiTertinggi);
        System.out.printf("Nilai terendah    : %.2f%n", nilaiTerendah);
        System.out.println("KKM               : " + KKM);
        System.out.println("Jumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        System.out.println("===================================");

        //menutup scanner
        input.close();
    }
}
