package baithuchanh.thlophinhchunhat;

public class Rectangle {
    double with, height;

    public Rectangle(){
    }

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public double getArea(){
        return this.with * this.height;
    }

    public double getPerimeter(){
        return (this.with + this.height) * 2;
    }

    public String display(){
        return "Rectangle{" + "width=" + with + ", height=" + height + "}";
    }
}
