package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface ObservableTransformer<Upstream, Downstream> {
    @NonNull
    ObservableSource<Downstream> apply(@NonNull C3959e<Upstream> c3959e);
}
