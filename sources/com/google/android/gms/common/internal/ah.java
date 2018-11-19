package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.zzq;

public final class ah extends C2530c<zzbd> {
    /* renamed from: a */
    private static final ah f12051a = new ah();

    private ah() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m14443a(Context context, int i, int i2) throws zzq {
        return f12051a.m14444b(context, i, i2);
    }

    /* renamed from: b */
    private final View m14444b(Context context, int i, int i2) throws zzq {
        try {
            zzbv zzbv = new zzbv(i, i2, null);
            return (View) C4296b.m17262a(((zzbd) m9224a(context)).zza(C4296b.m17261a((Object) context), zzbv));
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Could not get button with size ");
            stringBuilder.append(i);
            stringBuilder.append(" and color ");
            stringBuilder.append(i2);
            throw new zzq(stringBuilder.toString(), e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2576a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zzbd ? (zzbd) queryLocalInterface : new C3826u(iBinder);
    }
}
