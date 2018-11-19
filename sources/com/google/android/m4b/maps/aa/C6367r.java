package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.aa.r */
public abstract class C6367r<E> extends C4586u implements Collection<E> {
    /* renamed from: a */
    protected abstract Collection<E> mo7018a();

    /* renamed from: c */
    protected /* synthetic */ Object mo4837c() {
        return mo7018a();
    }

    protected C6367r() {
    }

    public Iterator<E> iterator() {
        return mo7018a().iterator();
    }

    public int size() {
        return mo7018a().size();
    }

    public boolean removeAll(Collection<?> collection) {
        return mo7018a().removeAll(collection);
    }

    public boolean isEmpty() {
        return mo7018a().isEmpty();
    }

    public boolean contains(Object obj) {
        return mo7018a().contains(obj);
    }

    public boolean add(E e) {
        return mo7018a().add(e);
    }

    public boolean remove(Object obj) {
        return mo7018a().remove(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return mo7018a().containsAll(collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return mo7018a().addAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return mo7018a().retainAll(collection);
    }

    public void clear() {
        mo7018a().clear();
    }

    public Object[] toArray() {
        return mo7018a().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return mo7018a().toArray(tArr);
    }
}
