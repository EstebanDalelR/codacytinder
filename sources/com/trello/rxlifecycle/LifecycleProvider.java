package com.trello.rxlifecycle;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import rx.Observable;

public interface LifecycleProvider<E> {
    @CheckReturnValue
    @Nonnull
    <T> LifecycleTransformer<T> bindToLifecycle();

    @CheckReturnValue
    @Nonnull
    <T> LifecycleTransformer<T> bindUntilEvent(@Nonnull E e);

    @CheckReturnValue
    @Nonnull
    Observable<E> lifecycle();
}
