package java8.util.stream;

import java.util.Iterator;
import java8.util.LongSummaryStatistics;
import java8.util.Objects;
import java8.util.OptionalDouble;
import java8.util.OptionalLong;
import java8.util.PrimitiveIterator;
import java8.util.Spliterator;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterators;
import java8.util.function.BiConsumer;
import java8.util.function.IntFunction;
import java8.util.function.LongBinaryOperator;
import java8.util.function.LongConsumer;
import java8.util.function.LongFunction;
import java8.util.function.LongPredicate;
import java8.util.function.LongToDoubleFunction;
import java8.util.function.LongToIntFunction;
import java8.util.function.LongUnaryOperator;
import java8.util.function.ObjLongConsumer;
import java8.util.function.Supplier;
import java8.util.stream.Node.Builder;
import java8.util.stream.Sink.ChainedLong;

abstract class LongPipeline<E_IN> extends AbstractPipeline<E_IN, Long, LongStream> implements LongStream {

    static class Head<E_IN> extends LongPipeline<E_IN> {
        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66755b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ LongStream parallel() {
            return (LongStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ LongStream sequential() {
            return (LongStream) super.sequential();
        }

        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        Head(Spliterator<Long> spliterator, int i, boolean z) {
            super(spliterator, i, z);
        }

        /* renamed from: f */
        final boolean mo14012f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        final Sink<E_IN> mo14011a(int i, Sink<Long> sink) {
            throw new UnsupportedOperationException();
        }

        public void forEach(LongConsumer longConsumer) {
            if (isParallel()) {
                super.forEach(longConsumer);
            } else {
                LongPipeline.m66747e(m63924a()).forEachRemaining(longConsumer);
            }
        }

        public void forEachOrdered(LongConsumer longConsumer) {
            if (isParallel()) {
                super.forEachOrdered(longConsumer);
            } else {
                LongPipeline.m66747e(m63924a()).forEachRemaining(longConsumer);
            }
        }
    }

    static abstract class StatefulOp<E_IN> extends LongPipeline<E_IN> {
        /* renamed from: a */
        abstract <P_IN> Node<Long> mo14013a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Long[]> intFunction);

        /* renamed from: f */
        final boolean mo14012f() {
            return true;
        }

        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66755b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ LongStream parallel() {
            return (LongStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ LongStream sequential() {
            return (LongStream) super.sequential();
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

    static abstract class StatelessOp<E_IN> extends LongPipeline<E_IN> {
        /* renamed from: f */
        final boolean mo14012f() {
            return false;
        }

        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66755b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ LongStream parallel() {
            return (LongStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ LongStream sequential() {
            return (LongStream) super.sequential();
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
        return m66755b(supplier);
    }

    public /* bridge */ /* synthetic */ LongStream parallel() {
        return (LongStream) super.parallel();
    }

    public /* bridge */ /* synthetic */ LongStream sequential() {
        return (LongStream) super.sequential();
    }

    public /* synthetic */ BaseStream unordered() {
        return mo13634g();
    }

    LongPipeline(Spliterator<Long> spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    LongPipeline(AbstractPipeline<?, E_IN, ?> abstractPipeline, int i) {
        super(abstractPipeline, i);
    }

    /* renamed from: b */
    private static LongConsumer m66741b(Sink<Long> sink) {
        if (sink instanceof LongConsumer) {
            return (LongConsumer) sink;
        }
        sink.getClass();
        return LongPipeline$$Lambda$1.m64012a(sink);
    }

    /* renamed from: e */
    private static OfLong m66747e(Spliterator<Long> spliterator) {
        if (spliterator instanceof OfLong) {
            return (OfLong) spliterator;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* renamed from: e */
    final StreamShape mo13627e() {
        return StreamShape.LONG_VALUE;
    }

    /* renamed from: a */
    final <P_IN> Node<Long> mo13617a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, boolean z, IntFunction<Long[]> intFunction) {
        return Nodes.m59633b(pipelineHelper, spliterator, z);
    }

    /* renamed from: a */
    final <P_IN> Spliterator<Long> mo13616a(PipelineHelper<Long> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
        return new LongWrappingSpliterator((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
    }

    /* renamed from: b */
    final OfLong m66755b(Supplier<? extends Spliterator<Long>> supplier) {
        return new OfLong(supplier);
    }

    /* renamed from: a */
    final boolean mo13618a(Spliterator<Long> spliterator, Sink<Long> sink) {
        boolean b;
        spliterator = m66747e(spliterator);
        LongConsumer b2 = m66741b((Sink) sink);
        do {
            b = sink.mo13612b();
            if (b) {
                break;
            }
        } while (spliterator.tryAdvance(b2));
        return b;
    }

    /* renamed from: a */
    final Builder<Long> mo12961a(long j, IntFunction<Long[]> intFunction) {
        return Nodes.m59631b(j);
    }

    /* renamed from: a */
    private <U> Stream<U> m66736a(LongFunction<? extends U> longFunction, int i) {
        final LongFunction<? extends U> longFunction2 = longFunction;
        return new StatelessOp<Long, U>(this, this, StreamShape.LONG_VALUE, i) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59732c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<U> sink) {
                return new ChainedLong<U>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192401 f59730a;

                    public void accept(long j) {
                        this.b.accept(longFunction2.apply(j));
                    }
                };
            }
        };
    }

    public final PrimitiveIterator.OfLong iterator() {
        return Spliterators.m59155a(spliterator());
    }

    public final OfLong spliterator() {
        return m66747e(super.spliterator());
    }

    public final DoubleStream asDoubleStream() {
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: b */
            final /* synthetic */ LongPipeline f59734b;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Double> sink) {
                return new ChainedLong<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192422 f59733a;

                    public void accept(long j) {
                        this.b.accept((double) j);
                    }
                };
            }
        };
    }

    public final Stream<Long> boxed() {
        return m66736a(LongPipeline$$Lambda$2.m64013a(), 0);
    }

    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        Objects.m59115b(longUnaryOperator);
        final LongUnaryOperator longUnaryOperator2 = longUnaryOperator;
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59737c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Long> sink) {
                return new ChainedLong<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192443 f59735a;

                    public void accept(long j) {
                        this.b.accept(longUnaryOperator2.applyAsLong(j));
                    }
                };
            }
        };
    }

    public final <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction) {
        Objects.m59115b(longFunction);
        return m66736a((LongFunction) longFunction, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT);
    }

    public final IntStream mapToInt(LongToIntFunction longToIntFunction) {
        Objects.m59115b(longToIntFunction);
        final LongToIntFunction longToIntFunction2 = longToIntFunction;
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59740c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedLong<Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192464 f59738a;

                    public void accept(long j) {
                        this.b.accept(longToIntFunction2.applyAsInt(j));
                    }
                };
            }
        };
    }

    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        Objects.m59115b(longToDoubleFunction);
        final LongToDoubleFunction longToDoubleFunction2 = longToDoubleFunction;
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59743c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Double> sink) {
                return new ChainedLong<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192485 f59741a;

                    public void accept(long j) {
                        this.b.accept(longToDoubleFunction2.applyAsDouble(j));
                    }
                };
            }
        };
    }

    public final LongStream flatMap(LongFunction<? extends LongStream> longFunction) {
        Objects.m59115b(longFunction);
        final LongFunction<? extends LongStream> longFunction2 = longFunction;
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59746c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Long> sink) {
                return new ChainedLong<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192506 f59744a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(long j) {
                        Throwable th;
                        LongStream longStream = null;
                        try {
                            LongStream longStream2 = (LongStream) longFunction2.apply(j);
                            if (longStream2 != null) {
                                try {
                                    longStream2.sequential().forEach(LongPipeline$6$1$$Lambda$1.m64021a(this));
                                } catch (Throwable th2) {
                                    th = th2;
                                    longStream = longStream2;
                                    if (longStream != null) {
                                        longStream.close();
                                    }
                                    throw th;
                                }
                            }
                            if (longStream2 != null) {
                                longStream2.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (longStream != null) {
                                longStream.close();
                            }
                            throw th;
                        }
                    }

                    /* renamed from: b */
                    private /* synthetic */ void m68307b(long j) {
                        this.b.accept(j);
                    }
                };
            }
        };
    }

    /* renamed from: g */
    public LongStream mo13634g() {
        if (m63944d()) {
            return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_ORDERED) {
                /* renamed from: b */
                final /* synthetic */ LongPipeline f59747b;

                /* renamed from: a */
                Sink<Long> mo14011a(int i, Sink<Long> sink) {
                    return sink;
                }
            };
        }
        return this;
    }

    public final LongStream filter(LongPredicate longPredicate) {
        Objects.m59115b(longPredicate);
        final LongPredicate longPredicate2 = longPredicate;
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59750c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Long> sink) {
                return new ChainedLong<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192538 f59748a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(long j) {
                        if (longPredicate2.test(j)) {
                            this.b.accept(j);
                        }
                    }
                };
            }
        };
    }

    public final LongStream peek(LongConsumer longConsumer) {
        Objects.m59115b(longConsumer);
        final LongConsumer longConsumer2 = longConsumer;
        return new StatelessOp<Long>(this, this, StreamShape.LONG_VALUE, 0) {
            /* renamed from: c */
            final /* synthetic */ LongPipeline f59753c;

            /* renamed from: a */
            Sink<Long> mo14011a(int i, Sink<Long> sink) {
                return new ChainedLong<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192559 f59751a;

                    public void accept(long j) {
                        longConsumer2.accept(j);
                        this.b.accept(j);
                    }
                };
            }
        };
    }

    public final LongStream limit(long j) {
        if (j >= 0) {
            return SliceOps.m59688c(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final LongStream skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        } else if (j == 0) {
            return this;
        } else {
            return SliceOps.m59688c(this, j, -1);
        }
    }

    public final LongStream takeWhile(LongPredicate longPredicate) {
        return WhileOps.m59717a((AbstractPipeline) this, longPredicate);
    }

    public final LongStream dropWhile(LongPredicate longPredicate) {
        return WhileOps.m59721b((AbstractPipeline) this, longPredicate);
    }

    public final LongStream sorted() {
        return SortedOps.m59693c(this);
    }

    public final LongStream distinct() {
        return boxed().distinct().mapToLong(LongPipeline$$Lambda$3.m64014a());
    }

    public void forEach(LongConsumer longConsumer) {
        m63923a((TerminalOp) ForEachOps.m59569a(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        m63923a((TerminalOp) ForEachOps.m59569a(longConsumer, true));
    }

    public final long sum() {
        return reduce(0, LongPipeline$$Lambda$4.m64015a());
    }

    public final OptionalLong min() {
        return reduce(LongPipeline$$Lambda$5.m64016a());
    }

    public final OptionalLong max() {
        return reduce(LongPipeline$$Lambda$6.m64017a());
    }

    public final OptionalDouble average() {
        long[] jArr = (long[]) collect(LongPipeline$$Lambda$7.m64018a(), LongPipeline$$Lambda$8.m64019a(), LongPipeline$$Lambda$9.m64020a());
        if (jArr[0] > 0) {
            return OptionalDouble.m59134a(((double) jArr[1]) / ((double) jArr[0]));
        }
        return OptionalDouble.m59133a();
    }

    /* renamed from: b */
    private static /* synthetic */ void m66742b(long[] jArr, long j) {
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    /* renamed from: b */
    private static /* synthetic */ void m66743b(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    public final long count() {
        return ((Long) m63923a(ReduceOps.m59671c())).longValue();
    }

    public final LongSummaryStatistics summaryStatistics() {
        return (LongSummaryStatistics) collect(LongPipeline$$Lambda$10.m64008a(), LongPipeline$$Lambda$11.m64009a(), LongPipeline$$Lambda$12.m64010a());
    }

    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return ((Long) m63923a((TerminalOp) ReduceOps.m59659a(j, longBinaryOperator))).longValue();
    }

    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return (OptionalLong) m63923a((TerminalOp) ReduceOps.m59664a(longBinaryOperator));
    }

    public final <R> R collect(Supplier<R> supplier, ObjLongConsumer<R> objLongConsumer, BiConsumer<R, R> biConsumer) {
        Objects.m59115b(biConsumer);
        return m63923a((TerminalOp) ReduceOps.m59668a((Supplier) supplier, (ObjLongConsumer) objLongConsumer, LongPipeline$$Lambda$13.m66733a(biConsumer)));
    }

    public final boolean anyMatch(LongPredicate longPredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59576a(longPredicate, MatchKind.ANY))).booleanValue();
    }

    public final boolean allMatch(LongPredicate longPredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59576a(longPredicate, MatchKind.ALL))).booleanValue();
    }

    public final boolean noneMatch(LongPredicate longPredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59576a(longPredicate, MatchKind.NONE))).booleanValue();
    }

    public final OptionalLong findFirst() {
        return (OptionalLong) m63923a(FindOps.m59564c(true));
    }

    public final OptionalLong findAny() {
        return (OptionalLong) m63923a(FindOps.m59564c(false));
    }

    public final long[] toArray() {
        return (long[]) Nodes.m59617a((Node.OfLong) m63931a(LongPipeline$$Lambda$14.m64011a())).asPrimitiveArray();
    }
}
