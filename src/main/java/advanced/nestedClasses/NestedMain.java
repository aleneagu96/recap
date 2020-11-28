package advanced.nestedClasses;

public class NestedMain {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();
        System.out.println(bicycle.getMaxSpeed());
        wheel.damage();
        System.out.println(bicycle.getMaxSpeed());

        AnotherWheel anotherWheel = new AnotherWheel();
        anotherWheel.damage(bicycle);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.repair(bicycle);
        System.out.println(bicycle.getMaxSpeed());
    }
}
