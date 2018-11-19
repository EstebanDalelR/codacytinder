package com.tinder.model;

import android.support.annotation.NonNull;
import com.tinder.utils.ad;
import rx.Observer;
import rx.functions.Action1;

public abstract class DefaultObserver<T> implements Observer<T> {
    public void onCompleted() {
    }

    public static <T> DefaultObserver<T> create(@NonNull final Action1<? super T> action1) {
        return new DefaultObserver<T>() {
            public void onNext(T t) {
                action1.call(t);
            }
        };
    }

    public void onError(Throwable th) {
        ad.a(th);
    }
}
