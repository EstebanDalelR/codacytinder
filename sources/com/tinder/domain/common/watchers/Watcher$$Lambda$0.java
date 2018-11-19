package com.tinder.domain.common.watchers;

import rx.functions.Action1;

final /* synthetic */ class Watcher$$Lambda$0 implements Action1 {
    private final Watcher arg$1;

    Watcher$$Lambda$0(Watcher watcher) {
        this.arg$1 = watcher;
    }

    public void call(Object obj) {
        this.arg$1.execute(obj);
    }
}
