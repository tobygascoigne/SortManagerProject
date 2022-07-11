package com.sparta.toby;

import com.sparta.toby.communication.Introduction;

public class SortManager {

    private static final Introduction introduction = new Introduction();

    public static void main(String[] args) {
        introduction.setup();
    }
}
