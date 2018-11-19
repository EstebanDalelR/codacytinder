package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.internal.akj;
import com.google.android.gms.internal.akl;

/* renamed from: com.google.android.gms.ads.i */
public class C2365i {

    /* renamed from: com.google.android.gms.ads.i$a */
    public static final class C2364a {
        /* renamed from: a */
        private final akl f7069a;

        /* renamed from: a */
        final akl m8616a() {
            return this.f7069a;
        }
    }

    /* renamed from: a */
    public static void m8617a(Context context) {
        C2365i.m8618a(context, null, null);
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    /* renamed from: a */
    public static void m8618a(Context context, String str, C2364a c2364a) {
        akj.a().a(context, str, c2364a == null ? null : c2364a.m8616a());
    }
}
