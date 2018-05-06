public class Walker extends Creature {
    public Walker(String name, int amountOfWater) {
        super(name, amountOfWater);
        this.maxAmountOfWater = 12;
    }

    @Override
    void handleTypeOfDay(char type) {
        switch (type) {
            case 'n':
                this.amountToChangeWater = -2;
                this.distanceToTravel = 1;
                break;
            case 'f':
                this.amountToChangeWater = -1;
                this.distanceToTravel = 2;
                break;
            case 'e':
                this.amountToChangeWater = 3;
                this.distanceToTravel = 1;
        }
    }
}
