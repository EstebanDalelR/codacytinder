package com.tinder.purchase.register;

import com.tinder.api.model.purchase.PurchaseValidation.Receipt;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.n */
final /* synthetic */ class C17858n implements Func1 {
    /* renamed from: a */
    static final Func1 f55725a = new C17858n();

    private C17858n() {
    }

    public Object call(Object obj) {
        return ((Receipt) obj).productId();
    }
}
