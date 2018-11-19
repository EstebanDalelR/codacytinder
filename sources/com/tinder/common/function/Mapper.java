package com.tinder.common.function;

public interface Mapper<T, R> {
    R map(T t);
}
