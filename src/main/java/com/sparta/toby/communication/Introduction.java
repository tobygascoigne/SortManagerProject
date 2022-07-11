package com.sparta.toby.communication;

import com.sparta.toby.enums.SorterType;

import java.util.Scanner;

public class Introduction {

    private final Scanner scanner = new Scanner(System.in);

    public void setup() {
        this.welcome();
    }

    private void welcome() {
        System.out.println("Welcome");
        // talk
        this.chooseSorter();
    }

    private void chooseSorter(){
        System.out.println("Please choose your sorter. (Sorter Name) \n 1. Tree \n 2. Merge \n 3. Bubble");
        SorterType sorterType = SorterType.valueOf(scanner.nextLine().toUpperCase());
        switch (sorterType) {
            case TREE:
                System.out.println("TREE");
                break;
            case MERGE:
                System.out.println("MERGE");
                break;
            case BUBBLE:
                System.out.println("Bubble");
                break;
        }
        System.out.println("finished");
    }
}
