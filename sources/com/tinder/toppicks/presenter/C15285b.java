package com.tinder.toppicks.presenter;

import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksScreenState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.b */
public final /* synthetic */ class C15285b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47423a = new int[TopPicksScreenState.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f47424b = new int[TopPicksLoadingStatus.values().length];

    static {
        f47423a[TopPicksScreenState.GOLD.ordinal()] = 1;
        f47424b[TopPicksLoadingStatus.SUCCESS.ordinal()] = 1;
        f47424b[TopPicksLoadingStatus.LOADING_PAGINATED.ordinal()] = 2;
        f47424b[TopPicksLoadingStatus.UNINITIALIZED.ordinal()] = 3;
        f47424b[TopPicksLoadingStatus.LOADING_FIRST_TIME.ordinal()] = 4;
        f47424b[TopPicksLoadingStatus.ERROR_PAGINATED.ordinal()] = 5;
        f47424b[TopPicksLoadingStatus.ERROR.ordinal()] = 6;
    }
}
