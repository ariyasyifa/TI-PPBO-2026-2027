public class ArrayPersegi {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = {
                new Persegi(3),
                new Persegi(5),
                new Persegi(8),
                new Persegi(6),
        };
        Persegi terbesar = daftarPersegi[0];
        for (int i = 1; i < daftarPersegi.length; i++){
            if (daftarPersegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = daftarPersegi[i];
            }
        }
        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
        System.out.println("Keliling: " + terbesar.hitungKeliling());
    }
}
