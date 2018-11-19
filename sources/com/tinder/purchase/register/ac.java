package com.tinder.purchase.register;

import com.tinder.api.model.purchase.PurchaseLog.Source;
import rx.functions.Action1;

final /* synthetic */ class ac implements Action1 {
    /* renamed from: a */
    private final RegisterImpl f58072a;
    /* renamed from: b */
    private final Source f58073b;
    /* renamed from: c */
    private final String f58074c;
    /* renamed from: d */
    private final String f58075d;

    ac(RegisterImpl registerImpl, Source source, String str, String str2) {
        this.f58072a = registerImpl;
        this.f58073b = source;
        this.f58074c = str;
        this.f58075d = str2;
    }

    public void call(Object obj) {
        this.f58072a.m61360a(this.f58073b, this.f58074c, this.f58075d, (Throwable) obj);
    }
}
