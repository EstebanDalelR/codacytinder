package io.reactivex.parallel;

import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;

@Experimental
public interface ParallelTransformer<Upstream, Downstream> {
    @NonNull
    C15744a<Downstream> apply(@NonNull C15744a<Upstream> c15744a);
}
