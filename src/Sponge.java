public class Sponge extends Creature {
    public Sponge(String name, int amountOfWater) {
        super(name, amountOfWater);
        this.maxAmountOfWater = 20;
    }

    @Override
    void handleTypeOfDay(char type) {
        switch (type) {
            case 'n':
                this.amountToChangeWater = -4;
                this.distanceToTravel = 0;
                break;
            case 'f':
                this.amountToChangeWater = -1;
                this.distanceToTravel = 1;
                break;
            case 'e':
                this.amountToChangeWater = 6;
                this.distanceToTravel = 3;
        }
    }
}
