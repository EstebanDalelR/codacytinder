package com.tinder.boost.presenter;

import com.tinder.boost.model.BoostState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.boost.presenter.b */
public final /* synthetic */ class C8347b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f29651a = new int[BoostState.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f29652b = new int[BoostState.values().length];

    static {
        f29651a[BoostState.BOOSTING.ordinal()] = 1;
        f29652b[BoostState.ACTIVATED.ordinal()] = 1;
        f29652b[BoostState.OUT_OF_BOOST.ordinal()] = 2;
        f29652b[BoostState.COMPLETED.ordinal()] = 3;
        f29652b[BoostState.INACTIVE.ordinal()] = 4;
        f29652b[BoostState.BOOSTING.ordinal()] = 5;
        f29652b[BoostState.NETWORK_ERROR.ordinal()] = 6;
    }
}
