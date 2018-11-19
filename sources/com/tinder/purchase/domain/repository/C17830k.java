package com.tinder.purchase.domain.repository;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.model.C14510e;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.domain.repository.k */
final /* synthetic */ class C17830k implements Func1 {
    /* renamed from: a */
    private final ProductType f55643a;

    C17830k(ProductType productType) {
        this.f55643a = productType;
    }

    public Object call(Object obj) {
        return C16229a.m61271a(this.f55643a, (C14510e) obj);
    }
}
