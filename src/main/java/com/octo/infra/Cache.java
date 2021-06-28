package com.octo.infra;

public class Cache implements IDataStore {
    public Object get() {
        return new Object();
    }

    @Override
    public void remove(Object object) {
        System.out.println("removing object from database");
    }
}
