package Queue.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class DotaSenate {
    public String predictPartyVictory(String senate) {
        char[] sen = senate.toCharArray();
        Deque<Integer> R = new ArrayDeque<>();
        Deque<Integer> D = new ArrayDeque<>();

        for (int i = 0; i < sen.length; i++) {
            if (sen[i] == 'R') {
                R.addLast(i);
            } else {
                D.addLast(i);
            }
        }

        while (!R.isEmpty() && !D.isEmpty()) {
            int rTurn = R.removeFirst();
            int dTurn = D.removeFirst();

            if (rTurn < dTurn) {
                R.addLast(dTurn + sen.length);
            } else {
                D.addLast(rTurn + sen.length);
            }
        }
        return R.isEmpty() ? "Dire" : "Radiant";
    }
}
