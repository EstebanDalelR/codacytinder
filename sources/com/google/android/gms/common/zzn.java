package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.C3822p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class zzn extends zzbfm {
    public static final Creator<zzn> CREATOR = new C2512o();
    private final String zzflg;
    private final C4293i zzflh;
    private final boolean zzfli;

    zzn(String str, IBinder iBinder, boolean z) {
        this.zzflg = str;
        this.zzflh = zzak(iBinder);
        this.zzfli = z;
    }

    zzn(String str, C4293i c4293i, boolean z) {
        this.zzflg = str;
        this.zzflh = c4293i;
        this.zzfli = z;
    }

    private static C4293i zzak(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzaga = C3822p.m14459a(iBinder).zzaga();
            byte[] bArr = zzaga == null ? null : (byte[]) C4296b.m17262a(zzaga);
            if (bArr != null) {
                return new C4400j(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (Throwable e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        i = oj.a(parcel);
        oj.a(parcel, 1, this.zzflg, false);
        if (this.zzflh == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.zzflh.asBinder();
        }
        oj.a(parcel, 2, iBinder, false);
        oj.a(parcel, 3, this.zzfli);
        oj.a(parcel, i);
    }
}
