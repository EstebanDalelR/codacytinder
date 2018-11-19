package com.tinder.feed.view.message;

import com.tinder.feed.view.model.FeedCommentViewModel.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.message.c */
public final /* synthetic */ class C9534c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31900a = new int[State.values().length];

    static {
        f31900a[State.PENDING.ordinal()] = 1;
        f31900a[State.SENT.ordinal()] = 2;
        f31900a[State.FAILED.ordinal()] = 3;
    }
}
