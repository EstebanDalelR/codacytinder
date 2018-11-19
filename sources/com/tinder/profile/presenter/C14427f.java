package com.tinder.profile.presenter;

import com.tinder.bitmoji.BitmojiAuthStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.presenter.f */
public final /* synthetic */ class C14427f {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45707a = new int[BitmojiAuthStatus.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f45708b = new int[BitmojiAuthStatus.values().length];

    static {
        f45707a[BitmojiAuthStatus.CONNECTED.ordinal()] = 1;
        f45707a[BitmojiAuthStatus.DISCONNECTED.ordinal()] = 2;
        f45707a[BitmojiAuthStatus.AUTH_FAILED.ordinal()] = 3;
        f45708b[BitmojiAuthStatus.CONNECTED.ordinal()] = 1;
        f45708b[BitmojiAuthStatus.AUTH_FAILED.ordinal()] = 2;
        f45708b[BitmojiAuthStatus.DISCONNECTED.ordinal()] = 3;
    }
}
