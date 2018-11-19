package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Creator<BinaryFrame> CREATOR = new C21361();
    public final byte[] data;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$1 */
    static class C21361 implements Creator<BinaryFrame> {
        C21361() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7690a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7691a(i);
        }

        /* renamed from: a */
        public BinaryFrame m7690a(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: a */
        public BinaryFrame[] m7691a(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.data = parcel.createByteArray();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                BinaryFrame binaryFrame = (BinaryFrame) obj;
                if (!this.id.equals(binaryFrame.id) || Arrays.equals(this.data, binaryFrame.data) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeByteArray(this.data);
    }
}
