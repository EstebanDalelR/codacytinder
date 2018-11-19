package com.tinder.reactions.drawer.provider;

import com.tinder.reactions.drawer.provider.event.DrawerState.EventType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.provider.c */
public final /* synthetic */ class C14638c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46160a = new int[EventType.values().length];

    static {
        f46160a[EventType.OPENED.ordinal()] = 1;
        f46160a[EventType.CLOSED.ordinal()] = 2;
        f46160a[EventType.STATE_CHANGED.ordinal()] = 3;
    }
}
