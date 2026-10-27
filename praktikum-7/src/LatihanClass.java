public class LatihanClass {
    public static void main(String[] args){

        Mahasiswa m1 = new Mahasiswa ("syifa", "2025573010119", 3.39); // berpqrameter

        System.out.println("nama : "+ m1.getnama());// program tetap 'menerima
        System.out.println("ipk: " + m1.getipk());

        m1.setipk(3.8); // valid
        System.out.println("IPK sekarang: " + m1.getipk());

        m1.setipk(9.9); // tidak valid, akan ditolak
        System.out.println("IPK sekarang: " + m1.getipk());
    }
}
