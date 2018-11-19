package com.tinder.purchase.billing;

import com.tinder.domain.profile.model.PurchaseType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.billing.c */
public final /* synthetic */ class C14487c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45874a = new int[PurchaseType.values().length];

    static {
        f45874a[PurchaseType.CONSUMABLE.ordinal()] = 1;
        f45874a[PurchaseType.SUBSCRIPTION.ordinal()] = 2;
    }
}
