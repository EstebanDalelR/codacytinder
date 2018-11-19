package com.google.android.m4b.maps.br;

import android.util.Log;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.de.C5339m;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.br.c */
public final class C7468c extends C6409f {
    /* renamed from: a */
    private final C7436c f27409a;
    /* renamed from: b */
    private final List<C4874b> f27410b = new LinkedList();
    /* renamed from: c */
    private C4662a f27411c;
    /* renamed from: d */
    private boolean f27412d;

    /* renamed from: g */
    public final int mo7034g() {
        return 118;
    }

    public C7468c(C7436c c7436c) {
        this.f27409a = c7436c;
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        C4662a c4662a = new C4662a(C5339m.f20042a);
        c4662a.m20828b(1, this.f27409a.toString());
        C4665c.m20860a(dataOutput, c4662a);
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        this.f27411c = C4665c.m20858a(C5339m.f20043b, dataInput);
        return true;
    }

    /* renamed from: h */
    public final C7436c mo7075h() {
        return this.f27409a;
    }

    /* renamed from: a */
    public final void m32333a(C4874b c4874b) {
        if (c4874b != null) {
            this.f27410b.add(c4874b);
        }
    }

    /* renamed from: i */
    public final void m32338i() {
        this.f27412d = true;
    }

    /* renamed from: j */
    public final boolean m32339j() {
        return this.f27412d;
    }

    /* renamed from: m */
    private int m32331m() {
        if (this.f27411c == null) {
            return 1;
        }
        int d = this.f27411c.m20835d(1);
        if (d == 0) {
            return 0;
        }
        if (d != 2) {
            return 1;
        }
        return 2;
    }

    /* renamed from: k */
    public final C4662a m32340k() {
        if (this.f27411c == null) {
            return null;
        }
        return this.f27411c.m20842g(2);
    }

    /* renamed from: l */
    public final boolean m32341l() {
        return m32331m() == 2;
    }

    /* renamed from: a */
    public final void m32332a(C6524p c6524p) {
        int m = m32331m();
        if (c6524p == null && m == 0) {
            if (C4728u.m21050a("IndoorBuildingRequest", 3)) {
                Log.d("IndoorBuildingRequest", "Unexpected OK status");
            }
            m = 1;
        }
        for (C4874b a : this.f27410b) {
            a.mo5078a(this.f27409a, m, c6524p);
        }
    }
}
