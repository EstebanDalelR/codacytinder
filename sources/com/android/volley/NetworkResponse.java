package com.android.volley;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.io.Serializable;
import java.util.Map;

public class NetworkResponse implements Serializable {
    private static final long serialVersionUID = -20150728102000L;
    /* renamed from: a */
    public final int f2335a;
    /* renamed from: b */
    public final byte[] f2336b;
    /* renamed from: c */
    public final Map<String, String> f2337c;
    /* renamed from: d */
    public final boolean f2338d;
    /* renamed from: e */
    public final long f2339e;

    public NetworkResponse(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f2335a = i;
        this.f2336b = bArr;
        this.f2337c = map;
        this.f2338d = z;
        this.f2339e = j;
    }

    public NetworkResponse(byte[] bArr, Map<String, String> map) {
        this(Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, false, 0);
    }
}
