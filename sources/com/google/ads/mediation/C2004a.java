package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Date;
import java.util.Set;

@Deprecated
/* renamed from: com.google.ads.mediation.a */
public class C2004a {
    /* renamed from: a */
    private final Date f5438a;
    /* renamed from: b */
    private final Gender f5439b;
    /* renamed from: c */
    private final Set<String> f5440c;
    /* renamed from: d */
    private final boolean f5441d;
    /* renamed from: e */
    private final Location f5442e;

    public C2004a(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.f5438a = date;
        this.f5439b = gender;
        this.f5440c = set;
        this.f5441d = z;
        this.f5442e = location;
    }
}
