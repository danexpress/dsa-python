package PrefixSum.java;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int a = 0;
        int res = 0;

        for (int n : gain) {
            a += n;
            res = Math.max(res, a);
        }
        return res;
    }
}
