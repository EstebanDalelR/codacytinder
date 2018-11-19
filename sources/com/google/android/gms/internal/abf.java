package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class abf implements Iterator {
    /* renamed from: a */
    private int f14979a = 0;
    /* renamed from: b */
    private final int f14980b = this.f14981c.mo6930a();
    /* renamed from: c */
    private /* synthetic */ zzfes f14981c;

    abf(zzfes zzfes) {
        this.f14981c = zzfes;
    }

    /* renamed from: a */
    private final byte m18812a() {
        try {
            zzfes zzfes = this.f14981c;
            int i = this.f14979a;
            this.f14979a = i + 1;
            return zzfes.mo6929a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f14979a < this.f14980b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m18812a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
