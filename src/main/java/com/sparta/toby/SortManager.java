package com.sparta.toby;


import com.sparta.toby.enums.SorterType;
import com.sparta.toby.logging.Logging;
import com.sparta.toby.sorters.BubbleSort;
import com.sparta.toby.sorters.MergeSort;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class SortManager {

    static Logger logger = Logging.getLogger();
    static int tempInt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ans = false;
        while (!ans) {
            try {
                System.out.println("Please Choose a Sorter (Bubble, Merge Tree)");
                SorterType sorterType = SorterType.valueOf(scanner.nextLine().toUpperCase());
                switch (sorterType) {
                    case TREE:
                        System.out.println("to-do");
                        // to do
                        break;
                    case MERGE:
                        MergeSort mergeSort = new MergeSort();
                        Scanner mergeScanner = new Scanner(System.in);
                        tempInt = 10;
                        System.out.println("Please Enter an Array");
                        int[] tempArray = new int[10];
                        for (int i = 0; i < tempInt; i++) {
                            tempArray[i] = mergeScanner.nextInt();
                        }
                        System.out.println(Arrays.toString(mergeSort.sortArray(tempArray)));
                        ans = true;
                        break;
                    case BUBBLE:
                        BubbleSort bubbleSort = new BubbleSort();
                        Scanner bubbleScanner = new Scanner(System.in);
                        tempInt = 10;
                        System.out.println("Please Enter an Array");
                        int[] tempBubble = new int[10];
                        for (int i = 0; i < tempInt; i++) {
                            tempBubble[i] = bubbleScanner.nextInt();
                        }
                        System.out.println(Arrays.toString(bubbleSort.sortArray(tempBubble)));
                        ans = true;
                        break;
                }
            } catch (Exception exception) {
                // error
                logger.error("New Error");
            }
        }
    }
}
