public class Triangle extends Shape {
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // override the method here

    @Override
    public double area() {
        return (height * base) / 2;
    }
}