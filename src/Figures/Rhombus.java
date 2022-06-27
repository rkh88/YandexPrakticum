package Figures;

public class Rhombus extends Parallelogram {
    public Rhombus(double a, double h) {
        super(a, h);
    }


    @Override
    public double getArea() {
        return getA() * getB();
    }
}
