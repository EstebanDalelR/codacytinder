package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class NextPing implements Parcelable, FoursquareType {
    public static final Creator<NextPing> CREATOR = new C19011();
    private GeoFence geoFence;
    private long minTime;

    /* renamed from: com.foursquare.api.types.NextPing$1 */
    class C19011 implements Creator<NextPing> {
        C19011() {
        }

        public NextPing createFromParcel(Parcel parcel) {
            return new NextPing(parcel);
        }

        public NextPing[] newArray(int i) {
            return new NextPing[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public NextPing(Parcel parcel) {
        this.minTime = parcel.readLong();
        this.geoFence = (GeoFence) parcel.readParcelable(GeoFence.class.getClassLoader());
    }

    public long getMinTime() {
        return this.minTime;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setGeoFence(GeoFence geoFence) {
        this.geoFence = geoFence;
    }

    public GeoFence getGeoFence() {
        return this.geoFence;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.minTime);
        parcel.writeParcelable(this.geoFence, i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                NextPing nextPing = (NextPing) obj;
                if (this.minTime != nextPing.minTime) {
                    return false;
                }
                if (this.geoFence != null) {
                    z = this.geoFence.equals(nextPing.geoFence);
                } else if (nextPing.geoFence != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) (this.minTime ^ (this.minTime >>> 32))) * 31) + (this.geoFence != null ? this.geoFence.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NextPing{minTime=");
        stringBuilder.append(this.minTime);
        stringBuilder.append(", geoFence=");
        stringBuilder.append(this.geoFence);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
