package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.ag.C4609a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class au {

    /* renamed from: com.google.android.m4b.maps.aa.au$b */
    static class C4551b<T> extends AbstractList<T> {
        /* renamed from: a */
        private final List<T> f16878a;

        C4551b(List<T> list) {
            this.f16878a = (List) C5571j.m24292a((Object) list);
        }

        /* renamed from: a */
        final List<T> m20523a() {
            return this.f16878a;
        }

        /* renamed from: a */
        private int m20520a(int i) {
            int size = size();
            C5571j.m24291a(i, size);
            return (size - 1) - i;
        }

        /* renamed from: b */
        private int m20522b(int i) {
            int size = size();
            C5571j.m24300b(i, size);
            return size - i;
        }

        public void add(int i, T t) {
            this.f16878a.add(m20522b(i), t);
        }

        public void clear() {
            this.f16878a.clear();
        }

        public T remove(int i) {
            return this.f16878a.remove(m20520a(i));
        }

        protected void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        public T set(int i, T t) {
            return this.f16878a.set(m20520a(i), t);
        }

        public T get(int i) {
            return this.f16878a.get(m20520a(i));
        }

        public int size() {
            return this.f16878a.size();
        }

        public List<T> subList(int i, int i2) {
            C5571j.m24296a(i, i2, size());
            return au.m20528a(this.f16878a.subList(m20522b(i2), m20522b(i)));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            i = this.f16878a.listIterator(m20522b(i));
            return new ListIterator<T>(this) {
                /* renamed from: a */
                private boolean f16875a;
                /* renamed from: c */
                private /* synthetic */ C4551b f16877c;

                public final void add(T t) {
                    i.add(t);
                    i.previous();
                    this.f16875a = null;
                }

                public final boolean hasNext() {
                    return i.hasPrevious();
                }

                public final boolean hasPrevious() {
                    return i.hasNext();
                }

                public final T next() {
                    if (hasNext()) {
                        this.f16875a = true;
                        return i.previous();
                    }
                    throw new NoSuchElementException();
                }

                public final int nextIndex() {
                    return this.f16877c.m20522b(i.nextIndex());
                }

                public final T previous() {
                    if (hasPrevious()) {
                        this.f16875a = true;
                        return i.next();
                    }
                    throw new NoSuchElementException();
                }

                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                public final void remove() {
                    C5571j.m24302b(this.f16875a, (Object) "no calls to next() since the last call to remove()");
                    i.remove();
                    this.f16875a = false;
                }

                public final void set(T t) {
                    C5571j.m24301b(this.f16875a);
                    i.set(t);
                }
            };
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.au$a */
    static class C6318a<T> extends C4551b<T> implements RandomAccess {
        C6318a(List<T> list) {
            super(list);
        }
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m20527a(E... eArr) {
        C5571j.m24292a((Object) eArr);
        Object arrayList = new ArrayList(m20531c(1));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    /* renamed from: c */
    private static int m20531c(int i) {
        C4583i.m20668a(i, "arraySize");
        return C4609a.m20698a((((long) i) + 5) + ((long) (i / 10)));
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m20525a(Iterable<? extends E> iterable) {
        C5571j.m24292a((Object) iterable);
        return iterable instanceof Collection ? new ArrayList(C4584j.m20671a((Iterable) iterable)) : m20526a(iterable.iterator());
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m20524a(int i) {
        C4583i.m20668a(i, "initialArraySize");
        return new ArrayList(i);
    }

    /* renamed from: b */
    public static <E> ArrayList<E> m20529b(int i) {
        return new ArrayList(m20531c(i));
    }

    /* renamed from: a */
    public static <T> List<T> m20528a(List<T> list) {
        if (list instanceof ae) {
            return ((ae) list).mo6982f();
        }
        if (list instanceof C4551b) {
            return ((C4551b) list).m20523a();
        }
        if (list instanceof RandomAccess) {
            return new C6318a(list);
        }
        return new C4551b(list);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m20526a(Iterator<? extends E> it) {
        Collection arrayList = new ArrayList();
        at.m20512a(arrayList, (Iterator) it);
        return arrayList;
    }

    /* renamed from: b */
    public static <E> LinkedList<E> m20530b(Iterable<? extends E> iterable) {
        Collection linkedList = new LinkedList();
        as.m20503a(linkedList, (Iterable) iterable);
        return linkedList;
    }
}
