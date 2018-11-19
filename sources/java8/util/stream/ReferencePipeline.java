package java8.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java8.util.Objects;
import java8.util.Optional;
import java8.util.Spliterator;
import java8.util.Spliterators;
import java8.util.function.BiConsumer;
import java8.util.function.BiFunction;
import java8.util.function.BinaryOperator;
import java8.util.function.BinaryOperators;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.Function;
import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;
import java8.util.function.LongConsumer;
import java8.util.function.Predicate;
import java8.util.function.Supplier;
import java8.util.function.ToDoubleFunction;
import java8.util.function.ToIntFunction;
import java8.util.function.ToLongFunction;
import java8.util.stream.Collector.Characteristics;
import java8.util.stream.Node.Builder;
import java8.util.stream.Sink.ChainedReference;

abstract class ReferencePipeline<P_IN, P_OUT> extends AbstractPipeline<P_IN, P_OUT, Stream<P_OUT>> implements Stream<P_OUT> {

    static class Head<E_IN, E_OUT> extends ReferencePipeline<E_IN, E_OUT> {
        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        Head(Spliterator<?> spliterator, int i, boolean z) {
            super(spliterator, i, z);
        }

        /* renamed from: f */
        final boolean mo14012f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        final Sink<E_IN> mo14011a(int i, Sink<E_OUT> sink) {
            throw new UnsupportedOperationException();
        }

        public void forEach(Consumer<? super E_OUT> consumer) {
            if (isParallel()) {
                super.forEach(consumer);
            } else {
                m63924a().forEachRemaining(consumer);
            }
        }

        public void forEachOrdered(Consumer<? super E_OUT> consumer) {
            if (isParallel()) {
                super.forEachOrdered(consumer);
            } else {
                m63924a().forEachRemaining(consumer);
            }
        }
    }

    static abstract class StatefulOp<E_IN, E_OUT> extends ReferencePipeline<E_IN, E_OUT> {
        /* renamed from: a */
        abstract <P_IN> Node<E_OUT> mo14013a(PipelineHelper<E_OUT> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<E_OUT[]> intFunction);

        /* renamed from: f */
        final boolean mo14012f() {
            return true;
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        StatefulOp(AbstractPipeline<?, E_IN, ?> abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }

    static abstract class StatelessOp<E_IN, E_OUT> extends ReferencePipeline<E_IN, E_OUT> {
        /* renamed from: f */
        final boolean mo14012f() {
            return false;
        }

        public /* synthetic */ BaseStream unordered() {
            return super.mo13634g();
        }

        StatelessOp(AbstractPipeline<?, E_IN, ?> abstractPipeline, StreamShape streamShape, int i) {
            super(abstractPipeline, i);
        }
    }

    public /* synthetic */ BaseStream unordered() {
        return mo13634g();
    }

    ReferencePipeline(Spliterator<?> spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    ReferencePipeline(AbstractPipeline<?, P_IN, ?> abstractPipeline, int i) {
        super(abstractPipeline, i);
    }

    /* renamed from: e */
    final StreamShape mo13627e() {
        return StreamShape.REFERENCE;
    }

    /* renamed from: a */
    final <P_IN_> Node<P_OUT> mo13617a(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN_> spliterator, boolean z, IntFunction<P_OUT[]> intFunction) {
        return Nodes.m59623a((PipelineHelper) pipelineHelper, (Spliterator) spliterator, z, (IntFunction) intFunction);
    }

    /* renamed from: a */
    final <P_IN_> Spliterator<P_OUT> mo13616a(PipelineHelper<P_OUT> pipelineHelper, Supplier<Spliterator<P_IN_>> supplier, boolean z) {
        return new WrappingSpliterator((PipelineHelper) pipelineHelper, (Supplier) supplier, z);
    }

    /* renamed from: a */
    final Spliterator<P_OUT> mo13615a(Supplier<? extends Spliterator<P_OUT>> supplier) {
        return new DelegatingSpliterator(supplier);
    }

    /* renamed from: a */
    final boolean mo13618a(Spliterator<P_OUT> spliterator, Sink<P_OUT> sink) {
        boolean b;
        do {
            b = sink.mo13612b();
            if (b) {
                break;
            }
        } while (spliterator.tryAdvance(sink));
        return b;
    }

    /* renamed from: a */
    final Builder<P_OUT> mo12961a(long j, IntFunction<P_OUT[]> intFunction) {
        return Nodes.m59611a(j, (IntFunction) intFunction);
    }

    public final Iterator<P_OUT> iterator() {
        return Spliterators.m59178c(spliterator());
    }

    /* renamed from: g */
    public Stream<P_OUT> mo13634g() {
        if (m63944d()) {
            return new StatelessOp<P_OUT, P_OUT>(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_ORDERED) {
                /* renamed from: b */
                final /* synthetic */ ReferencePipeline f59809b;

                /* renamed from: a */
                Sink<P_OUT> mo14011a(int i, Sink<P_OUT> sink) {
                    return sink;
                }
            };
        }
        return this;
    }

    public final Stream<P_OUT> filter(Predicate<? super P_OUT> predicate) {
        Objects.m59115b(predicate);
        final Predicate<? super P_OUT> predicate2 = predicate;
        return new StatelessOp<P_OUT, P_OUT>(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59811c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<P_OUT> sink) {
                return new ChainedReference<P_OUT, P_OUT>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192592 f59261a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(-1);
                    }

                    public void accept(P_OUT p_out) {
                        if (predicate2.test(p_out)) {
                            this.d.accept(p_out);
                        }
                    }
                };
            }
        };
    }

    public final <R> Stream<R> map(Function<? super P_OUT, ? extends R> function) {
        Objects.m59115b(function);
        final Function<? super P_OUT, ? extends R> function2 = function;
        return new StatelessOp<P_OUT, R>(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59813c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<R> sink) {
                return new ChainedReference<P_OUT, R>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192603 f59262a;

                    public void accept(P_OUT p_out) {
                        this.d.accept(function2.apply(p_out));
                    }
                };
            }
        };
    }

    public final IntStream mapToInt(ToIntFunction<? super P_OUT> toIntFunction) {
        Objects.m59115b(toIntFunction);
        final ToIntFunction<? super P_OUT> toIntFunction2 = toIntFunction;
        return new StatelessOp<P_OUT>(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59815c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedReference<P_OUT, Integer>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192614 f59263a;

                    public void accept(P_OUT p_out) {
                        this.d.accept(toIntFunction2.applyAsInt(p_out));
                    }
                };
            }
        };
    }

    public final LongStream mapToLong(ToLongFunction<? super P_OUT> toLongFunction) {
        Objects.m59115b(toLongFunction);
        final ToLongFunction<? super P_OUT> toLongFunction2 = toLongFunction;
        return new StatelessOp<P_OUT>(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59817c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<Long> sink) {
                return new ChainedReference<P_OUT, Long>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192625 f59264a;

                    public void accept(P_OUT p_out) {
                        this.d.accept(toLongFunction2.applyAsLong(p_out));
                    }
                };
            }
        };
    }

    public final DoubleStream mapToDouble(ToDoubleFunction<? super P_OUT> toDoubleFunction) {
        Objects.m59115b(toDoubleFunction);
        final ToDoubleFunction<? super P_OUT> toDoubleFunction2 = toDoubleFunction;
        return new StatelessOp<P_OUT>(this, this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59819c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<Double> sink) {
                return new ChainedReference<P_OUT, Double>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192636 f59265a;

                    public void accept(P_OUT p_out) {
                        this.d.accept(toDoubleFunction2.applyAsDouble(p_out));
                    }
                };
            }
        };
    }

    public final <R> Stream<R> flatMap(Function<? super P_OUT, ? extends Stream<? extends R>> function) {
        Objects.m59115b(function);
        final Function<? super P_OUT, ? extends Stream<? extends R>> function2 = function;
        return new StatelessOp<P_OUT, R>(this, this, StreamShape.REFERENCE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59821c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<R> sink) {
                return new ChainedReference<P_OUT, R>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ C192647 f59266a;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(-1);
                    }

                    public void accept(P_OUT p_out) {
                        Stream stream = null;
                        try {
                            Stream stream2 = (Stream) function2.apply(p_out);
                            if (stream2 != null) {
                                try {
                                    ((Stream) stream2.sequential()).forEach(this.d);
                                } catch (P_OUT th) {
                                    P_OUT p_out2 = th;
                                    stream = stream2;
                                    p_out = p_out2;
                                    if (stream != null) {
                                        stream.close();
                                    }
                                    throw p_out;
                                }
                            }
                            if (stream2 != null) {
                                stream2.close();
                            }
                        } catch (Throwable th2) {
                            p_out = th2;
                            if (stream != null) {
                                stream.close();
                            }
                            throw p_out;
                        }
                    }
                };
            }
        };
    }

    public final IntStream flatMapToInt(Function<? super P_OUT, ? extends IntStream> function) {
        Objects.m59115b(function);
        final Function<? super P_OUT, ? extends IntStream> function2 = function;
        return new StatelessOp<P_OUT>(this, this, StreamShape.REFERENCE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59823c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<Integer> sink) {
                return new ChainedReference<P_OUT, Integer>(this, sink) {
                    /* renamed from: a */
                    IntConsumer f59267a;
                    /* renamed from: b */
                    final /* synthetic */ C192658 f59268b;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(-1);
                    }

                    public void accept(P_OUT p_out) {
                        IntStream intStream = null;
                        try {
                            IntStream intStream2 = (IntStream) function2.apply(p_out);
                            if (intStream2 != null) {
                                try {
                                    intStream2.sequential().forEach(this.f59267a);
                                } catch (P_OUT th) {
                                    P_OUT p_out2 = th;
                                    intStream = intStream2;
                                    p_out = p_out2;
                                    if (intStream != null) {
                                        intStream.close();
                                    }
                                    throw p_out;
                                }
                            }
                            if (intStream2 != null) {
                                intStream2.close();
                            }
                        } catch (Throwable th2) {
                            p_out = th2;
                            if (intStream != null) {
                                intStream.close();
                            }
                            throw p_out;
                        }
                    }
                };
            }
        };
    }

    public final DoubleStream flatMapToDouble(Function<? super P_OUT, ? extends DoubleStream> function) {
        Objects.m59115b(function);
        final Function<? super P_OUT, ? extends DoubleStream> function2 = function;
        return new StatelessOp<P_OUT>(this, this, StreamShape.REFERENCE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59825c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<Double> sink) {
                return new ChainedReference<P_OUT, Double>(this, sink) {
                    /* renamed from: a */
                    DoubleConsumer f59269a;
                    /* renamed from: b */
                    final /* synthetic */ C192669 f59270b;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(-1);
                    }

                    public void accept(P_OUT p_out) {
                        DoubleStream doubleStream = null;
                        try {
                            DoubleStream doubleStream2 = (DoubleStream) function2.apply(p_out);
                            if (doubleStream2 != null) {
                                try {
                                    doubleStream2.sequential().forEach(this.f59269a);
                                } catch (P_OUT th) {
                                    P_OUT p_out2 = th;
                                    doubleStream = doubleStream2;
                                    p_out = p_out2;
                                    if (doubleStream != null) {
                                        doubleStream.close();
                                    }
                                    throw p_out;
                                }
                            }
                            if (doubleStream2 != null) {
                                doubleStream2.close();
                            }
                        } catch (Throwable th2) {
                            p_out = th2;
                            if (doubleStream != null) {
                                doubleStream.close();
                            }
                            throw p_out;
                        }
                    }
                };
            }
        };
    }

    public final LongStream flatMapToLong(Function<? super P_OUT, ? extends LongStream> function) {
        Objects.m59115b(function);
        final Function<? super P_OUT, ? extends LongStream> function2 = function;
        return new StatelessOp<P_OUT>(this, this, StreamShape.REFERENCE, (StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT) | StreamOpFlag.NOT_SIZED) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59806c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<Long> sink) {
                return new ChainedReference<P_OUT, Long>(this, sink) {
                    /* renamed from: a */
                    LongConsumer f59258a;
                    /* renamed from: b */
                    final /* synthetic */ AnonymousClass10 f59259b;

                    /* renamed from: a */
                    public void mo13608a(long j) {
                        this.d.mo13608a(-1);
                    }

                    public void accept(P_OUT p_out) {
                        LongStream longStream = null;
                        try {
                            LongStream longStream2 = (LongStream) function2.apply(p_out);
                            if (longStream2 != null) {
                                try {
                                    longStream2.sequential().forEach(this.f59258a);
                                } catch (P_OUT th) {
                                    P_OUT p_out2 = th;
                                    longStream = longStream2;
                                    p_out = p_out2;
                                    if (longStream != null) {
                                        longStream.close();
                                    }
                                    throw p_out;
                                }
                            }
                            if (longStream2 != null) {
                                longStream2.close();
                            }
                        } catch (Throwable th2) {
                            p_out = th2;
                            if (longStream != null) {
                                longStream.close();
                            }
                            throw p_out;
                        }
                    }
                };
            }
        };
    }

    public final Stream<P_OUT> peek(Consumer<? super P_OUT> consumer) {
        Objects.m59115b(consumer);
        final Consumer<? super P_OUT> consumer2 = consumer;
        return new StatelessOp<P_OUT, P_OUT>(this, this, StreamShape.REFERENCE, 0) {
            /* renamed from: c */
            final /* synthetic */ ReferencePipeline f59808c;

            /* renamed from: a */
            Sink<P_OUT> mo14011a(int i, Sink<P_OUT> sink) {
                return new ChainedReference<P_OUT, P_OUT>(this, sink) {
                    /* renamed from: a */
                    final /* synthetic */ AnonymousClass11 f59260a;

                    public void accept(P_OUT p_out) {
                        consumer2.accept(p_out);
                        this.d.accept(p_out);
                    }
                };
            }
        };
    }

    public final Stream<P_OUT> distinct() {
        return DistinctOps.m59561a(this);
    }

    public final Stream<P_OUT> sorted() {
        return SortedOps.m59690a(this);
    }

    public final Stream<P_OUT> sorted(Comparator<? super P_OUT> comparator) {
        return SortedOps.m59691a(this, comparator);
    }

    public final Stream<P_OUT> limit(long j) {
        if (j >= 0) {
            return SliceOps.m59683a((AbstractPipeline) this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final Stream<P_OUT> skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        } else if (j == 0) {
            return this;
        } else {
            return SliceOps.m59683a((AbstractPipeline) this, j, -1);
        }
    }

    public final Stream<P_OUT> takeWhile(Predicate<? super P_OUT> predicate) {
        return WhileOps.m59718a((AbstractPipeline) this, (Predicate) predicate);
    }

    public final Stream<P_OUT> dropWhile(Predicate<? super P_OUT> predicate) {
        return WhileOps.m59722b((AbstractPipeline) this, (Predicate) predicate);
    }

    public void forEach(Consumer<? super P_OUT> consumer) {
        m63923a((TerminalOp) ForEachOps.m59566a((Consumer) consumer, false));
    }

    public void forEachOrdered(Consumer<? super P_OUT> consumer) {
        m63923a((TerminalOp) ForEachOps.m59566a((Consumer) consumer, true));
    }

    public final <A> A[] toArray(IntFunction<A[]> intFunction) {
        return Nodes.m59622a(m63931a((IntFunction) intFunction), (IntFunction) intFunction).asArray(intFunction);
    }

    public final Object[] toArray() {
        return toArray(ReferencePipeline$$Lambda$1.m64058a());
    }

    public final boolean anyMatch(Predicate<? super P_OUT> predicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59577a((Predicate) predicate, MatchKind.ANY))).booleanValue();
    }

    public final boolean allMatch(Predicate<? super P_OUT> predicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59577a((Predicate) predicate, MatchKind.ALL))).booleanValue();
    }

    public final boolean noneMatch(Predicate<? super P_OUT> predicate) {
        return ((Boolean) m63923a((TerminalOp) MatchOps.m59577a((Predicate) predicate, MatchKind.NONE))).booleanValue();
    }

    public final Optional<P_OUT> findFirst() {
        return (Optional) m63923a(FindOps.m59562a(true));
    }

    public final Optional<P_OUT> findAny() {
        return (Optional) m63923a(FindOps.m59562a(false));
    }

    public final P_OUT reduce(P_OUT p_out, BinaryOperator<P_OUT> binaryOperator) {
        return m63923a((TerminalOp) ReduceOps.m59660a((Object) p_out, (BiFunction) binaryOperator, (BinaryOperator) binaryOperator));
    }

    public final Optional<P_OUT> reduce(BinaryOperator<P_OUT> binaryOperator) {
        return (Optional) m63923a((TerminalOp) ReduceOps.m59661a((BinaryOperator) binaryOperator));
    }

    public final <R> R reduce(R r, BiFunction<R, ? super P_OUT, R> biFunction, BinaryOperator<R> binaryOperator) {
        return m63923a((TerminalOp) ReduceOps.m59660a((Object) r, (BiFunction) biFunction, (BinaryOperator) binaryOperator));
    }

    public final <R, A> R collect(Collector<? super P_OUT, A, R> collector) {
        R r;
        if (isParallel() && collector.characteristics().contains(Characteristics.CONCURRENT) && (!m63944d() || collector.characteristics().contains(Characteristics.UNORDERED))) {
            r = collector.supplier().get();
            forEach(ReferencePipeline$$Lambda$2.m64059a(collector.accumulator(), r));
        } else {
            r = m63923a(ReduceOps.m59669a((Collector) collector));
        }
        return collector.characteristics().contains(Characteristics.IDENTITY_FINISH) ? r : collector.finisher().apply(r);
    }

    public final <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super P_OUT> biConsumer, BiConsumer<R, R> biConsumer2) {
        return m63923a((TerminalOp) ReduceOps.m59665a((Supplier) supplier, (BiConsumer) biConsumer, (BiConsumer) biConsumer2));
    }

    public final Optional<P_OUT> max(Comparator<? super P_OUT> comparator) {
        return reduce(BinaryOperators.m59345b(comparator));
    }

    public final Optional<P_OUT> min(Comparator<? super P_OUT> comparator) {
        return reduce(BinaryOperators.m59343a(comparator));
    }

    public final long count() {
        return ((Long) m63923a(ReduceOps.m59656a())).longValue();
    }
}
