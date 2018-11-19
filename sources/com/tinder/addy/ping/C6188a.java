package com.tinder.addy.ping;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/addy/ping/Ping;", "", "url", "", "pingTimeMs", "", "(Ljava/lang/String;J)V", "getPingTimeMs", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.ping.a */
public final class C6188a {
    @NotNull
    /* renamed from: a */
    private final String f22741a;
    /* renamed from: b */
    private final long f22742b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6188a) {
            C6188a c6188a = (C6188a) obj;
            if (C2668g.a(this.f22741a, c6188a.f22741a)) {
                if ((this.f22742b == c6188a.f22742b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f22741a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f22742b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ping(url=");
        stringBuilder.append(this.f22741a);
        stringBuilder.append(", pingTimeMs=");
        stringBuilder.append(this.f22742b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C6188a(@NotNull String str, long j) {
        C2668g.b(str, "url");
        this.f22741a = str;
        this.f22742b = j;
    }

    @NotNull
    /* renamed from: a */
    public final String m26799a() {
        return this.f22741a;
    }

    /* renamed from: b */
    public final long m26800b() {
        return this.f22742b;
    }
}
