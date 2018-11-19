package java8.util.stream;

import java8.util.Objects;
import java8.util.Optional;
import java8.util.OptionalDouble;
import java8.util.OptionalInt;
import java8.util.OptionalLong;
import java8.util.Spliterator;
import java8.util.concurrent.CountedCompleter;
import java8.util.function.BiConsumer;
import java8.util.function.BiFunction;
import java8.util.function.BinaryOperator;
import java8.util.function.DoubleBinaryOperator;
import java8.util.function.IntBinaryOperator;
import java8.util.function.LongBinaryOperator;
import java8.util.function.ObjDoubleConsumer;
import java8.util.function.ObjIntConsumer;
import java8.util.function.ObjLongConsumer;
import java8.util.function.Supplier;
import java8.util.stream.Collector.Characteristics;
import java8.util.stream.Sink.OfDouble;
import java8.util.stream.Sink.OfInt;
import java8.util.stream.Sink.OfLong;

final class ReduceOps {

    private static abstract class Box<U> {
        /* renamed from: d */
        U f48904d;

        Box() {
        }

        public U get() {
            return this.f48904d;
        }
    }

    private static abstract class ReduceOp<T, R, S extends AccumulatingSink<T, R, S>> implements TerminalOp<T, R> {
        /* renamed from: a */
        private final StreamShape f54626a;

        /* renamed from: c */
        public abstract S mo13727c();

        ReduceOp(StreamShape streamShape) {
            this.f54626a = streamShape;
        }

        public int x_() {
            return TerminalOpDefaults.m59713a();
        }

        /* renamed from: a */
        public <P_IN> R mo12988a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
            return ((AccumulatingSink) pipelineHelper.mo12965a(mo13727c(), (Spliterator) spliterator)).get();
        }

        /* renamed from: b */
        public <P_IN> R mo12989b(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
            return ((AccumulatingSink) new ReduceTask(this, pipelineHelper, spliterator).m59285k()).get();
        }
    }

    private interface AccumulatingSink<T, R, K extends AccumulatingSink<T, R, K>> extends TerminalSink<T, R> {
        /* renamed from: a */
        void mo14152a(K k);
    }

    private static final class ReduceTask<P_IN, P_OUT, R, S extends AccumulatingSink<P_OUT, R, S>> extends AbstractTask<P_IN, P_OUT, S, ReduceTask<P_IN, P_OUT, R, S>> {
        /* renamed from: a */
        private final ReduceOp<P_OUT, R, S> f59257a;

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m67837b(spliterator);
        }

        /* renamed from: t */
        protected /* synthetic */ Object mo14019t() {
            return mo13726o();
        }

        ReduceTask(ReduceOp<P_OUT, R, S> reduceOp, PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59257a = reduceOp;
        }

        ReduceTask(ReduceTask<P_IN, P_OUT, R, S> reduceTask, Spliterator<P_IN> spliterator) {
            super((AbstractTask) reduceTask, (Spliterator) spliterator);
            this.f59257a = reduceTask.f59257a;
        }

        /* renamed from: b */
        protected ReduceTask<P_IN, P_OUT, R, S> m67837b(Spliterator<P_IN> spliterator) {
            return new ReduceTask(this, spliterator);
        }

        /* renamed from: o */
        protected S mo13726o() {
            return (AccumulatingSink) this.d.mo12965a(this.f59257a.mo13727c(), this.e);
        }

        /* renamed from: a */
        public void mo13597a(CountedCompleter<?> countedCompleter) {
            if (!m66664u()) {
                AccumulatingSink accumulatingSink = (AccumulatingSink) ((ReduceTask) this.g).mo13614p();
                accumulatingSink.mo14152a((AccumulatingSink) ((ReduceTask) this.h).mo13614p());
                mo14009b((Object) accumulatingSink);
            }
            super.mo13597a((CountedCompleter) countedCompleter);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$10ReducingSink */
    class AnonymousClass10ReducingSink extends Box<R> implements AccumulatingSink<Long, R, AnonymousClass10ReducingSink>, OfLong {
        /* renamed from: a */
        final /* synthetic */ Supplier f59765a;
        /* renamed from: b */
        final /* synthetic */ ObjLongConsumer f59766b;
        /* renamed from: c */
        final /* synthetic */ BinaryOperator f59767c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass10ReducingSink(Supplier supplier, ObjLongConsumer objLongConsumer, BinaryOperator binaryOperator) {
            this.f59765a = supplier;
            this.f59766b = objLongConsumer;
            this.f59767c = binaryOperator;
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.d = this.f59765a.get();
        }

        public void accept(long j) {
            this.f59766b.accept(this.d, j);
        }

        public void accept(Long l) {
            OfLong.m59675a(this, l);
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        /* renamed from: a */
        public void m68370a(AnonymousClass10ReducingSink anonymousClass10ReducingSink) {
            this.d = this.f59767c.apply(this.d, anonymousClass10ReducingSink.d);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$11ReducingSink */
    class AnonymousClass11ReducingSink implements AccumulatingSink<Double, Double, AnonymousClass11ReducingSink>, OfDouble {
        /* renamed from: a */
        final /* synthetic */ double f59768a;
        /* renamed from: b */
        final /* synthetic */ DoubleBinaryOperator f59769b;
        /* renamed from: c */
        private double f59770c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass11ReducingSink(double d, DoubleBinaryOperator doubleBinaryOperator) {
            this.f59768a = d;
            this.f59769b = doubleBinaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68377c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59770c = this.f59768a;
        }

        public void accept(double d) {
            this.f59770c = this.f59769b.applyAsDouble(this.f59770c, d);
        }

        public void accept(Double d) {
            OfDouble.m59673a(this, d);
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        /* renamed from: c */
        public Double m68377c() {
            return Double.valueOf(this.f59770c);
        }

        /* renamed from: a */
        public void m68374a(AnonymousClass11ReducingSink anonymousClass11ReducingSink) {
            accept(anonymousClass11ReducingSink.f59770c);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$12ReducingSink */
    class AnonymousClass12ReducingSink implements AccumulatingSink<Double, OptionalDouble, AnonymousClass12ReducingSink>, OfDouble {
        /* renamed from: a */
        final /* synthetic */ DoubleBinaryOperator f59771a;
        /* renamed from: b */
        private boolean f59772b;
        /* renamed from: c */
        private double f59773c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass12ReducingSink(DoubleBinaryOperator doubleBinaryOperator) {
            this.f59771a = doubleBinaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68382c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59772b = 1;
            this.f59773c = 0;
        }

        public void accept(double d) {
            if (this.f59772b) {
                this.f59772b = false;
                this.f59773c = d;
                return;
            }
            this.f59773c = this.f59771a.applyAsDouble(this.f59773c, d);
        }

        public void accept(Double d) {
            OfDouble.m59673a(this, d);
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        /* renamed from: c */
        public OptionalDouble m68382c() {
            return this.f59772b ? OptionalDouble.m59133a() : OptionalDouble.m59134a(this.f59773c);
        }

        /* renamed from: a */
        public void m68379a(AnonymousClass12ReducingSink anonymousClass12ReducingSink) {
            if (!anonymousClass12ReducingSink.f59772b) {
                accept(anonymousClass12ReducingSink.f59773c);
            }
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$13ReducingSink */
    class AnonymousClass13ReducingSink extends Box<R> implements AccumulatingSink<Double, R, AnonymousClass13ReducingSink>, OfDouble {
        /* renamed from: a */
        final /* synthetic */ Supplier f59774a;
        /* renamed from: b */
        final /* synthetic */ ObjDoubleConsumer f59775b;
        /* renamed from: c */
        final /* synthetic */ BinaryOperator f59776c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass13ReducingSink(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
            this.f59774a = supplier;
            this.f59775b = objDoubleConsumer;
            this.f59776c = binaryOperator;
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.d = this.f59774a.get();
        }

        public void accept(double d) {
            this.f59775b.accept(this.d, d);
        }

        public void accept(Double d) {
            OfDouble.m59673a(this, d);
        }

        /* renamed from: a */
        public void m68384a(AnonymousClass13ReducingSink anonymousClass13ReducingSink) {
            this.d = this.f59776c.apply(this.d, anonymousClass13ReducingSink.d);
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$1ReducingSink */
    class AnonymousClass1ReducingSink extends Box<U> implements AccumulatingSink<T, U, AnonymousClass1ReducingSink> {
        /* renamed from: a */
        final /* synthetic */ Object f59777a;
        /* renamed from: b */
        final /* synthetic */ BiFunction f59778b;
        /* renamed from: c */
        final /* synthetic */ BinaryOperator f59779c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass1ReducingSink(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            this.f59777a = obj;
            this.f59778b = biFunction;
            this.f59779c = binaryOperator;
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.d = this.f59777a;
        }

        public void accept(T t) {
            this.d = this.f59778b.apply(this.d, t);
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

        /* renamed from: a */
        public void m68388a(AnonymousClass1ReducingSink anonymousClass1ReducingSink) {
            this.d = this.f59779c.apply(this.d, anonymousClass1ReducingSink.d);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$2ReducingSink */
    class AnonymousClass2ReducingSink implements AccumulatingSink<T, Optional<T>, AnonymousClass2ReducingSink> {
        /* renamed from: a */
        final /* synthetic */ BinaryOperator f59780a;
        /* renamed from: b */
        private boolean f59781b;
        /* renamed from: c */
        private T f59782c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass2ReducingSink(BinaryOperator binaryOperator) {
            this.f59780a = binaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68395c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59781b = 1;
            this.f59782c = 0;
        }

        public void accept(T t) {
            if (this.f59781b) {
                this.f59781b = false;
                this.f59782c = t;
                return;
            }
            this.f59782c = this.f59780a.apply(this.f59782c, t);
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

        /* renamed from: c */
        public Optional<T> m68395c() {
            return this.f59781b ? Optional.m59119a() : Optional.m59120a(this.f59782c);
        }

        /* renamed from: a */
        public void m68392a(AnonymousClass2ReducingSink anonymousClass2ReducingSink) {
            if (!anonymousClass2ReducingSink.f59781b) {
                accept(anonymousClass2ReducingSink.f59782c);
            }
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$3ReducingSink */
    class AnonymousClass3ReducingSink extends Box<I> implements AccumulatingSink<T, I, AnonymousClass3ReducingSink> {
        /* renamed from: a */
        final /* synthetic */ Supplier f59783a;
        /* renamed from: b */
        final /* synthetic */ BiConsumer f59784b;
        /* renamed from: c */
        final /* synthetic */ BinaryOperator f59785c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass3ReducingSink(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
            this.f59783a = supplier;
            this.f59784b = biConsumer;
            this.f59785c = binaryOperator;
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.d = this.f59783a.get();
        }

        public void accept(T t) {
            this.f59784b.accept(this.d, t);
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

        /* renamed from: a */
        public void m68397a(AnonymousClass3ReducingSink anonymousClass3ReducingSink) {
            this.d = this.f59785c.apply(this.d, anonymousClass3ReducingSink.d);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$4ReducingSink */
    class AnonymousClass4ReducingSink extends Box<R> implements AccumulatingSink<T, R, AnonymousClass4ReducingSink> {
        /* renamed from: a */
        final /* synthetic */ Supplier f59786a;
        /* renamed from: b */
        final /* synthetic */ BiConsumer f59787b;
        /* renamed from: c */
        final /* synthetic */ BiConsumer f59788c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass4ReducingSink(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            this.f59786a = supplier;
            this.f59787b = biConsumer;
            this.f59788c = biConsumer2;
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.d = this.f59786a.get();
        }

        public void accept(T t) {
            this.f59787b.accept(this.d, t);
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

        /* renamed from: a */
        public void m68401a(AnonymousClass4ReducingSink anonymousClass4ReducingSink) {
            this.f59788c.accept(this.d, anonymousClass4ReducingSink.d);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$5ReducingSink */
    class AnonymousClass5ReducingSink implements AccumulatingSink<Integer, Integer, AnonymousClass5ReducingSink>, OfInt {
        /* renamed from: a */
        final /* synthetic */ int f59789a;
        /* renamed from: b */
        final /* synthetic */ IntBinaryOperator f59790b;
        /* renamed from: c */
        private int f59791c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass5ReducingSink(int i, IntBinaryOperator intBinaryOperator) {
            this.f59789a = i;
            this.f59790b = intBinaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68408c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59791c = this.f59789a;
        }

        public void accept(int i) {
            this.f59791c = this.f59790b.applyAsInt(this.f59791c, i);
        }

        public void accept(Integer num) {
            OfInt.m59674a(this, num);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        /* renamed from: c */
        public Integer m68408c() {
            return Integer.valueOf(this.f59791c);
        }

        /* renamed from: a */
        public void m68405a(AnonymousClass5ReducingSink anonymousClass5ReducingSink) {
            accept(anonymousClass5ReducingSink.f59791c);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$6ReducingSink */
    class AnonymousClass6ReducingSink implements AccumulatingSink<Integer, OptionalInt, AnonymousClass6ReducingSink>, OfInt {
        /* renamed from: a */
        final /* synthetic */ IntBinaryOperator f59792a;
        /* renamed from: b */
        private boolean f59793b;
        /* renamed from: c */
        private int f59794c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass6ReducingSink(IntBinaryOperator intBinaryOperator) {
            this.f59792a = intBinaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68413c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59793b = 1;
            this.f59794c = 0;
        }

        public void accept(int i) {
            if (this.f59793b) {
                this.f59793b = false;
                this.f59794c = i;
                return;
            }
            this.f59794c = this.f59792a.applyAsInt(this.f59794c, i);
        }

        public void accept(Integer num) {
            OfInt.m59674a(this, num);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        /* renamed from: c */
        public OptionalInt m68413c() {
            return this.f59793b ? OptionalInt.m59136a() : OptionalInt.m59137a(this.f59794c);
        }

        /* renamed from: a */
        public void m68410a(AnonymousClass6ReducingSink anonymousClass6ReducingSink) {
            if (!anonymousClass6ReducingSink.f59793b) {
                accept(anonymousClass6ReducingSink.f59794c);
            }
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$7ReducingSink */
    class AnonymousClass7ReducingSink extends Box<R> implements AccumulatingSink<Integer, R, AnonymousClass7ReducingSink>, OfInt {
        /* renamed from: a */
        final /* synthetic */ Supplier f59795a;
        /* renamed from: b */
        final /* synthetic */ ObjIntConsumer f59796b;
        /* renamed from: c */
        final /* synthetic */ BinaryOperator f59797c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass7ReducingSink(Supplier supplier, ObjIntConsumer objIntConsumer, BinaryOperator binaryOperator) {
            this.f59795a = supplier;
            this.f59796b = objIntConsumer;
            this.f59797c = binaryOperator;
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.d = this.f59795a.get();
        }

        public void accept(int i) {
            this.f59796b.accept(this.d, i);
        }

        public void accept(Integer num) {
            OfInt.m59674a(this, num);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        /* renamed from: a */
        public void m68415a(AnonymousClass7ReducingSink anonymousClass7ReducingSink) {
            this.d = this.f59797c.apply(this.d, anonymousClass7ReducingSink.d);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$8ReducingSink */
    class AnonymousClass8ReducingSink implements AccumulatingSink<Long, Long, AnonymousClass8ReducingSink>, OfLong {
        /* renamed from: a */
        final /* synthetic */ long f59798a;
        /* renamed from: b */
        final /* synthetic */ LongBinaryOperator f59799b;
        /* renamed from: c */
        private long f59800c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass8ReducingSink(long j, LongBinaryOperator longBinaryOperator) {
            this.f59798a = j;
            this.f59799b = longBinaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68422c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59800c = this.f59798a;
        }

        public void accept(long j) {
            this.f59800c = this.f59799b.applyAsLong(this.f59800c, j);
        }

        public void accept(Long l) {
            OfLong.m59675a(this, l);
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        /* renamed from: c */
        public Long m68422c() {
            return Long.valueOf(this.f59800c);
        }

        /* renamed from: a */
        public void m68419a(AnonymousClass8ReducingSink anonymousClass8ReducingSink) {
            accept(anonymousClass8ReducingSink.f59800c);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$9ReducingSink */
    class AnonymousClass9ReducingSink implements AccumulatingSink<Long, OptionalLong, AnonymousClass9ReducingSink>, OfLong {
        /* renamed from: a */
        final /* synthetic */ LongBinaryOperator f59801a;
        /* renamed from: b */
        private boolean f59802b;
        /* renamed from: c */
        private long f59803c;

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        AnonymousClass9ReducingSink(LongBinaryOperator longBinaryOperator) {
            this.f59801a = longBinaryOperator;
        }

        public /* synthetic */ Object get() {
            return m68427c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59802b = 1;
            this.f59803c = 0;
        }

        public void accept(long j) {
            if (this.f59802b) {
                this.f59802b = false;
                this.f59803c = j;
                return;
            }
            this.f59803c = this.f59801a.applyAsLong(this.f59803c, j);
        }

        public void accept(Long l) {
            OfLong.m59675a(this, l);
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        /* renamed from: c */
        public OptionalLong m68427c() {
            return this.f59802b ? OptionalLong.m59139a() : OptionalLong.m59140a(this.f59803c);
        }

        /* renamed from: a */
        public void m68424a(AnonymousClass9ReducingSink anonymousClass9ReducingSink) {
            if (!anonymousClass9ReducingSink.f59802b) {
                accept(anonymousClass9ReducingSink.f59803c);
            }
        }
    }

    static abstract class CountingSink<T> extends Box<Long> implements AccumulatingSink<T, Long, CountingSink<T>> {
        /* renamed from: a */
        long f59804a;

        static final class OfDouble extends CountingSink<Double> implements java8.util.stream.Sink.OfDouble {
            OfDouble() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo14152a(AccumulatingSink accumulatingSink) {
                super.m68430a((CountingSink) accumulatingSink);
            }

            public /* synthetic */ Object get() {
                return super.m68432c();
            }

            public void accept(double d) {
                this.a++;
            }

            public void accept(Double d) {
                OfDouble.m59673a(this, d);
            }
        }

        static final class OfInt extends CountingSink<Integer> implements java8.util.stream.Sink.OfInt {
            OfInt() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo14152a(AccumulatingSink accumulatingSink) {
                super.m68430a((CountingSink) accumulatingSink);
            }

            public /* synthetic */ Object get() {
                return super.m68432c();
            }

            public void accept(int i) {
                this.a++;
            }

            public void accept(Integer num) {
                OfInt.m59674a(this, num);
            }
        }

        static final class OfLong extends CountingSink<Long> implements java8.util.stream.Sink.OfLong {
            OfLong() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo14152a(AccumulatingSink accumulatingSink) {
                super.m68430a((CountingSink) accumulatingSink);
            }

            public /* synthetic */ Object get() {
                return super.m68432c();
            }

            public void accept(long j) {
                this.a++;
            }

            public void accept(Long l) {
                OfLong.m59675a(this, l);
            }
        }

        static final class OfRef<T> extends CountingSink<T> {
            OfRef() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo14152a(AccumulatingSink accumulatingSink) {
                super.m68430a((CountingSink) accumulatingSink);
            }

            public /* synthetic */ Object get() {
                return super.m68432c();
            }

            public void accept(T t) {
                this.a++;
            }
        }

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        CountingSink() {
        }

        public /* synthetic */ Object get() {
            return m68432c();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            this.f59804a = 0;
        }

        /* renamed from: c */
        public Long m68432c() {
            return Long.valueOf(this.f59804a);
        }

        /* renamed from: a */
        public void m68430a(CountingSink<T> countingSink) {
            this.f59804a += countingSink.f59804a;
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
    }

    private ReduceOps() {
    }

    /* renamed from: a */
    public static <T, U> TerminalOp<T, U> m59660a(final U u, final BiFunction<U, ? super T, U> biFunction, final BinaryOperator<U> binaryOperator) {
        Objects.m59115b(biFunction);
        Objects.m59115b(binaryOperator);
        return new ReduceOp<T, U, AnonymousClass1ReducingSink>(StreamShape.REFERENCE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66799b();
            }

            /* renamed from: b */
            public AnonymousClass1ReducingSink m66799b() {
                return new AnonymousClass1ReducingSink(u, biFunction, binaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static <T> TerminalOp<T, Optional<T>> m59661a(final BinaryOperator<T> binaryOperator) {
        Objects.m59115b(binaryOperator);
        return new ReduceOp<T, Optional<T>, AnonymousClass2ReducingSink>(StreamShape.REFERENCE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66801b();
            }

            /* renamed from: b */
            public AnonymousClass2ReducingSink m66801b() {
                return new AnonymousClass2ReducingSink(binaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static <T, I> TerminalOp<T, I> m59669a(Collector<? super T, I, ?> collector) {
        final Supplier supplier = ((Collector) Objects.m59115b(collector)).supplier();
        final BiConsumer accumulator = collector.accumulator();
        final BinaryOperator combiner = collector.combiner();
        final Collector<? super T, I, ?> collector2 = collector;
        return new ReduceOp<T, I, AnonymousClass3ReducingSink>(StreamShape.REFERENCE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66803b();
            }

            /* renamed from: b */
            public AnonymousClass3ReducingSink m66803b() {
                return new AnonymousClass3ReducingSink(supplier, accumulator, combiner);
            }

            public int x_() {
                return collector2.characteristics().contains(Characteristics.UNORDERED) ? StreamOpFlag.NOT_ORDERED : 0;
            }
        };
    }

    /* renamed from: a */
    public static <T, R> TerminalOp<T, R> m59665a(final Supplier<R> supplier, final BiConsumer<R, ? super T> biConsumer, final BiConsumer<R, R> biConsumer2) {
        Objects.m59115b(supplier);
        Objects.m59115b(biConsumer);
        Objects.m59115b(biConsumer2);
        return new ReduceOp<T, R, AnonymousClass4ReducingSink>(StreamShape.REFERENCE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66805b();
            }

            /* renamed from: b */
            public AnonymousClass4ReducingSink m66805b() {
                return new AnonymousClass4ReducingSink(supplier, biConsumer, biConsumer2);
            }
        };
    }

    /* renamed from: a */
    public static <T> TerminalOp<T, Long> m59656a() {
        return new ReduceOp<T, Long, CountingSink<T>>(StreamShape.REFERENCE) {
            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66810c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66812d(pipelineHelper, spliterator);
            }

            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66809b();
            }

            /* renamed from: b */
            public CountingSink<T> m66809b() {
                return new OfRef();
            }

            /* renamed from: c */
            public <P_IN> Long m66810c(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12988a(pipelineHelper, spliterator);
            }

            /* renamed from: d */
            public <P_IN> Long m66812d(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12989b(pipelineHelper, spliterator);
            }

            public int x_() {
                return StreamOpFlag.NOT_ORDERED;
            }
        };
    }

    /* renamed from: a */
    public static TerminalOp<Integer, Integer> m59658a(final int i, final IntBinaryOperator intBinaryOperator) {
        Objects.m59115b(intBinaryOperator);
        return new ReduceOp<Integer, Integer, AnonymousClass5ReducingSink>(StreamShape.INT_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66813b();
            }

            /* renamed from: b */
            public AnonymousClass5ReducingSink m66813b() {
                return new AnonymousClass5ReducingSink(i, intBinaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static TerminalOp<Integer, OptionalInt> m59663a(final IntBinaryOperator intBinaryOperator) {
        Objects.m59115b(intBinaryOperator);
        return new ReduceOp<Integer, OptionalInt, AnonymousClass6ReducingSink>(StreamShape.INT_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66815b();
            }

            /* renamed from: b */
            public AnonymousClass6ReducingSink m66815b() {
                return new AnonymousClass6ReducingSink(intBinaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static <R> TerminalOp<Integer, R> m59667a(final Supplier<R> supplier, final ObjIntConsumer<R> objIntConsumer, final BinaryOperator<R> binaryOperator) {
        Objects.m59115b(supplier);
        Objects.m59115b(objIntConsumer);
        Objects.m59115b(binaryOperator);
        return new ReduceOp<Integer, R, AnonymousClass7ReducingSink>(StreamShape.INT_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66817b();
            }

            /* renamed from: b */
            public AnonymousClass7ReducingSink m66817b() {
                return new AnonymousClass7ReducingSink(supplier, objIntConsumer, binaryOperator);
            }
        };
    }

    /* renamed from: b */
    public static TerminalOp<Integer, Long> m59670b() {
        return new ReduceOp<Integer, Long, CountingSink<Integer>>(StreamShape.INT_VALUE) {
            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66822c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66824d(pipelineHelper, spliterator);
            }

            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66821b();
            }

            /* renamed from: b */
            public CountingSink<Integer> m66821b() {
                return new OfInt();
            }

            /* renamed from: c */
            public <P_IN> Long m66822c(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12988a(pipelineHelper, spliterator);
            }

            /* renamed from: d */
            public <P_IN> Long m66824d(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12989b(pipelineHelper, spliterator);
            }

            public int x_() {
                return StreamOpFlag.NOT_ORDERED;
            }
        };
    }

    /* renamed from: a */
    public static TerminalOp<Long, Long> m59659a(final long j, final LongBinaryOperator longBinaryOperator) {
        Objects.m59115b(longBinaryOperator);
        return new ReduceOp<Long, Long, AnonymousClass8ReducingSink>(StreamShape.LONG_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66775b();
            }

            /* renamed from: b */
            public AnonymousClass8ReducingSink m66775b() {
                return new AnonymousClass8ReducingSink(j, longBinaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static TerminalOp<Long, OptionalLong> m59664a(final LongBinaryOperator longBinaryOperator) {
        Objects.m59115b(longBinaryOperator);
        return new ReduceOp<Long, OptionalLong, AnonymousClass9ReducingSink>(StreamShape.LONG_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66777b();
            }

            /* renamed from: b */
            public AnonymousClass9ReducingSink m66777b() {
                return new AnonymousClass9ReducingSink(longBinaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static <R> TerminalOp<Long, R> m59668a(final Supplier<R> supplier, final ObjLongConsumer<R> objLongConsumer, final BinaryOperator<R> binaryOperator) {
        Objects.m59115b(supplier);
        Objects.m59115b(objLongConsumer);
        Objects.m59115b(binaryOperator);
        return new ReduceOp<Long, R, AnonymousClass10ReducingSink>(StreamShape.LONG_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66779b();
            }

            /* renamed from: b */
            public AnonymousClass10ReducingSink m66779b() {
                return new AnonymousClass10ReducingSink(supplier, objLongConsumer, binaryOperator);
            }
        };
    }

    /* renamed from: c */
    public static TerminalOp<Long, Long> m59671c() {
        return new ReduceOp<Long, Long, CountingSink<Long>>(StreamShape.LONG_VALUE) {
            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66784c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66786d(pipelineHelper, spliterator);
            }

            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66783b();
            }

            /* renamed from: b */
            public CountingSink<Long> m66783b() {
                return new OfLong();
            }

            /* renamed from: c */
            public <P_IN> Long m66784c(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12988a(pipelineHelper, spliterator);
            }

            /* renamed from: d */
            public <P_IN> Long m66786d(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12989b(pipelineHelper, spliterator);
            }

            public int x_() {
                return StreamOpFlag.NOT_ORDERED;
            }
        };
    }

    /* renamed from: a */
    public static TerminalOp<Double, Double> m59657a(final double d, final DoubleBinaryOperator doubleBinaryOperator) {
        Objects.m59115b(doubleBinaryOperator);
        return new ReduceOp<Double, Double, AnonymousClass11ReducingSink>(StreamShape.DOUBLE_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66787b();
            }

            /* renamed from: b */
            public AnonymousClass11ReducingSink m66787b() {
                return new AnonymousClass11ReducingSink(d, doubleBinaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static TerminalOp<Double, OptionalDouble> m59662a(final DoubleBinaryOperator doubleBinaryOperator) {
        Objects.m59115b(doubleBinaryOperator);
        return new ReduceOp<Double, OptionalDouble, AnonymousClass12ReducingSink>(StreamShape.DOUBLE_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66789b();
            }

            /* renamed from: b */
            public AnonymousClass12ReducingSink m66789b() {
                return new AnonymousClass12ReducingSink(doubleBinaryOperator);
            }
        };
    }

    /* renamed from: a */
    public static <R> TerminalOp<Double, R> m59666a(final Supplier<R> supplier, final ObjDoubleConsumer<R> objDoubleConsumer, final BinaryOperator<R> binaryOperator) {
        Objects.m59115b(supplier);
        Objects.m59115b(objDoubleConsumer);
        Objects.m59115b(binaryOperator);
        return new ReduceOp<Double, R, AnonymousClass13ReducingSink>(StreamShape.DOUBLE_VALUE) {
            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66791b();
            }

            /* renamed from: b */
            public AnonymousClass13ReducingSink m66791b() {
                return new AnonymousClass13ReducingSink(supplier, objDoubleConsumer, binaryOperator);
            }
        };
    }

    /* renamed from: d */
    public static TerminalOp<Double, Long> m59672d() {
        return new ReduceOp<Double, Long, CountingSink<Double>>(StreamShape.DOUBLE_VALUE) {
            /* renamed from: a */
            public /* synthetic */ Object mo12988a(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66796c(pipelineHelper, spliterator);
            }

            /* renamed from: b */
            public /* synthetic */ Object mo12989b(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return m66798d(pipelineHelper, spliterator);
            }

            /* renamed from: c */
            public /* synthetic */ AccumulatingSink mo13727c() {
                return m66795b();
            }

            /* renamed from: b */
            public CountingSink<Double> m66795b() {
                return new OfDouble();
            }

            /* renamed from: c */
            public <P_IN> Long m66796c(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12988a(pipelineHelper, spliterator);
            }

            /* renamed from: d */
            public <P_IN> Long m66798d(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator) {
                if (StreamOpFlag.SIZED.isKnown(pipelineHelper.mo12969c())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo12989b(pipelineHelper, spliterator);
            }

            public int x_() {
                return StreamOpFlag.NOT_ORDERED;
            }
        };
    }
}
