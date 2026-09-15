public class Logikademo {
    public static void main(String[] args) {
       boolean punyaKTP = false;
       boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("boleh menyewa kendaraan");
        }
        if(!punyaKTP){
            System.out.println("KTP belum tersedia");
        }
    }
}
