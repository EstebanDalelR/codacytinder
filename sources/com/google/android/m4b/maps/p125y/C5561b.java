package com.google.android.m4b.maps.p125y;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.m4b.maps.y.b */
abstract class C5561b<T> implements Iterator<T> {
    /* renamed from: a */
    private C5560a f20555a = C5560a.NOT_READY;
    /* renamed from: b */
    private T f20556b;

    /* renamed from: com.google.android.m4b.maps.y.b$a */
    enum C5560a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    protected abstract T mo5822a();

    protected C5561b() {
    }

    /* renamed from: b */
    protected final T m24255b() {
        this.f20555a = C5560a.DONE;
        return null;
    }

    public final boolean hasNext() {
        C5571j.m24301b(this.f20555a != C5560a.FAILED);
        switch (this.f20555a) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                this.f20555a = C5560a.FAILED;
                this.f20556b = mo5822a();
                if (this.f20555a == C5560a.DONE) {
                    return false;
                }
                this.f20555a = C5560a.READY;
                return true;
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f20555a = C5560a.NOT_READY;
            T t = this.f20556b;
            this.f20556b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
