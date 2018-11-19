package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.C6285x;
import com.google.android.gms.location.zzm;

public final class zzcdz extends zzbfm {
    public static final Creator<zzcdz> CREATOR = new qq();
    private int zzikz;
    private zzcdx zzila;
    private zzm zzilb;
    private zzceu zzilc;

    zzcdz(int i, zzcdx zzcdx, IBinder iBinder, IBinder iBinder2) {
        this.zzikz = i;
        this.zzila = zzcdx;
        zzceu zzceu = null;
        this.zzilb = iBinder == null ? null : C6285x.m27600a(iBinder);
        if (iBinder2 != null) {
            if (iBinder2 != null) {
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                zzceu = queryLocalInterface instanceof zzceu ? (zzceu) queryLocalInterface : new rk(iBinder2);
            }
        }
        this.zzilc = zzceu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzikz);
        oj.m20096a(parcel, 2, this.zzila, i, false);
        IBinder iBinder = null;
        oj.m20094a(parcel, 3, this.zzilb == null ? null : this.zzilb.asBinder(), false);
        if (this.zzilc != null) {
            iBinder = this.zzilc.asBinder();
        }
        oj.m20094a(parcel, 4, iBinder, false);
        oj.m20088a(parcel, a);
    }
}
