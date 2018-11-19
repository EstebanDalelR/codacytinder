package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.m4b.maps.aa.b */
public abstract class C6348b<T> extends bw<T> {
    /* renamed from: a */
    private C4570a f23675a = C4570a.NOT_READY;
    /* renamed from: b */
    private T f23676b;

    /* renamed from: com.google.android.m4b.maps.aa.b$a */
    enum C4570a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    protected abstract T mo7000a();

    protected C6348b() {
    }

    /* renamed from: b */
    protected final T m27817b() {
        this.f23675a = C4570a.DONE;
        return null;
    }

    public final boolean hasNext() {
        C5571j.m24301b(this.f23675a != C4570a.FAILED);
        switch (this.f23675a) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                this.f23675a = C4570a.FAILED;
                this.f23676b = mo7000a();
                if (this.f23675a == C4570a.DONE) {
                    return false;
                }
                this.f23675a = C4570a.READY;
                return true;
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f23675a = C4570a.NOT_READY;
            T t = this.f23676b;
            this.f23676b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
