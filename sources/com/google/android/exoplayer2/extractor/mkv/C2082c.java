package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.c */
final class C2082c {
    /* renamed from: a */
    private final C2302k f5781a = new C2302k(8);
    /* renamed from: b */
    private int f5782b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m7454a(com.google.android.exoplayer2.extractor.ExtractorInput r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r20.getLength();
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        r7 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r6 == 0) goto L_0x0016;
    L_0x0010:
        r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0016;
    L_0x0015:
        r7 = r2;
    L_0x0016:
        r6 = (int) r7;
        r7 = r0.f5781a;
        r7 = r7.f6929a;
        r8 = 4;
        r9 = 0;
        r1.peekFully(r7, r9, r8);
        r7 = r0.f5781a;
        r10 = r7.m8401m();
        r0.f5782b = r8;
    L_0x0028:
        r7 = 440786851; // 0x1a45dfa3 float:4.0919297E-23 double:2.1777764E-315;
        r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));
        r7 = 1;
        if (r12 == 0) goto L_0x0053;
    L_0x0030:
        r8 = r0.f5782b;
        r8 = r8 + r7;
        r0.f5782b = r8;
        if (r8 != r6) goto L_0x0038;
    L_0x0037:
        return r9;
    L_0x0038:
        r8 = r0.f5781a;
        r8 = r8.f6929a;
        r1.peekFully(r8, r9, r7);
        r7 = 8;
        r7 = r10 << r7;
        r10 = -256; // 0xffffffffffffff00 float:NaN double:NaN;
        r12 = r7 & r10;
        r7 = r0.f5781a;
        r7 = r7.f6929a;
        r7 = r7[r9];
        r7 = r7 & 255;
        r7 = (long) r7;
        r10 = r12 | r7;
        goto L_0x0028;
    L_0x0053:
        r10 = r19.m7453b(r20);
        r6 = r0.f5782b;
        r12 = (long) r6;
        r14 = -9223372036854775808;
        r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x00af;
    L_0x0060:
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x006b;
    L_0x0064:
        r4 = r12 + r10;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 < 0) goto L_0x006b;
    L_0x006a:
        goto L_0x00af;
    L_0x006b:
        r2 = r0.f5782b;
        r2 = (long) r2;
        r4 = r12 + r10;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x00a2;
    L_0x0074:
        r2 = r19.m7453b(r20);
        r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r4 != 0) goto L_0x007d;
    L_0x007c:
        return r9;
    L_0x007d:
        r2 = r19.m7453b(r20);
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x00a1;
    L_0x0087:
        r16 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r6 <= 0) goto L_0x008f;
    L_0x008e:
        goto L_0x00a1;
    L_0x008f:
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x009f;
    L_0x0093:
        r4 = (int) r2;
        r1.advancePeekPosition(r4);
        r4 = r0.f5782b;
        r4 = (long) r4;
        r7 = r4 + r2;
        r2 = (int) r7;
        r0.f5782b = r2;
    L_0x009f:
        r7 = 1;
        goto L_0x006b;
    L_0x00a1:
        return r9;
    L_0x00a2:
        r1 = r0.f5782b;
        r1 = (long) r1;
        r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x00ac;
    L_0x00a9:
        r18 = 1;
        goto L_0x00ae;
    L_0x00ac:
        r18 = 0;
    L_0x00ae:
        return r18;
    L_0x00af:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.c.a(com.google.android.exoplayer2.extractor.ExtractorInput):boolean");
    }

    /* renamed from: b */
    private long m7453b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i = 0;
        extractorInput.peekFully(this.f5781a.f6929a, 0, 1);
        int i2 = this.f5781a.f6929a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        i2 &= i3 ^ -1;
        extractorInput.peekFully(this.f5781a.f6929a, 1, i4);
        while (i < i4) {
            i++;
            i2 = (this.f5781a.f6929a[i] & 255) + (i2 << 8);
        }
        this.f5782b += i4 + 1;
        return (long) i2;
    }
}
