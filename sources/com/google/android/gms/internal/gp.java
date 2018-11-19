package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C2507w;
import com.tinder.api.ManagerWebServices;
import java.util.Arrays;

public final class gp {
    /* renamed from: a */
    public final String f16109a;
    /* renamed from: b */
    public final double f16110b;
    /* renamed from: c */
    public final int f16111c;
    /* renamed from: d */
    private double f16112d;
    /* renamed from: e */
    private double f16113e;

    public gp(String str, double d, double d2, double d3, int i) {
        this.f16109a = str;
        this.f16113e = d;
        this.f16112d = d2;
        this.f16110b = d3;
        this.f16111c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return C2507w.a(this.f16109a, gpVar.f16109a) && this.f16112d == gpVar.f16112d && this.f16113e == gpVar.f16113e && this.f16111c == gpVar.f16111c && Double.compare(this.f16110b, gpVar.f16110b) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16109a, Double.valueOf(this.f16112d), Double.valueOf(this.f16113e), Double.valueOf(this.f16110b), Integer.valueOf(this.f16111c)});
    }

    public final String toString() {
        return C2507w.a(this).a("name", this.f16109a).a("minBound", Double.valueOf(this.f16113e)).a("maxBound", Double.valueOf(this.f16112d)).a("percent", Double.valueOf(this.f16110b)).a(ManagerWebServices.FB_PARAM_FIELD_COUNT, Integer.valueOf(this.f16111c)).toString();
    }
}
