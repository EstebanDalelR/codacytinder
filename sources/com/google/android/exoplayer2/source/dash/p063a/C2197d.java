package com.google.android.exoplayer2.source.dash.p063a;

import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.a.d */
public class C2197d {
    @Nullable
    /* renamed from: a */
    public final String f6332a;
    /* renamed from: b */
    public final long f6333b;
    /* renamed from: c */
    public final List<C2195a> f6334c;
    /* renamed from: d */
    public final List<C2196c> f6335d;

    public C2197d(@Nullable String str, long j, List<C2195a> list, List<C2196c> list2) {
        this.f6332a = str;
        this.f6333b = j;
        this.f6334c = Collections.unmodifiableList(list);
        this.f6335d = Collections.unmodifiableList(list2);
    }
}
