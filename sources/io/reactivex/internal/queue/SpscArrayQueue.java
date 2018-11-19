package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.C15741h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    /* renamed from: f */
    private static final Integer f57346f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    /* renamed from: a */
    final int f57347a = (length() - 1);
    /* renamed from: b */
    final AtomicLong f57348b = new AtomicLong();
    /* renamed from: c */
    long f57349c;
    /* renamed from: d */
    final AtomicLong f57350d = new AtomicLong();
    /* renamed from: e */
    final int f57351e;

    /* renamed from: a */
    int m66555a(long j, int i) {
        return ((int) j) & i;
    }

    public SpscArrayQueue(int i) {
        super(C15741h.m58994a(i));
        this.f57351e = Math.min(i / 4, f57346f.intValue());
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.f57347a;
        long j = this.f57348b.get();
        int a = m66555a(j, i);
        if (j >= this.f57349c) {
            long j2 = j + ((long) this.f57351e);
            if (m66556a(m66555a(j2, i)) == null) {
                this.f57349c = j2;
            } else if (m66556a(a) != null) {
                return null;
            }
        }
        m66557a(a, (Object) e);
        m66558a(j + 1);
        return true;
    }

    public boolean offer(E e, E e2) {
        return (offer(e) == null || offer(e2) == null) ? null : true;
    }

    @Nullable
    public E poll() {
        long j = this.f57350d.get();
        int c = m66560c(j);
        E a = m66556a(c);
        if (a == null) {
            return null;
        }
        m66559b(j + 1);
        m66557a(c, null);
        return a;
    }

    public boolean isEmpty() {
        return this.f57348b.get() == this.f57350d.get();
    }

    /* renamed from: a */
    void m66558a(long j) {
        this.f57348b.lazySet(j);
    }

    /* renamed from: b */
    void m66559b(long j) {
        this.f57350d.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null) {
                if (isEmpty()) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    int m66560c(long j) {
        return ((int) j) & this.f57347a;
    }

    /* renamed from: a */
    void m66557a(int i, E e) {
        lazySet(i, e);
    }

    /* renamed from: a */
    E m66556a(int i) {
        return get(i);
    }
}
