package com.google.android.exoplayer2.metadata.id3;

import android.util.Log;
import com.google.android.exoplayer2.metadata.C4243a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class Id3Decoder implements MetadataDecoder {
    /* renamed from: a */
    public static final FramePredicate f11332a = new C36681();
    /* renamed from: b */
    public static final int f11333b = C2314v.m8499g("ID3");
    /* renamed from: c */
    private final FramePredicate f11334c;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.id3.Id3Decoder$a */
    private static final class C2141a {
        /* renamed from: a */
        private final int f6132a;
        /* renamed from: b */
        private final boolean f6133b;
        /* renamed from: c */
        private final int f6134c;

        public C2141a(int i, boolean z, int i2) {
            this.f6132a = i;
            this.f6133b = z;
            this.f6134c = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.id3.Id3Decoder$1 */
    static class C36681 implements FramePredicate {
        public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return false;
        }

        C36681() {
        }
    }

    /* renamed from: a */
    private static String m13837a(int i) {
        switch (i) {
            case 0:
                return "ISO-8859-1";
            case 1:
                return "UTF-16";
            case 2:
                return "UTF-16BE";
            case 3:
                return "UTF-8";
            default:
                return "ISO-8859-1";
        }
    }

    /* renamed from: b */
    private static int m13841b(int i) {
        if (i != 0) {
            if (i != 3) {
                return 2;
            }
        }
        return 1;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.f11334c = framePredicate;
    }

    public Metadata decode(C4243a c4243a) {
        c4243a = c4243a.b;
        return m13852a(c4243a.array(), c4243a.limit());
    }

    /* renamed from: a */
    public Metadata m13852a(byte[] bArr, int i) {
        List arrayList = new ArrayList();
        C2302k c2302k = new C2302k(bArr, i);
        bArr = m13833a(c2302k);
        if (bArr == null) {
            return null;
        }
        int d = c2302k.m8389d();
        int i2 = bArr.f6132a == 2 ? 6 : 10;
        int b = bArr.f6134c;
        if (bArr.f6133b) {
            b = m13851f(c2302k, bArr.f6134c);
        }
        c2302k.m8386b(d + b);
        boolean z = false;
        if (!m13840a(c2302k, bArr.f6132a, i2, false)) {
            if (bArr.f6132a == 4 && m13840a(c2302k, 4, i2, true)) {
                z = true;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to validate ID3 tag with majorVersion=");
                stringBuilder.append(bArr.f6132a);
                Log.w("Id3Decoder", stringBuilder.toString());
                return null;
            }
        }
        while (c2302k.m8385b() >= i2) {
            i = m13834a(bArr.f6132a, c2302k, z, i2, this.f11334c);
            if (i != 0) {
                arrayList.add(i);
            }
        }
        return new Metadata(arrayList);
    }

    /* renamed from: a */
    private static C2141a m13833a(C2302k c2302k) {
        if (c2302k.m8385b() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int k = c2302k.m8399k();
        if (k != f11333b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected first three bytes of ID3 tag header: ");
            stringBuilder.append(k);
            Log.w("Id3Decoder", stringBuilder.toString());
            return null;
        }
        k = c2302k.m8395g();
        boolean z = true;
        c2302k.m8390d(1);
        int g = c2302k.m8395g();
        int t = c2302k.m8408t();
        if (k == 2) {
            if (((g & 64) != null ? true : null) != null) {
                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (k == 3) {
            if (((g & 64) != 0 ? 1 : null) != null) {
                r1 = c2302k.m8403o();
                c2302k.m8390d(r1);
                t -= r1 + 4;
            }
        } else if (k == 4) {
            if (((g & 64) != 0 ? 1 : null) != null) {
                r1 = c2302k.m8408t();
                c2302k.m8390d(r1 - 4);
                t -= r1;
            }
            if (((g & 16) != null ? true : null) != null) {
                t -= 10;
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Skipped ID3 tag with unsupported majorVersion=");
            stringBuilder.append(k);
            Log.w("Id3Decoder", stringBuilder.toString());
            return null;
        }
        if (k >= 4 || (g & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == null) {
            z = false;
        }
        return new C2141a(k, z, t);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static boolean m13840a(com.google.android.exoplayer2.util.C2302k r20, int r21, int r22, boolean r23) {
        /*
        r1 = r20;
        r2 = r21;
        r3 = r20.m8389d();
    L_0x0008:
        r4 = r20.m8385b();	 Catch:{ all -> 0x00bc }
        r5 = 1;
        r6 = r22;
        if (r4 < r6) goto L_0x00b8;
    L_0x0011:
        r4 = 3;
        r7 = 0;
        if (r2 < r4) goto L_0x0022;
    L_0x0015:
        r8 = r20.m8403o();	 Catch:{ all -> 0x00bc }
        r9 = r20.m8401m();	 Catch:{ all -> 0x00bc }
        r11 = r20.m8396h();	 Catch:{ all -> 0x00bc }
        goto L_0x002c;
    L_0x0022:
        r8 = r20.m8399k();	 Catch:{ all -> 0x00bc }
        r9 = r20.m8399k();	 Catch:{ all -> 0x00bc }
        r9 = (long) r9;
        r11 = 0;
    L_0x002c:
        r12 = 0;
        if (r8 != 0) goto L_0x003a;
    L_0x0030:
        r8 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r8 != 0) goto L_0x003a;
    L_0x0034:
        if (r11 != 0) goto L_0x003a;
    L_0x0036:
        r1.m8388c(r3);
        return r5;
    L_0x003a:
        r8 = 4;
        if (r2 != r8) goto L_0x0074;
    L_0x003d:
        if (r23 != 0) goto L_0x0074;
    L_0x003f:
        r14 = 8421504; // 0x808080 float:1.180104E-38 double:4.160776E-317;
        r16 = r9 & r14;
        r14 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x004c;
    L_0x0048:
        r1.m8388c(r3);
        return r7;
    L_0x004c:
        r12 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r12;
        r16 = 8;
        r16 = r9 >> r16;
        r18 = r16 & r12;
        r16 = 7;
        r16 = r18 << r16;
        r18 = r14 | r16;
        r14 = 16;
        r14 = r9 >> r14;
        r16 = r14 & r12;
        r14 = 14;
        r14 = r16 << r14;
        r16 = r18 | r14;
        r14 = 24;
        r9 = r9 >> r14;
        r14 = r9 & r12;
        r9 = 21;
        r9 = r14 << r9;
        r12 = r16 | r9;
        goto L_0x0075;
    L_0x0074:
        r12 = r9;
    L_0x0075:
        if (r2 != r8) goto L_0x0084;
    L_0x0077:
        r4 = r11 & 64;
        if (r4 == 0) goto L_0x007d;
    L_0x007b:
        r4 = 1;
        goto L_0x007e;
    L_0x007d:
        r4 = 0;
    L_0x007e:
        r8 = r11 & 1;
        if (r8 == 0) goto L_0x0093;
    L_0x0082:
        r8 = 1;
        goto L_0x0094;
    L_0x0084:
        if (r2 != r4) goto L_0x0092;
    L_0x0086:
        r4 = r11 & 32;
        if (r4 == 0) goto L_0x008c;
    L_0x008a:
        r4 = 1;
        goto L_0x008d;
    L_0x008c:
        r4 = 0;
    L_0x008d:
        r8 = r11 & 128;
        if (r8 == 0) goto L_0x0093;
    L_0x0091:
        goto L_0x0082;
    L_0x0092:
        r4 = 0;
    L_0x0093:
        r8 = 0;
    L_0x0094:
        if (r4 == 0) goto L_0x0097;
    L_0x0096:
        goto L_0x0098;
    L_0x0097:
        r5 = 0;
    L_0x0098:
        if (r8 == 0) goto L_0x009c;
    L_0x009a:
        r5 = r5 + 4;
    L_0x009c:
        r4 = (long) r5;
        r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r8 >= 0) goto L_0x00a5;
    L_0x00a1:
        r1.m8388c(r3);
        return r7;
    L_0x00a5:
        r4 = r20.m8385b();	 Catch:{ all -> 0x00bc }
        r4 = (long) r4;
        r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1));
        if (r8 >= 0) goto L_0x00b2;
    L_0x00ae:
        r1.m8388c(r3);
        return r7;
    L_0x00b2:
        r4 = (int) r12;
        r1.m8390d(r4);	 Catch:{ all -> 0x00bc }
        goto L_0x0008;
    L_0x00b8:
        r1.m8388c(r3);
        return r5;
    L_0x00bc:
        r0 = move-exception;
        r2 = r0;
        r1.m8388c(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.a(com.google.android.exoplayer2.util.k, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame m13834a(int r20, com.google.android.exoplayer2.util.C2302k r21, boolean r22, int r23, com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r24) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = r20;
        r8 = r21;
        r9 = r21.m8395g();
        r10 = r21.m8395g();
        r11 = r21.m8395g();
        r12 = 3;
        if (r7 < r12) goto L_0x0019;
    L_0x0013:
        r1 = r21.m8395g();
        r14 = r1;
        goto L_0x001a;
    L_0x0019:
        r14 = 0;
    L_0x001a:
        r15 = 4;
        if (r7 != r15) goto L_0x003d;
    L_0x001d:
        r1 = r21.m8409u();
        if (r22 != 0) goto L_0x003a;
    L_0x0023:
        r2 = r1 & 255;
        r3 = r1 >> 8;
        r3 = r3 & 255;
        r3 = r3 << 7;
        r2 = r2 | r3;
        r3 = r1 >> 16;
        r3 = r3 & 255;
        r3 = r3 << 14;
        r2 = r2 | r3;
        r1 = r1 >> 24;
        r1 = r1 & 255;
        r1 = r1 << 21;
        r1 = r1 | r2;
    L_0x003a:
        r16 = r1;
        goto L_0x0049;
    L_0x003d:
        if (r7 != r12) goto L_0x0044;
    L_0x003f:
        r1 = r21.m8409u();
        goto L_0x003a;
    L_0x0044:
        r1 = r21.m8399k();
        goto L_0x003a;
    L_0x0049:
        if (r7 < r12) goto L_0x0051;
    L_0x004b:
        r1 = r21.m8396h();
        r6 = r1;
        goto L_0x0052;
    L_0x0051:
        r6 = 0;
    L_0x0052:
        r17 = 0;
        if (r9 != 0) goto L_0x0068;
    L_0x0056:
        if (r10 != 0) goto L_0x0068;
    L_0x0058:
        if (r11 != 0) goto L_0x0068;
    L_0x005a:
        if (r14 != 0) goto L_0x0068;
    L_0x005c:
        if (r16 != 0) goto L_0x0068;
    L_0x005e:
        if (r6 != 0) goto L_0x0068;
    L_0x0060:
        r1 = r21.m8387c();
        r8.m8388c(r1);
        return r17;
    L_0x0068:
        r1 = r21.m8389d();
        r5 = r1 + r16;
        r1 = r21.m8387c();
        if (r5 <= r1) goto L_0x0083;
    L_0x0074:
        r1 = "Id3Decoder";
        r2 = "Frame size exceeds remaining tag data";
        android.util.Log.w(r1, r2);
        r1 = r21.m8387c();
        r8.m8388c(r1);
        return r17;
    L_0x0083:
        if (r24 == 0) goto L_0x0098;
    L_0x0085:
        r1 = r24;
        r2 = r7;
        r3 = r9;
        r4 = r10;
        r13 = r5;
        r5 = r11;
        r15 = r6;
        r6 = r14;
        r1 = r1.evaluate(r2, r3, r4, r5, r6);
        if (r1 != 0) goto L_0x009a;
    L_0x0094:
        r8.m8388c(r13);
        return r17;
    L_0x0098:
        r13 = r5;
        r15 = r6;
    L_0x009a:
        r1 = 1;
        if (r7 != r12) goto L_0x00b7;
    L_0x009d:
        r2 = r15 & 128;
        if (r2 == 0) goto L_0x00a3;
    L_0x00a1:
        r2 = 1;
        goto L_0x00a4;
    L_0x00a3:
        r2 = 0;
    L_0x00a4:
        r3 = r15 & 64;
        if (r3 == 0) goto L_0x00aa;
    L_0x00a8:
        r3 = 1;
        goto L_0x00ab;
    L_0x00aa:
        r3 = 0;
    L_0x00ab:
        r4 = r15 & 32;
        if (r4 == 0) goto L_0x00b1;
    L_0x00af:
        r4 = 1;
        goto L_0x00b2;
    L_0x00b1:
        r4 = 0;
    L_0x00b2:
        r18 = r4;
        r5 = 0;
        r4 = r2;
        goto L_0x00ee;
    L_0x00b7:
        r2 = 4;
        if (r7 != r2) goto L_0x00e8;
    L_0x00ba:
        r2 = r15 & 64;
        if (r2 == 0) goto L_0x00c0;
    L_0x00be:
        r2 = 1;
        goto L_0x00c1;
    L_0x00c0:
        r2 = 0;
    L_0x00c1:
        r3 = r15 & 8;
        if (r3 == 0) goto L_0x00c7;
    L_0x00c5:
        r3 = 1;
        goto L_0x00c8;
    L_0x00c7:
        r3 = 0;
    L_0x00c8:
        r4 = r15 & 4;
        if (r4 == 0) goto L_0x00ce;
    L_0x00cc:
        r4 = 1;
        goto L_0x00cf;
    L_0x00ce:
        r4 = 0;
    L_0x00cf:
        r5 = r15 & 2;
        if (r5 == 0) goto L_0x00d5;
    L_0x00d3:
        r5 = 1;
        goto L_0x00d6;
    L_0x00d5:
        r5 = 0;
    L_0x00d6:
        r6 = r15 & 1;
        if (r6 == 0) goto L_0x00dd;
    L_0x00da:
        r18 = 1;
        goto L_0x00df;
    L_0x00dd:
        r18 = 0;
    L_0x00df:
        r19 = r18;
        r18 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r19;
        goto L_0x00ee;
    L_0x00e8:
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r18 = 0;
    L_0x00ee:
        if (r2 != 0) goto L_0x021b;
    L_0x00f0:
        if (r3 == 0) goto L_0x00f4;
    L_0x00f2:
        goto L_0x021b;
    L_0x00f4:
        if (r18 == 0) goto L_0x00fb;
    L_0x00f6:
        r16 = r16 + -1;
        r8.m8390d(r1);
    L_0x00fb:
        if (r4 == 0) goto L_0x0103;
    L_0x00fd:
        r16 = r16 + -4;
        r1 = 4;
        r8.m8390d(r1);
    L_0x0103:
        r1 = r16;
        if (r5 == 0) goto L_0x010b;
    L_0x0107:
        r1 = m13851f(r8, r1);
    L_0x010b:
        r12 = r1;
        r1 = 84;
        r2 = 88;
        r3 = 2;
        if (r9 != r1) goto L_0x0121;
    L_0x0113:
        if (r10 != r2) goto L_0x0121;
    L_0x0115:
        if (r11 != r2) goto L_0x0121;
    L_0x0117:
        if (r7 == r3) goto L_0x011b;
    L_0x0119:
        if (r14 != r2) goto L_0x0121;
    L_0x011b:
        r1 = m13835a(r8, r12);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0121:
        if (r9 != r1) goto L_0x0131;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0123:
        r1 = m13838a(r7, r9, r10, r11, r14);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r1 = m13836a(r8, r12, r1);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x012d:
        r0 = move-exception;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r1 = r0;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x0217;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0131:
        r4 = 87;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r9 != r4) goto L_0x0143;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0135:
        if (r10 != r2) goto L_0x0143;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0137:
        if (r11 != r2) goto L_0x0143;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0139:
        if (r7 == r3) goto L_0x013d;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x013b:
        if (r14 != r2) goto L_0x0143;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x013d:
        r1 = m13844b(r8, r12);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0143:
        r2 = 87;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r9 != r2) goto L_0x0151;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0147:
        r1 = m13838a(r7, r9, r10, r11, r14);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r1 = m13845b(r8, r12, r1);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0151:
        r2 = 73;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r4 = 80;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r9 != r4) goto L_0x0167;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0157:
        r5 = 82;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r10 != r5) goto L_0x0167;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x015b:
        if (r11 != r2) goto L_0x0167;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x015d:
        r5 = 86;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r14 != r5) goto L_0x0167;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0161:
        r1 = m13848c(r8, r12);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0167:
        r5 = 71;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r6 = 79;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r9 != r5) goto L_0x017f;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x016d:
        r5 = 69;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r10 != r5) goto L_0x017f;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0171:
        if (r11 != r6) goto L_0x017f;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0173:
        r5 = 66;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r14 == r5) goto L_0x0179;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0177:
        if (r7 != r3) goto L_0x017f;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0179:
        r1 = m13849d(r8, r12);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x017f:
        r5 = 67;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r7 != r3) goto L_0x018a;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0183:
        if (r9 != r4) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0185:
        if (r10 != r2) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0187:
        if (r11 != r5) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0189:
        goto L_0x0194;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x018a:
        r15 = 65;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r9 != r15) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x018e:
        if (r10 != r4) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0190:
        if (r11 != r2) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0192:
        if (r14 != r5) goto L_0x0199;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0194:
        r1 = m13831a(r8, r12, r7);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0199:
        if (r9 != r5) goto L_0x01ac;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x019b:
        if (r10 != r6) goto L_0x01ac;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x019d:
        r2 = 77;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r11 != r2) goto L_0x01ac;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01a1:
        r2 = 77;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r14 == r2) goto L_0x01a7;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01a5:
        if (r7 != r3) goto L_0x01ac;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01a7:
        r1 = m13850e(r8, r12);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01ac:
        if (r9 != r5) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01ae:
        r2 = 72;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r10 != r2) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01b2:
        r2 = 65;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        if (r11 != r2) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01b6:
        if (r14 != r4) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01b8:
        r1 = r8;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r2 = r12;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3 = r7;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r4 = r22;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r5 = r23;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r6 = r24;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r1 = m13832a(r1, r2, r3, r4, r5, r6);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01c6:
        if (r9 != r5) goto L_0x01dc;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01c8:
        if (r10 != r1) goto L_0x01dc;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01ca:
        if (r11 != r6) goto L_0x01dc;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01cc:
        if (r14 != r5) goto L_0x01dc;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01ce:
        r1 = r8;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r2 = r12;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3 = r7;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r4 = r22;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r5 = r23;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r6 = r24;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r1 = m13843b(r1, r2, r3, r4, r5, r6);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        goto L_0x01e4;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01dc:
        r1 = m13838a(r7, r9, r10, r11, r14);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r1 = m13847c(r8, r12, r1);	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01e4:
        if (r1 != 0) goto L_0x0208;	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x01e6:
        r2 = "Id3Decoder";	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3.<init>();	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r4 = "Failed to decode frame: id=";	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3.append(r4);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r4 = m13838a(r7, r9, r10, r11, r14);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3.append(r4);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r4 = ", frameSize=";	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3.append(r4);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3.append(r12);	 Catch:{ UnsupportedEncodingException -> 0x020c }
        r3 = r3.toString();	 Catch:{ UnsupportedEncodingException -> 0x020c }
        android.util.Log.w(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x020c }
    L_0x0208:
        r8.m8388c(r13);
        return r1;
    L_0x020c:
        r1 = "Id3Decoder";	 Catch:{ all -> 0x012d }
        r2 = "Unsupported character encoding";	 Catch:{ all -> 0x012d }
        android.util.Log.w(r1, r2);	 Catch:{ all -> 0x012d }
        r8.m8388c(r13);
        return r17;
    L_0x0217:
        r8.m8388c(r13);
        throw r1;
    L_0x021b:
        r1 = "Id3Decoder";
        r2 = "Skipping unsupported compressed or encrypted frame";
        android.util.Log.w(r1, r2);
        r8.m8388c(r13);
        return r17;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.a(int, com.google.android.exoplayer2.util.k, boolean, int, com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: a */
    private static TextInformationFrame m13835a(C2302k c2302k, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int g = c2302k.m8395g();
        String a = m13837a(g);
        i--;
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        c2302k = m13830a(bArr, 0, g);
        i = new String(bArr, 0, c2302k, a);
        int b = c2302k + m13841b(g);
        return new TextInformationFrame("TXXX", i, m13839a(bArr, b, m13830a(bArr, b, g), a));
    }

    /* renamed from: a */
    private static TextInformationFrame m13836a(C2302k c2302k, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int g = c2302k.m8395g();
        String a = m13837a(g);
        i--;
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        return new TextInformationFrame(str, null, new String(bArr, 0, m13830a(bArr, 0, g), a));
    }

    /* renamed from: b */
    private static UrlLinkFrame m13844b(C2302k c2302k, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int g = c2302k.m8395g();
        String a = m13837a(g);
        i--;
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        c2302k = m13830a(bArr, 0, g);
        i = new String(bArr, 0, c2302k, a);
        int b = c2302k + m13841b(g);
        return new UrlLinkFrame("WXXX", i, m13839a(bArr, b, m13842b(bArr, b), "ISO-8859-1"));
    }

    /* renamed from: b */
    private static UrlLinkFrame m13845b(C2302k c2302k, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m13842b(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: c */
    private static PrivFrame m13848c(C2302k c2302k, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        c2302k = m13842b(bArr, 0);
        return new PrivFrame(new String(bArr, 0, c2302k, "ISO-8859-1"), m13846b(bArr, c2302k + 1, bArr.length));
    }

    /* renamed from: d */
    private static GeobFrame m13849d(C2302k c2302k, int i) throws UnsupportedEncodingException {
        int g = c2302k.m8395g();
        String a = m13837a(g);
        i--;
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        c2302k = m13842b(bArr, 0);
        i = new String(bArr, 0, c2302k, "ISO-8859-1");
        int i2 = c2302k + 1;
        int a2 = m13830a(bArr, i2, g);
        c2302k = m13839a(bArr, i2, a2, a);
        a2 += m13841b(g);
        int a3 = m13830a(bArr, a2, g);
        return new GeobFrame(i, c2302k, m13839a(bArr, a2, a3, a), m13846b(bArr, a3 + m13841b(g), bArr.length));
    }

    /* renamed from: a */
    private static ApicFrame m13831a(C2302k c2302k, int i, int i2) throws UnsupportedEncodingException {
        int g = c2302k.m8395g();
        String a = m13837a(g);
        i--;
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        if (i2 == 2) {
            i = new StringBuilder();
            i.append("image/");
            i.append(C2314v.m8493d(new String(bArr, 0, 3, "ISO-8859-1")));
            i = i.toString();
            if ("image/jpg".equals(i) != 0) {
                i = "image/jpeg";
            }
            i2 = i;
            i = 2;
        } else {
            i = m13842b(bArr, 0);
            i2 = C2314v.m8493d(new String(bArr, 0, i, "ISO-8859-1"));
            if (i2.indexOf(47) == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("image/");
                stringBuilder.append(i2);
                i2 = stringBuilder.toString();
            }
        }
        int i3 = bArr[i + 1] & 255;
        i += 2;
        c2302k = m13830a(bArr, i, g);
        return new ApicFrame(i2, new String(bArr, i, c2302k - i, a), i3, m13846b(bArr, c2302k + m13841b(g), bArr.length));
    }

    /* renamed from: e */
    private static CommentFrame m13850e(C2302k c2302k, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int g = c2302k.m8395g();
        String a = m13837a(g);
        byte[] bArr = new byte[3];
        c2302k.m8384a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        i -= 4;
        byte[] bArr2 = new byte[i];
        c2302k.m8384a(bArr2, 0, i);
        c2302k = m13830a(bArr2, 0, g);
        i = new String(bArr2, 0, c2302k, a);
        int b = c2302k + m13841b(g);
        return new CommentFrame(str, i, m13839a(bArr2, b, m13830a(bArr2, b, g), a));
    }

    /* renamed from: a */
    private static ChapterFrame m13832a(C2302k c2302k, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws UnsupportedEncodingException {
        C2302k c2302k2 = c2302k;
        int d = c2302k2.m8389d();
        int b = m13842b(c2302k2.f6929a, d);
        String str = new String(c2302k2.f6929a, d, b - d, "ISO-8859-1");
        c2302k2.m8388c(b + 1);
        int o = c2302k2.m8403o();
        int o2 = c2302k2.m8403o();
        long m = c2302k2.m8401m();
        long j = m == 4294967295L ? -1 : m;
        m = c2302k2.m8401m();
        long j2 = m == 4294967295L ? -1 : m;
        ArrayList arrayList = new ArrayList();
        d += i;
        while (c2302k2.m8389d() < d) {
            Id3Frame a = m13834a(i2, c2302k2, z, i3, framePredicate);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, o, o2, j, j2, id3FrameArr);
    }

    /* renamed from: b */
    private static ChapterTocFrame m13843b(C2302k c2302k, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws UnsupportedEncodingException {
        C2302k c2302k2 = c2302k;
        int d = c2302k2.m8389d();
        int b = m13842b(c2302k2.f6929a, d);
        String str = new String(c2302k2.f6929a, d, b - d, "ISO-8859-1");
        c2302k2.m8388c(b + 1);
        b = c2302k2.m8395g();
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 1) != 0;
        int g = c2302k2.m8395g();
        String[] strArr = new String[g];
        for (int i4 = 0; i4 < g; i4++) {
            int d2 = c2302k2.m8389d();
            int b2 = m13842b(c2302k2.f6929a, d2);
            strArr[i4] = new String(c2302k2.f6929a, d2, b2 - d2, "ISO-8859-1");
            c2302k2.m8388c(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        d += i;
        while (c2302k2.m8389d() < d) {
            Id3Frame a = m13834a(i2, c2302k2, z, i3, framePredicate);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    /* renamed from: c */
    private static BinaryFrame m13847c(C2302k c2302k, int i, String str) {
        byte[] bArr = new byte[i];
        c2302k.m8384a(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: f */
    private static int m13851f(C2302k c2302k, int i) {
        Object obj = c2302k.f6929a;
        c2302k = c2302k.m8389d();
        while (true) {
            int i2 = c2302k + 1;
            if (i2 >= i) {
                return i;
            }
            if ((obj[c2302k] & 255) == 255 && obj[i2] == (byte) 0) {
                System.arraycopy(obj, c2302k + 2, obj, i2, (i - c2302k) - 2);
                i--;
            }
            c2302k = i2;
        }
    }

    /* renamed from: a */
    private static String m13838a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    private static int m13830a(byte[] bArr, int i, int i2) {
        i = m13842b(bArr, i);
        if (i2 != 0) {
            if (i2 != 3) {
                while (i < bArr.length - 1) {
                    if (i % 2 == 0 && bArr[i + 1] == 0) {
                        return i;
                    }
                    i = m13842b(bArr, i + 1);
                }
                return bArr.length;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m13842b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == (byte) 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static byte[] m13846b(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[null];
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: a */
    private static String m13839a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 > i) {
            if (i2 <= bArr.length) {
                return new String(bArr, i, i2 - i, str);
            }
        }
        return "";
    }
}
