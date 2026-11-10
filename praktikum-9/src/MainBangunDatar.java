public class MainBangunDatar {

    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(10),
                new Persegi(8)
        };

        double totalLuas = 0;
        double luasTerbesar = 0;
        String namaTerbesar = "";

        System.out.println("===== DAFTAR BANGUN DATAR =====");

        for (BangunDatar bangun : daftarBangun) {

            bangun.tampilkanInfo();

            double luas = bangun.hitungLuas();

            totalLuas += luas;

            if (luas > luasTerbesar) {
                luasTerbesar = luas;
                namaTerbesar = bangun.namaBangun;
            }
        }

        System.out.println("===== HASIL PERHITUNGAN =====");
        System.out.println("Total luas seluruh bangun: " + totalLuas);
        System.out.println("Bangun dengan luas terbesar: " + namaTerbesar);
        System.out.println("Luas terbesar: " + luasTerbesar);
    }
}