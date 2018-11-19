package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ma {
    /* renamed from: a */
    private final int f16363a;
    /* renamed from: b */
    private final List<ajr> f16364b;
    /* renamed from: c */
    private final int f16365c;
    /* renamed from: d */
    private final InputStream f16366d;

    public ma(int i, List<ajr> list) {
        this(i, list, -1, null);
    }

    public ma(int i, List<ajr> list, int i2, InputStream inputStream) {
        this.f16363a = i;
        this.f16364b = list;
        this.f16365c = i2;
        this.f16366d = inputStream;
    }

    /* renamed from: a */
    public final int m20039a() {
        return this.f16363a;
    }

    /* renamed from: b */
    public final List<ajr> m20040b() {
        return Collections.unmodifiableList(this.f16364b);
    }

    /* renamed from: c */
    public final int m20041c() {
        return this.f16365c;
    }

    /* renamed from: d */
    public final InputStream m20042d() {
        return this.f16366d;
    }
}
