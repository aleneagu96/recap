package fundamentals;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Switch to main branch again");
//        System.out.println("Add again without push");

        Animal animal = new Cat();   // method hiding
        animal.walk();
        System.out.println(animal.n);

        System.out.println(10*20 + "Javapoint"); //200Javapoint
        System.out.println("Javapoint" + 10 * 20); //Javapoint200
        System.out.println("Javapoint" + 10 + 20); //Javapoint1020

        String str1 = "Ana";
        String str2 = "Ana";
        String str3 = new String("Ana");
        String str4 = new String("Ana");


        System.out.println(str1==str2);   //true
        System.out.println(str1==str3);   //false
        System.out.println(str3.equals(str4));   //true

        ImmutableClass im = new ImmutableClass(3,"5");
        System.out.println(im.getX());

    }
}
