public class PerusahaanDemo {
    public static void main(String[] args) {

        // Membuat objek Manager
        Manager mgr = new Manager("Syifa", "M001", 8000000, 2000000);
        System.out.println("=== DATA MANAGER ===");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        // Membuat objek Staff
        Staff staf = new Staff("Quratan", "S001", 4000000, 500000);
        System.out.println("\n=== DATA STAFF ===");
        staf.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + staf.getTunjanganKinerja());

        // Membuat objek Direktur
        Direktur dir = new Direktur("Kenara", "D001", 15000000, 5000000);
        System.out.println("\n=== DATA DIREKTUR ===");
        dir.tampilkanData();
    }
}
