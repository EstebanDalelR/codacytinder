package com.google.android.gms.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zs extends WeakReference<Throwable> {
    /* renamed from: a */
    private final int f16676a;

    public zs(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f16676a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zs zsVar = (zs) obj;
        return this.f16676a == zsVar.f16676a && get() == zsVar.get();
    }

    public final int hashCode() {
        return this.f16676a;
    }
}
