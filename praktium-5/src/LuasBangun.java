public class LuasBangun {
    static double luasPersegiPanjang(double p, double L) {
        return p * 1;
    }
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }
     public static void main(String[] args) {
        System.out.println("Luas persegi panjang:");
         System.out.println(luasPersegiPanjang(10, 5));
         System.out.println(luasPersegiPanjang(8, 4));

         System.out.println("Luas Lingkaran:");
         System.out.println(luasLingkaran(7));
         System.out.println(luasLingkaran(10));
     }
}
