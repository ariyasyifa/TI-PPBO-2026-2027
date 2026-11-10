public class PenggajianDemo {
    public static void main(String[] args) {
        Pegawai[] daftarPegawai = {
                new Manager("Budi", "M001", 3000000, 1000000),
                new Staff("Siti", "S001",2000000, 500000),
                new Staff("Andi", "S002", 2000000, 300000),
                new Direktur("Ariya Ssyifa","S006", 1000000,900000,500000),
        };
        double totalGaji = 0;
        for (Pegawai pg : daftarPegawai) {
            double gaji = pg.hitungGaji(); //versi sesuai jenis
            System.out.println(pg.nama + ": " + gaji);
            totalGaji += gaji;
        }
        System.out.println("Total gaji: " + totalGaji);
    }
}
