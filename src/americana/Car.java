package americana;

public class Car implements Vehicle{
    private int currentSpeed;

    public Car() {
    }

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreak(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentPeed(int amount) {
        return currentSpeed;
    }
}
