package com.codecool.nearby;

import java.util.Arrays;

public class NearbyElementsChecker {

    int[][] testArray = new int[][] {
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 },
            { 25, -3, 41, 325, 7, 424, 42}
    };


    public int[] getNearbyElements(int row, int col, int range) {
        if (row>=testArray.length){
            return null;
        } else {
            int[] selectedRow = testArray[row];
            if (col>selectedRow.length-1){
                int leftEnd = (col-range<0) ? 0:col-range;
                int[] nearby = Arrays.copyOfRange(selectedRow,leftEnd,selectedRow.length);
                System.out.println(Arrays.toString(nearby));
                return nearby;
            } else if (col<0){
                if (col+range>=0) {
                    int rightEnd = (col+range+1>selectedRow.length) ? selectedRow.length:col+range+1;
                    int[] nearby = Arrays.copyOfRange(selectedRow,0,rightEnd);
                    System.out.println(Arrays.toString(nearby));
                    return nearby;
                }
                return null;
            } else {
                int rightEnd = (col+range+1>selectedRow.length) ? selectedRow.length:col+range+1;
                int[] rightSide = Arrays.copyOfRange(selectedRow,col+1,rightEnd);
                int leftEnd = (col-range<0) ? 0:col-range;
                int[] leftSide = Arrays.copyOfRange(selectedRow,leftEnd,col);
                int length = leftSide.length + rightSide.length;
                int[] nearby = new int[length];
                int pos = 0;
                for (int element : leftSide) {
                    nearby[pos] = element;
                    pos++;
                }
                for (int element : rightSide) {
                    nearby[pos] = element;
                    pos++;
                }
                System.out.println(Arrays.toString(nearby));
                return nearby;
            }
        }
    }

    private void prettyPrint() {
        System.out.println("The elements of the array should be displayed here.");
    }

    public static void main(String[] args) {
        NearbyElementsChecker nearbyElementsChecker = new NearbyElementsChecker();

        nearbyElementsChecker.getNearbyElements(1, 4, 5);
        nearbyElementsChecker.prettyPrint();

        // Test
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(0, 2, 2), new int[]{2, 0, 1241, 12}) : "Case #1: expected [2, 0, 1241, 12]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 0, 1), new int[]{3}) : "Case #2: expected [3]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 3, 5), new int[]{1, 3, 5}) : "Case #3: expected [1, 3, 5]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 4, 5), new int[]{1, 3, 5, 7}) : "Case #4: expected [1, 3, 5, 7]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 9, 5), new int[0]) : "Case #5: expected []";
        assert nearbyElementsChecker.getNearbyElements(4, 7, 2) == null : "Case #6: Expected null";
    }

}
