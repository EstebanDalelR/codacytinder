package com.tinder.data;

import javax.annotation.Nullable;
import rx.Observable;

@Deprecated
public interface ObservingProvider<T> {
    @Nullable
    T get();

    Observable<T> observe();

    void update(T t);
}
