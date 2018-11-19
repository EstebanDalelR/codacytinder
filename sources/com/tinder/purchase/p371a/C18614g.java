package com.tinder.purchase.p371a;

import com.tinder.utils.RxUtils;
import rx.Observable;
import rx.Observable$Transformer;

/* renamed from: com.tinder.purchase.a.g */
final /* synthetic */ class C18614g implements Observable$Transformer {
    /* renamed from: a */
    static final Observable$Transformer f58044a = new C18614g();

    private C18614g() {
    }

    public Object call(Object obj) {
        return ((Observable) obj).a(RxUtils.a(5, 3000));
    }
}
