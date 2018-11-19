package io.reactivex;

import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;

@Experimental
public interface MaybeConverter<T, R> {
    @NonNull
    R apply(@NonNull C3958c<T> c3958c);
}
