package com.tinder.chat.presenter;

import com.tinder.bitmoji.BitmojiAuthStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.v */
public final /* synthetic */ class C8448v {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30080a = new int[BitmojiAuthStatus.values().length];

    static {
        f30080a[BitmojiAuthStatus.AUTH_FAILED.ordinal()] = 1;
        f30080a[BitmojiAuthStatus.CONNECTED.ordinal()] = 2;
    }
}
