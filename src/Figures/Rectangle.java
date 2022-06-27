package Figures;

public class Rectangle extends Parallelogram {

    public Rectangle(double a, double b) {
        super(a, b);
    }
    // Длины сторон прямоугольника

    @Override
    public double getArea() {
        return getA() * getB();
    }
}
