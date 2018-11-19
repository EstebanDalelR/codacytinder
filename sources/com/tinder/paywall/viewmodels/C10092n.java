package com.tinder.paywall.viewmodels;

import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.n */
public final /* synthetic */ class C10092n {
    /* renamed from: a */
    public static final /* synthetic */ int[] f33010a = new int[ProductType.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f33011b = new int[ProductType.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f33012c = new int[ProductType.values().length];
    /* renamed from: d */
    public static final /* synthetic */ int[] f33013d = new int[ProductType.values().length];

    static {
        f33010a[ProductType.PLUS.ordinal()] = 1;
        f33010a[ProductType.GOLD.ordinal()] = 2;
        f33010a[ProductType.BOOST.ordinal()] = 3;
        f33010a[ProductType.TOP_PICKS.ordinal()] = 4;
        f33010a[ProductType.SUPERLIKE.ordinal()] = 5;
        f33011b[ProductType.PLUS.ordinal()] = 1;
        f33011b[ProductType.BOOST.ordinal()] = 2;
        f33011b[ProductType.SUPERLIKE.ordinal()] = 3;
        f33011b[ProductType.GOLD.ordinal()] = 4;
        f33011b[ProductType.TOP_PICKS.ordinal()] = 5;
        f33012c[ProductType.SUPERLIKE.ordinal()] = 1;
        f33012c[ProductType.PLUS.ordinal()] = 2;
        f33012c[ProductType.BOOST.ordinal()] = 3;
        f33012c[ProductType.TOP_PICKS.ordinal()] = 4;
        f33012c[ProductType.GOLD.ordinal()] = 5;
        f33013d[ProductType.PLUS.ordinal()] = 1;
        f33013d[ProductType.GOLD.ordinal()] = 2;
        f33013d[ProductType.BOOST.ordinal()] = 3;
        f33013d[ProductType.TOP_PICKS.ordinal()] = 4;
        f33013d[ProductType.SUPERLIKE.ordinal()] = 5;
    }
}
