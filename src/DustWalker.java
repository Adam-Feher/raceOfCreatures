public class DustWalker extends Creature {
    public DustWalker(String name, int amountOfWater) {
        super(name, amountOfWater);
        this.maxAmountOfWater = 8;
    }

    @Override
    void handleTypeOfDay(char type) {
        switch (type) {
            case 'n':
                this.amountToChangeWater = -1;
                this.distanceToTravel = 3;
                break;
            case 'f':
                this.amountToChangeWater = 0;
                this.distanceToTravel = 1;
                break;
            case 'e':
                this.amountToChangeWater = 3;
                this.distanceToTravel = 0;
        }
    }
}
