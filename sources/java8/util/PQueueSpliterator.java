package java8.util;

import com.tinder.api.ManagerWebServices;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.PriorityQueue;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class PQueueSpliterator<E> implements Spliterator<E> {
    /* renamed from: e */
    private static final boolean f54284e = Spliterators.f48760d;
    /* renamed from: f */
    private static final Unsafe f54285f = UnsafeAccess.f48790a;
    /* renamed from: g */
    private static final long f54286g;
    /* renamed from: h */
    private static final long f54287h;
    /* renamed from: i */
    private static final long f54288i;
    /* renamed from: a */
    private final PriorityQueue<E> f54289a;
    /* renamed from: b */
    private int f54290b;
    /* renamed from: c */
    private int f54291c;
    /* renamed from: d */
    private int f54292d;

    public int characteristics() {
        return 16704;
    }

    public /* synthetic */ Spliterator trySplit() {
        return m63870a();
    }

    private PQueueSpliterator(PriorityQueue<E> priorityQueue, int i, int i2, int i3) {
        this.f54289a = priorityQueue;
        this.f54290b = i;
        this.f54291c = i2;
        this.f54292d = i3;
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63865a(PriorityQueue<T> priorityQueue) {
        return new PQueueSpliterator(priorityQueue, 0, -1, 0);
    }

    /* renamed from: b */
    private int m63866b() {
        int i = this.f54291c;
        if (i >= 0) {
            return i;
        }
        this.f54292d = m63868c(this.f54289a);
        i = m63867b(this.f54289a);
        this.f54291c = i;
        return i;
    }

    /* renamed from: a */
    public PQueueSpliterator<E> m63870a() {
        int b = m63866b();
        int i = this.f54290b;
        b = (b + i) >>> 1;
        if (i >= b) {
            return null;
        }
        PriorityQueue priorityQueue = this.f54289a;
        this.f54290b = b;
        return new PQueueSpliterator(priorityQueue, i, b, this.f54292d);
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        PriorityQueue priorityQueue = this.f54289a;
        if (this.f54291c < 0) {
            this.f54291c = m63867b(priorityQueue);
            this.f54292d = m63868c(priorityQueue);
        }
        Object[] d = m63869d(priorityQueue);
        int i = this.f54291c;
        this.f54290b = i;
        for (int i2 = this.f54290b; i2 < i; i2++) {
            Object obj = d[i2];
            if (obj == null) {
                break;
            }
            consumer.accept(obj);
        }
        if (m63868c(priorityQueue) != this.f54292d) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean tryAdvance(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        PriorityQueue priorityQueue = this.f54289a;
        if (this.f54291c < 0) {
            this.f54291c = m63867b(priorityQueue);
            this.f54292d = m63868c(priorityQueue);
        }
        int i = this.f54290b;
        if (i >= this.f54291c) {
            return null;
        }
        this.f54290b = i + 1;
        Object obj = m63869d(priorityQueue)[i];
        if (obj != null) {
            if (m63868c(priorityQueue) == this.f54292d) {
                consumer.accept(obj);
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public long estimateSize() {
        return (long) (m63866b() - this.f54290b);
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

    /* renamed from: b */
    private static <T> int m63867b(PriorityQueue<T> priorityQueue) {
        return f54285f.getInt(priorityQueue, f54286g);
    }

    /* renamed from: c */
    private static <T> int m63868c(PriorityQueue<T> priorityQueue) {
        if (f54284e) {
            return null;
        }
        return f54285f.getInt(priorityQueue, f54287h);
    }

    /* renamed from: d */
    private static <T> Object[] m63869d(PriorityQueue<T> priorityQueue) {
        return (Object[]) f54285f.getObject(priorityQueue, f54288i);
    }

    static {
        try {
            f54286g = f54285f.objectFieldOffset(PriorityQueue.class.getDeclaredField(ManagerWebServices.PARAM_SIZE));
            if (f54284e) {
                f54287h = 0;
            } else {
                f54287h = f54285f.objectFieldOffset(PriorityQueue.class.getDeclaredField("modCount"));
            }
            f54288i = f54285f.objectFieldOffset(PriorityQueue.class.getDeclaredField(f54284e ? "elements" : "queue"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
