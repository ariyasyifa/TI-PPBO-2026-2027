public class Lingkaran extends BangunDatar {
    double radius;

    public Lingkaran(double radius) {
        super("Lingkaran");
        this.radius = radius;
    }
    @Override
    public double hitungLuas(){
        return Math.PI * radius * radius;
    }
}
