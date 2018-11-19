package java8.util.stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java8.util.J8Arrays;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterators;
import java8.util.concurrent.CountedCompleter;
import java8.util.function.BinaryOperator;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;
import java8.util.function.LongConsumer;
import java8.util.function.LongFunction;
import java8.util.stream.Node.Builder;

final class Nodes {
    /* renamed from: a */
    private static final Node f48897a = new OfRef();
    /* renamed from: b */
    private static final java8.util.stream.Node.OfInt f48898b = new OfInt();
    /* renamed from: c */
    private static final java8.util.stream.Node.OfLong f48899c = new OfLong();
    /* renamed from: d */
    private static final java8.util.stream.Node.OfDouble f48900d = new OfDouble();
    /* renamed from: e */
    private static final int[] f48901e = new int[0];
    /* renamed from: f */
    private static final long[] f48902f = new long[0];
    /* renamed from: g */
    private static final double[] f48903g = new double[0];

    static final class OfDouble {
        /* renamed from: b */
        private static /* synthetic */ void m59592b(double d) {
        }

        /* renamed from: a */
        static java8.util.stream.Node.OfDouble m59586a(java8.util.stream.Node.OfDouble ofDouble, long j, long j2, IntFunction<Double[]> intFunction) {
            if (j == 0 && j2 == ofDouble.mo12999c()) {
                return ofDouble;
            }
            long j3 = j2 - j;
            java8.util.Spliterator.OfDouble ofDouble2 = (java8.util.Spliterator.OfDouble) ofDouble.spliterator();
            DoubleConsumer c = Nodes.m59636c(j3);
            c.mo13608a(j3);
            for (int i = 0; ((long) i) < j && ofDouble2.tryAdvance(Nodes$OfDouble$$Lambda$1.m64052a()); i++) {
            }
            if (j2 == ofDouble.mo12999c()) {
                ofDouble2.forEachRemaining(c);
            } else {
                for (int i2 = 0; ((long) i2) < j3 && ofDouble2.tryAdvance(c) != null; i2++) {
                }
            }
            c.z_();
            return c.build();
        }

        /* renamed from: a */
        static void m59589a(java8.util.stream.Node.OfDouble ofDouble, Consumer<? super Double> consumer) {
            if (consumer instanceof DoubleConsumer) {
                ofDouble.forEach((DoubleConsumer) consumer);
            } else {
                ((java8.util.Spliterator.OfDouble) ofDouble.spliterator()).forEachRemaining((Consumer) consumer);
            }
        }

        /* renamed from: a */
        static void m59590a(java8.util.stream.Node.OfDouble ofDouble, Double[] dArr, int i) {
            double[] dArr2 = (double[]) ofDouble.asPrimitiveArray();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
        }

        /* renamed from: a */
        static double[] m59591a(java8.util.stream.Node.OfDouble ofDouble, int i) {
            return new double[i];
        }

        /* renamed from: a */
        static StreamShape m59587a(java8.util.stream.Node.OfDouble ofDouble) {
            return StreamShape.DOUBLE_VALUE;
        }

        private OfDouble() {
        }
    }

    static final class OfInt {
        /* renamed from: b */
        private static /* synthetic */ void m59599b(int i) {
        }

        /* renamed from: a */
        static java8.util.stream.Node.OfInt m59593a(java8.util.stream.Node.OfInt ofInt, long j, long j2, IntFunction<Integer[]> intFunction) {
            if (j == 0 && j2 == ofInt.mo12999c()) {
                return ofInt;
            }
            long j3 = j2 - j;
            java8.util.Spliterator.OfInt ofInt2 = (java8.util.Spliterator.OfInt) ofInt.spliterator();
            IntConsumer a = Nodes.m59610a(j3);
            a.mo13608a(j3);
            for (int i = 0; ((long) i) < j && ofInt2.tryAdvance(Nodes$OfInt$$Lambda$1.m64053a()); i++) {
            }
            if (j2 == ofInt.mo12999c()) {
                ofInt2.forEachRemaining(a);
            } else {
                for (int i2 = 0; ((long) i2) < j3 && ofInt2.tryAdvance(a) != null; i2++) {
                }
            }
            a.z_();
            return a.build();
        }

        /* renamed from: a */
        static void m59596a(java8.util.stream.Node.OfInt ofInt, Consumer<? super Integer> consumer) {
            if (consumer instanceof IntConsumer) {
                ofInt.forEach((IntConsumer) consumer);
            } else {
                ((java8.util.Spliterator.OfInt) ofInt.spliterator()).forEachRemaining((Consumer) consumer);
            }
        }

        /* renamed from: a */
        static void m59597a(java8.util.stream.Node.OfInt ofInt, Integer[] numArr, int i) {
            int[] iArr = (int[]) ofInt.asPrimitiveArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
        }

        /* renamed from: a */
        static int[] m59598a(java8.util.stream.Node.OfInt ofInt, int i) {
            return new int[i];
        }

        /* renamed from: a */
        static StreamShape m59594a(java8.util.stream.Node.OfInt ofInt) {
            return StreamShape.INT_VALUE;
        }

        private OfInt() {
        }
    }

    static final class OfLong {
        /* renamed from: b */
        private static /* synthetic */ void m59606b(long j) {
        }

        /* renamed from: a */
        static java8.util.stream.Node.OfLong m59600a(java8.util.stream.Node.OfLong ofLong, long j, long j2, IntFunction<Long[]> intFunction) {
            if (j == 0 && j2 == ofLong.mo12999c()) {
                return ofLong;
            }
            long j3 = j2 - j;
            java8.util.Spliterator.OfLong ofLong2 = (java8.util.Spliterator.OfLong) ofLong.spliterator();
            LongConsumer b = Nodes.m59631b(j3);
            b.mo13608a(j3);
            for (int i = 0; ((long) i) < j && ofLong2.tryAdvance(Nodes$OfLong$$Lambda$1.m64054a()); i++) {
            }
            if (j2 == ofLong.mo12999c()) {
                ofLong2.forEachRemaining(b);
            } else {
                for (int i2 = 0; ((long) i2) < j3 && ofLong2.tryAdvance(b) != null; i2++) {
                }
            }
            b.z_();
            return b.build();
        }

        /* renamed from: a */
        static void m59603a(java8.util.stream.Node.OfLong ofLong, Consumer<? super Long> consumer) {
            if (consumer instanceof LongConsumer) {
                ofLong.forEach((LongConsumer) consumer);
            } else {
                ((java8.util.Spliterator.OfLong) ofLong.spliterator()).forEachRemaining((Consumer) consumer);
            }
        }

        /* renamed from: a */
        static void m59604a(java8.util.stream.Node.OfLong ofLong, Long[] lArr, int i) {
            long[] jArr = (long[]) ofLong.asPrimitiveArray();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
        }

        /* renamed from: a */
        static long[] m59605a(java8.util.stream.Node.OfLong ofLong, int i) {
            return new long[i];
        }

        /* renamed from: a */
        static StreamShape m59601a(java8.util.stream.Node.OfLong ofLong) {
            return StreamShape.LONG_VALUE;
        }

        private OfLong() {
        }
    }

    static final class OfPrimitive {
        /* renamed from: a */
        static <T, T_CONS, T_ARR, T_NODE extends java8.util.stream.Node.OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE>, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> T_NODE m59607a(java8.util.stream.Node.OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE> ofPrimitive, int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        static <T, T_CONS, T_ARR, T_NODE extends java8.util.stream.Node.OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE>, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> T[] m59608a(java8.util.stream.Node.OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE> ofPrimitive, IntFunction<T[]> intFunction) {
            if (ofPrimitive.mo12999c() >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.apply((int) ofPrimitive.mo12999c());
            ofPrimitive.mo13002a(objArr, 0);
            return objArr;
        }

        private OfPrimitive() {
        }
    }

    private static abstract class AbstractConcNode<T, T_NODE extends Node<T>> implements Node<T> {
        /* renamed from: a */
        protected final T_NODE f54608a;
        /* renamed from: b */
        protected final T_NODE f54609b;
        /* renamed from: c */
        private final long f54610c;

        /* renamed from: e */
        public int mo13000e() {
            return 2;
        }

        AbstractConcNode(T_NODE t_node, T_NODE t_node2) {
            this.f54608a = t_node;
            this.f54609b = t_node2;
            this.f54610c = t_node.mo12999c() + t_node2.mo12999c();
        }

        public StreamShape getShape() {
            return Nodes.m59627a((Node) this);
        }

        public T_NODE a_(int i) {
            if (i == 0) {
                return this.f54608a;
            }
            if (i == 1) {
                return this.f54609b;
            }
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: c */
        public long mo12999c() {
            return this.f54610c;
        }
    }

    private static class ArrayNode<T> implements Node<T> {
        /* renamed from: a */
        final T[] f54611a;
        /* renamed from: b */
        int f54612b;

        ArrayNode(long j, IntFunction<T[]> intFunction) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f54611a = (Object[]) intFunction.apply((int) j);
            this.f54612b = 0;
        }

        ArrayNode(T[] tArr) {
            this.f54611a = tArr;
            this.f54612b = tArr.length;
        }

        public Spliterator<T> y_() {
            return J8Arrays.m59085a(this.f54611a, 0, this.f54612b);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        public Node<T> a_(int i) {
            return Nodes.m59620a((Node) this, i);
        }

        /* renamed from: a */
        public Node<T> mo13001a(long j, long j2, IntFunction<T[]> intFunction) {
            return Nodes.m59621a((Node) this, j, j2, (IntFunction) intFunction);
        }

        /* renamed from: a */
        public void mo13002a(T[] tArr, int i) {
            System.arraycopy(this.f54611a, 0, tArr, i, this.f54612b);
        }

        public T[] asArray(IntFunction<T[]> intFunction) {
            if (this.f54611a.length == this.f54612b) {
                return this.f54611a;
            }
            throw new IllegalStateException();
        }

        /* renamed from: c */
        public long mo12999c() {
            return (long) this.f54612b;
        }

        public void forEach(Consumer<? super T> consumer) {
            for (int i = 0; i < this.f54612b; i++) {
                consumer.accept(this.f54611a[i]);
            }
        }

        public String toString() {
            return String.format("ArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f54611a.length - this.f54612b), Arrays.toString(this.f54611a)});
        }
    }

    private static final class CollectionNode<T> implements Node<T> {
        /* renamed from: a */
        private final Collection<T> f54613a;

        CollectionNode(Collection<T> collection) {
            this.f54613a = collection;
        }

        public Spliterator<T> y_() {
            return Spliterators.m59160a(this.f54613a);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        public Node<T> a_(int i) {
            return Nodes.m59620a((Node) this, i);
        }

        /* renamed from: a */
        public Node<T> mo13001a(long j, long j2, IntFunction<T[]> intFunction) {
            return Nodes.m59621a((Node) this, j, j2, (IntFunction) intFunction);
        }

        /* renamed from: a */
        public void mo13002a(T[] tArr, int i) {
            for (Object obj : this.f54613a) {
                int i2 = i + 1;
                tArr[i] = obj;
                i = i2;
            }
        }

        public T[] asArray(IntFunction<T[]> intFunction) {
            return this.f54613a.toArray((Object[]) intFunction.apply(this.f54613a.size()));
        }

        /* renamed from: c */
        public long mo12999c() {
            return (long) this.f54613a.size();
        }

        public void forEach(Consumer<? super T> consumer) {
            Objects.m59115b(consumer);
            for (Object accept : this.f54613a) {
                consumer.accept(accept);
            }
        }

        public String toString() {
            return String.format("CollectionNode[%d][%s]", new Object[]{Integer.valueOf(this.f54613a.size()), this.f54613a});
        }
    }

    private static abstract class EmptyNode<T, T_ARR, T_CONS> implements Node<T> {

        private static class OfRef<T> extends EmptyNode<T, T[], Consumer<? super T>> {
            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                super.copyInto(objArr, i);
            }

            public /* bridge */ /* synthetic */ void forEach(Consumer consumer) {
                super.forEach(consumer);
            }

            private OfRef() {
            }

            public Spliterator<T> y_() {
                return Spliterators.m59159a();
            }
        }

        private static final class OfDouble extends EmptyNode<Double, double[], DoubleConsumer> implements java8.util.stream.Node.OfDouble {
            /* renamed from: a */
            public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
                return truncate(j, j2, intFunction);
            }

            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                copyInto((Double[]) objArr, i);
            }

            public /* synthetic */ Node a_(int i) {
                return m67780b(i);
            }

            public /* synthetic */ Object asPrimitiveArray() {
                return m67781b();
            }

            public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
                return m67780b(i);
            }

            public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
                return m67777a();
            }

            public /* synthetic */ Spliterator y_() {
                return m67777a();
            }

            OfDouble() {
            }

            public void forEach(Consumer<? super Double> consumer) {
                OfDouble.m59589a((java8.util.stream.Node.OfDouble) this, (Consumer) consumer);
            }

            /* renamed from: b */
            public java8.util.stream.Node.OfDouble m67780b(int i) {
                return (java8.util.stream.Node.OfDouble) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
            }

            public java8.util.stream.Node.OfDouble truncate(long j, long j2, IntFunction<Double[]> intFunction) {
                return OfDouble.m59586a(this, j, j2, intFunction);
            }

            /* renamed from: a */
            public java8.util.Spliterator.OfDouble m67777a() {
                return Spliterators.m59181d();
            }

            public void copyInto(Double[] dArr, int i) {
                OfDouble.m59590a(this, dArr, i);
            }

            /* renamed from: b */
            public double[] m67781b() {
                return Nodes.f48903g;
            }

            public double[] newArray(int i) {
                return OfDouble.m59591a((java8.util.stream.Node.OfDouble) this, i);
            }
        }

        private static final class OfInt extends EmptyNode<Integer, int[], IntConsumer> implements java8.util.stream.Node.OfInt {
            /* renamed from: a */
            public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
                return truncate(j, j2, intFunction);
            }

            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                copyInto((Integer[]) objArr, i);
            }

            public /* synthetic */ Node a_(int i) {
                return m67785b(i);
            }

            public /* synthetic */ Object asPrimitiveArray() {
                return m67786b();
            }

            public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
                return m67785b(i);
            }

            public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
                return m67782a();
            }

            public /* synthetic */ Spliterator y_() {
                return m67782a();
            }

            OfInt() {
            }

            public void forEach(Consumer<? super Integer> consumer) {
                OfInt.m59596a((java8.util.stream.Node.OfInt) this, (Consumer) consumer);
            }

            /* renamed from: a */
            public java8.util.Spliterator.OfInt m67782a() {
                return Spliterators.m59175b();
            }

            /* renamed from: b */
            public java8.util.stream.Node.OfInt m67785b(int i) {
                return (java8.util.stream.Node.OfInt) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
            }

            public java8.util.stream.Node.OfInt truncate(long j, long j2, IntFunction<Integer[]> intFunction) {
                return OfInt.m59593a(this, j, j2, intFunction);
            }

            /* renamed from: b */
            public int[] m67786b() {
                return Nodes.f48901e;
            }

            public void copyInto(Integer[] numArr, int i) {
                OfInt.m59597a(this, numArr, i);
            }

            public int[] newArray(int i) {
                return OfInt.m59598a((java8.util.stream.Node.OfInt) this, i);
            }
        }

        private static final class OfLong extends EmptyNode<Long, long[], LongConsumer> implements java8.util.stream.Node.OfLong {
            /* renamed from: a */
            public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
                return truncate(j, j2, intFunction);
            }

            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                copyInto((Long[]) objArr, i);
            }

            public /* synthetic */ Node a_(int i) {
                return m67790b(i);
            }

            public /* synthetic */ Object asPrimitiveArray() {
                return m67791b();
            }

            public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
                return m67790b(i);
            }

            public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
                return m67787a();
            }

            public /* synthetic */ Spliterator y_() {
                return m67787a();
            }

            OfLong() {
            }

            public void forEach(Consumer<? super Long> consumer) {
                OfLong.m59603a((java8.util.stream.Node.OfLong) this, (Consumer) consumer);
            }

            /* renamed from: a */
            public java8.util.Spliterator.OfLong m67787a() {
                return Spliterators.m59179c();
            }

            /* renamed from: b */
            public java8.util.stream.Node.OfLong m67790b(int i) {
                return (java8.util.stream.Node.OfLong) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
            }

            public java8.util.stream.Node.OfLong truncate(long j, long j2, IntFunction<Long[]> intFunction) {
                return OfLong.m59600a(this, j, j2, intFunction);
            }

            /* renamed from: b */
            public long[] m67791b() {
                return Nodes.f48902f;
            }

            public void copyInto(Long[] lArr, int i) {
                OfLong.m59604a(this, lArr, i);
            }

            public long[] newArray(int i) {
                return OfLong.m59605a((java8.util.stream.Node.OfLong) this, i);
            }
        }

        /* renamed from: c */
        public long mo12999c() {
            return 0;
        }

        public void copyInto(T_ARR t_arr, int i) {
        }

        public void forEach(T_CONS t_cons) {
        }

        EmptyNode() {
        }

        public T[] asArray(IntFunction<T[]> intFunction) {
            return (Object[]) intFunction.apply(0);
        }

        public StreamShape getShape() {
            return Nodes.m59627a((Node) this);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        public Node<T> a_(int i) {
            return Nodes.m59620a((Node) this, i);
        }

        /* renamed from: a */
        public Node<T> mo13001a(long j, long j2, IntFunction<T[]> intFunction) {
            return Nodes.m59621a((Node) this, j, j2, (IntFunction) intFunction);
        }
    }

    private static abstract class InternalNodeSpliterator<T, S extends Spliterator<T>, N extends Node<T>> implements Spliterator<T> {
        /* renamed from: a */
        N f54618a;
        /* renamed from: b */
        int f54619b;
        /* renamed from: c */
        S f54620c;
        /* renamed from: d */
        S f54621d;
        /* renamed from: e */
        Deque<N> f54622e;

        private static abstract class OfPrimitive<T, T_CONS, T_ARR, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>, N extends java8.util.stream.Node.OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, N>> extends InternalNodeSpliterator<T, T_SPLITR, N> implements java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR> {
            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfPrimitive trySplit() {
                return (java8.util.Spliterator.OfPrimitive) super.trySplit();
            }

            OfPrimitive(N n) {
                super(n);
            }

            public boolean tryAdvance(T_CONS t_cons) {
                if (!m64051b()) {
                    return null;
                }
                boolean tryAdvance = ((java8.util.Spliterator.OfPrimitive) this.d).tryAdvance(t_cons);
                if (!tryAdvance) {
                    if (this.c == null) {
                        java8.util.stream.Node.OfPrimitive ofPrimitive = (java8.util.stream.Node.OfPrimitive) m64050a(this.e);
                        if (ofPrimitive != null) {
                            this.d = ofPrimitive.spliterator();
                            return ((java8.util.Spliterator.OfPrimitive) this.d).tryAdvance(t_cons);
                        }
                    }
                    this.a = null;
                }
                return tryAdvance;
            }

            public void forEachRemaining(T_CONS t_cons) {
                if (this.a != null) {
                    if (this.d != null) {
                        while (tryAdvance(t_cons)) {
                        }
                    } else if (this.c == null) {
                        Deque a = m64049a();
                        while (true) {
                            java8.util.stream.Node.OfPrimitive ofPrimitive = (java8.util.stream.Node.OfPrimitive) m64050a(a);
                            if (ofPrimitive == null) {
                                break;
                            }
                            ofPrimitive.forEach(t_cons);
                        }
                        this.a = null;
                    } else {
                        ((java8.util.Spliterator.OfPrimitive) this.c).forEachRemaining(t_cons);
                    }
                }
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public Comparator<? super T> getComparator() {
                return Spliterators.m59174b((Spliterator) this);
            }
        }

        private static final class OfRef<T> extends InternalNodeSpliterator<T, Spliterator<T>, Node<T>> {
            OfRef(Node<T> node) {
                super(node);
            }

            public boolean tryAdvance(Consumer<? super T> consumer) {
                if (!m64051b()) {
                    return null;
                }
                boolean tryAdvance = this.d.tryAdvance(consumer);
                if (!tryAdvance) {
                    if (this.c == null) {
                        Node a = m64050a(this.e);
                        if (a != null) {
                            this.d = a.y_();
                            return this.d.tryAdvance(consumer);
                        }
                    }
                    this.a = null;
                }
                return tryAdvance;
            }

            public void forEachRemaining(Consumer<? super T> consumer) {
                if (this.a != null) {
                    if (this.d != null) {
                        while (tryAdvance(consumer)) {
                        }
                    } else if (this.c == null) {
                        Deque a = m64049a();
                        while (true) {
                            Node a2 = m64050a(a);
                            if (a2 == null) {
                                break;
                            }
                            a2.forEach(consumer);
                        }
                        this.a = null;
                    } else {
                        this.c.forEachRemaining(consumer);
                    }
                }
            }

            public long getExactSizeIfKnown() {
                return Spliterators.m59152a((Spliterator) this);
            }

            public boolean hasCharacteristics(int i) {
                return Spliterators.m59173a((Spliterator) this, i);
            }

            public Comparator<? super T> getComparator() {
                return Spliterators.m59174b((Spliterator) this);
            }
        }

        private static final class OfDouble extends OfPrimitive<Double, DoubleConsumer, double[], java8.util.Spliterator.OfDouble, java8.util.stream.Node.OfDouble> implements java8.util.Spliterator.OfDouble {
            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfDouble trySplit() {
                return (java8.util.Spliterator.OfDouble) super.trySplit();
            }

            OfDouble(java8.util.stream.Node.OfDouble ofDouble) {
                super(ofDouble);
            }

            public boolean tryAdvance(Consumer<? super Double> consumer) {
                return java8.util.Spliterators.OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Double> consumer) {
                java8.util.Spliterators.OfDouble.m59145b(this, consumer);
            }
        }

        private static final class OfInt extends OfPrimitive<Integer, IntConsumer, int[], java8.util.Spliterator.OfInt, java8.util.stream.Node.OfInt> implements java8.util.Spliterator.OfInt {
            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfInt trySplit() {
                return (java8.util.Spliterator.OfInt) super.trySplit();
            }

            OfInt(java8.util.stream.Node.OfInt ofInt) {
                super(ofInt);
            }

            public boolean tryAdvance(Consumer<? super Integer> consumer) {
                return java8.util.Spliterators.OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Integer> consumer) {
                java8.util.Spliterators.OfInt.m59148b(this, consumer);
            }
        }

        private static final class OfLong extends OfPrimitive<Long, LongConsumer, long[], java8.util.Spliterator.OfLong, java8.util.stream.Node.OfLong> implements java8.util.Spliterator.OfLong {
            public /* bridge */ /* synthetic */ java8.util.Spliterator.OfLong trySplit() {
                return (java8.util.Spliterator.OfLong) super.trySplit();
            }

            OfLong(java8.util.stream.Node.OfLong ofLong) {
                super(ofLong);
            }

            public boolean tryAdvance(Consumer<? super Long> consumer) {
                return java8.util.Spliterators.OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
            }

            public void forEachRemaining(Consumer<? super Long> consumer) {
                java8.util.Spliterators.OfLong.m59151b(this, consumer);
            }
        }

        public final int characteristics() {
            return 64;
        }

        InternalNodeSpliterator(N n) {
            this.f54618a = n;
        }

        /* renamed from: a */
        protected final Deque<N> m64049a() {
            Deque<N> arrayDeque = new ArrayDeque(8);
            for (int e = this.f54618a.mo13000e() - 1; e >= this.f54619b; e--) {
                arrayDeque.addFirst(this.f54618a.a_(e));
            }
            return arrayDeque;
        }

        /* renamed from: a */
        protected final N m64050a(Deque<N> deque) {
            while (true) {
                Node node = (Node) deque.pollFirst();
                if (node == null) {
                    return null;
                }
                if (node.mo13000e() != 0) {
                    for (int e = node.mo13000e() - 1; e >= 0; e--) {
                        deque.addFirst(node.a_(e));
                    }
                } else if (node.mo12999c() > 0) {
                    return node;
                }
            }
        }

        /* renamed from: b */
        protected final boolean m64051b() {
            if (this.f54618a == null) {
                return false;
            }
            if (this.f54621d == null) {
                if (this.f54620c == null) {
                    this.f54622e = m64049a();
                    Node a = m64050a(this.f54622e);
                    if (a != null) {
                        this.f54621d = a.y_();
                    } else {
                        this.f54618a = null;
                        return false;
                    }
                }
                this.f54621d = this.f54620c;
            }
            return true;
        }

        public final S trySplit() {
            if (this.f54618a != null) {
                if (this.f54621d == null) {
                    if (this.f54620c != null) {
                        return this.f54620c.trySplit();
                    }
                    Node node;
                    int i;
                    if (this.f54619b < this.f54618a.mo13000e() - 1) {
                        node = this.f54618a;
                        i = this.f54619b;
                        this.f54619b = i + 1;
                        return node.a_(i).y_();
                    }
                    this.f54618a = this.f54618a.a_(this.f54619b);
                    if (this.f54618a.mo13000e() == 0) {
                        this.f54620c = this.f54618a.y_();
                        return this.f54620c.trySplit();
                    }
                    this.f54619b = 0;
                    node = this.f54618a;
                    i = this.f54619b;
                    this.f54619b = i + 1;
                    return node.a_(i).y_();
                }
            }
            return null;
        }

        public final long estimateSize() {
            long j = 0;
            if (this.f54618a == null) {
                return 0;
            }
            if (this.f54620c != null) {
                return this.f54620c.estimateSize();
            }
            int i = this.f54619b;
            while (i < this.f54618a.mo13000e()) {
                i++;
                j += this.f54618a.a_(i).mo12999c();
            }
            return j;
        }
    }

    static final class ConcNode<T> extends AbstractConcNode<T, Node<T>> implements Node<T> {

        private static abstract class OfPrimitive<E, T_CONS, T_ARR, T_SPLITR extends java8.util.Spliterator.OfPrimitive<E, T_CONS, T_SPLITR>, T_NODE extends java8.util.stream.Node.OfPrimitive<E, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends AbstractConcNode<E, T_NODE> implements java8.util.stream.Node.OfPrimitive<E, T_CONS, T_ARR, T_SPLITR, T_NODE> {
            public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
                return (java8.util.stream.Node.OfPrimitive) super.a_(i);
            }

            OfPrimitive(T_NODE t_node, T_NODE t_node2) {
                super(t_node, t_node2);
            }

            public void forEach(T_CONS t_cons) {
                ((java8.util.stream.Node.OfPrimitive) this.a).forEach(t_cons);
                ((java8.util.stream.Node.OfPrimitive) this.b).forEach(t_cons);
            }

            public void copyInto(T_ARR t_arr, int i) {
                ((java8.util.stream.Node.OfPrimitive) this.a).copyInto(t_arr, i);
                ((java8.util.stream.Node.OfPrimitive) this.b).copyInto(t_arr, i + ((int) ((java8.util.stream.Node.OfPrimitive) this.a).mo12999c()));
            }

            public T_ARR asPrimitiveArray() {
                long c = mo12999c();
                if (c >= 2147483639) {
                    throw new IllegalArgumentException("Stream size exceeds max array size");
                }
                T_ARR newArray = newArray((int) c);
                copyInto(newArray, 0);
                return newArray;
            }

            public E[] asArray(IntFunction<E[]> intFunction) {
                return OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
            }

            public String toString() {
                if (mo12999c() < 32) {
                    return String.format("%s[%s.%s]", new Object[]{getClass().getName(), this.a, this.b});
                }
                return String.format("%s[size=%d]", new Object[]{getClass().getName(), Long.valueOf(mo12999c())});
            }
        }

        static final class OfDouble extends OfPrimitive<Double, DoubleConsumer, double[], java8.util.Spliterator.OfDouble, java8.util.stream.Node.OfDouble> implements java8.util.stream.Node.OfDouble {
            /* renamed from: a */
            public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
                return truncate(j, j2, intFunction);
            }

            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                copyInto((Double[]) objArr, i);
            }

            public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
                return m67758a();
            }

            public /* synthetic */ Spliterator y_() {
                return m67758a();
            }

            OfDouble(java8.util.stream.Node.OfDouble ofDouble, java8.util.stream.Node.OfDouble ofDouble2) {
                super(ofDouble, ofDouble2);
            }

            public void forEach(Consumer<? super Double> consumer) {
                OfDouble.m59589a((java8.util.stream.Node.OfDouble) this, (Consumer) consumer);
            }

            public java8.util.stream.Node.OfDouble truncate(long j, long j2, IntFunction<Double[]> intFunction) {
                return OfDouble.m59586a(this, j, j2, intFunction);
            }

            /* renamed from: a */
            public java8.util.Spliterator.OfDouble m67758a() {
                return new OfDouble(this);
            }

            public void copyInto(Double[] dArr, int i) {
                OfDouble.m59590a(this, dArr, i);
            }

            public double[] newArray(int i) {
                return OfDouble.m59591a((java8.util.stream.Node.OfDouble) this, i);
            }
        }

        static final class OfInt extends OfPrimitive<Integer, IntConsumer, int[], java8.util.Spliterator.OfInt, java8.util.stream.Node.OfInt> implements java8.util.stream.Node.OfInt {
            /* renamed from: a */
            public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
                return truncate(j, j2, intFunction);
            }

            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                copyInto((Integer[]) objArr, i);
            }

            public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
                return m67761a();
            }

            public /* synthetic */ Spliterator y_() {
                return m67761a();
            }

            OfInt(java8.util.stream.Node.OfInt ofInt, java8.util.stream.Node.OfInt ofInt2) {
                super(ofInt, ofInt2);
            }

            public void forEach(Consumer<? super Integer> consumer) {
                OfInt.m59596a((java8.util.stream.Node.OfInt) this, (Consumer) consumer);
            }

            /* renamed from: a */
            public java8.util.Spliterator.OfInt m67761a() {
                return new OfInt(this);
            }

            public java8.util.stream.Node.OfInt truncate(long j, long j2, IntFunction<Integer[]> intFunction) {
                return OfInt.m59593a(this, j, j2, intFunction);
            }

            public void copyInto(Integer[] numArr, int i) {
                OfInt.m59597a(this, numArr, i);
            }

            public int[] newArray(int i) {
                return OfInt.m59598a((java8.util.stream.Node.OfInt) this, i);
            }
        }

        static final class OfLong extends OfPrimitive<Long, LongConsumer, long[], java8.util.Spliterator.OfLong, java8.util.stream.Node.OfLong> implements java8.util.stream.Node.OfLong {
            /* renamed from: a */
            public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
                return truncate(j, j2, intFunction);
            }

            /* renamed from: a */
            public /* synthetic */ void mo13002a(Object[] objArr, int i) {
                copyInto((Long[]) objArr, i);
            }

            public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
                return m67764a();
            }

            public /* synthetic */ Spliterator y_() {
                return m67764a();
            }

            OfLong(java8.util.stream.Node.OfLong ofLong, java8.util.stream.Node.OfLong ofLong2) {
                super(ofLong, ofLong2);
            }

            public void forEach(Consumer<? super Long> consumer) {
                OfLong.m59603a((java8.util.stream.Node.OfLong) this, (Consumer) consumer);
            }

            public java8.util.stream.Node.OfLong truncate(long j, long j2, IntFunction<Long[]> intFunction) {
                return OfLong.m59600a(this, j, j2, intFunction);
            }

            /* renamed from: a */
            public java8.util.Spliterator.OfLong m67764a() {
                return new OfLong(this);
            }

            public void copyInto(Long[] lArr, int i) {
                OfLong.m59604a(this, lArr, i);
            }

            public long[] newArray(int i) {
                return OfLong.m59605a((java8.util.stream.Node.OfLong) this, i);
            }
        }

        ConcNode(Node<T> node, Node<T> node2) {
            super(node, node2);
        }

        public Spliterator<T> y_() {
            return new OfRef(this);
        }

        /* renamed from: a */
        public void mo13002a(T[] tArr, int i) {
            Objects.m59115b(tArr);
            this.a.mo13002a(tArr, i);
            this.b.mo13002a(tArr, i + ((int) this.a.mo12999c()));
        }

        public T[] asArray(IntFunction<T[]> intFunction) {
            long c = mo12999c();
            if (c >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.apply((int) c);
            mo13002a(objArr, 0);
            return objArr;
        }

        public void forEach(Consumer<? super T> consumer) {
            this.a.forEach(consumer);
            this.b.forEach(consumer);
        }

        /* renamed from: a */
        public Node<T> mo13001a(long j, long j2, IntFunction<T[]> intFunction) {
            if (j == 0 && j2 == mo12999c()) {
                return this;
            }
            long c = this.a.mo12999c();
            if (j >= c) {
                return this.b.mo13001a(j - c, j2 - c, intFunction);
            }
            if (j2 <= c) {
                return this.a.mo13001a(j, j2, intFunction);
            }
            IntFunction<T[]> intFunction2 = intFunction;
            return Nodes.m59625a(getShape(), this.a.mo13001a(j, c, intFunction2), this.b.mo13001a(0, j2 - c, intFunction2));
        }

        public String toString() {
            if (mo12999c() < 32) {
                return String.format("ConcNode[%s.%s]", new Object[]{this.a, this.b});
            }
            return String.format("ConcNode[size=%d]", new Object[]{Long.valueOf(mo12999c())});
        }
    }

    private static abstract class SizedCollectorTask<P_IN, P_OUT, T_SINK extends Sink<P_OUT>, K extends SizedCollectorTask<P_IN, P_OUT, T_SINK, K>> extends CountedCompleter<Void> implements Sink<P_OUT> {
        /* renamed from: a */
        protected final Spliterator<P_IN> f57682a;
        /* renamed from: b */
        protected final PipelineHelper<P_OUT> f57683b;
        /* renamed from: c */
        protected final long f57684c;
        /* renamed from: d */
        protected long f57685d;
        /* renamed from: e */
        protected long f57686e;
        /* renamed from: f */
        protected int f57687f;
        /* renamed from: g */
        protected int f57688g;

        static final class OfDouble<P_IN> extends SizedCollectorTask<P_IN, Double, java8.util.stream.Sink.OfDouble, OfDouble<P_IN>> implements java8.util.stream.Sink.OfDouble {
            /* renamed from: h */
            private final double[] f59251h;

            /* renamed from: a */
            /* synthetic */ SizedCollectorTask mo14028a(Spliterator spliterator, long j, long j2) {
                return m67815b(spliterator, j, j2);
            }

            OfDouble(Spliterator<P_IN> spliterator, PipelineHelper<Double> pipelineHelper, double[] dArr) {
                super(spliterator, pipelineHelper, dArr.length);
                this.f59251h = dArr;
            }

            OfDouble(OfDouble<P_IN> ofDouble, Spliterator<P_IN> spliterator, long j, long j2) {
                super(ofDouble, spliterator, j, j2, ofDouble.f59251h.length);
                this.f59251h = ofDouble.f59251h;
            }

            /* renamed from: b */
            OfDouble<P_IN> m67815b(Spliterator<P_IN> spliterator, long j, long j2) {
                return new OfDouble(this, spliterator, j, j2);
            }

            public void accept(double d) {
                if (this.f >= this.g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f));
                }
                double[] dArr = this.f59251h;
                int i = this.f;
                this.f = i + 1;
                dArr[i] = d;
            }

            public void accept(Double d) {
                OfDouble.m59673a(this, d);
            }
        }

        static final class OfInt<P_IN> extends SizedCollectorTask<P_IN, Integer, java8.util.stream.Sink.OfInt, OfInt<P_IN>> implements java8.util.stream.Sink.OfInt {
            /* renamed from: h */
            private final int[] f59252h;

            /* renamed from: a */
            /* synthetic */ SizedCollectorTask mo14028a(Spliterator spliterator, long j, long j2) {
                return m67817b(spliterator, j, j2);
            }

            OfInt(Spliterator<P_IN> spliterator, PipelineHelper<Integer> pipelineHelper, int[] iArr) {
                super(spliterator, pipelineHelper, iArr.length);
                this.f59252h = iArr;
            }

            OfInt(OfInt<P_IN> ofInt, Spliterator<P_IN> spliterator, long j, long j2) {
                super(ofInt, spliterator, j, j2, ofInt.f59252h.length);
                this.f59252h = ofInt.f59252h;
            }

            /* renamed from: b */
            OfInt<P_IN> m67817b(Spliterator<P_IN> spliterator, long j, long j2) {
                return new OfInt(this, spliterator, j, j2);
            }

            public void accept(int i) {
                if (this.f >= this.g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f));
                }
                int[] iArr = this.f59252h;
                int i2 = this.f;
                this.f = i2 + 1;
                iArr[i2] = i;
            }

            public void accept(Integer num) {
                OfInt.m59674a(this, num);
            }
        }

        static final class OfLong<P_IN> extends SizedCollectorTask<P_IN, Long, java8.util.stream.Sink.OfLong, OfLong<P_IN>> implements java8.util.stream.Sink.OfLong {
            /* renamed from: h */
            private final long[] f59253h;

            /* renamed from: a */
            /* synthetic */ SizedCollectorTask mo14028a(Spliterator spliterator, long j, long j2) {
                return m67819b(spliterator, j, j2);
            }

            OfLong(Spliterator<P_IN> spliterator, PipelineHelper<Long> pipelineHelper, long[] jArr) {
                super(spliterator, pipelineHelper, jArr.length);
                this.f59253h = jArr;
            }

            OfLong(OfLong<P_IN> ofLong, Spliterator<P_IN> spliterator, long j, long j2) {
                super(ofLong, spliterator, j, j2, ofLong.f59253h.length);
                this.f59253h = ofLong.f59253h;
            }

            /* renamed from: b */
            OfLong<P_IN> m67819b(Spliterator<P_IN> spliterator, long j, long j2) {
                return new OfLong(this, spliterator, j, j2);
            }

            public void accept(long j) {
                if (this.f >= this.g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f));
                }
                long[] jArr = this.f59253h;
                int i = this.f;
                this.f = i + 1;
                jArr[i] = j;
            }

            public void accept(Long l) {
                OfLong.m59675a(this, l);
            }
        }

        static final class OfRef<P_IN, P_OUT> extends SizedCollectorTask<P_IN, P_OUT, Sink<P_OUT>, OfRef<P_IN, P_OUT>> implements Sink<P_OUT> {
            /* renamed from: h */
            private final P_OUT[] f59254h;

            /* renamed from: a */
            /* synthetic */ SizedCollectorTask mo14028a(Spliterator spliterator, long j, long j2) {
                return m67821b(spliterator, j, j2);
            }

            OfRef(Spliterator<P_IN> spliterator, PipelineHelper<P_OUT> pipelineHelper, P_OUT[] p_outArr) {
                super(spliterator, pipelineHelper, p_outArr.length);
                this.f59254h = p_outArr;
            }

            OfRef(OfRef<P_IN, P_OUT> ofRef, Spliterator<P_IN> spliterator, long j, long j2) {
                super(ofRef, spliterator, j, j2, ofRef.f59254h.length);
                this.f59254h = ofRef.f59254h;
            }

            /* renamed from: b */
            OfRef<P_IN, P_OUT> m67821b(Spliterator<P_IN> spliterator, long j, long j2) {
                return new OfRef(this, spliterator, j, j2);
            }

            public void accept(P_OUT p_out) {
                if (this.f >= this.g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f));
                }
                Object[] objArr = this.f59254h;
                int i = this.f;
                this.f = i + 1;
                objArr[i] = p_out;
            }
        }

        /* renamed from: a */
        abstract K mo14028a(Spliterator<P_IN> spliterator, long j, long j2);

        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public void z_() {
        }

        SizedCollectorTask(Spliterator<P_IN> spliterator, PipelineHelper<P_OUT> pipelineHelper, int i) {
            this.f57682a = spliterator;
            this.f57683b = pipelineHelper;
            this.f57684c = AbstractTask.m66655b(spliterator.estimateSize());
            this.f57685d = null;
            this.f57686e = (long) i;
        }

        SizedCollectorTask(K k, Spliterator<P_IN> spliterator, long j, long j2, int i) {
            super(k);
            this.f57682a = spliterator;
            this.f57683b = k.f57683b;
            this.f57684c = k.f57684c;
            this.f57685d = j;
            this.f57686e = j2;
            if (j >= 0 && j2 >= 0) {
                if ((j + j2) - 1 < ((long) i)) {
                    return;
                }
            }
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}));
        }

        /* renamed from: a */
        public void mo13596a() {
            Spliterator spliterator = this.f57682a;
            Sink sink = this;
            while (spliterator.estimateSize() > sink.f57684c) {
                Spliterator trySplit = spliterator.trySplit();
                if (trySplit == null) {
                    break;
                }
                sink.mo12937a(1);
                long estimateSize = trySplit.estimateSize();
                sink.mo14028a(trySplit, sink.f57685d, estimateSize).m59284j();
                sink = sink.mo14028a(spliterator, sink.f57685d + estimateSize, sink.f57686e - estimateSize);
            }
            sink.f57683b.mo12965a(sink, spliterator);
            sink.mo12942e();
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j > this.f57686e) {
                throw new IllegalStateException("size passed to Sink.begin exceeds array length");
            }
            this.f57687f = (int) this.f57685d;
            this.f57688g = this.f57687f + ((int) this.f57686e);
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

    private static abstract class ToArrayTask<T, T_NODE extends Node<T>, K extends ToArrayTask<T, T_NODE, K>> extends CountedCompleter<Void> {
        /* renamed from: a */
        protected final T_NODE f57689a;
        /* renamed from: b */
        protected final int f57690b;

        private static class OfPrimitive<T, T_CONS, T_ARR, T_SPLITR extends java8.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>, T_NODE extends java8.util.stream.Node.OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends ToArrayTask<T, T_NODE, OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> {
            /* renamed from: c */
            private final T_ARR f59255c;

            /* renamed from: b */
            /* synthetic */ ToArrayTask mo14030b(int i, int i2) {
                return m67829c(i, i2);
            }

            private OfPrimitive(T_NODE t_node, T_ARR t_arr, int i) {
                super(t_node, i);
                this.f59255c = t_arr;
            }

            private OfPrimitive(OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE> ofPrimitive, T_NODE t_node, int i) {
                super(ofPrimitive, t_node, i);
                this.f59255c = ofPrimitive.f59255c;
            }

            /* renamed from: c */
            OfPrimitive<T, T_CONS, T_ARR, T_SPLITR, T_NODE> m67829c(int i, int i2) {
                return new OfPrimitive(this, ((java8.util.stream.Node.OfPrimitive) this.a).getChild(i), i2);
            }

            /* renamed from: o */
            void mo13726o() {
                ((java8.util.stream.Node.OfPrimitive) this.a).copyInto(this.f59255c, this.b);
            }
        }

        private static final class OfRef<T> extends ToArrayTask<T, Node<T>, OfRef<T>> {
            /* renamed from: c */
            private final T[] f59256c;

            /* renamed from: b */
            /* synthetic */ ToArrayTask mo14030b(int i, int i2) {
                return m67832c(i, i2);
            }

            private OfRef(Node<T> node, T[] tArr, int i) {
                super(node, i);
                this.f59256c = tArr;
            }

            private OfRef(OfRef<T> ofRef, Node<T> node, int i) {
                super(ofRef, node, i);
                this.f59256c = ofRef.f59256c;
            }

            /* renamed from: c */
            OfRef<T> m67832c(int i, int i2) {
                return new OfRef(this, this.a.a_(i), i2);
            }

            /* renamed from: o */
            void mo13726o() {
                this.a.mo13002a(this.f59256c, this.b);
            }
        }

        private static final class OfDouble extends OfPrimitive<Double, DoubleConsumer, double[], java8.util.Spliterator.OfDouble, java8.util.stream.Node.OfDouble> {
            private OfDouble(java8.util.stream.Node.OfDouble ofDouble, double[] dArr, int i) {
                super(ofDouble, dArr, i);
            }
        }

        private static final class OfInt extends OfPrimitive<Integer, IntConsumer, int[], java8.util.Spliterator.OfInt, java8.util.stream.Node.OfInt> {
            private OfInt(java8.util.stream.Node.OfInt ofInt, int[] iArr, int i) {
                super(ofInt, iArr, i);
            }
        }

        private static final class OfLong extends OfPrimitive<Long, LongConsumer, long[], java8.util.Spliterator.OfLong, java8.util.stream.Node.OfLong> {
            private OfLong(java8.util.stream.Node.OfLong ofLong, long[] jArr, int i) {
                super(ofLong, jArr, i);
            }
        }

        /* renamed from: b */
        abstract K mo14030b(int i, int i2);

        /* renamed from: o */
        abstract void mo13726o();

        ToArrayTask(T_NODE t_node, int i) {
            this.f57689a = t_node;
            this.f57690b = i;
        }

        ToArrayTask(K k, T_NODE t_node, int i) {
            super(k);
            this.f57689a = t_node;
            this.f57690b = i;
        }

        /* renamed from: a */
        public void mo13596a() {
            ToArrayTask toArrayTask = this;
            while (toArrayTask.f57689a.mo13000e() != 0) {
                toArrayTask.mo12937a(toArrayTask.f57689a.mo13000e() - 1);
                int i = 0;
                int i2 = 0;
                while (i < toArrayTask.f57689a.mo13000e() - 1) {
                    ToArrayTask b = toArrayTask.mo14030b(i, toArrayTask.f57690b + i2);
                    i2 = (int) (((long) i2) + b.f57689a.mo12999c());
                    b.m59284j();
                    i++;
                }
                toArrayTask = toArrayTask.mo14030b(i, toArrayTask.f57690b + i2);
            }
            toArrayTask.mo13726o();
            toArrayTask.mo12942e();
        }
    }

    private static class CollectorTask<P_IN, P_OUT, T_NODE extends Node<P_OUT>, T_BUILDER extends Builder<P_OUT>> extends AbstractTask<P_IN, P_OUT, T_NODE, CollectorTask<P_IN, P_OUT, T_NODE, T_BUILDER>> {
        /* renamed from: a */
        protected final PipelineHelper<P_OUT> f59242a;
        /* renamed from: b */
        protected final LongFunction<T_BUILDER> f59243b;
        /* renamed from: i */
        protected final BinaryOperator<T_NODE> f59244i;

        private static final class OfDouble<P_IN> extends CollectorTask<P_IN, Double, java8.util.stream.Node.OfDouble, java8.util.stream.Node.Builder.OfDouble> {
            /* renamed from: a */
            protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
                return super.m67755b(spliterator);
            }

            /* renamed from: t */
            protected /* synthetic */ Object mo14019t() {
                return super.mo13726o();
            }

            OfDouble(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator) {
                super(pipelineHelper, spliterator, Nodes$CollectorTask$OfDouble$$Lambda$1.m64042a(), Nodes$CollectorTask$OfDouble$$Lambda$2.m66761a());
            }
        }

        private static final class OfInt<P_IN> extends CollectorTask<P_IN, Integer, java8.util.stream.Node.OfInt, java8.util.stream.Node.Builder.OfInt> {
            /* renamed from: a */
            protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
                return super.m67755b(spliterator);
            }

            /* renamed from: t */
            protected /* synthetic */ Object mo14019t() {
                return super.mo13726o();
            }

            OfInt(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator) {
                super(pipelineHelper, spliterator, Nodes$CollectorTask$OfInt$$Lambda$1.m64043a(), Nodes$CollectorTask$OfInt$$Lambda$2.m66762a());
            }
        }

        private static final class OfLong<P_IN> extends CollectorTask<P_IN, Long, java8.util.stream.Node.OfLong, java8.util.stream.Node.Builder.OfLong> {
            /* renamed from: a */
            protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
                return super.m67755b(spliterator);
            }

            /* renamed from: t */
            protected /* synthetic */ Object mo14019t() {
                return super.mo13726o();
            }

            OfLong(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator) {
                super(pipelineHelper, spliterator, Nodes$CollectorTask$OfLong$$Lambda$1.m64044a(), Nodes$CollectorTask$OfLong$$Lambda$2.m66763a());
            }
        }

        private static final class OfRef<P_IN, P_OUT> extends CollectorTask<P_IN, P_OUT, Node<P_OUT>, Builder<P_OUT>> {
            /* renamed from: a */
            protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
                return super.m67755b(spliterator);
            }

            /* renamed from: t */
            protected /* synthetic */ Object mo14019t() {
                return super.mo13726o();
            }

            OfRef(PipelineHelper<P_OUT> pipelineHelper, IntFunction<P_OUT[]> intFunction, Spliterator<P_IN> spliterator) {
                super(pipelineHelper, spliterator, Nodes$CollectorTask$OfRef$$Lambda$1.m64045a(intFunction), Nodes$CollectorTask$OfRef$$Lambda$2.m66764a());
            }
        }

        /* renamed from: a */
        protected /* synthetic */ AbstractTask mo14018a(Spliterator spliterator) {
            return m67755b(spliterator);
        }

        /* renamed from: t */
        protected /* synthetic */ Object mo14019t() {
            return mo13726o();
        }

        CollectorTask(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, LongFunction<T_BUILDER> longFunction, BinaryOperator<T_NODE> binaryOperator) {
            super((PipelineHelper) pipelineHelper, (Spliterator) spliterator);
            this.f59242a = pipelineHelper;
            this.f59243b = longFunction;
            this.f59244i = binaryOperator;
        }

        CollectorTask(CollectorTask<P_IN, P_OUT, T_NODE, T_BUILDER> collectorTask, Spliterator<P_IN> spliterator) {
            super((AbstractTask) collectorTask, (Spliterator) spliterator);
            this.f59242a = collectorTask.f59242a;
            this.f59243b = collectorTask.f59243b;
            this.f59244i = collectorTask.f59244i;
        }

        /* renamed from: b */
        protected CollectorTask<P_IN, P_OUT, T_NODE, T_BUILDER> m67755b(Spliterator<P_IN> spliterator) {
            return new CollectorTask(this, spliterator);
        }

        /* renamed from: o */
        protected T_NODE mo13726o() {
            return ((Builder) this.f59242a.mo12965a((Builder) this.f59243b.apply(this.f59242a.mo12959a(this.e)), this.e)).build();
        }

        /* renamed from: a */
        public void mo13597a(CountedCompleter<?> countedCompleter) {
            if (!m66664u()) {
                mo14009b(this.f59244i.apply(((CollectorTask) this.g).mo13614p(), ((CollectorTask) this.h).mo13614p()));
            }
            super.mo13597a((CountedCompleter) countedCompleter);
        }
    }

    private static class DoubleArrayNode implements java8.util.stream.Node.OfDouble {
        /* renamed from: a */
        final double[] f59245a;
        /* renamed from: b */
        int f59246b;

        /* renamed from: a */
        public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
            return truncate(j, j2, intFunction);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13002a(Object[] objArr, int i) {
            copyInto((Double[]) objArr, i);
        }

        public /* synthetic */ Node a_(int i) {
            return m67772b(i);
        }

        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return m67771a(intFunction);
        }

        public /* synthetic */ Object asPrimitiveArray() {
            return m67776g();
        }

        public /* synthetic */ void copyInto(Object obj, int i) {
            m67769a((double[]) obj, i);
        }

        public /* synthetic */ void forEach(Object obj) {
            m67768a((DoubleConsumer) obj);
        }

        public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
            return m67772b(i);
        }

        public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
            return m67775f();
        }

        public /* synthetic */ Spliterator y_() {
            return m67775f();
        }

        DoubleArrayNode(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59245a = new double[((int) j)];
            this.f59246b = 0;
        }

        DoubleArrayNode(double[] dArr) {
            this.f59245a = dArr;
            this.f59246b = dArr.length;
        }

        public void forEach(Consumer<? super Double> consumer) {
            OfDouble.m59589a((java8.util.stream.Node.OfDouble) this, (Consumer) consumer);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        /* renamed from: b */
        public java8.util.stream.Node.OfDouble m67772b(int i) {
            return (java8.util.stream.Node.OfDouble) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
        }

        public java8.util.stream.Node.OfDouble truncate(long j, long j2, IntFunction<Double[]> intFunction) {
            return OfDouble.m59586a(this, j, j2, intFunction);
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfDouble m67775f() {
            return J8Arrays.m59082a(this.f59245a, 0, this.f59246b);
        }

        /* renamed from: g */
        public double[] m67776g() {
            if (this.f59245a.length == this.f59246b) {
                return this.f59245a;
            }
            return Arrays.copyOf(this.f59245a, this.f59246b);
        }

        /* renamed from: a */
        public Double[] m67771a(IntFunction<Double[]> intFunction) {
            return (Double[]) OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
        }

        public double[] newArray(int i) {
            return OfDouble.m59591a((java8.util.stream.Node.OfDouble) this, i);
        }

        public void copyInto(Double[] dArr, int i) {
            OfDouble.m59590a(this, dArr, i);
        }

        public StreamShape getShape() {
            return OfDouble.m59587a((java8.util.stream.Node.OfDouble) this);
        }

        /* renamed from: a */
        public void m67769a(double[] dArr, int i) {
            System.arraycopy(this.f59245a, 0, dArr, i, this.f59246b);
        }

        /* renamed from: c */
        public long mo12999c() {
            return (long) this.f59246b;
        }

        /* renamed from: a */
        public void m67768a(DoubleConsumer doubleConsumer) {
            for (int i = 0; i < this.f59246b; i++) {
                doubleConsumer.accept(this.f59245a[i]);
            }
        }

        public String toString() {
            return String.format("DoubleArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f59245a.length - this.f59246b), Arrays.toString(this.f59245a)});
        }
    }

    private static final class FixedNodeBuilder<T> extends ArrayNode<T> implements Builder<T> {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        FixedNodeBuilder(long j, IntFunction<T[]> intFunction) {
            super(j, intFunction);
        }

        public Node<T> build() {
            if (this.b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j != ((long) this.a.length)) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.a.length)}));
            } else {
                this.b = 0;
            }
        }

        public void accept(T t) {
            if (this.b < this.a.length) {
                Object[] objArr = this.a;
                int i = this.b;
                this.b = i + 1;
                objArr[i] = t;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.a.length)}));
        }

        public void z_() {
            if (this.b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
            }
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

        public String toString() {
            return String.format("FixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.a.length - this.b), Arrays.toString(this.a)});
        }
    }

    private static class IntArrayNode implements java8.util.stream.Node.OfInt {
        /* renamed from: a */
        final int[] f59247a;
        /* renamed from: b */
        int f59248b;

        /* renamed from: a */
        public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
            return truncate(j, j2, intFunction);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13002a(Object[] objArr, int i) {
            copyInto((Integer[]) objArr, i);
        }

        public /* synthetic */ Node a_(int i) {
            return m67799b(i);
        }

        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return m67798a(intFunction);
        }

        public /* synthetic */ Object asPrimitiveArray() {
            return m67803g();
        }

        public /* synthetic */ void copyInto(Object obj, int i) {
            m67796a((int[]) obj, i);
        }

        public /* synthetic */ void forEach(Object obj) {
            m67795a((IntConsumer) obj);
        }

        public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
            return m67799b(i);
        }

        public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
            return m67802f();
        }

        public /* synthetic */ Spliterator y_() {
            return m67802f();
        }

        IntArrayNode(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59247a = new int[((int) j)];
            this.f59248b = 0;
        }

        IntArrayNode(int[] iArr) {
            this.f59247a = iArr;
            this.f59248b = iArr.length;
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        public void forEach(Consumer<? super Integer> consumer) {
            OfInt.m59596a((java8.util.stream.Node.OfInt) this, (Consumer) consumer);
        }

        /* renamed from: b */
        public java8.util.stream.Node.OfInt m67799b(int i) {
            return (java8.util.stream.Node.OfInt) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfInt m67802f() {
            return J8Arrays.m59083a(this.f59247a, 0, this.f59248b);
        }

        public java8.util.stream.Node.OfInt truncate(long j, long j2, IntFunction<Integer[]> intFunction) {
            return OfInt.m59593a(this, j, j2, intFunction);
        }

        public void copyInto(Integer[] numArr, int i) {
            OfInt.m59597a(this, numArr, i);
        }

        /* renamed from: g */
        public int[] m67803g() {
            if (this.f59247a.length == this.f59248b) {
                return this.f59247a;
            }
            return Arrays.copyOf(this.f59247a, this.f59248b);
        }

        /* renamed from: a */
        public Integer[] m67798a(IntFunction<Integer[]> intFunction) {
            return (Integer[]) OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
        }

        public int[] newArray(int i) {
            return OfInt.m59598a((java8.util.stream.Node.OfInt) this, i);
        }

        public StreamShape getShape() {
            return OfInt.m59594a((java8.util.stream.Node.OfInt) this);
        }

        /* renamed from: a */
        public void m67796a(int[] iArr, int i) {
            System.arraycopy(this.f59247a, 0, iArr, i, this.f59248b);
        }

        /* renamed from: c */
        public long mo12999c() {
            return (long) this.f59248b;
        }

        /* renamed from: a */
        public void m67795a(IntConsumer intConsumer) {
            for (int i = 0; i < this.f59248b; i++) {
                intConsumer.accept(this.f59247a[i]);
            }
        }

        public String toString() {
            return String.format("IntArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f59247a.length - this.f59248b), Arrays.toString(this.f59247a)});
        }
    }

    private static class LongArrayNode implements java8.util.stream.Node.OfLong {
        /* renamed from: a */
        final long[] f59249a;
        /* renamed from: b */
        int f59250b;

        /* renamed from: a */
        public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
            return truncate(j, j2, intFunction);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13002a(Object[] objArr, int i) {
            copyInto((Long[]) objArr, i);
        }

        public /* synthetic */ Node a_(int i) {
            return m67809b(i);
        }

        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return m67808a(intFunction);
        }

        public /* synthetic */ Object asPrimitiveArray() {
            return m67813g();
        }

        public /* synthetic */ void copyInto(Object obj, int i) {
            m67806a((long[]) obj, i);
        }

        public /* synthetic */ void forEach(Object obj) {
            m67805a((LongConsumer) obj);
        }

        public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
            return m67809b(i);
        }

        public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
            return m67812f();
        }

        public /* synthetic */ Spliterator y_() {
            return m67812f();
        }

        LongArrayNode(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.f59249a = new long[((int) j)];
            this.f59250b = 0;
        }

        LongArrayNode(long[] jArr) {
            this.f59249a = jArr;
            this.f59250b = jArr.length;
        }

        public void forEach(Consumer<? super Long> consumer) {
            OfLong.m59603a((java8.util.stream.Node.OfLong) this, (Consumer) consumer);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        /* renamed from: b */
        public java8.util.stream.Node.OfLong m67809b(int i) {
            return (java8.util.stream.Node.OfLong) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
        }

        public void copyInto(Long[] lArr, int i) {
            OfLong.m59604a(this, lArr, i);
        }

        public java8.util.stream.Node.OfLong truncate(long j, long j2, IntFunction<Long[]> intFunction) {
            return OfLong.m59600a(this, j, j2, intFunction);
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfLong m67812f() {
            return J8Arrays.m59084a(this.f59249a, 0, this.f59250b);
        }

        /* renamed from: g */
        public long[] m67813g() {
            if (this.f59249a.length == this.f59250b) {
                return this.f59249a;
            }
            return Arrays.copyOf(this.f59249a, this.f59250b);
        }

        /* renamed from: a */
        public Long[] m67808a(IntFunction<Long[]> intFunction) {
            return (Long[]) OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
        }

        public long[] newArray(int i) {
            return OfLong.m59605a((java8.util.stream.Node.OfLong) this, i);
        }

        public StreamShape getShape() {
            return OfLong.m59601a((java8.util.stream.Node.OfLong) this);
        }

        /* renamed from: a */
        public void m67806a(long[] jArr, int i) {
            System.arraycopy(this.f59249a, 0, jArr, i, this.f59250b);
        }

        /* renamed from: c */
        public long mo12999c() {
            return (long) this.f59250b;
        }

        /* renamed from: a */
        public void m67805a(LongConsumer longConsumer) {
            for (int i = 0; i < this.f59250b; i++) {
                longConsumer.accept(this.f59249a[i]);
            }
        }

        public String toString() {
            return String.format("LongArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f59249a.length - this.f59250b), Arrays.toString(this.f59249a)});
        }
    }

    private static final class SpinedNodeBuilder<T> extends SpinedBuffer<T> implements Node<T>, Builder<T> {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public Node<T> build() {
            return this;
        }

        public void z_() {
        }

        SpinedNodeBuilder() {
        }

        public Spliterator<T> y_() {
            return mo14029f();
        }

        /* renamed from: f */
        public Spliterator<T> mo14029f() {
            return super.mo14029f();
        }

        public void forEach(Consumer<? super T> consumer) {
            super.forEach(consumer);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        public Node<T> a_(int i) {
            return Nodes.m59620a((Node) this, i);
        }

        /* renamed from: a */
        public Node<T> mo13001a(long j, long j2, IntFunction<T[]> intFunction) {
            return Nodes.m59621a((Node) this, j, j2, (IntFunction) intFunction);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            mo13005d();
            m64083b(j);
        }

        public void accept(T t) {
            super.accept(t);
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
        public void mo13002a(T[] tArr, int i) {
            super.mo13002a(tArr, i);
        }

        public T[] asArray(IntFunction<T[]> intFunction) {
            return super.asArray(intFunction);
        }
    }

    private static final class DoubleFixedNodeBuilder extends DoubleArrayNode implements java8.util.stream.Node.Builder.OfDouble {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        DoubleFixedNodeBuilder(long j) {
            super(j);
        }

        public java8.util.stream.Node.OfDouble build() {
            if (this.b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j != ((long) this.a.length)) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.a.length)}));
            } else {
                this.b = 0;
            }
        }

        public void accept(double d) {
            if (this.b < this.a.length) {
                double[] dArr = this.a;
                int i = this.b;
                this.b = i + 1;
                dArr[i] = d;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.a.length)}));
        }

        public void accept(Double d) {
            OfDouble.m59673a(this, d);
        }

        public void z_() {
            if (this.b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
            }
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public String toString() {
            return String.format("DoubleFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.a.length - this.b), Arrays.toString(this.a)});
        }
    }

    private static final class DoubleSpinedNodeBuilder extends OfDouble implements java8.util.stream.Node.Builder.OfDouble, java8.util.stream.Node.OfDouble {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public java8.util.stream.Node.OfDouble build() {
            return this;
        }

        public void z_() {
        }

        /* renamed from: a */
        public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
            return truncate(j, j2, intFunction);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13002a(Object[] objArr, int i) {
            copyInto((Double[]) objArr, i);
        }

        public /* synthetic */ Node a_(int i) {
            return m68338b(i);
        }

        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return m68337a(intFunction);
        }

        public /* synthetic */ Object asPrimitiveArray() {
            return m68342g();
        }

        public /* synthetic */ void copyInto(Object obj, int i) {
            m68335a((double[]) obj, i);
        }

        public /* synthetic */ void forEach(Object obj) {
            m68334a((DoubleConsumer) obj);
        }

        public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
            return m68338b(i);
        }

        public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
            return super.m66846h();
        }

        public /* synthetic */ Spliterator y_() {
            return super.m66846h();
        }

        DoubleSpinedNodeBuilder() {
        }

        public java8.util.stream.Node.OfDouble truncate(long j, long j2, IntFunction<Double[]> intFunction) {
            return OfDouble.m59586a(this, j, j2, intFunction);
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfDouble mo14147f() {
            return super.mo14147f();
        }

        /* renamed from: a */
        public void m68334a(DoubleConsumer doubleConsumer) {
            super.forEach(doubleConsumer);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            mo13005d();
            m64073c(j);
        }

        public void accept(double d) {
            super.accept(d);
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

        /* renamed from: a */
        public void m68335a(double[] dArr, int i) {
            super.copyInto(dArr, i);
        }

        public void copyInto(Double[] dArr, int i) {
            OfDouble.m59590a(this, dArr, i);
        }

        /* renamed from: g */
        public double[] m68342g() {
            return (double[]) super.asPrimitiveArray();
        }

        /* renamed from: a */
        public Double[] m68337a(IntFunction<Double[]> intFunction) {
            return (Double[]) OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        /* renamed from: b */
        public java8.util.stream.Node.OfDouble m68338b(int i) {
            return (java8.util.stream.Node.OfDouble) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
        }

        public StreamShape getShape() {
            return OfDouble.m59587a((java8.util.stream.Node.OfDouble) this);
        }
    }

    private static final class IntFixedNodeBuilder extends IntArrayNode implements java8.util.stream.Node.Builder.OfInt {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        IntFixedNodeBuilder(long j) {
            super(j);
        }

        public java8.util.stream.Node.OfInt build() {
            if (this.b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j != ((long) this.a.length)) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.a.length)}));
            } else {
                this.b = 0;
            }
        }

        public void accept(int i) {
            if (this.b < this.a.length) {
                int[] iArr = this.a;
                int i2 = this.b;
                this.b = i2 + 1;
                iArr[i2] = i;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.a.length)}));
        }

        public void accept(Integer num) {
            OfInt.m59674a(this, num);
        }

        public void z_() {
            if (this.b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
            }
        }

        public void accept(long j) {
            SinkDefaults.m59678a((Sink) this, j);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        public String toString() {
            return String.format("IntFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.a.length - this.b), Arrays.toString(this.a)});
        }
    }

    private static final class IntSpinedNodeBuilder extends OfInt implements java8.util.stream.Node.Builder.OfInt, java8.util.stream.Node.OfInt {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public java8.util.stream.Node.OfInt build() {
            return this;
        }

        public void z_() {
        }

        /* renamed from: a */
        public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
            return truncate(j, j2, intFunction);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13002a(Object[] objArr, int i) {
            copyInto((Integer[]) objArr, i);
        }

        public /* synthetic */ Node a_(int i) {
            return m68351b(i);
        }

        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return m68350a(intFunction);
        }

        public /* synthetic */ Object asPrimitiveArray() {
            return m68355g();
        }

        public /* synthetic */ void copyInto(Object obj, int i) {
            m68348a((int[]) obj, i);
        }

        public /* synthetic */ void forEach(Object obj) {
            m68347a((IntConsumer) obj);
        }

        public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
            return m68351b(i);
        }

        public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
            return super.m66855h();
        }

        public /* synthetic */ Spliterator y_() {
            return super.m66855h();
        }

        IntSpinedNodeBuilder() {
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfInt mo14149f() {
            return super.mo14149f();
        }

        /* renamed from: a */
        public void m68347a(IntConsumer intConsumer) {
            super.forEach(intConsumer);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            mo13005d();
            m64073c(j);
        }

        public void accept(int i) {
            super.accept(i);
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
        public void m68348a(int[] iArr, int i) throws IndexOutOfBoundsException {
            super.copyInto(iArr, i);
        }

        public void copyInto(Integer[] numArr, int i) {
            OfInt.m59597a(this, numArr, i);
        }

        public java8.util.stream.Node.OfInt truncate(long j, long j2, IntFunction<Integer[]> intFunction) {
            return OfInt.m59593a(this, j, j2, intFunction);
        }

        /* renamed from: g */
        public int[] m68355g() {
            return (int[]) super.asPrimitiveArray();
        }

        /* renamed from: a */
        public Integer[] m68350a(IntFunction<Integer[]> intFunction) {
            return (Integer[]) OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
        }

        public StreamShape getShape() {
            return OfInt.m59594a((java8.util.stream.Node.OfInt) this);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        /* renamed from: b */
        public java8.util.stream.Node.OfInt m68351b(int i) {
            return (java8.util.stream.Node.OfInt) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
        }
    }

    private static final class LongFixedNodeBuilder extends LongArrayNode implements java8.util.stream.Node.Builder.OfLong {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        LongFixedNodeBuilder(long j) {
            super(j);
        }

        public java8.util.stream.Node.OfLong build() {
            if (this.b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            if (j != ((long) this.a.length)) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.a.length)}));
            } else {
                this.b = 0;
            }
        }

        public void accept(long j) {
            if (this.b < this.a.length) {
                long[] jArr = this.a;
                int i = this.b;
                this.b = i + 1;
                jArr[i] = j;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.a.length)}));
        }

        public void accept(Long l) {
            OfLong.m59675a(this, l);
        }

        public void z_() {
            if (this.b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a.length)}));
            }
        }

        public void accept(int i) {
            SinkDefaults.m59677a((Sink) this, i);
        }

        public void accept(double d) {
            SinkDefaults.m59676a((Sink) this, d);
        }

        public String toString() {
            return String.format("LongFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.a.length - this.b), Arrays.toString(this.a)});
        }
    }

    private static final class LongSpinedNodeBuilder extends OfLong implements java8.util.stream.Node.Builder.OfLong, java8.util.stream.Node.OfLong {
        /* renamed from: b */
        public boolean mo13612b() {
            return false;
        }

        public java8.util.stream.Node.OfLong build() {
            return this;
        }

        public void z_() {
        }

        /* renamed from: a */
        public /* synthetic */ Node mo13001a(long j, long j2, IntFunction intFunction) {
            return truncate(j, j2, intFunction);
        }

        /* renamed from: a */
        public /* synthetic */ void mo13002a(Object[] objArr, int i) {
            copyInto((Long[]) objArr, i);
        }

        public /* synthetic */ Node a_(int i) {
            return m68364b(i);
        }

        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return m68363a(intFunction);
        }

        public /* synthetic */ Object asPrimitiveArray() {
            return m68368g();
        }

        public /* synthetic */ void copyInto(Object obj, int i) {
            m68361a((long[]) obj, i);
        }

        public /* synthetic */ void forEach(Object obj) {
            m68360a((LongConsumer) obj);
        }

        public /* synthetic */ java8.util.stream.Node.OfPrimitive getChild(int i) {
            return m68364b(i);
        }

        public /* synthetic */ java8.util.Spliterator.OfPrimitive spliterator() {
            return super.m66864h();
        }

        public /* synthetic */ Spliterator y_() {
            return super.m66864h();
        }

        LongSpinedNodeBuilder() {
        }

        public java8.util.stream.Node.OfLong truncate(long j, long j2, IntFunction<Long[]> intFunction) {
            return OfLong.m59600a(this, j, j2, intFunction);
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfLong mo14151f() {
            return super.mo14151f();
        }

        /* renamed from: a */
        public void m68360a(LongConsumer longConsumer) {
            super.forEach(longConsumer);
        }

        /* renamed from: a */
        public void mo13608a(long j) {
            mo13005d();
            m64073c(j);
        }

        public void accept(long j) {
            super.accept(j);
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
        public void m68361a(long[] jArr, int i) {
            super.copyInto(jArr, i);
        }

        public void copyInto(Long[] lArr, int i) {
            OfLong.m59604a(this, lArr, i);
        }

        /* renamed from: g */
        public long[] m68368g() {
            return (long[]) super.asPrimitiveArray();
        }

        /* renamed from: a */
        public Long[] m68363a(IntFunction<Long[]> intFunction) {
            return (Long[]) OfPrimitive.m59608a((java8.util.stream.Node.OfPrimitive) this, (IntFunction) intFunction);
        }

        public StreamShape getShape() {
            return OfLong.m59601a((java8.util.stream.Node.OfLong) this);
        }

        /* renamed from: e */
        public int mo13000e() {
            return Nodes.m59630b((Node) this);
        }

        /* renamed from: b */
        public java8.util.stream.Node.OfLong m68364b(int i) {
            return (java8.util.stream.Node.OfLong) OfPrimitive.m59607a((java8.util.stream.Node.OfPrimitive) this, i);
        }
    }

    /* renamed from: b */
    static <T> int m59630b(Node<T> node) {
        return 0;
    }

    /* renamed from: b */
    private static /* synthetic */ void m59634b(Object obj) {
    }

    private Nodes() {
        throw new Error("no instances");
    }

    /* renamed from: a */
    static <T> StreamShape m59627a(Node<T> node) {
        return StreamShape.REFERENCE;
    }

    /* renamed from: a */
    static <T> Node<T> m59620a(Node<T> node, int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    static <T> Node<T> m59621a(Node<T> node, long j, long j2, IntFunction<T[]> intFunction) {
        if (j == 0 && j2 == node.mo12999c()) {
            return node;
        }
        Spliterator y_ = node.y_();
        long j3 = j2 - j;
        intFunction = m59611a(j3, (IntFunction) intFunction);
        intFunction.mo13608a(j3);
        for (int i = 0; ((long) i) < j && y_.tryAdvance(Nodes$$Lambda$1.m64030a()); i++) {
        }
        if (j2 == node.mo12999c()) {
            y_.forEachRemaining(intFunction);
        } else {
            for (int i2 = 0; ((long) i2) < j3 && y_.tryAdvance(intFunction) != null; i2++) {
            }
        }
        intFunction.z_();
        return intFunction.build();
    }

    /* renamed from: a */
    static <T> IntFunction<T[]> m59609a() {
        return Nodes$$Lambda$2.m64031a();
    }

    /* renamed from: a */
    static <T> Node<T> m59624a(StreamShape streamShape) {
        switch (streamShape) {
            case REFERENCE:
                return f48897a;
            case INT_VALUE:
                return f48898b;
            case LONG_VALUE:
                return f48899c;
            case DOUBLE_VALUE:
                return f48900d;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown shape ");
                stringBuilder.append(streamShape);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static <T> Node<T> m59625a(StreamShape streamShape, Node<T> node, Node<T> node2) {
        switch (streamShape) {
            case REFERENCE:
                return new ConcNode(node, node2);
            case INT_VALUE:
                return new OfInt((java8.util.stream.Node.OfInt) node, (java8.util.stream.Node.OfInt) node2);
            case LONG_VALUE:
                return new OfLong((java8.util.stream.Node.OfLong) node, (java8.util.stream.Node.OfLong) node2);
            case DOUBLE_VALUE:
                return new OfDouble((java8.util.stream.Node.OfDouble) node, (java8.util.stream.Node.OfDouble) node2);
            default:
                node2 = new StringBuilder();
                node2.append("Unknown shape ");
                node2.append(streamShape);
                throw new IllegalStateException(node2.toString());
        }
    }

    /* renamed from: a */
    static <T> Node<T> m59626a(T[] tArr) {
        return new ArrayNode(tArr);
    }

    /* renamed from: a */
    static <T> Node<T> m59619a(Collection<T> collection) {
        return new CollectionNode(collection);
    }

    /* renamed from: a */
    static <T> Builder<T> m59611a(long j, IntFunction<T[]> intFunction) {
        if (j < 0 || j >= 2147483639) {
            return m59632b();
        }
        return new FixedNodeBuilder(j, intFunction);
    }

    /* renamed from: b */
    static <T> Builder<T> m59632b() {
        return new SpinedNodeBuilder();
    }

    /* renamed from: a */
    static java8.util.stream.Node.OfInt m59616a(int[] iArr) {
        return new IntArrayNode(iArr);
    }

    /* renamed from: a */
    static java8.util.stream.Node.Builder.OfInt m59610a(long j) {
        if (j < 0 || j >= 2147483639) {
            return m59637c();
        }
        return new IntFixedNodeBuilder(j);
    }

    /* renamed from: c */
    static java8.util.stream.Node.Builder.OfInt m59637c() {
        return new IntSpinedNodeBuilder();
    }

    /* renamed from: a */
    static java8.util.stream.Node.OfLong m59618a(long[] jArr) {
        return new LongArrayNode(jArr);
    }

    /* renamed from: b */
    static java8.util.stream.Node.Builder.OfLong m59631b(long j) {
        if (j < 0 || j >= 2147483639) {
            return m59639d();
        }
        return new LongFixedNodeBuilder(j);
    }

    /* renamed from: d */
    static java8.util.stream.Node.Builder.OfLong m59639d() {
        return new LongSpinedNodeBuilder();
    }

    /* renamed from: a */
    static java8.util.stream.Node.OfDouble m59613a(double[] dArr) {
        return new DoubleArrayNode(dArr);
    }

    /* renamed from: c */
    static java8.util.stream.Node.Builder.OfDouble m59636c(long j) {
        if (j < 0 || j >= 2147483639) {
            return m59640e();
        }
        return new DoubleFixedNodeBuilder(j);
    }

    /* renamed from: e */
    static java8.util.stream.Node.Builder.OfDouble m59640e() {
        return new DoubleSpinedNodeBuilder();
    }

    /* renamed from: a */
    public static <P_IN, P_OUT> Node<P_OUT> m59623a(PipelineHelper<P_OUT> pipelineHelper, Spliterator<P_IN> spliterator, boolean z, IntFunction<P_OUT[]> intFunction) {
        long a = pipelineHelper.mo12959a((Spliterator) spliterator);
        if (a < 0 || !spliterator.hasCharacteristics(16384)) {
            pipelineHelper = (Node) new OfRef(pipelineHelper, intFunction, spliterator).m59285k();
            if (z) {
                pipelineHelper = m59622a((Node) pipelineHelper, (IntFunction) intFunction);
            }
            return pipelineHelper;
        } else if (a >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) a);
            new OfRef(spliterator, pipelineHelper, objArr).m59285k();
            return m59626a(objArr);
        }
    }

    /* renamed from: a */
    public static <P_IN> java8.util.stream.Node.OfInt m59615a(PipelineHelper<Integer> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
        long a = pipelineHelper.mo12959a((Spliterator) spliterator);
        if (a < 0 || !spliterator.hasCharacteristics(16384)) {
            pipelineHelper = (java8.util.stream.Node.OfInt) new OfInt(pipelineHelper, spliterator).m59285k();
            if (z) {
                pipelineHelper = m59614a((java8.util.stream.Node.OfInt) pipelineHelper);
            }
            return pipelineHelper;
        } else if (a >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            int[] iArr = new int[((int) a)];
            new OfInt(spliterator, pipelineHelper, iArr).m59285k();
            return m59616a(iArr);
        }
    }

    /* renamed from: b */
    public static <P_IN> java8.util.stream.Node.OfLong m59633b(PipelineHelper<Long> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
        long a = pipelineHelper.mo12959a((Spliterator) spliterator);
        if (a < 0 || !spliterator.hasCharacteristics(16384)) {
            pipelineHelper = (java8.util.stream.Node.OfLong) new OfLong(pipelineHelper, spliterator).m59285k();
            if (z) {
                pipelineHelper = m59617a((java8.util.stream.Node.OfLong) pipelineHelper);
            }
            return pipelineHelper;
        } else if (a >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            long[] jArr = new long[((int) a)];
            new OfLong(spliterator, pipelineHelper, jArr).m59285k();
            return m59618a(jArr);
        }
    }

    /* renamed from: c */
    public static <P_IN> java8.util.stream.Node.OfDouble m59638c(PipelineHelper<Double> pipelineHelper, Spliterator<P_IN> spliterator, boolean z) {
        long a = pipelineHelper.mo12959a((Spliterator) spliterator);
        if (a < 0 || !spliterator.hasCharacteristics(16384)) {
            pipelineHelper = (java8.util.stream.Node.OfDouble) new OfDouble(pipelineHelper, spliterator).m59285k();
            if (z) {
                pipelineHelper = m59612a((java8.util.stream.Node.OfDouble) pipelineHelper);
            }
            return pipelineHelper;
        } else if (a >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            double[] dArr = new double[((int) a)];
            new OfDouble(spliterator, pipelineHelper, dArr).m59285k();
            return m59613a(dArr);
        }
    }

    /* renamed from: a */
    public static <T> Node<T> m59622a(Node<T> node, IntFunction<T[]> intFunction) {
        if (node.mo13000e() <= 0) {
            return node;
        }
        long c = node.mo12999c();
        if (c >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) c);
        new OfRef(node, objArr, 0).m59285k();
        return m59626a(objArr);
    }

    /* renamed from: a */
    public static java8.util.stream.Node.OfInt m59614a(java8.util.stream.Node.OfInt ofInt) {
        if (ofInt.mo13000e() <= 0) {
            return ofInt;
        }
        long c = ofInt.mo12999c();
        if (c >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[((int) c)];
        new OfInt(ofInt, iArr, 0).m59285k();
        return m59616a(iArr);
    }

    /* renamed from: a */
    public static java8.util.stream.Node.OfLong m59617a(java8.util.stream.Node.OfLong ofLong) {
        if (ofLong.mo13000e() <= 0) {
            return ofLong;
        }
        long c = ofLong.mo12999c();
        if (c >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[((int) c)];
        new OfLong(ofLong, jArr, 0).m59285k();
        return m59618a(jArr);
    }

    /* renamed from: a */
    public static java8.util.stream.Node.OfDouble m59612a(java8.util.stream.Node.OfDouble ofDouble) {
        if (ofDouble.mo13000e() <= 0) {
            return ofDouble;
        }
        long c = ofDouble.mo12999c();
        if (c >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[((int) c)];
        new OfDouble(ofDouble, dArr, 0).m59285k();
        return m59613a(dArr);
    }
}
