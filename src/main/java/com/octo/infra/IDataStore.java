package com.octo.infra;

public interface IDataStore {
    Object get();
    void remove(Object object);
}
