public class Siswa {
    private double nilai;

    public Siswa(double nilai) {
        this.nilai = 0;
        setNilai(nilai);
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai ditolak! Nilai harus berada pada rentang 0-100.");
        }
    }

    public String getNilaiHuruf() {
        if (nilai >= 85) return "A";
        if (nilai >= 75) return "B";
        if (nilai >= 60) return "C";
        if (nilai >= 50) return "D";
        return "E";
    }
}
