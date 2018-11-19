package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.location.C6287z;
import com.google.android.gms.location.ab;
import com.google.android.gms.location.zzp;
import com.google.android.gms.location.zzs;

public final class zzcfq extends zzbfm {
    public static final Creator<zzcfq> CREATOR = new sb();
    private PendingIntent zzeeo;
    private int zzikz;
    private zzceu zzilc;
    private zzcfo zzima;
    private zzs zzimb;
    private zzp zzimc;

    zzcfq(int i, zzcfo zzcfo, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zzikz = i;
        this.zzima = zzcfo;
        zzceu zzceu = null;
        this.zzimb = iBinder == null ? null : ab.m27587a(iBinder);
        this.zzeeo = pendingIntent;
        this.zzimc = iBinder2 == null ? null : C6287z.m27601a(iBinder2);
        if (iBinder3 != null) {
            if (iBinder3 != null) {
                IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                zzceu = queryLocalInterface instanceof zzceu ? (zzceu) queryLocalInterface : new rk(iBinder3);
            }
        }
        this.zzilc = zzceu;
    }

    public static zzcfq zza(zzp zzp, @Nullable zzceu zzceu) {
        return new zzcfq(2, null, null, null, zzp.asBinder(), zzceu != null ? zzceu.asBinder() : null);
    }

    public static zzcfq zza(zzs zzs, @Nullable zzceu zzceu) {
        return new zzcfq(2, null, zzs.asBinder(), null, null, zzceu != null ? zzceu.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzikz);
        oj.m20096a(parcel, 2, this.zzima, i, false);
        IBinder iBinder = null;
        oj.m20094a(parcel, 3, this.zzimb == null ? null : this.zzimb.asBinder(), false);
        oj.m20096a(parcel, 4, this.zzeeo, i, false);
        oj.m20094a(parcel, 5, this.zzimc == null ? null : this.zzimc.asBinder(), false);
        if (this.zzilc != null) {
            iBinder = this.zzilc.asBinder();
        }
        oj.m20094a(parcel, 6, iBinder, false);
        oj.m20088a(parcel, a);
    }
}
