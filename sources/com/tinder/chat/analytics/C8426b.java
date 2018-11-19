package com.tinder.chat.analytics;

import com.tinder.domain.match.model.Match.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.b */
public final /* synthetic */ class C8426b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f29915a = new int[Attribution.values().length];

    static {
        f29915a[Attribution.NONE.ordinal()] = 1;
        f29915a[Attribution.SPONSORED_AD.ordinal()] = 2;
        f29915a[Attribution.I_SUPER_LIKE_THEM.ordinal()] = 3;
        f29915a[Attribution.THEY_SUPER_LIKE_ME.ordinal()] = 4;
        f29915a[Attribution.BOOST.ordinal()] = 5;
        f29915a[Attribution.FAST_MATCH.ordinal()] = 6;
        f29915a[Attribution.TOP_PICKS.ordinal()] = 7;
        f29915a[Attribution.PLACES.ordinal()] = 8;
    }
}
