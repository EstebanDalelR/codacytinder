package com.tinder.match.views;

import com.tinder.domain.match.model.Match.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.views.f */
public final /* synthetic */ class C9894f {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32737a = new int[Attribution.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f32738b = new int[Attribution.values().length];

    static {
        f32737a[Attribution.BOOST.ordinal()] = 1;
        f32737a[Attribution.I_SUPER_LIKE_THEM.ordinal()] = 2;
        f32737a[Attribution.THEY_SUPER_LIKE_ME.ordinal()] = 3;
        f32737a[Attribution.FAST_MATCH.ordinal()] = 4;
        f32737a[Attribution.TOP_PICKS.ordinal()] = 5;
        f32737a[Attribution.SPONSORED_AD.ordinal()] = 6;
        f32737a[Attribution.PLACES.ordinal()] = 7;
        f32737a[Attribution.NONE.ordinal()] = 8;
        f32738b[Attribution.TOP_PICKS.ordinal()] = 1;
        f32738b[Attribution.FAST_MATCH.ordinal()] = 2;
    }
}
