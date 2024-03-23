package Array.java;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0;
        int cnt = 1;

        for (int j = 1; j <= chars.length; j++) {
            if (j < chars.length && chars[j] == chars[j - 1]) {
                cnt++;

            } else {
                chars[i++] = chars[j - 1];

                if (cnt > 1) {
                    for (char c : String.valueOf(cnt).toCharArray()) {
                        chars[i] = c;
                        i++;
                    }

                }
                cnt = 1;
            }
        }
        return i;
    }
}
