package com.tinder.reactions.p384b;

import com.tinder.chat.view.provider.ReactionChatItemClickedProvider.From;
import com.tinder.reactions.drawer.provider.DrawerEventProvider.EventType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.b.b */
public final /* synthetic */ class C14595b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46070a = new int[From.values().length];

    static {
        f46070a[From.RECEIVER.ordinal()] = 1;
        f46070a[From.SENDER.ordinal()] = 2;
        f46071b[EventType.OPENING_STARTED.ordinal()] = 1;
        f46071b[EventType.CLOSING_STARTED.ordinal()] = 2;
        f46071b[EventType.OPENED.ordinal()] = 3;
        f46071b[EventType.CLOSED.ordinal()] = 4;
    }
}
