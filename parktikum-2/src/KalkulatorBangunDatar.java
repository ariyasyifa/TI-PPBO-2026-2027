//import scanner untuk menerima input
import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //minta input panjang dan lebar persegi panjng
        System.out.print("Masukan panjang persegi panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        //menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas  :" + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);

        //menghitung apakah luas lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        //meminta input jari jari lingkaran
        System.out.print("\nMasukan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        //menghitung luas dan keliling lingkaran menggunakan math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas   :" + luasLingkaran);
        System.out.println("keliling:" + kelilingLingkaran);

        sc.close();
    }
}
