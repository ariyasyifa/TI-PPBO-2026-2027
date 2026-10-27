public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = 0;
        setHarga(harga);

        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok awal ditolak! Stok tidak boleh negatif.");
        }
    }

    public String getKodeProduk() { return kodeProduk; }
    public String getNamaProduk() { return namaProduk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setHarga(double harga) {
        if (harga >= 0) this.harga = harga;
        else System.out.println("Harga ditolak! Harga tidak boleh negatif.");
    }

    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Tambah stok gagal! Jumlah harus positif.");
        } else {
            stok += jumlah;
            System.out.println("Tambah stok berhasil. Stok: " + stok);
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Kurangi stok gagal! Jumlah harus positif.");
        } else if (jumlah > stok) {
            System.out.println("Kurangi stok gagal! Stok tidak mencukupi.");
        } else {
            stok -= jumlah;
            System.out.println("Kurangi stok berhasil. Stok: " + stok);
        }
    }
}
