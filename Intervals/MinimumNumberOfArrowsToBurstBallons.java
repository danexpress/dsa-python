package Intervals;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBallons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        long arrow_shot = -2147483649L;
        int arrow_count = 0;
        for (int i = 0; i < points.length; i++) {
            if (arrow_shot >= points[i][0] && arrow_shot <= points[i][1]) {
                continue;
            }
            arrow_shot = points[i][1];
            arrow_count++;
        }
        return arrow_count;

    }
}
