package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C6404a;
import com.google.android.m4b.maps.be.C4778f;
import com.google.android.m4b.maps.bo.C4838b.C6492a;
import com.google.android.m4b.maps.bo.C4854s.C4853a;
import com.google.android.m4b.maps.cj.C5214a;
import com.google.android.m4b.maps.cw.C5312a.C8228a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.DataInput;

public final class ag implements C4848k {
    /* renamed from: a */
    private final int f24077a;
    /* renamed from: b */
    private final ba f24078b;
    /* renamed from: c */
    private final af f24079c;
    /* renamed from: d */
    private final String f24080d;
    /* renamed from: e */
    private final String f24081e;
    /* renamed from: f */
    private final C4699a f24082f;
    /* renamed from: g */
    private final as f24083g;
    /* renamed from: h */
    private final int f24084h;
    /* renamed from: i */
    private final int[] f24085i;
    /* renamed from: j */
    private final int f24086j;
    /* renamed from: k */
    private final int f24087k;
    /* renamed from: l */
    private final int f24088l;
    /* renamed from: m */
    private float f24089m = -1.0f;
    /* renamed from: n */
    private float f24090n = -1.0f;
    /* renamed from: o */
    private final C4834a[] f24091o;
    /* renamed from: p */
    private final C4854s f24092p;
    /* renamed from: q */
    private final C4854s f24093q;
    /* renamed from: r */
    private final C6492a[] f24094r;
    /* renamed from: s */
    private final int f24095s;
    /* renamed from: t */
    private final String f24096t;
    /* renamed from: u */
    private final String f24097u;
    /* renamed from: v */
    private final C6492a f24098v;

    /* renamed from: h */
    public final int mo5109h() {
        return 7;
    }

    public ag(int i, ba baVar, af afVar, C4699a c4699a, C4834a[] c4834aArr, C4854s c4854s, C4854s c4854s2, C6492a[] c6492aArr, String str, as asVar, int i2, String str2, int i3, int i4, int i5, int i6, String str3, String str4, C6492a c6492a, int[] iArr) {
        this.f24077a = i;
        this.f24082f = c4699a;
        this.f24091o = c4834aArr;
        this.f24092p = c4854s;
        this.f24093q = c4854s2;
        this.f24094r = c6492aArr;
        this.f24081e = str;
        this.f24083g = asVar;
        this.f24095s = i2;
        this.f24096t = str2;
        this.f24084h = i3;
        this.f24086j = i4;
        int i7 = i5;
        r0.f24087k = i7 == -1 ? 30 : i7;
        r0.f24088l = i6;
        r0.f24097u = str3;
        r0.f24080d = str4;
        r0.f24098v = c6492a;
        r0.f24085i = iArr;
        r0.f24078b = baVar;
        r0.f24079c = afVar;
    }

    /* renamed from: a */
    public static ag m28539a(DataInput dataInput, bc bcVar, an anVar) {
        int i;
        C4699a a;
        String readUTF;
        String str;
        C6492a c6492a;
        DataInput dataInput2 = dataInput;
        bc bcVar2 = bcVar;
        int a2 = bl.m21698a(dataInput);
        C4834a[] c4834aArr = new C4834a[a2];
        ba b = bcVar.m21632b();
        for (i = 0; i < a2; i++) {
            c4834aArr[i] = C4834a.m21422a(dataInput2, b);
        }
        af b2 = c4834aArr[0].m21424b();
        av a3 = av.m21574a(dataInput, bcVar);
        C4854s a4 = C4854s.m21776a(dataInput2, bcVar2, a3);
        C4854s a5 = C4854s.m21776a(dataInput2, bcVar2, a3);
        i = bl.m21698a(dataInput);
        C6492a[] c6492aArr = new C6492a[i];
        for (int i2 = 0; i2 < i; i2++) {
            c6492aArr[i2] = C6492a.m28599b(dataInput);
        }
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        byte readByte3 = dataInput.readByte();
        int readInt = dataInput.readInt();
        String str2 = null;
        if (ac.m21434a(1, readInt)) {
            a = C4699a.m20894a(dataInput);
        } else if (ac.m21434a(2, readInt)) {
            a = C4699a.m20897b(dataInput);
        } else {
            a = null;
        }
        String intern = ac.m21434a(32, readInt) ? C4778f.m21165a(dataInput.readUTF()).intern() : null;
        if (ac.m21434a(64, readInt)) {
            str2 = dataInput.readUTF();
        }
        String str3 = str2;
        if (ac.m21434a(ProfileEditingConfig.DEFAULT_MAX_LENGTH, readInt)) {
            readUTF = dataInput.readUTF();
            str = intern;
        } else {
            Object a6 = a4.m21779a();
            String a7 = a5.m21779a();
            if (a6.length() <= 0 || a7.length() <= 0) {
                str = intern;
            } else {
                str2 = String.valueOf(a6);
                str = intern;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 1);
                stringBuilder.append(str2);
                stringBuilder.append('\n');
                a6 = stringBuilder.toString();
            }
            String valueOf = String.valueOf(a6);
            String valueOf2 = String.valueOf(a7);
            readUTF = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (bcVar.m21629a() != 11) {
            c6492a = C6492a.f24118c;
        } else if (ac.m21434a(512, readInt)) {
            c6492a = C6492a.m28599b(dataInput);
        } else {
            c6492a = C6492a.f24118c;
        }
        C6492a c6492a2 = c6492a;
        int a8 = bl.m21698a(dataInput);
        int[] iArr = new int[a8];
        for (int i3 = 0; i3 < a8; i3++) {
            iArr[i3] = bl.m21698a(dataInput);
        }
        return new ag(anVar.m21541a(), b, b2, a, c4834aArr, a4, a5, c6492aArr, str, a3.m21575a(), a3.m21577c(), a3.m21576b(), readByte, readByte2, readByte3, readInt, str3, readUTF, c6492a2, iArr);
    }

    /* renamed from: b */
    public final ba m28542b() {
        return this.f24078b;
    }

    /* renamed from: c */
    public final af m28544c() {
        return this.f24079c;
    }

    /* renamed from: d */
    public final String m28545d() {
        return this.f24080d;
    }

    /* renamed from: a */
    public final C4699a mo5107a() {
        return this.f24082f;
    }

    /* renamed from: f */
    public final String m28547f() {
        if (this.f24082f == null) {
            return "";
        }
        if (!(this.f24082f instanceof C6404a)) {
            return "";
        }
        return C5214a.m23263a((C8228a) C8228a.m35056s().m35052a(((C6404a) this.f24082f).m27942c()).m34393e());
    }

    /* renamed from: e */
    public final as mo5108e() {
        return this.f24083g;
    }

    /* renamed from: i */
    public final int mo5110i() {
        return this.f24084h;
    }

    /* renamed from: g */
    public final int m28548g() {
        return this.f24086j;
    }

    /* renamed from: j */
    public final int m28551j() {
        return this.f24087k;
    }

    /* renamed from: k */
    public final float m28552k() {
        return this.f24089m;
    }

    /* renamed from: n */
    public final float m28555n() {
        return this.f24090n;
    }

    /* renamed from: a */
    public final void m28541a(float f) {
        this.f24089m = f;
    }

    /* renamed from: b */
    public final void m28543b(float f) {
        this.f24090n = f;
    }

    /* renamed from: l */
    public final int[] mo5111l() {
        return this.f24085i;
    }

    /* renamed from: o */
    public final C4834a[] m28556o() {
        return this.f24091o;
    }

    /* renamed from: p */
    public final C4854s m28557p() {
        return this.f24092p;
    }

    /* renamed from: q */
    public final C4854s m28558q() {
        return this.f24093q;
    }

    /* renamed from: r */
    public final C6492a[] m28559r() {
        return this.f24094r;
    }

    /* renamed from: s */
    public final boolean m28560s() {
        return ac.m21434a(16, this.f24088l);
    }

    /* renamed from: t */
    public final boolean m28561t() {
        int i;
        C4853a a;
        as j;
        if (this.f24092p != null) {
            for (i = 0; i < this.f24092p.m21780b(); i++) {
                a = this.f24092p.m21778a(i);
                if (a.m21765b()) {
                    return true;
                }
                j = a.m21773j();
                if (j != null && j.m21562f()) {
                    return true;
                }
            }
        }
        if (this.f24093q != null) {
            for (i = 0; i < this.f24093q.m21780b(); i++) {
                a = this.f24093q.m21778a(i);
                if (a.m21765b()) {
                    return true;
                }
                j = a.m21773j();
                if (j != null && j.m21562f()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public final int mo5112m() {
        int i;
        int i2 = 120;
        if (this.f24080d != null) {
            i2 = 120 + ac.m21432a(this.f24080d);
        }
        if (this.f24081e != null) {
            i2 += ac.m21432a(this.f24081e);
        }
        int i3 = 0;
        if (this.f24091o != null) {
            i = 0;
            for (C4834a d : this.f24091o) {
                i += d.m21426d();
            }
        } else {
            i = 0;
        }
        if (this.f24094r != null) {
            int i4 = 0;
            while (i3 < this.f24094r.length) {
                i4 += C4838b.m21600c();
                i3++;
            }
            i3 = i4;
        }
        return i2 + (((((((i + i3) + ac.m21431a(this.f24092p)) + ac.m21431a(this.f24093q)) + ac.m21428a(this.f24082f)) + ac.m21430a(this.f24083g)) + ac.m21432a(this.f24096t)) + ac.m21432a(this.f24097u));
    }
}
