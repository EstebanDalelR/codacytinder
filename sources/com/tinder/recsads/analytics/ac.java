package com.tinder.recsads.analytics;

import com.tinder.recsads.model.RecsAdType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ac {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46309a = new int[RecsAdType.values().length];

    static {
        f46309a[RecsAdType.NATIVE_VIDEO_DFP.ordinal()] = 1;
        f46309a[RecsAdType.NATIVE_DISPLAY_DFP.ordinal()] = 2;
        f46309a[RecsAdType.BRANDED_PROFILE_CARD.ordinal()] = 3;
        f46309a[RecsAdType.FAN_VIDEO.ordinal()] = 4;
        f46309a[RecsAdType.FAN.ordinal()] = 5;
    }
}
