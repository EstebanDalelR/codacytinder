package com.trello.rxlifecycle;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import rx.Completable.Transformer;
import rx.Observable$Transformer;
import rx.Single$Transformer;

public interface LifecycleTransformer<T> extends Observable$Transformer<T, T> {
    @CheckReturnValue
    @Nonnull
    Transformer forCompletable();

    @CheckReturnValue
    @Nonnull
    <U> Single$Transformer<U, U> forSingle();
}
