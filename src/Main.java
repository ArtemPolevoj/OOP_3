import Task2.Rectangle;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Сортировка по убыванию площади
        Comparator<Rectangle> comRec = (r1, r2) -> {
            if (r1.calculateArea() > r2.calculateArea()) {
                return -1;
            } else if (r1.calculateArea() > r2.calculateArea()) {
                return 1;
            } else {
                return 0;
            }
        };
        List<Rectangle> list = new ArrayList<>();
        for (int i = 4, j = 7; i < 10; i++, j++) {
            list.add(new Rectangle(i, j));
        }
        list.sort(comRec);
        list.forEach(System.out::println);

    }
}