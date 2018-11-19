package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.a */
final class C3632a implements C2081b {
    /* renamed from: a */
    private final byte[] f11046a = new byte[8];
    /* renamed from: b */
    private final Stack<C2080a> f11047b = new Stack();
    /* renamed from: c */
    private final C2083d f11048c = new C2083d();
    /* renamed from: d */
    private EbmlReaderOutput f11049d;
    /* renamed from: e */
    private int f11050e;
    /* renamed from: f */
    private int f11051f;
    /* renamed from: g */
    private long f11052g;

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.a$a */
    private static final class C2080a {
        /* renamed from: a */
        private final int f5779a;
        /* renamed from: b */
        private final long f5780b;

        private C2080a(int i, long j) {
            this.f5779a = i;
            this.f5780b = j;
        }
    }

    C3632a() {
    }

    /* renamed from: a */
    public void mo2288a(EbmlReaderOutput ebmlReaderOutput) {
        this.f11049d = ebmlReaderOutput;
    }

    /* renamed from: a */
    public void mo2287a() {
        this.f11050e = 0;
        this.f11047b.clear();
        this.f11048c.m7458a();
    }

    /* renamed from: a */
    public boolean mo2289a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        C2289a.m8313b(this.f11049d != null);
        while (true) {
            if (this.f11047b.isEmpty() || extractorInput.getPosition() < ((C2080a) this.f11047b.peek()).f5780b) {
                if (this.f11050e == 0) {
                    long a = this.f11048c.m7457a(extractorInput, true, false, 4);
                    if (a == -2) {
                        a = m13692b(extractorInput);
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f11051f = (int) a;
                    this.f11050e = 1;
                }
                if (this.f11050e == 1) {
                    this.f11052g = this.f11048c.m7457a(extractorInput, false, true, 8);
                    this.f11050e = 2;
                }
                int a2 = this.f11049d.mo2279a(this.f11051f);
                StringBuilder stringBuilder;
                switch (a2) {
                    case 0:
                        extractorInput.skipFully((int) this.f11052g);
                        this.f11050e = 0;
                    case 1:
                        long position = extractorInput.getPosition();
                        this.f11047b.add(new C2080a(this.f11051f, position + this.f11052g));
                        this.f11049d.mo2283a(this.f11051f, position, this.f11052g);
                        this.f11050e = 0;
                        return true;
                    case 2:
                        if (this.f11052g > 8) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid integer size: ");
                            stringBuilder.append(this.f11052g);
                            throw new ParserException(stringBuilder.toString());
                        }
                        this.f11049d.mo2282a(this.f11051f, m13690a(extractorInput, (int) this.f11052g));
                        this.f11050e = 0;
                        return true;
                    case 3:
                        if (this.f11052g > 2147483647L) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("String element size: ");
                            stringBuilder.append(this.f11052g);
                            throw new ParserException(stringBuilder.toString());
                        }
                        this.f11049d.mo2284a(this.f11051f, m13693c(extractorInput, (int) this.f11052g));
                        this.f11050e = 0;
                        return true;
                    case 4:
                        this.f11049d.mo2281a(this.f11051f, (int) this.f11052g, extractorInput);
                        this.f11050e = 0;
                        return true;
                    case 5:
                        if (this.f11052g == 4 || this.f11052g == 8) {
                            this.f11049d.mo2280a(this.f11051f, m13691b(extractorInput, (int) this.f11052g));
                            this.f11050e = 0;
                            return true;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid float size: ");
                        stringBuilder.append(this.f11052g);
                        throw new ParserException(stringBuilder.toString());
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Invalid element type ");
                        stringBuilder2.append(a2);
                        throw new ParserException(stringBuilder2.toString());
                }
            }
            this.f11049d.mo2286c(((C2080a) this.f11047b.pop()).f5779a);
            return true;
        }
    }

    /* renamed from: b */
    private long m13692b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.f11046a, 0, 4);
            int a = C2083d.m7455a(this.f11046a[0]);
            if (a != -1 && a <= 4) {
                int a2 = (int) C2083d.m7456a(this.f11046a, a, false);
                if (this.f11049d.mo2285b(a2)) {
                    extractorInput.skipFully(a);
                    return (long) a2;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    /* renamed from: a */
    private long m13690a(ExtractorInput extractorInput, int i) throws IOException, InterruptedException {
        int i2 = 0;
        extractorInput.readFully(this.f11046a, 0, i);
        long j = 0;
        while (i2 < i) {
            i2++;
            j = (j << 8) | ((long) (this.f11046a[i2] & 255));
        }
        return j;
    }

    /* renamed from: b */
    private double m13691b(ExtractorInput extractorInput, int i) throws IOException, InterruptedException {
        long a = m13690a(extractorInput, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) a);
        }
        return Double.longBitsToDouble(a);
    }

    /* renamed from: c */
    private String m13693c(ExtractorInput extractorInput, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        extractorInput.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == null) {
            i--;
        }
        return new String(bArr, 0, i);
    }
}
