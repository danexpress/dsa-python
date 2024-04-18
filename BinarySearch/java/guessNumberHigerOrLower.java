package BinarySearch.java;

public class guessNumberHigerOrLower {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            int res = guess(mid);
            if (res == 0)
                return mid;
            if (res == 1)
                i = mid + 1;
            else
                j = mid - 1;
        }

        return -1;
    }
}
