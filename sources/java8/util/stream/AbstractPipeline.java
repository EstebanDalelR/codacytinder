package java8.util.stream;

import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.function.Consumer;
import java8.util.function.IntFunction;
import java8.util.function.Supplier;
import java8.util.stream.Node.Builder;

abstract class AbstractPipeline<E_IN, E_OUT, S extends BaseStream<E_OUT, S>> extends PipelineHelper<E_OUT> implements BaseStream<E_OUT, S> {
    /* renamed from: a */
    protected final int f54421a;
    /* renamed from: b */
    private final AbstractPipeline f54422b;
    /* renamed from: c */
    private final AbstractPipeline f54423c;
    /* renamed from: d */
    private AbstractPipeline f54424d;
    /* renamed from: e */
    private int f54425e;
    /* renamed from: f */
    private int f54426f;
    /* renamed from: g */
    private Spliterator<?> f54427g;
    /* renamed from: h */
    private Supplier<? extends Spliterator<?>> f54428h;
    /* renamed from: i */
    private boolean f54429i;
    /* renamed from: j */
    private boolean f54430j;
    /* renamed from: k */
    private Runnable f54431k;
    /* renamed from: l */
    private boolean f54432l;

    /* renamed from: d */
    private static /* synthetic */ Spliterator m63920d(Spliterator spliterator) {
        return spliterator;
    }

    /* renamed from: a */
    abstract Spliterator<E_OUT> mo13615a(Supplier<? extends Spliterator<E_OUT>> supplier);

    /* renamed from: a */
    abstract <P_IN> Spliterator<E_OUT> mo13616a(PipelineHelper<E_OUT> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z);

    /* renamed from: a */
    abstract Builder<E_OUT> mo12961a(long j, IntFunction<E_OUT[]> intFunction);

    /* renamed from: a */
    abstract <P_IN> Node<E_OUT> mo13617a(PipelineHelper<E_OUT> pipelineHelper, Spliterator<P_IN> spliterator, boolean z, IntFunction<E_OUT[]> intFunction);

    /* renamed from: a */
    abstract Sink<E_IN> mo14011a(int i, Sink<E_OUT> sink);

    /* renamed from: a */
    abstract boolean mo13618a(Spliterator<E_OUT> spliterator, Sink<E_OUT> sink);

    /* renamed from: e */
    abstract StreamShape mo13627e();

    /* renamed from: f */
    abstract boolean mo14012f();

    AbstractPipeline(Spliterator<?> spliterator, int i, boolean z) {
        this.f54423c = null;
        this.f54427g = spliterator;
        this.f54422b = this;
        this.f54421a = StreamOpFlag.STREAM_MASK & i;
        this.f54426f = ((this.f54421a << 1) ^ -1) & StreamOpFlag.INITIAL_OPS_VALUE;
        this.f54425e = null;
        this.f54432l = z;
    }

    AbstractPipeline(AbstractPipeline<?, E_IN, ?> abstractPipeline, int i) {
        if (abstractPipeline.f54429i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractPipeline.f54429i = true;
        abstractPipeline.f54424d = this;
        this.f54423c = abstractPipeline;
        this.f54421a = StreamOpFlag.OP_MASK & i;
        this.f54426f = StreamOpFlag.combineOpFlags(i, abstractPipeline.f54426f);
        this.f54422b = abstractPipeline.f54422b;
        if (mo14012f() != 0) {
            this.f54422b.f54430j = true;
        }
        this.f54425e = abstractPipeline.f54425e + 1;
    }

    /* renamed from: a */
    final <R> R m63923a(TerminalOp<E_OUT, R> terminalOp) {
        if (this.f54429i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f54429i = true;
        if (isParallel()) {
            return terminalOp.mo12989b(this, m63917b(terminalOp.x_()));
        }
        return terminalOp.mo12988a(this, m63917b(terminalOp.x_()));
    }

    /* renamed from: a */
    final Node<E_OUT> m63931a(IntFunction<E_OUT[]> intFunction) {
        if (this.f54429i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f54429i = true;
        if (!isParallel() || this.f54423c == null || !mo14012f()) {
            return mo12962a(m63917b(0), true, (IntFunction) intFunction);
        }
        this.f54425e = 0;
        return mo14013a(this.f54423c, this.f54423c.m63917b(0), (IntFunction) intFunction);
    }

    /* renamed from: a */
    final Spliterator<E_OUT> m63924a() {
        if (this != this.f54422b) {
            throw new IllegalStateException();
        } else if (this.f54429i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        } else {
            this.f54429i = true;
            Spliterator<E_OUT> spliterator;
            if (this.f54422b.f54427g != null) {
                spliterator = this.f54422b.f54427g;
                this.f54422b.f54427g = null;
                return spliterator;
            } else if (this.f54422b.f54428h != null) {
                spliterator = (Spliterator) this.f54422b.f54428h.get();
                this.f54422b.f54428h = null;
                return spliterator;
            } else {
                throw new IllegalStateException("source already consumed or closed");
            }
        }
    }

    public final S sequential() {
        this.f54422b.f54432l = false;
        return this;
    }

    public final S parallel() {
        this.f54422b.f54432l = true;
        return this;
    }

    public void close() {
        this.f54429i = true;
        this.f54428h = null;
        this.f54427g = null;
        if (this.f54422b.f54431k != null) {
            Runnable runnable = this.f54422b.f54431k;
            this.f54422b.f54431k = null;
            runnable.run();
        }
    }

    public S onClose(Runnable runnable) {
        if (this.f54429i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.m59115b(runnable);
        Runnable runnable2 = this.f54422b.f54431k;
        AbstractPipeline abstractPipeline = this.f54422b;
        if (runnable2 != null) {
            runnable = Streams.m59710a(runnable2, runnable);
        }
        abstractPipeline.f54431k = runnable;
        return this;
    }

    public Spliterator<E_OUT> spliterator() {
        if (this.f54429i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f54429i = true;
        if (this != this.f54422b) {
            return mo13616a((PipelineHelper) this, AbstractPipeline$$Lambda$1.m63912a(this), isParallel());
        }
        if (this.f54422b.f54427g != null) {
            Spliterator<E_OUT> spliterator = this.f54422b.f54427g;
            this.f54422b.f54427g = null;
            return spliterator;
        } else if (this.f54422b.f54428h != null) {
            Supplier supplier = this.f54422b.f54428h;
            this.f54422b.f54428h = null;
            return mo13615a(supplier);
        } else {
            throw new IllegalStateException("source already consumed or closed");
        }
    }

    /* renamed from: g */
    private /* synthetic */ Spliterator mo13634g() {
        return m63917b(0);
    }

    public final boolean isParallel() {
        return this.f54422b.f54432l;
    }

    /* renamed from: b */
    private Spliterator<?> m63917b(int i) {
        Spliterator<?> spliterator;
        if (this.f54422b.f54427g != null) {
            spliterator = this.f54422b.f54427g;
            this.f54422b.f54427g = null;
        } else if (this.f54422b.f54428h != null) {
            spliterator = (Spliterator) this.f54422b.f54428h.get();
            this.f54422b.f54428h = null;
        } else {
            throw new IllegalStateException("source already consumed or closed");
        }
        if (isParallel() && this.f54422b.f54430j) {
            PipelineHelper pipelineHelper = this.f54422b;
            PipelineHelper pipelineHelper2 = this.f54422b.f54424d;
            int i2 = 1;
            while (pipelineHelper != this) {
                int i3;
                int i4 = pipelineHelper2.f54421a;
                if (pipelineHelper2.mo14012f()) {
                    i2 = 0;
                    if (StreamOpFlag.SHORT_CIRCUIT.isKnown(i4)) {
                        i4 &= StreamOpFlag.IS_SHORT_CIRCUIT ^ -1;
                    }
                    spliterator = pipelineHelper2.mo14145a(pipelineHelper, (Spliterator) spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i4 &= StreamOpFlag.NOT_SIZED ^ -1;
                        i3 = StreamOpFlag.IS_SIZED;
                    } else {
                        i4 &= StreamOpFlag.IS_SIZED ^ -1;
                        i3 = StreamOpFlag.NOT_SIZED;
                    }
                    i4 |= i3;
                }
                i3 = i2 + 1;
                pipelineHelper2.f54425e = i2;
                pipelineHelper2.f54426f = StreamOpFlag.combineOpFlags(i4, pipelineHelper.f54426f);
                i2 = i3;
                PipelineHelper pipelineHelper3 = pipelineHelper2;
                pipelineHelper2 = pipelineHelper2.f54424d;
                pipelineHelper = pipelineHelper3;
            }
        }
        if (i != 0) {
            this.f54426f = StreamOpFlag.combineOpFlags(i, this.f54426f);
        }
        return spliterator;
    }

    /* renamed from: b */
    final StreamShape mo12967b() {
        AbstractPipeline abstractPipeline = this;
        while (abstractPipeline.f54425e > 0) {
            abstractPipeline = abstractPipeline.f54423c;
        }
        return abstractPipeline.mo13627e();
    }

    /* renamed from: a */
    final <P_IN> long mo12959a(Spliterator<P_IN> spliterator) {
        return StreamOpFlag.SIZED.isKnown(mo12969c()) ? spliterator.getExactSizeIfKnown() : -1;
    }

    /* renamed from: a */
    final <P_IN, S_ extends Sink<E_OUT>> S_ mo12965a(S_ s_, Spliterator<P_IN> spliterator) {
        mo12968b(mo12964a((Sink) Objects.m59115b(s_)), spliterator);
        return s_;
    }

    /* renamed from: a */
    final <P_IN, S_ extends Consumer<E_OUT>> S_ mo12960a(S_ s_, Spliterator<P_IN> spliterator) {
        mo12968b(mo12963a((Consumer) Objects.m59115b(s_)), spliterator);
        return s_;
    }

    /* renamed from: b */
    final <P_IN> void mo12968b(Sink<P_IN> sink, Spliterator<P_IN> spliterator) {
        Objects.m59115b(sink);
        if (StreamOpFlag.SHORT_CIRCUIT.isKnown(mo12969c())) {
            mo12970c(sink, spliterator);
            return;
        }
        sink.mo13608a(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(sink);
        sink.z_();
    }

    /* renamed from: c */
    final <P_IN> boolean mo12970c(Sink<P_IN> sink, Spliterator<P_IN> spliterator) {
        AbstractPipeline abstractPipeline = this;
        while (abstractPipeline.f54425e > 0) {
            abstractPipeline = abstractPipeline.f54423c;
        }
        sink.mo13608a(spliterator.getExactSizeIfKnown());
        spliterator = abstractPipeline.mo13618a((Spliterator) spliterator, (Sink) sink);
        sink.z_();
        return spliterator;
    }

    /* renamed from: c */
    final int mo12969c() {
        return this.f54426f;
    }

    /* renamed from: d */
    final boolean m63944d() {
        return StreamOpFlag.ORDERED.isKnown(this.f54426f);
    }

    /* renamed from: a */
    final <P_IN> Sink<P_IN> mo12964a(Sink<E_OUT> sink) {
        Objects.m59115b(sink);
        Sink sink2 = sink;
        for (sink = this; sink.f54425e > 0; sink = sink.f54423c) {
            sink2 = sink.mo14011a(sink.f54423c.f54426f, sink2);
        }
        return sink2;
    }

    /* renamed from: a */
    final <P_IN> Sink<P_IN> mo12963a(final Consumer<E_OUT> consumer) {
        Objects.m59115b(consumer);
        Sink c184361 = new Sink<E_OUT>(this) {
            /* renamed from: b */
            final /* synthetic */ AbstractPipeline f57633b;

            /* renamed from: a */
            public void mo13608a(long j) {
            }

            /* renamed from: b */
            public boolean mo13612b() {
                return false;
            }

            public void z_() {
            }

            public void accept(E_OUT e_out) {
                consumer.accept(e_out);
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
        };
        for (consumer = this; consumer.f54425e > 0; consumer = consumer.f54423c) {
            c184361 = consumer.mo14011a(consumer.f54423c.f54426f, c184361);
        }
        return c184361;
    }

    /* renamed from: b */
    final <P_IN> Spliterator<E_OUT> mo12966b(Spliterator<P_IN> spliterator) {
        if (this.f54425e == 0) {
            return spliterator;
        }
        return mo13616a((PipelineHelper) this, AbstractPipeline$$Lambda$2.m63913a(spliterator), isParallel());
    }

    /* renamed from: a */
    final <P_IN> Node<E_OUT> mo12962a(Spliterator<P_IN> spliterator, boolean z, IntFunction<E_OUT[]> intFunction) {
        if (isParallel()) {
            return mo13617a(this, spliterator, z, intFunction);
        }
        return ((Builder) mo12965a(mo12961a(mo12959a((Spliterator) spliterator), (IntFunction) intFunction), (Spliterator) spliterator)).build();
    }

    /* renamed from: a */
    <P_IN> Node<E_OUT> mo14013a(PipelineHelper<E_OUT> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<E_OUT[]> intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* renamed from: a */
    <P_IN> Spliterator<E_OUT> mo14145a(PipelineHelper<E_OUT> pipelineHelper, Spliterator<P_IN> spliterator) {
        return mo14013a((PipelineHelper) pipelineHelper, (Spliterator) spliterator, AbstractPipeline$$Lambda$3.m63914a()).y_();
    }
}
