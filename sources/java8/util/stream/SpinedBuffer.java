package java8.util.stream;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java8.util.J8Arrays;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterators;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.IntFunction;
import java8.util.function.LongConsumer;

class SpinedBuffer<E> extends AbstractSpinedBuffer implements Consumer<E> {
    /* renamed from: e */
    protected E[] f54646e = new Object[(1 << this.a)];
    /* renamed from: f */
    protected E[][] f54647f;

    /* renamed from: java8.util.stream.SpinedBuffer$1Splitr */
    class AnonymousClass1Splitr implements Spliterator<E> {
        /* renamed from: a */
        int f54638a;
        /* renamed from: b */
        final int f54639b;
        /* renamed from: c */
        int f54640c;
        /* renamed from: d */
        final int f54641d;
        /* renamed from: e */
        E[] f54642e;
        /* renamed from: f */
        final /* synthetic */ SpinedBuffer f54643f;

        public int characteristics() {
            return 16464;
        }

        AnonymousClass1Splitr(SpinedBuffer spinedBuffer, int i, int i2, int i3, int i4) {
            this.f54643f = spinedBuffer;
            this.f54638a = i;
            this.f54639b = i2;
            this.f54640c = i3;
            this.f54641d = i4;
            this.f54642e = spinedBuffer.f54647f == 0 ? spinedBuffer.f54646e : spinedBuffer.f54647f[i];
        }

        public long estimateSize() {
            return this.f54638a == this.f54639b ? ((long) this.f54641d) - ((long) this.f54640c) : ((this.f54643f.d[this.f54639b] + ((long) this.f54641d)) - this.f54643f.d[this.f54638a]) - ((long) this.f54640c);
        }

        public long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public Comparator<? super E> getComparator() {
            return Spliterators.m59174b((Spliterator) this);
        }

        public boolean tryAdvance(Consumer<? super E> consumer) {
            Objects.m59115b(consumer);
            if (this.f54638a >= this.f54639b) {
                if (this.f54638a != this.f54639b || this.f54640c >= this.f54641d) {
                    return false;
                }
            }
            Object[] objArr = this.f54642e;
            int i = this.f54640c;
            this.f54640c = i + 1;
            consumer.accept(objArr[i]);
            if (this.f54640c == this.f54642e.length) {
                this.f54640c = 0;
                this.f54638a += 1;
                if (this.f54643f.f54647f != null && this.f54638a <= this.f54639b) {
                    this.f54642e = this.f54643f.f54647f[this.f54638a];
                }
            }
            return true;
        }

        public void forEachRemaining(Consumer<? super E> consumer) {
            Objects.m59115b(consumer);
            if (this.f54638a < this.f54639b || (this.f54638a == this.f54639b && this.f54640c < this.f54641d)) {
                int i = this.f54640c;
                for (int i2 = this.f54638a; i2 < this.f54639b; i2++) {
                    Object[] objArr = this.f54643f.f54647f[i2];
                    while (i < objArr.length) {
                        consumer.accept(objArr[i]);
                        i++;
                    }
                    i = 0;
                }
                Object[] objArr2 = this.f54638a == this.f54639b ? this.f54642e : this.f54643f.f54647f[this.f54639b];
                int i3 = this.f54641d;
                while (i < i3) {
                    consumer.accept(objArr2[i]);
                    i++;
                }
                this.f54638a = this.f54639b;
                this.f54640c = this.f54641d;
            }
        }

        public Spliterator<E> trySplit() {
            if (this.f54638a < this.f54639b) {
                Spliterator anonymousClass1Splitr = new AnonymousClass1Splitr(this.f54643f, this.f54638a, this.f54639b - 1, this.f54640c, this.f54643f.f54647f[this.f54639b - 1].length);
                this.f54638a = this.f54639b;
                this.f54640c = 0;
                this.f54642e = this.f54643f.f54647f[this.f54638a];
                return anonymousClass1Splitr;
            } else if (this.f54638a != this.f54639b) {
                return null;
            } else {
                int i = (this.f54641d - this.f54640c) / 2;
                if (i == 0) {
                    return null;
                }
                Spliterator<E> a = J8Arrays.m59085a(this.f54642e, this.f54640c, this.f54640c + i);
                this.f54640c += i;
                return a;
            }
        }
    }

    static abstract class OfPrimitive<E, T_ARR, T_CONS> extends AbstractSpinedBuffer {
        /* renamed from: e */
        T_ARR f54644e = newArray(1 << this.a);
        /* renamed from: f */
        T_ARR[] f54645f;

        abstract class BaseSpliterator<T_SPLITR extends java8.util.Spliterator.OfPrimitive<E, T_CONS, T_SPLITR>> implements java8.util.Spliterator.OfPrimitive<E, T_CONS, T_SPLITR> {
            /* renamed from: b */
            int f57731b;
            /* renamed from: c */
            final int f57732c;
            /* renamed from: d */
            int f57733d;
            /* renamed from: e */
            final int f57734e;
            /* renamed from: f */
            T_ARR f57735f;
            /* renamed from: g */
            final /* synthetic */ OfPrimitive f57736g;

            /* renamed from: a */
            abstract T_SPLITR mo14031a(T_ARR t_arr, int i, int i2);

            /* renamed from: a */
            abstract void mo14032a(T_ARR t_arr, int i, T_CONS t_cons);

            /* renamed from: b */
            abstract T_SPLITR mo14033b(int i, int i2, int i3, int i4);

            public int characteristics() {
                return 16464;
            }

            BaseSpliterator(OfPrimitive ofPrimitive, int i, int i2, int i3, int i4) {
                this.f57736g = ofPrimitive;
                this.f57731b = i;
                this.f57732c = i2;
                this.f57733d = i3;
                this.f57734e = i4;
                this.f57735f = ofPrimitive.f54645f == 0 ? ofPrimitive.f54644e : ofPrimitive.f54645f[i];
            }

            public long estimateSize() {
                return this.f57731b == this.f57732c ? ((long) this.f57734e) - ((long) this.f57733d) : ((this.f57736g.d[this.f57732c] + ((long) this.f57734e)) - this.f57736g.d[this.f57731b]) - ((long) this.f57733d);
            }

            public boolean tryAdvance(T_CONS t_cons) {
                Objects.m59115b(t_cons);
                if (this.f57731b >= this.f57732c) {
                    if (this.f57731b != this.f57732c || this.f57733d >= this.f57734e) {
                        return false;
                    }
                }
                Object obj = this.f57735f;
                int i = this.f57733d;
                this.f57733d = i + 1;
                mo14032a(obj, i, (Object) t_cons);
                if (this.f57733d == this.f57736g.mo13762a(this.f57735f)) {
                    this.f57733d = 0;
                    this.f57731b += 1;
                    if (this.f57736g.f54645f != null && this.f57731b <= this.f57732c) {
                        this.f57735f = this.f57736g.f54645f[this.f57731b];
                    }
                }
                return true;
            }

            public void forEachRemaining(T_CONS t_cons) {
                Objects.m59115b(t_cons);
                if (this.f57731b < this.f57732c || (this.f57731b == this.f57732c && this.f57733d < this.f57734e)) {
                    int i = this.f57733d;
                    for (int i2 = this.f57731b; i2 < this.f57732c; i2++) {
                        Object obj = this.f57736g.f54645f[i2];
                        this.f57736g.mo13763a(obj, i, this.f57736g.mo13762a(obj), t_cons);
                        i = 0;
                    }
                    this.f57736g.mo13763a(this.f57731b == this.f57732c ? this.f57735f : this.f57736g.f54645f[this.f57732c], i, this.f57734e, t_cons);
                    this.f57731b = this.f57732c;
                    this.f57733d = this.f57734e;
                }
            }

            public T_SPLITR trySplit() {
                if (this.f57731b < this.f57732c) {
                    T_SPLITR b = mo14033b(this.f57731b, this.f57732c - 1, this.f57733d, this.f57736g.mo13762a(this.f57736g.f54645f[this.f57732c - 1]));
                    this.f57731b = this.f57732c;
                    this.f57733d = 0;
                    this.f57735f = this.f57736g.f54645f[this.f57731b];
                    return b;
                } else if (this.f57731b != this.f57732c) {
                    return null;
                } else {
                    int i = (this.f57734e - this.f57733d) / 2;
                    if (i == 0) {
                        return null;
                    }
                    T_SPLITR a = mo14031a(this.f57735f, this.f57733d, i);
                    this.f57733d += i;
                    return a;
                }
            }
        }

        /* renamed from: a */
        protected abstract int mo13762a(T_ARR t_arr);

        /* renamed from: a */
        protected abstract void mo13763a(T_ARR t_arr, int i, int i2, T_CONS t_cons);

        /* renamed from: d */
        protected abstract T_ARR[] mo13764d(int i);

        public abstract T_ARR newArray(int i);

        OfPrimitive(int i) {
            super(i);
        }

        OfPrimitive() {
        }

        /* renamed from: i */
        protected long m64077i() {
            if (this.c == 0) {
                return (long) mo13762a(this.f54644e);
            }
            return this.d[this.c] + ((long) mo13762a(this.f54645f[this.c]));
        }

        /* renamed from: a */
        private void m64070a() {
            if (this.f54645f == null) {
                this.f54645f = mo13764d(8);
                this.d = new long[8];
                this.f54645f[0] = this.f54644e;
            }
        }

        /* renamed from: c */
        protected final void m64073c(long j) {
            long i = m64077i();
            if (j > i) {
                m64070a();
                int i2 = this.c + 1;
                while (j > i) {
                    int length;
                    if (i2 >= this.f54645f.length) {
                        length = this.f54645f.length * 2;
                        this.f54645f = Arrays.copyOf(this.f54645f, length);
                        this.d = Arrays.copyOf(this.d, length);
                    }
                    length = m59409a(i2);
                    this.f54645f[i2] = newArray(length);
                    int i3 = i2 - 1;
                    this.d[i2] = this.d[i3] + ((long) mo13762a(this.f54645f[i3]));
                    i2++;
                    i += (long) length;
                }
            }
        }

        /* renamed from: j */
        protected void m64078j() {
            m64073c(m64077i() + 1);
        }

        /* renamed from: d */
        protected int m64074d(long j) {
            int i = 0;
            if (this.c == 0) {
                if (j < ((long) this.b)) {
                    return 0;
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else if (j >= m59410c()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                while (i <= this.c) {
                    if (j < this.d[i] + ((long) mo13762a(this.f54645f[i]))) {
                        return i;
                    }
                    i++;
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
        }

        public void copyInto(T_ARR t_arr, int i) {
            long j = (long) i;
            long c = j + m59410c();
            if (c <= ((long) mo13762a(t_arr))) {
                if (c >= j) {
                    if (this.c == 0) {
                        System.arraycopy(this.f54644e, 0, t_arr, i, this.b);
                        return;
                    }
                    int i2 = i;
                    for (i = 0; i < this.c; i++) {
                        System.arraycopy(this.f54645f[i], 0, t_arr, i2, mo13762a(this.f54645f[i]));
                        i2 += mo13762a(this.f54645f[i]);
                    }
                    if (this.b > 0) {
                        System.arraycopy(this.f54644e, 0, t_arr, i2, this.b);
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException("does not fit");
        }

        public T_ARR asPrimitiveArray() {
            long c = m59410c();
            if (c >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            T_ARR newArray = newArray((int) c);
            copyInto(newArray, 0);
            return newArray;
        }

        /* renamed from: k */
        protected void m64079k() {
            if (this.b == mo13762a(this.f54644e)) {
                m64070a();
                if (this.c + 1 >= this.f54645f.length || this.f54645f[this.c + 1] == null) {
                    m64078j();
                }
                this.b = 0;
                this.c++;
                this.f54644e = this.f54645f[this.c];
            }
        }

        /* renamed from: d */
        public void mo13005d() {
            if (this.f54645f != null) {
                this.f54644e = this.f54645f[0];
                this.f54645f = null;
                this.d = null;
            }
            this.b = 0;
            this.c = 0;
        }

        public void forEach(T_CONS t_cons) {
            for (int i = 0; i < this.c; i++) {
                mo13763a(this.f54645f[i], 0, mo13762a(this.f54645f[i]), t_cons);
            }
            mo13763a(this.f54644e, 0, this.b, t_cons);
        }
    }

    static class OfDouble extends OfPrimitive<Double, double[], DoubleConsumer> implements DoubleConsumer {
        /* renamed from: d */
        protected /* synthetic */ Object[] mo13764d(int i) {
            return m66843c(i);
        }

        OfDouble() {
        }

        OfDouble(int i) {
            super(i);
        }

        /* renamed from: h */
        public java8.util.Spliterator.OfDouble m66846h() {
            return mo14147f();
        }

        public void forEach(Consumer<? super Double> consumer) {
            if (consumer instanceof DoubleConsumer) {
                forEach((DoubleConsumer) consumer);
            } else {
                m66846h().forEachRemaining(consumer);
            }
        }

        /* renamed from: c */
        protected double[][] m66843c(int i) {
            return new double[i][];
        }

        public double[] newArray(int i) {
            return new double[i];
        }

        /* renamed from: a */
        protected int m66839a(double[] dArr) {
            return dArr.length;
        }

        /* renamed from: a */
        protected void m66841a(double[] dArr, int i, int i2, DoubleConsumer doubleConsumer) {
            while (i < i2) {
                doubleConsumer.accept(dArr[i]);
                i++;
            }
        }

        public void accept(double d) {
            m64079k();
            double[] dArr = (double[]) this.e;
            int i = this.b;
            this.b = i + 1;
            dArr[i] = d;
        }

        /* renamed from: b */
        public double m66842b(long j) {
            int d = m64074d(j);
            if (this.c == 0 && d == 0) {
                return ((double[]) this.e)[(int) j];
            }
            return ((double[][]) this.f)[d][(int) (j - this.d[d])];
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfDouble mo14147f() {
            return new java8.util.Spliterator.OfDouble(this, 0, this.c, 0, this.b) {
                /* renamed from: a */
                final /* synthetic */ OfDouble f59279a;

                /* renamed from: b */
                /* synthetic */ java8.util.Spliterator.OfPrimitive mo14033b(int i, int i2, int i3, int i4) {
                    return m67861a(i, i2, i3, i4);
                }

                public /* bridge */ /* synthetic */ java8.util.Spliterator.OfDouble trySplit() {
                    return (java8.util.Spliterator.OfDouble) super.trySplit();
                }

                /* renamed from: a */
                AnonymousClass1Splitr m67861a(int i, int i2, int i3, int i4) {
                    return /* anonymous class already generated */;
                }

                /* renamed from: a */
                void m67863a(double[] dArr, int i, DoubleConsumer doubleConsumer) {
                    doubleConsumer.accept(dArr[i]);
                }

                /* renamed from: a */
                java8.util.Spliterator.OfDouble m67859a(double[] dArr, int i, int i2) {
                    return J8Arrays.m59082a(dArr, i, i2 + i);
                }

                public long getExactSizeIfKnown() {
                    return Spliterators.m59152a((Spliterator) this);
                }

                public boolean hasCharacteristics(int i) {
                    return Spliterators.m59173a((Spliterator) this, i);
                }

                public Comparator<? super Double> getComparator() {
                    return Spliterators.m59174b((Spliterator) this);
                }

                public boolean tryAdvance(Consumer<? super Double> consumer) {
                    return java8.util.Spliterators.OfDouble.m59144a((java8.util.Spliterator.OfDouble) this, (Consumer) consumer);
                }

                public void forEachRemaining(Consumer<? super Double> consumer) {
                    java8.util.Spliterators.OfDouble.m59145b(this, consumer);
                }
            };
        }

        public String toString() {
            double[] dArr = (double[]) asPrimitiveArray();
            if (dArr.length < Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr)});
            }
            double[] copyOf = Arrays.copyOf(dArr, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(copyOf)});
        }
    }

    static class OfInt extends OfPrimitive<Integer, int[], IntConsumer> implements IntConsumer {
        /* renamed from: d */
        protected /* synthetic */ Object[] mo13764d(int i) {
            return m66852c(i);
        }

        OfInt() {
        }

        OfInt(int i) {
            super(i);
        }

        /* renamed from: h */
        public java8.util.Spliterator.OfInt m66855h() {
            return mo14149f();
        }

        public void forEach(Consumer<? super Integer> consumer) {
            if (consumer instanceof IntConsumer) {
                forEach((IntConsumer) consumer);
            } else {
                m66855h().forEachRemaining(consumer);
            }
        }

        /* renamed from: c */
        protected int[][] m66852c(int i) {
            return new int[i][];
        }

        public int[] newArray(int i) {
            return new int[i];
        }

        /* renamed from: a */
        protected int m66848a(int[] iArr) {
            return iArr.length;
        }

        /* renamed from: a */
        protected void m66850a(int[] iArr, int i, int i2, IntConsumer intConsumer) {
            while (i < i2) {
                intConsumer.accept(iArr[i]);
                i++;
            }
        }

        public void accept(int i) {
            m64079k();
            int[] iArr = (int[]) this.e;
            int i2 = this.b;
            this.b = i2 + 1;
            iArr[i2] = i;
        }

        /* renamed from: b */
        public int m66851b(long j) {
            int d = m64074d(j);
            if (this.c == 0 && d == 0) {
                return ((int[]) this.e)[(int) j];
            }
            return ((int[][]) this.f)[d][(int) (j - this.d[d])];
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfInt mo14149f() {
            return new java8.util.Spliterator.OfInt(this, 0, this.c, 0, this.b) {
                /* renamed from: a */
                final /* synthetic */ OfInt f59280a;

                /* renamed from: b */
                /* synthetic */ java8.util.Spliterator.OfPrimitive mo14033b(int i, int i2, int i3, int i4) {
                    return m67867a(i, i2, i3, i4);
                }

                public /* bridge */ /* synthetic */ java8.util.Spliterator.OfInt trySplit() {
                    return (java8.util.Spliterator.OfInt) super.trySplit();
                }

                /* renamed from: a */
                AnonymousClass1Splitr m67867a(int i, int i2, int i3, int i4) {
                    return /* anonymous class already generated */;
                }

                /* renamed from: a */
                void m67869a(int[] iArr, int i, IntConsumer intConsumer) {
                    intConsumer.accept(iArr[i]);
                }

                /* renamed from: a */
                java8.util.Spliterator.OfInt m67865a(int[] iArr, int i, int i2) {
                    return J8Arrays.m59083a(iArr, i, i2 + i);
                }

                public long getExactSizeIfKnown() {
                    return Spliterators.m59152a((Spliterator) this);
                }

                public boolean hasCharacteristics(int i) {
                    return Spliterators.m59173a((Spliterator) this, i);
                }

                public Comparator<? super Integer> getComparator() {
                    return Spliterators.m59174b((Spliterator) this);
                }

                public boolean tryAdvance(Consumer<? super Integer> consumer) {
                    return java8.util.Spliterators.OfInt.m59147a((java8.util.Spliterator.OfInt) this, (Consumer) consumer);
                }

                public void forEachRemaining(Consumer<? super Integer> consumer) {
                    java8.util.Spliterators.OfInt.m59148b(this, consumer);
                }
            };
        }

        public String toString() {
            int[] iArr = (int[]) asPrimitiveArray();
            if (iArr.length < Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr)});
            }
            int[] copyOf = Arrays.copyOf(iArr, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(copyOf)});
        }
    }

    static class OfLong extends OfPrimitive<Long, long[], LongConsumer> implements LongConsumer {
        /* renamed from: d */
        protected /* synthetic */ Object[] mo13764d(int i) {
            return m66861c(i);
        }

        OfLong() {
        }

        OfLong(int i) {
            super(i);
        }

        /* renamed from: h */
        public java8.util.Spliterator.OfLong m66864h() {
            return mo14151f();
        }

        public void forEach(Consumer<? super Long> consumer) {
            if (consumer instanceof LongConsumer) {
                forEach((LongConsumer) consumer);
            } else {
                m66864h().forEachRemaining(consumer);
            }
        }

        /* renamed from: c */
        protected long[][] m66861c(int i) {
            return new long[i][];
        }

        public long[] newArray(int i) {
            return new long[i];
        }

        /* renamed from: a */
        protected int m66857a(long[] jArr) {
            return jArr.length;
        }

        /* renamed from: a */
        protected void m66859a(long[] jArr, int i, int i2, LongConsumer longConsumer) {
            while (i < i2) {
                longConsumer.accept(jArr[i]);
                i++;
            }
        }

        public void accept(long j) {
            m64079k();
            long[] jArr = (long[]) this.e;
            int i = this.b;
            this.b = i + 1;
            jArr[i] = j;
        }

        /* renamed from: b */
        public long m66860b(long j) {
            int d = m64074d(j);
            if (this.c == 0 && d == 0) {
                return ((long[]) this.e)[(int) j];
            }
            return ((long[][]) this.f)[d][(int) (j - this.d[d])];
        }

        /* renamed from: f */
        public java8.util.Spliterator.OfLong mo14151f() {
            return new java8.util.Spliterator.OfLong(this, 0, this.c, 0, this.b) {
                /* renamed from: a */
                final /* synthetic */ OfLong f59281a;

                /* renamed from: b */
                /* synthetic */ java8.util.Spliterator.OfPrimitive mo14033b(int i, int i2, int i3, int i4) {
                    return m67873a(i, i2, i3, i4);
                }

                public /* bridge */ /* synthetic */ java8.util.Spliterator.OfLong trySplit() {
                    return (java8.util.Spliterator.OfLong) super.trySplit();
                }

                /* renamed from: a */
                AnonymousClass1Splitr m67873a(int i, int i2, int i3, int i4) {
                    return /* anonymous class already generated */;
                }

                /* renamed from: a */
                void m67875a(long[] jArr, int i, LongConsumer longConsumer) {
                    longConsumer.accept(jArr[i]);
                }

                /* renamed from: a */
                java8.util.Spliterator.OfLong m67871a(long[] jArr, int i, int i2) {
                    return J8Arrays.m59084a(jArr, i, i2 + i);
                }

                public long getExactSizeIfKnown() {
                    return Spliterators.m59152a((Spliterator) this);
                }

                public boolean hasCharacteristics(int i) {
                    return Spliterators.m59173a((Spliterator) this, i);
                }

                public Comparator<? super Long> getComparator() {
                    return Spliterators.m59174b((Spliterator) this);
                }

                public boolean tryAdvance(Consumer<? super Long> consumer) {
                    return java8.util.Spliterators.OfLong.m59150a((java8.util.Spliterator.OfLong) this, (Consumer) consumer);
                }

                public void forEachRemaining(Consumer<? super Long> consumer) {
                    java8.util.Spliterators.OfLong.m59151b(this, consumer);
                }
            };
        }

        public String toString() {
            long[] jArr = (long[]) asPrimitiveArray();
            if (jArr.length < Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr)});
            }
            long[] copyOf = Arrays.copyOf(jArr, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(copyOf)});
        }
    }

    SpinedBuffer() {
    }

    /* renamed from: g */
    protected long m64087g() {
        return this.c == 0 ? (long) this.f54646e.length : this.d[this.c] + ((long) this.f54647f[this.c].length);
    }

    /* renamed from: a */
    private void m64080a() {
        if (this.f54647f == null) {
            this.f54647f = new Object[8][];
            this.d = new long[8];
            this.f54647f[0] = this.f54646e;
        }
    }

    /* renamed from: b */
    protected final void m64083b(long j) {
        long g = m64087g();
        if (j > g) {
            m64080a();
            int i = this.c + 1;
            while (j > g) {
                int length;
                if (i >= this.f54647f.length) {
                    length = this.f54647f.length * 2;
                    this.f54647f = (Object[][]) Arrays.copyOf(this.f54647f, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                length = m59409a(i);
                this.f54647f[i] = new Object[length];
                int i2 = i - 1;
                this.d[i] = this.d[i2] + ((long) this.f54647f[i2].length);
                i++;
                g += (long) length;
            }
        }
    }

    /* renamed from: h */
    protected void m64088h() {
        m64083b(m64087g() + 1);
    }

    /* renamed from: c */
    public E m64084c(long j) {
        if (this.c == 0) {
            if (j < ((long) this.b)) {
                return this.f54646e[(int) j];
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j >= m59410c()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            for (int i = 0; i <= this.c; i++) {
                if (j < this.d[i] + ((long) this.f54647f[i].length)) {
                    return this.f54647f[i][(int) (j - this.d[i])];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    /* renamed from: a */
    public void mo13002a(E[] eArr, int i) {
        long j = (long) i;
        long c = j + m59410c();
        if (c <= ((long) eArr.length)) {
            if (c >= j) {
                if (this.c == 0) {
                    System.arraycopy(this.f54646e, 0, eArr, i, this.b);
                    return;
                }
                int i2 = i;
                for (i = 0; i < this.c; i++) {
                    System.arraycopy(this.f54647f[i], 0, eArr, i2, this.f54647f[i].length);
                    i2 += this.f54647f[i].length;
                }
                if (this.b > 0) {
                    System.arraycopy(this.f54646e, 0, eArr, i2, this.b);
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    public E[] asArray(IntFunction<E[]> intFunction) {
        long c = m59410c();
        if (c >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) c);
        mo13002a(objArr, 0);
        return objArr;
    }

    /* renamed from: d */
    public void mo13005d() {
        int i;
        if (this.f54647f != null) {
            this.f54646e = this.f54647f[0];
            for (i = 0; i < this.f54646e.length; i++) {
                this.f54646e[i] = null;
            }
            this.f54647f = (Object[][]) null;
            this.d = null;
        } else {
            for (i = 0; i < this.b; i++) {
                this.f54646e[i] = null;
            }
        }
        this.b = 0;
        this.c = 0;
    }

    public void forEach(Consumer<? super E> consumer) {
        for (int i = 0; i < this.c; i++) {
            for (Object accept : this.f54647f[i]) {
                consumer.accept(accept);
            }
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            consumer.accept(this.f54646e[i2]);
        }
    }

    /* renamed from: a */
    private void m64081a(Consumer<? super E> consumer) {
        forEach(consumer);
    }

    public void accept(E e) {
        if (this.b == this.f54646e.length) {
            m64080a();
            if (this.c + 1 >= this.f54647f.length || this.f54647f[this.c + 1] == null) {
                m64088h();
            }
            this.b = 0;
            this.c++;
            this.f54646e = this.f54647f[this.c];
        }
        Object[] objArr = this.f54646e;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = e;
    }

    public String toString() {
        List arrayList = new ArrayList();
        arrayList.getClass();
        m64081a(SpinedBuffer$$Lambda$1.m64069a(arrayList));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpinedBuffer:");
        stringBuilder.append(arrayList.toString());
        return stringBuilder.toString();
    }

    Spliterator<E> y_() {
        return mo14029f();
    }

    /* renamed from: f */
    Spliterator<E> mo14029f() {
        return new AnonymousClass1Splitr(this, 0, this.c, 0, this.b);
    }
}
