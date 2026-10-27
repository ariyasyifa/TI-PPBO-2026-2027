public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanData (){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println();
    }

    public static void main(String[] args) {
        Buku b1 = new Buku("Laut Bercerita", "Leila S.Cudori", 2017);
        Buku b2 = new Buku("Bumi", "Tere Liye", 2014);

        b1.tampilkanData();
        b2.tampilkanData();
    }
}
