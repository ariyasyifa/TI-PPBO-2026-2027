public class KendaraanDemo {
    public static void main (String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4);
        Motor motor = new Motor("Yamaha", 120, "Matic");

        System.out.println("Merek mobil: " + mobil.merek);
        System.out.println("Kecepatan maksimal: " + mobil.kecepatanMaks);
        System.out.println("Jumlah pintu: " + mobil.jumlahPintu);

        System.out.println("Merek motor: " + motor.merek);
        System.out.println("Kecepatan maksimal: " + motor.kecepatanMaks);
        System.out.println("Jenis motor: " + motor.jenisMotor);
    }
}
