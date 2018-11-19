package com.tinder.feed.view.info;

import com.tinder.domain.feed.ActivityFeedItem.MatchType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.info.d */
public final /* synthetic */ class C9505d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31842a = new int[MatchType.values().length];

    static {
        f31842a[MatchType.NONE.ordinal()] = 1;
        f31842a[MatchType.TOP_PICK.ordinal()] = 2;
        f31842a[MatchType.BOOST.ordinal()] = 3;
        f31842a[MatchType.SUPER_LIKE.ordinal()] = 4;
        f31842a[MatchType.LIKES_YOU.ordinal()] = 5;
    }
}
