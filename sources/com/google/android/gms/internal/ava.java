package com.google.android.gms.internal;

import java.util.List;

final class ava implements zzakh<List<amm>, amk> {
    /* renamed from: a */
    private /* synthetic */ String f23174a;
    /* renamed from: b */
    private /* synthetic */ Integer f23175b;
    /* renamed from: c */
    private /* synthetic */ Integer f23176c;
    /* renamed from: d */
    private /* synthetic */ int f23177d;
    /* renamed from: e */
    private /* synthetic */ int f23178e;
    /* renamed from: f */
    private /* synthetic */ int f23179f;
    /* renamed from: g */
    private /* synthetic */ int f23180g;
    /* renamed from: h */
    private /* synthetic */ boolean f23181h;

    ava(aux aux, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f23174a = str;
        this.f23175b = num;
        this.f23176c = num2;
        this.f23177d = i;
        this.f23178e = i2;
        this.f23179f = i3;
        this.f23180g = i4;
        this.f23181h = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f23174a;
        Integer num2 = this.f23175b;
        Integer num3 = this.f23176c;
        if (this.f23177d > 0) {
            num = Integer.valueOf(this.f23177d);
        }
        return new amk(str, list, num2, num3, num, this.f23178e + this.f23179f, this.f23180g, this.f23181h);
    }
}
