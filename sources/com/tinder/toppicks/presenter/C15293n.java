package com.tinder.toppicks.presenter;

import com.tinder.domain.toppicks.TopPicksScreenState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.n */
public final /* synthetic */ class C15293n {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47448a = new int[TopPicksScreenState.values().length];

    static {
        f47448a[TopPicksScreenState.GOLD.ordinal()] = 1;
        f47448a[TopPicksScreenState.NOT_LOADED_GOLD.ordinal()] = 2;
        f47448a[TopPicksScreenState.NOT_LOADED_NON_GOLD.ordinal()] = 3;
        f47448a[TopPicksScreenState.NON_GOLD.ordinal()] = 4;
        f47448a[TopPicksScreenState.GOLD_EXHAUSTED.ordinal()] = 5;
        f47448a[TopPicksScreenState.TOP_PICKS_NOT_AVAILABLE.ordinal()] = 6;
    }
}
