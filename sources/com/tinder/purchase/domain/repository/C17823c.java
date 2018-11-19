package com.tinder.purchase.domain.repository;

import com.tinder.domain.profile.model.ProductType;
import java.util.Map;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.domain.repository.c */
final /* synthetic */ class C17823c implements Func1 {
    /* renamed from: a */
    private final ProductType f55636a;

    C17823c(ProductType productType) {
        this.f55636a = productType;
    }

    public Object call(Object obj) {
        return Boolean.valueOf(((Map) obj).containsKey(this.f55636a));
    }
}
