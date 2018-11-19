package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* renamed from: dagger.internal.c */
public final class C17281c<T> implements Lazy<T>, Provider<T> {
    /* renamed from: a */
    static final /* synthetic */ boolean f52953a = true;
    /* renamed from: b */
    private static final Object f52954b = new Object();
    /* renamed from: c */
    private volatile Provider<T> f52955c;
    /* renamed from: d */
    private volatile Object f52956d = f52954b;

    private C17281c(Provider<T> provider) {
        if (f52953a || provider != null) {
            this.f52955c = provider;
            return;
        }
        throw new AssertionError();
    }

    public T get() {
        T t = this.f52956d;
        if (t == f52954b) {
            synchronized (this) {
                t = this.f52956d;
                if (t == f52954b) {
                    t = this.f52955c.get();
                    this.f52956d = C17281c.m63228a(this.f52956d, t);
                    this.f52955c = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static Object m63228a(Object obj, Object obj2) {
        Object obj3 = (obj == f52954b || (obj instanceof C15520h)) ? null : 1;
        if (obj3 == null || obj == obj2) {
            return obj2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
        stringBuilder.append(obj);
        stringBuilder.append(" & ");
        stringBuilder.append(obj2);
        stringBuilder.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m63229a(P p) {
        C15521i.m58000a(p);
        if (p instanceof C17281c) {
            return p;
        }
        return new C17281c(p);
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Lazy<T> m63230b(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new C17281c((Provider) C15521i.m58000a(p));
    }
}
