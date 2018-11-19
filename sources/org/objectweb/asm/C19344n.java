package org.objectweb.asm;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;

/* renamed from: org.objectweb.asm.n */
class C19344n {
    /* renamed from: a */
    C19346p f60359a;
    /* renamed from: b */
    C19346p f60360b;
    /* renamed from: c */
    C19346p f60361c;
    /* renamed from: d */
    String f60362d;
    /* renamed from: e */
    int f60363e;
    /* renamed from: f */
    C19344n f60364f;

    C19344n() {
    }

    /* renamed from: a */
    static C19344n m69415a(C19344n c19344n, C19346p c19346p, C19346p c19346p2) {
        if (c19344n == null) {
            return null;
        }
        c19344n.f60364f = C19344n.m69415a(c19344n.f60364f, c19346p, c19346p2);
        int i = c19344n.f60359a.f60376c;
        int i2 = c19344n.f60360b.f60376c;
        int i3 = c19346p.f60376c;
        int i4 = c19346p2 == null ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : c19346p2.f60376c;
        if (i3 < i2 && i4 > i) {
            if (i3 <= i) {
                if (i4 >= i2) {
                    return c19344n.f60364f;
                }
                c19344n.f60359a = c19346p2;
                return c19344n;
            } else if (i4 >= i2) {
                c19344n.f60360b = c19346p;
                return c19344n;
            } else {
                C19344n c19344n2 = new C19344n();
                c19344n2.f60359a = c19346p2;
                c19344n2.f60360b = c19344n.f60360b;
                c19344n2.f60361c = c19344n.f60361c;
                c19344n2.f60362d = c19344n.f60362d;
                c19344n2.f60363e = c19344n.f60363e;
                c19344n2.f60364f = c19344n.f60364f;
                c19344n.f60360b = c19346p;
                c19344n.f60364f = c19344n2;
            }
        }
        return c19344n;
    }
}
