public abstract class Creature {
    private String name;
    private int amountOfWater;
    int maxAmountOfWater;
    boolean isAlive;
    private int distanceTravelled;
    int amountToChangeWater;
    int distanceToTravel;

    Creature(String name, int amountOfWater) {
        this.name = name;
        this.amountOfWater = amountOfWater;
        this.isAlive = true;
    }

    void checkWater() {
        if (amountOfWater <= 0) {
            this.isAlive = false;
        }
    }

    void move(int distance) {
        if (this.isAlive) {
            distanceTravelled += distance;
        }
    }

    void changeWater(int amount) {
        if (amountOfWater + amount > maxAmountOfWater) {
            amountOfWater += amount - ((amountOfWater + amount) % maxAmountOfWater);
        } else {
            amountOfWater += amount;
        }
    }

    abstract void handleTypeOfDay(char type);

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", distanceTravelled=" + distanceTravelled +
                '}';
    }
}
