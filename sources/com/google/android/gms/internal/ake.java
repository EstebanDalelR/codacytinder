package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.p068a.C2336a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzzv
public final class ake {
    /* renamed from: a */
    private final Date f15333a;
    /* renamed from: b */
    private final String f15334b;
    /* renamed from: c */
    private final int f15335c;
    /* renamed from: d */
    private final Set<String> f15336d;
    /* renamed from: e */
    private final Location f15337e;
    /* renamed from: f */
    private final boolean f15338f;
    /* renamed from: g */
    private final Bundle f15339g;
    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f15340h;
    /* renamed from: i */
    private final String f15341i;
    /* renamed from: j */
    private final String f15342j;
    /* renamed from: k */
    private final C2336a f15343k;
    /* renamed from: l */
    private final int f15344l;
    /* renamed from: m */
    private final Set<String> f15345m;
    /* renamed from: n */
    private final Bundle f15346n;
    /* renamed from: o */
    private final Set<String> f15347o;
    /* renamed from: p */
    private final boolean f15348p;

    public ake(akf akf) {
        this(akf, null);
    }

    public ake(akf akf, C2336a c2336a) {
        this.f15333a = akf.f15355g;
        this.f15334b = akf.f15356h;
        this.f15335c = akf.f15357i;
        this.f15336d = Collections.unmodifiableSet(akf.f15349a);
        this.f15337e = akf.f15358j;
        this.f15338f = akf.f15359k;
        this.f15339g = akf.f15350b;
        this.f15340h = Collections.unmodifiableMap(akf.f15351c);
        this.f15341i = akf.f15360l;
        this.f15342j = akf.f15361m;
        this.f15343k = c2336a;
        this.f15344l = akf.f15362n;
        this.f15345m = Collections.unmodifiableSet(akf.f15352d);
        this.f15346n = akf.f15353e;
        this.f15347o = Collections.unmodifiableSet(akf.f15354f);
        this.f15348p = akf.f15363o;
    }

    /* renamed from: a */
    public final Bundle m19225a(Class<? extends MediationAdapter> cls) {
        return this.f15339g.getBundle(cls.getName());
    }

    /* renamed from: a */
    public final Date m19226a() {
        return this.f15333a;
    }

    /* renamed from: a */
    public final boolean m19227a(Context context) {
        Set set = this.f15345m;
        aja.m19216a();
        return set.contains(hn.m19863a(context));
    }

    /* renamed from: b */
    public final String m19228b() {
        return this.f15334b;
    }

    /* renamed from: c */
    public final int m19229c() {
        return this.f15335c;
    }

    /* renamed from: d */
    public final Set<String> m19230d() {
        return this.f15336d;
    }

    /* renamed from: e */
    public final Location m19231e() {
        return this.f15337e;
    }

    /* renamed from: f */
    public final boolean m19232f() {
        return this.f15338f;
    }

    /* renamed from: g */
    public final String m19233g() {
        return this.f15341i;
    }

    /* renamed from: h */
    public final String m19234h() {
        return this.f15342j;
    }

    /* renamed from: i */
    public final C2336a m19235i() {
        return this.f15343k;
    }

    /* renamed from: j */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> m19236j() {
        return this.f15340h;
    }

    /* renamed from: k */
    public final Bundle m19237k() {
        return this.f15339g;
    }

    /* renamed from: l */
    public final int m19238l() {
        return this.f15344l;
    }

    /* renamed from: m */
    public final Bundle m19239m() {
        return this.f15346n;
    }

    /* renamed from: n */
    public final Set<String> m19240n() {
        return this.f15347o;
    }

    /* renamed from: o */
    public final boolean m19241o() {
        return this.f15348p;
    }
}
