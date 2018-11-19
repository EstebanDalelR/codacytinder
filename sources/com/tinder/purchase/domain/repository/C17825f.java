package com.tinder.purchase.domain.repository;

import com.tinder.domain.profile.model.ProductType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.domain.repository.f */
final /* synthetic */ class C17825f implements Func1 {
    /* renamed from: a */
    private final ProductType f55638a;

    C17825f(ProductType productType) {
        this.f55638a = productType;
    }

    public Object call(Object obj) {
        return new ArrayList((Collection) ((Map) obj).get(this.f55638a));
    }
}
