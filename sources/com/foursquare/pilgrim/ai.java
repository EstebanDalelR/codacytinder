package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.foursquare.api.FoursquareLocation;
import com.google.gson.annotations.SerializedName;

class ai {
    @SerializedName("lat")
    /* renamed from: a */
    final double f5289a;
    @SerializedName("lng")
    /* renamed from: b */
    final double f5290b;
    @SerializedName("probability")
    /* renamed from: c */
    final double f5291c;
    @SerializedName("type")
    @NonNull
    /* renamed from: d */
    final RegionType f5292d;
    @SerializedName("secondaryType")
    @NonNull
    /* renamed from: e */
    final RegionType f5293e;

    public ai(double d, double d2, double d3, @NonNull RegionType regionType, @NonNull RegionType regionType2) {
        this.f5289a = d;
        this.f5290b = d2;
        this.f5291c = d3;
        this.f5292d = regionType;
        this.f5293e = regionType2;
    }

    /* renamed from: a */
    public FoursquareLocation m6920a() {
        return new FoursquareLocation(this.f5289a, this.f5290b);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ai aiVar = (ai) obj;
                if (Double.compare(aiVar.f5289a, this.f5289a) != 0 || Double.compare(aiVar.f5290b, this.f5290b) != 0 || Double.compare(aiVar.f5291c, this.f5291c) != 0 || this.f5292d != aiVar.f5292d) {
                    return false;
                }
                if (this.f5293e != aiVar.f5293e) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5289a);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5290b);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.f5291c);
        return (((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + this.f5292d.hashCode()) * 31) + this.f5293e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PassiveCluster{lat=");
        stringBuilder.append(this.f5289a);
        stringBuilder.append(", lng=");
        stringBuilder.append(this.f5290b);
        stringBuilder.append(", probability=");
        stringBuilder.append(this.f5291c);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f5292d);
        stringBuilder.append(", secondaryType=");
        stringBuilder.append(this.f5293e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
