package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzzv
public final class ago {
    /* renamed from: a */
    private final Object f15206a = new Object();
    /* renamed from: b */
    private int f15207b;
    /* renamed from: c */
    private List<agn> f15208c = new LinkedList();

    @Nullable
    /* renamed from: a */
    public final agn m19128a() {
        synchronized (this.f15206a) {
            agn agn = null;
            if (this.f15208c.size() == 0) {
                hx.m19911b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f15208c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (agn agn2 : this.f15208c) {
                    int i4 = agn2.m19126i();
                    if (i4 > i2) {
                        i = i3;
                        agn = agn2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f15208c.remove(i);
                return agn;
            }
            agn agn3 = (agn) this.f15208c.get(0);
            agn3.m19122e();
            return agn3;
        }
    }

    /* renamed from: a */
    public final boolean m19129a(agn agn) {
        synchronized (this.f15206a) {
            if (this.f15208c.contains(agn)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m19130b(agn agn) {
        synchronized (this.f15206a) {
            Iterator it = this.f15208c.iterator();
            while (it.hasNext()) {
                agn agn2 = (agn) it.next();
                if (!((Boolean) aja.m19221f().m19334a(alo.f15439Q)).booleanValue() || ar.i().m27299a()) {
                    if (((Boolean) aja.m19221f().m19334a(alo.f15441S)).booleanValue() && !ar.i().m27303b() && agn != agn2 && agn2.m19121d().equals(agn.m19121d())) {
                        it.remove();
                        return true;
                    }
                } else if (agn != agn2 && agn2.m19118b().equals(agn.m19118b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void m19131c(agn agn) {
        synchronized (this.f15206a) {
            int size;
            if (this.f15208c.size() >= 10) {
                size = this.f15208c.size();
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Queue is full, current size = ");
                stringBuilder.append(size);
                hx.m19911b(stringBuilder.toString());
                this.f15208c.remove(0);
            }
            size = this.f15207b;
            this.f15207b = size + 1;
            agn.m19115a(size);
            this.f15208c.add(agn);
        }
    }
}
