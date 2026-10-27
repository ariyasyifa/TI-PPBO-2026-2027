
public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank(
                "001", "Syifa", "Tabungan", 1000000
        );

        RekeningBank rek2 = new RekeningBank(
                "002", "Quratan", "Giro", 500000
        );

        System.out.println("=== TRANSAKSI REKENING 1 ===");
        rek1.setor(200000);
        rek1.tarik(100000);

        System.out.println("\n=== TRANSAKSI REKENING 2 ===");
        rek2.setor(300000);
        rek2.tarik(50000);

        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 200000);

        System.out.println("\n=== TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 5000000);

        System.out.println("\n=== MUTASI AKHIR ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
