package com.tinder.overflow.analytics;

import com.tinder.domain.match.model.Match.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.analytics.d */
public final /* synthetic */ class C10026d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32910a = new int[Attribution.values().length];

    static {
        f32910a[Attribution.NONE.ordinal()] = 1;
        f32910a[Attribution.I_SUPER_LIKE_THEM.ordinal()] = 2;
        f32910a[Attribution.THEY_SUPER_LIKE_ME.ordinal()] = 3;
        f32910a[Attribution.BOOST.ordinal()] = 4;
        f32910a[Attribution.FAST_MATCH.ordinal()] = 5;
        f32910a[Attribution.PLACES.ordinal()] = 6;
        f32910a[Attribution.TOP_PICKS.ordinal()] = 7;
    }
}
