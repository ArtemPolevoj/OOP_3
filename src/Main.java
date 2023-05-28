import Task1.Cat;
import Task1.Owner;

public class Main {
    public static void main(String[] args) {
        Owner owner =new Owner("Артем");
        Cat cat = new Cat("Васька", 2, owner);
        cat.greet();
    }
}