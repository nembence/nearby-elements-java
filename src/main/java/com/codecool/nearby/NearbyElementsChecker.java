package com.codecool.nearby;

import java.util.Arrays;

/**
 * The task of the class is to find and return the nearby elements from a two-dimensional int array.
 * To keep it as an one class application, the entry point (main method) and test data is kept here also.
 */
public class NearbyElementsChecker {

    /**
     * Constructor. The array to work with is given here to the instance.
     *
     * @param elements the 2 dimensional int array to search through
     */
    public NearbyElementsChecker(int[][] elements) {

    }

    /**
     * Instance method for returning nearby elements.
     *
     * @param row row of the target element
     * @param col column of the target element
     * @param range maximum distance of nearby elements to give back
     * @return array holding the nearby elements within range, except for the target element, may be of zero length
     * @return null if row is out of bounds
     */
    public int[] getNearbyElements(int row, int col, int range) {
        return null;
    }

    /**
     * Instance method for pretty printing the elements
     */
    private void prettyPrint() {
        System.out.println("The elements of the array should be displayed here.");
    }

    // The main method with this declaration is the entry point of Java applications.
    public static void main(String[] args) {

        int[][] testArray = new int[][] {
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 },
            { 25, -3, 41, 325, 7, 424, 42}
        };

        // Create an instance of our class with the test data.
        NearbyElementsChecker nearbyElementsChecker = new NearbyElementsChecker(testArray);

        // Print the two-dimensional array
        nearbyElementsChecker.prettyPrint();

        // Test cases. Add others freely!
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(0, 2, 2), new int[]{2, 0, 1241, 12}) : "Case #1: expected [2, 0, 1241, 12]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 0, 1), new int[]{3}) : "Case #2: expected [3]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 3, 5), new int[]{1, 3, 5}) : "Case #3: expected [1, 3, 5]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 4, 5), new int[]{1, 3, 5, 7}) : "Case #4: expected [1, 3, 5, 7]";
        assert Arrays.equals(nearbyElementsChecker.getNearbyElements(1, 9, 5), new int[0]) : "Case #5: expected []";
        assert nearbyElementsChecker.getNearbyElements(4, 7, 2) == null : "Case #6: Expected null";
    }

}
