package com.tinder.purchase.domain.model;

import io.reactivex.annotations.NonNull;

/* renamed from: com.tinder.purchase.domain.model.c */
final class C16226c extends C14514j {
    /* renamed from: a */
    private final String f50545a;
    /* renamed from: b */
    private final Double f50546b;

    C16226c(String str, Double d) {
        if (str == null) {
            throw new NullPointerException("Null currency");
        }
        this.f50545a = str;
        if (d == null) {
            throw new NullPointerException("Null amount");
        }
        this.f50546b = d;
    }

    @NonNull
    /* renamed from: a */
    public String mo11869a() {
        return this.f50545a;
    }

    @NonNull
    /* renamed from: b */
    public Double mo11870b() {
        return this.f50546b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Price{currency=");
        stringBuilder.append(this.f50545a);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.f50546b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14514j)) {
            return false;
        }
        C14514j c14514j = (C14514j) obj;
        if (!this.f50545a.equals(c14514j.mo11869a()) || this.f50546b.equals(c14514j.mo11870b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f50545a.hashCode() ^ 1000003) * 1000003) ^ this.f50546b.hashCode();
    }
}
