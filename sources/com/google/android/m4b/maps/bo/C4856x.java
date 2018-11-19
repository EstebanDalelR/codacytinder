package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bw.C4969b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bo.x */
public final class C4856x {
    /* renamed from: a */
    private final List<C4857y> f17836a;
    /* renamed from: b */
    private final byte[] f17837b;
    /* renamed from: c */
    private C4969b f17838c;

    public C4856x(List<C4857y> list, byte[] bArr) {
        this.f17836a = list;
        this.f17837b = bArr;
    }

    /* renamed from: a */
    public final List<C4857y> m21787a() {
        return this.f17836a;
    }

    /* renamed from: b */
    public final C4969b m21788b() {
        if (!(this.f17838c != null || this.f17836a.isEmpty() || this.f17837b.length == 0)) {
            List arrayList = new ArrayList(this.f17836a.size());
            for (C4857y a : this.f17836a) {
                arrayList.add(a.m21789a());
            }
            this.f17838c = new C4969b(arrayList, this.f17837b);
        }
        return this.f17838c;
    }
}
