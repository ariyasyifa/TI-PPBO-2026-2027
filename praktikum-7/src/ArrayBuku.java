public class ArrayBuku {
    public static void main(String[] args) {
        Buku[] daftarBuku = {
                new Buku("Laskar Pelangi", "Andrea Hirata", 2005),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Hujan", "Tere Liye", 2016),
                new Buku("Pulang", "Tere Liye", 2021)
        };
        System.out.println("Buku terbit setelah tahun 2015:");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println(daftarBuku[i].judul);
            }
        }
    }
}
