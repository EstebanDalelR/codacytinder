package com.tinder.p238f.p240b.p241a.p242a;

import com.tinder.p238f.p240b.p241a.p242a.C9367c.C9366b;

/* renamed from: com.tinder.f.b.a.a.b */
final class C11599b extends C9366b {
    /* renamed from: a */
    private final double f37997a;
    /* renamed from: b */
    private final double f37998b;

    C11599b(double d, double d2) {
        this.f37997a = d;
        this.f37998b = d2;
    }

    /* renamed from: a */
    public double mo10359a() {
        return this.f37997a;
    }

    /* renamed from: b */
    public double mo10360b() {
        return this.f37998b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Location{latitude=");
        stringBuilder.append(this.f37997a);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.f37998b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9366b)) {
            return false;
        }
        C9366b c9366b = (C9366b) obj;
        if (Double.doubleToLongBits(this.f37997a) != Double.doubleToLongBits(c9366b.mo10359a()) || Double.doubleToLongBits(this.f37998b) != Double.doubleToLongBits(c9366b.mo10360b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) (((int) (((long) 1000003) ^ ((Double.doubleToLongBits(this.f37997a) >>> 32) ^ Double.doubleToLongBits(this.f37997a)))) * 1000003)) ^ ((Double.doubleToLongBits(this.f37998b) >>> 32) ^ Double.doubleToLongBits(this.f37998b)));
    }
}
