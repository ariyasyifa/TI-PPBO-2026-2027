import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Masukan bilangan kedua: ");
        int b = input.nextInt();

        System.out.print("Masukan bilangan ketiga: ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Bilangan terbesar: " + a);
        }else if (b >= a && b >= c) {
            System.out.println("Bilangan terbesar: " + b);
        }else {
            System.out.println("Bilangan terbesar: " + c);
        }
    }
}
