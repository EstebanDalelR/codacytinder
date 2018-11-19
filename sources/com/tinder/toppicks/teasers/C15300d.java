package com.tinder.toppicks.teasers;

import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.teasers.d */
public final /* synthetic */ class C15300d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47471a = new int[TopPicksLoadingStatus.values().length];

    static {
        f47471a[TopPicksLoadingStatus.UNINITIALIZED.ordinal()] = 1;
        f47471a[TopPicksLoadingStatus.LOADING_FIRST_TIME.ordinal()] = 2;
        f47471a[TopPicksLoadingStatus.LOADING_PAGINATED.ordinal()] = 3;
        f47471a[TopPicksLoadingStatus.ERROR.ordinal()] = 4;
        f47471a[TopPicksLoadingStatus.ERROR_PAGINATED.ordinal()] = 5;
        f47471a[TopPicksLoadingStatus.SUCCESS.ordinal()] = 6;
    }
}
