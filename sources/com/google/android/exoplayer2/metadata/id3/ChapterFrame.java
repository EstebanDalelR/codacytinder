package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Creator<ChapterFrame> CREATOR = new C21371();
    public static final String ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final Id3Frame[] subFrames;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$1 */
    static class C21371 implements Creator<ChapterFrame> {
        C21371() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7692a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7693a(i);
        }

        /* renamed from: a */
        public ChapterFrame m7692a(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: a */
        public ChapterFrame[] m7693a(int i) {
            return new ChapterFrame[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(ID);
        this.chapterId = str;
        this.startTimeMs = i;
        this.endTimeMs = i2;
        this.startOffset = j;
        this.endOffset = j2;
        this.subFrames = id3FrameArr;
    }

    ChapterFrame(Parcel parcel) {
        super(ID);
        this.chapterId = parcel.readString();
        this.startTimeMs = parcel.readInt();
        this.endTimeMs = parcel.readInt();
        this.startOffset = parcel.readLong();
        this.endOffset = parcel.readLong();
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
                ChapterFrame chapterFrame = (ChapterFrame) obj;
                if (this.startTimeMs != chapterFrame.startTimeMs || this.endTimeMs != chapterFrame.endTimeMs || this.startOffset != chapterFrame.startOffset || this.endOffset != chapterFrame.endOffset || !C2314v.m8480a(this.chapterId, chapterFrame.chapterId) || Arrays.equals(this.subFrames, chapterFrame.subFrames) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31) + (this.chapterId != null ? this.chapterId.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.chapterId);
        parcel.writeInt(this.startTimeMs);
        parcel.writeInt(this.endTimeMs);
        parcel.writeLong(this.startOffset);
        parcel.writeLong(this.endOffset);
        parcel.writeInt(this.subFrames.length);
        for (Parcelable writeParcelable : this.subFrames) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
