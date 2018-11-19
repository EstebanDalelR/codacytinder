package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Creator<PrivFrame> CREATOR = new C21421();
    public static final String ID = "PRIV";
    public final String owner;
    public final byte[] privateData;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$1 */
    static class C21421 implements Creator<PrivFrame> {
        C21421() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7703a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7704a(i);
        }

        /* renamed from: a */
        public PrivFrame m7703a(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: a */
        public PrivFrame[] m7704a(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super(ID);
        this.owner = str;
        this.privateData = bArr;
    }

    PrivFrame(Parcel parcel) {
        super(ID);
        this.owner = parcel.readString();
        this.privateData = parcel.createByteArray();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                PrivFrame privFrame = (PrivFrame) obj;
                if (!C2314v.m8480a(this.owner, privFrame.owner) || Arrays.equals(this.privateData, privFrame.privateData) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + (this.owner != null ? this.owner.hashCode() : 0)) * 31) + Arrays.hashCode(this.privateData);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(": owner=");
        stringBuilder.append(this.owner);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.owner);
        parcel.writeByteArray(this.privateData);
    }
}
