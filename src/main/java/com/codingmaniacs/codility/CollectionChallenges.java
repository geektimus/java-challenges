package com.codingmaniacs.codility;

public class CollectionChallenges {
    /**
     * Finds if the given array can be sorted moving only two values on a single swap
     *
     * @param data array to be checked.
     * @return true if the array can be sorted using one swap, false otherwise
     */
    public static boolean isOrderedBySingleSwap(int data[]) {
        if (data == null || data.length == 0 || data.length == 1)
            return true;

        int first = 0, second = 0;
        int min = 0;
        boolean sorted = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                first = i;
                second = first + 1;
                min = data[first];
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return true;
        }

        for (int i = second; i < data.length; i++) {
            if (min < data[i]) {
                second = i - 1;
                break;
            }
        }

        // Swap
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;

        // Last validation
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;

    }
}
