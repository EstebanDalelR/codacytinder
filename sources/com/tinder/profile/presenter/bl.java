package com.tinder.profile.presenter;

import io.reactivex.functions.Consumer;
import java.util.List;

final /* synthetic */ class bl implements Consumer {
    /* renamed from: a */
    private final bf f50180a;
    /* renamed from: b */
    private final List f50181b;

    bl(bf bfVar, List list) {
        this.f50180a = bfVar;
        this.f50181b = list;
    }

    public void accept(Object obj) {
        this.f50180a.m55033a(this.f50181b, (Throwable) obj);
    }
}
