package BinarySearch.java;

public class GuessNumberHigerOrLower {
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

    private int guess(int mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guess'");
    }

    
}
