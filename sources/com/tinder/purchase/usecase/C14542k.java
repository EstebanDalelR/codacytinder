package com.tinder.purchase.usecase;

import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.k */
public final /* synthetic */ class C14542k {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45954a = new int[ProductType.values().length];

    static {
        f45954a[ProductType.GOLD.ordinal()] = 1;
        f45954a[ProductType.PLUS.ordinal()] = 2;
        f45954a[ProductType.BOOST.ordinal()] = 3;
        f45954a[ProductType.SUPERLIKE.ordinal()] = 4;
    }
}
