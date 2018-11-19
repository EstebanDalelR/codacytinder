package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;

public final class TextInformationFrame extends Id3Frame {
    public static final Creator<TextInformationFrame> CREATOR = new C21431();
    public final String description;
    public final String value;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$1 */
    static class C21431 implements Creator<TextInformationFrame> {
        C21431() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7705a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7706a(i);
        }

        /* renamed from: a */
        public TextInformationFrame m7705a(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* renamed from: a */
        public TextInformationFrame[] m7706a(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.description = parcel.readString();
        this.value = parcel.readString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
                if (!this.id.equals(textInformationFrame.id) || !C2314v.m8480a(this.description, textInformationFrame.description) || C2314v.m8480a(this.value, textInformationFrame.value) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.id.hashCode()) * 31) + (this.description != null ? this.description.hashCode() : 0)) * 31;
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(": value=");
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }
}
