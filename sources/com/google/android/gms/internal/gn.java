package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

@zzzv
public final class gn {
    /* renamed from: a */
    private final String[] f16104a;
    /* renamed from: b */
    private final double[] f16105b;
    /* renamed from: c */
    private final double[] f16106c;
    /* renamed from: d */
    private final int[] f16107d;
    /* renamed from: e */
    private int f16108e;

    private gn(gq gqVar) {
        int size = gqVar.f16115b.size();
        this.f16104a = (String[]) gqVar.f16114a.toArray(new String[size]);
        this.f16105b = m19821a(gqVar.f16115b);
        this.f16106c = m19821a(gqVar.f16116c);
        this.f16107d = new int[size];
        this.f16108e = 0;
    }

    /* renamed from: a */
    private static double[] m19821a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List<gp> m19822a() {
        List<gp> arrayList = new ArrayList(this.f16104a.length);
        for (int i = 0; i < this.f16104a.length; i++) {
            arrayList.add(new gp(this.f16104a[i], this.f16106c[i], this.f16105b[i], ((double) this.f16107d[i]) / ((double) this.f16108e), this.f16107d[i]));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m19823a(double d) {
        this.f16108e++;
        int i = 0;
        while (i < this.f16106c.length) {
            if (this.f16106c[i] <= d && d < this.f16105b[i]) {
                int[] iArr = this.f16107d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f16106c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
