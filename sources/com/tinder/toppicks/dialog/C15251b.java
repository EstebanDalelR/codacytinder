package com.tinder.toppicks.dialog;

import com.tinder.toppicks.TopPicksPaywallViewModel.ViewType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.dialog.b */
public final /* synthetic */ class C15251b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47353a = new int[ViewType.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f47354b = new int[ViewType.values().length];

    static {
        f47353a[ViewType.PAYWALL_ITEMS.ordinal()] = 1;
        f47353a[ViewType.PICKS_NOT_AVAILABLE.ordinal()] = 2;
        f47354b[ViewType.PAYWALL_ITEMS.ordinal()] = 1;
        f47354b[ViewType.PICKS_NOT_AVAILABLE.ordinal()] = 2;
    }
}
