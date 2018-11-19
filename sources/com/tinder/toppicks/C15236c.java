package com.tinder.toppicks;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tinder/toppicks/TimerContent;", "", "context", "Landroid/content/Context;", "durationMillis", "", "(Landroid/content/Context;J)V", "getContext", "()Landroid/content/Context;", "getDurationMillis", "()J", "setDurationMillis", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.c */
public final class C15236c {
    @NotNull
    /* renamed from: a */
    private final Context f47320a;
    /* renamed from: b */
    private long f47321b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15236c) {
            C15236c c15236c = (C15236c) obj;
            if (C2668g.a(this.f47320a, c15236c.f47320a)) {
                if ((this.f47321b == c15236c.f47321b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Context context = this.f47320a;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        long j = this.f47321b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TimerContent(context=");
        stringBuilder.append(this.f47320a);
        stringBuilder.append(", durationMillis=");
        stringBuilder.append(this.f47321b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15236c(@NotNull Context context, long j) {
        C2668g.b(context, "context");
        this.f47320a = context;
        this.f47321b = j;
    }

    @NotNull
    /* renamed from: a */
    public final Context m57299a() {
        return this.f47320a;
    }

    /* renamed from: a */
    public final void m57300a(long j) {
        this.f47321b = j;
    }

    /* renamed from: b */
    public final long m57301b() {
        return this.f47321b;
    }
}
