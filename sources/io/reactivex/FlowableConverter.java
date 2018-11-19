package io.reactivex;

import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;

@Experimental
public interface FlowableConverter<T, R> {
    @NonNull
    R apply(@NonNull C3957b<T> c3957b);
}
