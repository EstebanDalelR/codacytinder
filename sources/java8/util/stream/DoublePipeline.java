package java8.util.stream;

import java.util.Iterator;
import java8.util.DoubleSummaryStatistics;
import java8.util.Objects;
import java8.util.OptionalDouble;
import java8.util.PrimitiveIterator;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterators;
import java8.util.function.BiConsumer;
import java8.util.function.DoubleBinaryOperator;
import java8.util.function.DoubleConsumer;
import java8.util.function.DoubleFunction;
import java8.util.function.DoublePredicate;
import java8.util.function.DoubleToIntFunction;
import java8.util.function.DoubleToLongFunction;
import java8.util.function.DoubleUnaryOperator;
import java8.util.function.IntFunction;
import java8.util.function.ObjDoubleConsumer;
import java8.util.function.Supplier;
import java8.util.stream.Node.Builder;
import java8.util.stream.Sink.ChainedDouble;

abstract class DoublePipeline<E_IN> extends AbstractPipeline<E_IN, Double, DoubleStream> implements DoubleStream {

    static class Head<E_IN> extends DoublePipeline<E_IN> {
        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66699b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ DoubleStream parallel() {
            return (DoubleStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ DoubleStream sequential() {
            return (DoubleStream) super.sequential();
        }

        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        Head(Spliterator<Double> spliterator, int i, boolean z) {
            super(spliterator, i, z);
        }

        /* renamed from: f */
        final boolean mo14012f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        final Sink<E_IN> mo14011a(int i, Sink<Double> sink) {
            throw new UnsupportedOperationException();
        }

        public void forEach(DoubleConsumer doubleConsumer) {
            if (isParallel()) {
                super.forEach(doubleConsumer);
            } else {
                DoublePipeline.m66689e(m63924a()).forEachRemaining(doubleConsumer);
            }
        }

        public void forEachOrdered(DoubleConsumer doubleConsumer) {
            if (isParallel()) {
                super.forEachOrdered(doubleConsumer);
            } else {
                DoublePipeline.m66689e(m63924a()).forEachRemaining(doubleConsumer);
            }
        }
    }

    static abstract class StatefulOp<E_IN> extends DoublePipeline<E_IN> {
        /* renamed from: a */
        abstract <P_IN> Node<Double> mo14013a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Double[]> intFunction);

        /* renamed from: f */
        final boolean mo14012f() {
            return true;
        }

        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66699b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ DoubleStream parallel() {
            return (DoubleStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ DoubleStream sequential() {
            return (DoubleStream) super.sequential();
        }

        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        StatefulOp(AbstractPipeline<?, E_IN, ?> abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }

    static abstract class StatelessOp<E_IN> extends DoublePipeline<E_IN> {
        /* renamed from: f */
        final boolean mo14012f() {
            return false;
        }

        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66699b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ DoubleStream parallel() {
            return (DoubleStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ DoubleStream sequential() {
            return (DoubleStream) super.sequential();
        }

        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        StatelessOp(AbstractPipeline<?, E_IN, ?> abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }

    /* renamed from: a */
    /* synthetic */ Spliterator mo13615a(Supplier supplier) {
        return m66699b(supplier);
    }

    public /* bridge */ /* synthetic */ DoubleStream parallel() {
        return (DoubleStream) super.parallel();
    }

    public /* bridge */ /* synthetic */ DoubleStream sequential() {
        return (DoubleStream) super.sequential();
    }

    public /* synthetic */ BaseStream unordered() {
        return mo13634g();
    }

    DoublePipeline(Spliterator<Double> spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    DoublePipeline(AbstractPipeline<?, E_IN, ?> abstractPipeline, int i) {
        super(abstractPipeline, i);
    }

    /* renamed from: b */
    private static DoubleConsumer m66679b(Sink<Double> sink) {
        if (sink instanceof DoubleConsumer) {
            return (DoubleConsumer) sink;
        }
        sink.getClass();
        return DoublePipeline$$Lambda$1.m63973a(sink);
    }

    /* renamed from: e */
    private static OfDouble m66689e(Spliterator<Double> spliterator) {
        if (spliterator instanceof OfDouble) {
            return (OfDouble) spliterator;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* renamed from: e */
    final StreamShape mo13627e() {
        return StreamShape.DOUBLE_VALUE;
    }

    /* renamed from: a */
    final <P_IN> Node<Double> mo13617a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, boolean z, IntFunction<Double[]> intFunction) {
        return Nodes.m59638c(pipelineHelper, spliterator, z);
    }

    /* renamed from: a */
    final <P_IN> Spliterator<Double> mo13616a(PipelineHelper<Double> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
        return new DoubleWrappingSpliterator((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
    }

    /* renamed from: b */
    final OfDouble m66699b(Supplier<? extends Spliterator<Double>> supplier) {
        return new OfDouble(supplier);
    }

    /* renamed from: a */
    final boolean mo13618a(Spliterator<Double> spliterator, Sink<Double> sink) {
        boolean b;
        spliterator = m66689e(spliterator);
        DoubleConsumer b2 = m66679b((Sink) sink);
        do {
            b = sink.mo13612b();
            if (b) {
                break;
            }
        } while (spliterator.tryAdvance(b2));
        return b;
    }

    /* renamed from: a */
    final Builder<Double> mo12961a(long j, IntFunction<Double[]> intFunction) {
        return Nodes.m59636c(j);
    }

    /* renamed from: a */
    private <U> Stream<U> m66674a(DoubleFunction<? extends U> doubleFunction, int i) {
        final DoubleFunction<? extends U> doubleFunction2 = doubleFunction;
        return new StatelessOp<Double, U>(this, this, StreamShape.DOUBLE_VALUE, i) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59658c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<U> sink) {
                return new ChainedDouble<U>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192031 f59656a;

                    public void accept(double d) {
                        this.b.accept(doubleFunction2.apply(d));
                    }
                };
            }
        };
    }

    public final PrimitiveIterator.OfDouble iterator() {
        return Spliterators.m59153a(spliterator());
    }

    public final OfDouble spliterator() {
        return m66689e(super.spliterator());
    }

    public final Stream<Double> boxed() {
        return m66674a(DoublePipeline$$Lambda$2.m63974a(), 0);
    }

    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.m59115b(doubleUnaryOperator);
        final DoubleUnaryOperator doubleUnaryOperator2 = doubleUnaryOperator;
        return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59661c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Double> sink) {
                return new ChainedDouble<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192052 f59659a;

                    public void accept(double d) {
                        this.b.accept(doubleUnaryOperator2.applyAsDouble(d));
                    }
                };
            }
        };
    }

    public final <U> Stream<U> mapToObj(DoubleFunction<? extends U> doubleFunction) {
        Objects.m59115b(doubleFunction);
        return m66674a((DoubleFunction) doubleFunction, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT);
    }

    public final IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        Objects.m59115b(doubleToIntFunction);
        final DoubleToIntFunction doubleToIntFunction2 = doubleToIntFunction;
        return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59664c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedDouble<Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192073 f59662a;

                    public void accept(double d) {
                        this.b.accept(doubleToIntFunction2.applyAsInt(d));
                    }
                };
            }
        };
    }

    public final LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        Objects.m59115b(doubleToLongFunction);
        final DoubleToLongFunction doubleToLongFunction2 = doubleToLongFunction;
        return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59667c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Long> sink) {
                return new ChainedDouble<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192094 f59665a;

                    public void accept(double d) {
                        this.b.accept(doubleToLongFunction2.applyAsLong(d));
                    }
                };
            }
        };
    }

    public final DoubleStream flatMap(DoubleFunction<? extends DoubleStream> doubleFunction) {
        Objects.m59115b(doubleFunction);
        final DoubleFunction<? extends DoubleStream> doubleFunction2 = doubleFunction;
        return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59670c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Double> sink) {
                return new ChainedDouble<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192115 f59668a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(double d) {
                        Throwable th;
                        DoubleStream doubleStream = null;
                        try {
                            DoubleStream doubleStream2 = (DoubleStream) doubleFunction2.apply(d);
                            if (doubleStream2 != null) {
                                try {
                                    doubleStream2.sequential().forEach(DoublePipeline$5$1$$Lambda$1.m63982a(this));
                                } catch (Throwable th2) {
                                    th = th2;
                                    doubleStream = doubleStream2;
                                    if (doubleStream != null) {
                                        doubleStream.close();
                                    }
                                    throw th;
                                }
                            }
                            if (doubleStream2 != null) {
                                doubleStream2.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (doubleStream != null) {
                                doubleStream.close();
                            }
                            throw th;
                        }
                    }

                    /* renamed from: a */
                    private /* synthetic */ void m68261a(double d) {
                        this.b.accept(d);
                    }
                };
            }
        };
    }

    /* renamed from: g */
    public DoubleStream mo13634g() {
        if (m63944d()) {
            return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, StreamOpFlag.NOT_ORDERED) {
                /* renamed from: b */
                final /* synthetic */ DoublePipeline f59671b;

                /* renamed from: a */
                Sink<Double> mo14011a(int i, Sink<Double> sink) {
                    return sink;
                }
            };
        }
        return this;
    }

    public final DoubleStream filter(DoublePredicate doublePredicate) {
        Objects.m59115b(doublePredicate);
        final DoublePredicate doublePredicate2 = doublePredicate;
        return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59674c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Double> sink) {
                return new ChainedDouble<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192147 f59672a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(double d) {
                        if (doublePredicate2.test(d)) {
                            this.b.accept(d);
                        }
                    }
                };
            }
        };
    }

    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        Objects.m59115b(doubleConsumer);
        final DoubleConsumer doubleConsumer2 = doubleConsumer;
        return new StatelessOp<Double>(this, this, StreamShape.DOUBLE_VALUE, 0) {
            /* renamed from: c */
            final /* synthetic */ DoublePipeline f59677c;

            /* renamed from: a */
            Sink<Double> mo14011a(int i, Sink<Double> sink) {
                return new ChainedDouble<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192168 f59675a;

                    public void accept(double d) {
                        doubleConsumer2.accept(d);
                        this.b.accept(d);
                    }
                };
            }
        };
    }

    public final DoubleStream limit(long j) {
        if (j >= 0) {
            return SliceOps.m59689d(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final DoubleStream skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        } else if (j == 0) {
            return this;
        } else {
            return SliceOps.m59689d(this, j, -1);
        }
    }

    public final DoubleStream takeWhile(DoublePredicate doublePredicate) {
        return WhileOps.m59715a((AbstractPipeline) this, doublePredicate);
    }

    public final DoubleStream dropWhile(DoublePredicate doublePredicate) {
        return WhileOps.m59719b((AbstractPipeline) this, doublePredicate);
    }

    public final DoubleStream sorted() {
        return SortedOps.m59694d(this);
    }

    public final DoubleStream distinct() {
        return boxed().distinct().mapToDouble(DoublePipeline$$Lambda$3.m63975a());
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        m63923a((TerminalOp) ForEachOps.m59567a(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        m63923a((TerminalOp) ForEachOps.m59567a(doubleConsumer, true));
    }

    public final double sum() {
        return Collectors.m59412a((double[]) collect(DoublePipeline$$Lambda$4.m63976a(), DoublePipeline$$Lambda$5.m63977a(), DoublePipeline$$Lambda$6.m63978a()));
    }

    /* renamed from: d */
    private static /* synthetic */ void m66687d(double[] dArr, double d) {
        Collectors.m59461a(dArr, d);
        dArr[2] = dArr[2] + d;
    }

    /* renamed from: d */
    private static /* synthetic */ void m66688d(double[] dArr, double[] dArr2) {
        Collectors.m59461a(dArr, dArr2[0]);
        Collectors.m59461a(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
    }

    public final OptionalDouble min() {
        return reduce(DoublePipeline$$Lambda$7.m63979a());
    }

    public final OptionalDouble max() {
        return reduce(DoublePipeline$$Lambda$8.m63980a());
    }

    public final OptionalDouble average() {
        double[] dArr = (double[]) collect(DoublePipeline$$Lambda$9.m63981a(), DoublePipeline$$Lambda$10.m63967a(), DoublePipeline$$Lambda$11.m63968a());
        if (dArr[2] > 0.0d) {
            return OptionalDouble.m59134a(Collectors.m59412a(dArr) / dArr[2]);
        }
        return OptionalDouble.m59133a();
    }

    /* renamed from: c */
    private static /* synthetic */ void m66683c(double[] dArr, double d) {
        dArr[2] = dArr[2] + 1.0d;
        Collectors.m59461a(dArr, d);
        dArr[3] = dArr[3] + d;
    }

    /* renamed from: c */
    private static /* synthetic */ void m66684c(double[] dArr, double[] dArr2) {
        Collectors.m59461a(dArr, dArr2[0]);
        Collectors.m59461a(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }

    public final long count() {
        return ((Long) m63923a(ReduceOps.m59672d())).longValue();
    }

    public final DoubleSummaryStatistics summaryStatistics() {
        return (DoubleSummaryStatistics) collect(DoublePipeline$$Lambda$12.m63969a(), DoublePipeline$$Lambda$13.m63970a(), DoublePipeline$$Lambda$14.m63971a());
    }

    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return ((Double) m63923a((TerminalOp) ReduceOps.m59657a(d, doubleBinaryOperator))).doubleValue();
    }

    public final OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return (OptionalDouble) m63923a((TerminalOp) ReduceOps.m59662a(doubleBinaryOperator));
    }

    public final <R> R collect(Supplier<R> supplier, ObjDoubleConsumer<R> objDoubleConsumer, BiConsumer<R, R> biConsumer) {
        Objects.m59115b(biConsumer);
        return m63923a((TerminalOp) ReduceOps.m59666a((Supplier) supplier, (ObjDoubleConsumer) objDoubleConsumer, DoublePipeline$$Lambda$15.m66671a(biConsumer)));
    }

    public final boolean anyMatch(DoublePredicate doublePredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59574a(doublePredicate, MatchKind.ANY))).booleanValue();
    }

    public final boolean allMatch(DoublePredicate doublePredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59574a(doublePredicate, MatchKind.ALL))).booleanValue();
    }

    public final boolean noneMatch(DoublePredicate doublePredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59574a(doublePredicate, MatchKind.NONE))).booleanValue();
    }

    public final OptionalDouble findFirst() {
        return (OptionalDouble) m63923a(FindOps.m59565d(true));
    }

    public final OptionalDouble findAny() {
        return (OptionalDouble) m63923a(FindOps.m59565d(false));
    }

    public final double[] toArray() {
        return (double[]) Nodes.m59612a((Node.OfDouble) m63931a(DoublePipeline$$Lambda$16.m63972a())).asPrimitiveArray();
    }
}
