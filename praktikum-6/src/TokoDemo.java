public class TokoDemo {
    public static void main(String[] args) {
        TugasProduk[] daftarProduk = {
                new TugasProduk("P001", "Laptop", 7500000, 5),
                new TugasProduk("P002", "Mouse", 150000, 10),
                new TugasProduk("P003", "Keyboard", 250000, 8),
                new TugasProduk("P004", "Monitor", 1800000, 4),
                new TugasProduk("P005", "Headset", 350000, 6)
        };
        System.out.println("===DAFTAR SELURUH PROUK ===");
        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }
        System.out.println("\n=== SIMULASI PEMBELIAN ===");

        System.out.println("\nPembelian Mouse sebanyak 2:");
        System.out.println("Total harga: Rp" + daftarProduk[1].hitungTotalHarga(2));
        daftarProduk[1].kurangiStok(2);

        System.out.println("\nPembelian Laptop sebanyak 10:");
        System.out.println("Total harga: Rp" + daftarProduk[0].hitungTotalHarga(10));
        daftarProduk[0].kurangiStok(10);

        System.out.println("\n=== PRODUK DENGAN HARGA TERMAHAL ===");

        TugasProduk termahal = daftarProduk[0];
        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > termahal.harga) {
                termahal = daftarProduk[i];
            }
        }
        termahal.tampilkanData();
    }
}

