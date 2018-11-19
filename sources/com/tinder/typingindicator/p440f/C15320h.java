package com.tinder.typingindicator.p440f;

import com.tinder.typingindicator.model.TypingIndicator.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.h */
public final /* synthetic */ class C15320h {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47530a = new int[State.values().length];

    static {
        f47530a[State.ACTIVE.ordinal()] = 1;
        f47530a[State.EXPIRED.ordinal()] = 2;
        f47530a[State.INTERRUPTED.ordinal()] = 3;
    }
}
