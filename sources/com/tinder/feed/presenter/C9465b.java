package com.tinder.feed.presenter;

import com.tinder.domain.feed.ActivityFeedComment.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.presenter.b */
public final /* synthetic */ class C9465b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31734a = new int[State.values().length];

    static {
        f31734a[State.SENT.ordinal()] = 1;
        f31734a[State.PENDING.ordinal()] = 2;
        f31734a[State.FAILED.ordinal()] = 3;
    }
}
