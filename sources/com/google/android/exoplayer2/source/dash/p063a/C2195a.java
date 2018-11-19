package com.google.android.exoplayer2.source.dash.p063a;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.a.a */
public class C2195a {
    /* renamed from: a */
    public final int f6324a;
    /* renamed from: b */
    public final int f6325b;
    /* renamed from: c */
    public final List<C2199f> f6326c;
    /* renamed from: d */
    public final List<Object> f6327d;
    /* renamed from: e */
    public final List<Object> f6328e;

    public C2195a(int i, int i2, List<C2199f> list, List<Object> list2, List<Object> list3) {
        this.f6324a = i;
        this.f6325b = i2;
        this.f6326c = Collections.unmodifiableList(list);
        if (list2 == null) {
            i = Collections.emptyList();
        } else {
            i = Collections.unmodifiableList(list2);
        }
        this.f6327d = i;
        if (list3 == null) {
            i = Collections.emptyList();
        } else {
            i = Collections.unmodifiableList(list3);
        }
        this.f6328e = i;
    }
}
