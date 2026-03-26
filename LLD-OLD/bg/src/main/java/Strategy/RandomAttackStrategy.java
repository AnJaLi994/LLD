package Strategy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomAttackStrategy implements IAttackStrategy{


    final private int firingRange;
    final private int minX;
    final private int maxX;
    final private Set<int[]> firedCoordinates = new HashSet<>();
    final private Random random = new Random();


    public RandomAttackStrategy(int firingRange, int minX, int maxS) {
        this.firingRange = firingRange;
        this.minX = minX;
        this.maxX = maxS;
    }

    @Override
    public int[] attack() {
        int x = random.nextInt(maxX-minX) + minX;
        int y = random.nextInt(firingRange);
        int[] coordinatePair = new int[]{x,y};
        while (firedCoordinates.contains(coordinatePair)) {
            x = random.nextInt(firingRange);
            y = random.nextInt(firingRange);
            coordinatePair = new int[]{x,y};
        }
        firedCoordinates.add(coordinatePair);
        return coordinatePair;
    }

}
