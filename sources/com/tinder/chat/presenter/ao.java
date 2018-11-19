package com.tinder.chat.presenter;

import com.tinder.domain.match.model.Match.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ao {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30021a = new int[Attribution.values().length];

    static {
        f30021a[Attribution.BOOST.ordinal()] = 1;
        f30021a[Attribution.I_SUPER_LIKE_THEM.ordinal()] = 2;
        f30021a[Attribution.THEY_SUPER_LIKE_ME.ordinal()] = 3;
        f30021a[Attribution.NONE.ordinal()] = 4;
        f30021a[Attribution.FAST_MATCH.ordinal()] = 5;
        f30021a[Attribution.SPONSORED_AD.ordinal()] = 6;
        f30021a[Attribution.TOP_PICKS.ordinal()] = 7;
        f30021a[Attribution.PLACES.ordinal()] = 8;
    }
}
