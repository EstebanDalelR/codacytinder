package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ak {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30749a = new int[PurchaseType.values().length];

    static {
        f30749a[PurchaseType.SUBSCRIPTION.ordinal()] = 1;
        f30749a[PurchaseType.CONSUMABLE.ordinal()] = 2;
    }
}
