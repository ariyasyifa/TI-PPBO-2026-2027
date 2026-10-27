public class Mahasiswa {
        private String nama;
        private String nim;
        private double ipk;

        //constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    public double getipk(){
        return ipk;
    }

    public Mahasiswa (String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK :" + ipk);
    }
    public boolean isCumloude(){
        return ipk >=3.5;
    }
    public void setipk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid, harus 0.0 - 4.0");
        }
    }
}