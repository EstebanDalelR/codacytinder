package com.tinder.fastmatch.newcount;

import com.tinder.boost.model.BoostState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.newcount.c */
public final /* synthetic */ class C9382c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31470a = new int[BoostState.values().length];

    static {
        f31470a[BoostState.BOOSTING.ordinal()] = 1;
        f31470a[BoostState.ACTIVATED.ordinal()] = 2;
    }
}
