package com.sparta.toby.sorters;

import com.sparta.toby.interfaces.Sorter;

public class BubbleSort implements Sorter {

    public int[] bubbleSort(int[] array) {
        int x = array.length;
        int temp = 0;
        for (int i=0; i < x; i++) {
            for(int j=1; j < (x-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return this.bubbleSort(arrayToSort);
        // return new int[0];
    }
}
