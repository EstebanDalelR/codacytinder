package com.snapchat.kit.sdk.core.metrics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.C17715c;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b */
public class C5939b<T> {
    @SerializedName("retry_count")
    @Expose
    /* renamed from: a */
    private int f21712a;
    @SerializedName("event")
    @Expose
    /* renamed from: b */
    private T f21713b;

    public C5939b(T t) {
        this(t, 0);
    }

    public C5939b(T t, int i) {
        this.f21712a = i;
        this.f21713b = t;
    }

    /* renamed from: a */
    void m25531a() {
        this.f21712a++;
    }

    /* renamed from: b */
    public int m25532b() {
        return this.f21712a;
    }

    /* renamed from: c */
    public T m25533c() {
        return this.f21713b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5939b)) {
            return null;
        }
        C5939b c5939b = (C5939b) obj;
        return new C17715c().a(this.f21712a, c5939b.f21712a).a(this.f21713b, c5939b.f21713b).b().booleanValue();
    }
}
