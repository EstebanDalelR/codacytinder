package com.tinder.feed.view.action;

import com.tinder.domain.feed.ActivityFeedComment.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.action.b */
public final /* synthetic */ class C9483b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31801a = new int[State.values().length];

    static {
        f31801a[State.SENT.ordinal()] = 1;
        f31801a[State.PENDING.ordinal()] = 2;
        f31801a[State.FAILED.ordinal()] = 3;
    }
}
