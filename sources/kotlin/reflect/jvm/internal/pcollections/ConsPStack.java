package kotlin.reflect.jvm.internal.pcollections;

import java.util.Iterator;

final class ConsPStack<E> implements Iterable<E> {
    private static final ConsPStack<Object> EMPTY = new ConsPStack();
    final E first;
    final ConsPStack<E> rest;
    private final int size;

    private static class Itr<E> implements Iterator<E> {
        private ConsPStack<E> next;

        public Itr(ConsPStack<E> consPStack) {
            this.next = consPStack;
        }

        public boolean hasNext() {
            return this.next.size > 0;
        }

        public E next() {
            E e = this.next.first;
            this.next = this.next.rest;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> ConsPStack<E> empty() {
        return EMPTY;
    }

    private ConsPStack() {
        this.size = 0;
        this.first = null;
        this.rest = null;
    }

    private ConsPStack(E e, ConsPStack<E> consPStack) {
        this.first = e;
        this.rest = consPStack;
        this.size = consPStack.size + 1;
    }

    public E get(int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        if (r4 < 0) goto L_0x0027;
    L_0x0002:
        r0 = r3.size;
        if (r4 <= r0) goto L_0x0007;
    L_0x0006:
        goto L_0x0027;
    L_0x0007:
        r0 = r3.iterator(r4);	 Catch:{ NoSuchElementException -> 0x0010 }
        r0 = r0.next();	 Catch:{ NoSuchElementException -> 0x0010 }
        return r0;
    L_0x0010:
        r0 = new java.lang.IndexOutOfBoundsException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Index: ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
    L_0x0027:
        r4 = new java.lang.IndexOutOfBoundsException;
        r4.<init>();
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.pcollections.ConsPStack.get(int):E");
    }

    public Iterator<E> iterator() {
        return iterator(0);
    }

    public int size() {
        return this.size;
    }

    private Iterator<E> iterator(int i) {
        return new Itr(subList(i));
    }

    public ConsPStack<E> plus(E e) {
        return new ConsPStack(e, this);
    }

    private ConsPStack<E> minus(Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.rest;
        }
        ConsPStack minus = this.rest.minus(obj);
        if (minus == this.rest) {
            return this;
        }
        return new ConsPStack(this.first, minus);
    }

    public ConsPStack<E> minus(int i) {
        return minus(get(i));
    }

    private ConsPStack<E> subList(int i) {
        if (i >= 0) {
            if (i <= this.size) {
                if (i == 0) {
                    return this;
                }
                return this.rest.subList(i - 1);
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
