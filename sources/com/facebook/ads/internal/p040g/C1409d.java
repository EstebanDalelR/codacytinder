package com.facebook.ads.internal.p040g;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.g.d */
public class C1409d {
    /* renamed from: a */
    private List<C1405a> f3867a = new ArrayList();
    /* renamed from: b */
    private int f3868b = 0;
    /* renamed from: c */
    private C1410e f3869c;
    @Nullable
    /* renamed from: d */
    private String f3870d;

    public C1409d(C1410e c1410e, @Nullable String str) {
        this.f3869c = c1410e;
        this.f3870d = str;
    }

    /* renamed from: a */
    public C1410e m4895a() {
        return this.f3869c;
    }

    /* renamed from: a */
    public void m4896a(C1405a c1405a) {
        this.f3867a.add(c1405a);
    }

    @Nullable
    /* renamed from: b */
    public String m4897b() {
        return this.f3870d;
    }

    /* renamed from: c */
    public int m4898c() {
        return this.f3867a.size();
    }

    /* renamed from: d */
    public C1405a m4899d() {
        if (this.f3868b >= this.f3867a.size()) {
            return null;
        }
        this.f3868b++;
        return (C1405a) this.f3867a.get(this.f3868b - 1);
    }
}
