public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // override the method here

    @Override
    public double area() {
        return width * height;
    }
}
