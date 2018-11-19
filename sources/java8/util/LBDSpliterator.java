package java8.util;

import com.tinder.api.ManagerWebServices;
import java.util.Comparator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.ReentrantLock;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class LBDSpliterator<E> implements Spliterator<E> {
    /* renamed from: g */
    private static final Unsafe f54238g = UnsafeAccess.f48790a;
    /* renamed from: h */
    private static final long f54239h;
    /* renamed from: i */
    private static final long f54240i;
    /* renamed from: j */
    private static final long f54241j;
    /* renamed from: k */
    private static final long f54242k;
    /* renamed from: a */
    private final LinkedBlockingDeque<E> f54243a;
    /* renamed from: b */
    private final ReentrantLock f54244b;
    /* renamed from: c */
    private Object f54245c;
    /* renamed from: d */
    private int f54246d;
    /* renamed from: e */
    private boolean f54247e;
    /* renamed from: f */
    private long f54248f;

    public int characteristics() {
        return 4368;
    }

    private LBDSpliterator(LinkedBlockingDeque<E> linkedBlockingDeque) {
        this.f54243a = linkedBlockingDeque;
        this.f54248f = (long) linkedBlockingDeque.size();
        this.f54244b = m63833b((LinkedBlockingDeque) linkedBlockingDeque);
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63831a(LinkedBlockingDeque<T> linkedBlockingDeque) {
        return new LBDSpliterator(linkedBlockingDeque);
    }

    /* renamed from: a */
    Object m63836a(Object obj) {
        Object b = m63832b(obj);
        return obj == b ? m63835c(this.f54243a) : b;
    }

    public long estimateSize() {
        return this.f54248f;
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        if (!this.f54247e) {
            this.f54247e = true;
            Object obj = this.f54245c;
            this.f54245c = null;
            m63837a(consumer, obj);
        }
    }

    public Comparator<? super E> getComparator() {
        return Spliterators.m59174b((Spliterator) this);
    }

    public long getExactSizeIfKnown() {
        return Spliterators.m59152a((Spliterator) this);
    }

    public boolean hasCharacteristics(int i) {
        return Spliterators.m59173a((Spliterator) this, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean tryAdvance(java8.util.function.Consumer<? super E> r5) {
        /*
        r4 = this;
        java8.util.Objects.m59115b(r5);
        r0 = r4.f54247e;
        if (r0 != 0) goto L_0x003a;
    L_0x0007:
        r0 = 0;
        r1 = r4.f54244b;
        r1.lock();
        r2 = r4.f54245c;	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x0019;
    L_0x0011:
        r2 = r4.f54243a;	 Catch:{ all -> 0x0035 }
        r2 = m63835c(r2);	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0025;
    L_0x0019:
        r0 = m63834c(r2);	 Catch:{ all -> 0x0035 }
        r2 = r4.m63836a(r2);	 Catch:{ all -> 0x0035 }
        if (r0 != 0) goto L_0x0025;
    L_0x0023:
        if (r2 != 0) goto L_0x0019;
    L_0x0025:
        r4.f54245c = r2;	 Catch:{ all -> 0x0035 }
        r3 = 1;
        if (r2 != 0) goto L_0x002c;
    L_0x002a:
        r4.f54247e = r3;	 Catch:{ all -> 0x0035 }
    L_0x002c:
        r1.unlock();
        if (r0 == 0) goto L_0x003a;
    L_0x0031:
        r5.accept(r0);
        return r3;
    L_0x0035:
        r5 = move-exception;
        r1.unlock();
        throw r5;
    L_0x003a:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.LBDSpliterator.tryAdvance(java8.util.function.Consumer):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java8.util.Spliterator<E> trySplit() {
        /*
        r11 = this;
        r0 = r11.f54243a;
        r1 = r11.f54247e;
        if (r1 != 0) goto L_0x0075;
    L_0x0006:
        r1 = r11.f54245c;
        if (r1 != 0) goto L_0x0010;
    L_0x000a:
        r1 = m63835c(r0);
        if (r1 == 0) goto L_0x0075;
    L_0x0010:
        r1 = m63832b(r1);
        if (r1 == 0) goto L_0x0075;
    L_0x0016:
        r1 = r11.f54246d;
        r2 = 1;
        r1 = r1 + r2;
        r3 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r1 = java.lang.Math.min(r1, r3);
        r11.f54246d = r1;
        r3 = new java.lang.Object[r1];
        r4 = r11.f54244b;
        r5 = r11.f54245c;
        r4.lock();
        r6 = 0;
        if (r5 != 0) goto L_0x0039;
    L_0x002e:
        r5 = m63835c(r0);	 Catch:{ all -> 0x0037 }
        if (r5 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0039;
    L_0x0035:
        r0 = 0;
        goto L_0x0051;
    L_0x0037:
        r0 = move-exception;
        goto L_0x004d;
    L_0x0039:
        r0 = 0;
    L_0x003a:
        if (r5 == 0) goto L_0x0051;
    L_0x003c:
        if (r0 >= r1) goto L_0x0051;
    L_0x003e:
        r7 = m63834c(r5);	 Catch:{ all -> 0x0037 }
        r3[r0] = r7;	 Catch:{ all -> 0x0037 }
        if (r7 == 0) goto L_0x0048;
    L_0x0046:
        r0 = r0 + 1;
    L_0x0048:
        r5 = r11.m63836a(r5);	 Catch:{ all -> 0x0037 }
        goto L_0x003a;
    L_0x004d:
        r4.unlock();
        throw r0;
    L_0x0051:
        r4.unlock();
        r11.f54245c = r5;
        r7 = 0;
        if (r5 != 0) goto L_0x005f;
    L_0x005a:
        r11.f54248f = r7;
        r11.f54247e = r2;
        goto L_0x006c;
    L_0x005f:
        r1 = r11.f54248f;
        r4 = (long) r0;
        r9 = r1 - r4;
        r11.f54248f = r9;
        r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r1 >= 0) goto L_0x006c;
    L_0x006a:
        r11.f54248f = r7;
    L_0x006c:
        if (r0 <= 0) goto L_0x0075;
    L_0x006e:
        r1 = 4368; // 0x1110 float:6.121E-42 double:2.158E-320;
        r0 = java8.util.Spliterators.m59167a(r3, r6, r0, r1);
        return r0;
    L_0x0075:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.LBDSpliterator.trySplit():java8.util.Spliterator<E>");
    }

    /* renamed from: a */
    void m63837a(Consumer<? super E> consumer, Object obj) {
        ReentrantLock reentrantLock = this.f54244b;
        Object[] objArr = null;
        int i = 0;
        do {
            reentrantLock.lock();
            if (objArr == null) {
                if (obj == null) {
                    try {
                        obj = m63835c(this.f54243a);
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                    }
                }
                Object obj2 = obj;
                while (obj2 != null) {
                    if (m63834c(obj2) != null) {
                        i++;
                        if (i == 64) {
                            break;
                        }
                    }
                    obj2 = m63836a(obj2);
                }
                objArr = new Object[i];
            }
            int i2 = 0;
            while (obj != null && i2 < r3) {
                Object c = m63834c(obj);
                objArr[i2] = c;
                if (c != null) {
                    i2++;
                }
                obj = m63836a(obj);
            }
            reentrantLock.unlock();
            for (int i3 = 0; i3 < i2; i3++) {
                consumer.accept(objArr[i3]);
            }
            if (i2 <= 0) {
                return;
            }
        } while (obj != null);
    }

    /* renamed from: b */
    private static ReentrantLock m63833b(LinkedBlockingDeque<?> linkedBlockingDeque) {
        return (ReentrantLock) f54238g.getObject(linkedBlockingDeque, f54240i);
    }

    /* renamed from: c */
    private static Object m63835c(LinkedBlockingDeque<?> linkedBlockingDeque) {
        return f54238g.getObject(linkedBlockingDeque, f54239h);
    }

    /* renamed from: b */
    private static Object m63832b(Object obj) {
        return f54238g.getObject(obj, f54242k);
    }

    /* renamed from: c */
    private static <T> T m63834c(Object obj) {
        return f54238g.getObject(obj, f54241j);
    }

    static {
        try {
            Class cls = Class.forName("java.util.concurrent.LinkedBlockingDeque$Node");
            f54239h = f54238g.objectFieldOffset(LinkedBlockingDeque.class.getDeclaredField("first"));
            f54240i = f54238g.objectFieldOffset(LinkedBlockingDeque.class.getDeclaredField("lock"));
            f54241j = f54238g.objectFieldOffset(cls.getDeclaredField("item"));
            f54242k = f54238g.objectFieldOffset(cls.getDeclaredField(ManagerWebServices.FB_PARAM_NEXT));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
