package com.example.demo.service.abst;

public interface Writeable<T,K> {

    T add(T t);
    T modify(T t, K id);
    void remove(K id);

}
