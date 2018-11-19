package java8.util.stream;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterators;
import java8.util.concurrent.ForkJoinPool;
import java8.util.function.BooleanSupplier;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.DoubleSupplier;
import java8.util.function.IntConsumer;
import java8.util.function.IntSupplier;
import java8.util.function.LongConsumer;
import java8.util.function.LongSupplier;
import java8.util.function.Supplier;

class StreamSpliterators {

    static abstract class ArrayBuffer {
        /* renamed from: a */
        int f48909a;

        static abstract class OfPrimitive<T_CONS> extends ArrayBuffer {
            /* renamed from: c */
            int f54657c;

            /* renamed from: a */
            abstract void mo13766a(T_CONS t_cons, long j);

            OfPrimitive() {
            }

            /* renamed from: a */
            void mo13006a() {
                this.f54657c = 0;
            }
        }

        static final class OfRef<T> extends ArrayBuffer implements Consumer<T> {
            /* renamed from: b */
            final Object[] f54658b;

            OfRef(int i) {
                this.f54658b = new Object[i];
            }

            public void accept(T t) {
                Object[] objArr = this.f54658b;
                int i = this.a;
                this.a = i + 1;
                objArr[i] = t;
            }

            /* renamed from: a */
            public void m64096a(Consumer<? super T> consumer, long j) {
                for (int i = 0; ((long) i) < j; i++) {
                    consumer.accept(this.f54658b[i]);
                }
            }
        }

        static final class OfDouble extends OfPrimitive<DoubleConsumer> implements DoubleConsumer {
            /* renamed from: b */
            final double[] f57737b;

            OfDouble(int i) {
                this.f57737b = new double[i];
            }

            public void accept(double d) {
                double[] dArr = this.f57737b;
                int i = this.c;
                this.c = i + 1;
                dArr[i] = d;
            }

            /* renamed from: a */
            void m66869a(DoubleConsumer doubleConsumer, long j) {
                for (int i = 0; ((long) i) < j; i++) {
                    doubleConsumer.accept(this.f57737b[i]);
                }
            }
        }

        static final class OfInt extends OfPrimitive<IntConsumer> implements IntConsumer {
            /* renamed from: b */
            final int[] f57738b;

            OfInt(int i) {
                this.f57738b = new int[i];
            }

            public void accept(int i) {
                int[] iArr = this.f57738b;
                int i2 = this.c;
                this.c = i2 + 1;
                iArr[i2] = i;
            }

            /* renamed from: a */
            public void m66871a(IntConsumer intConsumer, long j) {
                for (int i = 0; ((long) i) < j; i++) {
                    intConsumer.accept(this.f57738b[i]);
                }
            }
        }

        static final class OfLong extends OfPrimitive<LongConsumer> implements LongConsumer {
            /* renamed from: b */
            final long[] f57739b;

            OfLong(int i) {
                this.f57739b = new long[i];
            }

            public void accept(long j) {
                long[] jArr = this.f57739b;
                int i = this.c;
                this.c = i + 1;
                jArr[i] = j;
            }

            /* renamed from: a */
            public void m66873a(LongConsumer longConsumer, long j) {
                for (int i = 0; ((long) i) < j; i++) {
                    longConsumer.accept(this.f57739b[i]);
                }
            }
        }

        ArrayBuffer() {
        }

        /* renamed from: a */
        void mo13006a() {
            this.f48909a = 0;
        }
    }

    static abstract class SliceSpliterator<T, T_SPLITR extends Spliterator<T>> {
        /* renamed from: a */
        final long f48910a;
        /* renamed from: b */
        final long f48911b;
        /* renamed from: c */
        T_SPLITR f48912c;
        /* renamed from: d */
        long f48913d;
        /* renamed from: e */
        long f48914e;

        static final class OfRef<T> extends SliceSpliterator<T, Spliterator<T>> implements Spliterator<T> {
            /* renamed from: c */
            private static /* synthetic */ void m64112c(Object obj) {
            }

            /* renamed from: d */
            private static /* synthetic */ void m64113d(Object obj) {
            }

            OfRef(Spliterator<T> spliterator, long j, long j2) {
                long j3 = j2;
                this(spliterator, j, j3, 0, Math.min(spliterator.estimateSize(), j3));
            }

            private OfRef(Spliterator<T> spliterator, long j, long j2, long j3, long j4) {
                super(spliterator, j, j2, j3, j4);
            }

            /* renamed from: a */
            protected Spliterator<T> mo13008a(Spliterator<T> spliterator, long j, long j2, long j3, long j4) {
                return new OfRef(spliterator, j, j2, j3, j4);
            }

            public boolean tryAdvance(Consumer<? super T> consumer) {
                Objects.m59115b(consumer);
                if (this.a >= this.e) {
                    return false;
                }
                while (this.a > this.d) {
                    this.c.tryAdvance(StreamSpliterators$SliceSpliterator$OfRef$$Lambda$1.m64108a());
                    this.d++;
                }
                if (this.d >= this.e) {
                    return false;
                }
                this.d++;
                return this.c.tryAdvance(consumer);
            }

            public void forEachRemaining(Consumer<? super T> consumer) {
                Objects.m59115b(consumer);
                if (this.a < this.e && this.d < this.e) {
                    if (this.d < this.a || this.d + this.c.estimateSize() > this.b) {
                        while (this.a > this.d) {
                            this.c.tryAdvance(StreamSpliterators$SliceSpliterator$OfRef$$Lambda$2.m64109a());
                            this.d++;
                        }
                        while (this.d < this.e) {
                            this.c.tryAdvance(consumer);
                            this.d++;
                        }
                    } else {
                        this.c.forEachRemaining(consumer);
                        this.d = this.e;
                    }
                }
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

        static abstract class OfPrimitive<T, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>, T_CONS> extends SliceSpliterator<T, T_SPLITR> implements java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR> {
            /* renamed from: b */
            protected abstract T_CONS mo14034b();

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfPrimitive trySplit() {
                return (java8.util.Spliterator.OfPrimitive) super.trySplit();
            }

            OfPrimitive(T_SPLITR t_splitr, long j, long j2) {
                long j3 = j2;
                this(t_splitr, j, j3, 0, Math.min(t_splitr.estimateSize(), j3));
            }

            OfPrimitive(T_SPLITR t_splitr, long j, long j2, long j3, long j4) {
                super(t_splitr, j, j2, j3, j4);
            }

            public boolean tryAdvance(T_CONS t_cons) {
                Objects.m59115b(t_cons);
                if (this.a >= this.e) {
                    return false;
                }
                while (this.a > this.d) {
                    ((java8.util.Spliterator.OfPrimitive) this.c).tryAdvance(mo14034b());
                    this.d++;
                }
                if (this.d >= this.e) {
                    return false;
                }
                this.d++;
                return ((java8.util.Spliterator.OfPrimitive) this.c).tryAdvance(t_cons);
            }

            public void forEachRemaining(T_CONS t_cons) {
                Objects.m59115b(t_cons);
                if (this.a < this.e && this.d < this.e) {
                    if (this.d < this.a || this.d + ((java8.util.Spliterator.OfPrimitive) this.c).estimateSize() > this.b) {
                        while (this.a > this.d) {
                            ((java8.util.Spliterator.OfPrimitive) this.c).tryAdvance(mo14034b());
                            this.d++;
                        }
                        while (this.d < this.e) {
                            ((java8.util.Spliterator.OfPrimitive) this.c).tryAdvance(t_cons);
                            this.d++;
                        }
                    } else {
                        ((java8.util.Spliterator.OfPrimitive) this.c).forEachRemaining(t_cons);
                        this.d = this.e;
                    }
                }
            }
        }

        static final class OfDouble extends OfPrimitive<Double, java8.util.Spliterator.OfDouble, DoubleConsumer> implements java8.util.Spliterator.OfDouble {
            /* renamed from: b */
            private static /* synthetic */ void m67902b(double d) {
            }

            /* renamed from: b */
            protected /* synthetic */ Object mo14034b() {
                return m67905a();
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfDouble trySplit() {
                return (java8.util.Spliterator.OfDouble) super.trySplit();
            }

            OfDouble(java8.util.Spliterator.OfDouble ofDouble, long j, long j2) {
                super(ofDouble, j, j2);
            }

            OfDouble(java8.util.Spliterator.OfDouble ofDouble, long j, long j2, long j3, long j4) {
                super(ofDouble, j, j2, j3, j4);
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
                return java8.util.Spliterators.OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Double> consumer) {
                java8.util.Spliterators.OfDouble.m59145b(this, consumer);
            }

            /* renamed from: a */
            protected java8.util.Spliterator.OfDouble m67903a(java8.util.Spliterator.OfDouble ofDouble, long j, long j2, long j3, long j4) {
                return new OfDouble(ofDouble, j, j2, j3, j4);
            }

            /* renamed from: a */
            protected DoubleConsumer m67905a() {
                return StreamSpliterators$SliceSpliterator$OfDouble$$Lambda$1.m64105a();
            }
        }

        static final class OfInt extends OfPrimitive<Integer, java8.util.Spliterator.OfInt, IntConsumer> implements java8.util.Spliterator.OfInt {
            /* renamed from: b */
            private static /* synthetic */ void m67908b(int i) {
            }

            /* renamed from: b */
            protected /* synthetic */ Object mo14034b() {
                return m67911a();
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfInt trySplit() {
                return (java8.util.Spliterator.OfInt) super.trySplit();
            }

            OfInt(java8.util.Spliterator.OfInt ofInt, long j, long j2) {
                super(ofInt, j, j2);
            }

            OfInt(java8.util.Spliterator.OfInt ofInt, long j, long j2, long j3, long j4) {
                super(ofInt, j, j2, j3, j4);
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
                return java8.util.Spliterators.OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Integer> consumer) {
                java8.util.Spliterators.OfInt.m59148b(this, consumer);
            }

            /* renamed from: a */
            protected java8.util.Spliterator.OfInt m67909a(java8.util.Spliterator.OfInt ofInt, long j, long j2, long j3, long j4) {
                return new OfInt(ofInt, j, j2, j3, j4);
            }

            /* renamed from: a */
            protected IntConsumer m67911a() {
                return StreamSpliterators$SliceSpliterator$OfInt$$Lambda$1.m64106a();
            }
        }

        static final class OfLong extends OfPrimitive<Long, java8.util.Spliterator.OfLong, LongConsumer> implements java8.util.Spliterator.OfLong {
            /* renamed from: b */
            private static /* synthetic */ void m67914b(long j) {
            }

            /* renamed from: b */
            protected /* synthetic */ Object mo14034b() {
                return m67917a();
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfLong trySplit() {
                return (java8.util.Spliterator.OfLong) super.trySplit();
            }

            OfLong(java8.util.Spliterator.OfLong ofLong, long j, long j2) {
                super(ofLong, j, j2);
            }

            OfLong(java8.util.Spliterator.OfLong ofLong, long j, long j2, long j3, long j4) {
                super(ofLong, j, j2, j3, j4);
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
                return java8.util.Spliterators.OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Long> consumer) {
                java8.util.Spliterators.OfLong.m59151b(this, consumer);
            }

            /* renamed from: a */
            protected java8.util.Spliterator.OfLong m67915a(java8.util.Spliterator.OfLong ofLong, long j, long j2, long j3, long j4) {
                return new OfLong(ofLong, j, j2, j3, j4);
            }

            /* renamed from: a */
            protected LongConsumer m67917a() {
                return StreamSpliterators$SliceSpliterator$OfLong$$Lambda$1.m64107a();
            }
        }

        /* renamed from: a */
        protected abstract T_SPLITR mo13008a(T_SPLITR t_splitr, long j, long j2, long j3, long j4);

        SliceSpliterator(T_SPLITR t_splitr, long j, long j2, long j3, long j4) {
            this.f48912c = t_splitr;
            this.f48910a = j;
            this.f48911b = j2;
            this.f48913d = j3;
            this.f48914e = j4;
        }

        public T_SPLITR trySplit() {
            if (this.f48910a >= this.f48914e || this.f48913d >= this.f48914e) {
                return null;
            }
            while (true) {
                long min;
                T_SPLITR trySplit = this.f48912c.trySplit();
                if (trySplit != null) {
                    long estimateSize = this.f48913d + trySplit.estimateSize();
                    min = Math.min(estimateSize, this.f48911b);
                    if (this.f48910a < min) {
                        if (min < this.f48911b) {
                            break;
                        }
                        this.f48912c = trySplit;
                        this.f48914e = min;
                    } else {
                        this.f48913d = min;
                    }
                } else {
                    return null;
                }
            }
            if (this.f48913d < this.f48910a || estimateSize > this.f48911b) {
                long j = this.f48910a;
                estimateSize = this.f48911b;
                long j2 = this.f48913d;
                this.f48913d = min;
                return mo13008a(trySplit, j, estimateSize, j2, min);
            }
            this.f48913d = min;
            return trySplit;
        }

        public long estimateSize() {
            return this.f48910a < this.f48914e ? this.f48914e - Math.max(this.f48910a, this.f48913d) : 0;
        }

        public int characteristics() {
            return this.f48912c.characteristics();
        }
    }

    static abstract class UnorderedSliceSpliterator<T, T_SPLITR extends Spliterator<T>> {
        /* renamed from: a */
        protected final T_SPLITR f48915a;
        /* renamed from: b */
        protected final boolean f48916b;
        /* renamed from: c */
        protected final int f48917c;
        /* renamed from: d */
        private final long f48918d;
        /* renamed from: e */
        private final AtomicLong f48919e;

        enum PermitStatus {
            NO_MORE,
            MAYBE_MORE,
            UNLIMITED
        }

        static final class OfRef<T> extends UnorderedSliceSpliterator<T, Spliterator<T>> implements Spliterator<T>, Consumer<T> {
            /* renamed from: d */
            T f54676d;

            OfRef(Spliterator<T> spliterator, long j, long j2) {
                super(spliterator, j, j2);
            }

            OfRef(Spliterator<T> spliterator, OfRef<T> ofRef) {
                super(spliterator, ofRef);
            }

            public final void accept(T t) {
                this.f54676d = t;
            }

            public boolean tryAdvance(Consumer<? super T> consumer) {
                Objects.m59115b(consumer);
                while (m59704a() != PermitStatus.NO_MORE && this.a.tryAdvance(this)) {
                    if (m59702a(1) == 1) {
                        consumer.accept(this.f54676d);
                        this.f54676d = null;
                        return true;
                    }
                }
                return false;
            }

            public void forEachRemaining(Consumer<? super T> consumer) {
                Objects.m59115b(consumer);
                OfRef ofRef = null;
                while (true) {
                    PermitStatus a = m59704a();
                    if (a == PermitStatus.NO_MORE) {
                        return;
                    }
                    if (a == PermitStatus.MAYBE_MORE) {
                        if (ofRef == null) {
                            ofRef = new OfRef(this.c);
                        } else {
                            ofRef.mo13006a();
                        }
                        long j = 0;
                        while (this.a.tryAdvance(ofRef)) {
                            long j2 = j + 1;
                            if (j2 >= ((long) this.c)) {
                                j = j2;
                                break;
                            }
                            j = j2;
                        }
                        if (j != 0) {
                            ofRef.m64096a(consumer, m59702a(j));
                        } else {
                            return;
                        }
                    }
                    this.a.forEachRemaining(consumer);
                    return;
                }
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

            /* renamed from: a */
            protected Spliterator<T> mo13009a(Spliterator<T> spliterator) {
                return new OfRef(spliterator, this);
            }
        }

        static abstract class OfPrimitive<T, T_CONS, T_BUFF extends OfPrimitive<T_CONS>, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> extends UnorderedSliceSpliterator<T, T_SPLITR> implements java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR> {
            /* renamed from: a */
            protected abstract void mo14035a(T_CONS t_cons);

            /* renamed from: b */
            protected abstract T_BUFF mo14036b(int i);

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfPrimitive trySplit() {
                return (java8.util.Spliterator.OfPrimitive) super.trySplit();
            }

            OfPrimitive(T_SPLITR t_splitr, long j, long j2) {
                super(t_splitr, j, j2);
            }

            OfPrimitive(T_SPLITR t_splitr, OfPrimitive<T, T_CONS, T_BUFF, T_SPLITR> ofPrimitive) {
                super(t_splitr, ofPrimitive);
            }

            public boolean tryAdvance(T_CONS t_cons) {
                Objects.m59115b(t_cons);
                while (m59704a() != PermitStatus.NO_MORE && ((java8.util.Spliterator.OfPrimitive) this.a).tryAdvance(this)) {
                    if (m59702a(1) == 1) {
                        mo14035a(t_cons);
                        return true;
                    }
                }
                return false;
            }

            public void forEachRemaining(T_CONS t_cons) {
                Objects.m59115b(t_cons);
                OfPrimitive ofPrimitive = null;
                while (true) {
                    PermitStatus a = m59704a();
                    if (a == PermitStatus.NO_MORE) {
                        return;
                    }
                    if (a == PermitStatus.MAYBE_MORE) {
                        if (ofPrimitive == null) {
                            ofPrimitive = mo14036b(this.c);
                        } else {
                            ofPrimitive.mo13006a();
                        }
                        long j = 0;
                        while (((java8.util.Spliterator.OfPrimitive) this.a).tryAdvance(ofPrimitive)) {
                            long j2 = j + 1;
                            if (j2 >= ((long) this.c)) {
                                j = j2;
                                break;
                            }
                            j = j2;
                        }
                        if (j != 0) {
                            ofPrimitive.mo13766a(t_cons, m59702a(j));
                        } else {
                            return;
                        }
                    }
                    ((java8.util.Spliterator.OfPrimitive) this.a).forEachRemaining(t_cons);
                    return;
                }
            }
        }

        static final class OfDouble extends OfPrimitive<Double, DoubleConsumer, OfDouble, java8.util.Spliterator.OfDouble> implements java8.util.Spliterator.OfDouble, DoubleConsumer {
            /* renamed from: d */
            double f59297d;

            /* renamed from: b */
            protected /* synthetic */ OfPrimitive mo14036b(int i) {
                return m67921a(i);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfDouble trySplit() {
                return (java8.util.Spliterator.OfDouble) super.trySplit();
            }

            OfDouble(java8.util.Spliterator.OfDouble ofDouble, long j, long j2) {
                super(ofDouble, j, j2);
            }

            OfDouble(java8.util.Spliterator.OfDouble ofDouble, OfDouble ofDouble2) {
                super(ofDouble, ofDouble2);
            }

            public void accept(double d) {
                this.f59297d = d;
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
                return java8.util.Spliterators.OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Double> consumer) {
                java8.util.Spliterators.OfDouble.m59145b(this, consumer);
            }

            /* renamed from: a */
            protected void m67923a(DoubleConsumer doubleConsumer) {
                doubleConsumer.accept(this.f59297d);
            }

            /* renamed from: a */
            protected OfDouble m67921a(int i) {
                return new OfDouble(i);
            }

            /* renamed from: a */
            protected java8.util.Spliterator.OfDouble m67919a(java8.util.Spliterator.OfDouble ofDouble) {
                return new OfDouble(ofDouble, this);
            }
        }

        static final class OfInt extends OfPrimitive<Integer, IntConsumer, OfInt, java8.util.Spliterator.OfInt> implements java8.util.Spliterator.OfInt, IntConsumer {
            /* renamed from: d */
            int f59298d;

            /* renamed from: b */
            protected /* synthetic */ OfPrimitive mo14036b(int i) {
                return m67927a(i);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfInt trySplit() {
                return (java8.util.Spliterator.OfInt) super.trySplit();
            }

            OfInt(java8.util.Spliterator.OfInt ofInt, long j, long j2) {
                super(ofInt, j, j2);
            }

            OfInt(java8.util.Spliterator.OfInt ofInt, OfInt ofInt2) {
                super(ofInt, ofInt2);
            }

            public void accept(int i) {
                this.f59298d = i;
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
                return java8.util.Spliterators.OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Integer> consumer) {
                java8.util.Spliterators.OfInt.m59148b(this, consumer);
            }

            /* renamed from: a */
            protected void m67929a(IntConsumer intConsumer) {
                intConsumer.accept(this.f59298d);
            }

            /* renamed from: a */
            protected OfInt m67927a(int i) {
                return new OfInt(i);
            }

            /* renamed from: a */
            protected java8.util.Spliterator.OfInt m67925a(java8.util.Spliterator.OfInt ofInt) {
                return new OfInt(ofInt, this);
            }
        }

        static final class OfLong extends OfPrimitive<Long, LongConsumer, OfLong, java8.util.Spliterator.OfLong> implements java8.util.Spliterator.OfLong, LongConsumer {
            /* renamed from: d */
            long f59299d;

            /* renamed from: b */
            protected /* synthetic */ OfPrimitive mo14036b(int i) {
                return m67933a(i);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfLong trySplit() {
                return (java8.util.Spliterator.OfLong) super.trySplit();
            }

            OfLong(java8.util.Spliterator.OfLong ofLong, long j, long j2) {
                super(ofLong, j, j2);
            }

            OfLong(java8.util.Spliterator.OfLong ofLong, OfLong ofLong2) {
                super(ofLong, ofLong2);
            }

            public void accept(long j) {
                this.f59299d = j;
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
                return java8.util.Spliterators.OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Long> consumer) {
                java8.util.Spliterators.OfLong.m59151b(this, consumer);
            }

            /* renamed from: a */
            protected void m67935a(LongConsumer longConsumer) {
                longConsumer.accept(this.f59299d);
            }

            /* renamed from: a */
            protected OfLong m67933a(int i) {
                return new OfLong(i);
            }

            /* renamed from: a */
            protected java8.util.Spliterator.OfLong m67931a(java8.util.Spliterator.OfLong ofLong) {
                return new OfLong(ofLong, this);
            }
        }

        /* renamed from: a */
        protected abstract T_SPLITR mo13009a(T_SPLITR t_splitr);

        UnorderedSliceSpliterator(T_SPLITR t_splitr, long j, long j2) {
            this.f48915a = t_splitr;
            this.f48916b = j2 < 0 ? true : null;
            this.f48918d = j2 >= 0 ? j2 : 0;
            this.f48917c = j2 >= 0 ? (int) Math.min(128, ((j + j2) / ((long) AbstractTask.f57634c)) + 1) : ProfileEditingConfig.DEFAULT_MAX_LENGTH;
            if (j2 >= 0) {
                j += j2;
            }
            this.f48919e = new AtomicLong(j);
        }

        UnorderedSliceSpliterator(T_SPLITR t_splitr, UnorderedSliceSpliterator<T, T_SPLITR> unorderedSliceSpliterator) {
            this.f48915a = t_splitr;
            this.f48916b = unorderedSliceSpliterator.f48916b;
            this.f48919e = unorderedSliceSpliterator.f48919e;
            this.f48918d = unorderedSliceSpliterator.f48918d;
            this.f48917c = unorderedSliceSpliterator.f48917c;
        }

        /* renamed from: a */
        protected final long m59702a(long j) {
            long min;
            long j2;
            do {
                j2 = this.f48919e.get();
                if (j2 != 0) {
                    min = Math.min(j2, j);
                    if (min <= 0) {
                        break;
                    }
                } else {
                    if (!this.f48916b) {
                        j = 0;
                    }
                    return j;
                }
            } while (!this.f48919e.compareAndSet(j2, j2 - min));
            if (this.f48916b) {
                return Math.max(j - min, 0);
            }
            return j2 > this.f48918d ? Math.max(min - (j2 - this.f48918d), 0) : min;
        }

        /* renamed from: a */
        protected final PermitStatus m59704a() {
            if (this.f48919e.get() > 0) {
                return PermitStatus.MAYBE_MORE;
            }
            return this.f48916b ? PermitStatus.UNLIMITED : PermitStatus.NO_MORE;
        }

        public final T_SPLITR trySplit() {
            T_SPLITR t_splitr = null;
            if (this.f48919e.get() == 0) {
                return null;
            }
            Spliterator trySplit = this.f48915a.trySplit();
            if (trySplit != null) {
                t_splitr = mo13009a(trySplit);
            }
            return t_splitr;
        }

        public final long estimateSize() {
            return this.f48915a.estimateSize();
        }

        public final int characteristics() {
            return this.f48915a.characteristics() & -16465;
        }
    }

    private static abstract class AbstractWrappingSpliterator<P_IN, P_OUT, T_BUFFER extends AbstractSpinedBuffer> implements Spliterator<P_OUT> {
        /* renamed from: a */
        final boolean f54648a;
        /* renamed from: b */
        final PipelineHelper<P_OUT> f54649b;
        /* renamed from: c */
        Spliterator<P_IN> f54650c;
        /* renamed from: d */
        Sink<P_IN> f54651d;
        /* renamed from: e */
        BooleanSupplier f54652e;
        /* renamed from: f */
        long f54653f;
        /* renamed from: g */
        T_BUFFER f54654g;
        /* renamed from: h */
        boolean f54655h;
        /* renamed from: i */
        private Supplier<Spliterator<P_IN>> f54656i;

        /* renamed from: a */
        abstract AbstractWrappingSpliterator<P_IN, P_OUT, ?> mo13767a(Spliterator<P_IN> spliterator);

        /* renamed from: c */
        abstract void mo13768c();

        AbstractWrappingSpliterator(PipelineHelper<P_OUT> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
            this.f54649b = pipelineHelper;
            this.f54656i = supplier;
            this.f54650c = null;
            this.f54648a = z;
        }

        AbstractWrappingSpliterator(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
            this.f54649b = pipelineHelper;
            this.f54656i = null;
            this.f54650c = spliterator;
            this.f54648a = z;
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        /* renamed from: a */
        final void m64091a() {
            if (this.f54650c == null) {
                this.f54650c = (Spliterator) this.f54656i.get();
                this.f54656i = null;
            }
        }

        /* renamed from: b */
        final boolean m64092b() {
            boolean z = false;
            if (this.f54654g != null) {
                this.f54653f++;
                if (this.f54653f < this.f54654g.m59410c()) {
                    z = true;
                }
                if (!z) {
                    this.f54653f = 0;
                    this.f54654g.mo13005d();
                    z = m64089d();
                }
                return z;
            } else if (this.f54655h) {
                return false;
            } else {
                m64091a();
                mo13768c();
                this.f54653f = 0;
                this.f54651d.mo13608a(this.f54650c.getExactSizeIfKnown());
                return m64089d();
            }
        }

        public Spliterator<P_OUT> trySplit() {
            Spliterator<P_OUT> spliterator = null;
            if (!this.f54648a || this.f54654g != null || this.f54655h) {
                return null;
            }
            m64091a();
            Spliterator trySplit = this.f54650c.trySplit();
            if (trySplit != null) {
                spliterator = mo13767a(trySplit);
            }
            return spliterator;
        }

        /* renamed from: d */
        private boolean m64089d() {
            while (this.f54654g.m59410c() == 0) {
                if (this.f54651d.mo13612b() || !this.f54652e.getAsBoolean()) {
                    if (this.f54655h) {
                        return false;
                    }
                    this.f54651d.z_();
                    this.f54655h = true;
                }
            }
            return true;
        }

        public final long estimateSize() {
            m64091a();
            return this.f54650c.estimateSize();
        }

        public final long getExactSizeIfKnown() {
            m64091a();
            return StreamOpFlag.SIZED.isKnown(this.f54649b.mo12969c()) ? this.f54650c.getExactSizeIfKnown() : -1;
        }

        public final int characteristics() {
            m64091a();
            int toCharacteristics = StreamOpFlag.toCharacteristics(StreamOpFlag.toStreamFlags(this.f54649b.mo12969c()));
            return (toCharacteristics & 64) != 0 ? (toCharacteristics & -16449) | (this.f54650c.characteristics() & 16448) : toCharacteristics;
        }

        public Comparator<? super P_OUT> getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        public final String toString() {
            return String.format("%s[%s]", new Object[]{getClass().getName(), this.f54650c});
        }
    }

    static class DelegatingSpliterator<T, T_SPLITR extends Spliterator<T>> implements Spliterator<T> {
        /* renamed from: a */
        private final Supplier<? extends T_SPLITR> f54659a;
        /* renamed from: b */
        private T_SPLITR f54660b;

        static class OfPrimitive<T, T_CONS, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> extends DelegatingSpliterator<T, T_SPLITR> implements java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR> {
            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfPrimitive trySplit() {
                return (java8.util.Spliterator.OfPrimitive) super.trySplit();
            }

            OfPrimitive(Supplier<? extends T_SPLITR> supplier) {
                super(supplier);
            }

            public boolean tryAdvance(T_CONS t_cons) {
                return ((java8.util.Spliterator.OfPrimitive) m64097a()).tryAdvance(t_cons);
            }

            public void forEachRemaining(T_CONS t_cons) {
                ((java8.util.Spliterator.OfPrimitive) m64097a()).forEachRemaining(t_cons);
            }
        }

        static final class OfDouble extends OfPrimitive<Double, DoubleConsumer, java8.util.Spliterator.OfDouble> implements java8.util.Spliterator.OfDouble {
            public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
                super.forEachRemaining(doubleConsumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
                return super.tryAdvance(doubleConsumer);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfDouble trySplit() {
                return (java8.util.Spliterator.OfDouble) super.trySplit();
            }

            OfDouble(Supplier<java8.util.Spliterator.OfDouble> supplier) {
                super(supplier);
            }
        }

        static final class OfInt extends OfPrimitive<Integer, IntConsumer, java8.util.Spliterator.OfInt> implements java8.util.Spliterator.OfInt {
            public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
                super.forEachRemaining(intConsumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
                return super.tryAdvance(intConsumer);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfInt trySplit() {
                return (java8.util.Spliterator.OfInt) super.trySplit();
            }

            OfInt(Supplier<java8.util.Spliterator.OfInt> supplier) {
                super(supplier);
            }
        }

        static final class OfLong extends OfPrimitive<Long, LongConsumer, java8.util.Spliterator.OfLong> implements java8.util.Spliterator.OfLong {
            public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
                super.forEachRemaining(longConsumer);
            }

            public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
                return super.tryAdvance(longConsumer);
            }

            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfLong trySplit() {
                return (java8.util.Spliterator.OfLong) super.trySplit();
            }

            OfLong(Supplier<java8.util.Spliterator.OfLong> supplier) {
                super(supplier);
            }
        }

        DelegatingSpliterator(Supplier<? extends T_SPLITR> supplier) {
            this.f54659a = supplier;
        }

        /* renamed from: a */
        T_SPLITR m64097a() {
            if (this.f54660b == null) {
                this.f54660b = (Spliterator) this.f54659a.get();
            }
            return this.f54660b;
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public T_SPLITR trySplit() {
            return m64097a().trySplit();
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            return m64097a().tryAdvance(consumer);
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            m64097a().forEachRemaining(consumer);
        }

        public long estimateSize() {
            return m64097a().estimateSize();
        }

        public int characteristics() {
            return m64097a().characteristics();
        }

        public Comparator<? super T> getComparator() {
            return m64097a().getComparator();
        }

        public long getExactSizeIfKnown() {
            return m64097a().getExactSizeIfKnown();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append("[");
            stringBuilder.append(m64097a());
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    static final class DistinctSpliterator<T> implements Spliterator<T>, Consumer<T> {
        /* renamed from: a */
        private static final Object f54663a = new Object();
        /* renamed from: b */
        private final Spliterator<T> f54664b;
        /* renamed from: c */
        private final ConcurrentMap<T, Boolean> f54665c;
        /* renamed from: d */
        private T f54666d;

        DistinctSpliterator(Spliterator<T> spliterator) {
            this(spliterator, new ConcurrentHashMap(512, 0.75f, ForkJoinPool.m59246b() + 1));
        }

        private DistinctSpliterator(Spliterator<T> spliterator, ConcurrentMap<T, Boolean> concurrentMap) {
            this.f54664b = spliterator;
            this.f54665c = concurrentMap;
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public void accept(T t) {
            this.f54666d = t;
        }

        /* renamed from: a */
        private T m64099a(T t) {
            return t != null ? t : f54663a;
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            while (this.f54664b.tryAdvance(this)) {
                if (this.f54665c.putIfAbsent(m64099a(this.f54666d), Boolean.TRUE) == null) {
                    consumer.accept(this.f54666d);
                    this.f54666d = null;
                    return true;
                }
            }
            return null;
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            this.f54664b.forEachRemaining(StreamSpliterators$DistinctSpliterator$$Lambda$1.m64098a(this, consumer));
        }

        /* renamed from: a */
        private /* synthetic */ void m64100a(Consumer consumer, Object obj) {
            if (this.f54665c.putIfAbsent(m64099a(obj), Boolean.TRUE) == null) {
                consumer.accept(obj);
            }
        }

        public Spliterator<T> trySplit() {
            Spliterator trySplit = this.f54664b.trySplit();
            return trySplit != null ? new DistinctSpliterator(trySplit, this.f54665c) : null;
        }

        public long estimateSize() {
            return this.f54664b.estimateSize();
        }

        public int characteristics() {
            return (this.f54664b.characteristics() & -16469) | 1;
        }

        public Comparator<? super T> getComparator() {
            return this.f54664b.getComparator();
        }
    }

    static abstract class InfiniteSupplyingSpliterator<T> implements Spliterator<T> {
        /* renamed from: a */
        long f54668a;

        static final class OfRef<T> extends InfiniteSupplyingSpliterator<T> {
            /* renamed from: b */
            final Supplier<? extends T> f57740b;

            OfRef(long j, Supplier<? extends T> supplier) {
                super(j);
                this.f57740b = supplier;
            }

            public void forEachRemaining(Consumer<? super T> consumer) {
                Spliterators.m59169a((Spliterator) this, (Consumer) consumer);
            }

            public boolean tryAdvance(Consumer<? super T> consumer) {
                Objects.m59115b(consumer);
                consumer.accept(this.f57740b.get());
                return true;
            }

            public Spliterator<T> trySplit() {
                if (this.a == 0) {
                    return null;
                }
                long j = this.a >>> 1;
                this.a = j;
                return new OfRef(j, this.f57740b);
            }
        }

        static final class OfDouble extends InfiniteSupplyingSpliterator<Double> implements java8.util.Spliterator.OfDouble {
            /* renamed from: b */
            final DoubleSupplier f59286b;

            OfDouble(long j, DoubleSupplier doubleSupplier) {
                super(j);
                this.f59286b = doubleSupplier;
            }

            public boolean tryAdvance(DoubleConsumer doubleConsumer) {
                Objects.m59115b(doubleConsumer);
                doubleConsumer.accept(this.f59286b.getAsDouble());
                return true;
            }

            public boolean tryAdvance(Consumer<? super Double> consumer) {
                return java8.util.Spliterators.OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
            }

            public java8.util.Spliterator.OfDouble trySplit() {
                if (this.a == 0) {
                    return null;
                }
                long j = this.a >>> 1;
                this.a = j;
                return new OfDouble(j, this.f59286b);
            }

            public void forEachRemaining(DoubleConsumer doubleConsumer) {
                java8.util.Spliterators.OfDouble.m59143a((java8.util.Spliterator.OfDouble) this, doubleConsumer);
            }

            public void forEachRemaining(Consumer<? super Double> consumer) {
                java8.util.Spliterators.OfDouble.m59145b(this, consumer);
            }
        }

        static final class OfInt extends InfiniteSupplyingSpliterator<Integer> implements java8.util.Spliterator.OfInt {
            /* renamed from: b */
            final IntSupplier f59287b;

            OfInt(long j, IntSupplier intSupplier) {
                super(j);
                this.f59287b = intSupplier;
            }

            public boolean tryAdvance(IntConsumer intConsumer) {
                Objects.m59115b(intConsumer);
                intConsumer.accept(this.f59287b.getAsInt());
                return true;
            }

            public java8.util.Spliterator.OfInt trySplit() {
                if (this.a == 0) {
                    return null;
                }
                long j = this.a >>> 1;
                this.a = j;
                return new OfInt(j, this.f59287b);
            }

            public void forEachRemaining(IntConsumer intConsumer) {
                java8.util.Spliterators.OfInt.m59146a((java8.util.Spliterator.OfInt) this, intConsumer);
            }

            public void forEachRemaining(Consumer<? super Integer> consumer) {
                java8.util.Spliterators.OfInt.m59148b(this, consumer);
            }

            public boolean tryAdvance(Consumer<? super Integer> consumer) {
                return java8.util.Spliterators.OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
            }
        }

        static final class OfLong extends InfiniteSupplyingSpliterator<Long> implements java8.util.Spliterator.OfLong {
            /* renamed from: b */
            final LongSupplier f59288b;

            OfLong(long j, LongSupplier longSupplier) {
                super(j);
                this.f59288b = longSupplier;
            }

            public boolean tryAdvance(LongConsumer longConsumer) {
                Objects.m59115b(longConsumer);
                longConsumer.accept(this.f59288b.getAsLong());
                return true;
            }

            public java8.util.Spliterator.OfLong trySplit() {
                if (this.a == 0) {
                    return null;
                }
                long j = this.a >>> 1;
                this.a = j;
                return new OfLong(j, this.f59288b);
            }

            public void forEachRemaining(LongConsumer longConsumer) {
                java8.util.Spliterators.OfLong.m59149a((java8.util.Spliterator.OfLong) this, longConsumer);
            }

            public void forEachRemaining(Consumer<? super Long> consumer) {
                java8.util.Spliterators.OfLong.m59151b(this, consumer);
            }

            public boolean tryAdvance(Consumer<? super Long> consumer) {
                return java8.util.Spliterators.OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
            }
        }

        public int characteristics() {
            return 1024;
        }

        protected InfiniteSupplyingSpliterator(long j) {
            this.f54668a = j;
        }

        public long estimateSize() {
            return this.f54668a;
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

    static final class WrappingSpliterator<P_IN, P_OUT> extends AbstractWrappingSpliterator<P_IN, P_OUT, SpinedBuffer<P_OUT>> {
        /* renamed from: a */
        /* synthetic */ AbstractWrappingSpliterator mo13767a(Spliterator spliterator) {
            return m66880b(spliterator);
        }

        WrappingSpliterator(PipelineHelper<P_OUT> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
            super((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
        }

        WrappingSpliterator(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator, z);
        }

        /* renamed from: b */
        WrappingSpliterator<P_IN, P_OUT> m66880b(Spliterator<P_IN> spliterator) {
            return new WrappingSpliterator(this.b, (Spliterator) spliterator, this.a);
        }

        /* renamed from: c */
        void mo13768c() {
            AbstractSpinedBuffer spinedBuffer = new SpinedBuffer();
            this.g = spinedBuffer;
            PipelineHelper pipelineHelper = this.b;
            spinedBuffer.getClass();
            this.d = pipelineHelper.mo12963a(StreamSpliterators$WrappingSpliterator$$Lambda$1.m64116a(spinedBuffer));
            this.e = StreamSpliterators$WrappingSpliterator$$Lambda$2.m64117a(this);
        }

        /* renamed from: d */
        private /* synthetic */ boolean m66878d() {
            return this.c.tryAdvance(this.d);
        }

        public boolean tryAdvance(Consumer<? super P_OUT> consumer) {
            Objects.m59115b(consumer);
            boolean b = m64092b();
            if (b) {
                consumer.accept(((SpinedBuffer) this.g).m64084c(this.f));
            }
            return b;
        }

        public void forEachRemaining(Consumer<? super P_OUT> consumer) {
            if (this.g != null || this.h) {
                do {
                } while (tryAdvance(consumer));
                return;
            }
            Objects.m59115b(consumer);
            m64091a();
            PipelineHelper pipelineHelper = this.b;
            consumer.getClass();
            pipelineHelper.mo12960a(StreamSpliterators$WrappingSpliterator$$Lambda$3.m64118a(consumer), this.c);
            this.h = true;
        }
    }

    static final class DoubleWrappingSpliterator<P_IN> extends AbstractWrappingSpliterator<P_IN, Double, OfDouble> implements OfDouble {
        DoubleWrappingSpliterator(PipelineHelper<Double> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
            super((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
        }

        DoubleWrappingSpliterator(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator, z);
        }

        /* renamed from: a */
        AbstractWrappingSpliterator<P_IN, Double, ?> mo13767a(Spliterator<P_IN> spliterator) {
            return new DoubleWrappingSpliterator(this.b, (Spliterator) spliterator, this.a);
        }

        /* renamed from: c */
        void mo13768c() {
            final AbstractSpinedBuffer ofDouble = new OfDouble();
            this.g = ofDouble;
            this.d = this.b.mo12964a(new Sink.OfDouble(this) {
                /* renamed from: b */
                final /* synthetic */ DoubleWrappingSpliterator f59283b;

                /* renamed from: a */
                public void mo13608a(long j) {
                }

                /* renamed from: b */
                public boolean mo13612b() {
                    return false;
                }

                public void z_() {
                }

                public void accept(int i) {
                    SinkDefaults.m59677a((Sink) this, i);
                }

                public void accept(long j) {
                    SinkDefaults.m59678a((Sink) this, j);
                }

                public void accept(double d) {
                    ofDouble.accept(d);
                }

                public void accept(Double d) {
                    accept(d.doubleValue());
                }
            });
            this.e = StreamSpliterators$DoubleWrappingSpliterator$$Lambda$1.m64102a(this);
        }

        /* renamed from: d */
        private /* synthetic */ boolean m67882d() {
            return this.c.tryAdvance(this.d);
        }

        public OfDouble trySplit() {
            return (OfDouble) super.trySplit();
        }

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            boolean b = m64092b();
            if (b) {
                doubleConsumer.accept(((OfDouble) this.g).m66842b(this.f));
            }
            return b;
        }

        public boolean tryAdvance(Consumer<? super Double> consumer) {
            return Spliterators.OfDouble.m59144a((OfDouble) this, (Consumer) consumer);
        }

        public void forEachRemaining(final DoubleConsumer doubleConsumer) {
            if (this.g != null || this.h) {
                do {
                } while (tryAdvance(doubleConsumer));
                return;
            }
            Objects.m59115b(doubleConsumer);
            m64091a();
            this.b.mo12965a(new Sink.OfDouble(this) {
                /* renamed from: b */
                final /* synthetic */ DoubleWrappingSpliterator f59285b;

                /* renamed from: a */
                public void mo13608a(long j) {
                }

                /* renamed from: b */
                public boolean mo13612b() {
                    return false;
                }

                public void z_() {
                }

                public void accept(int i) {
                    SinkDefaults.m59677a((Sink) this, i);
                }

                public void accept(long j) {
                    SinkDefaults.m59678a((Sink) this, j);
                }

                public void accept(double d) {
                    doubleConsumer.accept(d);
                }

                public void accept(Double d) {
                    accept(d.doubleValue());
                }
            }, this.c);
            this.h = true;
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            Spliterators.OfDouble.m59145b(this, consumer);
        }
    }

    static final class IntWrappingSpliterator<P_IN> extends AbstractWrappingSpliterator<P_IN, Integer, OfInt> implements OfInt {
        IntWrappingSpliterator(PipelineHelper<Integer> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
            super((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
        }

        IntWrappingSpliterator(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator, z);
        }

        /* renamed from: a */
        AbstractWrappingSpliterator<P_IN, Integer, ?> mo13767a(Spliterator<P_IN> spliterator) {
            return new IntWrappingSpliterator(this.b, (Spliterator) spliterator, this.a);
        }

        /* renamed from: c */
        void mo13768c() {
            final AbstractSpinedBuffer ofInt = new OfInt();
            this.g = ofInt;
            this.d = this.b.mo12964a(new Sink.OfInt(this) {
                /* renamed from: b */
                final /* synthetic */ IntWrappingSpliterator f59290b;

                /* renamed from: a */
                public void mo13608a(long j) {
                }

                /* renamed from: b */
                public boolean mo13612b() {
                    return false;
                }

                public void z_() {
                }

                public void accept(double d) {
                    SinkDefaults.m59676a((Sink) this, d);
                }

                public void accept(long j) {
                    SinkDefaults.m59678a((Sink) this, j);
                }

                public void accept(Integer num) {
                    accept(num.intValue());
                }

                public void accept(int i) {
                    ofInt.accept(i);
                }
            });
            this.e = StreamSpliterators$IntWrappingSpliterator$$Lambda$1.m64103a(this);
        }

        /* renamed from: d */
        private /* synthetic */ boolean m67890d() {
            return this.c.tryAdvance(this.d);
        }

        public OfInt trySplit() {
            return (OfInt) super.trySplit();
        }

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            boolean b = m64092b();
            if (b) {
                intConsumer.accept(((OfInt) this.g).m66851b(this.f));
            }
            return b;
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return Spliterators.OfInt.m59147a((OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(final IntConsumer intConsumer) {
            if (this.g != null || this.h) {
                do {
                } while (tryAdvance(intConsumer));
                return;
            }
            Objects.m59115b(intConsumer);
            m64091a();
            this.b.mo12965a(new Sink.OfInt(this) {
                /* renamed from: b */
                final /* synthetic */ IntWrappingSpliterator f59292b;

                /* renamed from: a */
                public void mo13608a(long j) {
                }

                /* renamed from: b */
                public boolean mo13612b() {
                    return false;
                }

                public void z_() {
                }

                public void accept(double d) {
                    SinkDefaults.m59676a((Sink) this, d);
                }

                public void accept(long j) {
                    SinkDefaults.m59678a((Sink) this, j);
                }

                public void accept(Integer num) {
                    accept(num.intValue());
                }

                public void accept(int i) {
                    intConsumer.accept(i);
                }
            }, this.c);
            this.h = true;
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            Spliterators.OfInt.m59148b(this, consumer);
        }
    }

    static final class LongWrappingSpliterator<P_IN> extends AbstractWrappingSpliterator<P_IN, Long, OfLong> implements OfLong {
        LongWrappingSpliterator(PipelineHelper<Long> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
            super((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
        }

        LongWrappingSpliterator(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator, z);
        }

        /* renamed from: a */
        AbstractWrappingSpliterator<P_IN, Long, ?> mo13767a(Spliterator<P_IN> spliterator) {
            return new LongWrappingSpliterator(this.b, (Spliterator) spliterator, this.a);
        }

        /* renamed from: c */
        void mo13768c() {
            final AbstractSpinedBuffer ofLong = new OfLong();
            this.g = ofLong;
            this.d = this.b.mo12964a(new Sink.OfLong(this) {
                /* renamed from: b */
                final /* synthetic */ LongWrappingSpliterator f59294b;

                /* renamed from: a */
                public void mo13608a(long j) {
                }

                /* renamed from: b */
                public boolean mo13612b() {
                    return false;
                }

                public void z_() {
                }

                public void accept(double d) {
                    SinkDefaults.m59676a((Sink) this, d);
                }

                public void accept(int i) {
                    SinkDefaults.m59677a((Sink) this, i);
                }

                public void accept(Long l) {
                    accept(l.longValue());
                }

                public void accept(long j) {
                    ofLong.accept(j);
                }
            });
            this.e = StreamSpliterators$LongWrappingSpliterator$$Lambda$1.m64104a(this);
        }

        /* renamed from: d */
        private /* synthetic */ boolean m67898d() {
            return this.c.tryAdvance(this.d);
        }

        public OfLong trySplit() {
            return (OfLong) super.trySplit();
        }

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            boolean b = m64092b();
            if (b) {
                longConsumer.accept(((OfLong) this.g).m66860b(this.f));
            }
            return b;
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return Spliterators.OfLong.m59150a((OfLong) this, (Consumer) consumer);
        }

        public void forEachRemaining(final LongConsumer longConsumer) {
            if (this.g != null || this.h) {
                do {
                } while (tryAdvance(longConsumer));
                return;
            }
            Objects.m59115b(longConsumer);
            m64091a();
            this.b.mo12965a(new Sink.OfLong(this) {
                /* renamed from: b */
                final /* synthetic */ LongWrappingSpliterator f59296b;

                /* renamed from: a */
                public void mo13608a(long j) {
                }

                /* renamed from: b */
                public boolean mo13612b() {
                    return false;
                }

                public void z_() {
                }

                public void accept(double d) {
                    SinkDefaults.m59676a((Sink) this, d);
                }

                public void accept(int i) {
                    SinkDefaults.m59677a((Sink) this, i);
                }

                public void accept(Long l) {
                    accept(l.longValue());
                }

                public void accept(long j) {
                    longConsumer.accept(j);
                }
            }, this.c);
            this.h = true;
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            Spliterators.OfLong.m59151b(this, consumer);
        }
    }

    StreamSpliterators() {
    }
}
