import java.util.ArrayList;
import java.util.List;

public class Race {
    public static void main(String[] args) {
        Race race = new Race();
        List<Creature> creatures = new ArrayList<>();
        char[] days = {'n', 'f', 'f', 'e', 'e', 'e', 'n', 'n', 'f'};
        race.initCreatures(creatures);

        for (char day : days) {
            for (Creature creature : creatures) {
                if (creature.isAlive) {
                    creature.handleTypeOfDay(day);
                    creature.changeWater(creature.amountToChangeWater);
                    creature.checkWater();
                    creature.move(creature.distanceToTravel);
                }
            }
        }
        System.out.println(creatures);

    }

    private void initCreatures(List<Creature> creatures) {
        creatures.add(new DustWalker("Vandor", 4));
        creatures.add(new Walker("Seta", 7));
        creatures.add(new Sponge("Csuszo", 12));
        creatures.add(new Sponge("Siklo", 10));
    }

}
