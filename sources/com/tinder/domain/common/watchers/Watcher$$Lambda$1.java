package com.tinder.domain.common.watchers;

import com.tinder.common.logger.Logger;
import rx.functions.Action1;

final /* synthetic */ class Watcher$$Lambda$1 implements Action1 {
    private final Logger arg$1;

    private Watcher$$Lambda$1(Logger logger) {
        this.arg$1 = logger;
    }

    static Action1 get$Lambda(Logger logger) {
        return new Watcher$$Lambda$1(logger);
    }

    public void call(Object obj) {
        this.arg$1.error((Throwable) obj);
    }
}
