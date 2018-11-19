package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Arrays;

public final class TrackGroup implements Parcelable {
    public static final Creator<TrackGroup> CREATOR = new C21811();
    private final Format[] formats;
    private int hashCode;
    public final int length;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroup$1 */
    static class C21811 implements Creator<TrackGroup> {
        C21811() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7848a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7849a(i);
        }

        /* renamed from: a */
        public TrackGroup m7848a(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        /* renamed from: a */
        public TrackGroup[] m7849a(int i) {
            return new TrackGroup[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public TrackGroup(Format... formatArr) {
        C2289a.m8313b(formatArr.length > 0);
        this.formats = formatArr;
        this.length = formatArr.length;
    }

    TrackGroup(Parcel parcel) {
        this.length = parcel.readInt();
        this.formats = new Format[this.length];
        for (int i = 0; i < this.length; i++) {
            this.formats[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int indexOf(Format format) {
        for (int i = 0; i < this.formats.length; i++) {
            if (format == this.formats[i]) {
                return i;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 527 + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                TrackGroup trackGroup = (TrackGroup) obj;
                if (this.length != trackGroup.length || Arrays.equals(this.formats, trackGroup.formats) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        for (int i2 = 0; i2 < this.length; i2++) {
            parcel.writeParcelable(this.formats[i2], 0);
        }
    }
}
