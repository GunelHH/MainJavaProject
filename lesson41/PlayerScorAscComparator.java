package lesson41;

import java.util.Comparator;

public class PlayerScorAscComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return Integer.compare(p1.getScore(),p2.getScore());
    }
}
