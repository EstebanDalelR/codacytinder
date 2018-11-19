package com.tinder.data.p215d;

import com.tinder.domain.auth.AuthStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.d.b */
public final /* synthetic */ class C8641b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30493a = new int[AuthStatus.values().length];

    static {
        f30493a[AuthStatus.LOGGED_IN.ordinal()] = 1;
        f30493a[AuthStatus.LOGGED_OUT.ordinal()] = 2;
    }
}
