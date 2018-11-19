package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

public final class vm {
    /* renamed from: a */
    public static final yc f16596a = ((yc) yc.m34917b().m34912a("TINK_MAC_1_0_0").m34911a(uf.m20222a("TinkMac", "Mac", "HmacKey", 0, true)).m34103d());

    static {
        try {
            m20258a();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m20258a() throws GeneralSecurityException {
        uo.m20238a("TinkMac", new vl());
    }
}
