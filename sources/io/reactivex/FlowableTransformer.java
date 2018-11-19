package io.reactivex;

import io.reactivex.annotations.NonNull;
import org.reactivestreams.Publisher;

public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    Publisher<Downstream> apply(@NonNull C3957b<Upstream> c3957b);
}
