package com.tinder.feed.analytics.p247a;

import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.j */
public final /* synthetic */ class C9429j {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31596a = new int[Attribution.values().length];

    static {
        f31596a[Attribution.NONE.ordinal()] = 1;
        f31596a[Attribution.SUPER_LIKE.ordinal()] = 2;
        f31596a[Attribution.BOOST.ordinal()] = 3;
        f31596a[Attribution.LIKES_YOU.ordinal()] = 4;
        f31596a[Attribution.TOP_PICKS.ordinal()] = 5;
    }
}
