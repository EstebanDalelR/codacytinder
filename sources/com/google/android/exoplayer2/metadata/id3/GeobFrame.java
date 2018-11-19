package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Creator<GeobFrame> CREATOR = new C21401();
    public static final String ID = "GEOB";
    public final byte[] data;
    public final String description;
    public final String filename;
    public final String mimeType;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$1 */
    static class C21401 implements Creator<GeobFrame> {
        C21401() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7698a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7699a(i);
        }

        /* renamed from: a */
        public GeobFrame m7698a(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: a */
        public GeobFrame[] m7699a(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }

    GeobFrame(Parcel parcel) {
        super(ID);
        this.mimeType = parcel.readString();
        this.filename = parcel.readString();
        this.description = parcel.readString();
        this.data = parcel.createByteArray();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                GeobFrame geobFrame = (GeobFrame) obj;
                if (!C2314v.m8480a(this.mimeType, geobFrame.mimeType) || !C2314v.m8480a(this.filename, geobFrame.filename) || !C2314v.m8480a(this.description, geobFrame.description) || Arrays.equals(this.data, geobFrame.data) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + (this.mimeType != null ? this.mimeType.hashCode() : 0)) * 31) + (this.filename != null ? this.filename.hashCode() : 0)) * 31;
        if (this.description != null) {
            i = this.description.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.mimeType);
        stringBuilder.append(", filename=");
        stringBuilder.append(this.filename);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.filename);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.data);
    }
}
