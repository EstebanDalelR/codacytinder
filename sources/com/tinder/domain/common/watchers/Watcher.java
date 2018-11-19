package com.tinder.domain.common.watchers;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.logger.Logger;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public abstract class Watcher<T> {
    @NonNull
    private final Logger logger;
    @Nullable
    private Subscription subscription;

    protected abstract void execute(@NonNull T t);

    protected Watcher(@NonNull Logger logger) {
        this.logger = logger;
    }

    public void startWatching(@NonNull Observable<T> observable) {
        observable = observable.a(Schedulers.io());
        Action1 watcher$$Lambda$0 = new Watcher$$Lambda$0(this);
        Logger logger = this.logger;
        logger.getClass();
        this.subscription = observable.a(watcher$$Lambda$0, Watcher$$Lambda$1.get$Lambda(logger));
    }

    public void stopWatching() {
        if (this.subscription != null && !this.subscription.isUnsubscribed()) {
            this.subscription.unsubscribe();
        }
    }
}
