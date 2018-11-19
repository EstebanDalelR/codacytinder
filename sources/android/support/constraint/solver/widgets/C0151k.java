package android.support.constraint.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.solver.widgets.k */
public class C0151k {
    /* renamed from: h */
    HashSet<C0151k> f550h = new HashSet(2);
    /* renamed from: i */
    int f551i = 0;

    /* renamed from: a */
    public void mo158a() {
    }

    /* renamed from: a */
    public void m569a(C0151k c0151k) {
        this.f550h.add(c0151k);
    }

    /* renamed from: b */
    public void mo159b() {
        this.f551i = 0;
        this.f550h.clear();
    }

    /* renamed from: e */
    public void m571e() {
        this.f551i = 0;
        Iterator it = this.f550h.iterator();
        while (it.hasNext()) {
            ((C0151k) it.next()).m571e();
        }
    }

    /* renamed from: f */
    public void m572f() {
        this.f551i = 1;
        Iterator it = this.f550h.iterator();
        while (it.hasNext()) {
            ((C0151k) it.next()).mo158a();
        }
    }

    /* renamed from: g */
    public boolean m573g() {
        return this.f551i == 1;
    }
}
