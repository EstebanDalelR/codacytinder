package com.tinder.analytics.fireworks;

import rx.functions.Action1;

class h$2 implements Action1<Throwable> {
    /* renamed from: a */
    final /* synthetic */ C2630h f29149a;

    h$2(C2630h c2630h) {
        this.f29149a = c2630h;
    }

    public /* synthetic */ void call(Object obj) {
        m34539a((Throwable) obj);
    }

    /* renamed from: a */
    public void m34539a(Throwable th) {
        if (C2630h.a(this.f29149a) != null) {
            C2630h.a(this.f29149a).onSyncError(th);
        }
    }
}
