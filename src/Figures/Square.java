package Figures;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }


    @Override
    public double getArea() {
        return getA() * getA();
    }
}
