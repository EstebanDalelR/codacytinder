package com.tinder.purchase.register;

import com.tinder.api.model.purchase.PurchaseLog.Source;
import rx.functions.Action1;

/* renamed from: com.tinder.purchase.register.f */
final /* synthetic */ class C18633f implements Action1 {
    /* renamed from: a */
    private final RegisterImpl f58082a;
    /* renamed from: b */
    private final Source f58083b;
    /* renamed from: c */
    private final String f58084c;
    /* renamed from: d */
    private final String f58085d;

    C18633f(RegisterImpl registerImpl, Source source, String str, String str2) {
        this.f58082a = registerImpl;
        this.f58083b = source;
        this.f58084c = str;
        this.f58085d = str2;
    }

    public void call(Object obj) {
        this.f58082a.m61371c(this.f58083b, this.f58084c, this.f58085d, (Throwable) obj);
    }
}
