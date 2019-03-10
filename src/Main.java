import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cars my_car = new Cars("Porshe", "911", "black", 2018, 400000);
        Cars[] arr = new Cars[3];
        arr[0] = new Cars("BMW", "X5", "green", 2010, 50000);
        arr[1] = new Cars("AUDI", "A7", "white", 2018, 70000);
        arr[2] = new Cars("Tesla", "3", "black", 2017, 80000);

        System.out.println(my_car.getMark());

        for (Cars car:arr) {
            System.out.println(car.getModel());
        }


        List<Cars> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        list.add(arr[2]);
        System.out.println("----сортировка по году выпуска----");
        System.out.println("----------до сортировки-----------");

        for (Cars u : list) {
            System.out.println(u);
        }
        System.out.println("----------после сортировки--------");
        Collections.sort(list);
        for (Cars u : list) {
            System.out.println(u);
        }
    }
}
