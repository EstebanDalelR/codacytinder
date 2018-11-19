package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.foursquare.api.types.Venue;
import com.google.gson.annotations.SerializedName;
import java.util.List;

final class aw extends C3549d {
    @SerializedName("venues")
    /* renamed from: a */
    List<Venue> f13510a;
    @SerializedName("confidence")
    /* renamed from: b */
    String f13511b;
    @SerializedName("pilgrimVisitId")
    /* renamed from: c */
    String f13512c;
    @SerializedName("sleep")
    /* renamed from: d */
    int f13513d;
    @SerializedName("notificationConfigChecksum")
    /* renamed from: e */
    String f13514e;
    @SerializedName("otherPossibleVenues")
    /* renamed from: f */
    List<Venue> f13515f;
    @SerializedName("nearbyVenues")
    /* renamed from: g */
    List<NearbyVenue> f13516g;
    @SerializedName("locationType")
    /* renamed from: h */
    String f13517h;

    aw() {
    }

    /* renamed from: e */
    Venue m16789e() {
        return (this.f13510a == null || this.f13510a.size() <= 0) ? null : (Venue) this.f13510a.get(0);
    }

    /* renamed from: f */
    List<Venue> m16790f() {
        return this.f13515f;
    }

    /* renamed from: g */
    List<NearbyVenue> m16791g() {
        return this.f13516g;
    }

    @NonNull
    /* renamed from: h */
    Confidence m16792h() {
        return Confidence.fromString(this.f13511b);
    }

    /* renamed from: i */
    String m16793i() {
        return this.f13512c;
    }

    /* renamed from: j */
    int m16794j() {
        return this.f13513d;
    }

    /* renamed from: k */
    String m16795k() {
        return this.f13514e;
    }

    @NonNull
    /* renamed from: l */
    RegionType m16796l() {
        return RegionType.fromString(this.f13517h);
    }
}
