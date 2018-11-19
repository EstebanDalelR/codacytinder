package com.tinder.common.badge.view;

import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.common.badge.view.a */
public final /* synthetic */ class C8528a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30275a = new int[Attribution.values().length];

    static {
        f30275a[Attribution.NONE.ordinal()] = 1;
        f30275a[Attribution.BOOST.ordinal()] = 2;
        f30275a[Attribution.SUPER_LIKE.ordinal()] = 3;
        f30275a[Attribution.LIKES_YOU.ordinal()] = 4;
        f30275a[Attribution.TOP_PICKS.ordinal()] = 5;
    }
}
