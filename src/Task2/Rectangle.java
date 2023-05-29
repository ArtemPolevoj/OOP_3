package Task2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public double calculateArea() {
        return getHeight() * getWidth();
    }

    public double calculatePerimeter() {
        return (2 * (getWidth() + getHeight()));
    }
}
