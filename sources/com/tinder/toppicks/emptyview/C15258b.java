package com.tinder.toppicks.emptyview;

import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.emptyview.b */
public final /* synthetic */ class C15258b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47373a = new int[TopPicksLoadingStatus.values().length];

    static {
        f47373a[TopPicksLoadingStatus.SUCCESS.ordinal()] = 1;
        f47373a[TopPicksLoadingStatus.UNINITIALIZED.ordinal()] = 2;
        f47373a[TopPicksLoadingStatus.LOADING_PAGINATED.ordinal()] = 3;
        f47373a[TopPicksLoadingStatus.LOADING_FIRST_TIME.ordinal()] = 4;
        f47373a[TopPicksLoadingStatus.ERROR_PAGINATED.ordinal()] = 5;
        f47373a[TopPicksLoadingStatus.ERROR.ordinal()] = 6;
    }
}
