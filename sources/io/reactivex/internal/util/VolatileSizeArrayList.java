package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;
    /* renamed from: a */
    final ArrayList<T> f48659a = new ArrayList();

    public int size() {
        return get();
    }

    public boolean isEmpty() {
        return get() == 0;
    }

    public boolean contains(Object obj) {
        return this.f48659a.contains(obj);
    }

    public Iterator<T> iterator() {
        return this.f48659a.iterator();
    }

    public Object[] toArray() {
        return this.f48659a.toArray();
    }

    public <E> E[] toArray(E[] eArr) {
        return this.f48659a.toArray(eArr);
    }

    public boolean add(T t) {
        t = this.f48659a.add(t);
        lazySet(this.f48659a.size());
        return t;
    }

    public boolean remove(Object obj) {
        obj = this.f48659a.remove(obj);
        lazySet(this.f48659a.size());
        return obj;
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f48659a.containsAll(collection);
    }

    public boolean addAll(Collection<? extends T> collection) {
        collection = this.f48659a.addAll(collection);
        lazySet(this.f48659a.size());
        return collection;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        i = this.f48659a.addAll(i, collection);
        lazySet(this.f48659a.size());
        return i;
    }

    public boolean removeAll(Collection<?> collection) {
        collection = this.f48659a.removeAll(collection);
        lazySet(this.f48659a.size());
        return collection;
    }

    public boolean retainAll(Collection<?> collection) {
        collection = this.f48659a.retainAll(collection);
        lazySet(this.f48659a.size());
        return collection;
    }

    public void clear() {
        this.f48659a.clear();
        lazySet(0);
    }

    public T get(int i) {
        return this.f48659a.get(i);
    }

    public T set(int i, T t) {
        return this.f48659a.set(i, t);
    }

    public void add(int i, T t) {
        this.f48659a.add(i, t);
        lazySet(this.f48659a.size());
    }

    public T remove(int i) {
        i = this.f48659a.remove(i);
        lazySet(this.f48659a.size());
        return i;
    }

    public int indexOf(Object obj) {
        return this.f48659a.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.f48659a.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.f48659a.listIterator();
    }

    public ListIterator<T> listIterator(int i) {
        return this.f48659a.listIterator(i);
    }

    public List<T> subList(int i, int i2) {
        return this.f48659a.subList(i, i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof VolatileSizeArrayList) {
            return this.f48659a.equals(((VolatileSizeArrayList) obj).f48659a);
        }
        return this.f48659a.equals(obj);
    }

    public int hashCode() {
        return this.f48659a.hashCode();
    }

    public String toString() {
        return this.f48659a.toString();
    }
}
