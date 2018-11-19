package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.schedulers.b */
public final class C15757b<T> {
    /* renamed from: a */
    final T f48682a;
    /* renamed from: b */
    final long f48683b;
    /* renamed from: c */
    final TimeUnit f48684c;

    public C15757b(@NonNull T t, long j, @NonNull TimeUnit timeUnit) {
        this.f48682a = t;
        this.f48683b = j;
        this.f48684c = (TimeUnit) C15684a.m58895a((Object) timeUnit, "unit is null");
    }

    @NonNull
    /* renamed from: a */
    public T m59013a() {
        return this.f48682a;
    }

    /* renamed from: b */
    public long m59014b() {
        return this.f48683b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C15757b)) {
            return false;
        }
        C15757b c15757b = (C15757b) obj;
        if (C15684a.m58896a(this.f48682a, c15757b.f48682a) && this.f48683b == c15757b.f48683b && C15684a.m58896a(this.f48684c, c15757b.f48684c) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.f48682a != null ? this.f48682a.hashCode() : 0) * 31) + ((int) ((this.f48683b >>> 31) ^ this.f48683b))) * 31) + this.f48684c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Timed[time=");
        stringBuilder.append(this.f48683b);
        stringBuilder.append(", unit=");
        stringBuilder.append(this.f48684c);
        stringBuilder.append(", value=");
        stringBuilder.append(this.f48682a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
