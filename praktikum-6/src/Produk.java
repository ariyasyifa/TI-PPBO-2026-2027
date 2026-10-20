public class Produk {
    String namaProduk;
    double harga;
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 8000000);
        Produk p2 = new Produk("Mouse", 150000);

        System.out.println(p1.namaProduk + "mahal: " + p1.isMahal(500000));
        System.out.println(p1.namaProduk + "mahal: " + p1.isMahal(500000));
    }
}
