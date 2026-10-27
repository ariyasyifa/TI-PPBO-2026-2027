public class LatihanDemo {
    public static void main(String[] args) {
        System.out.println("=== LATIHAN 1-2: BUKU ===");
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        buku.setJudul("Sang Pemimpi");
        buku.setPengarang("Andrea Hirata");
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Pengarang: " + buku.getPengarang());
        System.out.println("Tahun terbit (read-only): " + buku.getTahunTerbit());

        System.out.println("\\n=== LATIHAN 3: WAKTU ===");
        Waktu waktu = new Waktu(10, 30, 45);
        waktu.tampilkanWaktu();
        waktu.setJam(25);
        waktu.setMenit(70);
        waktu.setDetik(-1);
        waktu.tampilkanWaktu();

        System.out.println("\\n=== LATIHAN 4: SISWA ===");
        Siswa siswa = new Siswa(90);
        System.out.println("Nilai: " + siswa.getNilai());
        System.out.println("Nilai huruf: " + siswa.getNilaiHuruf());
        siswa.setNilai(110);
        System.out.println("Nilai setelah percobaan tidak valid: " + siswa.getNilai());

        System.out.println("\\n=== LATIHAN 5: PRODUK ===");
        Produk produk = new Produk("P001", "Laptop", 7500000, 10);
        produk.tambahStok(5);
        produk.kurangiStok(3);
        produk.setHarga(-1000);
        produk.kurangiStok(100);
        System.out.println("Kode: " + produk.getKodeProduk());
        System.out.println("Nama: " + produk.getNamaProduk());
        System.out.println("Harga: " + produk.getHarga());
        System.out.println("Stok akhir: " + produk.getStok());
    }
}
