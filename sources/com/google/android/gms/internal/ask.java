package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzzv
public final class ask implements MediationAdRequest {
    /* renamed from: a */
    private final Date f23110a;
    /* renamed from: b */
    private final int f23111b;
    /* renamed from: c */
    private final Set<String> f23112c;
    /* renamed from: d */
    private final boolean f23113d;
    /* renamed from: e */
    private final Location f23114e;
    /* renamed from: f */
    private final int f23115f;
    /* renamed from: g */
    private final boolean f23116g;

    public ask(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, boolean z2) {
        this.f23110a = date;
        this.f23111b = i;
        this.f23112c = set;
        this.f23114e = location;
        this.f23113d = z;
        this.f23115f = i2;
        this.f23116g = z2;
    }

    public final Date getBirthday() {
        return this.f23110a;
    }

    public final int getGender() {
        return this.f23111b;
    }

    public final Set<String> getKeywords() {
        return this.f23112c;
    }

    public final Location getLocation() {
        return this.f23114e;
    }

    public final boolean isDesignedForFamilies() {
        return this.f23116g;
    }

    public final boolean isTesting() {
        return this.f23113d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f23115f;
    }
}
