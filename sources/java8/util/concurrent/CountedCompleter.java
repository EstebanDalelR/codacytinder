package java8.util.concurrent;

import com.foursquare.internal.util.C1948m;
import sun.misc.Unsafe;

public abstract class CountedCompleter<T> extends ForkJoinTask<T> {
    /* renamed from: a */
    private static final Unsafe f54336a = UnsafeAccess.f48872a;
    /* renamed from: b */
    private static final long f54337b;
    private static final long serialVersionUID = 5232453752276485070L;
    /* renamed from: l */
    final CountedCompleter<?> f54338l;
    /* renamed from: m */
    volatile int f54339m;

    /* renamed from: a */
    public abstract void mo13596a();

    /* renamed from: a */
    public void mo13597a(CountedCompleter<?> countedCompleter) {
    }

    /* renamed from: a */
    public boolean m63892a(Throwable th, CountedCompleter<?> countedCompleter) {
        return true;
    }

    /* renamed from: g */
    public T mo12944g() {
        return null;
    }

    protected CountedCompleter(CountedCompleter<?> countedCompleter, int i) {
        this.f54338l = countedCompleter;
        this.f54339m = i;
    }

    protected CountedCompleter(CountedCompleter<?> countedCompleter) {
        this.f54338l = countedCompleter;
    }

    protected CountedCompleter() {
        this.f54338l = null;
    }

    public final CountedCompleter<?> A_() {
        return this.f54338l;
    }

    /* renamed from: c */
    public final int mo12940c() {
        return this.f54339m;
    }

    /* renamed from: a */
    public final void mo12937a(int i) {
        this.f54339m = i;
    }

    /* renamed from: b */
    public final void mo12939b(int i) {
        Unsafe unsafe;
        long j;
        int i2;
        do {
            unsafe = f54336a;
            j = f54337b;
            i2 = this.f54339m;
        } while (!unsafe.compareAndSwapInt(this, j, i2, i2 + i));
    }

    /* renamed from: a */
    public final boolean m63891a(int i, int i2) {
        return f54336a.compareAndSwapInt(this, f54337b, i, i2);
    }

    /* renamed from: d */
    public final void mo12941d() {
        CountedCompleter countedCompleter = this;
        while (true) {
            CountedCompleter countedCompleter2;
            int i = countedCompleter2.f54339m;
            if (i == 0) {
                countedCompleter2.mo13597a(countedCompleter);
                CountedCompleter countedCompleter3 = countedCompleter2.f54338l;
                if (countedCompleter3 == null) {
                    countedCompleter2.m59287m();
                    return;
                } else {
                    countedCompleter = countedCompleter2;
                    countedCompleter2 = countedCompleter3;
                }
            } else {
                if (f54336a.compareAndSwapInt(countedCompleter2, f54337b, i, i - 1)) {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo12942e() {
        CountedCompleter countedCompleter = this;
        while (true) {
            int i = countedCompleter.f54339m;
            if (i == 0) {
                CountedCompleter countedCompleter2 = countedCompleter.f54338l;
                if (countedCompleter2 == null) {
                    countedCompleter.m59287m();
                    return;
                }
                countedCompleter = countedCompleter2;
            } else {
                if (f54336a.compareAndSwapInt(countedCompleter, f54337b, i, i - 1)) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    void mo12938a(Throwable th) {
        CountedCompleter countedCompleter = this;
        CountedCompleter countedCompleter2;
        while (countedCompleter2.m63892a(th, countedCompleter)) {
            countedCompleter = countedCompleter2.f54338l;
            if (countedCompleter != null && countedCompleter.n >= 0 && countedCompleter.m59280b(th) == Integer.MIN_VALUE) {
                CountedCompleter countedCompleter3 = countedCompleter;
                countedCompleter = countedCompleter2;
                countedCompleter2 = countedCompleter3;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    protected final boolean mo12943f() {
        mo13596a();
        return false;
    }

    static {
        try {
            f54337b = f54336a.objectFieldOffset(CountedCompleter.class.getDeclaredField(C1948m.f5228a));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
