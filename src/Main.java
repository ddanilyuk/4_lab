import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cars[] arr = new Cars[6];
        arr[0] = new Cars("BMW ", "X5", "green", 2010, 50000);
        arr[1] = new Cars("AUDI", "A7", "black", 2018, 90000);
        arr[2] = new Cars("Tesla", "3 ", "black", 2017, 80000);
        arr[3] = new Cars("Merc", "GT-4", "grey ", 2010, 120000);
        arr[4] = new Cars("Porshe", "911", "yellow", 2019, 200000);
        arr[5] = new Cars("Porshe", "912", "yellow", 2017, 210000);


        System.out.println("-------------------до сортировки-----------------");
        for (Cars u : arr) {
            System.out.println(u);
        }
        System.out.print("\n");


        System.out.println("----------после первой сортировки по цене--------");
        //Arrays.sort(arr, Comparator.comparing(Cars::getMark).thenComparing(Cars::getYear));
        Arrays.sort(arr, Comparator.comparing(Cars::getCost));
        for (Cars u : arr) {
            System.out.println(u);
        }
        System.out.print("\n");


        System.out.println("----------после второй сортировки по году--------");
        //Arrays.sort(arr, new MyComparator_1());
        Arrays.sort(arr, Comparator.comparing(Cars::getYear).reversed());
        for (Cars u : arr) {
            System.out.println(u);
        }

    }
}
