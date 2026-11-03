public class Manager extends Pegawai{
    private double tunjunganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjangaJabatan) {
        super(nama, nip, gajiPokok); //panggil constructor pegawai
        this.tunjunganJabatan = tunjunganJabatan;
        }
        public void  tampilkanRingkasan() {
            System.out.println("Manager: " + nama); //ERROR jika private

    }
}
