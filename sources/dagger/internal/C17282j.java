package dagger.internal;

import java.lang.ref.WeakReference;
import javax.inject.Provider;

@GwtIncompatible
/* renamed from: dagger.internal.j */
public final class C17282j<T> implements Provider<T> {
    /* renamed from: a */
    static final /* synthetic */ boolean f52957a = true;
    /* renamed from: b */
    private static final Object f52958b = new Object();
    /* renamed from: c */
    private final Provider<T> f52959c;
    /* renamed from: d */
    private volatile Object f52960d;
    /* renamed from: e */
    private volatile WeakReference<T> f52961e;

    /* renamed from: a */
    public void m63232a() {
        Object obj = this.f52960d;
        if (obj != null && obj != f52958b) {
            synchronized (this) {
                this.f52961e = new WeakReference(obj);
                this.f52960d = null;
            }
        }
    }

    /* renamed from: b */
    public void m63233b() {
        Object obj = this.f52960d;
        if (this.f52961e != null && obj == null) {
            synchronized (this) {
                obj = this.f52960d;
                if (this.f52961e != null && obj == null) {
                    obj = this.f52961e.get();
                    if (obj != null) {
                        this.f52960d = obj;
                        this.f52961e = null;
                    }
                }
            }
        }
    }

    public T get() {
        T c = m63231c();
        if (c == null) {
            synchronized (this) {
                c = m63231c();
                if (c == null) {
                    c = this.f52959c.get();
                    if (c == null) {
                        c = f52958b;
                    }
                    this.f52960d = c;
                }
            }
        }
        return c == f52958b ? null : c;
    }

    /* renamed from: c */
    private Object m63231c() {
        Object obj = this.f52960d;
        if (obj != null) {
            return obj;
        }
        return this.f52961e != null ? this.f52961e.get() : null;
    }
}
