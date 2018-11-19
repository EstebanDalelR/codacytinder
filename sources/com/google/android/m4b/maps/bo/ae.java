package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5569h.C5568a;
import java.util.Arrays;

public final class ae {
    /* renamed from: a */
    private af f17647a;
    /* renamed from: b */
    private float f17648b;
    /* renamed from: c */
    private int f17649c;
    /* renamed from: d */
    private af f17650d;
    /* renamed from: e */
    private float f17651e;
    /* renamed from: f */
    private boolean f17652f;
    /* renamed from: g */
    private C4701c f17653g;
    /* renamed from: h */
    private boolean f17654h;
    /* renamed from: i */
    private float f17655i;
    /* renamed from: j */
    private boolean f17656j;
    /* renamed from: k */
    private float f17657k;

    public ae() {
        m21435l();
    }

    public ae(af afVar, float f, int i) {
        m21440a(afVar, f, i);
    }

    /* renamed from: a */
    public final af m21436a() {
        return this.f17647a;
    }

    /* renamed from: b */
    public final float m21442b() {
        return this.f17648b;
    }

    /* renamed from: c */
    public final int m21443c() {
        return this.f17649c;
    }

    /* renamed from: d */
    public final af m21444d() {
        return (af) C5569h.m24285b(this.f17650d, this.f17647a);
    }

    /* renamed from: a */
    public final void m21439a(af afVar) {
        this.f17650d = afVar;
    }

    /* renamed from: e */
    public final boolean m21445e() {
        return this.f17652f;
    }

    /* renamed from: a */
    public final void m21441a(boolean z) {
        this.f17652f = z;
    }

    /* renamed from: f */
    public final C4701c m21446f() {
        return this.f17653g;
    }

    /* renamed from: g */
    public final boolean m21447g() {
        return this.f17654h;
    }

    /* renamed from: h */
    public final float m21448h() {
        return this.f17655i;
    }

    /* renamed from: i */
    public final boolean m21449i() {
        return this.f17656j;
    }

    /* renamed from: j */
    public final float m21450j() {
        return this.f17657k;
    }

    /* renamed from: a */
    public final void m21437a(float f) {
        this.f17657k = Math.min(1.0f, Math.max(0.0f, f));
    }

    /* renamed from: a */
    public final void m21438a(ae aeVar) {
        if (aeVar == null) {
            m21435l();
            return;
        }
        af afVar;
        m21440a(aeVar.f17647a, aeVar.f17648b, aeVar.f17649c);
        if (aeVar.f17650d == null) {
            afVar = null;
        } else {
            afVar = new af(aeVar.f17650d);
        }
        this.f17650d = afVar;
        this.f17651e = aeVar.f17651e;
        this.f17652f = aeVar.f17652f;
        this.f17653g = aeVar.f17653g;
        this.f17654h = aeVar.f17654h;
        this.f17655i = aeVar.f17655i;
        this.f17656j = aeVar.f17656j;
        this.f17657k = aeVar.f17657k;
    }

    /* renamed from: a */
    public final void m21440a(af afVar, float f, int i) {
        this.f17647a = afVar == null ? null : new af(afVar);
        this.f17648b = f;
        this.f17649c = i;
    }

    /* renamed from: l */
    private void m21435l() {
        this.f17647a = null;
        this.f17648b = 0.0f;
        this.f17649c = -1;
        this.f17650d = null;
        this.f17651e = 0.0f;
        this.f17652f = false;
        this.f17653g = null;
        this.f17654h = false;
        this.f17655i = 0.0f;
        this.f17656j = false;
        this.f17657k = 1.0f;
    }

    /* renamed from: k */
    public final boolean m21451k() {
        return this.f17647a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ae aeVar = (ae) obj;
        return C5569h.m24284a(this.f17647a, aeVar.f17647a) && this.f17648b == aeVar.f17648b && this.f17649c == aeVar.f17649c && C5569h.m24284a(this.f17650d, aeVar.f17650d) && this.f17651e == aeVar.f17651e && this.f17652f == aeVar.f17652f && C5569h.m24284a(this.f17653g, aeVar.f17653g) && this.f17654h == aeVar.f17654h && this.f17655i == aeVar.f17655i && this.f17656j == aeVar.f17656j && this.f17657k == aeVar.f17657k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17647a, Float.valueOf(this.f17648b), Integer.valueOf(this.f17649c), Float.valueOf(this.f17651e), Boolean.valueOf(this.f17652f), this.f17653g, Boolean.valueOf(this.f17654h), Float.valueOf(this.f17655i), Boolean.valueOf(this.f17656j), Float.valueOf(this.f17657k)});
    }

    public final String toString() {
        C5568a a = C5569h.m24283a(this);
        a.m24281a("@", this.f17647a.m21498j());
        a.m24279a("Accuracy", this.f17649c);
        if (this.f17650d != null) {
            a.m24281a("Accuracy point", this.f17650d.m21498j());
        }
        a.m24278a("Accuracy emphasis", this.f17651e);
        a.m24282a("Use bearing", this.f17652f);
        if (this.f17652f) {
            a.m24278a("Bearing", this.f17648b);
        }
        a.m24278a("Brightness", this.f17657k);
        a.m24278a("Height", this.f17655i);
        a.m24281a("Level", this.f17653g);
        a.m24282a("Stale", this.f17656j);
        return a.toString();
    }
}
