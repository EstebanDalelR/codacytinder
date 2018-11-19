package com.tinder.reactions.view;

import com.tinder.reactions.gestures.common.ReactionEvent.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.view.a */
public final /* synthetic */ class C14693a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46296a = new int[State.values().length];

    static {
        f46296a[State.REACTION_STARTED.ordinal()] = 1;
        f46296a[State.REACTION_COMPLETED.ordinal()] = 2;
    }
}
