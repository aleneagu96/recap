package advanced.nestedClasses;

public class AnotherWheel {

    // not recommended
//    private Bicycle anotherBicycle;
//    public AnotherWheel(Bicycle bicycle) {
//        this.anotherBicycle = bicycle;
//    }

    //this way- using bicycle as a param, we need a dependency of the Bicycle class
    // not ok because we needed to create a setter- losing encapsulation- and that's why we use nested classes
    public void damage(Bicycle bicycle) {
        bicycle.setMaxSpeed((int) (bicycle.getMaxSpeed() * 0.5));

    }
}
