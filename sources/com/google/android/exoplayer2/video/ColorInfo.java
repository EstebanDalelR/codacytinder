package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Creator<ColorInfo> CREATOR = new C23161();
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$1 */
    static class C23161 implements Creator<ColorInfo> {
        C23161() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8507a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8508a(i);
        }

        /* renamed from: a */
        public ColorInfo m8507a(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* renamed from: a */
        public ColorInfo[] m8508a(int i) {
            return new ColorInfo[0];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
    }

    ColorInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorRange = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.hdrStaticInfo = C2314v.m8479a(parcel) ? parcel.createByteArray() : null;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ColorInfo colorInfo = (ColorInfo) obj;
                if (this.colorSpace != colorInfo.colorSpace || this.colorRange != colorInfo.colorRange || this.colorTransfer != colorInfo.colorTransfer || Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ColorInfo(");
        stringBuilder.append(this.colorSpace);
        stringBuilder.append(", ");
        stringBuilder.append(this.colorRange);
        stringBuilder.append(", ");
        stringBuilder.append(this.colorTransfer);
        stringBuilder.append(", ");
        stringBuilder.append(this.hdrStaticInfo != null);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo);
        }
        return this.hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorRange);
        parcel.writeInt(this.colorTransfer);
        C2314v.m8471a(parcel, this.hdrStaticInfo != 0);
        if (this.hdrStaticInfo != 0) {
            parcel.writeByteArray(this.hdrStaticInfo);
        }
    }
}
