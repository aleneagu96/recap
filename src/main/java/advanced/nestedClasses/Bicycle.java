package advanced.nestedClasses;

public class Bicycle {
    private int maxSpeed = 40;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public class Wheel {

        public void damage() {
            maxSpeed *= 0.5;
        }
    }

    public static class Mechanic {

        public void repair(Bicycle bicycle) {
            bicycle.maxSpeed += 15;
        }
    }
}
