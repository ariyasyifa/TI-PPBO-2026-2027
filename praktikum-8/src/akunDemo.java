public class akunDemo {
        public static void main(String[] args) {

            AkunPremium akun = new AkunPremium("syifa", 500000, 200000);

            akun.tampilkanInfo();
            System.out.println("Bisa transaksi 600000: " + akun.cekLimit(600000));
            System.out.println("Bisa transaksi 800000: " + akun.cekLimit(800000));
        }
    }