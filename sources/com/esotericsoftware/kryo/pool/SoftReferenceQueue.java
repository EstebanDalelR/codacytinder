package com.esotericsoftware.kryo.pool;

import com.esotericsoftware.kryo.Kryo;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

class SoftReferenceQueue implements Queue<Kryo> {
    private Queue<SoftReference<Kryo>> delegate;

    public SoftReferenceQueue(Queue<?> queue) {
        this.delegate = queue;
    }

    public Kryo poll() {
        Kryo kryo;
        do {
            SoftReference softReference = (SoftReference) this.delegate.poll();
            if (softReference == null) {
                return null;
            }
            kryo = (Kryo) softReference.get();
        } while (kryo == null);
        return kryo;
    }

    public boolean offer(Kryo kryo) {
        return this.delegate.offer(new SoftReference(kryo));
    }

    public boolean add(Kryo kryo) {
        return this.delegate.add(new SoftReference(kryo));
    }

    public int size() {
        return this.delegate.size();
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    public void clear() {
        this.delegate.clear();
    }

    public boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    public Iterator<Kryo> iterator() {
        throw new UnsupportedOperationException();
    }

    public Kryo remove() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public Kryo element() {
        throw new UnsupportedOperationException();
    }

    public Kryo peek() {
        throw new UnsupportedOperationException();
    }

    public <T> T[] toArray(T[] tArr) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Kryo> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
}
