import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Cars my_car = new Cars("Porshe", "911", "black", 2018, 400000);
        Cars[] arr = new Cars[6];
        arr[0] = new Cars("BMW ", "X5", "green", 2010, 50000);
        arr[1] = new Cars("AUDI", "A7", "black", 2018, 90000);
        arr[2] = new Cars("Tesla", "3 ", "black", 2017, 80000);
        arr[3] = new Cars("Merc", "GT-4", "grey ", 2010, 120000);
        arr[4] = new Cars("Porshe", "911", "yellow", 2019, 200000);
        arr[5] = new Cars("Porshe", "912", "yellow", 2017, 210000);


        System.out.println("-------------до сортировки------------");
        for (Cars u : arr) {
            System.out.println(u);
        }
        System.out.print("\n");

        /*
        List<Cars> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        list.add(arr[2]);
        list.add(arr[3]);
        list.add(arr[4]);
        list.add(arr[5]);


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
        */


        System.out.println("----------после первой сортировки--------");
        //Arrays.sort(arr, Comparator.comparing(Cars::getMark).thenComparing(Cars::getYear));
        Arrays.sort(arr, Comparator.comparing(Cars::getCost));
        for (Cars u : arr) {
            System.out.println(u);
        }
        System.out.print("\n");


        System.out.println("----------после второй сортировки--------");
        //Arrays.sort(arr, new MyComparator_1());
        Arrays.sort(arr, Comparator.comparing(Cars::getYear).reversed());
        for (Cars u : arr) {
            System.out.println(u);
        }

    }
}
