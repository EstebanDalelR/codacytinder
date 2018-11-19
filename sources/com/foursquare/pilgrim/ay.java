package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.types.Venue;
import com.foursquare.internal.util.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import java.util.List;

class ay extends C3549d {
    @SerializedName("visitId")
    /* renamed from: a */
    private String f13518a;
    @SerializedName("stillAtVenue")
    /* renamed from: b */
    private boolean f13519b;
    @Nullable
    @SerializedName("venues")
    /* renamed from: c */
    private List<Venue> f13520c;
    @SerializedName("confidence")
    /* renamed from: d */
    private String f13521d;
    @SerializedName("isBackfill")
    /* renamed from: e */
    private boolean f13522e;
    @Nullable
    @SerializedName("locationType")
    /* renamed from: f */
    private String f13523f;
    @Nullable
    @SerializedName("otherPossibleVenues")
    /* renamed from: g */
    private List<Venue> f13524g;

    ay() {
    }

    /* renamed from: e */
    String m16797e() {
        return this.f13518a;
    }

    /* renamed from: f */
    boolean m16798f() {
        return this.f13519b;
    }

    /* renamed from: g */
    Confidence m16799g() {
        return Confidence.fromString(this.f13521d);
    }

    @NonNull
    /* renamed from: h */
    RegionType m16800h() {
        return RegionType.fromString(this.f13523f);
    }

    @Nullable
    /* renamed from: i */
    Venue m16801i() {
        return CollectionUtils.m6792a(this.f13520c) ? null : (Venue) this.f13520c.get(0);
    }

    /* renamed from: j */
    public boolean m16802j() {
        return this.f13522e;
    }

    @Nullable
    /* renamed from: k */
    public List<Venue> m16803k() {
        return this.f13524g;
    }
}
