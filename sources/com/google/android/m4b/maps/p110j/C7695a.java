package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p110j.C5455p.C6705a;

/* renamed from: com.google.android.m4b.maps.j.a */
public final class C7695a extends C6705a {
    /* renamed from: a */
    private int f28163a;

    /* renamed from: a */
    public static android.accounts.Account m33397a(com.google.android.m4b.maps.p110j.C5455p r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r3 == 0) goto L_0x001f;
    L_0x0002:
        r0 = android.os.Binder.clearCallingIdentity();
        r3 = r3.mo5436a();	 Catch:{ RemoteException -> 0x0010 }
        android.os.Binder.restoreCallingIdentity(r0);
        goto L_0x0020;
    L_0x000e:
        r3 = move-exception;
        goto L_0x001b;
    L_0x0010:
        r3 = "AccountAccessor";	 Catch:{ all -> 0x000e }
        r2 = "Remote account accessor probably died";	 Catch:{ all -> 0x000e }
        android.util.Log.w(r3, r2);	 Catch:{ all -> 0x000e }
        android.os.Binder.restoreCallingIdentity(r0);
        goto L_0x001f;
    L_0x001b:
        android.os.Binder.restoreCallingIdentity(r0);
        throw r3;
    L_0x001f:
        r3 = 0;
    L_0x0020:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.a.a(com.google.android.m4b.maps.j.p):android.accounts.Account");
    }

    /* renamed from: a */
    public final Account mo5436a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.f28163a) {
            return null;
        }
        if (C5398g.m23579a(null, callingUid)) {
            this.f28163a = callingUid;
            return null;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7695a) == null) {
            return null;
        }
        obj = null;
        return obj.equals(obj);
    }
}
