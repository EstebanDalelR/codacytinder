package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new au();
    private IBinder zzfzf;

    public BinderWrapper() {
        this.zzfzf = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.zzfzf = null;
        this.zzfzf = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.zzfzf = null;
        this.zzfzf = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzfzf);
    }
}
