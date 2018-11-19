package com.tinder.typingindicator.model;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/typingindicator/model/Heartbeat;", "", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)V", "getInterval", "()J", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.model.a */
public final class C15326a {
    /* renamed from: a */
    private final long f47537a;
    @NotNull
    /* renamed from: b */
    private final TimeUnit f47538b;

    /* renamed from: a */
    public final long m57508a() {
        return this.f47537a;
    }

    @NotNull
    /* renamed from: b */
    public final TimeUnit m57509b() {
        return this.f47538b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15326a) {
            C15326a c15326a = (C15326a) obj;
            return ((this.f47537a > c15326a.f47537a ? 1 : (this.f47537a == c15326a.f47537a ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f47538b, c15326a.f47538b);
        }
    }

    public int hashCode() {
        long j = this.f47537a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        TimeUnit timeUnit = this.f47538b;
        return i + (timeUnit != null ? timeUnit.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Heartbeat(interval=");
        stringBuilder.append(this.f47537a);
        stringBuilder.append(", timeUnit=");
        stringBuilder.append(this.f47538b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15326a(long j, @NotNull TimeUnit timeUnit) {
        C2668g.b(timeUnit, "timeUnit");
        this.f47537a = j;
        this.f47538b = timeUnit;
        if ((this.f47537a > 0 ? 1 : null) == null) {
            throw new IllegalArgumentException("interval must be greater than 0".toString());
        }
    }
}
