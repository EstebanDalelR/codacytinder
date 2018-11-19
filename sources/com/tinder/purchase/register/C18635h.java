package com.tinder.purchase.register;

import com.tinder.api.model.purchase.PurchaseLog.Source;
import rx.functions.Action1;

/* renamed from: com.tinder.purchase.register.h */
final /* synthetic */ class C18635h implements Action1 {
    /* renamed from: a */
    private final RegisterImpl f58087a;
    /* renamed from: b */
    private final Source f58088b;
    /* renamed from: c */
    private final String f58089c;
    /* renamed from: d */
    private final String f58090d;

    C18635h(RegisterImpl registerImpl, Source source, String str, String str2) {
        this.f58087a = registerImpl;
        this.f58088b = source;
        this.f58089c = str;
        this.f58090d = str2;
    }

    public void call(Object obj) {
        this.f58087a.m61366b(this.f58088b, this.f58089c, this.f58090d, (Throwable) obj);
    }
}
