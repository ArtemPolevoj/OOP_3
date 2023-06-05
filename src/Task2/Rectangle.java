package Task2;

public class Rectangle implements IRectangle{
    private double width;
    private double height;
    IResult result;

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
        result = ((x, y) -> x * y);
        //return getHeight() * getWidth();
        return  result.getResult(getWidth(), getHeight());
    }
@Override
    public double calculatePerimeter() {
        result = ((x, y) -> 2 * (x + y));
        //return (2 * (getWidth() + getHeight()));
        return result.getResult(getWidth(), getHeight());
    }
}
