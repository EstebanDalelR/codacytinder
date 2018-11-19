package com.tinder.data.message;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.n */
public final /* synthetic */ class C8695n {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30648a = new int[MessageType.values().length];

    static {
        f30648a[MessageType.TEXT.ordinal()] = 1;
        f30648a[MessageType.GIF.ordinal()] = 2;
        f30648a[MessageType.REACTION.ordinal()] = 3;
        f30648a[MessageType.ACTIVITY.ordinal()] = 4;
        f30648a[MessageType.IMAGE.ordinal()] = 5;
        f30648a[MessageType.SYSTEM.ordinal()] = 6;
        f30648a[MessageType.UNKNOWN.ordinal()] = 7;
    }
}
