package java8.util.stream;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.concurrent.CountedCompleter;
import java8.util.concurrent.ForkJoinPool;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;
import java8.util.stream.Node.Builder;

final class ForEachOps {

    static final class ForEachOrderedTask<S, T> extends CountedCompleter<Void> {
        /* renamed from: a */
        private final PipelineHelper<T> f57663a;
        /* renamed from: b */
        private Spliterator<S> f57664b;
        /* renamed from: c */
        private final long f57665c;
        /* renamed from: d */
        private final ConcurrentMap<ForEachOrderedTask<S, T>, ForEachOrderedTask<S, T>> f57666d;
        /* renamed from: e */
        private final Sink<T> f57667e;
        /* renamed from: f */
        private final ForEachOrderedTask<S, T> f57668f;
        /* renamed from: g */
        private Node<T> f57669g;

        protected ForEachOrderedTask(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator, Sink<T> sink) {
            super(null);
            this.f57663a = pipelineHelper;
            this.f57664b = spliterator;
            this.f57665c = AbstractTask.m66655b(spliterator.estimateSize());
            this.f57666d = new ConcurrentHashMap(Math.max(16, AbstractTask.f57634c << 1), 0.75f, ForkJoinPool.m59246b() + 1);
            this.f57667e = sink;
            this.f57668f = null;
        }

        ForEachOrderedTask(ForEachOrderedTask<S, T> forEachOrderedTask, Spliterator<S> spliterator, ForEachOrderedTask<S, T> forEachOrderedTask2) {
            super(forEachOrderedTask);
            this.f57663a = forEachOrderedTask.f57663a;
            this.f57664b = spliterator;
            this.f57665c = forEachOrderedTask.f57665c;
            this.f57666d = forEachOrderedTask.f57666d;
            this.f57667e = forEachOrderedTask.f57667e;
            this.f57668f = forEachOrderedTask2;
        }

        /* renamed from: a */
        public final void mo13596a() {
            m66702a(this);
        }

        /* renamed from: a */
        private static <S, T> void m66702a(ForEachOrderedTask<S, T> forEachOrderedTask) {
            ForEachOrderedTask forEachOrderedTask2;
            Spliterator spliterator = forEachOrderedTask.f57664b;
            long j = forEachOrderedTask.f57665c;
            int i = 0;
            while (spliterator.estimateSize() > j) {
                Spliterator trySplit = spliterator.trySplit();
                if (trySplit == null) {
                    break;
                }
                ForEachOrderedTask forEachOrderedTask3 = new ForEachOrderedTask(forEachOrderedTask2, trySplit, forEachOrderedTask2.f57668f);
                ForEachOrderedTask<S, T> forEachOrderedTask4 = new ForEachOrderedTask(forEachOrderedTask2, spliterator, forEachOrderedTask3);
                forEachOrderedTask2.mo12939b(1);
                forEachOrderedTask4.mo12939b(1);
                forEachOrderedTask2.f57666d.put(forEachOrderedTask3, forEachOrderedTask4);
                if (forEachOrderedTask2.f57668f != null) {
                    forEachOrderedTask3.mo12939b(1);
                    if (forEachOrderedTask2.f57666d.replace(forEachOrderedTask2.f57668f, forEachOrderedTask2, forEachOrderedTask3)) {
                        forEachOrderedTask2.mo12939b(-1);
                    } else {
                        forEachOrderedTask3.mo12939b(-1);
                    }
                }
                if (i != 0) {
                    spliterator = trySplit;
                    forEachOrderedTask2 = forEachOrderedTask3;
                    forEachOrderedTask3 = forEachOrderedTask4;
                } else {
                    forEachOrderedTask2 = forEachOrderedTask4;
                }
                i ^= 1;
                forEachOrderedTask3.m59284j();
            }
            if (forEachOrderedTask2.mo12940c() > 0) {
                forEachOrderedTask2.f57669g = ((Builder) forEachOrderedTask2.f57663a.mo12965a(forEachOrderedTask2.f57663a.mo12961a(forEachOrderedTask2.f57663a.mo12959a(spliterator), ForEachOps$ForEachOrderedTask$$Lambda$1.m63993a()), spliterator)).build();
                forEachOrderedTask2.f57664b = null;
            }
            forEachOrderedTask2.mo12941d();
        }

        /* renamed from: a */
        public void mo13597a(CountedCompleter<?> countedCompleter) {
            if (this.f57669g != null) {
                this.f57669g.forEach(this.f57667e);
                this.f57669g = null;
            } else if (this.f57664b != null) {
                this.f57663a.mo12965a(this.f57667e, this.f57664b);
                this.f57664b = null;
            }
            ForEachOrderedTask forEachOrderedTask = (ForEachOrderedTask) this.f57666d.remove(this);
            if (forEachOrderedTask != null) {
                forEachOrderedTask.mo12941d();
            }
        }
    }

    static final class ForEachTask<S, T> extends CountedCompleter<Void> {
        /* renamed from: a */
        private Spliterator<S> f57670a;
        /* renamed from: b */
        private final Sink<S> f57671b;
        /* renamed from: c */
        private final PipelineHelper<T> f57672c;
        /* renamed from: d */
        private long f57673d;

        ForEachTask(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator, Sink<S> sink) {
            super(null);
            this.f57671b = sink;
            this.f57672c = pipelineHelper;
            this.f57670a = spliterator;
            this.f57673d = null;
        }

        ForEachTask(ForEachTask<S, T> forEachTask, Spliterator<S> spliterator) {
            super(forEachTask);
            this.f57670a = spliterator;
            this.f57671b = forEachTask.f57671b;
            this.f57673d = forEachTask.f57673d;
            this.f57672c = forEachTask.f57672c;
        }

        /* renamed from: a */
        public void mo13596a() {
            Spliterator spliterator = this.f57670a;
            long estimateSize = spliterator.estimateSize();
            long j = this.f57673d;
            if (j == 0) {
                j = AbstractTask.m66655b(estimateSize);
                this.f57673d = j;
            }
            boolean isKnown = StreamOpFlag.SHORT_CIRCUIT.isKnown(this.f57672c.mo12969c());
            Sink sink = this.f57671b;
            ForEachTask forEachTask = this;
            int i = 0;
            while (true) {
                if (!isKnown || !sink.mo13612b()) {
                    if (estimateSize <= j) {
                        break;
                    }
                    Spliterator trySplit = spliterator.trySplit();
                    if (trySplit == null) {
                        break;
                    }
                    ForEachTask forEachTask2 = new ForEachTask(forEachTask, trySplit);
                    forEachTask.mo12939b(1);
                    if (i != 0) {
                        spliterator = trySplit;
                        ForEachTask forEachTask3 = forEachTask;
                        forEachTask = forEachTask2;
                        forEachTask2 = forEachTask3;
                    }
                    i ^= 1;
                    forEachTask2.m59284j();
                    estimateSize = spliterator.estimateSize();
                } else {
                    break;
                }
            }
            forEachTask.f57672c.mo12968b(sink, spliterator);
            forEachTask.f57670a = null;
            forEachTask.mo12942e();
        }
    }

    static abstract class ForEachOp<T> implements TerminalOp<T, Void>, TerminalSink<T, Void> {
        /* renamed from: a */
        private final boolean f59233a;

        static final class OfDouble extends ForEachOp<Double> implements java8.util.stream.Sink.OfDouble {
            /* renamed from: a */
            final DoubleConsumer f59690a;

            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67735c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67736d(pipelineHelper, spliterator);
            }

            public /* synthetic */ Object get() {
                return super.m67734c();
            }

            OfDouble(DoubleConsumer doubleConsumer, boolean z) {
                super(z);
                this.f59690a = doubleConsumer;
            }

            public void accept(double d) {
                this.f59690a.accept(d);
            }

            public void accept(Double d) {
                OfDouble.m59673a(this, d);
            }
        }

        static final class OfInt extends ForEachOp<Integer> implements java8.util.stream.Sink.OfInt {
            /* renamed from: a */
            final IntConsumer f59691a;

            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67735c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67736d(pipelineHelper, spliterator);
            }

            public /* synthetic */ Object get() {
                return super.m67734c();
            }

            OfInt(IntConsumer intConsumer, boolean z) {
                super(z);
                this.f59691a = intConsumer;
            }

            public void accept(int i) {
                this.f59691a.accept(i);
            }

            public void accept(Integer num) {
                OfInt.m59674a(this, num);
            }
        }

        static final class OfLong extends ForEachOp<Long> implements java8.util.stream.Sink.OfLong {
            /* renamed from: a */
            final LongConsumer f59692a;

            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67735c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67736d(pipelineHelper, spliterator);
            }

            public /* synthetic */ Object get() {
                return super.m67734c();
            }

            OfLong(LongConsumer longConsumer, boolean z) {
                super(z);
                this.f59692a = longConsumer;
            }

            public void accept(long j) {
                this.f59692a.accept(j);
            }

            public void accept(Long l) {
                OfLong.m59675a(this, l);
            }
        }

        static final class OfRef<T> extends ForEachOp<T> {
            /* renamed from: a */
            final Consumer<? super T> f59693a;

            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67735c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return super.m67736d(pipelineHelper, spliterator);
            }

            public /* synthetic */ Object get() {
                return super.m67734c();
            }

            OfRef(Consumer<? super T> consumer, boolean z) {
                super(z);
                this.f59693a = consumer;
            }

            public void accept(T t) {
                this.f59693a.accept(t);
            }
        }

        /* renamed from: a */
        public void mo13608a(long j) {
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        /* renamed from: c */
        public Void m67734c() {
            return null;
        }

        public void z_() {
        }

        /* renamed from: a */
        public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return m67735c(pipelineHelper, spliterator);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return m67736d(pipelineHelper, spliterator);
        }

        public /* synthetic */ Object get() {
            return m67734c();
        }

        protected ForEachOp(boolean z) {
            this.f59233a = z;
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        public int x_() {
            return this.f59233a ? 0 : StreamOpFlag.NOT_ORDERED;
        }

        /* renamed from: c */
        public <S> Void m67735c(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator) {
            return ((ForEachOp) pipelineHelper.mo12965a((Sink) this, (Spliterator) spliterator)).m67734c();
        }

        /* renamed from: d */
        public <S> Void m67736d(PipelineHelper<T> pipelineHelper, Spliterator<S> spliterator) {
            if (this.f59233a) {
                new ForEachOrderedTask((PipelineHelper) pipelineHelper, (Spliterator) spliterator, (Sink) this).m59285k();
            } else {
                new ForEachTask(pipelineHelper, spliterator, pipelineHelper.mo12964a((Sink) this)).m59285k();
            }
            return null;
        }
    }

    private ForEachOps() {
    }

    /* renamed from: a */
    public static <T> TerminalOp<T, Void> m59566a(Consumer<? super T> consumer, boolean z) {
        Objects.m59115b(consumer);
        return new OfRef(consumer, z);
    }

    /* renamed from: a */
    public static TerminalOp<Integer, Void> m59568a(IntConsumer intConsumer, boolean z) {
        Objects.m59115b(intConsumer);
        return new OfInt(intConsumer, z);
    }

    /* renamed from: a */
    public static TerminalOp<Long, Void> m59569a(LongConsumer longConsumer, boolean z) {
        Objects.m59115b(longConsumer);
        return new OfLong(longConsumer, z);
    }

    /* renamed from: a */
    public static TerminalOp<Double, Void> m59567a(DoubleConsumer doubleConsumer, boolean z) {
        Objects.m59115b(doubleConsumer);
        return new OfDouble(doubleConsumer, z);
    }
}
