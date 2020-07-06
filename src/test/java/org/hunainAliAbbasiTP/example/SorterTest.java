package org.hunainAliAbbasiTP.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SorterTest
{
    /**
     * Created By HUnain Ali Abbasi on 6th july 2020
     */
    @Test
    public void checkOddEvenOrder() {
        int[] input1 = new int[]{1, 2, 4, 3, 7, 16};
        int[] sorted1 = Sorter.sortOddAndEven(input1);
        Assert.assertArrayEquals(sorted1, new int[]{1, 3, 7, 2, 4, 16});


        int[] input2 = new int[]{};
        int[] sorted2 = Sorter.sortOddAndEven(input2);
        Assert.assertArrayEquals(sorted2, new int[]{});


        int[] input3 = new int[]{1 , 2, 4, 8 , 3, 7, 16};
        int[] sorted3 = Sorter.sortOddAndEven(input3);
        Assert.assertArrayEquals(sorted3, new int[]{1, 3, 7, 2, 4, 8 ,16});


        int[] input4 = new int[]{1, 2, 4, 3, 6, 16,100,260};
        int[] sorted4 = Sorter.sortOddAndEven(input4);
        Assert.assertArrayEquals(sorted4, new int[]{1, 3, 2, 4, 6, 16,100,260});


        int[] input5 = new int[]{2, 4, 6, 8, 1, 3, 5, 7,21,31};
        int[] sorted5 = Sorter.sortOddAndEven(input5);
        Assert.assertArrayEquals(sorted5, new int[]{1, 3, 5, 7,21,31, 2, 4, 6, 8});

    }
}
