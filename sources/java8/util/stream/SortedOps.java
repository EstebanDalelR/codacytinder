package java8.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java8.lang.Iterables;
import java8.util.Comparators;
import java8.util.J8Arrays;
import java8.util.Lists;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.function.IntFunction;
import java8.util.stream.Sink.ChainedDouble;
import java8.util.stream.Sink.ChainedInt;
import java8.util.stream.Sink.ChainedLong;
import java8.util.stream.Sink.ChainedReference;

final class SortedOps {

    private static abstract class AbstractRefSortingSink<T> extends ChainedReference<T, T> {
        /* renamed from: a */
        protected final Comparator<? super T> f59277a;
        /* renamed from: b */
        protected boolean f59278b;

        AbstractRefSortingSink(Sink<? super T> sink, Comparator<? super T> comparator) {
            super(sink);
            this.f59277a = comparator;
        }

        /* renamed from: b */
        public final boolean mo13612b() {
            this.f59278b = true;
            return false;
        }
    }

    private static abstract class AbstractDoubleSortingSink extends ChainedDouble<Double> {
        /* renamed from: a */
        protected boolean f59849a;

        AbstractDoubleSortingSink(Sink<? super Double> sink) {
            super(sink);
        }

        /* renamed from: b */
        public final boolean mo13612b() {
            this.f59849a = true;
            return false;
        }
    }

    private static abstract class AbstractIntSortingSink extends ChainedInt<Integer> {
        /* renamed from: a */
        protected boolean f59850a;

        AbstractIntSortingSink(Sink<? super Integer> sink) {
            super(sink);
        }

        /* renamed from: b */
        public final boolean mo13612b() {
            this.f59850a = true;
            return false;
        }
    }

    private static abstract class AbstractLongSortingSink extends ChainedLong<Long> {
        /* renamed from: a */
        protected boolean f59851a;

        AbstractLongSortingSink(Sink<? super Long> sink) {
            super(sink);
        }

        /* renamed from: b */
        public final boolean mo13612b() {
            this.f59851a = true;
            return false;
        }
    }

    private static final class OfDouble extends StatefulOp<Double> {
        OfDouble(AbstractPipeline<?, Double, ?> abstractPipeline) {
            super(abstractPipeline, StreamShape.DOUBLE_VALUE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
        }

        /* renamed from: a */
        public Sink<Double> mo14011a(int i, Sink<Double> sink) {
            Objects.m59115b(sink);
            if (StreamOpFlag.SORTED.isKnown(i)) {
                return sink;
            }
            if (StreamOpFlag.SIZED.isKnown(i) != 0) {
                return new SizedDoubleSortingSink(sink);
            }
            return new DoubleSortingSink(sink);
        }

        /* renamed from: a */
        public <P_IN> Node<Double> mo14013a(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Double[]> intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.mo12969c())) {
                return pipelineHelper.mo12962a(spliterator, false, intFunction);
            }
            double[] dArr = (double[]) ((java8.util.stream.Node.OfDouble) pipelineHelper.mo12962a(spliterator, true, intFunction)).asPrimitiveArray();
            J8Arrays.m59086a(dArr);
            return Nodes.m59613a(dArr);
        }
    }

    private static final class OfInt extends StatefulOp<Integer> {
        OfInt(AbstractPipeline<?, Integer, ?> abstractPipeline) {
            super(abstractPipeline, StreamShape.INT_VALUE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
        }

        /* renamed from: a */
        public Sink<Integer> mo14011a(int i, Sink<Integer> sink) {
            Objects.m59115b(sink);
            if (StreamOpFlag.SORTED.isKnown(i)) {
                return sink;
            }
            if (StreamOpFlag.SIZED.isKnown(i) != 0) {
                return new SizedIntSortingSink(sink);
            }
            return new IntSortingSink(sink);
        }

        /* renamed from: a */
        public <P_IN> Node<Integer> mo14013a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Integer[]> intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.mo12969c())) {
                return pipelineHelper.mo12962a(spliterator, false, intFunction);
            }
            int[] iArr = (int[]) ((java8.util.stream.Node.OfInt) pipelineHelper.mo12962a(spliterator, true, intFunction)).asPrimitiveArray();
            J8Arrays.m59088a(iArr);
            return Nodes.m59616a(iArr);
        }
    }

    private static final class OfLong extends StatefulOp<Long> {
        OfLong(AbstractPipeline<?, Long, ?> abstractPipeline) {
            super(abstractPipeline, StreamShape.LONG_VALUE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
        }

        /* renamed from: a */
        public Sink<Long> mo14011a(int i, Sink<Long> sink) {
            Objects.m59115b(sink);
            if (StreamOpFlag.SORTED.isKnown(i)) {
                return sink;
            }
            if (StreamOpFlag.SIZED.isKnown(i) != 0) {
                return new SizedLongSortingSink(sink);
            }
            return new LongSortingSink(sink);
        }

        /* renamed from: a */
        public <P_IN> Node<Long> mo14013a(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<Long[]> intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.mo12969c())) {
                return pipelineHelper.mo12962a(spliterator, false, intFunction);
            }
            long[] jArr = (long[]) ((java8.util.stream.Node.OfLong) pipelineHelper.mo12962a(spliterator, true, intFunction)).asPrimitiveArray();
            J8Arrays.m59090a(jArr);
            return Nodes.m59618a(jArr);
        }
    }

    private static final class OfRef<T> extends StatefulOp<T, T> {
        /* renamed from: b */
        private final boolean f59852b;
        /* renamed from: c */
        private final Comparator<? super T> f59853c;

        OfRef(AbstractPipeline<?, T, ?> abstractPipeline) {
            super(abstractPipeline, StreamShape.REFERENCE, StreamOpFlag.IS_ORDERED | StreamOpFlag.IS_SORTED);
            this.f59852b = true;
            this.f59853c = Comparators.m59045b();
        }

        OfRef(AbstractPipeline<?, T, ?> abstractPipeline, Comparator<? super T> comparator) {
            super(abstractPipeline, StreamShape.REFERENCE, StreamOpFlag.IS_ORDERED | StreamOpFlag.NOT_SORTED);
            this.f59852b = null;
            this.f59853c = (Comparator) Objects.m59115b(comparator);
        }

        /* renamed from: a */
        public Sink<T> mo14011a(int i, Sink<T> sink) {
            Objects.m59115b(sink);
            if (StreamOpFlag.SORTED.isKnown(i) && this.f59852b) {
                return sink;
            }
            if (StreamOpFlag.SIZED.isKnown(i) != 0) {
                return new SizedRefSortingSink(sink, this.f59853c);
            }
            return new RefSortingSink(sink, this.f59853c);
        }

        /* renamed from: a */
        public <P_IN> Node<T> mo14013a(PipelineHelper<T> pipelineHelper, Spliterator<P_IN> spliterator, IntFunction<T[]> intFunction) {
            if (StreamOpFlag.SORTED.isKnown(pipelineHelper.mo12969c()) && this.f59852b) {
                return pipelineHelper.mo12962a(spliterator, false, intFunction);
            }
            Object[] asArray = pipelineHelper.mo12962a(spliterator, true, intFunction).asArray(intFunction);
            J8Arrays.m59092a(asArray, this.f59853c);
            return Nodes.m59626a(asArray);
        }
    }

    private static final class RefSortingSink<T> extends AbstractRefSortingSink<T> {
        /* renamed from: c */
        private ArrayList<T> f59854c;

        RefSortingSink(Sink<? super T> sink, Comparator<? super T> comparator) {
            super(sink, comparator);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59854c = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        }

        public void z_() {
            Lists.m59098a(this.f59854c, this.a);
            this.d.mo13608a((long) this.f59854c.size());
            if (this.b) {
                Iterator it = this.f59854c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (this.d.mo13612b()) {
                        break;
                    }
                    this.d.accept(next);
                }
            } else {
                Iterable iterable = this.f59854c;
                Sink sink = this.d;
                sink.getClass();
                Iterables.m59019a(iterable, SortedOps$RefSortingSink$$Lambda$1.m64068a(sink));
            }
            this.d.z_();
            this.f59854c = null;
        }

        public void accept(T t) {
            this.f59854c.add(t);
        }
    }

    private static final class SizedRefSortingSink<T> extends AbstractRefSortingSink<T> {
        /* renamed from: c */
        private T[] f59855c;
        /* renamed from: e */
        private int f59856e;

        SizedRefSortingSink(Sink<? super T> sink, Comparator<? super T> comparator) {
            super(sink, comparator);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59855c = (Object[]) new Object[((int) j)];
        }

        public void z_() {
            int i = 0;
            Arrays.sort(this.f59855c, 0, this.f59856e, this.a);
            this.d.mo13608a((long) this.f59856e);
            if (this.b) {
                while (i < this.f59856e && !this.d.mo13612b()) {
                    this.d.accept(this.f59855c[i]);
                    i++;
                }
            } else {
                while (i < this.f59856e) {
                    this.d.accept(this.f59855c[i]);
                    i++;
                }
            }
            this.d.z_();
            this.f59855c = null;
        }

        public void accept(T t) {
            Object[] objArr = this.f59855c;
            int i = this.f59856e;
            this.f59856e = i + 1;
            objArr[i] = t;
        }
    }

    private static final class DoubleSortingSink extends AbstractDoubleSortingSink {
        /* renamed from: c */
        private OfDouble f59918c;

        DoubleSortingSink(Sink<? super Double> sink) {
            super(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59918c = j > 0 ? new OfDouble((int) j) : new OfDouble();
        }

        public void z_() {
            double[] dArr = (double[]) this.f59918c.asPrimitiveArray();
            Arrays.sort(dArr);
            this.b.mo13608a((long) dArr.length);
            int i = 0;
            int length;
            if (this.a) {
                length = dArr.length;
                while (i < length) {
                    double d = dArr[i];
                    if (this.b.mo13612b()) {
                        break;
                    }
                    this.b.accept(d);
                    i++;
                }
            } else {
                length = dArr.length;
                while (i < length) {
                    this.b.accept(dArr[i]);
                    i++;
                }
            }
            this.b.z_();
        }

        public void accept(double d) {
            this.f59918c.accept(d);
        }
    }

    private static final class IntSortingSink extends AbstractIntSortingSink {
        /* renamed from: c */
        private OfInt f59919c;

        IntSortingSink(Sink<? super Integer> sink) {
            super(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59919c = j > 0 ? new OfInt((int) j) : new OfInt();
        }

        public void z_() {
            int[] iArr = (int[]) this.f59919c.asPrimitiveArray();
            Arrays.sort(iArr);
            this.b.mo13608a((long) iArr.length);
            int i = 0;
            int length;
            if (this.a) {
                length = iArr.length;
                while (i < length) {
                    int i2 = iArr[i];
                    if (this.b.mo13612b()) {
                        break;
                    }
                    this.b.accept(i2);
                    i++;
                }
            } else {
                length = iArr.length;
                while (i < length) {
                    this.b.accept(iArr[i]);
                    i++;
                }
            }
            this.b.z_();
        }

        public void accept(int i) {
            this.f59919c.accept(i);
        }
    }

    private static final class LongSortingSink extends AbstractLongSortingSink {
        /* renamed from: c */
        private OfLong f59920c;

        LongSortingSink(Sink<? super Long> sink) {
            super(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59920c = j > 0 ? new OfLong((int) j) : new OfLong();
        }

        public void z_() {
            long[] jArr = (long[]) this.f59920c.asPrimitiveArray();
            Arrays.sort(jArr);
            this.b.mo13608a((long) jArr.length);
            int i = 0;
            int length;
            if (this.a) {
                length = jArr.length;
                while (i < length) {
                    long j = jArr[i];
                    if (this.b.mo13612b()) {
                        break;
                    }
                    this.b.accept(j);
                    i++;
                }
            } else {
                length = jArr.length;
                while (i < length) {
                    this.b.accept(jArr[i]);
                    i++;
                }
            }
            this.b.z_();
        }

        public void accept(long j) {
            this.f59920c.accept(j);
        }
    }

    private static final class SizedDoubleSortingSink extends AbstractDoubleSortingSink {
        /* renamed from: c */
        private double[] f59921c;
        /* renamed from: d */
        private int f59922d;

        SizedDoubleSortingSink(Sink<? super Double> sink) {
            super(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59921c = new double[((int) j)];
        }

        public void z_() {
            int i = 0;
            Arrays.sort(this.f59921c, 0, this.f59922d);
            this.b.mo13608a((long) this.f59922d);
            if (this.a) {
                while (i < this.f59922d && !this.b.mo13612b()) {
                    this.b.accept(this.f59921c[i]);
                    i++;
                }
            } else {
                while (i < this.f59922d) {
                    this.b.accept(this.f59921c[i]);
                    i++;
                }
            }
            this.b.z_();
            this.f59921c = null;
        }

        public void accept(double d) {
            double[] dArr = this.f59921c;
            int i = this.f59922d;
            this.f59922d = i + 1;
            dArr[i] = d;
        }
    }

    private static final class SizedIntSortingSink extends AbstractIntSortingSink {
        /* renamed from: c */
        private int[] f59923c;
        /* renamed from: d */
        private int f59924d;

        SizedIntSortingSink(Sink<? super Integer> sink) {
            super(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59923c = new int[((int) j)];
        }

        public void z_() {
            int i = 0;
            Arrays.sort(this.f59923c, 0, this.f59924d);
            this.b.mo13608a((long) this.f59924d);
            if (this.a) {
                while (i < this.f59924d && !this.b.mo13612b()) {
                    this.b.accept(this.f59923c[i]);
                    i++;
                }
            } else {
                while (i < this.f59924d) {
                    this.b.accept(this.f59923c[i]);
                    i++;
                }
            }
            this.b.z_();
            this.f59923c = null;
        }

        public void accept(int i) {
            int[] iArr = this.f59923c;
            int i2 = this.f59924d;
            this.f59924d = i2 + 1;
            iArr[i2] = i;
        }
    }

    private static final class SizedLongSortingSink extends AbstractLongSortingSink {
        /* renamed from: c */
        private long[] f59925c;
        /* renamed from: d */
        private int f59926d;

        SizedLongSortingSink(Sink<? super Long> sink) {
            super(sink);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59925c = new long[((int) j)];
        }

        public void z_() {
            int i = 0;
            Arrays.sort(this.f59925c, 0, this.f59926d);
            this.b.mo13608a((long) this.f59926d);
            if (this.a) {
                while (i < this.f59926d && !this.b.mo13612b()) {
                    this.b.accept(this.f59925c[i]);
                    i++;
                }
            } else {
                while (i < this.f59926d) {
                    this.b.accept(this.f59925c[i]);
                    i++;
                }
            }
            this.b.z_();
            this.f59925c = null;
        }

        public void accept(long j) {
            long[] jArr = this.f59925c;
            int i = this.f59926d;
            this.f59926d = i + 1;
            jArr[i] = j;
        }
    }

    private SortedOps() {
    }

    /* renamed from: a */
    static <T> Stream<T> m59690a(AbstractPipeline<?, T, ?> abstractPipeline) {
        return new OfRef(abstractPipeline);
    }

    /* renamed from: a */
    static <T> Stream<T> m59691a(AbstractPipeline<?, T, ?> abstractPipeline, Comparator<? super T> comparator) {
        return new OfRef(abstractPipeline, comparator);
    }

    /* renamed from: b */
    static <T> IntStream m59692b(AbstractPipeline<?, Integer, ?> abstractPipeline) {
        return new OfInt(abstractPipeline);
    }

    /* renamed from: c */
    static <T> LongStream m59693c(AbstractPipeline<?, Long, ?> abstractPipeline) {
        return new OfLong(abstractPipeline);
    }

    /* renamed from: d */
    static <T> DoubleStream m59694d(AbstractPipeline<?, Double, ?> abstractPipeline) {
        return new OfDouble(abstractPipeline);
    }
}
