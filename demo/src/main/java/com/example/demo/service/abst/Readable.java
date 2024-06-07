package com.example.demo.service.abst;

import java.util.*;

public interface Readable<T, K> {
    T getById(K id);
    List<T> getAll();
}
