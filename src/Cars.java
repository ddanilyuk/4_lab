@SuppressWarnings("WeakerAccess")

public class Cars{
    private String mark;
    private String model;
    private String colour;
    private Integer year;
    private int cost;

    Cars(String mark, String model, String colour, int year, int cost) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "{" +
                "mark='" + mark + '\'' + "\t\t" +
                ", model='" + model + '\'' + "\t\t" +
                ", colour='" + colour + '\'' + "\t\t" +
                ", year=" + year + "\t\t" +
                ", cost=" + cost +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
