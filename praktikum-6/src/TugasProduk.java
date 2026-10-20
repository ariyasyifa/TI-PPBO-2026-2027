public class TugasProduk {
        String kodeProduk;
        String namaProduk;
        double harga;
        int stok;

        public TugasProduk(String kodeProduk, String namaProduk, double harga, int stok) {
            this.kodeProduk = kodeProduk;
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = stok;
        }
        public double hitungTotalHarga ( int jumlahBeli){
            return harga * jumlahBeli;
        }
        public void kurangiStok ( int jumlah){
            if (stok >= jumlah) {
                stok -= jumlah;
                System.out.println("Pembelian berhasil!");
                System.out.println("Sisa stok: " + stok);
            } else {
                System.out.println("Stok tidak mencukupi");
            }
        }
        public void tampilkanData () {
            System.out.println("Kode Produk : " + kodeProduk);
            System.out.println("Nama Produk : " + namaProduk);
            System.out.println("Harga       : Rp" + harga);
            System.out.println("Stok        : " + stok);
            System.out.println("--------------------------------");
        }
    public static void main(String[] args) {
        TugasProduk p1 = new TugasProduk("P001", "Laptop", 8000000, 10);
        TugasProduk p2 = new TugasProduk("P002", "Mouse", 150000, 25);

        p1.tampilkanData();
        p2.tampilkanData();

        System.out.printf("Total beli 2 Laptop : Rp%.0f%n", p1.hitungTotalHarga(2));
        p1.kurangiStok(2);

        System.out.println();

        System.out.printf("Total beli 30 Mouse : Rp%.0f%n", p2.hitungTotalHarga(30));
        p2.kurangiStok(30);   // stok hanya 25, jadi gagal
    }
}