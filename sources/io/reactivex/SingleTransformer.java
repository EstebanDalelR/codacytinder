package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface SingleTransformer<Upstream, Downstream> {
    @NonNull
    SingleSource<Downstream> apply(@NonNull C3960g<Upstream> c3960g);
}
