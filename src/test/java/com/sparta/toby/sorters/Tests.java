package com.sparta.toby.sorters;

import com.sparta.toby.interfaces.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tests {

    Sorter bubble = new BubbleSort();
    Sorter tree = new BubbleSort();
    Sorter merge = new BubbleSort();

    @Test
    void bubbleTest1(){
        int [] beforeSort = {8,6,7,4,5,2,3,1};
        int [] afterSort = {1,2,3,4,5,6,7,8};
        Assertions.assertArrayEquals(afterSort, this.bubble.sortArray(beforeSort));
    }

    @Test
    void bubbleTest2Empty(){
        int [] beforeSort = {};
        int [] afterSort = {};
        Assertions.assertArrayEquals(afterSort, this.bubble.sortArray(beforeSort));
    }

    @Test
    void bubbleTest2Dup(){
        int [] beforeSort = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        int [] afterSort = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        Assertions.assertArrayEquals(afterSort, this.bubble.sortArray(beforeSort));
    }

    @Test
    void mergeTest1(){
        int [] beforeSort = {8,6,7,4,5,2,3,1};
        int [] afterSort = {1,2,3,4,5,6,7,8};
        Assertions.assertArrayEquals(afterSort, this.merge.sortArray(beforeSort));
    }

    @Test
    void mergeTest2Empty(){
        int [] beforeSort = {};
        int [] afterSort = {};
        Assertions.assertArrayEquals(afterSort, this.merge.sortArray(beforeSort));
    }

    @Test
    void mergeTest2Dup(){
        int [] beforeSort = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        int [] afterSort = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        Assertions.assertArrayEquals(afterSort, this.merge.sortArray(beforeSort));
    }
}