package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.io.InputStream;

@zzzv
public final class zzii extends zzbfm {
    public static final Creator<zzii> CREATOR = new ahq();
    @Nullable
    private ParcelFileDescriptor zzbax;

    public zzii() {
        this(null);
    }

    public zzii(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbax = parcelFileDescriptor;
    }

    private synchronized ParcelFileDescriptor zzhh() {
        return this.zzbax;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 2, zzhh(), i, false);
        oj.m20088a(parcel, a);
    }

    public final synchronized boolean zzhf() {
        return this.zzbax != null;
    }

    @Nullable
    public final synchronized InputStream zzhg() {
        if (this.zzbax == null) {
            return null;
        }
        InputStream autoCloseInputStream = new AutoCloseInputStream(this.zzbax);
        this.zzbax = null;
        return autoCloseInputStream;
    }
}
