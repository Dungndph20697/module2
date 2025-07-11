package baitap.loppoint2dvaloppooint3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setZYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = {super.getX(), super.getY(), this.z};
        return result;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}' + " " + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setZYZ(3, 4, 5);
        System.out.println(point3D.toString());
    }
}
