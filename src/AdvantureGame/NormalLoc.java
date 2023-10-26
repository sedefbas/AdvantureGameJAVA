package AdvantureGame;

public abstract class NormalLoc  extends Loaction{

    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
