package io.reactivex;

import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;

@Experimental
public interface ObservableConverter<T, R> {
    @NonNull
    R apply(@NonNull C3959e<T> c3959e);
}
