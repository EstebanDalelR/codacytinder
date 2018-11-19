package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.as.C4666a;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bq.C4868i;
import com.google.android.m4b.maps.bw.C4972d;
import com.google.android.m4b.maps.bw.C4972d.C4971a;
import com.google.android.m4b.maps.bw.C4978f;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.DataInput;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.DataFormatException;

public class bo implements C6521j {
    /* renamed from: a */
    private final ba f27363a;
    /* renamed from: b */
    private final int f27364b;
    /* renamed from: c */
    private final byte f27365c;
    /* renamed from: d */
    private final C4848k[] f27366d;
    /* renamed from: e */
    private final long f27367e;
    /* renamed from: f */
    private final String[] f27368f;
    /* renamed from: g */
    private final String[] f27369g = new String[0];
    /* renamed from: h */
    private final String[] f27370h;
    /* renamed from: i */
    private final int f27371i;
    /* renamed from: j */
    private final bg f27372j;
    /* renamed from: k */
    private final bn[] f27373k;
    /* renamed from: l */
    private final int f27374l;
    /* renamed from: m */
    private long f27375m;
    /* renamed from: n */
    private final C5203e f27376n;

    /* renamed from: com.google.android.m4b.maps.bo.bo$a */
    public static class C4842a {
        /* renamed from: a */
        private ba f17792a;
        /* renamed from: b */
        private int f17793b;
        /* renamed from: c */
        private int f17794c = -1;
        /* renamed from: d */
        private C4848k[] f17795d;
        /* renamed from: e */
        private long f17796e = -1;
        /* renamed from: f */
        private String[] f17797f;
        /* renamed from: g */
        private String[] f17798g;
        /* renamed from: h */
        private int f17799h = -1;
        /* renamed from: i */
        private bg f17800i = bg.f17745a;
        /* renamed from: j */
        private long f17801j = -1;
        /* renamed from: k */
        private final C5203e f17802k;

        public C4842a(C5203e c5203e) {
            this.f17802k = c5203e;
        }

        /* renamed from: a */
        public final C4842a m21716a(long j) {
            this.f17796e = j;
            return this;
        }

        /* renamed from: a */
        public final C4842a m21715a(int i) {
            this.f17794c = i;
            return this;
        }

        /* renamed from: b */
        public final C4842a m21723b(long j) {
            this.f17801j = j;
            return this;
        }

        /* renamed from: a */
        public final C4842a m21717a(ba baVar) {
            this.f17792a = baVar;
            return this;
        }

        /* renamed from: b */
        public final C4842a m21722b(int i) {
            this.f17793b = i;
            return this;
        }

        /* renamed from: a */
        public final C4842a m21720a(String[] strArr) {
            this.f17797f = strArr;
            return this;
        }

        /* renamed from: b */
        public final C4842a m21724b(String[] strArr) {
            this.f17798g = strArr;
            return this;
        }

        /* renamed from: c */
        public final C4842a m21725c(int i) {
            this.f17799h = i;
            return this;
        }

        /* renamed from: a */
        public final C4842a m21719a(C4848k[] c4848kArr) {
            this.f17795d = c4848kArr;
            return this;
        }

        /* renamed from: a */
        public final C4842a m21718a(bg bgVar) {
            this.f17800i = bgVar;
            return this;
        }

        /* renamed from: a */
        public final bo m21721a() {
            return new bo(this.f17792a, this.f17793b, (byte) 0, this.f17794c, this.f17797f == null ? new String[0] : r0.f17797f, r0.f17798g == null ? new String[0] : r0.f17798g, r0.f17799h, r0.f17795d == null ? new C4848k[0] : r0.f17795d, r0.f17800i, null, r0.f17796e, r0.f17801j, r0.f17802k);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bo$b */
    public interface C4843b extends Iterator<C4848k> {
        /* renamed from: a */
        C4848k mo5104a();

        /* renamed from: b */
        void mo5105b();

        /* renamed from: c */
        void mo5106c();
    }

    /* renamed from: com.google.android.m4b.maps.bo.bo$c */
    class C6515c implements C4843b {
        /* renamed from: a */
        private int f24135a;
        /* renamed from: b */
        private int f24136b;
        /* renamed from: c */
        private /* synthetic */ bo f24137c;

        private C6515c(bo boVar) {
            this.f24137c = boVar;
            this.f24135a = 0;
            this.f24136b = 0;
        }

        public final boolean hasNext() {
            return this.f24135a < this.f24137c.f27366d.length;
        }

        public final void remove() {
            throw new UnsupportedOperationException("remove() not supported");
        }

        /* renamed from: a */
        public final C4848k mo5104a() {
            return this.f24137c.f27366d[this.f24135a];
        }

        /* renamed from: b */
        public final void mo5105b() {
            this.f24136b = this.f24135a;
        }

        /* renamed from: c */
        public final void mo5106c() {
            this.f24135a = this.f24136b;
        }

        public final /* synthetic */ Object next() {
            C4848k[] a = this.f24137c.f27366d;
            int i = this.f24135a;
            this.f24135a = i + 1;
            return a[i];
        }
    }

    protected bo(ba baVar, int i, byte b, int i2, String[] strArr, String[] strArr2, int i3, C4848k[] c4848kArr, bg bgVar, bn[] bnVarArr, long j, long j2, C5203e c5203e) {
        this.f27363a = baVar;
        this.f27364b = i;
        this.f27365c = b;
        this.f27368f = strArr;
        this.f27370h = strArr2;
        this.f27371i = i3;
        this.f27366d = c4848kArr;
        this.f27372j = bgVar;
        this.f27373k = bnVarArr;
        this.f27374l = i2;
        this.f27367e = j;
        this.f27375m = j2;
        this.f27376n = c5203e;
    }

    /* renamed from: a */
    private static bo m32229a(ba baVar, DataInput dataInput, int i, byte b, int i2, int i3, bg bgVar, long j, long j2, C5203e c5203e) {
        DataInput dataInput2 = dataInput;
        int i4 = i;
        m32232a(dataInput);
        ba a = ba.m21605a(dataInput);
        if (a.m21620c() == baVar.m21620c() && a.m21621d() == baVar.m21621d()) {
            if (a.m21619b() == baVar.m21619b()) {
                int i5;
                String[] strArr;
                au a2;
                int readUnsignedByte = dataInput.readUnsignedByte();
                if (readUnsignedByte > 0) {
                    readUnsignedByte += 2000;
                }
                int i6 = readUnsignedByte;
                readUnsignedByte = bl.m21698a(dataInput);
                String[] strArr2 = new String[readUnsignedByte];
                int i7 = 0;
                for (i5 = 0; i5 < readUnsignedByte; i5++) {
                    strArr2[i5] = dataInput.readUTF().intern();
                }
                readUnsignedByte = bl.m21698a(dataInput);
                String[] strArr3 = new String[readUnsignedByte];
                for (i5 = 0; i5 < readUnsignedByte; i5++) {
                    strArr3[i5] = dataInput.readUTF().intern();
                }
                if (i4 == 11) {
                    i5 = bl.m21698a(dataInput);
                    for (int i8 = 0; i8 < i5; i8++) {
                        dataInput.readUTF();
                    }
                }
                aw a3 = aw.m21578a(dataInput, i);
                if (i4 == 11) {
                    strArr = new String[0];
                    a2 = au.m21572a(dataInput2, a3);
                } else {
                    i5 = bl.m21698a(dataInput);
                    strArr = new String[i5];
                    for (int i9 = 0; i9 < i5; i9++) {
                        strArr[i9] = dataInput.readUTF().intern();
                    }
                    a2 = null;
                }
                bc bcVar = new bc(i4, baVar, a3, strArr, a2);
                readUnsignedByte = bl.m21698a(dataInput);
                C4848k[] c4848kArr = new C4848k[readUnsignedByte];
                for (i4 = 0; i4 < readUnsignedByte; i4++) {
                    c4848kArr[i4] = m32231a(dataInput2, bcVar);
                }
                readUnsignedByte = bl.m21698a(dataInput);
                bn[] bnVarArr = new bn[readUnsignedByte];
                while (i7 < readUnsignedByte) {
                    bnVarArr[i7] = bn.m21713a(dataInput2, bcVar);
                    i7++;
                }
                return new bo(baVar, i2, b, i3, strArr2, strArr3, i6, c4848kArr, bgVar, bnVarArr, j, j2, c5203e);
            }
        }
        String valueOf = String.valueOf(baVar);
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length());
        stringBuilder.append("Expected tile coords: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" but received ");
        stringBuilder.append(valueOf2);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: a */
    static C4848k m32231a(DataInput dataInput, bc bcVar) {
        an anVar;
        DataInput dataInput2 = dataInput;
        bc bcVar2 = bcVar;
        int a = bl.m21698a(dataInput);
        if (bcVar.m21629a() == 11) {
            int a2 = bl.m21698a(dataInput);
            dataInput2.skipBytes(bl.m21698a(dataInput));
            anVar = new an(a2);
        } else {
            anVar = new an(-1);
        }
        C4699a c4699a = null;
        int i = 0;
        int a3;
        C4699a c4699a2;
        av a4;
        switch (a) {
            case 1:
                if (bcVar.m21629a() == 10) {
                    a3 = bl.m21698a(dataInput);
                    while (i < a3) {
                        bl.m21698a(dataInput);
                        i++;
                    }
                }
                return new C6520i(anVar.m21541a(), as.m21553a());
            case 2:
                aj a5 = aj.m21519a(dataInput2, bcVar.m21632b());
                av a6 = av.m21574a(dataInput, bcVar);
                int a7 = bl.m21698a(dataInput);
                C4854s[] c4854sArr = new C4854s[a7];
                for (int i2 = 0; i2 < a7; i2++) {
                    c4854sArr[i2] = C4854s.m21776a(dataInput2, bcVar2, a6);
                }
                int a8 = bl.m21698a(dataInput);
                byte readByte = dataInput.readByte();
                a3 = dataInput.readInt();
                if (ac.m21434a(1, a3)) {
                    c4699a = C4699a.m20894a(dataInput);
                } else if (ac.m21434a(2, a3)) {
                    c4699a = C4699a.m20897b(dataInput);
                }
                c4699a2 = c4699a;
                int i3 = a3 >>> 2;
                a3 = bl.m21698a(dataInput);
                int[] iArr = new int[a3];
                while (i < a3) {
                    iArr[i] = bl.m21698a(dataInput);
                    i++;
                }
                return new ao(anVar.m21541a(), c4699a2, a5, c4854sArr, a6.m21575a(), a6.m21577c(), a6.m21576b(), a8, readByte, i3, iArr);
            case 3:
                bj a9 = bj.m21689a(dataInput2, bcVar.m21632b());
                byte[] bArr = new byte[a9.m21691a()];
                dataInput2.readFully(bArr);
                a4 = av.m21574a(dataInput, bcVar);
                byte readByte2 = dataInput.readByte();
                a = dataInput.readInt();
                if (ac.m21434a(1, a)) {
                    c4699a = C4699a.m20894a(dataInput);
                } else if (ac.m21434a(2, a)) {
                    c4699a = C4699a.m20897b(dataInput);
                }
                c4699a2 = c4699a;
                a2 = bl.m21698a(dataInput);
                int[] iArr2 = new int[a2];
                while (i < a2) {
                    iArr2[i] = bl.m21698a(dataInput);
                    i++;
                }
                return new C6517d(anVar.m21541a(), c4699a2, a9, bArr, a4.m21575a(), a4.m21577c(), a4.m21576b(), readByte2, a, iArr2);
            case 4:
                return C6518e.m28700a(dataInput2, bcVar2, anVar);
            case 5:
                aj a10 = aj.m21519a(dataInput2, bcVar.m21632b());
                a4 = av.m21574a(dataInput, bcVar);
                byte readByte3 = dataInput.readByte();
                int readInt = dataInput.readInt();
                a = bl.m21698a(dataInput);
                int[] iArr3 = new int[a];
                while (i < a) {
                    iArr3[i] = bl.m21698a(dataInput);
                    i++;
                }
                return new C6528w(anVar.m21541a(), a10, a4.m21575a(), a4.m21577c(), a4.m21576b(), readByte3, readInt, iArr3);
            case 6:
                a2 = bl.m21698a(dataInput);
                byte[] bArr2 = new byte[dataInput.readInt()];
                dataInput2.readFully(bArr2);
                byte readByte4 = dataInput.readByte();
                a3 = bl.m21698a(dataInput);
                int[] iArr4 = new int[a3];
                while (i < a3) {
                    iArr4[i] = bl.m21698a(dataInput);
                    i++;
                }
                return new ak(anVar.m21541a(), a2, bArr2, readByte4, as.m21553a(), iArr4);
            case 7:
                return ag.m28539a(dataInput2, bcVar2, anVar);
            case 8:
                return C6527u.m28768a(dataInput2, bcVar2, anVar);
            case 9:
                return bh.m28631a(dataInput2, bcVar2, anVar);
            case 11:
                return C7464v.m32266b(dataInput2, bcVar2, anVar);
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unknown feature type: ");
                stringBuilder.append(a);
                throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public final ba mo5099d() {
        return this.f27363a;
    }

    /* renamed from: e */
    public final int mo5100e() {
        return this.f27364b;
    }

    /* renamed from: m */
    public final byte m32252m() {
        return this.f27365c;
    }

    /* renamed from: l */
    private boolean mo7547l() {
        return (this.f27365c & 2) != 0;
    }

    /* renamed from: j */
    public final boolean mo5103j() {
        if (this.f27376n.m23227c() != null) {
            if (!this.f27376n.m23227c().m23232c()) {
                return !mo7547l();
            }
        }
        if (((this.f27365c & 1) != 0 ? 1 : null) == null) {
            if (mo7547l()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public String[] mo7543c() {
        return this.f27368f;
    }

    /* renamed from: n */
    public final int m32253n() {
        return this.f27371i;
    }

    /* renamed from: f */
    public String[] mo7544f() {
        return this.f27370h;
    }

    /* renamed from: g */
    public int mo7545g() {
        return this.f27366d.length;
    }

    /* renamed from: a */
    public C4848k mo7542a(int i) {
        return this.f27366d[i];
    }

    /* renamed from: o */
    protected final C4848k[] m32254o() {
        return this.f27366d;
    }

    /* renamed from: k */
    public C4843b mo7546k() {
        return new C6515c();
    }

    /* renamed from: p */
    public final int m32255p() {
        return this.f27373k != null ? this.f27373k.length : 0;
    }

    /* renamed from: b */
    public final bn m32240b(int i) {
        return this.f27373k != null ? this.f27373k[i] : 0;
    }

    /* renamed from: a */
    private static void m32232a(DataInput dataInput) {
        dataInput = dataInput.readInt();
        if (dataInput != 1146241364) {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("TILE_MAGIC expected. Found: ");
            stringBuilder.append(dataInput);
            throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public long mo7073a() {
        return this.f27367e;
    }

    /* renamed from: a */
    public boolean mo5096a(C4712d c4712d) {
        return (this.f27367e < 0 || C4712d.m20957c() <= this.f27367e) ? null : true;
    }

    /* renamed from: h */
    public final bg mo5101h() {
        return this.f27372j;
    }

    /* renamed from: i */
    public final int mo5102i() {
        return this.f27374l;
    }

    /* renamed from: b */
    public final boolean mo5097b(C4712d c4712d) {
        return (this.f27375m < 0 || C4712d.m20957c() <= this.f27375m) ? null : true;
    }

    /* renamed from: b */
    public final long mo7074b() {
        return this.f27375m;
    }

    /* renamed from: c */
    public final void mo5098c(C4712d c4712d) {
        if (m32228a(this.f27376n) > 0) {
            this.f27375m = C4712d.m20957c() + m32228a(this.f27376n);
        } else {
            this.f27375m = -1;
        }
    }

    /* renamed from: a */
    private static long m32228a(C5203e c5203e) {
        return (c5203e.m23223a() == null || !c5203e.m23223a().m23201a() || c5203e.m23227c() == null) ? -1 : c5203e.m23227c().m23230a();
    }

    /* renamed from: a */
    public static boolean m32233a(az azVar) {
        return (!(azVar.mo5101h() == bg.f17761q && ((bo) azVar).m32255p() == 0) && (azVar instanceof aa) == null) ? null : true;
    }

    /* renamed from: a */
    public static bo m32230a(ba baVar, byte[] bArr, int i, bg bgVar, long j, long j2, C5203e c5203e) {
        byte[] bArr2 = bArr;
        int i2 = i;
        DataInput c4666a = new C4666a(bArr2);
        c4666a.skipBytes(i2);
        int readInt = c4666a.readInt();
        int readInt2 = c4666a.readInt();
        m32232a(c4666a);
        int readUnsignedShort = c4666a.readUnsignedShort();
        if (readUnsignedShort == 10 || readUnsignedShort == 11) {
            int readInt3 = c4666a.readInt();
            long readLong = c4666a.readLong();
            int readUnsignedByte = c4666a.readUnsignedByte();
            long[] jArr = new long[]{(long) readInt, (long) readInt2, (long) readUnsignedShort, (long) readInt3, readLong, (long) readUnsignedByte};
            readInt = (int) jArr[0];
            readInt2 = (int) jArr[1];
            readUnsignedShort = (int) jArr[2];
            readInt3 = (int) jArr[3];
            long j3 = jArr[4];
            byte b = (byte) ((int) jArr[5]);
            i2 += 27;
            int length = bArr2.length - i2;
            C4868i c4868i = new C4868i();
            byte[] bArr3 = new byte[40];
            C4868i.m21805a(baVar.m21620c(), baVar.m21621d(), baVar.m21619b(), readUnsignedShort, readInt3, j3, bArr3);
            c4868i.m21809a(bArr3, 256);
            c4868i.m21810a(bArr2, i2, length);
            try {
                C4971a a = C4972d.m22242a(bArr2, i2, length);
                byte[] a2 = a.m22240a();
                int b2 = a.m22241b();
                C4666a c4666a2 = new C4666a(a2);
                bo a3 = m32229a(baVar, c4666a2, readUnsignedShort, b, readInt, readInt2, bgVar, j, j2, c5203e);
                if (c4666a2.m20865a() != b2) {
                    String valueOf = String.valueOf(a3.f27363a);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    stringBuilder.append("Byte stream not fully read for: ");
                    stringBuilder.append(valueOf);
                    throw new IOException(stringBuilder.toString());
                }
                C4978f.m22259a(a2);
                return a3;
            } catch (DataFormatException e) {
                throw new IOException(e.getMessage());
            }
        }
        valueOf = String.valueOf("Version mismatch: 10 or 11 expected, ");
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder.append(valueOf);
        stringBuilder.append(readUnsignedShort);
        stringBuilder.append(" found");
        throw new IOException(stringBuilder.toString());
    }
}
