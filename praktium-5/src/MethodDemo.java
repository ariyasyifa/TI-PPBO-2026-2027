public class MethodDemo {
    //methon.void: tidak mengambil nilai apa pun
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + "(" + umur + " tahun) -" + kota);
    }

    public static void main(String[] args) {

        // panggil pada methode main:
        tampilkanBiodata("Budi", 20, "Bandung");
    }
}