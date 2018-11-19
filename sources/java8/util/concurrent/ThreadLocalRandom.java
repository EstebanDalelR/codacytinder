package java8.util.concurrent;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectStreamField;
import java.util.Comparator;
import java.util.Random;
import java8.util.Objects;
import java8.util.Spliterator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterator.OfPrimitive;
import java8.util.Spliterators;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

public class ThreadLocalRandom extends Random {
    /* renamed from: b */
    private static final ThreadLocal<Double> f48869b = new ThreadLocal();
    /* renamed from: c */
    private static final ThreadLocalRandom f48870c = new ThreadLocalRandom();
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    private static final long serialVersionUID = 9123313859120073139L;
    /* renamed from: a */
    private boolean f48871a = true;

    private static final class RandomDoublesSpliterator implements OfDouble {
        /* renamed from: a */
        long f59212a;
        /* renamed from: b */
        final long f59213b;
        /* renamed from: c */
        final double f59214c;
        /* renamed from: d */
        final double f59215d;

        public int characteristics() {
            return 17728;
        }

        public /* synthetic */ OfDouble trySplit() {
            return m67706a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ OfPrimitive m71756trySplit() {
            return m67706a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ Spliterator m71757trySplit() {
            return m67706a();
        }

        RandomDoublesSpliterator(long j, long j2, double d, double d2) {
            this.f59212a = j;
            this.f59213b = j2;
            this.f59214c = d;
            this.f59215d = d2;
        }

        /* renamed from: a */
        public RandomDoublesSpliterator m67706a() {
            long j = this.f59212a;
            long j2 = (j + this.f59213b) >>> 1;
            if (j2 <= j) {
                return null;
            }
            this.f59212a = j2;
            return new RandomDoublesSpliterator(j, j2, this.f59214c, this.f59215d);
        }

        public long estimateSize() {
            return this.f59213b - this.f59212a;
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

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            long j = this.f59212a;
            if (j >= this.f59213b) {
                return null;
            }
            doubleConsumer.accept(ThreadLocalRandom.m59330a().m59324a(this.f59214c, this.f59215d));
            this.f59212a = j + 1;
            return true;
        }

        public boolean tryAdvance(Consumer<? super Double> consumer) {
            return Spliterators.OfDouble.m59144a((OfDouble) this, (Consumer) consumer);
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            long j = this.f59212a;
            long j2 = this.f59213b;
            if (j < j2) {
                this.f59212a = j2;
                double d = this.f59214c;
                double d2 = this.f59215d;
                ThreadLocalRandom a = ThreadLocalRandom.m59330a();
                while (true) {
                    doubleConsumer.accept(a.m59324a(d, d2));
                    long j3 = j + 1;
                    if (j3 < j2) {
                        j = j3;
                    } else {
                        return;
                    }
                }
            }
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            Spliterators.OfDouble.m59145b(this, consumer);
        }
    }

    private static final class RandomIntsSpliterator implements OfInt {
        /* renamed from: a */
        long f59216a;
        /* renamed from: b */
        final long f59217b;
        /* renamed from: c */
        final int f59218c;
        /* renamed from: d */
        final int f59219d;

        public int characteristics() {
            return 17728;
        }

        public /* synthetic */ OfInt trySplit() {
            return m67707a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ OfPrimitive m71758trySplit() {
            return m67707a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ Spliterator m71759trySplit() {
            return m67707a();
        }

        RandomIntsSpliterator(long j, long j2, int i, int i2) {
            this.f59216a = j;
            this.f59217b = j2;
            this.f59218c = i;
            this.f59219d = i2;
        }

        /* renamed from: a */
        public RandomIntsSpliterator m67707a() {
            long j = this.f59216a;
            long j2 = (j + this.f59217b) >>> 1;
            if (j2 <= j) {
                return null;
            }
            this.f59216a = j2;
            return new RandomIntsSpliterator(j, j2, this.f59218c, this.f59219d);
        }

        public long estimateSize() {
            return this.f59217b - this.f59216a;
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

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            long j = this.f59216a;
            if (j >= this.f59217b) {
                return null;
            }
            intConsumer.accept(ThreadLocalRandom.m59330a().m59326a(this.f59218c, this.f59219d));
            this.f59216a = j + 1;
            return true;
        }

        public boolean tryAdvance(Consumer<? super Integer> consumer) {
            return Spliterators.OfInt.m59147a((OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            long j = this.f59216a;
            long j2 = this.f59217b;
            if (j < j2) {
                this.f59216a = j2;
                int i = this.f59218c;
                int i2 = this.f59219d;
                ThreadLocalRandom a = ThreadLocalRandom.m59330a();
                while (true) {
                    intConsumer.accept(a.m59326a(i, i2));
                    long j3 = j + 1;
                    if (j3 < j2) {
                        j = j3;
                    } else {
                        return;
                    }
                }
            }
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            Spliterators.OfInt.m59148b(this, consumer);
        }
    }

    private static final class RandomLongsSpliterator implements OfLong {
        /* renamed from: a */
        long f59220a;
        /* renamed from: b */
        final long f59221b;
        /* renamed from: c */
        final long f59222c;
        /* renamed from: d */
        final long f59223d;

        public int characteristics() {
            return 17728;
        }

        public /* synthetic */ OfLong trySplit() {
            return m67708a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ OfPrimitive m71760trySplit() {
            return m67708a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ Spliterator m71761trySplit() {
            return m67708a();
        }

        RandomLongsSpliterator(long j, long j2, long j3, long j4) {
            this.f59220a = j;
            this.f59221b = j2;
            this.f59222c = j3;
            this.f59223d = j4;
        }

        /* renamed from: a */
        public RandomLongsSpliterator m67708a() {
            long j = this.f59220a;
            long j2 = (j + this.f59221b) >>> 1;
            if (j2 <= j) {
                return null;
            }
            this.f59220a = j2;
            return new RandomLongsSpliterator(j, j2, this.f59222c, this.f59223d);
        }

        public long estimateSize() {
            return this.f59221b - this.f59220a;
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

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long j = this.f59220a;
            if (j >= this.f59221b) {
                return null;
            }
            longConsumer.accept(ThreadLocalRandom.m59330a().m59328a(this.f59222c, this.f59223d));
            this.f59220a = j + 1;
            return true;
        }

        public boolean tryAdvance(Consumer<? super Long> consumer) {
            return Spliterators.OfLong.m59150a((OfLong) this, (Consumer) consumer);
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long j = this.f59220a;
            long j2 = this.f59221b;
            if (j < j2) {
                this.f59220a = j2;
                long j3 = this.f59222c;
                long j4 = this.f59223d;
                ThreadLocalRandom a = ThreadLocalRandom.m59330a();
                while (true) {
                    longConsumer.accept(a.m59328a(j3, j4));
                    long j5 = j + 1;
                    if (j5 < j2) {
                        j = j5;
                    } else {
                        return;
                    }
                }
            }
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            Spliterators.OfLong.m59151b(this, consumer);
        }
    }

    private ThreadLocalRandom() {
    }

    /* renamed from: a */
    public static ThreadLocalRandom m59330a() {
        if (TLRandom.m59321f() == 0) {
            TLRandom.m59308a();
        }
        return f48870c;
    }

    public void setSeed(long j) {
        if (this.f48871a != null) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    private final long m59331b() {
        return TLRandom.m59314b();
    }

    /* renamed from: a */
    private final long m59328a(long j, long j2) {
        long a = TLRandom.m59307a(m59331b());
        if (j >= j2) {
            return a;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (a & j4) + j;
        }
        if (j3 > 0) {
            long j5 = a >>> 1;
            while (true) {
                long j6 = j5 + j4;
                j5 %= j3;
                if (j6 - j5 >= 0) {
                    return j5 + j;
                }
                j5 = TLRandom.m59307a(m59331b()) >>> 1;
            }
        } else {
            while (true) {
                if (a >= j && a < j2) {
                    return a;
                }
                a = TLRandom.m59307a(m59331b());
            }
        }
    }

    /* renamed from: a */
    private final int m59326a(int i, int i2) {
        int b = TLRandom.m59313b(m59331b());
        if (i >= i2) {
            return b;
        }
        int i3 = i2 - i;
        int i4 = i3 - 1;
        if ((i3 & i4) == 0) {
            return (b & i4) + i;
        }
        if (i3 > 0) {
            i2 = b >>> 1;
            while (true) {
                b = i2 + i4;
                i2 %= i3;
                if (b - i2 >= 0) {
                    return i2 + i;
                }
                i2 = TLRandom.m59313b(m59331b()) >>> 1;
            }
        } else {
            while (true) {
                if (b >= i && b < i2) {
                    return b;
                }
                b = TLRandom.m59313b(m59331b());
            }
        }
    }

    /* renamed from: a */
    private final double m59324a(double d, double d2) {
        double nextLong = ((double) (nextLong() >>> 11)) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return nextLong;
        }
        nextLong = (nextLong * (d2 - d)) + d;
        return nextLong >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : nextLong;
    }

    public int nextInt() {
        return TLRandom.m59313b(m59331b());
    }

    public int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int b = TLRandom.m59313b(m59331b());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return b & i2;
        }
        b >>>= 1;
        while (true) {
            int i3 = b + i2;
            b %= i;
            if (i3 - b >= 0) {
                return b;
            }
            b = TLRandom.m59313b(m59331b()) >>> 1;
        }
    }

    public long nextLong() {
        return TLRandom.m59307a(m59331b());
    }

    public double nextDouble() {
        return ((double) (TLRandom.m59307a(m59331b()) >>> 11)) * 1.1102230246251565E-16d;
    }

    public boolean nextBoolean() {
        return TLRandom.m59313b(m59331b()) < 0;
    }

    public float nextFloat() {
        return ((float) (TLRandom.m59313b(m59331b()) >>> 8)) * 5.9604645E-8f;
    }

    public double nextGaussian() {
        Double d = (Double) f48869b.get();
        if (d != null) {
            f48869b.set(null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble * nextDouble) + (nextDouble2 * nextDouble2);
            if (d2 < 1.0d && d2 != 0.0d) {
                d2 = StrictMath.sqrt((StrictMath.log(d2) * -2.0d) / d2);
                f48869b.set(Double.valueOf(nextDouble2 * d2));
                return nextDouble * d2;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", TLRandom.m59320e());
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return m59330a();
    }
}
