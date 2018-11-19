package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class zzbt extends zzbfm {
    public static final Creator<zzbt> CREATOR = new af();
    private int zzeck;
    private ConnectionResult zzfoo;
    private boolean zzfri;
    private IBinder zzgbn;
    private boolean zzgbo;

    zzbt(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.zzeck = i;
        this.zzgbn = iBinder;
        this.zzfoo = connectionResult;
        this.zzfri = z;
        this.zzgbo = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbt)) {
            return false;
        }
        zzbt zzbt = (zzbt) obj;
        return this.zzfoo.equals(zzbt.zzfoo) && zzalp().equals(zzbt.zzalp());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, this.zzgbn, false);
        oj.a(parcel, 3, this.zzfoo, i, false);
        oj.a(parcel, 4, this.zzfri);
        oj.a(parcel, 5, this.zzgbo);
        oj.a(parcel, a);
    }

    public final ConnectionResult zzahf() {
        return this.zzfoo;
    }

    public final zzan zzalp() {
        IBinder iBinder = this.zzgbn;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof zzan ? (zzan) queryLocalInterface : new C3821o(iBinder);
    }

    public final boolean zzalq() {
        return this.zzfri;
    }

    public final boolean zzalr() {
        return this.zzgbo;
    }
}
