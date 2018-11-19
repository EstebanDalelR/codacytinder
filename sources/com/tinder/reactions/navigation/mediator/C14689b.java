package com.tinder.reactions.navigation.mediator;

import com.tinder.reactions.drawer.provider.DrawerEventProvider.EventType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.mediator.b */
public final /* synthetic */ class C14689b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46274a = new int[EventType.values().length];

    static {
        f46274a[EventType.CLOSED.ordinal()] = 1;
        f46274a[EventType.OPENING_STARTED.ordinal()] = 2;
    }
}
