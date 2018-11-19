package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;
import java.io.DataInput;

/* renamed from: com.google.android.m4b.maps.bo.u */
public class C6527u implements C4848k {
    /* renamed from: a */
    private final int f24212a;
    /* renamed from: b */
    private final C4699a f24213b;
    /* renamed from: c */
    private final aj f24214c;
    /* renamed from: d */
    private final C4854s[] f24215d;
    /* renamed from: e */
    private final String f24216e;
    /* renamed from: f */
    private final as f24217f;
    /* renamed from: g */
    private final int f24218g;
    /* renamed from: h */
    private final String f24219h;
    /* renamed from: i */
    private final int f24220i;
    /* renamed from: j */
    private final float f24221j;
    /* renamed from: k */
    private final int f24222k;
    /* renamed from: l */
    private final boolean f24223l;
    /* renamed from: m */
    private final int[] f24224m;

    /* renamed from: h */
    public int mo5109h() {
        return 8;
    }

    public C6527u(int i, C4699a c4699a, aj ajVar, C4854s[] c4854sArr, as asVar, int i2, String str, int i3, float f, int i4, int[] iArr) {
        this(i, c4699a, ajVar, c4854sArr, asVar, i2, str, i3, f, i4, iArr, false);
    }

    public C6527u(int i, C4699a c4699a, aj ajVar, C4854s[] c4854sArr, as asVar, int i2, String str, int i3, float f, int i4, int[] iArr, boolean z) {
        this.f24212a = i;
        this.f24213b = c4699a;
        this.f24214c = ajVar;
        this.f24215d = c4854sArr;
        this.f24216e = 0;
        this.f24217f = asVar;
        this.f24218g = i2;
        this.f24219h = str;
        this.f24220i = i3;
        this.f24221j = f;
        this.f24222k = i4;
        this.f24224m = iArr;
        this.f24223l = z;
    }

    /* renamed from: a */
    public static C6527u m28768a(DataInput dataInput, bc bcVar, an anVar) {
        return C6527u.m28769a(dataInput, bcVar, anVar, false);
    }

    /* renamed from: a */
    protected static C6527u m28769a(DataInput dataInput, bc bcVar, an anVar, boolean z) {
        DataInput dataInput2 = dataInput;
        aj a = aj.m21519a(dataInput2, bcVar.m21632b());
        av a2 = av.m21574a(dataInput2, bcVar);
        int a3 = bl.m21698a(dataInput2);
        C4854s[] c4854sArr = new C4854s[a3];
        for (int i = 0; i < a3; i++) {
            c4854sArr[i] = C4854s.m21776a(dataInput2, bcVar, a2);
        }
        byte readByte = dataInput2.readByte();
        float readByte2 = ((float) dataInput2.readByte()) / 4.0f;
        int readInt = dataInput2.readInt();
        C4699a c4699a = null;
        if (ac.m21434a(1, readInt)) {
            c4699a = C4699a.m20894a(dataInput2);
        } else if (ac.m21434a(2, readInt)) {
            c4699a = C4699a.m20897b(dataInput2);
        }
        C4699a c4699a2 = c4699a;
        a3 = bl.m21698a(dataInput2);
        int[] iArr = new int[a3];
        for (int i2 = 0; i2 < a3; i2++) {
            iArr[i2] = bl.m21698a(dataInput2);
        }
        if (z) {
            return new C7464v(anVar.m21541a(), c4699a2, a, c4854sArr, a2.m21575a(), a2.m21577c(), a2.m21576b(), readByte, readByte2, readInt, iArr);
        }
        return new C6527u(anVar.m21541a(), c4699a2, a, c4854sArr, a2.m21575a(), a2.m21577c(), a2.m21576b(), readByte, readByte2, readInt, iArr);
    }

    /* renamed from: a */
    public final C4699a mo5107a() {
        return this.f24213b;
    }

    /* renamed from: b */
    public final aj m28772b() {
        return this.f24214c;
    }

    /* renamed from: a */
    public final C4854s m28771a(int i) {
        return this.f24215d[i];
    }

    /* renamed from: c */
    public final int m28773c() {
        return this.f24215d.length;
    }

    /* renamed from: e */
    public final as mo5108e() {
        return this.f24217f;
    }

    /* renamed from: i */
    public final int mo5110i() {
        return this.f24220i;
    }

    /* renamed from: d */
    public final float m28774d() {
        return this.f24221j;
    }

    /* renamed from: f */
    public final boolean m28776f() {
        return this.f24223l;
    }

    /* renamed from: l */
    public final int[] mo5111l() {
        return this.f24224m;
    }

    /* renamed from: m */
    public final int mo5112m() {
        int i = this.f24214c.m21540i();
        int i2 = 0;
        if (this.f24215d != null) {
            C4854s[] c4854sArr = this.f24215d;
            int i3 = 0;
            while (i2 < c4854sArr.length) {
                i3 += c4854sArr[i2].m21782d();
                i2++;
            }
            i2 = i3;
        }
        return i + ((((ac.m21428a(this.f24213b) + 60) + ac.m21432a(this.f24219h)) + ac.m21430a(this.f24217f)) + i2);
    }
}
