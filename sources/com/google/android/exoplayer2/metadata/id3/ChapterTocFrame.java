package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Creator<ChapterTocFrame> CREATOR = new C21381();
    public static final String ID = "CTOC";
    public final String[] children;
    public final String elementId;
    public final boolean isOrdered;
    public final boolean isRoot;
    private final Id3Frame[] subFrames;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$1 */
    static class C21381 implements Creator<ChapterTocFrame> {
        C21381() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7694a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7695a(i);
        }

        /* renamed from: a */
        public ChapterTocFrame m7694a(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: a */
        public ChapterTocFrame[] m7695a(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(ID);
        this.elementId = str;
        this.isRoot = z;
        this.isOrdered = z2;
        this.children = strArr;
        this.subFrames = id3FrameArr;
    }

    ChapterTocFrame(Parcel parcel) {
        super(ID);
        this.elementId = parcel.readString();
        boolean z = true;
        this.isRoot = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.isOrdered = z;
        this.children = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.subFrames = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.subFrames[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public Id3Frame getSubFrame(int i) {
        return this.subFrames[i];
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
                if (this.isRoot != chapterTocFrame.isRoot || this.isOrdered != chapterTocFrame.isOrdered || !C2314v.m8480a(this.elementId, chapterTocFrame.elementId) || !Arrays.equals(this.children, chapterTocFrame.children) || Arrays.equals(this.subFrames, chapterTocFrame.subFrames) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.isRoot) * 31) + this.isOrdered) * 31) + (this.elementId != null ? this.elementId.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.elementId);
        parcel.writeByte((byte) this.isRoot);
        parcel.writeByte((byte) this.isOrdered);
        parcel.writeStringArray(this.children);
        parcel.writeInt(this.subFrames.length);
        for (Parcelable writeParcelable : this.subFrames) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
