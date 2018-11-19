package java8.util.stream;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterators;
import java8.util.concurrent.CountedCompleter;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.DoublePredicate;
import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;
import java8.util.function.IntPredicate;
import java8.util.function.LongConsumer;
import java8.util.function.LongPredicate;
import java8.util.function.Predicate;
import java8.util.stream.Sink.ChainedDouble;
import java8.util.stream.Sink.ChainedInt;
import java8.util.stream.Sink.ChainedLong;
import java8.util.stream.Sink.ChainedReference;

final class WhileOps {
    /* renamed from: a */
    static final int f48924a = (StreamOpFlag.NOT_SIZED | StreamOpFlag.IS_SHORT_CIRCUIT);
    /* renamed from: b */
    static final int f48925b = StreamOpFlag.NOT_SIZED;

    interface DropWhileOp<T> {
        /* renamed from: a */
        DropWhileSink<T> mo14153a(Sink<T> sink, boolean z);
    }

    static abstract class UnorderedWhileSpliterator<T, T_SPLITR extends Spliterator<T>> implements Spliterator<T> {
        /* renamed from: a */
        final T_SPLITR f54691a;
        /* renamed from: b */
        final boolean f54692b;
        /* renamed from: c */
        final AtomicBoolean f54693c;
        /* renamed from: d */
        boolean f54694d = true;
        /* renamed from: e */
        int f54695e;

        static abstract class OfRef<T> extends UnorderedWhileSpliterator<T, Spliterator<T>> implements Consumer<T> {
            /* renamed from: f */
            final Predicate<? super T> f57743f;
            /* renamed from: g */
            T f57744g;

            static final class Dropping<T> extends OfRef<T> {
                Dropping(Spliterator<T> spliterator, boolean z, Predicate<? super T> predicate) {
                    super(spliterator, z, predicate);
                }

                Dropping(Spliterator<T> spliterator, Dropping<T> dropping) {
                    super(spliterator, dropping);
                }

                public boolean tryAdvance(Consumer<? super T> consumer) {
                    if (!this.d) {
                        return this.a.tryAdvance(consumer);
                    }
                    boolean tryAdvance;
                    boolean z = false;
                    this.d = false;
                    while (true) {
                        tryAdvance = this.a.tryAdvance(this);
                        if (tryAdvance && m64126a() && this.f.test(this.g)) {
                            z = true;
                        } else if (tryAdvance) {
                            if (z) {
                                this.c.set(true);
                            }
                            consumer.accept(this.g);
                        }
                    }
                    if (tryAdvance) {
                        if (z) {
                            this.c.set(true);
                        }
                        consumer.accept(this.g);
                    }
                    return tryAdvance;
                }

                /* renamed from: a */
                Spliterator<T> mo14044a(Spliterator<T> spliterator) {
                    return new Dropping(spliterator, this);
                }
            }

            static final class Taking<T> extends OfRef<T> {
                Taking(Spliterator<T> spliterator, boolean z, Predicate<? super T> predicate) {
                    super(spliterator, z, predicate);
                }

                Taking(Spliterator<T> spliterator, Taking<T> taking) {
                    super(spliterator, taking);
                }

                public boolean tryAdvance(Consumer<? super T> consumer) {
                    boolean test;
                    if (this.d && m64126a() && this.a.tryAdvance(this)) {
                        test = this.f.test(this.g);
                        if (test) {
                            consumer.accept(this.g);
                            return true;
                        }
                    }
                    test = true;
                    this.d = false;
                    if (!test) {
                        this.c.set(true);
                    }
                    return false;
                }

                public Spliterator<T> trySplit() {
                    return this.c.get() ? null : super.trySplit();
                }

                /* renamed from: a */
                Spliterator<T> mo14044a(Spliterator<T> spliterator) {
                    return new Taking(spliterator, this);
                }
            }

            OfRef(Spliterator<T> spliterator, boolean z, Predicate<? super T> predicate) {
                super((Spliterator) spliterator, z);
                this.f57743f = predicate;
            }

            OfRef(Spliterator<T> spliterator, OfRef<T> ofRef) {
                super((Spliterator) spliterator, (UnorderedWhileSpliterator) ofRef);
                this.f57743f = ofRef.f57743f;
            }

            public void accept(T t) {
                this.e = (this.e + 1) & 63;
                this.f57744g = t;
            }

            public void forEachRemaining(Consumer<? super T> consumer) {
                Spliterators.m59169a((Spliterator) this, (Consumer) consumer);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }
        }

        static abstract class OfDouble extends UnorderedWhileSpliterator<Double, java8.util.Spliterator.OfDouble> implements java8.util.Spliterator.OfDouble, DoubleConsumer {
            /* renamed from: f */
            final DoublePredicate f59324f;
            /* renamed from: g */
            double f59325g;

            static final class Dropping extends OfDouble {
                public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
                    super.forEachRemaining((DoubleConsumer) obj);
                }

                Dropping(java8.util.Spliterator.OfDouble ofDouble, boolean z, DoublePredicate doublePredicate) {
                    super(ofDouble, z, doublePredicate);
                }

                Dropping(java8.util.Spliterator.OfDouble ofDouble, OfDouble ofDouble2) {
                    super(ofDouble, ofDouble2);
                }

                public boolean tryAdvance(DoubleConsumer doubleConsumer) {
                    if (!this.d) {
                        return ((java8.util.Spliterator.OfDouble) this.a).tryAdvance(doubleConsumer);
                    }
                    boolean tryAdvance;
                    boolean z = false;
                    this.d = false;
                    while (true) {
                        tryAdvance = ((java8.util.Spliterator.OfDouble) this.a).tryAdvance((DoubleConsumer) this);
                        if (tryAdvance && m64126a() && this.f.test(this.g)) {
                            z = true;
                        } else if (tryAdvance) {
                            if (z) {
                                this.c.set(true);
                            }
                            doubleConsumer.accept(this.g);
                        }
                    }
                    if (tryAdvance) {
                        if (z) {
                            this.c.set(true);
                        }
                        doubleConsumer.accept(this.g);
                    }
                    return tryAdvance;
                }

                /* renamed from: a */
                java8.util.Spliterator.OfDouble m68554a(java8.util.Spliterator.OfDouble ofDouble) {
                    return new Dropping(ofDouble, this);
                }
            }

            static final class Taking extends OfDouble {
                public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
                    super.forEachRemaining((DoubleConsumer) obj);
                }

                Taking(java8.util.Spliterator.OfDouble ofDouble, boolean z, DoublePredicate doublePredicate) {
                    super(ofDouble, z, doublePredicate);
                }

                Taking(java8.util.Spliterator.OfDouble ofDouble, OfDouble ofDouble2) {
                    super(ofDouble, ofDouble2);
                }

                public boolean tryAdvance(DoubleConsumer doubleConsumer) {
                    boolean test;
                    if (this.d && m64126a() && ((java8.util.Spliterator.OfDouble) this.a).tryAdvance((DoubleConsumer) this)) {
                        test = this.f.test(this.g);
                        if (test) {
                            doubleConsumer.accept(this.g);
                            return true;
                        }
                    }
                    test = true;
                    this.d = false;
                    if (!test) {
                        this.c.set(true);
                    }
                    return false;
                }

                public java8.util.Spliterator.OfDouble trySplit() {
                    return this.c.get() ? null : (java8.util.Spliterator.OfDouble) super.trySplit();
                }

                /* renamed from: a */
                java8.util.Spliterator.OfDouble m68556a(java8.util.Spliterator.OfDouble ofDouble) {
                    return new Taking(ofDouble, this);
                }
            }

            OfDouble(java8.util.Spliterator.OfDouble ofDouble, boolean z, DoublePredicate doublePredicate) {
                super((Spliterator) ofDouble, z);
                this.f59324f = doublePredicate;
            }

            OfDouble(java8.util.Spliterator.OfDouble ofDouble, OfDouble ofDouble2) {
                super((Spliterator) ofDouble, (UnorderedWhileSpliterator) ofDouble2);
                this.f59324f = ofDouble2.f59324f;
            }

            public void accept(double d) {
                this.e = (this.e + 1) & 63;
                this.f59325g = d;
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public void forEachRemaining(DoubleConsumer doubleConsumer) {
                java8.util.Spliterators.OfDouble.m59143a((java8.util.Spliterator.OfDouble) this, doubleConsumer);
            }

            public boolean tryAdvance(Consumer<? super Double> consumer) {
                return java8.util.Spliterators.OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Double> consumer) {
                java8.util.Spliterators.OfDouble.m59145b(this, consumer);
            }
        }

        static abstract class OfInt extends UnorderedWhileSpliterator<Integer, java8.util.Spliterator.OfInt> implements java8.util.Spliterator.OfInt, IntConsumer {
            /* renamed from: f */
            final IntPredicate f59326f;
            /* renamed from: g */
            int f59327g;

            static final class Dropping extends OfInt {
                public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
                    super.forEachRemaining((IntConsumer) obj);
                }

                Dropping(java8.util.Spliterator.OfInt ofInt, boolean z, IntPredicate intPredicate) {
                    super(ofInt, z, intPredicate);
                }

                Dropping(java8.util.Spliterator.OfInt ofInt, OfInt ofInt2) {
                    super(ofInt, ofInt2);
                }

                public boolean tryAdvance(IntConsumer intConsumer) {
                    if (!this.d) {
                        return ((java8.util.Spliterator.OfInt) this.a).tryAdvance(intConsumer);
                    }
                    boolean tryAdvance;
                    boolean z = false;
                    this.d = false;
                    while (true) {
                        tryAdvance = ((java8.util.Spliterator.OfInt) this.a).tryAdvance((IntConsumer) this);
                        if (tryAdvance && m64126a() && this.f.test(this.g)) {
                            z = true;
                        } else if (tryAdvance) {
                            if (z) {
                                this.c.set(true);
                            }
                            intConsumer.accept(this.g);
                        }
                    }
                    if (tryAdvance) {
                        if (z) {
                            this.c.set(true);
                        }
                        intConsumer.accept(this.g);
                    }
                    return tryAdvance;
                }

                /* renamed from: a */
                java8.util.Spliterator.OfInt m68558a(java8.util.Spliterator.OfInt ofInt) {
                    return new Dropping(ofInt, this);
                }
            }

            static final class Taking extends OfInt {
                public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
                    super.forEachRemaining((IntConsumer) obj);
                }

                Taking(java8.util.Spliterator.OfInt ofInt, boolean z, IntPredicate intPredicate) {
                    super(ofInt, z, intPredicate);
                }

                Taking(java8.util.Spliterator.OfInt ofInt, OfInt ofInt2) {
                    super(ofInt, ofInt2);
                }

                public boolean tryAdvance(IntConsumer intConsumer) {
                    boolean test;
                    if (this.d && m64126a() && ((java8.util.Spliterator.OfInt) this.a).tryAdvance((IntConsumer) this)) {
                        test = this.f.test(this.g);
                        if (test) {
                            intConsumer.accept(this.g);
                            return true;
                        }
                    }
                    test = true;
                    this.d = false;
                    if (!test) {
                        this.c.set(true);
                    }
                    return false;
                }

                public java8.util.Spliterator.OfInt trySplit() {
                    return this.c.get() ? null : (java8.util.Spliterator.OfInt) super.trySplit();
                }

                /* renamed from: a */
                java8.util.Spliterator.OfInt m68560a(java8.util.Spliterator.OfInt ofInt) {
                    return new Taking(ofInt, this);
                }
            }

            OfInt(java8.util.Spliterator.OfInt ofInt, boolean z, IntPredicate intPredicate) {
                super((Spliterator) ofInt, z);
                this.f59326f = intPredicate;
            }

            OfInt(java8.util.Spliterator.OfInt ofInt, OfInt ofInt2) {
                super((Spliterator) ofInt, (UnorderedWhileSpliterator) ofInt2);
                this.f59326f = ofInt2.f59326f;
            }

            public void accept(int i) {
                this.e = (this.e + 1) & 63;
                this.f59327g = i;
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public void forEachRemaining(IntConsumer intConsumer) {
                java8.util.Spliterators.OfInt.m59146a((java8.util.Spliterator.OfInt) this, intConsumer);
            }

            public boolean tryAdvance(Consumer<? super Integer> consumer) {
                return java8.util.Spliterators.OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Integer> consumer) {
                Spliterators.m59169a((Spliterator) this, (Consumer) consumer);
            }
        }

        static abstract class OfLong extends UnorderedWhileSpliterator<Long, java8.util.Spliterator.OfLong> implements java8.util.Spliterator.OfLong, LongConsumer {
            /* renamed from: f */
            final LongPredicate f59328f;
            /* renamed from: g */
            long f59329g;

            static final class Dropping extends OfLong {
                /* renamed from: a */
                /* bridge */ /* synthetic */ Spliterator mo14044a(Spliterator spliterator) {
                    return super.mo14154a((java8.util.Spliterator.OfLong) spliterator);
                }

                public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
                    super.forEachRemaining((LongConsumer) obj);
                }

                Dropping(java8.util.Spliterator.OfLong ofLong, boolean z, LongPredicate longPredicate) {
                    super(ofLong, z, longPredicate);
                }

                Dropping(java8.util.Spliterator.OfLong ofLong, OfLong ofLong2) {
                    super(ofLong, ofLong2);
                }

                public boolean tryAdvance(LongConsumer longConsumer) {
                    if (!this.d) {
                        return ((java8.util.Spliterator.OfLong) this.a).tryAdvance(longConsumer);
                    }
                    boolean tryAdvance;
                    boolean z = false;
                    this.d = false;
                    while (true) {
                        tryAdvance = ((java8.util.Spliterator.OfLong) this.a).tryAdvance((LongConsumer) this);
                        if (tryAdvance && m64126a() && this.f.test(this.g)) {
                            z = true;
                        } else if (tryAdvance) {
                            if (z) {
                                this.c.set(true);
                            }
                            longConsumer.accept(this.g);
                        }
                    }
                    if (tryAdvance) {
                        if (z) {
                            this.c.set(true);
                        }
                        longConsumer.accept(this.g);
                    }
                    return tryAdvance;
                }
            }

            static final class Taking extends OfLong {
                public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
                    super.forEachRemaining((LongConsumer) obj);
                }

                Taking(java8.util.Spliterator.OfLong ofLong, boolean z, LongPredicate longPredicate) {
                    super(ofLong, z, longPredicate);
                }

                Taking(java8.util.Spliterator.OfLong ofLong, OfLong ofLong2) {
                    super(ofLong, ofLong2);
                }

                public boolean tryAdvance(LongConsumer longConsumer) {
                    boolean test;
                    if (this.d && m64126a() && ((java8.util.Spliterator.OfLong) this.a).tryAdvance((LongConsumer) this)) {
                        test = this.f.test(this.g);
                        if (test) {
                            longConsumer.accept(this.g);
                            return true;
                        }
                    }
                    test = true;
                    this.d = false;
                    if (!test) {
                        this.c.set(true);
                    }
                    return false;
                }

                public java8.util.Spliterator.OfLong trySplit() {
                    return this.c.get() ? null : (java8.util.Spliterator.OfLong) super.trySplit();
                }

                /* renamed from: a */
                java8.util.Spliterator.OfLong mo14154a(java8.util.Spliterator.OfLong ofLong) {
                    return new Taking(ofLong, this);
                }
            }

            OfLong(java8.util.Spliterator.OfLong ofLong, boolean z, LongPredicate longPredicate) {
                super((Spliterator) ofLong, z);
                this.f59328f = longPredicate;
            }

            OfLong(java8.util.Spliterator.OfLong ofLong, OfLong ofLong2) {
                super((Spliterator) ofLong, (UnorderedWhileSpliterator) ofLong2);
                this.f59328f = ofLong2.f59328f;
            }

            public void accept(long j) {
                this.e = (this.e + 1) & 63;
                this.f59329g = j;
            }

            /* renamed from: a */
            java8.util.Spliterator.OfLong mo14154a(java8.util.Spliterator.OfLong ofLong) {
                return new Dropping(ofLong, this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public void forEachRemaining(LongConsumer longConsumer) {
                java8.util.Spliterators.OfLong.m59149a((java8.util.Spliterator.OfLong) this, longConsumer);
            }

            public boolean tryAdvance(Consumer<? super Long> consumer) {
                return java8.util.Spliterators.OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Long> consumer) {
                java8.util.Spliterators.OfLong.m59151b(this, consumer);
            }
        }

        /* renamed from: a */
        abstract T_SPLITR mo14044a(T_SPLITR t_splitr);

        public long getExactSizeIfKnown() {
            return -1;
        }

        UnorderedWhileSpliterator(T_SPLITR t_splitr, boolean z) {
            this.f54691a = t_splitr;
            this.f54692b = z;
            this.f54693c = new AtomicBoolean();
        }

        UnorderedWhileSpliterator(T_SPLITR t_splitr, UnorderedWhileSpliterator<T, T_SPLITR> unorderedWhileSpliterator) {
            this.f54691a = t_splitr;
            this.f54692b = unorderedWhileSpliterator.f54692b;
            this.f54693c = unorderedWhileSpliterator.f54693c;
        }

        public long estimateSize() {
            return this.f54691a.estimateSize();
        }

        public int characteristics() {
            return this.f54691a.characteristics() & -16449;
        }

        public Comparator<? super T> getComparator() {
            return this.f54691a.getComparator();
        }

        public T_SPLITR trySplit() {
            Spliterator trySplit = this.f54692b ? null : this.f54691a.trySplit();
            if (trySplit != null) {
                return mo14044a(trySplit);
            }
            return null;
        }

        /* renamed from: a */
        boolean m64126a() {
            if (this.f54695e == 0) {
                if (this.f54693c.get()) {
                    return false;
                }
            }
            return true;
        }
    }

    interface DropWhileSink<T> extends Sink<T> {
        /* renamed from: c */
        long mo14043c();
    }

    private static final class DropWhileTask<P_IN, P_OUT> extends AbstractTask<P_IN, P_OUT, Node<P_OUT>, DropWhileTask<P_IN, P_OUT>> {
        /* renamed from: a */
        private final AbstractPipeline<P_OUT, P_OUT, ?> f59319a;
        /* renamed from: b */
        private final IntFunction<P_OUT[]> f59320b;
        /* renamed from: i */
        private final boolean f59321i;
        /* renamed from: j */
        private long f59322j;
        /* renamed from: k */
        private long f59323k;

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m67946b(spliterator);
        }

        /* renamed from: t */
        protected /* synthetic */ Object mo14019t() {
            return mo13726o();
        }

        DropWhileTask(AbstractPipeline<P_OUT, P_OUT, ?> abstractPipeline, PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<P_OUT[]> intFunction) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59319a = abstractPipeline;
            this.f59320b = intFunction;
            this.f59321i = StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c());
        }

        DropWhileTask(DropWhileTask<P_IN, P_OUT> dropWhileTask, Spliterator<P_IN> spliterator) {
            super((AbstractTask) dropWhileTask, (Spliterator) spliterator);
            this.f59319a = dropWhileTask.f59319a;
            this.f59320b = dropWhileTask.f59320b;
            this.f59321i = dropWhileTask.f59321i;
        }

        /* renamed from: b */
        protected DropWhileTask<P_IN, P_OUT> m67946b(Spliterator<P_IN> spliterator) {
            return new DropWhileTask(this, spliterator);
        }

        /* renamed from: o */
        protected final Node<P_OUT> mo13726o() {
            boolean z = true;
            int v = m66665v() ^ 1;
            long a = (v != 0 && this.f59321i && StreamOpFlag.SIZED.isPreserved(this.f59319a.f54421a)) ? this.f59319a.mo12959a(this.e) : -1;
            Object a2 = this.d.mo12961a(a, this.f59320b);
            DropWhileOp dropWhileOp = (DropWhileOp) this.f59319a;
            if (!this.f59321i || v == 0) {
                z = false;
            }
            Sink a3 = dropWhileOp.mo14153a(a2, z);
            this.d.mo12965a(a3, this.e);
            Node<P_OUT> build = a2.build();
            this.f59322j = build.mo12999c();
            this.f59323k = a3.mo14043c();
            return build;
        }

        /* renamed from: a */
        public final void mo13597a(CountedCompleter<?> countedCompleter) {
            if (!m66664u()) {
                if (this.f59321i) {
                    this.f59323k = ((DropWhileTask) this.g).f59323k;
                    if (this.f59323k == ((DropWhileTask) this.g).f59322j) {
                        this.f59323k += ((DropWhileTask) this.h).f59323k;
                    }
                }
                this.f59322j = ((DropWhileTask) this.g).f59322j + ((DropWhileTask) this.h).f59322j;
                Object q = m67943q();
                if (m66665v()) {
                    q = m67942a((Node) q);
                }
                mo14009b(q);
            }
            super.mo13597a((CountedCompleter) countedCompleter);
        }

        /* renamed from: q */
        private Node<P_OUT> m67943q() {
            if (((DropWhileTask) this.g).f59322j == 0) {
                return (Node) ((DropWhileTask) this.h).mo13614p();
            }
            if (((DropWhileTask) this.h).f59322j == 0) {
                return (Node) ((DropWhileTask) this.g).mo13614p();
            }
            return Nodes.m59625a(this.f59319a.mo13627e(), (Node) ((DropWhileTask) this.g).mo13614p(), (Node) ((DropWhileTask) this.h).mo13614p());
        }

        /* renamed from: a */
        private Node<P_OUT> m67942a(Node<P_OUT> node) {
            if (!this.f59321i) {
                return node;
            }
            return node.mo13001a(this.f59323k, node.mo12999c(), this.f59320b);
        }
    }

    /* renamed from: java8.util.stream.WhileOps$1Op */
    class AnonymousClass1Op extends StatefulOp<T, T> implements DropWhileOp<T> {
        /* renamed from: b */
        final /* synthetic */ Predicate f59858b;

        /* renamed from: java8.util.stream.WhileOps$1Op$1OpSink */
        class AnonymousClass1OpSink extends ChainedReference<T, T> implements DropWhileSink<T> {
            /* renamed from: a */
            long f59314a;
            /* renamed from: b */
            boolean f59315b;
            /* renamed from: c */
            final /* synthetic */ Sink f59316c;
            /* renamed from: e */
            final /* synthetic */ boolean f59317e;
            /* renamed from: f */
            final /* synthetic */ AnonymousClass1Op f59318f;

            AnonymousClass1OpSink(AnonymousClass1Op anonymousClass1Op, Sink sink, boolean z) {
                this.f59318f = anonymousClass1Op;
                this.f59316c = sink;
                this.f59317e = z;
                super(sink);
            }

            public void accept(T t) {
                int i = 1;
                if (!this.f59315b) {
                    boolean test = this.f59318f.f59858b.test(t) ^ true;
                    this.f59315b = test;
                    if (!test) {
                        i = 0;
                    }
                }
                if (this.f59317e && r1 == 0) {
                    this.f59314a++;
                }
                if (this.f59317e || r1 != 0) {
                    this.d.accept(t);
                }
            }

            /* renamed from: c */
            public long mo14043c() {
                return this.f59314a;
            }
        }

        public AnonymousClass1Op(AbstractPipeline abstractPipeline, AbstractPipeline<?, T, ?> abstractPipeline2, StreamShape streamShape, int i) {
            this.f59858b = i;
            super(abstractPipeline, abstractPipeline2, streamShape);
        }

        /* renamed from: a */
        <P_IN> Spliterator<T> mo14145a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
            if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                return mo14013a(pipelineHelper, spliterator, Nodes.m59609a()).y_();
            }
            return new Dropping(pipelineHelper.mo12966b(spliterator), null, this.f59858b);
        }

        /* renamed from: a */
        <P_IN> Node<T> mo14013a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<T[]> intFunction) {
            return (Node) new DropWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
        }

        /* renamed from: a */
        Sink<T> mo14011a(int i, Sink<T> sink) {
            return mo14153a((Sink) sink, (boolean) 0);
        }

        /* renamed from: a */
        public DropWhileSink<T> mo14153a(Sink<T> sink, boolean z) {
            return new AnonymousClass1OpSink(this, sink, z);
        }
    }

    /* renamed from: java8.util.stream.WhileOps$2Op */
    class AnonymousClass2Op extends StatefulOp<Integer> implements DropWhileOp<Integer> {
        /* renamed from: b */
        final /* synthetic */ IntPredicate f59867b;

        /* renamed from: java8.util.stream.WhileOps$2Op$1OpSink */
        class AnonymousClass1OpSink extends ChainedInt<Integer> implements DropWhileSink<Integer> {
            /* renamed from: a */
            long f59862a;
            /* renamed from: c */
            boolean f59863c;
            /* renamed from: d */
            final /* synthetic */ Sink f59864d;
            /* renamed from: e */
            final /* synthetic */ boolean f59865e;
            /* renamed from: f */
            final /* synthetic */ AnonymousClass2Op f59866f;

            AnonymousClass1OpSink(AnonymousClass2Op anonymousClass2Op, Sink sink, boolean z) {
                this.f59866f = anonymousClass2Op;
                this.f59864d = sink;
                this.f59865e = z;
                super(sink);
            }

            public void accept(int i) {
                int i2 = 1;
                if (!this.f59863c) {
                    boolean test = this.f59866f.f59867b.test(i) ^ true;
                    this.f59863c = test;
                    if (!test) {
                        i2 = 0;
                    }
                }
                if (this.f59865e && r1 == 0) {
                    this.f59862a++;
                }
                if (this.f59865e || r1 != 0) {
                    this.b.accept(i);
                }
            }

            /* renamed from: c */
            public long mo14043c() {
                return this.f59862a;
            }
        }

        public AnonymousClass2Op(AbstractPipeline abstractPipeline, AbstractPipeline<?, Integer, ?> abstractPipeline2, StreamShape streamShape, int i) {
            this.f59867b = i;
            super(abstractPipeline, abstractPipeline2, streamShape);
        }

        /* renamed from: a */
        <P_IN> Spliterator<Integer> mo14145a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator) {
            if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                return mo14013a(pipelineHelper, spliterator, WhileOps$2Op$$Lambda$1.m64120a()).y_();
            }
            return new Dropping((OfInt) pipelineHelper.mo12966b(spliterator), null, this.f59867b);
        }

        /* renamed from: a */
        <P_IN> Node<Integer> mo14013a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Integer[]> intFunction) {
            return (Node) new DropWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
        }

        /* renamed from: a */
        Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
            return mo14153a((Sink) sink, (boolean) 0);
        }

        /* renamed from: a */
        public DropWhileSink<Integer> mo14153a(Sink<Integer> sink, boolean z) {
            return new AnonymousClass1OpSink(this, sink, z);
        }
    }

    /* renamed from: java8.util.stream.WhileOps$3Op */
    class AnonymousClass3Op extends StatefulOp<Long> implements DropWhileOp<Long> {
        /* renamed from: b */
        final /* synthetic */ LongPredicate f59876b;

        /* renamed from: java8.util.stream.WhileOps$3Op$1OpSink */
        class AnonymousClass1OpSink extends ChainedLong<Long> implements DropWhileSink<Long> {
            /* renamed from: a */
            long f59871a;
            /* renamed from: c */
            boolean f59872c;
            /* renamed from: d */
            final /* synthetic */ Sink f59873d;
            /* renamed from: e */
            final /* synthetic */ boolean f59874e;
            /* renamed from: f */
            final /* synthetic */ AnonymousClass3Op f59875f;

            AnonymousClass1OpSink(AnonymousClass3Op anonymousClass3Op, Sink sink, boolean z) {
                this.f59875f = anonymousClass3Op;
                this.f59873d = sink;
                this.f59874e = z;
                super(sink);
            }

            public void accept(long j) {
                int i = 1;
                if (!this.f59872c) {
                    boolean test = this.f59875f.f59876b.test(j) ^ true;
                    this.f59872c = test;
                    if (!test) {
                        i = 0;
                    }
                }
                if (this.f59874e && r1 == 0) {
                    this.f59871a++;
                }
                if (this.f59874e || r1 != 0) {
                    this.b.accept(j);
                }
            }

            /* renamed from: c */
            public long mo14043c() {
                return this.f59871a;
            }
        }

        public AnonymousClass3Op(AbstractPipeline abstractPipeline, AbstractPipeline<?, Long, ?> abstractPipeline2, StreamShape streamShape, int i) {
            this.f59876b = i;
            super(abstractPipeline, abstractPipeline2, streamShape);
        }

        /* renamed from: a */
        <P_IN> Spliterator<Long> mo14145a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator) {
            if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                return mo14013a(pipelineHelper, spliterator, WhileOps$3Op$$Lambda$1.m64122a()).y_();
            }
            return new Dropping((OfLong) pipelineHelper.mo12966b(spliterator), null, this.f59876b);
        }

        /* renamed from: a */
        <P_IN> Node<Long> mo14013a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Long[]> intFunction) {
            return (Node) new DropWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
        }

        /* renamed from: a */
        Sink<Long> mo14011a(int i, Sink<Long> sink) {
            return mo14153a((Sink) sink, (boolean) 0);
        }

        /* renamed from: a */
        public DropWhileSink<Long> mo14153a(Sink<Long> sink, boolean z) {
            return new AnonymousClass1OpSink(this, sink, z);
        }
    }

    /* renamed from: java8.util.stream.WhileOps$4Op */
    class AnonymousClass4Op extends StatefulOp<Double> implements DropWhileOp<Double> {
        /* renamed from: b */
        final /* synthetic */ DoublePredicate f59885b;

        /* renamed from: java8.util.stream.WhileOps$4Op$1OpSink */
        class AnonymousClass1OpSink extends ChainedDouble<Double> implements DropWhileSink<Double> {
            /* renamed from: a */
            long f59880a;
            /* renamed from: c */
            boolean f59881c;
            /* renamed from: d */
            final /* synthetic */ Sink f59882d;
            /* renamed from: e */
            final /* synthetic */ boolean f59883e;
            /* renamed from: f */
            final /* synthetic */ AnonymousClass4Op f59884f;

            AnonymousClass1OpSink(AnonymousClass4Op anonymousClass4Op, Sink sink, boolean z) {
                this.f59884f = anonymousClass4Op;
                this.f59882d = sink;
                this.f59883e = z;
                super(sink);
            }

            public void accept(double d) {
                int i = 1;
                if (!this.f59881c) {
                    boolean test = this.f59884f.f59885b.test(d) ^ true;
                    this.f59881c = test;
                    if (!test) {
                        i = 0;
                    }
                }
                if (this.f59883e && r1 == 0) {
                    this.f59880a++;
                }
                if (this.f59883e || r1 != 0) {
                    this.b.accept(d);
                }
            }

            /* renamed from: c */
            public long mo14043c() {
                return this.f59880a;
            }
        }

        public AnonymousClass4Op(AbstractPipeline abstractPipeline, AbstractPipeline<?, Double, ?> abstractPipeline2, StreamShape streamShape, int i) {
            this.f59885b = i;
            super(abstractPipeline, abstractPipeline2, streamShape);
        }

        /* renamed from: a */
        <P_IN> Spliterator<Double> mo14145a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator) {
            if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                return mo14013a(pipelineHelper, spliterator, WhileOps$4Op$$Lambda$1.m64124a()).y_();
            }
            return new Dropping((OfDouble) pipelineHelper.mo12966b(spliterator), null, this.f59885b);
        }

        /* renamed from: a */
        <P_IN> Node<Double> mo14013a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Double[]> intFunction) {
            return (Node) new DropWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
        }

        /* renamed from: a */
        Sink<Double> mo14011a(int i, Sink<Double> sink) {
            return mo14153a((Sink) sink, (boolean) 0);
        }

        /* renamed from: a */
        public DropWhileSink<Double> mo14153a(Sink<Double> sink, boolean z) {
            return new AnonymousClass1OpSink(this, sink, z);
        }
    }

    private static final class TakeWhileTask<P_IN, P_OUT> extends AbstractShortCircuitTask<P_IN, P_OUT, Node<P_OUT>, TakeWhileTask<P_IN, P_OUT>> {
        /* renamed from: i */
        private final AbstractPipeline<P_OUT, P_OUT, ?> f59886i;
        /* renamed from: j */
        private final IntFunction<P_OUT[]> f59887j;
        /* renamed from: k */
        private final boolean f59888k;
        /* renamed from: o */
        private long f59889o;
        /* renamed from: p */
        private boolean f59890p;
        /* renamed from: q */
        private volatile boolean f59891q;

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m68548b(spliterator);
        }

        /* renamed from: o */
        protected /* synthetic */ Object mo13726o() {
            return m68552y();
        }

        /* renamed from: t */
        protected /* synthetic */ Object mo14019t() {
            return m68553z();
        }

        TakeWhileTask(AbstractPipeline<P_OUT, P_OUT, ?> abstractPipeline, PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<P_OUT[]> intFunction) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59886i = abstractPipeline;
            this.f59887j = intFunction;
            this.f59888k = StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c());
        }

        TakeWhileTask(TakeWhileTask<P_IN, P_OUT> takeWhileTask, Spliterator<P_IN> spliterator) {
            super((AbstractShortCircuitTask) takeWhileTask, (Spliterator) spliterator);
            this.f59886i = takeWhileTask.f59886i;
            this.f59887j = takeWhileTask.f59887j;
            this.f59888k = takeWhileTask.f59888k;
        }

        /* renamed from: b */
        protected TakeWhileTask<P_IN, P_OUT> m68548b(Spliterator<P_IN> spliterator) {
            return new TakeWhileTask(this, spliterator);
        }

        /* renamed from: y */
        protected final Node<P_OUT> m68552y() {
            return Nodes.m59624a(this.f59886i.mo13627e());
        }

        /* renamed from: z */
        protected final Node<P_OUT> m68553z() {
            Sink a = this.d.mo12961a(-1, this.f59887j);
            boolean c = this.d.mo12970c(this.d.mo12964a(this.f59886i.mo14011a(this.d.mo12969c(), a)), this.e);
            this.f59890p = c;
            if (c) {
                m67717s();
            }
            Node<P_OUT> build = a.build();
            this.f59889o = build.mo12999c();
            return build;
        }

        /* renamed from: a */
        public final void mo13597a(CountedCompleter<?> countedCompleter) {
            if (!m66664u()) {
                Object y;
                this.f59890p = ((TakeWhileTask) this.g).f59890p | ((TakeWhileTask) this.h).f59890p;
                if (this.f59888k && this.b) {
                    this.f59889o = 0;
                    y = m68552y();
                } else if (this.f59888k && ((TakeWhileTask) this.g).f59890p) {
                    this.f59889o = ((TakeWhileTask) this.g).f59889o;
                    y = (Node) ((TakeWhileTask) this.g).mo13614p();
                } else {
                    this.f59889o = ((TakeWhileTask) this.g).f59889o + ((TakeWhileTask) this.h).f59889o;
                    y = m68545A();
                }
                mo14009b(y);
            }
            this.f59891q = true;
            super.mo13597a((CountedCompleter) countedCompleter);
        }

        /* renamed from: A */
        Node<P_OUT> m68545A() {
            if (((TakeWhileTask) this.g).f59889o == 0) {
                return (Node) ((TakeWhileTask) this.h).mo13614p();
            }
            if (((TakeWhileTask) this.h).f59889o == 0) {
                return (Node) ((TakeWhileTask) this.g).mo13614p();
            }
            return Nodes.m59625a(this.f59886i.mo13627e(), (Node) ((TakeWhileTask) this.g).mo13614p(), (Node) ((TakeWhileTask) this.h).mo13614p());
        }

        /* renamed from: q */
        protected void mo14010q() {
            super.mo14010q();
            if (this.f59888k && this.f59891q) {
                mo14009b(m68552y());
            }
        }
    }

    WhileOps() {
    }

    /* renamed from: a */
    static <T> Stream<T> m59718a(AbstractPipeline<?, T, ?> abstractPipeline, final Predicate<? super T> predicate) {
        Objects.m59115b(predicate);
        return new StatefulOp<T, T>(abstractPipeline, StreamShape.REFERENCE, f48924a) {
            /* renamed from: a */
            <P_IN> Spliterator<T> mo14145a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return mo14013a(pipelineHelper, spliterator, Nodes.m59609a()).y_();
                }
                return new Taking(pipelineHelper.mo12966b(spliterator), null, predicate);
            }

            /* renamed from: a */
            <P_IN> Node<T> mo14013a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<T[]> intFunction) {
                return (Node) new TakeWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
            }

            /* renamed from: a */
            Sink<T> mo14011a(int i, Sink<T> sink) {
                return new ChainedReference<T, T>(this, sink) {
                    /* renamed from: a */
                    boolean f59312a = true;
                    /* renamed from: b */
                    final /* synthetic */ C192741 f59313b;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(-1);
                    }

                    public void accept(T t) {
                        boolean test = predicate.test(t);
                        this.f59312a = test;
                        if (test) {
                            this.d.accept(t);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59312a) {
                            if (!this.d.mo13612b()) {
                                return false;
                            }
                        }
                        return true;
                    }
                };
            }
        };
    }

    /* renamed from: a */
    static IntStream m59716a(AbstractPipeline<?, Integer, ?> abstractPipeline, final IntPredicate intPredicate) {
        Objects.m59115b(intPredicate);
        return new StatefulOp<Integer>(abstractPipeline, StreamShape.INT_VALUE, f48924a) {
            /* renamed from: a */
            <P_IN> Spliterator<Integer> mo14145a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return mo14013a(pipelineHelper, spliterator, WhileOps$2$$Lambda$1.m64119a()).y_();
                }
                return new Taking((OfInt) pipelineHelper.mo12966b(spliterator), null, intPredicate);
            }

            /* renamed from: a */
            <P_IN> Node<Integer> mo14013a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Integer[]> intFunction) {
                return (Node) new TakeWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
            }

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedInt<Integer>(this, sink) {
                    /* renamed from: a */
                    boolean f59859a = true;
                    /* renamed from: c */
                    final /* synthetic */ C192762 f59860c;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(int i) {
                        boolean test = intPredicate.test(i);
                        this.f59859a = test;
                        if (test) {
                            this.b.accept(i);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59859a) {
                            if (!this.b.mo13612b()) {
                                return false;
                            }
                        }
                        return true;
                    }
                };
            }
        };
    }

    /* renamed from: a */
    static LongStream m59717a(AbstractPipeline<?, Long, ?> abstractPipeline, final LongPredicate longPredicate) {
        Objects.m59115b(longPredicate);
        return new StatefulOp<Long>(abstractPipeline, StreamShape.LONG_VALUE, f48924a) {
            /* renamed from: a */
            <P_IN> Spliterator<Long> mo14145a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return mo14013a(pipelineHelper, spliterator, WhileOps$3$$Lambda$1.m64121a()).y_();
                }
                return new Taking((OfLong) pipelineHelper.mo12966b(spliterator), null, longPredicate);
            }

            /* renamed from: a */
            <P_IN> Node<Long> mo14013a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Long[]> intFunction) {
                return (Node) new TakeWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
            }

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Long> sink) {
                return new ChainedLong<Long>(this, sink) {
                    /* renamed from: a */
                    boolean f59868a = true;
                    /* renamed from: c */
                    final /* synthetic */ C192783 f59869c;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(long j) {
                        boolean test = longPredicate.test(j);
                        this.f59868a = test;
                        if (test) {
                            this.b.accept(j);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59868a) {
                            if (!this.b.mo13612b()) {
                                return false;
                            }
                        }
                        return true;
                    }
                };
            }
        };
    }

    /* renamed from: a */
    static DoubleStream m59715a(AbstractPipeline<?, Double, ?> abstractPipeline, final DoublePredicate doublePredicate) {
        Objects.m59115b(doublePredicate);
        return new StatefulOp<Double>(abstractPipeline, StreamShape.DOUBLE_VALUE, f48924a) {
            /* renamed from: a */
            <P_IN> Spliterator<Double> mo14145a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return mo14013a(pipelineHelper, spliterator, WhileOps$4$$Lambda$1.m64123a()).y_();
                }
                return new Taking((OfDouble) pipelineHelper.mo12966b(spliterator), null, doublePredicate);
            }

            /* renamed from: a */
            <P_IN> Node<Double> mo14013a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Double[]> intFunction) {
                return (Node) new TakeWhileTask(this, pipelineHelper, spliterator, intFunction).m59285k();
            }

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Double> sink) {
                return new ChainedDouble<Double>(this, sink) {
                    /* renamed from: a */
                    boolean f59877a = true;
                    /* renamed from: c */
                    final /* synthetic */ C192804 f59878c;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(double d) {
                        boolean test = doublePredicate.test(d);
                        this.f59877a = test;
                        if (test) {
                            this.b.accept(d);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59877a) {
                            if (!this.b.mo13612b()) {
                                return false;
                            }
                        }
                        return true;
                    }
                };
            }
        };
    }

    /* renamed from: b */
    static <T> Stream<T> m59722b(AbstractPipeline<?, T, ?> abstractPipeline, Predicate<? super T> predicate) {
        Objects.m59115b(predicate);
        return new AnonymousClass1Op(abstractPipeline, StreamShape.REFERENCE, f48925b, predicate);
    }

    /* renamed from: b */
    static IntStream m59720b(AbstractPipeline<?, Integer, ?> abstractPipeline, IntPredicate intPredicate) {
        Objects.m59115b(intPredicate);
        return new AnonymousClass2Op(abstractPipeline, StreamShape.INT_VALUE, f48925b, intPredicate);
    }

    /* renamed from: b */
    static LongStream m59721b(AbstractPipeline<?, Long, ?> abstractPipeline, LongPredicate longPredicate) {
        Objects.m59115b(longPredicate);
        return new AnonymousClass3Op(abstractPipeline, StreamShape.LONG_VALUE, f48925b, longPredicate);
    }

    /* renamed from: b */
    static DoubleStream m59719b(AbstractPipeline<?, Double, ?> abstractPipeline, DoublePredicate doublePredicate) {
        Objects.m59115b(doublePredicate);
        return new AnonymousClass4Op(abstractPipeline, StreamShape.DOUBLE_VALUE, f48925b, doublePredicate);
    }
}
