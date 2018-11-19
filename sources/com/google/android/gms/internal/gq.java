package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class gq {
    /* renamed from: a */
    private final List<String> f16114a = new ArrayList();
    /* renamed from: b */
    private final List<Double> f16115b = new ArrayList();
    /* renamed from: c */
    private final List<Double> f16116c = new ArrayList();

    /* renamed from: a */
    public final gn m19827a() {
        return new gn();
    }

    /* renamed from: a */
    public final gq m19828a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f16114a.size()) {
            double doubleValue = ((Double) this.f16116c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f16115b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f16114a.add(i, str);
        this.f16116c.add(i, Double.valueOf(d));
        this.f16115b.add(i, Double.valueOf(d2));
        return this;
    }
}
