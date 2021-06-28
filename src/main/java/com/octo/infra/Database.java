package com.octo.infra;

public class Database implements IDataStore {
    public Object get() {
        return new Object();
    }

    @Override
    public void remove(Object object) {
        throw new RuntimeException("Method not supported");
    }
}
