package com.larkintuckerllc.singleton;

import java.util.Date;

final class MyExample {

    private static MyExample instance = null;
    private long mDate;

    static MyExample getInstance() {
        if (instance == null) {
            instance = new MyExample();
        }
        return instance;
    }

    private MyExample() {
        mDate = new Date().getTime();
    }

    long getDate() {
        return mDate;
    }

}
