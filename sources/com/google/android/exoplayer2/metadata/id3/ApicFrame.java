package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Creator<ApicFrame> CREATOR = new C21351();
    public static final String ID = "APIC";
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$1 */
    static class C21351 implements Creator<ApicFrame> {
        C21351() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7688a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7689a(i);
        }

        /* renamed from: a */
        public ApicFrame m7688a(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: a */
        public ApicFrame[] m7689a(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }

    ApicFrame(Parcel parcel) {
        super(ID);
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ApicFrame apicFrame = (ApicFrame) obj;
                if (this.pictureType != apicFrame.pictureType || !C2314v.m8480a(this.mimeType, apicFrame.mimeType) || !C2314v.m8480a(this.description, apicFrame.description) || Arrays.equals(this.pictureData, apicFrame.pictureData) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.pictureType) * 31) + (this.mimeType != null ? this.mimeType.hashCode() : 0)) * 31;
        if (this.description != null) {
            i = this.description.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.pictureData);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.mimeType);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }
}
