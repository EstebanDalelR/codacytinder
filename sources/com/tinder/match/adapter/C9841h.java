package com.tinder.match.adapter;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.tinder.match.adapter.h */
final /* synthetic */ class C9841h implements Callable {
    /* renamed from: a */
    private final C3941d f32611a;
    /* renamed from: b */
    private final List f32612b;

    C9841h(C3941d c3941d, List list) {
        this.f32611a = c3941d;
        this.f32612b = list;
    }

    public Object call() {
        return this.f32611a.b(this.f32612b);
    }
}
