package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ah {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30747a = new int[ProductType.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f30748b = new int[PurchaseType.values().length];

    static {
        f30747a[ProductType.PLUS.ordinal()] = 1;
        f30747a[ProductType.BOOST.ordinal()] = 2;
        f30747a[ProductType.SUPERLIKE.ordinal()] = 3;
        f30747a[ProductType.GOLD.ordinal()] = 4;
        f30747a[ProductType.TOP_PICKS.ordinal()] = 5;
        f30748b[PurchaseType.CONSUMABLE.ordinal()] = 1;
        f30748b[PurchaseType.SUBSCRIPTION.ordinal()] = 2;
    }
}
