package org.baazigames;

public class Main {
    public static void main(String[] args) {
        PivotFinder pivotFinder = new PivotFinder();
        int[] nums = new int[] {
            1, 2, 3, 4, 6
        };
        int pivot = pivotFinder.balancedSum(nums);
        System.out.println(pivot);
    }
}
