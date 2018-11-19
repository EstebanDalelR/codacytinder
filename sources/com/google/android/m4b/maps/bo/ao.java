package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;
import com.tinder.domain.config.model.ProfileEditingConfig;

public final class ao implements C4848k {
    /* renamed from: a */
    private final int f24105a;
    /* renamed from: b */
    private final C4699a f24106b;
    /* renamed from: c */
    private final aj f24107c;
    /* renamed from: d */
    private final C4854s[] f24108d;
    /* renamed from: e */
    private final as f24109e;
    /* renamed from: f */
    private final int f24110f;
    /* renamed from: g */
    private final String f24111g;
    /* renamed from: h */
    private final int f24112h;
    /* renamed from: i */
    private final int f24113i;
    /* renamed from: j */
    private final int f24114j;
    /* renamed from: k */
    private final int[] f24115k;

    /* renamed from: h */
    public final int mo5109h() {
        return 2;
    }

    public ao(int i, C4699a c4699a, aj ajVar, C4854s[] c4854sArr, as asVar, int i2, String str, int i3, int i4, int i5, int[] iArr) {
        this.f24105a = i;
        this.f24106b = c4699a;
        this.f24107c = ajVar;
        this.f24108d = c4854sArr;
        this.f24109e = asVar;
        this.f24110f = i2;
        this.f24111g = str;
        this.f24112h = i3;
        this.f24113i = i4;
        this.f24114j = i5;
        this.f24115k = iArr;
    }

    /* renamed from: a */
    public final C4699a mo5107a() {
        return this.f24106b;
    }

    /* renamed from: b */
    public final aj m28579b() {
        return this.f24107c;
    }

    /* renamed from: a */
    public final C4854s m28578a(int i) {
        return this.f24108d[i];
    }

    /* renamed from: c */
    public final int m28580c() {
        return this.f24108d == null ? 0 : this.f24108d.length;
    }

    /* renamed from: e */
    public final as mo5108e() {
        return this.f24109e;
    }

    /* renamed from: i */
    public final int mo5110i() {
        return this.f24113i;
    }

    /* renamed from: d */
    public final boolean m28581d() {
        return ac.m21434a(this.f24114j, 1);
    }

    /* renamed from: g */
    public final boolean m28584g() {
        return ac.m21434a(this.f24114j, 32) && !ac.m21434a(this.f24114j, 8);
    }

    /* renamed from: j */
    public final boolean m28587j() {
        return ac.m21434a(this.f24114j, 64);
    }

    /* renamed from: k */
    public final boolean m28588k() {
        return ac.m21434a(this.f24114j, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    }

    /* renamed from: l */
    public final int[] mo5111l() {
        return this.f24115k;
    }

    /* renamed from: m */
    public final int mo5112m() {
        int i = this.f24107c.m21540i() + 60;
        int i2 = 0;
        if (this.f24108d != null) {
            C4854s[] c4854sArr = this.f24108d;
            int i3 = 0;
            while (i2 < c4854sArr.length) {
                i3 += c4854sArr[i2].m21782d();
                i2++;
            }
            i2 = i3;
        }
        return i + (((i2 + ac.m21428a(this.f24106b)) + ac.m21430a(this.f24109e)) + ac.m21432a(this.f24111g));
    }

    /* renamed from: f */
    public final boolean m28583f() {
        return (this.f24109e.m21563g() || m28584g()) && ((m28581d() || ac.m21434a(this.f24114j, 2)) && this.f24112h < ProfileEditingConfig.DEFAULT_MAX_LENGTH && !ac.m21434a(this.f24114j, 8));
    }
}
