package baitap.lopcirclevalopcylinder;

public class Cylinder extends Circle {
    private double chieuCao;

    public Cylinder(double banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double tinhTheTich() {
        return super.getBanKinh() * super.getBanKinh() * this.chieuCao * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                " dienTich = " + tinhTheTich() + "} " + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,"red",10);
        System.out.println(cylinder.toString());

    }
}
