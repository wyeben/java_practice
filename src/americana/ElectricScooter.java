package americana;

public class ElectricScooter implements Vehicle{
    private int currentPeed;

    public ElectricScooter() {
    }

    @Override
    public void move(int amount) {
        this.currentPeed += amount;
    }

    @Override
    public void applyBreak(int amount) {
        this.currentPeed -= amount;
    }

    @Override
    public int getCurrentPeed(int amount) {
        return currentPeed;
    }

    public ElectricScooter(int currentPeed) {
        this.currentPeed = currentPeed;
    }

    public int getCurrentPeed() {
        return currentPeed;
    }

    public void setCurrentPeed(int currentPeed) {
        this.currentPeed = currentPeed;
    }
}
