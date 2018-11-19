package com.tinder.feed.view.model;

import com.tinder.domain.feed.ActivityFeedComment.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.b */
public final /* synthetic */ class C9538b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31909a = new int[State.values().length];

    static {
        f31909a[State.SENT.ordinal()] = 1;
        f31909a[State.PENDING.ordinal()] = 2;
        f31909a[State.FAILED.ordinal()] = 3;
    }
}
