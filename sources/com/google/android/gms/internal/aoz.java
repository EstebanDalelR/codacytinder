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
public final class aoz extends al<zzrv> {
    aoz(Context context, Looper looper, zzf zzf, zzg zzg) {
        super(context, looper, 166, zzf, zzg, null);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m27176a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof zzrv ? (zzrv) queryLocalInterface : new apc(iBinder);
    }

    /* renamed from: a */
    protected final String m27177a() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: b */
    protected final String m27178b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* renamed from: c */
    public final zzrv m27179c() throws DeadObjectException {
        return (zzrv) super.m();
    }
}
