package Strategy;

public class TargetedStrategy implements IAttackStrategy{

    @Override
    public int[] attack() {
        System.out.println("ATTACK FOR TARGETED IS NOT IMPLEMENTED YET");
        return new int[]{-1, -1};
    }
}
