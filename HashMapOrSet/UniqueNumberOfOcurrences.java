package HashMapOrSet;

public class UniqueNumberOfOcurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] counts = new int[2001]; // 1000 negative, 1000 positive
        for (int num : arr) {
            counts[num + 1000]++;
        }
        
        boolean[] occurrences = new boolean[1001];
        for (int count : counts) {
            if (count != 0) {
                if (occurrences[count]) {
                    return false; // Occurrence count is not unique
                }
                occurrences[count] = true;
            }
        }
        
        return true;
    }
}
