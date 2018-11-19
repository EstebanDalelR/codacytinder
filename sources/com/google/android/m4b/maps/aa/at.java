package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5572k;
import com.google.android.m4b.maps.p125y.C5573l;
import com.google.android.m4b.maps.p125y.C6849f;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class at {
    /* renamed from: a */
    private static bx<Object> f16873a = new C74011();
    /* renamed from: b */
    private static final Iterator<Object> f16874b = new C45494();

    /* renamed from: com.google.android.m4b.maps.aa.at$4 */
    static class C45494 implements Iterator<Object> {
        public final boolean hasNext() {
            return false;
        }

        C45494() {
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            C5571j.m24302b(false, (Object) "no calls to next() since the last call to remove()");
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.at$a */
    static class C6317a<E> implements bd<E> {
        /* renamed from: a */
        private final Iterator<? extends E> f23642a;
        /* renamed from: b */
        private boolean f23643b;
        /* renamed from: c */
        private E f23644c;

        public C6317a(Iterator<? extends E> it) {
            this.f23642a = (Iterator) C5571j.m24292a((Object) it);
        }

        public final boolean hasNext() {
            if (!this.f23643b) {
                if (!this.f23642a.hasNext()) {
                    return false;
                }
            }
            return true;
        }

        public final E next() {
            if (!this.f23643b) {
                return this.f23642a.next();
            }
            E e = this.f23644c;
            this.f23643b = false;
            this.f23644c = null;
            return e;
        }

        public final void remove() {
            C5571j.m24302b(this.f23643b ^ 1, (Object) "Can't remove after you've peeked at next");
            this.f23642a.remove();
        }

        /* renamed from: a */
        public final E mo4798a() {
            if (!this.f23643b) {
                this.f23644c = this.f23642a.next();
                this.f23643b = true;
            }
            return this.f23644c;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.at$1 */
    static class C74011 extends bx<Object> {
        public final boolean hasNext() {
            return false;
        }

        public final boolean hasPrevious() {
            return false;
        }

        public final int nextIndex() {
            return 0;
        }

        public final int previousIndex() {
            return -1;
        }

        C74011() {
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final Object previous() {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static <T> bw<T> m20507a(final Iterator<T> it) {
        C5571j.m24292a((Object) it);
        if (it instanceof bw) {
            return (bw) it;
        }
        return new bw<T>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final T next() {
                return it.next();
            }
        };
    }

    /* renamed from: a */
    public static boolean m20513a(Iterator<?> it, Object obj) {
        obj = C5573l.m24306a(obj);
        C5571j.m24293a(obj, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (obj.mo5815a(it.next())) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m20514a(Iterator<?> it, Collection<?> collection) {
        Object a = C5573l.m24307a((Collection) collection);
        C5571j.m24292a(a);
        boolean z = false;
        while (it.hasNext()) {
            if (a.mo5815a(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m20515a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!C5569h.m24284a(it.next(), it2.next())) {
                return false;
            }
        }
        if (it2.hasNext() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m20516b(Iterator<?> it) {
        it = C4584j.f16988a.m24272a(new StringBuilder("["), it);
        it.append(']');
        return it.toString();
    }

    /* renamed from: c */
    public static <T> T m20517c(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("expected one element but was: <");
        stringBuilder2.append(next);
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            stringBuilder2 = new StringBuilder(", ");
            stringBuilder2.append(it.next());
            stringBuilder.append(stringBuilder2.toString());
        }
        if (it.hasNext() != null) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static <T> boolean m20512a(Collection<T> collection, Iterator<? extends T> it) {
        C5571j.m24292a((Object) collection);
        C5571j.m24292a((Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static <T> bw<T> m20508a(final Iterator<T> it, final C5572k<? super T> c5572k) {
        C5571j.m24292a((Object) it);
        C5571j.m24292a((Object) c5572k);
        return new C6348b<T>() {
            /* renamed from: a */
            protected final T mo7000a() {
                while (it.hasNext()) {
                    T next = it.next();
                    if (c5572k.mo5815a(next)) {
                        return next;
                    }
                }
                return m27817b();
            }
        };
    }

    /* renamed from: a */
    public static <F, T> Iterator<T> m20511a(Iterator<F> it, final C6849f<? super F, ? extends T> c6849f) {
        C5571j.m24292a((Object) c6849f);
        return new bv<F, T>(it) {
            /* renamed from: a */
            final T mo4797a(F f) {
                return c6849f.mo7022a(f);
            }
        };
    }

    /* renamed from: d */
    static void m20518d(Iterator<?> it) {
        C5571j.m24292a((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    public static <T> bw<T> m20509a(T... tArr) {
        return m20510a(tArr, 0, tArr.length, 0);
    }

    /* renamed from: a */
    static <T> bx<T> m20510a(final T[] tArr, final int i, int i2, int i3) {
        C5571j.m24297a(i2 >= 0);
        C5571j.m24296a(i, i + i2, tArr.length);
        C5571j.m24300b(i3, i2);
        if (i2 == 0) {
            return f16873a;
        }
        return new C7395a<T>(i2, i3) {
            /* renamed from: a */
            protected final T mo7519a(int i) {
                return tArr[i + i];
            }
        };
    }

    /* renamed from: a */
    public static <T> bw<T> m20506a(final T t) {
        return new bw<T>() {
            /* renamed from: a */
            private boolean f23638a;

            public final boolean hasNext() {
                return !this.f23638a;
            }

            public final T next() {
                if (this.f23638a) {
                    throw new NoSuchElementException();
                }
                this.f23638a = true;
                return t;
            }
        };
    }

    /* renamed from: e */
    public static <T> bd<T> m20519e(Iterator<? extends T> it) {
        if (it instanceof C6317a) {
            return (C6317a) it;
        }
        return new C6317a(it);
    }

    /* renamed from: a */
    public static <T> bw<T> m20505a() {
        return f16873a;
    }
}
