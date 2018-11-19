package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.reactivex.internal.util.f */
public class C15739f {
    /* renamed from: h */
    final int f48660h;
    /* renamed from: i */
    Object[] f48661i;
    /* renamed from: j */
    Object[] f48662j;
    /* renamed from: k */
    volatile int f48663k;
    /* renamed from: l */
    int f48664l;

    public C15739f(int i) {
        this.f48660h = i;
    }

    /* renamed from: a */
    public void m58984a(Object obj) {
        if (this.f48663k == 0) {
            this.f48661i = new Object[(this.f48660h + 1)];
            this.f48662j = this.f48661i;
            this.f48661i[0] = obj;
            this.f48664l = 1;
            this.f48663k = 1;
        } else if (this.f48664l == this.f48660h) {
            Object[] objArr = new Object[(this.f48660h + 1)];
            objArr[0] = obj;
            this.f48662j[this.f48660h] = objArr;
            this.f48662j = objArr;
            this.f48664l = 1;
            this.f48663k += 1;
        } else {
            this.f48662j[this.f48664l] = obj;
            this.f48664l += 1;
            this.f48663k += 1;
        }
    }

    /* renamed from: b */
    public Object[] m58985b() {
        return this.f48661i;
    }

    /* renamed from: c */
    public int m58986c() {
        return this.f48663k;
    }

    public String toString() {
        int i = this.f48660h;
        int i2 = this.f48663k;
        List arrayList = new ArrayList(i2 + 1);
        Object[] b = m58985b();
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(b[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    b = (Object[]) b[i];
                }
            }
            return arrayList.toString();
        }
    }
}
