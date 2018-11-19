package com.tinder.analytics.fireworks;

import rx.functions.Action0;

class h$1 implements Action0 {
    /* renamed from: a */
    final /* synthetic */ C2630h f29148a;

    h$1(C2630h c2630h) {
        this.f29148a = c2630h;
    }

    public void call() {
        if (C2630h.a(this.f29148a) != null) {
            C2630h.a(this.f29148a).onSyncCompleted();
        }
    }
}
