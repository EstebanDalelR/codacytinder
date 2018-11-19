package java8.util.stream;

import com.google.android.exoplayer2.Format;
import java.util.Comparator;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterators;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;
import java8.util.stream.Stream.Builder;

final class Streams {

    /* renamed from: java8.util.stream.Streams$2 */
    static class C157782 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ BaseStream f48922a;
        /* renamed from: b */
        final /* synthetic */ BaseStream f48923b;

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.f48922a;	 Catch:{ Throwable -> 0x000b }
            r0.close();	 Catch:{ Throwable -> 0x000b }
            r0 = r2.f48923b;
            r0.close();
            return;
        L_0x000b:
            r0 = move-exception;
            r1 = r2.f48923b;	 Catch:{ Throwable -> 0x0011 }
            r1.close();	 Catch:{ Throwable -> 0x0011 }
        L_0x0011:
            r1 = r0 instanceof java.lang.RuntimeException;
            if (r1 == 0) goto L_0x0018;
        L_0x0015:
            r0 = (java.lang.RuntimeException) r0;
            throw r0;
        L_0x0018:
            r1 = r0 instanceof java.lang.Error;
            if (r1 == 0) goto L_0x001f;
        L_0x001c:
            r0 = (java.lang.Error) r0;
            throw r0;
        L_0x001f:
            r1 = new java.lang.IllegalStateException;
            r1.<init>(r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.Streams.2.run():void");
        }
    }

    private static abstract class AbstractStreamBuilderImpl<T, S extends Spliterator<T>> implements Spliterator<T> {
        /* renamed from: a */
        int f54680a;

        public int characteristics() {
            return 17488;
        }

        public S trySplit() {
            return null;
        }

        private AbstractStreamBuilderImpl() {
        }

        public long estimateSize() {
            return (long) ((-this.f54680a) - 1);
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

    static abstract class ConcatSpliterator<T, T_SPLITR extends Spliterator<T>> implements Spliterator<T> {
        /* renamed from: a */
        protected final T_SPLITR f54681a;
        /* renamed from: b */
        protected final T_SPLITR f54682b;
        /* renamed from: c */
        boolean f54683c;
        /* renamed from: d */
        final boolean f54684d;

        private static abstract class OfPrimitive<T, T_CONS, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> extends ConcatSpliterator<T, T_SPLITR> implements java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR> {
            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfPrimitive trySplit() {
                return (java8.util.Spliterator.OfPrimitive) super.trySplit();
            }

            public boolean tryAdvance(T_CONS t_cons) {
                if (!this.c) {
                    return ((java8.util.Spliterator.OfPrimitive) this.b).tryAdvance(t_cons);
                }
                boolean tryAdvance = ((java8.util.Spliterator.OfPrimitive) this.a).tryAdvance(t_cons);
                if (tryAdvance) {
                    return tryAdvance;
                }
                this.c = false;
                return ((java8.util.Spliterator.OfPrimitive) this.b).tryAdvance(t_cons);
            }

            public void forEachRemaining(T_CONS t_cons) {
                if (this.c) {
                    ((java8.util.Spliterator.OfPrimitive) this.a).forEachRemaining(t_cons);
                }
                ((java8.util.Spliterator.OfPrimitive) this.b).forEachRemaining(t_cons);
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }
        }

        static class OfRef<T> extends ConcatSpliterator<T, Spliterator<T>> {
            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }
        }

        static class OfDouble extends OfPrimitive<Double, DoubleConsumer, java8.util.Spliterator.OfDouble> implements java8.util.Spliterator.OfDouble {
            public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
                super.forEachRemaining(doubleConsumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
                return super.tryAdvance(doubleConsumer);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfDouble trySplit() {
                return (java8.util.Spliterator.OfDouble) super.trySplit();
            }
        }

        static class OfInt extends OfPrimitive<Integer, IntConsumer, java8.util.Spliterator.OfInt> implements java8.util.Spliterator.OfInt {
            public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
                super.forEachRemaining(intConsumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
                return super.tryAdvance(intConsumer);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfInt trySplit() {
                return (java8.util.Spliterator.OfInt) super.trySplit();
            }
        }

        static class OfLong extends OfPrimitive<Long, LongConsumer, java8.util.Spliterator.OfLong> implements java8.util.Spliterator.OfLong {
            public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
                super.forEachRemaining(longConsumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
                return super.tryAdvance(longConsumer);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfLong trySplit() {
                return (java8.util.Spliterator.OfLong) super.trySplit();
            }
        }

        public T_SPLITR trySplit() {
            T_SPLITR trySplit = this.f54683c ? this.f54681a : this.f54682b.trySplit();
            this.f54683c = false;
            return trySplit;
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            if (!this.f54683c) {
                return this.f54682b.tryAdvance(consumer);
            }
            boolean tryAdvance = this.f54681a.tryAdvance(consumer);
            if (tryAdvance) {
                return tryAdvance;
            }
            this.f54683c = false;
            return this.f54682b.tryAdvance(consumer);
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            if (this.f54683c) {
                this.f54681a.forEachRemaining(consumer);
            }
            this.f54682b.forEachRemaining(consumer);
        }

        public long estimateSize() {
            if (!this.f54683c) {
                return this.f54682b.estimateSize();
            }
            long estimateSize = this.f54681a.estimateSize() + this.f54682b.estimateSize();
            if (estimateSize < 0) {
                estimateSize = Format.OFFSET_SAMPLE_RELATIVE;
            }
            return estimateSize;
        }

        public int characteristics() {
            if (!this.f54683c) {
                return this.f54682b.characteristics();
            }
            return (this.f54681a.characteristics() & this.f54682b.characteristics()) & (((this.f54684d ? 16448 : 0) | 5) ^ -1);
        }

        public Comparator<? super T> getComparator() {
            if (!this.f54683c) {
                return this.f54682b.getComparator();
            }
            throw new IllegalStateException();
        }
    }

    static final class StreamBuilderImpl<T> extends AbstractStreamBuilderImpl<T, Spliterator<T>> implements Builder<T> {
        /* renamed from: b */
        T f57741b;
        /* renamed from: c */
        SpinedBuffer<T> f57742c;

        StreamBuilderImpl() {
            super();
        }

        public void accept(T t) {
            if (this.a == 0) {
                this.f57741b = t;
                this.a++;
            } else if (this.a > 0) {
                if (this.f57742c == null) {
                    this.f57742c = new SpinedBuffer();
                    this.f57742c.accept(this.f57741b);
                    this.a++;
                }
                this.f57742c.accept(t);
            } else {
                throw new IllegalStateException();
            }
        }

        public Builder<T> add(T t) {
            accept(t);
            return this;
        }

        public Stream<T> build() {
            int i = this.a;
            if (i >= 0) {
                this.a = (-this.a) - 1;
                return i < 2 ? StreamSupport.m59709a((Spliterator) this, false) : StreamSupport.m59709a(this.f57742c.mo14029f(), false);
            } else {
                throw new IllegalStateException();
            }
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            if (this.a != -2) {
                return null;
            }
            consumer.accept(this.f57741b);
            this.a = -1;
            return true;
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            if (this.a == -2) {
                consumer.accept(this.f57741b);
                this.a = -1;
            }
        }
    }

    static final class DoubleStreamBuilderImpl extends AbstractStreamBuilderImpl<Double, OfDouble> implements OfDouble, DoubleStream.Builder {
        /* renamed from: b */
        double f59300b;
        /* renamed from: c */
        OfDouble f59301c;

        DoubleStreamBuilderImpl() {
            super();
        }

        public void accept(double d) {
            if (this.a == 0) {
                this.f59300b = d;
                this.a++;
            } else if (this.a > 0) {
                if (this.f59301c == null) {
                    this.f59301c = new OfDouble();
                    this.f59301c.accept(this.f59300b);
                    this.a++;
                }
                this.f59301c.accept(d);
            } else {
                throw new IllegalStateException();
            }
        }

        public DoubleStream.Builder add(double d) {
            accept(d);
            return this;
        }

        public DoubleStream build() {
            int i = this.a;
            if (i >= 0) {
                this.a = (-this.a) - 1;
                return i < 2 ? StreamSupport.m59705a((OfDouble) this, false) : StreamSupport.m59705a(this.f59301c.mo14147f(), false);
            } else {
                throw new IllegalStateException();
            }
        }

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            if (this.a != -2) {
                return null;
            }
            doubleConsumer.accept(this.f59300b);
            this.a = -1;
            return true;
        }

        public boolean tryAdvance(Consumer<? super Double> consumer) {
            return Spliterators.OfDouble.m59144a((OfDouble) this, (Consumer) consumer);
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            if (this.a == -2) {
                doubleConsumer.accept(this.f59300b);
                this.a = -1;
            }
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            Spliterators.OfDouble.m59145b(this, consumer);
        }
    }

    static final class IntStreamBuilderImpl extends AbstractStreamBuilderImpl<Integer, OfInt> implements OfInt, IntStream.Builder {
        /* renamed from: b */
        int f59302b;
        /* renamed from: c */
        OfInt f59303c;

        IntStreamBuilderImpl() {
            super();
        }

        public void accept(int i) {
            if (this.a == 0) {
                this.f59302b = i;
                this.a++;
            } else if (this.a > 0) {
                if (this.f59303c == null) {
                    this.f59303c = new OfInt();
                    this.f59303c.accept(this.f59302b);
                    this.a++;
                }
                this.f59303c.accept(i);
            } else {
                throw new IllegalStateException();
            }
        }

        public IntStream.Builder add(int i) {
            accept(i);
            return this;
        }

        public IntStream build() {
            int i = this.a;
            if (i >= 0) {
                this.a = (-this.a) - 1;
                return i < 2 ? StreamSupport.m59706a((OfInt) this, false) : StreamSupport.m59706a(this.f59303c.mo14149f(), false);
            } else {
                throw new IllegalStateException();
            }
        }

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            if (this.a != -2) {
                return null;
            }
            intConsumer.accept(this.f59302b);
            this.a = -1;
            return true;
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return Spliterators.OfInt.m59147a((OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            if (this.a == -2) {
                intConsumer.accept(this.f59302b);
                this.a = -1;
            }
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            Spliterators.OfInt.m59148b(this, consumer);
        }
    }

    static final class LongStreamBuilderImpl extends AbstractStreamBuilderImpl<Long, OfLong> implements OfLong, LongStream.Builder {
        /* renamed from: b */
        long f59304b;
        /* renamed from: c */
        OfLong f59305c;

        LongStreamBuilderImpl() {
            super();
        }

        public void accept(long j) {
            if (this.a == 0) {
                this.f59304b = j;
                this.a++;
            } else if (this.a > 0) {
                if (this.f59305c == null) {
                    this.f59305c = new OfLong();
                    this.f59305c.accept(this.f59304b);
                    this.a++;
                }
                this.f59305c.accept(j);
            } else {
                throw new IllegalStateException();
            }
        }

        public LongStream.Builder add(long j) {
            accept(j);
            return this;
        }

        public LongStream build() {
            int i = this.a;
            if (i >= 0) {
                this.a = (-this.a) - 1;
                return i < 2 ? StreamSupport.m59707a((OfLong) this, false) : StreamSupport.m59707a(this.f59305c.mo14151f(), false);
            } else {
                throw new IllegalStateException();
            }
        }

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            if (this.a != -2) {
                return null;
            }
            longConsumer.accept(this.f59304b);
            this.a = -1;
            return true;
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return Spliterators.OfLong.m59150a((OfLong) this, (Consumer) consumer);
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            if (this.a == -2) {
                longConsumer.accept(this.f59304b);
                this.a = -1;
            }
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            Spliterators.OfLong.m59151b(this, consumer);
        }
    }

    static final class RangeIntSpliterator implements OfInt {
        /* renamed from: a */
        private int f59306a;
        /* renamed from: b */
        private final int f59307b;
        /* renamed from: c */
        private int f59308c;

        public int characteristics() {
            return 17749;
        }

        public Comparator<? super Integer> getComparator() {
            return null;
        }

        private RangeIntSpliterator(int i, int i2, int i3) {
            this.f59306a = i;
            this.f59307b = i2;
            this.f59308c = i3;
        }

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            int i = this.f59306a;
            if (i < this.f59307b) {
                this.f59306a++;
                intConsumer.accept(i);
                return true;
            } else if (this.f59308c <= 0) {
                return false;
            } else {
                this.f59308c = 0;
                intConsumer.accept(i);
                return true;
            }
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return Spliterators.OfInt.m59147a((OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            int i = this.f59306a;
            int i2 = this.f59307b;
            int i3 = this.f59308c;
            this.f59306a = this.f59307b;
            this.f59308c = 0;
            while (i < i2) {
                int i4 = i + 1;
                intConsumer.accept(i);
                i = i4;
            }
            if (i3 > 0) {
                intConsumer.accept(i);
            }
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            Spliterators.OfInt.m59148b(this, consumer);
        }

        public long estimateSize() {
            return (((long) this.f59307b) - ((long) this.f59306a)) + ((long) this.f59308c);
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public OfInt trySplit() {
            long estimateSize = estimateSize();
            if (estimateSize <= 1) {
                return null;
            }
            int i = this.f59306a;
            int a = this.f59306a + m67937a(estimateSize);
            this.f59306a = a;
            return new RangeIntSpliterator(i, a, 0);
        }

        /* renamed from: a */
        private int m67937a(long j) {
            return (int) (j / ((long) (j < 16777216 ? 2 : 8)));
        }
    }

    static final class RangeLongSpliterator implements OfLong {
        /* renamed from: a */
        private long f59309a;
        /* renamed from: b */
        private final long f59310b;
        /* renamed from: c */
        private int f59311c;

        public int characteristics() {
            return 17749;
        }

        public Comparator<? super Long> getComparator() {
            return null;
        }

        private RangeLongSpliterator(long j, long j2, int i) {
            this.f59309a = j;
            this.f59310b = j2;
            this.f59311c = i;
        }

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long j = this.f59309a;
            if (j < this.f59310b) {
                this.f59309a++;
                longConsumer.accept(j);
                return true;
            } else if (this.f59311c <= 0) {
                return false;
            } else {
                this.f59311c = 0;
                longConsumer.accept(j);
                return true;
            }
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return Spliterators.OfLong.m59150a((OfLong) this, (Consumer) consumer);
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long j = this.f59309a;
            long j2 = this.f59310b;
            int i = this.f59311c;
            this.f59309a = this.f59310b;
            this.f59311c = 0;
            while (j < j2) {
                long j3 = j + 1;
                longConsumer.accept(j);
                j = j3;
            }
            if (i > 0) {
                longConsumer.accept(j);
            }
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            Spliterators.OfLong.m59151b(this, consumer);
        }

        public long estimateSize() {
            return (this.f59310b - this.f59309a) + ((long) this.f59311c);
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public OfLong trySplit() {
            long estimateSize = estimateSize();
            if (estimateSize <= 1) {
                return null;
            }
            long j = this.f59309a;
            long a = this.f59309a + m67938a(estimateSize);
            this.f59309a = a;
            return new RangeLongSpliterator(j, a, 0);
        }

        /* renamed from: a */
        private long m67938a(long j) {
            return j / (j < 16777216 ? 2 : 8);
        }
    }

    private Streams() {
        throw new Error("no instances");
    }

    /* renamed from: a */
    static Runnable m59710a(final Runnable runnable, final Runnable runnable2) {
        return new Runnable() {
            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r2 = this;
                r0 = r1;	 Catch:{ Throwable -> 0x000b }
                r0.run();	 Catch:{ Throwable -> 0x000b }
                r0 = r2;
                r0.run();
                return;
            L_0x000b:
                r0 = move-exception;
                r1 = r2;	 Catch:{ Throwable -> 0x0011 }
                r1.run();	 Catch:{ Throwable -> 0x0011 }
            L_0x0011:
                r1 = r0 instanceof java.lang.RuntimeException;
                if (r1 == 0) goto L_0x0018;
            L_0x0015:
                r0 = (java.lang.RuntimeException) r0;
                throw r0;
            L_0x0018:
                r1 = r0 instanceof java.lang.Error;
                if (r1 == 0) goto L_0x001f;
            L_0x001c:
                r0 = (java.lang.Error) r0;
                throw r0;
            L_0x001f:
                r1 = new java.lang.IllegalStateException;
                r1.<init>(r0);
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.Streams.1.run():void");
            }
        };
    }
}
