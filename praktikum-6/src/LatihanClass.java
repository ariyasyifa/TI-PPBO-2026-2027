public class LatihanClass {
    public static void main(String[] args){

        Mahasiswa m1 = new Mahasiswa(); // membuat objek
        m1.nama = "budi";
        m1.nim = "20255730";
        m1.ipk = 3.75;

        Mahasiswa m2 =  new Mahasiswa();
        m2.nama = "syifa";
        m2.nim = "2025573010119";
        m2.ipk = 3.39;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}
