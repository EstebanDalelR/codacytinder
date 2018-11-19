package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.aa.C4536b;
import com.google.android.m4b.maps.aa.aa.C6307a;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ae<E> extends aa<E> implements List<E>, RandomAccess {
    /* renamed from: a */
    private static final ae<Object> f23630a = new bg(bb.f16958a);

    /* renamed from: com.google.android.m4b.maps.aa.ae$c */
    static class C4539c implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private Object[] f16854a;

        C4539c(Object[] objArr) {
            this.f16854a = objArr;
        }

        final Object readResolve() {
            return ae.m27682a(this.f16854a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ae$a */
    public static final class C7397a<E> extends C6307a<E> {
        public C7397a() {
            this(4);
        }

        private C7397a(int i) {
            super(4);
        }

        /* renamed from: c */
        public final C7397a<E> m31831c(E e) {
            super.mo6979a((Object) e);
            return this;
        }

        /* renamed from: b */
        public final C7397a<E> m31830b(Iterable<? extends E> iterable) {
            super.mo4772a((Iterable) iterable);
            return this;
        }

        /* renamed from: a */
        public final ae<E> m31828a() {
            return ae.m27684b(this.a, this.b);
        }

        /* renamed from: a */
        public final /* synthetic */ C4536b mo4772a(Iterable iterable) {
            super.mo4772a(iterable);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4536b mo4773a(Object[] objArr) {
            super.mo4773a(objArr);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C6307a mo6979a(Object obj) {
            super.mo6979a(obj);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4536b mo6980a(Iterator it) {
            super.mo6980a(it);
            return this;
        }

        /* renamed from: b */
        public final /* synthetic */ C4536b mo4774b(Object obj) {
            super.mo6979a(obj);
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ae$b */
    static class C7398b<E> extends ae<E> {
        /* renamed from: a */
        private final transient ae<E> f27143a;

        public final /* synthetic */ Iterator iterator() {
            return super.mo4785a();
        }

        public final /* synthetic */ ListIterator listIterator(int i) {
            return super.mo7003a(i);
        }

        public final /* synthetic */ List subList(int i, int i2) {
            return mo6981a(i, i2);
        }

        C7398b(ae<E> aeVar) {
            this.f27143a = aeVar;
        }

        /* renamed from: b */
        private int m31832b(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: f */
        public final ae<E> mo6982f() {
            return this.f27143a;
        }

        public final boolean contains(Object obj) {
            return this.f27143a.contains(obj);
        }

        public final int indexOf(Object obj) {
            obj = this.f27143a.lastIndexOf(obj);
            return obj >= null ? m31832b(obj) : -1;
        }

        public final int lastIndexOf(Object obj) {
            obj = this.f27143a.indexOf(obj);
            return obj >= null ? m31832b(obj) : -1;
        }

        /* renamed from: a */
        public final ae<E> mo6981a(int i, int i2) {
            C5571j.m24296a(i, i2, size());
            return this.f27143a.mo6981a(size() - i2, size() - i).mo6982f();
        }

        public final E get(int i) {
            C5571j.m24291a(i, size());
            return this.f27143a.get(m31832b(i));
        }

        public final int size() {
            return this.f27143a.size();
        }

        /* renamed from: d */
        final boolean mo4791d() {
            return this.f27143a.mo4791d();
        }

        public final /* synthetic */ ListIterator listIterator() {
            return mo7003a(0);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ae$d */
    class C7399d extends ae<E> {
        /* renamed from: a */
        private transient int f27144a;
        /* renamed from: b */
        private transient int f27145b;
        /* renamed from: c */
        private /* synthetic */ ae f27146c;

        /* renamed from: d */
        final boolean mo4791d() {
            return true;
        }

        public final /* synthetic */ Iterator iterator() {
            return super.mo4785a();
        }

        public final /* synthetic */ ListIterator listIterator(int i) {
            return super.mo7003a(i);
        }

        public final /* synthetic */ List subList(int i, int i2) {
            return mo6981a(i, i2);
        }

        C7399d(ae aeVar, int i, int i2) {
            this.f27146c = aeVar;
            this.f27144a = i;
            this.f27145b = i2;
        }

        public final int size() {
            return this.f27145b;
        }

        public final E get(int i) {
            C5571j.m24291a(i, this.f27145b);
            return this.f27146c.get(i + this.f27144a);
        }

        /* renamed from: a */
        public final ae<E> mo6981a(int i, int i2) {
            C5571j.m24296a(i, i2, this.f27145b);
            return this.f27146c.mo6981a(i + this.f27144a, i2 + this.f27144a);
        }

        public final /* synthetic */ ListIterator listIterator() {
            return mo7003a(0);
        }
    }

    /* renamed from: b */
    public final ae<E> mo4786b() {
        return this;
    }

    public /* synthetic */ Iterator iterator() {
        return mo4785a();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return mo7003a(i);
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo6981a(i, i2);
    }

    /* renamed from: e */
    public static <E> ae<E> m27685e() {
        return f23630a;
    }

    /* renamed from: a */
    public static <E> ae<E> m27680a(E e) {
        return new bq(e);
    }

    /* renamed from: a */
    public static <E> ae<E> m27681a(Collection<? extends E> collection) {
        if (collection instanceof aa) {
            collection = ((aa) collection).mo4786b();
            if (collection.mo4791d()) {
                Object[] toArray = collection.toArray();
                collection = m27684b(toArray, toArray.length);
            }
            return collection;
        }
        toArray = bb.m20638a(collection.toArray());
        return m27684b(toArray, toArray.length);
    }

    /* renamed from: a */
    public static <E> ae<E> m27682a(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return f23630a;
            case 1:
                return new bq(eArr[0]);
            default:
                return new bg(bb.m20638a((Object[]) eArr.clone()));
        }
    }

    /* renamed from: b */
    static <E> ae<E> m27683b(Object[] objArr) {
        return m27684b(objArr, objArr.length);
    }

    /* renamed from: b */
    static <E> ae<E> m27684b(Object[] objArr, int i) {
        switch (i) {
            case 0:
                return f23630a;
            case 1:
                return new bq(objArr[0]);
            default:
                if (i < objArr.length) {
                    objArr = bb.m20640b(objArr, i);
                }
                return new bg(objArr);
        }
    }

    ae() {
    }

    /* renamed from: a */
    public bx<E> mo7003a(int i) {
        return new C7395a<E>(this, size(), i) {
            /* renamed from: a */
            private /* synthetic */ ae f28832a;

            /* renamed from: a */
            protected final E mo7519a(int i) {
                return this.f28832a.get(i);
            }
        };
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= null ? true : null;
    }

    /* renamed from: a */
    public ae<E> mo6981a(int i, int i2) {
        C5571j.m24296a(i, i2, size());
        switch (i2 - i) {
            case 0:
                return f23630a;
            case 1:
                return m27680a(get(i));
            default:
                return mo7004b(i, i2);
        }
    }

    /* renamed from: b */
    ae<E> mo7004b(int i, int i2) {
        return new C7399d(this, i, i2 - i);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    int mo4784a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: f */
    public ae<E> mo6982f() {
        return new C7398b(this);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new C4539c(toArray());
    }

    /* renamed from: g */
    public static <E> C7397a<E> m27686g() {
        return new C7397a();
    }

    /* renamed from: a */
    public bw<E> mo4785a() {
        return mo7003a(0);
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            ListIterator listIterator = listIterator();
            while (listIterator.hasNext()) {
                if (C5569h.m24284a(obj, listIterator.next())) {
                    return listIterator.previousIndex();
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (C5569h.m24284a(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == C5571j.m24292a((Object) this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (size() == list.size() && at.m20515a(iterator(), list.iterator()) != null) {
                return true;
            }
        }
        return null;
    }

    public /* synthetic */ ListIterator listIterator() {
        return mo7003a(0);
    }
}
