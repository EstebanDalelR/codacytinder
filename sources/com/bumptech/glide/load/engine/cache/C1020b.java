package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.cache.b */
final class C1020b {
    /* renamed from: a */
    private final Map<Key, C1018a> f2822a = new HashMap();
    /* renamed from: b */
    private final C1019b f2823b = new C1019b();

    /* renamed from: com.bumptech.glide.load.engine.cache.b$a */
    private static class C1018a {
        /* renamed from: a */
        final Lock f2819a;
        /* renamed from: b */
        int f2820b;

        private C1018a() {
            this.f2819a = new ReentrantLock();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.b$b */
    private static class C1019b {
        /* renamed from: a */
        private final Queue<C1018a> f2821a;

        private C1019b() {
            this.f2821a = new ArrayDeque();
        }

        /* renamed from: a */
        C1018a m3550a() {
            C1018a c1018a;
            synchronized (this.f2821a) {
                c1018a = (C1018a) this.f2821a.poll();
            }
            return c1018a == null ? new C1018a() : c1018a;
        }

        /* renamed from: a */
        void m3551a(C1018a c1018a) {
            synchronized (this.f2821a) {
                if (this.f2821a.size() < 10) {
                    this.f2821a.offer(c1018a);
                }
            }
        }
    }

    C1020b() {
    }

    /* renamed from: a */
    void m3552a(Key key) {
        C1018a c1018a;
        synchronized (this) {
            c1018a = (C1018a) this.f2822a.get(key);
            if (c1018a == null) {
                c1018a = this.f2823b.m3550a();
                this.f2822a.put(key, c1018a);
            }
            c1018a.f2820b++;
        }
        c1018a.f2819a.lock();
    }

    /* renamed from: b */
    void m3553b(Key key) {
        C1018a c1018a;
        synchronized (this) {
            c1018a = (C1018a) this.f2822a.get(key);
            if (c1018a != null) {
                if (c1018a.f2820b > 0) {
                    int i = c1018a.f2820b - 1;
                    c1018a.f2820b = i;
                    if (i == 0) {
                        C1018a c1018a2 = (C1018a) this.f2822a.remove(key);
                        if (c1018a2.equals(c1018a)) {
                            this.f2823b.m3551a(c1018a2);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Removed the wrong lock, expected to remove: ");
                            stringBuilder.append(c1018a);
                            stringBuilder.append(", but actually removed: ");
                            stringBuilder.append(c1018a2);
                            stringBuilder.append(", key: ");
                            stringBuilder.append(key);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Cannot release a lock that is not held, key: ");
            stringBuilder2.append(key);
            stringBuilder2.append(", interestedThreads: ");
            stringBuilder2.append(c1018a == null ? null : c1018a.f2820b);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        c1018a.f2819a.unlock();
    }
}
