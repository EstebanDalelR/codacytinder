package com.tinder.data.message;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ah {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30622a = new int[MessageType.values().length];

    static {
        f30622a[MessageType.TEXT.ordinal()] = 1;
        f30622a[MessageType.GIF.ordinal()] = 2;
        f30622a[MessageType.REACTION.ordinal()] = 3;
        f30622a[MessageType.SYSTEM.ordinal()] = 4;
        f30622a[MessageType.ACTIVITY.ordinal()] = 5;
        f30622a[MessageType.IMAGE.ordinal()] = 6;
        f30622a[MessageType.UNKNOWN.ordinal()] = 7;
    }
}
