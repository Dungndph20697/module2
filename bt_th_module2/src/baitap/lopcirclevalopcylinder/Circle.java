package baitap.lopcirclevalopcylinder;

public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }


    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double getDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + this.banKinh +
                ", mauSac='" + this.mauSac + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2,"black");
        System.out.println(circle.toString());
    }
}
