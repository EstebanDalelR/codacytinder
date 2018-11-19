package com.tinder.onboarding.viewmodel;

import java.util.Arrays;

/* renamed from: com.tinder.onboarding.viewmodel.a */
public class C10005a {
    /* renamed from: a */
    private final DateField f32865a;
    /* renamed from: b */
    private final int[] f32866b;

    public C10005a(DateField dateField, int i) {
        this.f32865a = dateField;
        this.f32866b = new int[i];
        Arrays.fill(this.f32866b, -1);
    }

    /* renamed from: a */
    public void m41008a(int i, int i2) {
        if (i >= 0 && i < this.f32866b.length) {
            this.f32866b[i] = i2;
        }
    }

    /* renamed from: a */
    public int[] m41009a() {
        return this.f32866b;
    }

    /* renamed from: b */
    public int m41010b() {
        int i = 0;
        for (int i2 : this.f32866b) {
            if (i2 == -1) {
                return i;
            }
            i = (i * 10) + i2;
        }
        return i;
    }

    /* renamed from: c */
    public boolean m41011c() {
        for (int i : this.f32866b) {
            if (i == -1) {
                return false;
            }
        }
        return true;
    }
}
