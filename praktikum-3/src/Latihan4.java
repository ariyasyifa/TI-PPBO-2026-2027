import java.util.Scanner;

public class Latihan4 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Masukan umur: ");
            int umur = input.nextInt();

            System.out.print("Apakah mahasiswa? (true/false): ");
            boolean mahasiswa = input.nextBoolean();

            if (mahasiswa && umur < 25) {
                System.out.println("Harga tiket: Rp25.000");
            } else {
                System.out.println("Harga tiket: Rp40.000");
            }
        }
    }

