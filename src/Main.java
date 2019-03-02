public class Main {
    public static void main(String[] args) {
        Cars my_car = new Cars("Porshe", "911", "black", 10, 20);
        my_car.setColour("white");
        System.out.println(my_car.getColour());
    }
}
