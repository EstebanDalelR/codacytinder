package java8.util;

import build.IgnoreJava8API;
import com.google.android.exoplayer2.Format;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

public final class Spliterators {
    /* renamed from: a */
    static final boolean f48757a = m59172a(f48764h, true);
    /* renamed from: b */
    static final boolean f48758b = m59172a(f48765i, true);
    /* renamed from: c */
    static final boolean f48759c = m59184g();
    /* renamed from: d */
    static final boolean f48760d;
    /* renamed from: e */
    static final boolean f48761e;
    /* renamed from: f */
    static final boolean f48762f = m59185h();
    /* renamed from: g */
    static final boolean f48763g = m59170a("java.lang.StackWalker$Option");
    /* renamed from: h */
    private static final String f48764h;
    /* renamed from: i */
    private static final String f48765i;
    /* renamed from: j */
    private static final String f48766j;
    /* renamed from: k */
    private static final boolean f48767k = m59172a(f48766j, true);
    /* renamed from: l */
    private static final boolean f48768l = m59183f();
    /* renamed from: m */
    private static final Spliterator<Object> f48769m = new OfRef();
    /* renamed from: n */
    private static final java8.util.Spliterator.OfInt f48770n = new OfInt();
    /* renamed from: o */
    private static final java8.util.Spliterator.OfLong f48771o = new OfLong();
    /* renamed from: p */
    private static final java8.util.Spliterator.OfDouble f48772p = new OfDouble();

    private static abstract class EmptySpliterator<T, S extends Spliterator<T>, C> {

        private static final class OfRef<T> extends EmptySpliterator<T, Spliterator<T>, Consumer<? super T>> implements Spliterator<T> {
            public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
                super.forEachRemaining(consumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return super.tryAdvance(consumer);
            }

            OfRef() {
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public Comparator<? super T> getComparator() {
                return Spliterators.m59174b((Spliterator) this);
            }
        }

        private static final class OfDouble extends EmptySpliterator<Double, java8.util.Spliterator.OfDouble, DoubleConsumer> implements java8.util.Spliterator.OfDouble {
            OfDouble() {
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public Comparator<? super Double> getComparator() {
                return Spliterators.m59174b((Spliterator) this);
            }

            public boolean tryAdvance(Consumer<? super Double> consumer) {
                return OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Double> consumer) {
                OfDouble.m59145b(this, consumer);
            }
        }

        private static final class OfInt extends EmptySpliterator<Integer, java8.util.Spliterator.OfInt, IntConsumer> implements java8.util.Spliterator.OfInt {
            OfInt() {
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public Comparator<? super Integer> getComparator() {
                return Spliterators.m59174b((Spliterator) this);
            }

            public boolean tryAdvance(Consumer<? super Integer> consumer) {
                return OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Integer> consumer) {
                OfInt.m59148b(this, consumer);
            }
        }

        private static final class OfLong extends EmptySpliterator<Long, java8.util.Spliterator.OfLong, LongConsumer> implements java8.util.Spliterator.OfLong {
            OfLong() {
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public Comparator<? super Long> getComparator() {
                return Spliterators.m59174b((Spliterator) this);
            }

            public boolean tryAdvance(Consumer<? super Long> consumer) {
                return OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Long> consumer) {
                OfLong.m59151b(this, consumer);
            }
        }

        public int characteristics() {
            return 16448;
        }

        public long estimateSize() {
            return 0;
        }

        public S trySplit() {
            return null;
        }

        EmptySpliterator() {
        }

        public boolean tryAdvance(C c) {
            Objects.m59115b(c);
            return null;
        }

        public void forEachRemaining(C c) {
            Objects.m59115b(c);
        }
    }

    public static final class OfDouble {
        /* renamed from: a */
        public static void m59143a(java8.util.Spliterator.OfDouble ofDouble, DoubleConsumer doubleConsumer) {
            do {
            } while (ofDouble.tryAdvance(doubleConsumer));
        }

        /* renamed from: a */
        public static boolean m59144a(java8.util.Spliterator.OfDouble ofDouble, Consumer<? super Double> consumer) {
            if (consumer instanceof DoubleConsumer) {
                return ofDouble.tryAdvance((DoubleConsumer) consumer);
            }
            consumer.getClass();
            return ofDouble.tryAdvance(Spliterators$OfDouble$$Lambda$1.m63875a(consumer));
        }

        /* renamed from: b */
        public static void m59145b(java8.util.Spliterator.OfDouble ofDouble, Consumer<? super Double> consumer) {
            if (consumer instanceof DoubleConsumer) {
                ofDouble.forEachRemaining((DoubleConsumer) consumer);
                return;
            }
            consumer.getClass();
            ofDouble.forEachRemaining(Spliterators$OfDouble$$Lambda$2.m63876a(consumer));
        }

        private OfDouble() {
        }
    }

    public static final class OfInt {
        /* renamed from: a */
        public static void m59146a(java8.util.Spliterator.OfInt ofInt, IntConsumer intConsumer) {
            do {
            } while (ofInt.tryAdvance(intConsumer));
        }

        /* renamed from: a */
        public static boolean m59147a(java8.util.Spliterator.OfInt ofInt, Consumer<? super Integer> consumer) {
            if (consumer instanceof IntConsumer) {
                return ofInt.tryAdvance((IntConsumer) consumer);
            }
            consumer.getClass();
            return ofInt.tryAdvance(Spliterators$OfInt$$Lambda$1.m63877a(consumer));
        }

        /* renamed from: b */
        public static void m59148b(java8.util.Spliterator.OfInt ofInt, Consumer<? super Integer> consumer) {
            if (consumer instanceof IntConsumer) {
                ofInt.forEachRemaining((IntConsumer) consumer);
                return;
            }
            consumer.getClass();
            ofInt.forEachRemaining(Spliterators$OfInt$$Lambda$2.m63878a(consumer));
        }

        private OfInt() {
        }
    }

    public static final class OfLong {
        /* renamed from: a */
        public static void m59149a(java8.util.Spliterator.OfLong ofLong, LongConsumer longConsumer) {
            do {
            } while (ofLong.tryAdvance(longConsumer));
        }

        /* renamed from: a */
        public static boolean m59150a(java8.util.Spliterator.OfLong ofLong, Consumer<? super Long> consumer) {
            if (consumer instanceof LongConsumer) {
                return ofLong.tryAdvance((LongConsumer) consumer);
            }
            consumer.getClass();
            return ofLong.tryAdvance(Spliterators$OfLong$$Lambda$1.m63879a(consumer));
        }

        /* renamed from: b */
        public static void m59151b(java8.util.Spliterator.OfLong ofLong, Consumer<? super Long> consumer) {
            if (consumer instanceof LongConsumer) {
                ofLong.forEachRemaining((LongConsumer) consumer);
                return;
            }
            consumer.getClass();
            ofLong.forEachRemaining(Spliterators$OfLong$$Lambda$2.m63880a(consumer));
        }

        private OfLong() {
        }
    }

    public static final class OfPrimitive {
        private OfPrimitive() {
        }
    }

    /* renamed from: java8.util.Spliterators$1Adapter */
    class AnonymousClass1Adapter implements Iterator<T>, Consumer<T> {
        /* renamed from: a */
        boolean f54300a = null;
        /* renamed from: b */
        T f54301b;
        /* renamed from: c */
        final /* synthetic */ Spliterator f54302c;

        AnonymousClass1Adapter(Spliterator spliterator) {
            this.f54302c = spliterator;
        }

        public void accept(T t) {
            this.f54300a = true;
            this.f54301b = t;
        }

        public boolean hasNext() {
            if (!this.f54300a) {
                this.f54302c.tryAdvance(this);
            }
            return this.f54300a;
        }

        public T next() {
            if (this.f54300a || hasNext()) {
                this.f54300a = false;
                return this.f54301b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
        /* renamed from: a */
        private final int f54307a;
        /* renamed from: b */
        private long f54308b;
        /* renamed from: c */
        private int f54309c;

        static final class HoldingConsumer<T> implements Consumer<T> {
            /* renamed from: a */
            Object f54306a;

            HoldingConsumer() {
            }

            public void accept(T t) {
                this.f54306a = t;
            }
        }

        public Spliterator<T> trySplit() {
            Consumer holdingConsumer = new HoldingConsumer();
            long j = this.f54308b;
            if (j <= 1 || !tryAdvance(holdingConsumer)) {
                return null;
            }
            int i = this.f54309c + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            Object[] objArr = new Object[i2];
            int i3 = 0;
            do {
                objArr[i3] = holdingConsumer.f54306a;
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (tryAdvance(holdingConsumer));
            this.f54309c = i3;
            if (this.f54308b != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f54308b -= (long) i3;
            }
            return new ArraySpliterator(objArr, 0, i3, characteristics());
        }

        public long estimateSize() {
            return this.f54308b;
        }

        public int characteristics() {
            return this.f54307a;
        }

        public long getExactSizeIfKnown() {
            return (characteristics() & 64) == 0 ? -1 : estimateSize();
        }

        public boolean hasCharacteristics(int i) {
            return (characteristics() & i) == i;
        }

        public Comparator<? super T> getComparator() {
            throw new IllegalStateException();
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            do {
            } while (tryAdvance(consumer));
        }
    }

    static final class ArraySpliterator<T> implements Spliterator<T> {
        /* renamed from: a */
        private final Object[] f54310a;
        /* renamed from: b */
        private int f54311b;
        /* renamed from: c */
        private final int f54312c;
        /* renamed from: d */
        private final int f54313d;

        public ArraySpliterator(Object[] objArr, int i) {
            this(objArr, 0, objArr.length, i);
        }

        public ArraySpliterator(Object[] objArr, int i, int i2, int i3) {
            this.f54310a = objArr;
            this.f54311b = i;
            this.f54312c = i2;
            this.f54313d = (i3 | 64) | 16384;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Spliterator<T> trySplit() {
            int i = this.f54311b;
            int i2 = (this.f54312c + i) >>> 1;
            if (i >= i2) {
                return null;
            }
            Object[] objArr = this.f54310a;
            this.f54311b = i2;
            return new ArraySpliterator(objArr, i, i2, this.f54313d);
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            Object[] objArr = this.f54310a;
            int length = objArr.length;
            int i = this.f54312c;
            if (length >= i) {
                length = this.f54311b;
                if (length >= 0) {
                    this.f54311b = i;
                    if (length < i) {
                        do {
                            consumer.accept(objArr[length]);
                            length++;
                        } while (length < i);
                    }
                }
            }
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            if (this.f54311b < 0 || this.f54311b >= this.f54312c) {
                return null;
            }
            Object[] objArr = this.f54310a;
            int i = this.f54311b;
            this.f54311b = i + 1;
            consumer.accept(objArr[i]);
            return true;
        }

        public long estimateSize() {
            return (long) (this.f54312c - this.f54311b);
        }

        public int characteristics() {
            return this.f54313d;
        }

        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    static class IteratorSpliterator<T> implements Spliterator<T> {
        /* renamed from: a */
        private final Collection<? extends T> f54314a;
        /* renamed from: b */
        private Iterator<? extends T> f54315b;
        /* renamed from: c */
        private final int f54316c;
        /* renamed from: d */
        private long f54317d;
        /* renamed from: e */
        private int f54318e;

        public IteratorSpliterator(Collection<? extends T> collection, int i) {
            this.f54314a = collection;
            this.f54315b = null;
            if ((i & 4096) == null) {
                i = (i | 64) | 16384;
            }
            this.f54316c = i;
        }

        public IteratorSpliterator(Iterator<? extends T> it, int i) {
            this.f54314a = null;
            this.f54315b = it;
            this.f54317d = Format.OFFSET_SAMPLE_RELATIVE;
            this.f54316c = i & -16449;
        }

        public Spliterator<T> trySplit() {
            long size;
            Iterator it = this.f54315b;
            if (it == null) {
                it = this.f54314a.iterator();
                this.f54315b = it;
                size = (long) this.f54314a.size();
                this.f54317d = size;
            } else {
                size = this.f54317d;
            }
            if (size <= 1 || !it.hasNext()) {
                return null;
            }
            int i = this.f54318e + 1024;
            if (((long) i) > size) {
                i = (int) size;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            Object[] objArr = new Object[i2];
            int i3 = 0;
            do {
                objArr[i3] = it.next();
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (it.hasNext());
            this.f54318e = i3;
            if (this.f54317d != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f54317d -= (long) i3;
            }
            return new ArraySpliterator(objArr, 0, i3, this.f54316c);
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            Iterator it = this.f54315b;
            if (it == null) {
                it = this.f54314a.iterator();
                this.f54315b = it;
                this.f54317d = (long) this.f54314a.size();
            }
            Iterators.m59078a(it, (Consumer) consumer);
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            if (this.f54315b == null) {
                this.f54315b = this.f54314a.iterator();
                this.f54317d = (long) this.f54314a.size();
            }
            if (!this.f54315b.hasNext()) {
                return null;
            }
            consumer.accept(this.f54315b.next());
            return true;
        }

        public long estimateSize() {
            if (this.f54315b != null) {
                return this.f54317d;
            }
            this.f54315b = this.f54314a.iterator();
            long size = (long) this.f54314a.size();
            this.f54317d = size;
            return size;
        }

        public int characteristics() {
            return this.f54316c;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: java8.util.Spliterators$2Adapter */
    class AnonymousClass2Adapter implements java8.util.PrimitiveIterator.OfInt, IntConsumer {
        /* renamed from: a */
        boolean f57620a = null;
        /* renamed from: b */
        int f57621b;
        /* renamed from: c */
        final /* synthetic */ java8.util.Spliterator.OfInt f57622c;

        AnonymousClass2Adapter(java8.util.Spliterator.OfInt ofInt) {
            this.f57622c = ofInt;
        }

        public void accept(int i) {
            this.f57620a = true;
            this.f57621b = i;
        }

        public boolean hasNext() {
            if (!this.f57620a) {
                this.f57622c.tryAdvance((IntConsumer) this);
            }
            return this.f57620a;
        }

        public int nextInt() {
            if (this.f57620a || hasNext()) {
                this.f57620a = false;
                return this.f57621b;
            }
            throw new NoSuchElementException();
        }

        public Integer next() {
            return Integer.valueOf(nextInt());
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Iterators.m59080a((java8.util.PrimitiveIterator.OfInt) this, intConsumer);
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* renamed from: java8.util.Spliterators$3Adapter */
    class AnonymousClass3Adapter implements java8.util.PrimitiveIterator.OfLong, LongConsumer {
        /* renamed from: a */
        boolean f57623a = null;
        /* renamed from: b */
        long f57624b;
        /* renamed from: c */
        final /* synthetic */ java8.util.Spliterator.OfLong f57625c;

        AnonymousClass3Adapter(java8.util.Spliterator.OfLong ofLong) {
            this.f57625c = ofLong;
        }

        public void accept(long j) {
            this.f57623a = true;
            this.f57624b = j;
        }

        public boolean hasNext() {
            if (!this.f57623a) {
                this.f57625c.tryAdvance((LongConsumer) this);
            }
            return this.f57623a;
        }

        public long nextLong() {
            if (this.f57623a || hasNext()) {
                this.f57623a = false;
                return this.f57624b;
            }
            throw new NoSuchElementException();
        }

        public Long next() {
            return Long.valueOf(nextLong());
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Iterators.m59081a((java8.util.PrimitiveIterator.OfLong) this, longConsumer);
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* renamed from: java8.util.Spliterators$4Adapter */
    class AnonymousClass4Adapter implements java8.util.PrimitiveIterator.OfDouble, DoubleConsumer {
        /* renamed from: a */
        boolean f57626a = null;
        /* renamed from: b */
        double f57627b;
        /* renamed from: c */
        final /* synthetic */ java8.util.Spliterator.OfDouble f57628c;

        AnonymousClass4Adapter(java8.util.Spliterator.OfDouble ofDouble) {
            this.f57628c = ofDouble;
        }

        public void accept(double d) {
            this.f57626a = true;
            this.f57627b = d;
        }

        public boolean hasNext() {
            if (!this.f57626a) {
                this.f57628c.tryAdvance((DoubleConsumer) this);
            }
            return this.f57626a;
        }

        public double nextDouble() {
            if (this.f57626a || hasNext()) {
                this.f57626a = false;
                return this.f57627b;
            }
            throw new NoSuchElementException();
        }

        public Double next() {
            return Double.valueOf(nextDouble());
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Iterators.m59079a((java8.util.PrimitiveIterator.OfDouble) this, doubleConsumer);
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public static abstract class AbstractDoubleSpliterator implements java8.util.Spliterator.OfDouble {
        /* renamed from: a */
        private final int f59164a;
        /* renamed from: b */
        private long f59165b;
        /* renamed from: c */
        private int f59166c;

        static final class HoldingDoubleConsumer implements DoubleConsumer {
            /* renamed from: a */
            double f54303a;

            HoldingDoubleConsumer() {
            }

            public void accept(double d) {
                this.f54303a = d;
            }
        }

        public java8.util.Spliterator.OfDouble trySplit() {
            DoubleConsumer holdingDoubleConsumer = new HoldingDoubleConsumer();
            long j = this.f59165b;
            if (j <= 1 || !tryAdvance(holdingDoubleConsumer)) {
                return null;
            }
            int i = this.f59166c + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            double[] dArr = new double[i2];
            int i3 = 0;
            do {
                dArr[i3] = holdingDoubleConsumer.f54303a;
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (tryAdvance(holdingDoubleConsumer));
            this.f59166c = i3;
            if (this.f59165b != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f59165b -= (long) i3;
            }
            return new DoubleArraySpliterator(dArr, 0, i3, characteristics());
        }

        public long estimateSize() {
            return this.f59165b;
        }

        public int characteristics() {
            return this.f59164a;
        }

        public long getExactSizeIfKnown() {
            return (characteristics() & 64) == 0 ? -1 : estimateSize();
        }

        public boolean hasCharacteristics(int i) {
            return (characteristics() & i) == i;
        }

        public Comparator<? super Double> getComparator() {
            throw new IllegalStateException();
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            do {
            } while (tryAdvance(doubleConsumer));
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            OfDouble.m59145b(this, consumer);
        }

        public boolean tryAdvance(Consumer<? super Double> consumer) {
            return OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
        }
    }

    public static abstract class AbstractIntSpliterator implements java8.util.Spliterator.OfInt {
        /* renamed from: a */
        private final int f59167a;
        /* renamed from: b */
        private long f59168b;
        /* renamed from: c */
        private int f59169c;

        static final class HoldingIntConsumer implements IntConsumer {
            /* renamed from: a */
            int f54304a;

            HoldingIntConsumer() {
            }

            public void accept(int i) {
                this.f54304a = i;
            }
        }

        public java8.util.Spliterator.OfInt trySplit() {
            IntConsumer holdingIntConsumer = new HoldingIntConsumer();
            long j = this.f59168b;
            if (j <= 1 || !tryAdvance(holdingIntConsumer)) {
                return null;
            }
            int i = this.f59169c + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            int[] iArr = new int[i2];
            int i3 = 0;
            do {
                iArr[i3] = holdingIntConsumer.f54304a;
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (tryAdvance(holdingIntConsumer));
            this.f59169c = i3;
            if (this.f59168b != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f59168b -= (long) i3;
            }
            return new IntArraySpliterator(iArr, 0, i3, characteristics());
        }

        public long estimateSize() {
            return this.f59168b;
        }

        public int characteristics() {
            return this.f59167a;
        }

        public long getExactSizeIfKnown() {
            return (characteristics() & 64) == 0 ? -1 : estimateSize();
        }

        public boolean hasCharacteristics(int i) {
            return (characteristics() & i) == i;
        }

        public Comparator<? super Integer> getComparator() {
            throw new IllegalStateException();
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            do {
            } while (tryAdvance(intConsumer));
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            OfInt.m59148b(this, consumer);
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
        }
    }

    public static abstract class AbstractLongSpliterator implements java8.util.Spliterator.OfLong {
        /* renamed from: a */
        private final int f59170a;
        /* renamed from: b */
        private long f59171b;
        /* renamed from: c */
        private int f59172c;

        static final class HoldingLongConsumer implements LongConsumer {
            /* renamed from: a */
            long f54305a;

            HoldingLongConsumer() {
            }

            public void accept(long j) {
                this.f54305a = j;
            }
        }

        public java8.util.Spliterator.OfLong trySplit() {
            LongConsumer holdingLongConsumer = new HoldingLongConsumer();
            long j = this.f59171b;
            if (j <= 1 || !tryAdvance(holdingLongConsumer)) {
                return null;
            }
            int i = this.f59172c + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            long[] jArr = new long[i2];
            int i3 = 0;
            do {
                jArr[i3] = holdingLongConsumer.f54305a;
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (tryAdvance(holdingLongConsumer));
            this.f59172c = i3;
            if (this.f59171b != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f59171b -= (long) i3;
            }
            return new LongArraySpliterator(jArr, 0, i3, characteristics());
        }

        public long estimateSize() {
            return this.f59171b;
        }

        public int characteristics() {
            return this.f59170a;
        }

        public long getExactSizeIfKnown() {
            return (characteristics() & 64) == 0 ? -1 : estimateSize();
        }

        public boolean hasCharacteristics(int i) {
            return (characteristics() & i) == i;
        }

        public Comparator<? super Long> getComparator() {
            throw new IllegalStateException();
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            do {
            } while (tryAdvance(longConsumer));
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            OfLong.m59151b(this, consumer);
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
        }
    }

    static final class DoubleArraySpliterator implements java8.util.Spliterator.OfDouble {
        /* renamed from: a */
        private final double[] f59173a;
        /* renamed from: b */
        private int f59174b;
        /* renamed from: c */
        private final int f59175c;
        /* renamed from: d */
        private final int f59176d;

        public DoubleArraySpliterator(double[] dArr, int i, int i2, int i3) {
            this.f59173a = dArr;
            this.f59174b = i;
            this.f59175c = i2;
            this.f59176d = (i3 | 64) | 16384;
        }

        public java8.util.Spliterator.OfDouble trySplit() {
            int i = this.f59174b;
            int i2 = (this.f59175c + i) >>> 1;
            if (i >= i2) {
                return null;
            }
            double[] dArr = this.f59173a;
            this.f59174b = i2;
            return new DoubleArraySpliterator(dArr, i, i2, this.f59176d);
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            double[] dArr = this.f59173a;
            int length = dArr.length;
            int i = this.f59175c;
            if (length >= i) {
                length = this.f59174b;
                if (length >= 0) {
                    this.f59174b = i;
                    if (length < i) {
                        do {
                            doubleConsumer.accept(dArr[length]);
                            length++;
                        } while (length < i);
                    }
                }
            }
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            OfDouble.m59145b(this, consumer);
        }

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            if (this.f59174b < 0 || this.f59174b >= this.f59175c) {
                return null;
            }
            double[] dArr = this.f59173a;
            int i = this.f59174b;
            this.f59174b = i + 1;
            doubleConsumer.accept(dArr[i]);
            return true;
        }

        public boolean tryAdvance(Consumer<? super Double> consumer) {
            return OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
        }

        public long estimateSize() {
            return (long) (this.f59175c - this.f59174b);
        }

        public int characteristics() {
            return this.f59176d;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super Double> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    static final class DoubleIteratorSpliterator implements java8.util.Spliterator.OfDouble {
        /* renamed from: a */
        private java8.util.PrimitiveIterator.OfDouble f59177a;
        /* renamed from: b */
        private final int f59178b;
        /* renamed from: c */
        private long f59179c;
        /* renamed from: d */
        private int f59180d;

        public java8.util.Spliterator.OfDouble trySplit() {
            java8.util.PrimitiveIterator.OfDouble ofDouble = this.f59177a;
            long j = this.f59179c;
            if (j <= 1 || !ofDouble.hasNext()) {
                return null;
            }
            int i = this.f59180d + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            double[] dArr = new double[i2];
            int i3 = 0;
            do {
                dArr[i3] = ofDouble.nextDouble();
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (ofDouble.hasNext());
            this.f59180d = i3;
            if (this.f59179c != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f59179c -= (long) i3;
            }
            return new DoubleArraySpliterator(dArr, 0, i3, this.f59178b);
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Iterators.m59079a(this.f59177a, (DoubleConsumer) Objects.m59115b(doubleConsumer));
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            OfDouble.m59145b(this, consumer);
        }

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            if (!this.f59177a.hasNext()) {
                return null;
            }
            doubleConsumer.accept(this.f59177a.nextDouble());
            return true;
        }

        public boolean tryAdvance(Consumer<? super Double> consumer) {
            return OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
        }

        public long estimateSize() {
            return this.f59179c;
        }

        public int characteristics() {
            return this.f59178b;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super Double> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    static final class IntArraySpliterator implements java8.util.Spliterator.OfInt {
        /* renamed from: a */
        private final int[] f59181a;
        /* renamed from: b */
        private int f59182b;
        /* renamed from: c */
        private final int f59183c;
        /* renamed from: d */
        private final int f59184d;

        public IntArraySpliterator(int[] iArr, int i, int i2, int i3) {
            this.f59181a = iArr;
            this.f59182b = i;
            this.f59183c = i2;
            this.f59184d = (i3 | 64) | 16384;
        }

        public java8.util.Spliterator.OfInt trySplit() {
            int i = this.f59182b;
            int i2 = (this.f59183c + i) >>> 1;
            if (i >= i2) {
                return null;
            }
            int[] iArr = this.f59181a;
            this.f59182b = i2;
            return new IntArraySpliterator(iArr, i, i2, this.f59184d);
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            int[] iArr = this.f59181a;
            int length = iArr.length;
            int i = this.f59183c;
            if (length >= i) {
                length = this.f59182b;
                if (length >= 0) {
                    this.f59182b = i;
                    if (length < i) {
                        do {
                            intConsumer.accept(iArr[length]);
                            length++;
                        } while (length < i);
                    }
                }
            }
        }

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            if (this.f59182b < 0 || this.f59182b >= this.f59183c) {
                return null;
            }
            int[] iArr = this.f59181a;
            int i = this.f59182b;
            this.f59182b = i + 1;
            intConsumer.accept(iArr[i]);
            return true;
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            OfInt.m59148b(this, consumer);
        }

        public long estimateSize() {
            return (long) (this.f59183c - this.f59182b);
        }

        public int characteristics() {
            return this.f59184d;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super Integer> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    static final class IntIteratorSpliterator implements java8.util.Spliterator.OfInt {
        /* renamed from: a */
        private java8.util.PrimitiveIterator.OfInt f59185a;
        /* renamed from: b */
        private final int f59186b;
        /* renamed from: c */
        private long f59187c;
        /* renamed from: d */
        private int f59188d;

        public java8.util.Spliterator.OfInt trySplit() {
            java8.util.PrimitiveIterator.OfInt ofInt = this.f59185a;
            long j = this.f59187c;
            if (j <= 1 || !ofInt.hasNext()) {
                return null;
            }
            int i = this.f59188d + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            int[] iArr = new int[i2];
            int i3 = 0;
            do {
                iArr[i3] = ofInt.nextInt();
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (ofInt.hasNext());
            this.f59188d = i3;
            if (this.f59187c != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f59187c -= (long) i3;
            }
            return new IntArraySpliterator(iArr, 0, i3, this.f59186b);
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Iterators.m59080a(this.f59185a, (IntConsumer) Objects.m59115b(intConsumer));
        }

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            if (!this.f59185a.hasNext()) {
                return null;
            }
            intConsumer.accept(this.f59185a.nextInt());
            return true;
        }

        public long estimateSize() {
            return this.f59187c;
        }

        public int characteristics() {
            return this.f59186b;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super Integer> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            OfInt.m59148b(this, consumer);
        }
    }

    static final class LongArraySpliterator implements java8.util.Spliterator.OfLong {
        /* renamed from: a */
        private final long[] f59189a;
        /* renamed from: b */
        private int f59190b;
        /* renamed from: c */
        private final int f59191c;
        /* renamed from: d */
        private final int f59192d;

        public LongArraySpliterator(long[] jArr, int i, int i2, int i3) {
            this.f59189a = jArr;
            this.f59190b = i;
            this.f59191c = i2;
            this.f59192d = (i3 | 64) | 16384;
        }

        public java8.util.Spliterator.OfLong trySplit() {
            int i = this.f59190b;
            int i2 = (this.f59191c + i) >>> 1;
            if (i >= i2) {
                return null;
            }
            long[] jArr = this.f59189a;
            this.f59190b = i2;
            return new LongArraySpliterator(jArr, i, i2, this.f59192d);
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long[] jArr = this.f59189a;
            int length = jArr.length;
            int i = this.f59191c;
            if (length >= i) {
                length = this.f59190b;
                if (length >= 0) {
                    this.f59190b = i;
                    if (length < i) {
                        do {
                            longConsumer.accept(jArr[length]);
                            length++;
                        } while (length < i);
                    }
                }
            }
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            OfLong.m59151b(this, consumer);
        }

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            if (this.f59190b < 0 || this.f59190b >= this.f59191c) {
                return null;
            }
            long[] jArr = this.f59189a;
            int i = this.f59190b;
            this.f59190b = i + 1;
            longConsumer.accept(jArr[i]);
            return true;
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
        }

        public long estimateSize() {
            return (long) (this.f59191c - this.f59190b);
        }

        public int characteristics() {
            return this.f59192d;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super Long> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    static final class LongIteratorSpliterator implements java8.util.Spliterator.OfLong {
        /* renamed from: a */
        private java8.util.PrimitiveIterator.OfLong f59193a;
        /* renamed from: b */
        private final int f59194b;
        /* renamed from: c */
        private long f59195c;
        /* renamed from: d */
        private int f59196d;

        public java8.util.Spliterator.OfLong trySplit() {
            java8.util.PrimitiveIterator.OfLong ofLong = this.f59193a;
            long j = this.f59195c;
            if (j <= 1 || !ofLong.hasNext()) {
                return null;
            }
            int i = this.f59196d + 1024;
            if (((long) i) > j) {
                i = (int) j;
            }
            int i2 = 33554432;
            if (i <= 33554432) {
                i2 = i;
            }
            long[] jArr = new long[i2];
            int i3 = 0;
            do {
                jArr[i3] = ofLong.nextLong();
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (ofLong.hasNext());
            this.f59196d = i3;
            if (this.f59195c != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f59195c -= (long) i3;
            }
            return new LongArraySpliterator(jArr, 0, i3, this.f59194b);
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Iterators.m59081a(this.f59193a, (LongConsumer) Objects.m59115b(longConsumer));
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            OfLong.m59151b(this, consumer);
        }

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            if (!this.f59193a.hasNext()) {
                return null;
            }
            longConsumer.accept(this.f59193a.nextLong());
            return true;
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
        }

        public long estimateSize() {
            return this.f59195c;
        }

        public int characteristics() {
            return this.f59194b;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super Long> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Spliterators.class.getName());
        stringBuilder.append(".assume.oracle.collections.impl");
        f48764h = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(Spliterators.class.getName());
        stringBuilder.append(".jre.delegation.enabled");
        f48765i = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(Spliterators.class.getName());
        stringBuilder.append(".randomaccess.spliterator.enabled");
        f48766j = stringBuilder.toString();
        boolean z = true;
        boolean z2 = f48759c && !m59170a("android.opengl.GLES32$DebugProc");
        f48760d = z2;
        if (f48759c || !m59182e()) {
            z = false;
        }
        f48761e = z;
    }

    private Spliterators() {
    }

    /* renamed from: a */
    public static <T> void m59169a(Spliterator<T> spliterator, Consumer<? super T> consumer) {
        do {
        } while (spliterator.tryAdvance(consumer));
    }

    /* renamed from: a */
    public static <T> long m59152a(Spliterator<T> spliterator) {
        return (spliterator.characteristics() & 64) == 0 ? -1 : spliterator.estimateSize();
    }

    /* renamed from: a */
    public static <T> boolean m59173a(Spliterator<T> spliterator, int i) {
        return (spliterator.characteristics() & i) == i ? true : null;
    }

    /* renamed from: b */
    public static <T> Comparator<? super T> m59174b(Spliterator<T> spliterator) {
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59159a() {
        return f48769m;
    }

    /* renamed from: b */
    public static java8.util.Spliterator.OfInt m59175b() {
        return f48770n;
    }

    /* renamed from: c */
    public static java8.util.Spliterator.OfLong m59179c() {
        return f48771o;
    }

    /* renamed from: d */
    public static java8.util.Spliterator.OfDouble m59181d() {
        return f48772p;
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59166a(Object[] objArr, int i) {
        return new ArraySpliterator((Object[]) Objects.m59115b(objArr), i);
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59167a(Object[] objArr, int i, int i2, int i3) {
        m59168a(((Object[]) Objects.m59115b(objArr)).length, i, i2);
        return new ArraySpliterator(objArr, i, i2, i3);
    }

    /* renamed from: a */
    public static java8.util.Spliterator.OfInt m59157a(int[] iArr, int i, int i2, int i3) {
        m59168a(((int[]) Objects.m59115b(iArr)).length, i, i2);
        return new IntArraySpliterator(iArr, i, i2, i3);
    }

    /* renamed from: a */
    public static java8.util.Spliterator.OfLong m59158a(long[] jArr, int i, int i2, int i3) {
        m59168a(((long[]) Objects.m59115b(jArr)).length, i, i2);
        return new LongArraySpliterator(jArr, i, i2, i3);
    }

    /* renamed from: a */
    public static java8.util.Spliterator.OfDouble m59156a(double[] dArr, int i, int i2, int i3) {
        m59168a(((double[]) Objects.m59115b(dArr)).length, i, i2);
        return new DoubleArraySpliterator(dArr, i, i2, i3);
    }

    /* renamed from: a */
    private static void m59168a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("origin(");
            stringBuilder.append(i2);
            stringBuilder.append(") > fence(");
            stringBuilder.append(i3);
            stringBuilder.append(")");
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59160a(Collection<? extends T> collection) {
        Objects.m59115b(collection);
        if (f48762f && f48758b && !m59180c((Collection) collection)) {
            return m59176b((Collection) collection);
        }
        String name = collection.getClass().getName();
        if (collection instanceof List) {
            return m59163a((List) collection, name);
        }
        if (collection instanceof Set) {
            return m59165a((Set) collection, name);
        }
        if (collection instanceof Queue) {
            return m59164a((Queue) collection);
        }
        if (!f48760d && f48757a && "java.util.HashMap$Values".equals(name)) {
            return HMSpliterators.m59070a((Collection) collection);
        }
        return m59161a((Collection) collection, 0);
    }

    /* renamed from: a */
    private static <T> Spliterator<T> m59163a(List<? extends T> list, String str) {
        if (f48757a || f48759c) {
            if (list instanceof ArrayList) {
                return ArrayListSpliterator.m63809a((ArrayList) list);
            }
            if ("java.util.Arrays$ArrayList".equals(str)) {
                return ArraysArrayListSpliterator.m59023a(list);
            }
            if (list instanceof CopyOnWriteArrayList) {
                return COWArrayListSpliterator.m59026a((CopyOnWriteArrayList) list);
            }
            if (list instanceof LinkedList) {
                return LinkedListSpliterator.m63850a((LinkedList) list);
            }
            if (list instanceof Vector) {
                return VectorSpliterator.m63882a((Vector) list);
            }
        }
        if (!f48767k || !(list instanceof RandomAccess)) {
            return m59161a((Collection) list, 16);
        }
        if ((list instanceof AbstractList) || m59177b(str) == null) {
            return RASpliterator.m63872a(list);
        }
        return m59161a((Collection) list, 16);
    }

    /* renamed from: a */
    private static <T> Spliterator<T> m59165a(final Set<? extends T> set, String str) {
        if (!f48760d && f48757a) {
            if ("java.util.HashMap$EntrySet".equals(str)) {
                return HMSpliterators.m59075b((Set) set);
            }
            if ("java.util.HashMap$KeySet".equals(str) != null) {
                return HMSpliterators.m59072a((Set) set);
            }
        }
        if ((set instanceof LinkedHashSet) != null) {
            return m59161a((Collection) set, 17);
        }
        if (f48760d == null && f48757a != null && (set instanceof HashSet) != null) {
            return HMSpliterators.m59071a((HashSet) set);
        }
        if ((set instanceof SortedSet) != null) {
            return new IteratorSpliterator<T>(21, set) {
                public Comparator<? super T> getComparator() {
                    return ((SortedSet) set).comparator();
                }
            };
        }
        if ((f48757a == null && f48759c == null) || (set instanceof CopyOnWriteArraySet) == null) {
            return m59161a((Collection) set, 1);
        }
        return COWArraySetSpliterator.m59028a((CopyOnWriteArraySet) set);
    }

    /* renamed from: a */
    private static <T> Spliterator<T> m59164a(Queue<? extends T> queue) {
        if (queue instanceof ArrayBlockingQueue) {
            return m59161a((Collection) queue, 4368);
        }
        if (f48757a || f48759c) {
            if (queue instanceof LinkedBlockingQueue) {
                return LBQSpliterator.m63838a((LinkedBlockingQueue) queue);
            }
            if ((queue instanceof ArrayDeque) && !f48763g) {
                return ArrayDequeSpliterator.m63803a((ArrayDeque) queue);
            }
            if (queue instanceof LinkedBlockingDeque) {
                return LBDSpliterator.m63831a((LinkedBlockingDeque) queue);
            }
            if (queue instanceof PriorityBlockingQueue) {
                return PBQueueSpliterator.m63862a((PriorityBlockingQueue) queue);
            }
            if (queue instanceof PriorityQueue) {
                return PQueueSpliterator.m63865a((PriorityQueue) queue);
            }
        }
        if (!(queue instanceof Deque)) {
            if (!queue.getClass().getName().startsWith("java.util") || (queue instanceof PriorityBlockingQueue) || (queue instanceof PriorityQueue) || (queue instanceof DelayQueue) || (queue instanceof SynchronousQueue)) {
                return m59161a((Collection) queue, 0);
            }
        }
        return m59161a((Collection) queue, 16);
    }

    @IgnoreJava8API
    /* renamed from: b */
    private static <T> Spliterator<T> m59176b(Collection<? extends T> collection) {
        return new DelegatingSpliterator(collection.spliterator());
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59161a(Collection<? extends T> collection, int i) {
        return new IteratorSpliterator((Collection) Objects.m59115b(collection), i);
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59162a(Iterator<? extends T> it, int i) {
        return new IteratorSpliterator((Iterator) Objects.m59115b(it), i);
    }

    /* renamed from: c */
    public static <T> Iterator<T> m59178c(Spliterator<? extends T> spliterator) {
        Objects.m59115b(spliterator);
        return new AnonymousClass1Adapter(spliterator);
    }

    /* renamed from: a */
    public static java8.util.PrimitiveIterator.OfInt m59154a(java8.util.Spliterator.OfInt ofInt) {
        Objects.m59115b(ofInt);
        return new AnonymousClass2Adapter(ofInt);
    }

    /* renamed from: a */
    public static java8.util.PrimitiveIterator.OfLong m59155a(java8.util.Spliterator.OfLong ofLong) {
        Objects.m59115b(ofLong);
        return new AnonymousClass3Adapter(ofLong);
    }

    /* renamed from: a */
    public static java8.util.PrimitiveIterator.OfDouble m59153a(java8.util.Spliterator.OfDouble ofDouble) {
        Objects.m59115b(ofDouble);
        return new AnonymousClass4Adapter(ofDouble);
    }

    /* renamed from: a */
    private static boolean m59172a(final String str, final boolean z) {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            public /* synthetic */ Object run() {
                return m59142a();
            }

            /* renamed from: a */
            public java.lang.Boolean m59142a() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r3 = this;
                r0 = r2;
                r1 = r1;	 Catch:{ IllegalArgumentException -> 0x0017, IllegalArgumentException -> 0x0017 }
                r2 = r2;	 Catch:{ IllegalArgumentException -> 0x0017, IllegalArgumentException -> 0x0017 }
                r2 = java.lang.Boolean.toString(r2);	 Catch:{ IllegalArgumentException -> 0x0017, IllegalArgumentException -> 0x0017 }
                r1 = java.lang.System.getProperty(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0017, IllegalArgumentException -> 0x0017 }
                r1 = r1.trim();	 Catch:{ IllegalArgumentException -> 0x0017, IllegalArgumentException -> 0x0017 }
                r1 = java.lang.Boolean.parseBoolean(r1);	 Catch:{ IllegalArgumentException -> 0x0017, IllegalArgumentException -> 0x0017 }
                r0 = r1;
            L_0x0017:
                r0 = java.lang.Boolean.valueOf(r0);
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: java8.util.Spliterators.2.a():java.lang.Boolean");
            }
        })).booleanValue();
    }

    /* renamed from: a */
    private static boolean m59170a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = java8.util.Spliterators.class;	 Catch:{ Throwable -> 0x000c }
        r1 = r1.getClassLoader();	 Catch:{ Throwable -> 0x000c }
        r2 = java.lang.Class.forName(r2, r0, r1);	 Catch:{ Throwable -> 0x000c }
        goto L_0x000d;
    L_0x000c:
        r2 = 0;
    L_0x000d:
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.Spliterators.a(java.lang.String):boolean");
    }

    /* renamed from: e */
    private static boolean m59182e() {
        return m59171a("java.class.version", 51.0d);
    }

    /* renamed from: f */
    private static boolean m59183f() {
        return m59170a("org.robovm.rt.bro.Bro");
    }

    /* renamed from: g */
    private static boolean m59184g() {
        if (!m59170a("android.util.DisplayMetrics")) {
            if (!f48768l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m59185h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = m59184g();
        r1 = 0;
        if (r0 != 0) goto L_0x0012;
    L_0x0007:
        r0 = "java.class.version";
        r2 = 4632515166703976448; // 0x404a000000000000 float:0.0 double:52.0;
        r0 = m59171a(r0, r2);
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r0 = "java.util.function.Consumer";
        r2 = "java.util.Spliterator";
        r0 = new java.lang.String[]{r0, r2};
        r2 = r0.length;
        r3 = 0;
        r5 = r3;
        r4 = 0;
    L_0x001e:
        if (r4 >= r2) goto L_0x002a;
    L_0x0020:
        r5 = r0[r4];
        r5 = java.lang.Class.forName(r5);	 Catch:{ Exception -> 0x0029 }
        r4 = r4 + 1;
        goto L_0x001e;
    L_0x0029:
        return r1;
    L_0x002a:
        if (r5 == 0) goto L_0x0038;
    L_0x002c:
        r0 = java.util.Collection.class;	 Catch:{ Exception -> 0x0037 }
        r2 = "spliterator";	 Catch:{ Exception -> 0x0037 }
        r3 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0037 }
        r3 = r0.getDeclaredMethod(r2, r3);	 Catch:{ Exception -> 0x0037 }
        goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        r1 = 1;
    L_0x003b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.Spliterators.h():boolean");
    }

    /* renamed from: a */
    private static boolean m59171a(java.lang.String r2, double r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = java.lang.System.getProperty(r2);	 Catch:{ Exception -> 0x0010 }
        if (r2 == 0) goto L_0x0010;	 Catch:{ Exception -> 0x0010 }
    L_0x0006:
        r0 = java.lang.Double.parseDouble(r2);	 Catch:{ Exception -> 0x0010 }
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0010;
    L_0x000e:
        r2 = 1;
        return r2;
    L_0x0010:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.Spliterators.a(java.lang.String, double):boolean");
    }

    /* renamed from: b */
    private static boolean m59177b(String str) {
        if (!str.startsWith("java.util.Collections$", 0) || str.endsWith("RandomAccessList") == null) {
            return false;
        }
        return true;
    }

    @IgnoreJava8API
    /* renamed from: c */
    private static boolean m59180c(Collection<?> collection) {
        return (f48759c && !f48760d && collection.getClass().getName().startsWith("java.util.HashMap$")) ? collection.spliterator().hasCharacteristics(16) : null;
    }
}
