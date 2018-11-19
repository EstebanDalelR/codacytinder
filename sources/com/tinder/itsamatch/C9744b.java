package com.tinder.itsamatch;

import com.tinder.domain.match.model.Match.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.itsamatch.b */
public final /* synthetic */ class C9744b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32370a = new int[Attribution.values().length];

    static {
        f32370a[Attribution.BOOST.ordinal()] = 1;
        f32370a[Attribution.I_SUPER_LIKE_THEM.ordinal()] = 2;
        f32370a[Attribution.THEY_SUPER_LIKE_ME.ordinal()] = 3;
        f32370a[Attribution.FAST_MATCH.ordinal()] = 4;
        f32370a[Attribution.SPONSORED_AD.ordinal()] = 5;
        f32370a[Attribution.PLACES.ordinal()] = 6;
        f32370a[Attribution.TOP_PICKS.ordinal()] = 7;
    }
}
