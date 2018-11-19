package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

public final class qb extends al<zzcbt> {
    public qb(Context context, Looper looper, zzf zzf, zzg zzg) {
        super(context, looper, 116, zzf, zzg, null);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m27446a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzcbt ? (zzcbt) queryLocalInterface : new qe(iBinder);
    }

    /* renamed from: a */
    protected final String m27447a() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: b */
    protected final String m27448b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: c */
    public final zzcbt m27449c() throws DeadObjectException {
        return (zzcbt) super.m();
    }
}
