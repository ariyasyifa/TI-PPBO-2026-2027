public class LatihanClass {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa(); // membuat objek

        m1.nama = "budi";
        m1.nim = "20255730";
        m1.ipk = 3.75;

        System.out.println("Nama: " + m1.nama);
        System.out.println("Nim: " + m1.nim);
        System.out.println("Ipk: " + m1.ipk);
    }
}
