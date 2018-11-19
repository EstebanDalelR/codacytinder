package io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DependencyPriorityBlockingQueue<E extends Dependency & Task & PriorityProvider> extends PriorityBlockingQueue<E> {
    /* renamed from: a */
    final Queue<E> f48405a = new LinkedList();
    /* renamed from: b */
    private final ReentrantLock f48406b = new ReentrantLock();

    public /* synthetic */ Object peek() {
        return m58733b();
    }

    public /* synthetic */ Object poll() {
        return m58735c();
    }

    public /* synthetic */ Object poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return m58729a(j, timeUnit);
    }

    public /* synthetic */ Object take() throws InterruptedException {
        return m58727a();
    }

    /* renamed from: a */
    public E m58727a() throws InterruptedException {
        return m58734b(0, null, null);
    }

    /* renamed from: b */
    public E m58733b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 1;
        r1 = 0;
        r0 = r2.m58734b(r0, r1, r1);	 Catch:{ InterruptedException -> 0x0007 }
        return r0;
    L_0x0007:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue.b():E");
    }

    /* renamed from: a */
    public E m58729a(long j, TimeUnit timeUnit) throws InterruptedException {
        return m58734b(3, Long.valueOf(j), timeUnit);
    }

    /* renamed from: c */
    public E m58735c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 2;
        r1 = 0;
        r0 = r2.m58734b(r0, r1, r1);	 Catch:{ InterruptedException -> 0x0007 }
        return r0;
    L_0x0007:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue.c():E");
    }

    public int size() {
        try {
            this.f48406b.lock();
            int size = this.f48405a.size() + super.size();
            return size;
        } finally {
            this.f48406b.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f48406b.lock();
            tArr = m58732a(super.toArray(tArr), this.f48405a.toArray(tArr));
            return tArr;
        } finally {
            this.f48406b.unlock();
        }
    }

    public Object[] toArray() {
        try {
            this.f48406b.lock();
            Object[] a = m58732a(super.toArray(), this.f48405a.toArray());
            return a;
        } finally {
            this.f48406b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        int drainTo;
        try {
            this.f48406b.lock();
            drainTo = super.drainTo(collection) + this.f48405a.size();
            while (!this.f48405a.isEmpty()) {
                collection.add(this.f48405a.poll());
            }
            return drainTo;
        } finally {
            drainTo = this.f48406b;
            drainTo.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f48406b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f48405a.isEmpty() && drainTo <= i) {
                collection.add(this.f48405a.poll());
                drainTo++;
            }
            this.f48406b.unlock();
            return drainTo;
        } catch (Throwable th) {
            this.f48406b.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f48406b.lock();
            if (!super.contains(obj)) {
                if (this.f48405a.contains(obj) == null) {
                    obj = null;
                    this.f48406b.unlock();
                    return obj;
                }
            }
            obj = true;
            this.f48406b.unlock();
            return obj;
        } catch (Throwable th) {
            this.f48406b.unlock();
        }
    }

    public void clear() {
        try {
            this.f48406b.lock();
            this.f48405a.clear();
            super.clear();
        } finally {
            this.f48406b.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.f48406b.lock();
            if (!super.remove(obj)) {
                if (this.f48405a.remove(obj) == null) {
                    obj = null;
                    this.f48406b.unlock();
                    return obj;
                }
            }
            obj = true;
            this.f48406b.unlock();
            return obj;
        } catch (Throwable th) {
            this.f48406b.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f48406b.lock();
            collection = this.f48405a.removeAll(collection) | super.removeAll(collection);
            return collection;
        } finally {
            this.f48406b.unlock();
        }
    }

    /* renamed from: a */
    E m58728a(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        switch (i) {
            case 0:
                i = (Dependency) super.take();
                break;
            case 1:
                i = (Dependency) super.peek();
                break;
            case 2:
                i = (Dependency) super.poll();
                break;
            case 3:
                i = (Dependency) super.poll(l.longValue(), timeUnit);
                break;
            default:
                return null;
        }
        return i;
    }

    /* renamed from: a */
    boolean m58730a(int i, E e) {
        try {
            this.f48406b.lock();
            if (i == 1) {
                super.remove(e);
            }
            i = this.f48405a.offer(e);
            return i;
        } finally {
            this.f48406b.unlock();
        }
    }

    /* renamed from: b */
    E m58734b(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        Dependency a;
        while (true) {
            a = m58728a(i, l, timeUnit);
            if (a == null) {
                break;
            } else if (m58731a(a)) {
                break;
            } else {
                m58730a(i, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    boolean m58731a(E e) {
        return e.areDependenciesMet();
    }

    /* renamed from: d */
    public void m58736d() {
        try {
            this.f48406b.lock();
            Iterator it = this.f48405a.iterator();
            while (it.hasNext()) {
                Dependency dependency = (Dependency) it.next();
                if (m58731a(dependency)) {
                    super.offer(dependency);
                    it.remove();
                }
            }
        } finally {
            this.f48406b.unlock();
        }
    }

    /* renamed from: a */
    <T> T[] m58732a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, objArr, 0, length);
        System.arraycopy(tArr2, 0, objArr, length, length2);
        return objArr;
    }
}
