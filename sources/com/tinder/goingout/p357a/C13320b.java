package com.tinder.goingout.p357a;

import rx.functions.Func1;

/* renamed from: com.tinder.goingout.a.b */
final /* synthetic */ class C13320b implements Func1 {
    /* renamed from: a */
    private final long f42268a;

    C13320b(long j) {
        this.f42268a = j;
    }

    public Object call(Object obj) {
        return Long.valueOf((this.f42268a + ((Long) obj).longValue()) + 1);
    }
}
