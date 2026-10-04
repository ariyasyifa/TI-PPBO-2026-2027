import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukan tinggi badan (meter): ");
        double tinggi = input.nextDouble();

        double bmi = berat / (tinggi * tinggi);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
