package fundamentals;

public class Animal {
    String color;
    int n;
    Object obj;

    public Animal(String color) {
        this.color = color;
    }

    public Animal() {
        this("black");  //color will be black when using the constructor
    }

    public static void walk() {
        System.out.println("fundamentals.Animal walks");

    }




}
