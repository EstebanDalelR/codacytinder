package com.google.android.m4b.maps.p101a;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.a.h */
public final class C4522h {
    /* renamed from: a */
    public final int f16796a;
    /* renamed from: b */
    public final byte[] f16797b;
    /* renamed from: c */
    public final Map<String, String> f16798c;
    /* renamed from: d */
    public final boolean f16799d;
    /* renamed from: e */
    private long f16800e;

    public C4522h(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f16796a = i;
        this.f16797b = bArr;
        this.f16798c = map;
        this.f16799d = z;
        this.f16800e = j;
    }

    public C4522h(byte[] bArr, Map<String, String> map) {
        this(Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, false, 0);
    }
}
