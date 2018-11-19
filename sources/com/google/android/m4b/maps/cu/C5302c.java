package com.google.android.m4b.maps.cu;

import java.lang.reflect.Array;

/* renamed from: com.google.android.m4b.maps.cu.c */
public final class C5302c<M extends C6667b<M>, T> {
    /* renamed from: a */
    protected final Class<T> f19683a;
    /* renamed from: b */
    private int f19684b;
    /* renamed from: c */
    private int f19685c;
    /* renamed from: d */
    private boolean f19686d;

    /* renamed from: a */
    final void m23521a(Object obj, C5301a c5301a) {
        if (this.f19686d) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                Object obj2 = Array.get(obj, i);
                if (obj2 != null) {
                    m23519b(obj2, c5301a);
                }
            }
            return;
        }
        m23519b(obj, c5301a);
    }

    /* renamed from: b */
    private void m23519b(Object obj, C5301a c5301a) {
        try {
            c5301a.m23514b(this.f19685c);
            switch (this.f19684b) {
                case 10:
                    C5306g c5306g = (C5306g) obj;
                    int a = C5309j.m23542a(this.f19685c);
                    c5306g.mo5392a(c5301a);
                    c5301a.m23517c(a, 4);
                    return;
                case 11:
                    c5301a.m23513a((C5306g) obj);
                    return;
                default:
                    c5301a = this.f19684b;
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(c5301a);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Object obj2) {
            throw new IllegalStateException(obj2);
        }
    }

    /* renamed from: a */
    final int m23520a(Object obj) {
        if (!this.f19686d) {
            return m23518b(obj);
        }
        int length = Array.getLength(obj);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += m23518b(Array.get(obj, i2));
            }
        }
        return i;
    }

    /* renamed from: b */
    private int m23518b(Object obj) {
        int a = C5309j.m23542a(this.f19685c);
        switch (this.f19684b) {
            case 10:
                return (C5301a.m23486a(a) * 2) + ((C5306g) obj).m23536f();
            case 11:
                return C5301a.m23493b(a, (C5306g) obj);
            default:
                a = this.f19684b;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(a);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
