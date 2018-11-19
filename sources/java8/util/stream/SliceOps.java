package java8.util.stream;

import com.google.android.exoplayer2.Format;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.concurrent.CountedCompleter;
import java8.util.function.IntFunction;
import java8.util.stream.Sink.ChainedDouble;
import java8.util.stream.Sink.ChainedInt;
import java8.util.stream.Sink.ChainedLong;
import java8.util.stream.Sink.ChainedReference;

final class SliceOps {

    private static final class SliceTask<P_IN, P_OUT> extends AbstractShortCircuitTask<P_IN, P_OUT, Node<P_OUT>, SliceTask<P_IN, P_OUT>> {
        /* renamed from: i */
        private final AbstractPipeline<P_OUT, P_OUT, ?> f59843i;
        /* renamed from: j */
        private final IntFunction<P_OUT[]> f59844j;
        /* renamed from: k */
        private final long f59845k;
        /* renamed from: o */
        private final long f59846o;
        /* renamed from: p */
        private long f59847p;
        /* renamed from: q */
        private volatile boolean f59848q;

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m68477b(spliterator);
        }

        /* renamed from: o */
        protected /* synthetic */ Object mo13726o() {
            return m68481y();
        }

        /* renamed from: t */
        protected /* synthetic */ Object mo14019t() {
            return m68482z();
        }

        SliceTask(AbstractPipeline<P_OUT, P_OUT, ?> abstractPipeline, PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<P_OUT[]> intFunction, long j, long j2) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59843i = abstractPipeline;
            this.f59844j = intFunction;
            this.f59845k = j;
            this.f59846o = j2;
        }

        SliceTask(SliceTask<P_IN, P_OUT> sliceTask, Spliterator<P_IN> spliterator) {
            super((AbstractShortCircuitTask) sliceTask, (Spliterator) spliterator);
            this.f59843i = sliceTask.f59843i;
            this.f59844j = sliceTask.f59844j;
            this.f59845k = sliceTask.f59845k;
            this.f59846o = sliceTask.f59846o;
        }

        /* renamed from: b */
        protected SliceTask<P_IN, P_OUT> m68477b(Spliterator<P_IN> spliterator) {
            return new SliceTask(this, spliterator);
        }

        /* renamed from: y */
        protected final Node<P_OUT> m68481y() {
            return Nodes.m59624a(this.f59843i.mo13627e());
        }

        /* renamed from: z */
        protected final Node<P_OUT> m68482z() {
            long j = -1;
            if (m66665v()) {
                if (StreamOpFlag.SIZED.isPreserved(this.f59843i.f54421a)) {
                    j = this.f59843i.mo12959a(this.e);
                }
                Sink a = this.f59843i.mo12961a(j, this.f59844j);
                this.d.mo12970c(this.d.mo12964a(this.f59843i.mo14011a(this.d.mo12969c(), a)), this.e);
                return a.build();
            }
            a = this.f59843i.mo12961a(-1, this.f59844j);
            if (this.f59845k == 0) {
                this.d.mo12970c(this.d.mo12964a(this.f59843i.mo14011a(this.d.mo12969c(), a)), this.e);
            } else {
                this.d.mo12965a(a, this.e);
            }
            Node<P_OUT> build = a.build();
            this.f59847p = build.mo12999c();
            this.f59848q = true;
            this.e = null;
            return build;
        }

        /* renamed from: a */
        public final void mo13597a(CountedCompleter<?> countedCompleter) {
            if (!m66664u()) {
                Object y;
                this.f59847p = ((SliceTask) this.g).f59847p + ((SliceTask) this.h).f59847p;
                if (this.b) {
                    this.f59847p = 0;
                    y = m68481y();
                } else if (this.f59847p == 0) {
                    y = m68481y();
                } else if (((SliceTask) this.g).f59847p == 0) {
                    y = (Node) ((SliceTask) this.h).mo13614p();
                } else {
                    y = Nodes.m59625a(this.f59843i.mo13627e(), (Node) ((SliceTask) this.g).mo13614p(), (Node) ((SliceTask) this.h).mo13614p());
                }
                if (m66665v()) {
                    y = m68472a((Node) y);
                }
                mo14009b(y);
                this.f59848q = true;
            }
            if (this.f59846o >= 0 && !m66665v() && m68473d(this.f59845k + this.f59846o)) {
                m67717s();
            }
            super.mo13597a((CountedCompleter) countedCompleter);
        }

        /* renamed from: q */
        protected void mo14010q() {
            super.mo14010q();
            if (this.f59848q) {
                mo14009b(m68481y());
            }
        }

        /* renamed from: a */
        private Node<P_OUT> m68472a(Node<P_OUT> node) {
            return node.mo13001a(this.f59845k, this.f59846o >= 0 ? Math.min(node.mo12999c(), this.f59845k + this.f59846o) : this.f59847p, this.f59844j);
        }

        /* renamed from: d */
        private boolean m68473d(long j) {
            long e = this.f59848q ? this.f59847p : m68474e(j);
            boolean z = true;
            if (e >= j) {
                return true;
            }
            AbstractTask abstractTask = (SliceTask) m66666w();
            long j2 = e;
            AbstractTask abstractTask2 = this;
            while (abstractTask != null) {
                if (abstractTask2 == abstractTask.h) {
                    SliceTask sliceTask = (SliceTask) abstractTask.g;
                    if (sliceTask != null) {
                        long e2 = j2 + sliceTask.m68474e(j);
                        if (e2 >= j) {
                            return true;
                        }
                        j2 = e2;
                    } else {
                        continue;
                    }
                }
                AbstractTask abstractTask3 = abstractTask;
                abstractTask = (SliceTask) abstractTask.m66666w();
                abstractTask2 = abstractTask3;
            }
            if (j2 < j) {
                z = false;
            }
            return z;
        }

        /* renamed from: e */
        private long m68474e(long j) {
            if (this.f59848q) {
                return this.f59847p;
            }
            SliceTask sliceTask = (SliceTask) this.g;
            SliceTask sliceTask2 = (SliceTask) this.h;
            if (sliceTask != null) {
                if (sliceTask2 != null) {
                    long j2;
                    long e = sliceTask.m68474e(j);
                    if (e >= j) {
                        j2 = e;
                    } else {
                        j2 = e + sliceTask2.m68474e(j);
                    }
                    return j2;
                }
            }
            return this.f59847p;
        }
    }

    /* renamed from: b */
    private static long m59684b(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Format.OFFSET_SAMPLE_RELATIVE;
        return j3 >= 0 ? j3 : Format.OFFSET_SAMPLE_RELATIVE;
    }

    private SliceOps() {
    }

    /* renamed from: b */
    private static long m59685b(long j, long j2, long j3) {
        return j >= 0 ? Math.max(-1, Math.min(j - j2, j3)) : -1;
    }

    /* renamed from: b */
    private static <P_IN> Spliterator<P_IN> m59686b(StreamShape streamShape, Spliterator<P_IN> spliterator, long j, long j2) {
        long b = m59684b(j, j2);
        switch (streamShape) {
            case REFERENCE:
                return new OfRef(spliterator, j, b);
            case INT_VALUE:
                return new OfInt((OfInt) spliterator, j, b);
            case LONG_VALUE:
                return new OfLong((OfLong) spliterator, j, b);
            case DOUBLE_VALUE:
                return new OfDouble((OfDouble) spliterator, j, b);
            default:
                j = new StringBuilder();
                j.append("Unknown shape ");
                j.append(streamShape);
                throw new IllegalStateException(j.toString());
        }
    }

    /* renamed from: a */
    public static <T> Stream<T> m59683a(AbstractPipeline<?, T, ?> abstractPipeline, long j, long j2) {
        if (j < 0) {
            j2 = new StringBuilder();
            j2.append("Skip must be non-negative: ");
            j2.append(j);
            throw new IllegalArgumentException(j2.toString());
        }
        final long j3 = j;
        final long j4 = j2;
        return new StatefulOp<T, T>(abstractPipeline, StreamShape.REFERENCE, m59679a(j2)) {
            /* renamed from: a */
            Spliterator<T> m68444a(Spliterator<T> spliterator, long j, long j2, long j3) {
                long min;
                long j4;
                long j5 = j2;
                if (j <= j3) {
                    min = j5 >= 0 ? Math.min(j5, j3 - j) : j3 - j;
                    j4 = 0;
                } else {
                    j4 = j;
                    min = j5;
                }
                return new OfRef(spliterator, j4, min);
            }

            /* renamed from: a */
            <P_IN> Spliterator<T> mo14145a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
                Spliterator spliterator2;
                AbstractPipeline abstractPipeline = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return new OfRef(pipelineHelper.mo12966b(spliterator), j3, SliceOps.m59684b(j3, j4));
                    }
                }
                spliterator2 = spliterator;
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return m68444a(pipelineHelper.mo12966b(spliterator), j3, j4, a);
                }
                return ((Node) new SliceTask(abstractPipeline, pipelineHelper, spliterator2, Nodes.m59609a(), j3, j4).m59285k()).y_();
            }

            /* renamed from: a */
            <P_IN> Node<T> mo14013a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<T[]> intFunction) {
                Spliterator spliterator2;
                PipelineHelper pipelineHelper2;
                PipelineHelper pipelineHelper3 = this;
                IntFunction intFunction2 = intFunction;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return Nodes.m59623a((PipelineHelper) pipelineHelper, SliceOps.m59686b(pipelineHelper.mo12967b(), spliterator2, j3, j4), true, intFunction2);
                    }
                    pipelineHelper2 = pipelineHelper;
                } else {
                    pipelineHelper2 = pipelineHelper;
                    spliterator2 = spliterator;
                }
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return Nodes.m59623a(pipelineHelper3, m68444a(pipelineHelper.mo12966b(spliterator), j3, j4, a), true, intFunction2);
                }
                return (Node) new SliceTask(pipelineHelper3, pipelineHelper2, spliterator2, intFunction2, j3, j4).m59285k();
            }

            /* renamed from: a */
            Sink<T> mo14011a(int i, Sink<T> sink) {
                return new ChainedReference<T, T>(this, sink) {
                    /* renamed from: a */
                    long f59274a = j3;
                    /* renamed from: b */
                    long f59275b;
                    /* renamed from: c */
                    final /* synthetic */ C192671 f59276c;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(SliceOps.m59685b(j, j3, this.f59275b));
                    }

                    public void accept(T t) {
                        if (this.f59274a != 0) {
                            this.f59274a--;
                        } else if (this.f59275b > 0) {
                            this.f59275b--;
                            this.d.accept(t);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59275b != 0) {
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

    /* renamed from: b */
    public static IntStream m59687b(AbstractPipeline<?, Integer, ?> abstractPipeline, long j, long j2) {
        if (j < 0) {
            j2 = new StringBuilder();
            j2.append("Skip must be non-negative: ");
            j2.append(j);
            throw new IllegalArgumentException(j2.toString());
        }
        final long j3 = j;
        final long j4 = j2;
        return new StatefulOp<Integer>(abstractPipeline, StreamShape.INT_VALUE, m59679a(j2)) {
            /* renamed from: a */
            OfInt m68452a(OfInt ofInt, long j, long j2, long j3) {
                long min;
                long j4;
                long j5 = j2;
                if (j <= j3) {
                    min = j5 >= 0 ? Math.min(j5, j3 - j) : j3 - j;
                    j4 = 0;
                } else {
                    j4 = j;
                    min = j5;
                }
                return new OfInt(ofInt, j4, min);
            }

            /* renamed from: a */
            <P_IN> Spliterator<Integer> mo14145a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator) {
                AbstractPipeline abstractPipeline = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                Spliterator spliterator2;
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return new OfInt((OfInt) pipelineHelper.mo12966b(spliterator), j3, SliceOps.m59684b(j3, j4));
                    }
                }
                spliterator2 = spliterator;
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return m68452a((OfInt) pipelineHelper.mo12966b(spliterator), j3, j4, a);
                }
                return ((Node) new SliceTask(abstractPipeline, pipelineHelper, spliterator2, SliceOps$2$$Lambda$1.m64065a(), j3, j4).m59285k()).y_();
            }

            /* renamed from: a */
            <P_IN> Node<Integer> mo14013a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Integer[]> intFunction) {
                Spliterator spliterator2;
                PipelineHelper pipelineHelper2;
                PipelineHelper pipelineHelper3 = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return Nodes.m59615a((PipelineHelper) pipelineHelper, SliceOps.m59686b(pipelineHelper.mo12967b(), spliterator2, j3, j4), true);
                    }
                    pipelineHelper2 = pipelineHelper;
                } else {
                    pipelineHelper2 = pipelineHelper;
                    spliterator2 = spliterator;
                }
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return Nodes.m59615a(pipelineHelper3, m68452a((OfInt) pipelineHelper.mo12966b(spliterator), j3, j4, a), true);
                }
                return (Node) new SliceTask(pipelineHelper3, pipelineHelper2, spliterator2, intFunction, j3, j4).m59285k();
            }

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedInt<Integer>(this, sink) {
                    /* renamed from: a */
                    long f59828a = j3;
                    /* renamed from: c */
                    long f59829c;
                    /* renamed from: d */
                    final /* synthetic */ C192692 f59830d;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(SliceOps.m59685b(j, j3, this.f59829c));
                    }

                    public void accept(int i) {
                        if (this.f59828a != 0) {
                            this.f59828a--;
                        } else if (this.f59829c > 0) {
                            this.f59829c--;
                            this.b.accept(i);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59829c != 0) {
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

    /* renamed from: c */
    public static LongStream m59688c(AbstractPipeline<?, Long, ?> abstractPipeline, long j, long j2) {
        if (j < 0) {
            j2 = new StringBuilder();
            j2.append("Skip must be non-negative: ");
            j2.append(j);
            throw new IllegalArgumentException(j2.toString());
        }
        final long j3 = j;
        final long j4 = j2;
        return new StatefulOp<Long>(abstractPipeline, StreamShape.LONG_VALUE, m59679a(j2)) {
            /* renamed from: a */
            OfLong m68460a(OfLong ofLong, long j, long j2, long j3) {
                long min;
                long j4;
                long j5 = j2;
                if (j <= j3) {
                    min = j5 >= 0 ? Math.min(j5, j3 - j) : j3 - j;
                    j4 = 0;
                } else {
                    j4 = j;
                    min = j5;
                }
                return new OfLong(ofLong, j4, min);
            }

            /* renamed from: a */
            <P_IN> Spliterator<Long> mo14145a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator) {
                Spliterator spliterator2;
                AbstractPipeline abstractPipeline = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return new OfLong((OfLong) pipelineHelper.mo12966b(spliterator), j3, SliceOps.m59684b(j3, j4));
                    }
                }
                spliterator2 = spliterator;
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return m68460a((OfLong) pipelineHelper.mo12966b(spliterator), j3, j4, a);
                }
                return ((Node) new SliceTask(abstractPipeline, pipelineHelper, spliterator2, SliceOps$3$$Lambda$1.m64066a(), j3, j4).m59285k()).y_();
            }

            /* renamed from: a */
            <P_IN> Node<Long> mo14013a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Long[]> intFunction) {
                Spliterator spliterator2;
                PipelineHelper pipelineHelper2;
                PipelineHelper pipelineHelper3 = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return Nodes.m59633b(pipelineHelper, SliceOps.m59686b(pipelineHelper.mo12967b(), spliterator2, j3, j4), true);
                    }
                    pipelineHelper2 = pipelineHelper;
                } else {
                    pipelineHelper2 = pipelineHelper;
                    spliterator2 = spliterator;
                }
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return Nodes.m59633b(pipelineHelper3, m68460a((OfLong) pipelineHelper.mo12966b(spliterator), j3, j4, a), true);
                }
                return (Node) new SliceTask(pipelineHelper3, pipelineHelper2, spliterator2, intFunction, j3, j4).m59285k();
            }

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Long> sink) {
                return new ChainedLong<Long>(this, sink) {
                    /* renamed from: a */
                    long f59833a = j3;
                    /* renamed from: c */
                    long f59834c;
                    /* renamed from: d */
                    final /* synthetic */ C192713 f59835d;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(SliceOps.m59685b(j, j3, this.f59834c));
                    }

                    public void accept(long j) {
                        if (this.f59833a != 0) {
                            this.f59833a--;
                        } else if (this.f59834c > 0) {
                            this.f59834c--;
                            this.b.accept(j);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59834c != 0) {
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

    /* renamed from: d */
    public static DoubleStream m59689d(AbstractPipeline<?, Double, ?> abstractPipeline, long j, long j2) {
        if (j < 0) {
            j2 = new StringBuilder();
            j2.append("Skip must be non-negative: ");
            j2.append(j);
            throw new IllegalArgumentException(j2.toString());
        }
        final long j3 = j;
        final long j4 = j2;
        return new StatefulOp<Double>(abstractPipeline, StreamShape.DOUBLE_VALUE, m59679a(j2)) {
            /* renamed from: a */
            OfDouble m68468a(OfDouble ofDouble, long j, long j2, long j3) {
                long min;
                long j4;
                long j5 = j2;
                if (j <= j3) {
                    min = j5 >= 0 ? Math.min(j5, j3 - j) : j3 - j;
                    j4 = 0;
                } else {
                    j4 = j;
                    min = j5;
                }
                return new OfDouble(ofDouble, j4, min);
            }

            /* renamed from: a */
            <P_IN> Spliterator<Double> mo14145a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator) {
                Spliterator spliterator2;
                AbstractPipeline abstractPipeline = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return new OfDouble((OfDouble) pipelineHelper.mo12966b(spliterator), j3, SliceOps.m59684b(j3, j4));
                    }
                }
                spliterator2 = spliterator;
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return m68468a((OfDouble) pipelineHelper.mo12966b(spliterator), j3, j4, a);
                }
                return ((Node) new SliceTask(abstractPipeline, pipelineHelper, spliterator2, SliceOps$4$$Lambda$1.m64067a(), j3, j4).m59285k()).y_();
            }

            /* renamed from: a */
            <P_IN> Node<Double> mo14013a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Double[]> intFunction) {
                Spliterator spliterator2;
                PipelineHelper pipelineHelper2;
                PipelineHelper pipelineHelper3 = this;
                long a = pipelineHelper.mo12959a((Spliterator) spliterator);
                if (a > 0) {
                    spliterator2 = spliterator;
                    if (spliterator2.hasCharacteristics(16384)) {
                        return Nodes.m59638c(pipelineHelper, SliceOps.m59686b(pipelineHelper.mo12967b(), spliterator2, j3, j4), true);
                    }
                    pipelineHelper2 = pipelineHelper;
                } else {
                    pipelineHelper2 = pipelineHelper;
                    spliterator2 = spliterator;
                }
                if (!StreamOpFlag.ORDERED.isKnown(pipelineHelper.mo12969c())) {
                    return Nodes.m59638c(pipelineHelper3, m68468a((OfDouble) pipelineHelper.mo12966b(spliterator), j3, j4, a), true);
                }
                return (Node) new SliceTask(pipelineHelper3, pipelineHelper2, spliterator2, intFunction, j3, j4).m59285k();
            }

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Double> sink) {
                return new ChainedDouble<Double>(this, sink) {
                    /* renamed from: a */
                    long f59838a = j3;
                    /* renamed from: c */
                    long f59839c;
                    /* renamed from: d */
                    final /* synthetic */ C192734 f59840d;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(SliceOps.m59685b(j, j3, this.f59839c));
                    }

                    public void accept(double d) {
                        if (this.f59838a != 0) {
                            this.f59838a--;
                        } else if (this.f59839c > 0) {
                            this.f59839c--;
                            this.b.accept(d);
                        }
                    }

                    /* renamed from: b */
                    public boolean mo13612b() {
                        if (this.f59839c != 0) {
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
    private static int m59679a(long j) {
        return (j != -1 ? StreamOpFlag.IS_SHORT_CIRCUIT : null) | StreamOpFlag.NOT_SIZED;
    }
}
