package com.tinder.photooptimizer;

import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bk;
import javax.inject.Inject;

/* renamed from: com.tinder.photooptimizer.a */
public class C10110a {
    /* renamed from: a */
    private final ManagerProfile f33071a;
    /* renamed from: b */
    private final bk f33072b;

    @Inject
    public C10110a(ManagerProfile managerProfile, bk bkVar) {
        this.f33071a = managerProfile;
        this.f33072b = bkVar;
    }

    /* renamed from: a */
    public void m41299a(boolean z, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        this.f33071a.e(z, listenerUpdateProfileInfo);
    }

    /* renamed from: a */
    public void m41298a(boolean z) {
        this.f33072b.x(z);
    }

    /* renamed from: a */
    public boolean m41300a() {
        return this.f33072b.S();
    }

    /* renamed from: b */
    public boolean m41301b() {
        return this.f33072b.f();
    }

    /* renamed from: c */
    public int m41302c() {
        boolean a = m41300a();
        boolean b = m41301b();
        if (!a || b) {
            return (a && b) ? 2 : 0;
        } else {
            return 1;
        }
    }
}
