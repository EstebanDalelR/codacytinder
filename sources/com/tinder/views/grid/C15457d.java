package com.tinder.views.grid;

import com.tinder.enums.SwipeType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.views.grid.d */
public final /* synthetic */ class C15457d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47888a = new int[SwipeType.values().length];

    static {
        f47888a[SwipeType.LIKE_BUTTON.ordinal()] = 1;
        f47888a[SwipeType.PASS_BUTTON.ordinal()] = 2;
        f47888a[SwipeType.SUPER_LIKE_BUTTON.ordinal()] = 3;
    }
}
