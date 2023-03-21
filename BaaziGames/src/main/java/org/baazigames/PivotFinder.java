package org.baazigames;

public class PivotFinder {
    int balancedSum(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int[] sumOnLeft = new int[nums.length];
        int[] sumOnRight = new int[nums.length];
        sumOnLeft[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            sumOnLeft[i] = sumOnLeft[i - 1] + nums[i - 1];
        }
        sumOnRight[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            sumOnRight[i] = sumOnRight[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (sumOnRight[i] == sumOnLeft[i]) {
                return i;
            }
        }
        return -1;
    }
}
