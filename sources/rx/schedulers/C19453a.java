package rx.schedulers;

/* renamed from: rx.schedulers.a */
public final class C19453a<T> {
    /* renamed from: a */
    private final long f60688a;
    /* renamed from: b */
    private final T f60689b;

    public C19453a(long j, T t) {
        this.f60689b = t;
        this.f60688a = j;
    }

    /* renamed from: a */
    public long m69994a() {
        return this.f60688a;
    }

    /* renamed from: b */
    public T m69995b() {
        return this.f60689b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C19453a)) {
            return false;
        }
        C19453a c19453a = (C19453a) obj;
        if (this.f60688a == c19453a.f60688a) {
            if (this.f60689b != c19453a.f60689b) {
                if (!(this.f60689b == null || this.f60689b.equals(c19453a.f60689b) == null)) {
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((int) (this.f60688a ^ (this.f60688a >>> 32))) + 31) * 31) + (this.f60689b == null ? 0 : this.f60689b.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", new Object[]{Long.valueOf(this.f60688a), this.f60689b.toString()});
    }
}
