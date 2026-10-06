public class OverloadingDemo {
    static double tambah(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(tambah(2.5, 3.5));
        //System.out.println(tambah(2, 3, 4));
    }
}
