package java8.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.Spliterator.OfPrimitive;
import java8.util.function.Consumer;
import java8.util.function.DoubleConsumer;
import java8.util.function.IntConsumer;
import java8.util.function.LongConsumer;

public final class SplittableRandom {
    /* renamed from: c */
    private static final AtomicLong f48773c = new AtomicLong(m59187a(System.currentTimeMillis()) ^ m59187a(System.nanoTime()));
    /* renamed from: a */
    private long f48774a;
    /* renamed from: b */
    private final long f48775b;

    /* renamed from: java8.util.SplittableRandom$1 */
    static class C157661 implements PrivilegedAction<Boolean> {
        C157661() {
        }

        public /* synthetic */ Object run() {
            return m59186a();
        }

        /* renamed from: a */
        public Boolean m59186a() {
            return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }

    private static final class RandomDoublesSpliterator implements OfDouble {
        /* renamed from: a */
        final SplittableRandom f59197a;
        /* renamed from: b */
        long f59198b;
        /* renamed from: c */
        final long f59199c;
        /* renamed from: d */
        final double f59200d;
        /* renamed from: e */
        final double f59201e;

        public int characteristics() {
            return 17728;
        }

        public /* synthetic */ OfDouble trySplit() {
            return m67703a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ OfPrimitive m71750trySplit() {
            return m67703a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ Spliterator m71751trySplit() {
            return m67703a();
        }

        RandomDoublesSpliterator(SplittableRandom splittableRandom, long j, long j2, double d, double d2) {
            this.f59197a = splittableRandom;
            this.f59198b = j;
            this.f59199c = j2;
            this.f59200d = d;
            this.f59201e = d2;
        }

        /* renamed from: a */
        public RandomDoublesSpliterator m67703a() {
            long j = this.f59198b;
            long j2 = (j + this.f59199c) >>> 1;
            if (j2 <= j) {
                return null;
            }
            SplittableRandom a = this.f59197a.m59194a();
            this.f59198b = j2;
            return new RandomDoublesSpliterator(a, j, j2, this.f59200d, this.f59201e);
        }

        public long estimateSize() {
            return this.f59199c - this.f59198b;
        }

        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            long j = this.f59198b;
            if (j >= this.f59199c) {
                return null;
            }
            doubleConsumer.accept(this.f59197a.m59191a(this.f59200d, this.f59201e));
            this.f59198b = j + 1;
            return true;
        }

        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            Objects.m59115b(doubleConsumer);
            long j = this.f59198b;
            long j2 = this.f59199c;
            if (j < j2) {
                this.f59198b = j2;
                SplittableRandom splittableRandom = this.f59197a;
                double d = this.f59200d;
                double d2 = this.f59201e;
                while (true) {
                    doubleConsumer.accept(splittableRandom.m59191a(d, d2));
                    long j3 = j + 1;
                    if (j3 < j2) {
                        j = j3;
                    } else {
                        return;
                    }
                }
            }
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
            return Spliterators.OfDouble.m59144a((OfDouble) this, (Consumer) consumer);
        }

        public void forEachRemaining(Consumer<? super Double> consumer) {
            Spliterators.OfDouble.m59145b(this, consumer);
        }
    }

    private static final class RandomIntsSpliterator implements OfInt {
        /* renamed from: a */
        final SplittableRandom f59202a;
        /* renamed from: b */
        long f59203b;
        /* renamed from: c */
        final long f59204c;
        /* renamed from: d */
        final int f59205d;
        /* renamed from: e */
        final int f59206e;

        public int characteristics() {
            return 17728;
        }

        public /* synthetic */ OfInt trySplit() {
            return m67704a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ OfPrimitive m71752trySplit() {
            return m67704a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ Spliterator m71753trySplit() {
            return m67704a();
        }

        RandomIntsSpliterator(SplittableRandom splittableRandom, long j, long j2, int i, int i2) {
            this.f59202a = splittableRandom;
            this.f59203b = j;
            this.f59204c = j2;
            this.f59205d = i;
            this.f59206e = i2;
        }

        /* renamed from: a */
        public RandomIntsSpliterator m67704a() {
            long j = this.f59203b;
            long j2 = (j + this.f59204c) >>> 1;
            if (j2 <= j) {
                return null;
            }
            SplittableRandom a = this.f59202a.m59194a();
            this.f59203b = j2;
            return new RandomIntsSpliterator(a, j, j2, this.f59205d, this.f59206e);
        }

        public long estimateSize() {
            return this.f59204c - this.f59203b;
        }

        public boolean tryAdvance(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            long j = this.f59203b;
            if (j >= this.f59204c) {
                return null;
            }
            intConsumer.accept(this.f59202a.m59192a(this.f59205d, this.f59206e));
            this.f59203b = j + 1;
            return true;
        }

        public void forEachRemaining(IntConsumer intConsumer) {
            Objects.m59115b(intConsumer);
            long j = this.f59203b;
            long j2 = this.f59204c;
            if (j < j2) {
                this.f59203b = j2;
                SplittableRandom splittableRandom = this.f59202a;
                int i = this.f59205d;
                int i2 = this.f59206e;
                while (true) {
                    intConsumer.accept(splittableRandom.m59192a(i, i2));
                    long j3 = j + 1;
                    if (j3 < j2) {
                        j = j3;
                    } else {
                        return;
                    }
                }
            }
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
            return Spliterators.OfInt.m59147a((OfInt) this, (Consumer) consumer);
        }

        public void forEachRemaining(Consumer<? super Integer> consumer) {
            Spliterators.OfInt.m59148b(this, consumer);
        }
    }

    private static final class RandomLongsSpliterator implements OfLong {
        /* renamed from: a */
        final SplittableRandom f59207a;
        /* renamed from: b */
        long f59208b;
        /* renamed from: c */
        final long f59209c;
        /* renamed from: d */
        final long f59210d;
        /* renamed from: e */
        final long f59211e;

        public int characteristics() {
            return 17728;
        }

        public /* synthetic */ OfLong trySplit() {
            return m67705a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ OfPrimitive m71754trySplit() {
            return m67705a();
        }

        /* renamed from: trySplit */
        public /* synthetic */ Spliterator m71755trySplit() {
            return m67705a();
        }

        RandomLongsSpliterator(SplittableRandom splittableRandom, long j, long j2, long j3, long j4) {
            this.f59207a = splittableRandom;
            this.f59208b = j;
            this.f59209c = j2;
            this.f59210d = j3;
            this.f59211e = j4;
        }

        /* renamed from: a */
        public RandomLongsSpliterator m67705a() {
            long j = this.f59208b;
            long j2 = (j + this.f59209c) >>> 1;
            if (j2 <= j) {
                return null;
            }
            SplittableRandom a = this.f59207a.m59194a();
            this.f59208b = j2;
            return new RandomLongsSpliterator(a, j, j2, this.f59210d, this.f59211e);
        }

        public long estimateSize() {
            return this.f59209c - this.f59208b;
        }

        public boolean tryAdvance(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long j = this.f59208b;
            if (j >= this.f59209c) {
                return null;
            }
            longConsumer.accept(this.f59207a.m59193a(this.f59210d, this.f59211e));
            this.f59208b = j + 1;
            return true;
        }

        public void forEachRemaining(LongConsumer longConsumer) {
            Objects.m59115b(longConsumer);
            long j = this.f59208b;
            long j2 = this.f59209c;
            if (j < j2) {
                this.f59208b = j2;
                SplittableRandom splittableRandom = this.f59207a;
                long j3 = this.f59210d;
                long j4 = this.f59211e;
                while (true) {
                    longConsumer.accept(splittableRandom.m59193a(j3, j4));
                    long j5 = j + 1;
                    if (j5 < j2) {
                        j = j5;
                    } else {
                        return;
                    }
                }
            }
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
            return Spliterators.OfLong.m59150a((OfLong) this, (Consumer) consumer);
        }

        public void forEachRemaining(Consumer<? super Long> consumer) {
            Spliterators.OfLong.m59151b(this, consumer);
        }
    }

    /* renamed from: a */
    private static long m59187a(long j) {
        long j2 = (j ^ (j >>> 30)) * -4658895280553007687L;
        long j3 = (j2 ^ (j2 >>> 27)) * -7723592293110705685L;
        return j3 ^ (j3 >>> 31);
    }

    /* renamed from: b */
    private static int m59188b(long j) {
        long j2 = (j ^ (j >>> 33)) * 7109453100751455733L;
        return (int) (((j2 ^ (j2 >>> 28)) * -3808689974395783757L) >>> 32);
    }

    private SplittableRandom(long j, long j2) {
        this.f48774a = j;
        this.f48775b = j2;
    }

    /* renamed from: c */
    private static long m59190c(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        long j4 = (j3 ^ (j3 >>> 33)) | 1;
        return Long.bitCount(j4 ^ (j4 >>> 1)) < 24 ? j4 ^ -6148914691236517206L : j4;
    }

    /* renamed from: c */
    private long m59189c() {
        long j = this.f48774a + this.f48775b;
        this.f48774a = j;
        return j;
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new C157661())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = ((long) seed[0]) & 255;
            int i = 1;
            while (i < 8) {
                i++;
                j = (j << 8) | (((long) seed[i]) & 255);
            }
            f48773c.set(j);
        }
    }

    /* renamed from: a */
    final long m59193a(long j, long j2) {
        long a = m59187a(m59189c());
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
                j5 = m59187a(m59189c()) >>> 1;
            }
        } else {
            while (true) {
                if (a >= j && a < j2) {
                    return a;
                }
                a = m59187a(m59189c());
            }
        }
    }

    /* renamed from: a */
    final int m59192a(int i, int i2) {
        int b = m59188b(m59189c());
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
                i2 = m59188b(m59189c()) >>> 1;
            }
        } else {
            while (true) {
                if (b >= i && b < i2) {
                    return b;
                }
                b = m59188b(m59189c());
            }
        }
    }

    /* renamed from: a */
    final double m59191a(double d, double d2) {
        double b = ((double) (m59195b() >>> 11)) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return b;
        }
        b = (b * (d2 - d)) + d;
        return b >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : b;
    }

    public SplittableRandom() {
        long andAdd = f48773c.getAndAdd(4354685564936845354L);
        this.f48774a = m59187a(andAdd);
        this.f48775b = m59190c(andAdd - 7046029254386353131L);
    }

    /* renamed from: a */
    public SplittableRandom m59194a() {
        return new SplittableRandom(m59195b(), m59190c(m59189c()));
    }

    /* renamed from: b */
    public long m59195b() {
        return m59187a(m59189c());
    }
}
