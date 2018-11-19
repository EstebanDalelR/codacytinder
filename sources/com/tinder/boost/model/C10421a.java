package com.tinder.boost.model;

import com.tinder.boost.model.C8345b.C8344a;

/* renamed from: com.tinder.boost.model.a */
final class C10421a extends C8345b {
    /* renamed from: a */
    private final boolean f33987a;
    /* renamed from: b */
    private final double f33988b;
    /* renamed from: c */
    private final long f33989c;

    /* renamed from: com.tinder.boost.model.a$a */
    static final class C10420a extends C8344a {
        /* renamed from: a */
        private Boolean f33984a;
        /* renamed from: b */
        private Double f33985b;
        /* renamed from: c */
        private Long f33986c;

        C10420a() {
        }

        /* renamed from: a */
        public C8344a mo9310a(boolean z) {
            this.f33984a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C8344a mo9308a(double d) {
            this.f33985b = Double.valueOf(d);
            return this;
        }

        /* renamed from: a */
        public C8344a mo9309a(long j) {
            this.f33986c = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C8345b mo9311a() {
            String str = "";
            if (this.f33984a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" featureEnabled");
                str = stringBuilder.toString();
            }
            if (this.f33985b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" introMultiplier");
                str = stringBuilder.toString();
            }
            if (this.f33986c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" durationMillis");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C10421a(this.f33984a.booleanValue(), this.f33985b.doubleValue(), this.f33986c.longValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C10421a(boolean z, double d, long j) {
        this.f33987a = z;
        this.f33988b = d;
        this.f33989c = j;
    }

    /* renamed from: a */
    public boolean mo9312a() {
        return this.f33987a;
    }

    /* renamed from: b */
    public double mo9313b() {
        return this.f33988b;
    }

    /* renamed from: c */
    public long mo9314c() {
        return this.f33989c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BoostConfig{featureEnabled=");
        stringBuilder.append(this.f33987a);
        stringBuilder.append(", introMultiplier=");
        stringBuilder.append(this.f33988b);
        stringBuilder.append(", durationMillis=");
        stringBuilder.append(this.f33989c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8345b)) {
            return false;
        }
        C8345b c8345b = (C8345b) obj;
        if (this.f33987a != c8345b.mo9312a() || Double.doubleToLongBits(this.f33988b) != Double.doubleToLongBits(c8345b.mo9313b()) || this.f33989c != c8345b.mo9314c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) (((int) (((long) (((this.f33987a ? 1231 : 1237) ^ 1000003) * 1000003)) ^ ((Double.doubleToLongBits(this.f33988b) >>> 32) ^ Double.doubleToLongBits(this.f33988b)))) * 1000003)) ^ ((this.f33989c >>> 32) ^ this.f33989c));
    }
}
