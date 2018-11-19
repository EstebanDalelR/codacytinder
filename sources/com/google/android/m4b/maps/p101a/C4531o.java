package com.google.android.m4b.maps.p101a;

import com.tinder.api.ManagerWebServices;

/* renamed from: com.google.android.m4b.maps.a.o */
public class C4531o {
    /* renamed from: a */
    private int f16837a;
    /* renamed from: b */
    private int f16838b;
    /* renamed from: c */
    private final int f16839c;
    /* renamed from: d */
    private final float f16840d;

    /* renamed from: a */
    public int m20460a() {
        return this.f16837a;
    }

    /* renamed from: b */
    public int m20462b() {
        return this.f16838b;
    }

    /* renamed from: a */
    public void m20461a(C4532r c4532r) {
        this.f16838b++;
        this.f16837a = (int) (((float) this.f16837a) + (((float) this.f16837a) * this.f16840d));
        if (!m20463c()) {
            throw c4532r;
        }
    }

    public C4531o() {
        this(ManagerWebServices.FB_WEAR_TIMEOUT, 1, 1.0f);
    }

    public C4531o(int i, int i2, float f) {
        this.f16837a = i;
        this.f16839c = i2;
        this.f16840d = f;
    }

    /* renamed from: c */
    protected boolean m20463c() {
        return this.f16838b <= this.f16839c;
    }
}
