package com.tinder.chat.view.action;

import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.i */
public final /* synthetic */ class C8463i {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30125a = new int[Type.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f30126b = new int[Type.values().length];

    static {
        f30125a[Type.OUTBOUND_TEXT_MESSAGE.ordinal()] = 1;
        f30125a[Type.INBOUND_TEXT_MESSAGE.ordinal()] = 2;
        f30125a[Type.OUTBOUND_GIF_MESSAGE.ordinal()] = 3;
        f30125a[Type.INBOUND_GIF_MESSAGE.ordinal()] = 4;
        f30125a[Type.INBOUND_REACTION_MESSAGE.ordinal()] = 5;
        f30125a[Type.OUTBOUND_REACTION_MESSAGE.ordinal()] = 6;
        f30125a[Type.INBOUND_ACTIVITY_MESSAGE.ordinal()] = 7;
        f30125a[Type.OUTBOUND_ACTIVITY_MESSAGE.ordinal()] = 8;
        f30125a[Type.INBOUND_IMAGE_MESSAGE.ordinal()] = 9;
        f30125a[Type.OUTBOUND_IMAGE_MESSAGE.ordinal()] = 10;
        f30126b[Type.INBOUND_TEXT_MESSAGE.ordinal()] = 1;
        f30126b[Type.OUTBOUND_TEXT_MESSAGE.ordinal()] = 2;
        f30126b[Type.INBOUND_GIF_MESSAGE.ordinal()] = 3;
        f30126b[Type.OUTBOUND_GIF_MESSAGE.ordinal()] = 4;
        f30126b[Type.INBOUND_REACTION_MESSAGE.ordinal()] = 5;
        f30126b[Type.OUTBOUND_REACTION_MESSAGE.ordinal()] = 6;
        f30126b[Type.INBOUND_ACTIVITY_MESSAGE.ordinal()] = 7;
        f30126b[Type.OUTBOUND_ACTIVITY_MESSAGE.ordinal()] = 8;
        f30126b[Type.INBOUND_IMAGE_MESSAGE.ordinal()] = 9;
        f30126b[Type.OUTBOUND_IMAGE_MESSAGE.ordinal()] = 10;
    }
}
