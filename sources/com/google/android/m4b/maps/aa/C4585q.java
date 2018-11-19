package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5572k;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.aa.q */
public abstract class C4585q<E> implements Iterable<E> {
    /* renamed from: a */
    private final Iterable<E> f16989a;

    protected C4585q() {
        this.f16989a = this;
    }

    C4585q(Iterable<E> iterable) {
        this.f16989a = (Iterable) C5571j.m24292a((Object) iterable);
    }

    /* renamed from: a */
    public static <E> C4585q<E> m20673a(final Iterable<E> iterable) {
        return iterable instanceof C4585q ? (C4585q) iterable : new C4585q<E>(iterable) {
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public String toString() {
        return at.m20516b(this.f16989a.iterator());
    }

    /* renamed from: a */
    public final C4585q<E> m20675a(C5572k<? super E> c5572k) {
        return C4585q.m20673a(as.m20501a(this.f16989a, (C5572k) c5572k));
    }

    /* renamed from: a */
    public final al<E> m20674a() {
        return al.m27699a(this.f16989a);
    }
}
