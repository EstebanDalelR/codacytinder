package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Products.Sku.ProductType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ae {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30746a = new int[ProductType.values().length];

    static {
        f30746a[ProductType.PLUS.ordinal()] = 1;
        f30746a[ProductType.BOOST.ordinal()] = 2;
        f30746a[ProductType.SUPERLIKE.ordinal()] = 3;
        f30746a[ProductType.GOLD.ordinal()] = 4;
        f30746a[ProductType.TOP_PICKS.ordinal()] = 5;
    }
}
