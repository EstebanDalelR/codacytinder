package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;

public final class UrlLinkFrame extends Id3Frame {
    public static final Creator<UrlLinkFrame> CREATOR = new C21441();
    public final String description;
    public final String url;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$1 */
    static class C21441 implements Creator<UrlLinkFrame> {
        C21441() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7707a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7708a(i);
        }

        /* renamed from: a */
        public UrlLinkFrame m7707a(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: a */
        public UrlLinkFrame[] m7708a(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.description = parcel.readString();
        this.url = parcel.readString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
                if (!this.id.equals(urlLinkFrame.id) || !C2314v.m8480a(this.description, urlLinkFrame.description) || C2314v.m8480a(this.url, urlLinkFrame.url) == null) {
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
        if (this.url != null) {
            i = this.url.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(": url=");
        stringBuilder.append(this.url);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
    }
}
