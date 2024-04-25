package BitManipulaton;

public class MinimumFlipsToMake {
    public int minFlips(int a, int b, int c) {
        // int ans = 0, ab = a | b, equal = ab ^ c;
        // for (int i = 0; i < 31; ++i){
        // int mask = 1 << i;
        // if (( equal & mask) > 0)
        // ans += (a & mask) == (b & mask) && (c & mask) == 0 ? 2 : 1;
        // }
        // return ans;

        int ans = 0;
        while (a != 0 || b != 0 || c != 0) {
            int x1 = a & 1;
            int x2 = b & 1;
            int x3 = c & 1;
            if ((x1 | x2) != x3) {
                if ((x1 & x2) == 1)
                    ans += 2;
                else
                    ans += 1;
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return ans;

    }
}
