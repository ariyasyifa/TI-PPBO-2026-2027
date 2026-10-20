public class LatihanClass {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa(); // constructor defaul
        Mahasiswa m2 = new Mahasiswa ("syifa", "2025573010119", 3.39); // berpqrameter

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}
