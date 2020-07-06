package org.hunainAliAbbasiTP.example;

/**
 *  Created By Hunain Ali Abbasi on 6th July 2020
 *
 */
public class Sorter
{
    public static int[] sortOddAndEven(int[] arr) {

        int indexCheck = 0;
        for (int num: arr) {
            if (num % 2 != 0)
                indexCheck++;
        }

        int odd = -1;
        int even = indexCheck-1;
        int[] arrayResult = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // Even
                even++;
                arrayResult[even] = arr[i];
            } else { // odd
                odd++;
                arrayResult[odd] = arr[i];
            }
        }

        return arrayResult;
    }
}
