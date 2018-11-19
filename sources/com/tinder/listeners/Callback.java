package com.tinder.listeners;

public interface Callback<T> {
    void onError(Throwable th);

    void onResult(T t);
}
