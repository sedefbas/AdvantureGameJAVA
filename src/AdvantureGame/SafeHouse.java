package AdvantureGame;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "güvenli ev");
    }
    @Override
    boolean onLocation() {
        System.out.println("güvenli evdensiniz");
        System.out.println("canınız yenilendi");
        return true;
    }
}
