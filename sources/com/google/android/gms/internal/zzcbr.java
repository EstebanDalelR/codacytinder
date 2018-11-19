package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcbr extends zzbfm {
    public static final Creator<zzcbr> CREATOR = new qd();
    private int versionCode;
    private nx zzibr = null;
    private byte[] zzibs;

    zzcbr(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzibs = bArr;
        zzanj();
    }

    private final void zzanj() {
        if (this.zzibr == null && this.zzibs != null) {
            return;
        }
        if (this.zzibr != null && this.zzibs == null) {
            return;
        }
        if (this.zzibr != null && this.zzibs != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.zzibr == null && this.zzibs == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20102a(parcel, 2, this.zzibs != null ? this.zzibs : aee.m19058a(this.zzibr), false);
        oj.m20088a(parcel, i);
    }

    public final nx zzaur() {
        if ((this.zzibr != null ? 1 : null) == null) {
            try {
                this.zzibr = (nx) aee.m19056a(new nx(), this.zzibs);
                this.zzibs = null;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        zzanj();
        return this.zzibr;
    }
}
