package java8.util.stream;

import java.util.Iterator;
import java8.util.IntSummaryStatistics;
import java8.util.Objects;
import java8.util.OptionalDouble;
import java8.util.OptionalInt;
import java8.util.PrimitiveIterator;
import java8.util.Spliterator;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterators;
import java8.util.function.BiConsumer;
import java8.util.function.IntBinaryOperator;
import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;
import java8.util.function.IntPredicate;
import java8.util.function.IntToDoubleFunction;
import java8.util.function.IntToLongFunction;
import java8.util.function.IntUnaryOperator;
import java8.util.function.ObjIntConsumer;
import java8.util.function.Supplier;
import java8.util.stream.Node.Builder;
import java8.util.stream.Sink.ChainedInt;

abstract class IntPipeline<E_IN> extends AbstractPipeline<E_IN, Integer, IntStream> implements IntStream {

    static class Head<E_IN> extends IntPipeline<E_IN> {
        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66730b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ IntStream parallel() {
            return (IntStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ IntStream sequential() {
            return (IntStream) super.sequential();
        }

        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        Head(Spliterator<Integer> spliterator, int i, boolean z) {
            super(spliterator, i, z);
        }

        /* renamed from: f */
        final boolean mo14012f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        final Sink<E_IN> mo14011a(int i, Sink<Integer> sink) {
            throw new UnsupportedOperationException();
        }

        public void forEach(IntConsumer intConsumer) {
            if (isParallel()) {
                super.forEach(intConsumer);
            } else {
                IntPipeline.m66722e(m63924a()).forEachRemaining(intConsumer);
            }
        }

        public void forEachOrdered(IntConsumer intConsumer) {
            if (isParallel()) {
                super.forEachOrdered(intConsumer);
            } else {
                IntPipeline.m66722e(m63924a()).forEachRemaining(intConsumer);
            }
        }
    }

    static abstract class StatefulOp<E_IN> extends IntPipeline<E_IN> {
        /* renamed from: a */
        abstract <P_IN> Node<Integer> mo14013a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Integer[]> intFunction);

        /* renamed from: f */
        final boolean mo14012f() {
            return true;
        }

        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66730b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ IntStream parallel() {
            return (IntStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ IntStream sequential() {
            return (IntStream) super.sequential();
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

    static abstract class StatelessOp<E_IN> extends IntPipeline<E_IN> {
        /* renamed from: f */
        final boolean mo14012f() {
            return false;
        }

        /* renamed from: a */
        /* synthetic */ Spliterator mo13615a(Supplier supplier) {
            return super.m66730b(supplier);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ IntStream parallel() {
            return (IntStream) super.parallel();
        }

        public /* bridge */ /* synthetic */ IntStream sequential() {
            return (IntStream) super.sequential();
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
        return m66730b(supplier);
    }

    public /* bridge */ /* synthetic */ IntStream parallel() {
        return (IntStream) super.parallel();
    }

    public /* bridge */ /* synthetic */ IntStream sequential() {
        return (IntStream) super.sequential();
    }

    public /* synthetic */ BaseStream unordered() {
        return mo13634g();
    }

    IntPipeline(Spliterator<Integer> spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    IntPipeline(AbstractPipeline<?, E_IN, ?> abstractPipeline, int i) {
        super(abstractPipeline, i);
    }

    /* renamed from: b */
    private static IntConsumer m66716b(Sink<Integer> sink) {
        if (sink instanceof IntConsumer) {
            return (IntConsumer) sink;
        }
        sink.getClass();
        return IntPipeline$$Lambda$1.m63998a(sink);
    }

    /* renamed from: e */
    private static OfInt m66722e(Spliterator<Integer> spliterator) {
        if (spliterator instanceof OfInt) {
            return (OfInt) spliterator;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* renamed from: e */
    final StreamShape mo13627e() {
        return StreamShape.INT_VALUE;
    }

    /* renamed from: a */
    final <P_IN> Node<Integer> mo13617a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, boolean z, IntFunction<Integer[]> intFunction) {
        return Nodes.m59615a((PipelineHelper) pipelineHelper, (Spliterator) spliterator, z);
    }

    /* renamed from: a */
    final <P_IN> Spliterator<Integer> mo13616a(PipelineHelper<Integer> pipelineHelper, Supplier<Spliterator<P_IN>> supplier, boolean z) {
        return new IntWrappingSpliterator((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
    }

    /* renamed from: b */
    final OfInt m66730b(Supplier<? extends Spliterator<Integer>> supplier) {
        return new OfInt(supplier);
    }

    /* renamed from: a */
    final boolean mo13618a(Spliterator<Integer> spliterator, Sink<Integer> sink) {
        boolean b;
        spliterator = m66722e(spliterator);
        IntConsumer b2 = m66716b((Sink) sink);
        do {
            b = sink.mo13612b();
            if (b) {
                break;
            }
        } while (spliterator.tryAdvance(b2));
        return b;
    }

    /* renamed from: a */
    final Builder<Integer> mo12961a(long j, IntFunction<Integer[]> intFunction) {
        return Nodes.m59610a(j);
    }

    /* renamed from: a */
    private <U> Stream<U> m66711a(IntFunction<? extends U> intFunction, int i) {
        final IntFunction<? extends U> intFunction2 = intFunction;
        return new StatelessOp<Integer, U>(this, this, StreamShape.INT_VALUE, i) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59699c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<U> sink) {
                return new ChainedInt<U>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192211 f59694a;

                    public void accept(int i) {
                        this.b.accept(intFunction2.apply(i));
                    }
                };
            }
        };
    }

    public final PrimitiveIterator.OfInt iterator() {
        return Spliterators.m59154a(spliterator());
    }

    public final OfInt spliterator() {
        return m66722e(super.spliterator());
    }

    public final LongStream asLongStream() {
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, 0) {
            /* renamed from: b */
            final /* synthetic */ IntPipeline f59701b;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Long> sink) {
                return new ChainedInt<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192232 f59700a;

                    public void accept(int i) {
                        this.b.accept((long) i);
                    }
                };
            }
        };
    }

    public final DoubleStream asDoubleStream() {
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, 0) {
            /* renamed from: b */
            final /* synthetic */ IntPipeline f59703b;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Double> sink) {
                return new ChainedInt<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192253 f59702a;

                    public void accept(int i) {
                        this.b.accept((double) i);
                    }
                };
            }
        };
    }

    public final Stream<Integer> boxed() {
        return m66711a(IntPipeline$$Lambda$2.m63999a(), 0);
    }

    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.m59115b(intUnaryOperator);
        final IntUnaryOperator intUnaryOperator2 = intUnaryOperator;
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59706c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedInt<Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192274 f59704a;

                    public void accept(int i) {
                        this.b.accept(intUnaryOperator2.applyAsInt(i));
                    }
                };
            }
        };
    }

    public final <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction) {
        Objects.m59115b(intFunction);
        return m66711a((IntFunction) intFunction, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT);
    }

    public final LongStream mapToLong(IntToLongFunction intToLongFunction) {
        Objects.m59115b(intToLongFunction);
        final IntToLongFunction intToLongFunction2 = intToLongFunction;
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59709c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Long> sink) {
                return new ChainedInt<Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192295 f59707a;

                    public void accept(int i) {
                        this.b.accept(intToLongFunction2.applyAsLong(i));
                    }
                };
            }
        };
    }

    public final DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        Objects.m59115b(intToDoubleFunction);
        final IntToDoubleFunction intToDoubleFunction2 = intToDoubleFunction;
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59712c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Double> sink) {
                return new ChainedInt<Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192316 f59710a;

                    public void accept(int i) {
                        this.b.accept(intToDoubleFunction2.applyAsDouble(i));
                    }
                };
            }
        };
    }

    public final IntStream flatMap(IntFunction<? extends IntStream> intFunction) {
        Objects.m59115b(intFunction);
        final IntFunction<? extends IntStream> intFunction2 = intFunction;
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59715c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedInt<Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192337 f59713a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(int i) {
                        IntStream intStream = null;
                        try {
                            IntStream intStream2 = (IntStream) intFunction2.apply(i);
                            if (intStream2 != null) {
                                try {
                                    intStream2.sequential().forEach(IntPipeline$7$1$$Lambda$1.m64007a(this));
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    intStream = intStream2;
                                    i = th2;
                                    if (intStream != null) {
                                        intStream.close();
                                    }
                                    throw i;
                                }
                            }
                            if (intStream2 != null) {
                                intStream2.close();
                            }
                        } catch (Throwable th3) {
                            i = th3;
                            if (intStream != null) {
                                intStream.close();
                            }
                            throw i;
                        }
                    }

                    /* renamed from: a */
                    private /* synthetic */ void m68294a(int i) {
                        this.b.accept(i);
                    }
                };
            }
        };
    }

    /* renamed from: g */
    public IntStream mo13634g() {
        if (m63944d()) {
            return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, StreamOpFlag.NOT_ORDERED) {
                /* renamed from: b */
                final /* synthetic */ IntPipeline f59716b;

                /* renamed from: a */
                Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                    return sink;
                }
            };
        }
        return this;
    }

    public final IntStream filter(IntPredicate intPredicate) {
        Objects.m59115b(intPredicate);
        final IntPredicate intPredicate2 = intPredicate;
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59719c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedInt<Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192369 f59717a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.b.mo13608a(-1);
                    }

                    public void accept(int i) {
                        if (intPredicate2.test(i)) {
                            this.b.accept(i);
                        }
                    }
                };
            }
        };
    }

    public final IntStream peek(IntConsumer intConsumer) {
        Objects.m59115b(intConsumer);
        final IntConsumer intConsumer2 = intConsumer;
        return new StatelessOp<Integer>(this, this, StreamShape.INT_VALUE, 0) {
            /* renamed from: c */
            final /* synthetic */ IntPipeline f59697c;

            /* renamed from: a */
            Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedInt<Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ AnonymousClass10 f59695a;

                    public void accept(int i) {
                        intConsumer2.accept(i);
                        this.b.accept(i);
                    }
                };
            }
        };
    }

    public final IntStream limit(long j) {
        if (j >= 0) {
            return SliceOps.m59687b((AbstractPipeline) this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final IntStream skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        } else if (j == 0) {
            return this;
        } else {
            return SliceOps.m59687b((AbstractPipeline) this, j, -1);
        }
    }

    public final IntStream takeWhile(IntPredicate intPredicate) {
        return WhileOps.m59716a((AbstractPipeline) this, intPredicate);
    }

    public final IntStream dropWhile(IntPredicate intPredicate) {
        return WhileOps.m59720b((AbstractPipeline) this, intPredicate);
    }

    public final IntStream sorted() {
        return SortedOps.m59692b(this);
    }

    public final IntStream distinct() {
        return boxed().distinct().mapToInt(IntPipeline$$Lambda$3.m64000a());
    }

    public void forEach(IntConsumer intConsumer) {
        m63923a((TerminalOp) ForEachOps.m59568a(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        m63923a((TerminalOp) ForEachOps.m59568a(intConsumer, true));
    }

    public final int sum() {
        return reduce(0, IntPipeline$$Lambda$4.m64001a());
    }

    public final OptionalInt min() {
        return reduce(IntPipeline$$Lambda$5.m64002a());
    }

    public final OptionalInt max() {
        return reduce(IntPipeline$$Lambda$6.m64003a());
    }

    public final long count() {
        return ((Long) m63923a(ReduceOps.m59670b())).longValue();
    }

    public final OptionalDouble average() {
        long[] jArr = (long[]) collect(IntPipeline$$Lambda$7.m64004a(), IntPipeline$$Lambda$8.m64005a(), IntPipeline$$Lambda$9.m64006a());
        if (jArr[0] > 0) {
            return OptionalDouble.m59134a(((double) jArr[1]) / ((double) jArr[0]));
        }
        return OptionalDouble.m59133a();
    }

    /* renamed from: b */
    private static /* synthetic */ void m66717b(long[] jArr, int i) {
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + ((long) i);
    }

    /* renamed from: b */
    private static /* synthetic */ void m66718b(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    public final IntSummaryStatistics summaryStatistics() {
        return (IntSummaryStatistics) collect(IntPipeline$$Lambda$10.m63994a(), IntPipeline$$Lambda$11.m63995a(), IntPipeline$$Lambda$12.m63996a());
    }

    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return ((Integer) m63923a((TerminalOp) ReduceOps.m59658a(i, intBinaryOperator))).intValue();
    }

    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return (OptionalInt) m63923a((TerminalOp) ReduceOps.m59663a(intBinaryOperator));
    }

    public final <R> R collect(Supplier<R> supplier, ObjIntConsumer<R> objIntConsumer, BiConsumer<R, R> biConsumer) {
        Objects.m59115b(biConsumer);
        return m63923a((TerminalOp) ReduceOps.m59667a((Supplier) supplier, (ObjIntConsumer) objIntConsumer, IntPipeline$$Lambda$13.m66708a(biConsumer)));
    }

    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59575a(intPredicate, MatchKind.ANY))).booleanValue();
    }

    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59575a(intPredicate, MatchKind.ALL))).booleanValue();
    }

    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59575a(intPredicate, MatchKind.NONE))).booleanValue();
    }

    public final OptionalInt findFirst() {
        return (OptionalInt) m63923a(FindOps.m59563b(true));
    }

    public final OptionalInt findAny() {
        return (OptionalInt) m63923a(FindOps.m59563b(false));
    }

    public final int[] toArray() {
        return (int[]) Nodes.m59614a((Node.OfInt) m63931a(IntPipeline$$Lambda$14.m63997a())).asPrimitiveArray();
    }
}
