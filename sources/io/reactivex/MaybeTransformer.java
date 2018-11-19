package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface MaybeTransformer<Upstream, Downstream> {
    @NonNull
    MaybeSource<Downstream> apply(@NonNull C3958c<Upstream> c3958c);
}
