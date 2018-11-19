package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.bl.C4816i.C4815b;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bl.e */
public abstract class C4809e {
    /* renamed from: a */
    protected final C4815b f17538a;
    /* renamed from: b */
    private boolean f17539b;

    /* renamed from: com.google.android.m4b.maps.bl.e$a */
    public enum C4808a {
        NO,
        MAYBE,
        YES
    }

    /* renamed from: a */
    protected abstract C4808a mo5071a(long j, LinkedList linkedList, List list);

    /* renamed from: b */
    public boolean mo5076b() {
        return false;
    }

    /* renamed from: b */
    protected abstract boolean mo5072b(C4816i c4816i);

    /* renamed from: c */
    public boolean mo5075c() {
        return false;
    }

    /* renamed from: d */
    protected abstract void mo5073d(C4816i c4816i);

    /* renamed from: d */
    public boolean mo5077d() {
        return false;
    }

    /* renamed from: f */
    protected abstract boolean mo5074f(C4816i c4816i);

    public C4809e(C4815b c4815b) {
        C5571j.m24292a((Object) c4815b);
        this.f17538a = c4815b;
    }

    /* renamed from: a */
    public final boolean m21317a() {
        return this.f17539b;
    }

    /* renamed from: a */
    public final C4808a m21316a(long j, LinkedList<C4812h> linkedList, boolean z, List<C4809e> list, StringBuilder stringBuilder) {
        if (mo5076b() != null && list.isEmpty() == null) {
            return C4808a.NO;
        }
        for (C4809e b : list) {
            if (b.mo5076b()) {
                boolean z2 = true;
                if (list.size() != 1) {
                    z2 = false;
                }
                C5571j.m24301b(z2);
                return C4808a.NO;
            }
        }
        if (z != mo5077d()) {
            return C4808a.NO;
        }
        return mo5071a(j, linkedList, list);
    }

    /* renamed from: a */
    public final boolean m21318a(C4816i c4816i) {
        if (this.f17539b) {
            String str = "Gesture already active: ";
            String valueOf = String.valueOf(getClass().getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        this.f17539b = mo5072b(c4816i);
        return this.f17539b;
    }

    /* renamed from: c */
    public final void m21321c(C4816i c4816i) {
        if (this.f17539b) {
            this.f17539b = false;
            mo5073d(c4816i);
            return;
        }
        String str = "Gesture already inactive: ";
        String valueOf = String.valueOf(getClass().getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: e */
    public final boolean m21325e(C4816i c4816i) {
        if (this.f17539b) {
            return mo5074f(c4816i);
        }
        String str = "Gesture is not active: ";
        String valueOf = String.valueOf(getClass().getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    protected static float m21314a(float f, float f2) {
        if (f2 >= f) {
            return Math.min(f2 - f, (float) ((((double) f) + 6.283185307179586d) - ((double) f2)));
        }
        return -C4809e.m21314a(f2, f);
    }
}
