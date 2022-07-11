package com.sparta.toby.enums;

import com.sparta.toby.sorters.BubbleSort;
import com.sparta.toby.sorters.MergeSort;
import com.sparta.toby.sorters.TreeSort;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SorterType {

    BUBBLE(new BubbleSort()),
    MERGE(new MergeSort()),
    TREE(new TreeSort());

    public final Object sorter;
}
