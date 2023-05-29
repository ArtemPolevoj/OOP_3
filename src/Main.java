import Task1.Cat;
import Task1.Owner;
import Task2.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        Owner owner = new Owner("Артем");
        Cat cat = new Cat("Васька", 2, owner);
        cat.greet();
        System.out.println("\nTask 2.");
        Rectangle rectangle = new Rectangle(5,10);
        Rectangle rectangle1 = new Rectangle();
        System.out.printf("Rectangle are - %.2f, perimeter - %.2f.\n",
                rectangle.calculateArea(), rectangle.calculatePerimeter());
        System.out.printf("Rectangle1 are - %.2f, perimeter - %.2f.\n",
                rectangle1.calculateArea(), rectangle1.calculatePerimeter());
        rectangle1.setWidth(15);
        rectangle1.setHeight(20);
        System.out.printf("Rectangle1 are - %.2f, perimeter - %.2f.\n",
                rectangle1.calculateArea(), rectangle1.calculatePerimeter());
    }
}