package io.reactivex.parallel;

import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;

@Experimental
public interface ParallelFlowableConverter<T, R> {
    @NonNull
    R apply(@NonNull C15744a<T> c15744a);
}
