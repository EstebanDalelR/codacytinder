package com.google.android.m4b.maps.aa;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.aa.ae.C4539c;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class aa<E> extends AbstractCollection<E> implements Serializable {
    /* renamed from: a */
    private transient ae<E> f16851a;

    /* renamed from: com.google.android.m4b.maps.aa.aa$b */
    public static abstract class C4536b<E> {
        /* renamed from: b */
        public abstract C4536b<E> mo4774b(E e);

        /* renamed from: a */
        static int m20472a(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            i = (i + (i >> 1)) + 1;
            if (i < i2) {
                i = Integer.highestOneBit(i2 - 1) << 1;
            }
            return i < 0 ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i;
        }

        C4536b() {
        }

        /* renamed from: a */
        public C4536b<E> mo4773a(E... eArr) {
            for (Object b : eArr) {
                mo4774b(b);
            }
            return this;
        }

        /* renamed from: a */
        public C4536b<E> mo4772a(Iterable<? extends E> iterable) {
            for (Object b : iterable) {
                mo4774b(b);
            }
            return this;
        }

        /* renamed from: a */
        public C4536b<E> mo6980a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo4774b(it.next());
            }
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aa$a */
    static abstract class C6307a<E> extends C4536b<E> {
        /* renamed from: a */
        Object[] f23623a;
        /* renamed from: b */
        int f23624b = 0;

        /* renamed from: b */
        public /* synthetic */ C4536b mo4774b(Object obj) {
            return mo6979a(obj);
        }

        C6307a(int i) {
            C4583i.m20668a(i, "initialCapacity");
            this.f23623a = new Object[i];
        }

        /* renamed from: a */
        private void m27670a(int i) {
            if (this.f23623a.length < i) {
                this.f23623a = bb.m20640b(this.f23623a, C4536b.m20472a(this.f23623a.length, i));
            }
        }

        /* renamed from: a */
        public C6307a<E> mo6979a(E e) {
            C5571j.m24292a((Object) e);
            m27670a(this.f23624b + 1);
            Object[] objArr = this.f23623a;
            int i = this.f23624b;
            this.f23624b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: a */
        public C4536b<E> mo4773a(E... eArr) {
            bb.m20638a(eArr);
            m27670a(this.f23624b + eArr.length);
            System.arraycopy(eArr, 0, this.f23623a, this.f23624b, eArr.length);
            this.f23624b += eArr.length;
            return this;
        }

        /* renamed from: a */
        public C4536b<E> mo4772a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                m27670a(this.f23624b + ((Collection) iterable).size());
            }
            super.mo4772a((Iterable) iterable);
            return this;
        }
    }

    /* renamed from: a */
    public abstract bw<E> mo4785a();

    /* renamed from: d */
    abstract boolean mo4791d();

    public /* synthetic */ Iterator iterator() {
        return mo4785a();
    }

    aa() {
    }

    public final Object[] toArray() {
        if (size() == 0) {
            return bb.f16958a;
        }
        Object[] objArr = new Object[size()];
        mo4784a(objArr, 0);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        C5571j.m24292a((Object) tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = bb.m20639a((Object[]) tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo4784a(tArr, 0);
        return tArr;
    }

    public boolean contains(Object obj) {
        return (obj == null || super.contains(obj) == null) ? null : true;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public ae<E> mo4786b() {
        ae<E> aeVar = this.f16851a;
        if (aeVar != null) {
            return aeVar;
        }
        aeVar = mo4790c();
        this.f16851a = aeVar;
        return aeVar;
    }

    /* renamed from: c */
    ae<E> mo4790c() {
        switch (size()) {
            case 0:
                return ae.m27685e();
            case 1:
                return ae.m27680a(mo4785a().next());
            default:
                return new be(this, toArray());
        }
    }

    /* renamed from: a */
    int mo4784a(Object[] objArr, int i) {
        Iterator it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }

    Object writeReplace() {
        return new C4539c(toArray());
    }
}
