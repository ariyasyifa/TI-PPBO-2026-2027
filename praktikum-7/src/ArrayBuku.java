public class ArrayBuku {
    public static void main(String[] args) {
        Buku[] daftarBuku = {
            new Buku("Laskar Pelangi", "Andrea Hirata", 2005),
            new Buku("Bumi", "Tere Liye", 2014),
            new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009)
        };

        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("Buku ke-" + (i + 1));
            System.out.println("Judul       : " + daftarBuku[i].getJudul());
            System.out.println("Pengarang   : " + daftarBuku[i].getPengarang());
            System.out.println("Tahun Terbit: " + daftarBuku[i].getTahunTerbit());
            System.out.println();
        }
    }
}
