package com.airbnb.lottie.model;

import android.support.annotation.Nullable;
import android.support.v4.util.C0559j;

/* renamed from: com.airbnb.lottie.model.i */
public class C0855i<T> {
    @Nullable
    /* renamed from: a */
    T f2225a;
    @Nullable
    /* renamed from: b */
    T f2226b;

    /* renamed from: a */
    public void m2931a(T t, T t2) {
        this.f2225a = t;
        this.f2226b = t2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0559j)) {
            return false;
        }
        C0559j c0559j = (C0559j) obj;
        if (C0855i.m2930b(c0559j.f1724a, this.f2225a) && C0855i.m2930b(c0559j.f1725b, this.f2226b) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m2930b(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f2225a == null ? 0 : this.f2225a.hashCode();
        if (this.f2226b != null) {
            i = this.f2226b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.f2225a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.f2226b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
