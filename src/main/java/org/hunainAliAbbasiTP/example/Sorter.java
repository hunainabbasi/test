package org.hunainAliAbbasiTP.example;

/**
 *  Created By Hunain Ali Abbasi on 6th July 2020
 *
 */
public class Sorter
{
    public static int[] sortOddAndEven(int[] arr) {

        int indexCheck = 0;
        // indexCheck to check number of odd numbers
        for (int num: arr) {
            if (num % 2 != 0)
                indexCheck++;
        }

        int oddIndex = -1;
        int evenIndex = indexCheck-1;
        int[] arrayResult = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // if arr[i] is even
                evenIndex++;
                arrayResult[evenIndex] = arr[i];
            } else { // if arr[i] is odd
                oddIndex++;
                arrayResult[oddIndex] = arr[i];
            }
        }

        return arrayResult;
    }
}
