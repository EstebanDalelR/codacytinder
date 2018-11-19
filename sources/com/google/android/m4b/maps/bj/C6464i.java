package com.google.android.m4b.maps.bj;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.as;
import com.google.android.m4b.maps.bx.at;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bj.i */
public abstract class C6464i implements C4787f {
    /* renamed from: a */
    protected final bg f23988a;
    /* renamed from: b */
    protected final bf f23989b;
    /* renamed from: c */
    protected final at f23990c;

    public C6464i(bg bgVar, bf bfVar, C4981g c4981g) {
        this(bgVar, c4981g.m22274a(), bfVar);
    }

    private C6464i(bg bgVar, at atVar, bf bfVar) {
        this.f23988a = bgVar;
        this.f23990c = atVar;
        this.f23989b = bfVar;
        if (atVar == null) {
            throw new RuntimeException("Null zoom table");
        }
    }

    /* renamed from: a */
    public final ba mo5018a(ba baVar, af afVar) {
        int a = m28335b(afVar).m22355a(baVar.m21619b());
        if (a < null) {
            return null;
        }
        return baVar.m21612a(a);
    }

    /* renamed from: b */
    public final List<ba> m28339b(ba baVar, af afVar) {
        List<ba> arrayList = new ArrayList();
        int b = m28335b(afVar).m22357b(baVar.m21619b());
        if (b < null) {
            return arrayList;
        }
        int b2 = b - baVar.m21619b();
        int i = 1 << b2;
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(baVar.m21613a(b, (baVar.m21620c() << b2) + i3, (baVar.m21621d() << b2) + i2));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<ba> mo5019a(int i, af afVar) {
        i = new ArrayList();
        afVar = m28335b(afVar);
        for (int i2 = 0; i2 <= 2; i2++) {
            if (afVar.m22358c(i2)) {
                int i3 = 1 << i2;
                for (int i4 = 0; i4 < i3; i4++) {
                    for (int i5 = 0; i5 < i3; i5++) {
                        i.add(new ba(i2, i4, i5, this.f23989b.m21648a()));
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    private as m28335b(af afVar) {
        return this.f23990c.m22369a(afVar, this.f23988a);
    }

    /* renamed from: a */
    public float mo5016a(af afVar) {
        return (float) m28335b(afVar).m22353a();
    }
}
