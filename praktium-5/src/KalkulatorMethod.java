
import java.util.Scanner;
public class KalkulatorMethod {

    //method tmbah dengan 2 parameter
    static double tambah(double a, double b) {
        return a + b;
    }
    // Method tambah dengan 3 parameter (overloading)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    //method pengrangan
    static double kurang(double a, double b) {
        return a - b;
    }
    //method perkalian
    static double kali(double a, double b) {
        return a * b;
    }
    // method pangkat
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }
    // Method pembagian
    static double bagi(double a, double b) {
        return a / b;
    }
    // method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }
    // Method mencari hasil terbesar dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];
        for (double hasil : riwayatHasil) {
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }
        return maksimum;
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Array untuk menyimpan semua hasil perhitungan
            double[] riwayatHasil = new double[100];
            int jumlahRiwayat = 0;

            int pilihan;
            do {
                System.out.println("1. Tambah 2 bilangan");
                System.out.println("2. Tambah 3 bilangan");
                System.out.println("3. Kurang");
                System.out.println("4. Kali");
                System.out.println("5. Bagi");
                System.out.println("6. Pangkat");
                System.out.println("7. Akar Kuadrat");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");

                pilihan = input.nextInt();

                double a;
                double b;
                double hasil;

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan angka pertama: ");
                        a = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        b = input.nextDouble();

                        hasil = tambah(a, b);
                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                        System.out.println("Hasil: " + hasil);
                        break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double c = input.nextDouble();

                    hasil = tambah(a, b, c);
                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;

                    System.out.println("Hasil: " + hasil);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b); riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;

                    System.out.println("Hasil: " + hasil);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);
                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;

                    System.out.println("Hasil: " + hasil);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble(); if (b == 0) {

                        System.out.println("Error: tidak bisa membagi dengan nol.");
                    } else { hasil = bagi(a, b);
                        riwayatHasil[jumlahRiwayat] = hasil; jumlahRiwayat++;
                        System.out.println("Hasil: " + hasil); }
                    break;

                    case 6:
                        System.out.print("Masukkan bilangan: ");
                        a = input.nextDouble();

                        System.out.print("Masukkan pangkat: ");
                        b = input.nextDouble();

                        hasil = pangkat(a, b);
                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;

                        System.out.println("Hasil: " + hasil);
                        break;

                case 7:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    if (a < 0) {
                        System.out.println("Error: bilangan tidak boleh negatif.");
                    } else {
                        hasil = akarKuadrat(a);
                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;

                        System.out.println("Hasil: " + hasil);
                    }
                    break;
                case 0:
                    System.out.println("Program selesai.");

                    if (jumlahRiwayat > 0) {
                        // Membuat array baru sesuai jumlah hasil yang sudah ada
                        double[] hasilAkhir = new double[jumlahRiwayat];

                        for (int i = 0; i < jumlahRiwayat; i++) {
                            hasilAkhir[i] = riwayatHasil[i];
                        }
                        double maksimum = riwayatKeMaksimum(hasilAkhir);

                        System.out.println("Hasil terbesar dari riwayat: " + maksimum);
                    } else {
                        System.out.println("Belum ada hasil perhitungan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
            } while (pilihan !=0);
        input.close();
        }
    }

