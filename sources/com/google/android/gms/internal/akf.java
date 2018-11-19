package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class akf {
    /* renamed from: a */
    private final HashSet<String> f15349a = new HashSet();
    /* renamed from: b */
    private final Bundle f15350b = new Bundle();
    /* renamed from: c */
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f15351c = new HashMap();
    /* renamed from: d */
    private final HashSet<String> f15352d = new HashSet();
    /* renamed from: e */
    private final Bundle f15353e = new Bundle();
    /* renamed from: f */
    private final HashSet<String> f15354f = new HashSet();
    /* renamed from: g */
    private Date f15355g;
    /* renamed from: h */
    private String f15356h;
    /* renamed from: i */
    private int f15357i = -1;
    /* renamed from: j */
    private Location f15358j;
    /* renamed from: k */
    private boolean f15359k = false;
    /* renamed from: l */
    private String f15360l;
    /* renamed from: m */
    private String f15361m;
    /* renamed from: n */
    private int f15362n = -1;
    /* renamed from: o */
    private boolean f15363o;

    /* renamed from: a */
    public final void m19257a(int i) {
        this.f15357i = i;
    }

    /* renamed from: a */
    public final void m19258a(Location location) {
        this.f15358j = location;
    }

    /* renamed from: a */
    public final void m19259a(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f15350b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: a */
    public final void m19260a(String str) {
        this.f15349a.add(str);
    }

    /* renamed from: a */
    public final void m19261a(String str, String str2) {
        this.f15353e.putString(str, str2);
    }

    /* renamed from: a */
    public final void m19262a(Date date) {
        this.f15355g = date;
    }

    /* renamed from: a */
    public final void m19263a(boolean z) {
        this.f15362n = z;
    }

    /* renamed from: b */
    public final void m19264b(String str) {
        this.f15352d.add(str);
    }

    /* renamed from: b */
    public final void m19265b(boolean z) {
        this.f15363o = z;
    }

    /* renamed from: c */
    public final void m19266c(String str) {
        this.f15352d.remove(str);
    }
}
