package Stack;

public class RemoveStars {
    public String removeStars(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (c == '*') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
