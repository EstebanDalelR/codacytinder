package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

/* renamed from: de.greenrobot.event.g */
final class C15529g {
    /* renamed from: d */
    private static final List<C15529g> f47980d = new ArrayList();
    /* renamed from: a */
    Object f47981a;
    /* renamed from: b */
    C15534l f47982b;
    /* renamed from: c */
    C15529g f47983c;

    private C15529g(Object obj, C15534l c15534l) {
        this.f47981a = obj;
        this.f47982b = c15534l;
    }

    /* renamed from: a */
    static C15529g m58018a(C15534l c15534l, Object obj) {
        synchronized (f47980d) {
            int size = f47980d.size();
            if (size > 0) {
                C15529g c15529g = (C15529g) f47980d.remove(size - 1);
                c15529g.f47981a = obj;
                c15529g.f47982b = c15534l;
                c15529g.f47983c = null;
                return c15529g;
            }
            return new C15529g(obj, c15534l);
        }
    }

    /* renamed from: a */
    static void m58019a(C15529g c15529g) {
        c15529g.f47981a = null;
        c15529g.f47982b = null;
        c15529g.f47983c = null;
        synchronized (f47980d) {
            if (f47980d.size() < 10000) {
                f47980d.add(c15529g);
            }
        }
    }
}
