package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bo.aj.C4836a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bo.f */
public final class C4846f {
    /* renamed from: a */
    private am f17807a;
    /* renamed from: b */
    private int f17808b;
    /* renamed from: c */
    private af[] f17809c;
    /* renamed from: d */
    private boolean f17810d;
    /* renamed from: e */
    private final ArrayList<C4836a> f17811e = new ArrayList();
    /* renamed from: f */
    private final ArrayList<C4845a> f17812f = new ArrayList();
    /* renamed from: g */
    private int f17813g;

    /* renamed from: com.google.android.m4b.maps.bo.f$a */
    static class C4845a {
        /* renamed from: a */
        private int[] f17805a;
        /* renamed from: b */
        private int f17806b;

        C4845a() {
            this(16);
        }

        private C4845a(int i) {
            this.f17805a = new int[16];
            this.f17806b = 0;
        }

        /* renamed from: a */
        final void m21740a(int i) {
            if (this.f17806b == this.f17805a.length) {
                Object obj = new int[(this.f17805a.length * 2)];
                System.arraycopy(this.f17805a, 0, obj, 0, this.f17805a.length);
                this.f17805a = obj;
            }
            int[] iArr = this.f17805a;
            int i2 = this.f17806b;
            this.f17806b = i2 + 1;
            iArr[i2] = i;
        }

        /* renamed from: a */
        final int[] m21741a() {
            Object obj = new int[this.f17806b];
            System.arraycopy(this.f17805a, 0, obj, 0, this.f17806b);
            return obj;
        }

        /* renamed from: b */
        final void m21742b() {
            this.f17806b = 0;
        }

        /* renamed from: c */
        final int m21743c() {
            return this.f17806b;
        }
    }

    public C4846f(am amVar) {
        m21745a(amVar);
    }

    /* renamed from: a */
    private void m21745a(am amVar) {
        this.f17807a = amVar;
        this.f17808b = amVar.mo7068b();
        this.f17809c = new af[this.f17808b];
        for (amVar = null; amVar < this.f17809c.length; amVar++) {
            this.f17809c[amVar] = new af();
        }
    }

    /* renamed from: a */
    private void m21744a(int i, af afVar, int i2, boolean z) {
        if (i == this.f17808b) {
            if (z) {
                if (this.f17813g == this.f17811e.size()) {
                    this.f17811e.add(new C4836a());
                    this.f17812f.add(new C4845a());
                }
                this.f17813g++;
            }
            if (!(((C4836a) this.f17811e.get(this.f17813g - true)).m21514a(afVar) == 0 || this.f17810d == 0)) {
                ((C4845a) this.f17812f.get(this.f17813g - 1)).m21740a(i2);
            }
            return;
        }
        af h;
        af a;
        if (i == 0) {
            h = this.f17807a.mo7070h();
            a = this.f17807a.mo7067a(0);
        } else {
            h = this.f17807a.mo7067a(i - 1);
            a = this.f17807a.mo7067a(i);
        }
        if (ah.m21500a(h, a, afVar) >= 0) {
            if (!z && ah.m21500a(h, a, this.f17809c[i]) < 0) {
                af afVar2 = new af();
                ah.m21504a(h, a, afVar, this.f17809c[i], afVar2);
                m21744a(i + 1, afVar2, i2, true);
            }
            m21744a(i + 1, afVar, i2, z);
        } else if (!z && ah.m21500a(h, a, this.f17809c[i]) < false) {
            z = new af();
            ah.m21504a(h, a, this.f17809c[i], afVar, z);
            m21744a(i + 1, z, i2, false);
        }
        this.f17809c[i].m21482b(afVar);
    }

    /* renamed from: a */
    public final void m21746a(aj ajVar, List<aj> list) {
        int i = 0;
        this.f17813g = 0;
        this.f17810d = false;
        am a = ajVar.m21523a();
        if (this.f17807a.mo5091a(a)) {
            List list2 = null;
            if (this.f17807a.mo7069b(a)) {
                list.add(ajVar);
                if (this.f17810d != null) {
                    list2.add(list2);
                }
                return;
            }
            af afVar = new af();
            int b = ajVar.m21528b();
            ajVar.m21524a(0, afVar);
            m21744a(0, afVar, this.f17810d ? list2[0] : 0, true);
            int i2 = 1;
            while (i2 < b) {
                ajVar.m21524a(i2, afVar);
                m21744a(0, afVar, this.f17810d ? list2[i2] : 0, false);
                i2++;
            }
            while (i < this.f17813g) {
                C4836a c4836a = (C4836a) this.f17811e.get(i);
                if (c4836a.m21512a() > 1) {
                    list.add(c4836a.m21516c());
                }
                c4836a.m21515b();
                if (this.f17810d != null) {
                    C4845a c4845a = (C4845a) this.f17812f.get(i);
                    if (c4845a.m21743c() > 1) {
                        list2.add(c4845a.m21741a());
                    }
                    c4845a.m21742b();
                }
                i++;
            }
        }
    }
}
