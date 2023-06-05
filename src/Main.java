import Task1.Cat;
import Task1.IGoes;
import Task1.Owner;
import Task2.IResult;
import Task2.Rectangle;
import Task3.Book;
import Task3.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Task 1.");
//        Owner owner = new Owner("Артем");
//        Cat cat = new Cat("Васька", 2, owner);
//        cat.greet();
//        cat.goes();
//        owner.goes();
//        ArrayList<IGoes> goes = new ArrayList<>();
//        goes.add(owner);
//        goes.add(cat);
//
//
        System.out.println("\nTask 2.");
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle rectangle1 = new Rectangle();
        System.out.printf("Rectangle are - %.2f, perimeter - %.2f.\n",
                rectangle.calculateArea(), rectangle.calculatePerimeter());
        System.out.printf("Rectangle1 are - %.2f, perimeter - %.2f.\n",
                rectangle1.calculateArea(), rectangle1.calculatePerimeter());
        rectangle1.setWidth(15);
        rectangle1.setHeight(20);
        System.out.printf("Rectangle1 are - %.2f, perimeter - %.2f.\n",
                rectangle1.calculateArea(), rectangle1.calculatePerimeter());
//
//        System.out.println("\nTask 3.");
//        Book  Don = new Book("Дон", "Пушкин", false);
//        Book  Undertaker = new Book("Гробовщик", "Пушкин", false);
//        Book  Babysitter = new Book("Няне", "Пушкин", false);
//        Book  Dubrovsky = new Book("Дубровский", "Пушкин", true);
//        Book  Angel = new Book("Ангел", "Лермонтов", true);
//        Book  Fugitive = new Book("Беглец", "Лермонтов", false);
//        Book  Borodino = new Book("Бородино", "Лермонтов", true);
//        Book  War = new Book("Война", "Лермонтов", false);
//        Book  Storm = new Book("Гроза", "Лермонтов", true);
//
//        Library library = new Library();
//        library.addBook(Don);
//        library.addBook(Undertaker);
//        library.addBook(Babysitter);
//        library.addBook(Dubrovsky);
//        library.addBook(Angel);
//        library.addBook(Fugitive);
//        library.addBook(Borodino);
//        library.addBook(War);
//        library.addBook(Storm);
//        Don.setAvailable(true);
//        System.out.println("Вывод по доступности");
//        library.displayAvailableBooks();
//        library.removeBook(Don);
//        System.out.println("Вывод по автору");
//        library.searchByAuthor("Пушкин");



    }
}