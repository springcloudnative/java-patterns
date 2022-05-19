package com.eara.factory;

public interface AbstractFactory<T> {
    T create(String objectType);
}
