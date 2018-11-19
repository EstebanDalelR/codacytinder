package com.tinder.purchase.register;

import com.tinder.api.model.purchase.PurchaseLog.Source;
import rx.Observable;
import rx.Observable$Transformer;

/* renamed from: com.tinder.purchase.register.o */
final /* synthetic */ class C18637o implements Observable$Transformer {
    /* renamed from: a */
    private final RegisterImpl f58092a;
    /* renamed from: b */
    private final Source f58093b;
    /* renamed from: c */
    private final String f58094c;
    /* renamed from: d */
    private final String f58095d;

    C18637o(RegisterImpl registerImpl, Source source, String str, String str2) {
        this.f58092a = registerImpl;
        this.f58093b = source;
        this.f58094c = str;
        this.f58095d = str2;
    }

    public Object call(Object obj) {
        return this.f58092a.m61350a(this.f58093b, this.f58094c, this.f58095d, (Observable) obj);
    }
}
