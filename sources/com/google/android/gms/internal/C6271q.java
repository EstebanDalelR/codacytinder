package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

@zzzv
/* renamed from: com.google.android.gms.internal.q */
public final class C6271q extends al<zzabb> {
    /* renamed from: d */
    private int f23419d;

    public C6271q(Context context, Looper looper, zzf zzf, zzg zzg, int i) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        super(context, looper, 8, zzf, zzg, null);
        this.f23419d = i;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m27438a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzabb ? (zzabb) queryLocalInterface : new C6273x(iBinder);
    }

    /* renamed from: a */
    protected final String m27439a() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: b */
    protected final String m27440b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: c */
    public final zzabb m27441c() throws DeadObjectException {
        return (zzabb) super.m();
    }
}
