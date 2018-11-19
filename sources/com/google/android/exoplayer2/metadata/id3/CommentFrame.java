package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;

public final class CommentFrame extends Id3Frame {
    public static final Creator<CommentFrame> CREATOR = new C21391();
    public static final String ID = "COMM";
    public final String description;
    public final String language;
    public final String text;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$1 */
    static class C21391 implements Creator<CommentFrame> {
        C21391() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7696a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7697a(i);
        }

        /* renamed from: a */
        public CommentFrame m7696a(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        /* renamed from: a */
        public CommentFrame[] m7697a(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super(ID);
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    CommentFrame(Parcel parcel) {
        super(ID);
        this.language = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                CommentFrame commentFrame = (CommentFrame) obj;
                if (!C2314v.m8480a(this.description, commentFrame.description) || !C2314v.m8480a(this.language, commentFrame.language) || C2314v.m8480a(this.text, commentFrame.text) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + (this.language != null ? this.language.hashCode() : 0)) * 31) + (this.description != null ? this.description.hashCode() : 0)) * 31;
        if (this.text != null) {
            i = this.text.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(": language=");
        stringBuilder.append(this.language);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.language);
        parcel.writeString(this.text);
    }
}
