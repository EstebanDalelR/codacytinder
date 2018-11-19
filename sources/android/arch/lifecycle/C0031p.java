package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.p */
public class C0031p {
    /* renamed from: a */
    private final HashMap<String, C0029n> f61a = new HashMap();

    /* renamed from: a */
    final void m133a(String str, C0029n c0029n) {
        C0029n c0029n2 = (C0029n) this.f61a.put(str, c0029n);
        if (c0029n2 != null) {
            c0029n2.mo391a();
        }
    }

    /* renamed from: a */
    final C0029n m131a(String str) {
        return (C0029n) this.f61a.get(str);
    }

    /* renamed from: a */
    public final void m132a() {
        for (C0029n a : this.f61a.values()) {
            a.mo391a();
        }
        this.f61a.clear();
    }
}
