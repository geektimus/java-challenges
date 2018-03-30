package com.codingmaniacs.codility;

import java.util.*;

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

    /**
     * Performs an element shift to the right step times.
     *
     * @param ns   Number array
     * @param step step of the shift right
     * @return number array shifted to the right step times.
     */
    public static int[] arrayShiftRight(int[] ns, int step) {
        int s = step;
        int nsLength = ns.length;
        if (nsLength == 0 || nsLength == 1 || s == nsLength)
            return ns;

        int[] res = new int[nsLength];

        s %= nsLength;

        int[] l = Arrays.copyOfRange(ns, 0, nsLength - s);
        int[] r = Arrays.copyOfRange(ns, nsLength - s, nsLength);

        System.arraycopy(r, 0, res, 0, r.length);
        System.arraycopy(l, 0, res, r.length, l.length);

        return res;
    }

    /**
     * Finds the earliest time when the frog can jump all the way from 0 to the target position
     *
     * @param target End position / The goal position of the small frog
     * @param leaves Array of the positions where the leaves fall indexed by second.
     * @return the earliest time when the frog can reach target given the leaves array
     */
    public static int findFrogJumpsOverLeaves(int target, int[] leaves) {
        Set<Integer> storage = new HashSet<>(target);
        int index = -1;
        for (int i = 0; i < leaves.length; i++) {
            if (leaves[i] <= target) {
                storage.add(leaves[i]);
                if (storage.size() == target) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
