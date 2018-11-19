package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.p125y.C5569h;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class ag implements Comparable<ag> {
    /* renamed from: a */
    private final C6561r f18407a;
    /* renamed from: b */
    private final C4984a f18408b;
    /* renamed from: c */
    private final Map<C4699a, ah> f18409c;
    /* renamed from: d */
    private final Map<C4699a, ah> f18410d;
    /* renamed from: e */
    private boolean f18411e;
    /* renamed from: f */
    private boolean f18412f;

    /* renamed from: com.google.android.m4b.maps.bx.ag$a */
    public enum C4984a {
        BASE,
        DROP_SHADOWS_OUTER,
        ELEVATED_COLOR,
        UNDERGROUND_MODE_MASK,
        UNDERGROUND_STENCIL,
        UNDERGROUND_COLOR,
        DROP_SHADOWS_INNER,
        ANIMATED_ELEVATED_COLOR,
        DEFAULT
    }

    public final /* synthetic */ int compareTo(Object obj) {
        ag agVar = (ag) obj;
        int compareTo = this.f18408b.compareTo(agVar.f18408b);
        if (compareTo != 0) {
            return compareTo;
        }
        C6561r c6561r = this.f18407a;
        C6561r c6561r2 = agVar.f18407a;
        if (!(c6561r == null || c6561r2 == null)) {
            compareTo = c6561r.mo7046d().ordinal() - c6561r2.mo7046d().ordinal();
        }
        return (compareTo != 0 || this.f18409c.isEmpty() || agVar.f18409c.isEmpty()) ? compareTo : ((ah) Collections.max(this.f18409c.values())).compareTo((ah) Collections.max(agVar.f18409c.values()));
    }

    public ag(C6561r c6561r, C4984a c4984a, ah... ahVarArr) {
        this.f18409c = ax.m20623b();
        this.f18410d = ax.m20623b();
        int i = 0;
        this.f18411e = false;
        this.f18412f = false;
        this.f18407a = c6561r;
        this.f18408b = c4984a;
        c6561r = ahVarArr.length;
        while (i < c6561r) {
            c4984a = ahVarArr[i];
            for (C4699a put : c4984a.mo5086a()) {
                this.f18409c.put(put, c4984a);
            }
            i++;
        }
    }

    public ag(C6561r c6561r, C4984a c4984a, Collection<ah> collection, Collection<ah> collection2) {
        this.f18409c = ax.m20623b();
        this.f18410d = ax.m20623b();
        this.f18411e = false;
        this.f18412f = false;
        this.f18407a = c6561r;
        this.f18408b = c4984a;
        for (ah ahVar : collection) {
            collection = ahVar.mo5086a().iterator();
            while (collection.hasNext()) {
                this.f18409c.put((C4699a) collection.next(), ahVar);
            }
        }
        for (ah ahVar2 : collection2) {
            collection = ahVar2.mo5086a().iterator();
            while (collection.hasNext() != null) {
                this.f18410d.put((C4699a) collection.next(), ahVar2);
            }
        }
    }

    /* renamed from: a */
    public final C6561r m22297a() {
        return this.f18407a;
    }

    /* renamed from: b */
    public final C4984a m22299b() {
        return this.f18408b;
    }

    /* renamed from: c */
    public final boolean m22302c() {
        if (!(this.f18408b == C4984a.BASE || this.f18408b == C4984a.ELEVATED_COLOR || this.f18408b == C4984a.ANIMATED_ELEVATED_COLOR || this.f18408b == C4984a.UNDERGROUND_COLOR)) {
            if (this.f18408b != C4984a.DEFAULT) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m22303d() {
        if (this.f18408b != C4984a.DROP_SHADOWS_INNER) {
            if (this.f18408b != C4984a.DROP_SHADOWS_OUTER) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m22304e() {
        return this.f18408b == C4984a.UNDERGROUND_STENCIL;
    }

    /* renamed from: a */
    public final ah m22296a(C4699a c4699a) {
        return (ah) this.f18409c.get(c4699a);
    }

    /* renamed from: b */
    public final ah m22300b(C4699a c4699a) {
        return (ah) this.f18410d.get(c4699a);
    }

    /* renamed from: a */
    public final void m22298a(boolean z) {
        this.f18411e = z;
    }

    /* renamed from: b */
    public final void m22301b(boolean z) {
        this.f18412f = z;
    }

    /* renamed from: f */
    public final boolean m22305f() {
        return this.f18411e;
    }

    /* renamed from: g */
    public final boolean m22306g() {
        return this.f18412f;
    }

    public final String toString() {
        return C5569h.m24283a(this).m24281a("overlay", this.f18407a).m24281a("order", this.f18408b).m24282a("isFirstPassForOverlay", this.f18411e).m24282a("isLastPassForOverlay", this.f18412f).m24281a("overlayRenderTweaks", this.f18409c).m24281a("featureRenderTweaks", this.f18410d).toString();
    }
}
