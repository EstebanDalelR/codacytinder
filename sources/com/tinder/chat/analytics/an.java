package com.tinder.chat.analytics;

import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class an {
    /* renamed from: a */
    public static final /* synthetic */ int[] f29900a = new int[State.values().length];

    static {
        f29900a[State.ACTIVE.ordinal()] = 1;
        f29900a[State.INTERRUPTED.ordinal()] = 2;
        f29900a[State.EXPIRED.ordinal()] = 3;
    }
}
