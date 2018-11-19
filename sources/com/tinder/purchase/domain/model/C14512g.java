package com.tinder.purchase.domain.model;

import com.tinder.domain.profile.model.PurchaseType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.model.g */
public final /* synthetic */ class C14512g {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45892a = new int[PurchaseType.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f45893b = new int[PurchaseType.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f45894c = new int[PurchaseType.values().length];

    static {
        f45892a[PurchaseType.CONSUMABLE.ordinal()] = 1;
        f45892a[PurchaseType.SUBSCRIPTION.ordinal()] = 2;
        f45893b[PurchaseType.SUBSCRIPTION.ordinal()] = 1;
        f45894c[PurchaseType.CONSUMABLE.ordinal()] = 1;
    }
}
