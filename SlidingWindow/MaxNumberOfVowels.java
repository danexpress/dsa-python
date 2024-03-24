package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxNumberOfVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int l = 0;
        int cnt = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            cnt += vowels.contains(s.charAt(r)) ? 1 : 0;
            if (r - l + 1 > k) {
                cnt -= vowels.contains(s.charAt(l)) ? 1 : 0;
                l++;
            }
            res = Math.max(cnt, res);
        }
        return res;
    }
}
