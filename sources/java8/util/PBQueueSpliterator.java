package java8.util;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java8.util.function.Consumer;

final class PBQueueSpliterator<E> implements Spliterator<E> {
    /* renamed from: a */
    private final PriorityBlockingQueue<E> f54280a;
    /* renamed from: b */
    private Object[] f54281b;
    /* renamed from: c */
    private int f54282c;
    /* renamed from: d */
    private int f54283d;

    public int characteristics() {
        return 16704;
    }

    public /* synthetic */ Spliterator trySplit() {
        return m63864a();
    }

    private PBQueueSpliterator(PriorityBlockingQueue<E> priorityBlockingQueue, Object[] objArr, int i, int i2) {
        this.f54280a = priorityBlockingQueue;
        this.f54281b = objArr;
        this.f54282c = i;
        this.f54283d = i2;
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63862a(PriorityBlockingQueue<T> priorityBlockingQueue) {
        return new PBQueueSpliterator(priorityBlockingQueue, null, 0, -1);
    }

    /* renamed from: b */
    private int m63863b() {
        if (this.f54281b == null) {
            Object[] toArray = this.f54280a.toArray();
            this.f54281b = toArray;
            this.f54283d = toArray.length;
        }
        return this.f54283d;
    }

    /* renamed from: a */
    public PBQueueSpliterator<E> m63864a() {
        int b = m63863b();
        int i = this.f54282c;
        b = (b + i) >>> 1;
        if (i >= b) {
            return null;
        }
        PriorityBlockingQueue priorityBlockingQueue = this.f54280a;
        Object[] objArr = this.f54281b;
        this.f54282c = b;
        return new PBQueueSpliterator(priorityBlockingQueue, objArr, i, b);
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        int b = m63863b();
        Object[] objArr = this.f54281b;
        this.f54282c = b;
        for (int i = this.f54282c; i < b; i++) {
            consumer.accept(objArr[i]);
        }
    }

    public boolean tryAdvance(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        if (m63863b() <= this.f54282c || this.f54282c < 0) {
            return null;
        }
        Object[] objArr = this.f54281b;
        int i = this.f54282c;
        this.f54282c = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    public long estimateSize() {
        return (long) (m63863b() - this.f54282c);
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
}
