package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Creator<TrackGroupArray> CREATOR = new C21821();
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    private int hashCode;
    public final int length;
    private final TrackGroup[] trackGroups;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$1 */
    static class C21821 implements Creator<TrackGroupArray> {
        C21821() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7850a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7851a(i);
        }

        /* renamed from: a */
        public TrackGroupArray m7850a(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        /* renamed from: a */
        public TrackGroupArray[] m7851a(int i) {
            return new TrackGroupArray[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.trackGroups = trackGroupArr;
        this.length = trackGroupArr.length;
    }

    TrackGroupArray(Parcel parcel) {
        this.length = parcel.readInt();
        this.trackGroups = new TrackGroup[this.length];
        for (int i = 0; i < this.length; i++) {
            this.trackGroups[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroup get(int i) {
        return this.trackGroups[i];
    }

    public int indexOf(TrackGroup trackGroup) {
        for (int i = 0; i < this.length; i++) {
            if (this.trackGroups[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.trackGroups);
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
                TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
                if (this.length != trackGroupArray.length || Arrays.equals(this.trackGroups, trackGroupArray.trackGroups) == null) {
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
            parcel.writeParcelable(this.trackGroups[i2], 0);
        }
    }
}
