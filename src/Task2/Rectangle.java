package Task2;

public class Rectangle implements IRectangle{
    private double width;
    private double height;

    public Rectangle() {
        this(MIN_WIDTH, MIN_HEIGHT);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, MIN_WIDTH);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, MIN_HEIGHT);
    }
@Override
    public double calculateArea() {
        return getHeight() * getWidth();
    }
@Override
    public double calculatePerimeter() {
        return (2 * (getWidth() + getHeight()));
    }
}
