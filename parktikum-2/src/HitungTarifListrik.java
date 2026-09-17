import java.util.Scanner;

public class HitungTarifListrik {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //membaca input golongan data
            System.out.print("Masukan golongan daya (450/900/1300/2200 VA): ");
            int golongan = input.nextInt();

            //membaca input jumlah pemakaian listrik
            System.out.print("Masukan jumlah listrik (kWh): ");
            double kWh = input.nextDouble();

            double tarif = 0;
            boolean golonganValid = true;

            //mementukan tarif berdasarkan golongan daya
            switch (golongan) {
                case 450:
                    tarif = 500;
                    break;
                case 900:
                    tarif = 1000;
                    break;
                case 1300:
                    tarif = 1500;
                    break;
                case 2200:
                    tarif = 2000;
                    break;
                default:
                    golonganValid = false;
            }

            //validasi agar kWh tidak negatif atau nol
            if (!golonganValid || kWh <= 0) {
                System.out.println("\nInput tidak valid!");

                if (!golonganValid && kWh <= 0) {
                    System.out.println("Golongan daya tidak tersedia dan kWh harus lebih dari 0.");
                } else if (!golonganValid) {
                    System.out.println("golongan daya tidak tersedia.");
                } else {
                    System.out.println("Jumlah kWh harus lebih dari 0.");
                }
            } else {
                //menghitung total tagihan
                double totalTagihan = kWh * tarif;

                //menampilkan hasil akhir
                System.out.println("\n==== HASIL PERHITUNGAN ====");
                System.out.println("Golongan Daya : " + golongan + "VA");
                System.out.println("Jumlah kWh    : Rp" + tarif);
                System.out.println("Total Tagihan : Rp" + totalTagihan);
            }

            input.close();
        }
}
