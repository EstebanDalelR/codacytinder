package com.tinder.paywall.views;

import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.views.d */
public final /* synthetic */ class C10106d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f33067a = new int[ProductType.values().length];

    static {
        f33067a[ProductType.PLUS.ordinal()] = 1;
        f33067a[ProductType.BOOST.ordinal()] = 2;
        f33067a[ProductType.SUPERLIKE.ordinal()] = 3;
        f33067a[ProductType.TOP_PICKS.ordinal()] = 4;
        f33067a[ProductType.GOLD.ordinal()] = 5;
    }
}
