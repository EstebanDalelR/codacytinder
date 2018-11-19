package com.tinder.chat.presenter;

import com.tinder.chat.view.model.ChatScreenState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class ae {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30005a = new int[ChatScreenState.values().length];

    static {
        f30005a[ChatScreenState.LOADING.ordinal()] = 1;
        f30005a[ChatScreenState.SHOW_CONVERSATION.ordinal()] = 2;
        f30005a[ChatScreenState.EMPTY_SCREEN.ordinal()] = 3;
        f30005a[ChatScreenState.ERROR.ordinal()] = 4;
    }
}
