package com.sparta.toby.sorters;

import com.sparta.toby.interfaces.Sorter;

public class MergeSort implements Sorter {

    private int[] data;
    private int length;
    private int[] temp;

    public int[] mergeSort(int[] array) {
        this.data = array;
        this.length = array.length;
        this.temp = new int[length];
        this.mergeSort(0, length-1);
        return array;
    }

    private int[] mergeSort(int lower, int higher) {
        if (lower < higher) {
            int middle = lower + (higher - lower) / 2;
            this.mergeSort(lower, middle);
            this.mergeSort(middle + 1, higher);
            this.merge(lower, middle, higher);
        }
        return this.mergeSort(lower, higher);
    }

    private int[] merge(int lower, int middle, int higher) {
        for (int i=lower; i<=higher; i++) {
            this.temp[i] = this.data[i];
        }
        int i=lower;
        int j=middle+1;
        int k=lower;
        while(i <= middle && j<=higher) {
            if (this.temp[i] <= this.temp[j]) {
                this.data[k] = this.temp[i];
                i++;
            } else {
                this.data[k] = this.temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            this.data[k] = temp[i];
            k++;
            i++;
        }

        return this.merge(lower, middle, higher);
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return this.mergeSort(arrayToSort);
    }
}