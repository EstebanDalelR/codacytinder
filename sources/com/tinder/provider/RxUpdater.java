package com.tinder.provider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/provider/RxUpdater;", "T", "", "update", "Lrx/Completable;", "data", "(Ljava/lang/Object;)Lrx/Completable;", "base_release"}, k = 1, mv = {1, 1, 10})
public interface RxUpdater<T> {
    @NotNull
    Completable update(T t);
}
