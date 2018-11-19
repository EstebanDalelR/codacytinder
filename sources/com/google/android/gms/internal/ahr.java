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
public final class ahr extends al<zzio> {
    ahr(Context context, Looper looper, zzf zzf, zzg zzg) {
        super(context, looper, 123, zzf, zzg, null);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m27086a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzio ? (zzio) queryLocalInterface : new aht(iBinder);
    }

    /* renamed from: a */
    protected final String m27087a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: b */
    protected final String m27088b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* renamed from: c */
    public final zzio m27089c() throws DeadObjectException {
        return (zzio) super.m();
    }
}
