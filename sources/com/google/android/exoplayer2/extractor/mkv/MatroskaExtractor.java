package com.google.android.exoplayer2.extractor.mkv;

import android.support.annotation.Nullable;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.C3608a;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2296g;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class MatroskaExtractor implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f10994a = new C36301();
    /* renamed from: b */
    private static final byte[] f10995b = new byte[]{(byte) 49, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 45, (byte) 45, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    /* renamed from: c */
    private static final byte[] f10996c = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    /* renamed from: d */
    private static final byte[] f10997d = C2314v.m8491c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    /* renamed from: e */
    private static final byte[] f10998e = new byte[]{(byte) 68, (byte) 105, (byte) 97, (byte) 108, (byte) 111, (byte) 103, (byte) 117, (byte) 101, (byte) 58, (byte) 32, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44};
    /* renamed from: f */
    private static final byte[] f10999f = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    /* renamed from: g */
    private static final UUID f11000g = new UUID(72057594037932032L, -9223371306706625679L);
    /* renamed from: A */
    private C2077b f11001A;
    /* renamed from: B */
    private boolean f11002B;
    /* renamed from: C */
    private int f11003C;
    /* renamed from: D */
    private long f11004D;
    /* renamed from: E */
    private boolean f11005E;
    /* renamed from: F */
    private long f11006F;
    /* renamed from: G */
    private long f11007G;
    /* renamed from: H */
    private long f11008H;
    /* renamed from: I */
    private C2296g f11009I;
    /* renamed from: J */
    private C2296g f11010J;
    /* renamed from: K */
    private boolean f11011K;
    /* renamed from: L */
    private int f11012L;
    /* renamed from: M */
    private long f11013M;
    /* renamed from: N */
    private long f11014N;
    /* renamed from: O */
    private int f11015O;
    /* renamed from: P */
    private int f11016P;
    /* renamed from: Q */
    private int[] f11017Q;
    /* renamed from: R */
    private int f11018R;
    /* renamed from: S */
    private int f11019S;
    /* renamed from: T */
    private int f11020T;
    /* renamed from: U */
    private int f11021U;
    /* renamed from: V */
    private boolean f11022V;
    /* renamed from: W */
    private boolean f11023W;
    /* renamed from: X */
    private boolean f11024X;
    /* renamed from: Y */
    private boolean f11025Y;
    /* renamed from: Z */
    private byte f11026Z;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private ExtractorOutput af;
    /* renamed from: h */
    private final C2081b f11027h;
    /* renamed from: i */
    private final C2083d f11028i;
    /* renamed from: j */
    private final SparseArray<C2077b> f11029j;
    /* renamed from: k */
    private final boolean f11030k;
    /* renamed from: l */
    private final C2302k f11031l;
    /* renamed from: m */
    private final C2302k f11032m;
    /* renamed from: n */
    private final C2302k f11033n;
    /* renamed from: o */
    private final C2302k f11034o;
    /* renamed from: p */
    private final C2302k f11035p;
    /* renamed from: q */
    private final C2302k f11036q;
    /* renamed from: r */
    private final C2302k f11037r;
    /* renamed from: s */
    private final C2302k f11038s;
    /* renamed from: t */
    private final C2302k f11039t;
    /* renamed from: u */
    private ByteBuffer f11040u;
    /* renamed from: v */
    private long f11041v;
    /* renamed from: w */
    private long f11042w;
    /* renamed from: x */
    private long f11043x;
    /* renamed from: y */
    private long f11044y;
    /* renamed from: z */
    private long f11045z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$b */
    private static final class C2077b {
        /* renamed from: A */
        public float f5730A;
        /* renamed from: B */
        public float f5731B;
        /* renamed from: C */
        public float f5732C;
        /* renamed from: D */
        public float f5733D;
        /* renamed from: E */
        public float f5734E;
        /* renamed from: F */
        public float f5735F;
        /* renamed from: G */
        public int f5736G;
        /* renamed from: H */
        public int f5737H;
        /* renamed from: I */
        public int f5738I;
        /* renamed from: J */
        public long f5739J;
        /* renamed from: K */
        public long f5740K;
        @Nullable
        /* renamed from: L */
        public C2078c f5741L;
        /* renamed from: M */
        public boolean f5742M;
        /* renamed from: N */
        public boolean f5743N;
        /* renamed from: O */
        public TrackOutput f5744O;
        /* renamed from: P */
        public int f5745P;
        /* renamed from: Q */
        private String f5746Q;
        /* renamed from: a */
        public String f5747a;
        /* renamed from: b */
        public int f5748b;
        /* renamed from: c */
        public int f5749c;
        /* renamed from: d */
        public int f5750d;
        /* renamed from: e */
        public boolean f5751e;
        /* renamed from: f */
        public byte[] f5752f;
        /* renamed from: g */
        public C2055a f5753g;
        /* renamed from: h */
        public byte[] f5754h;
        /* renamed from: i */
        public DrmInitData f5755i;
        /* renamed from: j */
        public int f5756j;
        /* renamed from: k */
        public int f5757k;
        /* renamed from: l */
        public int f5758l;
        /* renamed from: m */
        public int f5759m;
        /* renamed from: n */
        public int f5760n;
        /* renamed from: o */
        public byte[] f5761o;
        /* renamed from: p */
        public int f5762p;
        /* renamed from: q */
        public boolean f5763q;
        /* renamed from: r */
        public int f5764r;
        /* renamed from: s */
        public int f5765s;
        /* renamed from: t */
        public int f5766t;
        /* renamed from: u */
        public int f5767u;
        /* renamed from: v */
        public int f5768v;
        /* renamed from: w */
        public float f5769w;
        /* renamed from: x */
        public float f5770x;
        /* renamed from: y */
        public float f5771y;
        /* renamed from: z */
        public float f5772z;

        private C2077b() {
            this.f5756j = -1;
            this.f5757k = -1;
            this.f5758l = -1;
            this.f5759m = -1;
            this.f5760n = 0;
            this.f5761o = null;
            this.f5762p = -1;
            this.f5763q = false;
            this.f5764r = -1;
            this.f5765s = -1;
            this.f5766t = -1;
            this.f5767u = AdError.NETWORK_ERROR_CODE;
            this.f5768v = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            this.f5769w = -1.0f;
            this.f5770x = -1.0f;
            this.f5771y = -1.0f;
            this.f5772z = -1.0f;
            this.f5730A = -1.0f;
            this.f5731B = -1.0f;
            this.f5732C = -1.0f;
            this.f5733D = -1.0f;
            this.f5734E = -1.0f;
            this.f5735F = -1.0f;
            this.f5736G = 1;
            this.f5737H = -1;
            this.f5738I = C15645a.MAX_BYTE_SIZE_PER_FILE;
            this.f5739J = 0;
            this.f5740K = 0;
            this.f5743N = true;
            this.f5746Q = "eng";
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void m7442a(com.google.android.exoplayer2.extractor.ExtractorOutput r27, int r28) throws com.google.android.exoplayer2.ParserException {
            /*
            r26 = this;
            r0 = r26;
            r1 = r0.f5747a;
            r2 = r1.hashCode();
            r3 = 4;
            r4 = 8;
            r5 = 1;
            r6 = 0;
            r7 = 2;
            r8 = 3;
            r9 = -1;
            switch(r2) {
                case -2095576542: goto L_0x0156;
                case -2095575984: goto L_0x014c;
                case -1985379776: goto L_0x0141;
                case -1784763192: goto L_0x0136;
                case -1730367663: goto L_0x012b;
                case -1482641358: goto L_0x0120;
                case -1482641357: goto L_0x0115;
                case -1373388978: goto L_0x010a;
                case -933872740: goto L_0x00ff;
                case -538363189: goto L_0x00f4;
                case -538363109: goto L_0x00e9;
                case -425012669: goto L_0x00dd;
                case -356037306: goto L_0x00d1;
                case 62923557: goto L_0x00c5;
                case 62923603: goto L_0x00b9;
                case 62927045: goto L_0x00ad;
                case 82338133: goto L_0x00a2;
                case 82338134: goto L_0x0097;
                case 99146302: goto L_0x008b;
                case 444813526: goto L_0x007f;
                case 542569478: goto L_0x0073;
                case 725957860: goto L_0x0067;
                case 738597099: goto L_0x005b;
                case 855502857: goto L_0x0050;
                case 1422270023: goto L_0x0044;
                case 1809237540: goto L_0x0039;
                case 1950749482: goto L_0x002d;
                case 1950789798: goto L_0x0021;
                case 1951062397: goto L_0x0015;
                default: goto L_0x0013;
            };
        L_0x0013:
            goto L_0x0160;
        L_0x0015:
            r2 = "A_OPUS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x001d:
            r1 = 11;
            goto L_0x0161;
        L_0x0021:
            r2 = "A_FLAC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0029:
            r1 = 21;
            goto L_0x0161;
        L_0x002d:
            r2 = "A_EAC3";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0035:
            r1 = 16;
            goto L_0x0161;
        L_0x0039:
            r2 = "V_MPEG2";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0041:
            r1 = 2;
            goto L_0x0161;
        L_0x0044:
            r2 = "S_TEXT/UTF8";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x004c:
            r1 = 24;
            goto L_0x0161;
        L_0x0050:
            r2 = "V_MPEGH/ISO/HEVC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0058:
            r1 = 7;
            goto L_0x0161;
        L_0x005b:
            r2 = "S_TEXT/ASS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0063:
            r1 = 25;
            goto L_0x0161;
        L_0x0067:
            r2 = "A_PCM/INT/LIT";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x006f:
            r1 = 23;
            goto L_0x0161;
        L_0x0073:
            r2 = "A_DTS/EXPRESS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x007b:
            r1 = 19;
            goto L_0x0161;
        L_0x007f:
            r2 = "V_THEORA";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0087:
            r1 = 9;
            goto L_0x0161;
        L_0x008b:
            r2 = "S_HDMV/PGS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0093:
            r1 = 27;
            goto L_0x0161;
        L_0x0097:
            r2 = "V_VP9";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x009f:
            r1 = 1;
            goto L_0x0161;
        L_0x00a2:
            r2 = "V_VP8";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00aa:
            r1 = 0;
            goto L_0x0161;
        L_0x00ad:
            r2 = "A_DTS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00b5:
            r1 = 18;
            goto L_0x0161;
        L_0x00b9:
            r2 = "A_AC3";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00c1:
            r1 = 15;
            goto L_0x0161;
        L_0x00c5:
            r2 = "A_AAC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00cd:
            r1 = 12;
            goto L_0x0161;
        L_0x00d1:
            r2 = "A_DTS/LOSSLESS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00d9:
            r1 = 20;
            goto L_0x0161;
        L_0x00dd:
            r2 = "S_VOBSUB";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00e5:
            r1 = 26;
            goto L_0x0161;
        L_0x00e9:
            r2 = "V_MPEG4/ISO/AVC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00f1:
            r1 = 6;
            goto L_0x0161;
        L_0x00f4:
            r2 = "V_MPEG4/ISO/ASP";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x00fc:
            r1 = 4;
            goto L_0x0161;
        L_0x00ff:
            r2 = "S_DVBSUB";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0107:
            r1 = 28;
            goto L_0x0161;
        L_0x010a:
            r2 = "V_MS/VFW/FOURCC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0112:
            r1 = 8;
            goto L_0x0161;
        L_0x0115:
            r2 = "A_MPEG/L3";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x011d:
            r1 = 14;
            goto L_0x0161;
        L_0x0120:
            r2 = "A_MPEG/L2";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0128:
            r1 = 13;
            goto L_0x0161;
        L_0x012b:
            r2 = "A_VORBIS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0133:
            r1 = 10;
            goto L_0x0161;
        L_0x0136:
            r2 = "A_TRUEHD";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x013e:
            r1 = 17;
            goto L_0x0161;
        L_0x0141:
            r2 = "A_MS/ACM";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0149:
            r1 = 22;
            goto L_0x0161;
        L_0x014c:
            r2 = "V_MPEG4/ISO/SP";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x0154:
            r1 = 3;
            goto L_0x0161;
        L_0x0156:
            r2 = "V_MPEG4/ISO/AP";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0160;
        L_0x015e:
            r1 = 5;
            goto L_0x0161;
        L_0x0160:
            r1 = -1;
        L_0x0161:
            r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r10 = 0;
            switch(r1) {
                case 0: goto L_0x031e;
                case 1: goto L_0x031b;
                case 2: goto L_0x0318;
                case 3: goto L_0x0307;
                case 4: goto L_0x0307;
                case 5: goto L_0x0307;
                case 6: goto L_0x02f1;
                case 7: goto L_0x02dd;
                case 8: goto L_0x02c4;
                case 9: goto L_0x02c1;
                case 10: goto L_0x02b1;
                case 11: goto L_0x026b;
                case 12: goto L_0x0260;
                case 13: goto L_0x0258;
                case 14: goto L_0x0255;
                case 15: goto L_0x0251;
                case 16: goto L_0x024d;
                case 17: goto L_0x0242;
                case 18: goto L_0x023e;
                case 19: goto L_0x023e;
                case 20: goto L_0x023a;
                case 21: goto L_0x0231;
                case 22: goto L_0x01dc;
                case 23: goto L_0x01a7;
                case 24: goto L_0x01a3;
                case 25: goto L_0x019f;
                case 26: goto L_0x0195;
                case 27: goto L_0x0191;
                case 28: goto L_0x016f;
                default: goto L_0x0167;
            };
        L_0x0167:
            r1 = new com.google.android.exoplayer2.ParserException;
            r2 = "Unrecognized codec identifier.";
            r1.<init>(r2);
            throw r1;
        L_0x016f:
            r1 = "application/dvbsubs";
            r2 = new byte[r3];
            r3 = r0.f5754h;
            r3 = r3[r6];
            r2[r6] = r3;
            r3 = r0.f5754h;
            r3 = r3[r5];
            r2[r5] = r3;
            r3 = r0.f5754h;
            r3 = r3[r7];
            r2[r7] = r3;
            r3 = r0.f5754h;
            r3 = r3[r8];
            r2[r8] = r3;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0268;
        L_0x0191:
            r1 = "application/pgs";
            goto L_0x0320;
        L_0x0195:
            r1 = "application/vobsub";
            r2 = r0.f5754h;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0268;
        L_0x019f:
            r1 = "text/x-ssa";
            goto L_0x0320;
        L_0x01a3:
            r1 = "application/x-subrip";
            goto L_0x0320;
        L_0x01a7:
            r1 = "audio/raw";
            r2 = r0.f5737H;
            r2 = com.google.android.exoplayer2.util.C2314v.m8482b(r2);
            if (r2 != 0) goto L_0x01d5;
        L_0x01b1:
            r1 = "audio/x-unknown";
            r2 = "MatroskaExtractor";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Unsupported PCM bit depth: ";
            r3.append(r4);
            r4 = r0.f5737H;
            r3.append(r4);
            r4 = ". Setting mimeType to ";
            r3.append(r4);
            r3.append(r1);
            r3 = r3.toString();
            android.util.Log.w(r2, r3);
            goto L_0x0320;
        L_0x01d5:
            r12 = r1;
            r18 = r2;
            r2 = r10;
            r15 = -1;
            goto L_0x0325;
        L_0x01dc:
            r1 = "audio/raw";
            r2 = new com.google.android.exoplayer2.util.k;
            r3 = r0.f5754h;
            r2.<init>(r3);
            r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.C2077b.m7439b(r2);
            if (r2 == 0) goto L_0x0217;
        L_0x01eb:
            r2 = r0.f5737H;
            r2 = com.google.android.exoplayer2.util.C2314v.m8482b(r2);
            if (r2 != 0) goto L_0x01d5;
        L_0x01f3:
            r1 = "audio/x-unknown";
            r2 = "MatroskaExtractor";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Unsupported PCM bit depth: ";
            r3.append(r4);
            r4 = r0.f5737H;
            r3.append(r4);
            r4 = ". Setting mimeType to ";
            r3.append(r4);
            r3.append(r1);
            r3 = r3.toString();
            android.util.Log.w(r2, r3);
            goto L_0x0320;
        L_0x0217:
            r1 = "audio/x-unknown";
            r2 = "MatroskaExtractor";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
            r3.append(r4);
            r3.append(r1);
            r3 = r3.toString();
            android.util.Log.w(r2, r3);
            goto L_0x0320;
        L_0x0231:
            r1 = "audio/flac";
            r2 = r0.f5754h;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0268;
        L_0x023a:
            r1 = "audio/vnd.dts.hd";
            goto L_0x0320;
        L_0x023e:
            r1 = "audio/vnd.dts";
            goto L_0x0320;
        L_0x0242:
            r1 = "audio/true-hd";
            r2 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$c;
            r2.<init>();
            r0.f5741L = r2;
            goto L_0x0320;
        L_0x024d:
            r1 = "audio/eac3";
            goto L_0x0320;
        L_0x0251:
            r1 = "audio/ac3";
            goto L_0x0320;
        L_0x0255:
            r1 = "audio/mpeg";
            goto L_0x025a;
        L_0x0258:
            r1 = "audio/mpeg-L2";
        L_0x025a:
            r12 = r1;
            r2 = r10;
            r15 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            goto L_0x0323;
        L_0x0260:
            r1 = "audio/mp4a-latm";
            r2 = r0.f5754h;
            r2 = java.util.Collections.singletonList(r2);
        L_0x0268:
            r12 = r1;
            goto L_0x0322;
        L_0x026b:
            r1 = "audio/opus";
            r2 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            r3 = new java.util.ArrayList;
            r3.<init>(r8);
            r11 = r0.f5754h;
            r3.add(r11);
            r11 = java.nio.ByteBuffer.allocate(r4);
            r12 = java.nio.ByteOrder.nativeOrder();
            r11 = r11.order(r12);
            r12 = r0.f5739J;
            r11 = r11.putLong(r12);
            r11 = r11.array();
            r3.add(r11);
            r4 = java.nio.ByteBuffer.allocate(r4);
            r11 = java.nio.ByteOrder.nativeOrder();
            r4 = r4.order(r11);
            r11 = r0.f5740K;
            r4 = r4.putLong(r11);
            r4 = r4.array();
            r3.add(r4);
            r12 = r1;
            r2 = r3;
            r15 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            goto L_0x0323;
        L_0x02b1:
            r1 = "audio/vorbis";
            r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r3 = r0.f5754h;
            r3 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.C2077b.m7438a(r3);
            r12 = r1;
            r2 = r3;
            r15 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            goto L_0x0323;
        L_0x02c1:
            r1 = "video/x-unknown";
            goto L_0x0320;
        L_0x02c4:
            r1 = new com.google.android.exoplayer2.util.k;
            r2 = r0.f5754h;
            r1.<init>(r2);
            r1 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.C2077b.m7436a(r1);
            r2 = r1.first;
            r2 = (java.lang.String) r2;
            r1 = r1.second;
            r1 = (java.util.List) r1;
            r12 = r2;
            r15 = -1;
            r18 = -1;
            r2 = r1;
            goto L_0x0325;
        L_0x02dd:
            r1 = "video/hevc";
            r2 = new com.google.android.exoplayer2.util.k;
            r3 = r0.f5754h;
            r2.<init>(r3);
            r2 = com.google.android.exoplayer2.video.C2328b.m8523a(r2);
            r3 = r2.f6997a;
            r2 = r2.f6998b;
            r0.f5745P = r2;
            goto L_0x0304;
        L_0x02f1:
            r1 = "video/avc";
            r2 = new com.google.android.exoplayer2.util.k;
            r3 = r0.f5754h;
            r2.<init>(r3);
            r2 = com.google.android.exoplayer2.video.C2327a.m8521a(r2);
            r3 = r2.f6992a;
            r2 = r2.f6993b;
            r0.f5745P = r2;
        L_0x0304:
            r12 = r1;
            r2 = r3;
            goto L_0x0322;
        L_0x0307:
            r1 = "video/mp4v-es";
            r2 = r0.f5754h;
            if (r2 != 0) goto L_0x0310;
        L_0x030d:
            r2 = r10;
            goto L_0x0268;
        L_0x0310:
            r2 = r0.f5754h;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0268;
        L_0x0318:
            r1 = "video/mpeg2";
            goto L_0x0320;
        L_0x031b:
            r1 = "video/x-vnd.on2.vp9";
            goto L_0x0320;
        L_0x031e:
            r1 = "video/x-vnd.on2.vp8";
        L_0x0320:
            r12 = r1;
            r2 = r10;
        L_0x0322:
            r15 = -1;
        L_0x0323:
            r18 = -1;
        L_0x0325:
            r1 = r0.f5743N;
            r1 = r1 | r6;
            r3 = r0.f5742M;
            if (r3 == 0) goto L_0x032d;
        L_0x032c:
            r6 = 2;
        L_0x032d:
            r1 = r1 | r6;
            r3 = com.google.android.exoplayer2.util.C2297h.m8342a(r12);
            if (r3 == 0) goto L_0x0355;
        L_0x0334:
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r3 = r0.f5736G;
            r4 = r0.f5738I;
            r6 = r0.f5755i;
            r7 = r0.f5746Q;
            r16 = r3;
            r17 = r4;
            r19 = r2;
            r20 = r6;
            r21 = r1;
            r22 = r7;
            r1 = com.google.android.exoplayer2.Format.createAudioSampleFormat(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
            r8 = 1;
            goto L_0x0451;
        L_0x0355:
            r3 = com.google.android.exoplayer2.util.C2297h.m8343b(r12);
            if (r3 == 0) goto L_0x03cf;
        L_0x035b:
            r1 = r0.f5760n;
            if (r1 != 0) goto L_0x0375;
        L_0x035f:
            r1 = r0.f5758l;
            if (r1 != r9) goto L_0x0366;
        L_0x0363:
            r1 = r0.f5756j;
            goto L_0x0368;
        L_0x0366:
            r1 = r0.f5758l;
        L_0x0368:
            r0.f5758l = r1;
            r1 = r0.f5759m;
            if (r1 != r9) goto L_0x0371;
        L_0x036e:
            r1 = r0.f5757k;
            goto L_0x0373;
        L_0x0371:
            r1 = r0.f5759m;
        L_0x0373:
            r0.f5759m = r1;
        L_0x0375:
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r3 = r0.f5758l;
            if (r3 == r9) goto L_0x0391;
        L_0x037b:
            r3 = r0.f5759m;
            if (r3 == r9) goto L_0x0391;
        L_0x037f:
            r1 = r0.f5757k;
            r3 = r0.f5758l;
            r1 = r1 * r3;
            r1 = (float) r1;
            r3 = r0.f5756j;
            r4 = r0.f5759m;
            r3 = r3 * r4;
            r3 = (float) r3;
            r1 = r1 / r3;
            r21 = r1;
            goto L_0x0393;
        L_0x0391:
            r21 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        L_0x0393:
            r1 = r0.f5763q;
            if (r1 == 0) goto L_0x03a6;
        L_0x0397:
            r1 = r26.m7440c();
            r10 = new com.google.android.exoplayer2.video.ColorInfo;
            r3 = r0.f5764r;
            r4 = r0.f5766t;
            r5 = r0.f5765s;
            r10.<init>(r3, r4, r5, r1);
        L_0x03a6:
            r24 = r10;
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r1 = r0.f5756j;
            r3 = r0.f5757k;
            r18 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r20 = -1;
            r4 = r0.f5761o;
            r5 = r0.f5762p;
            r6 = r0.f5755i;
            r16 = r1;
            r17 = r3;
            r19 = r2;
            r22 = r4;
            r23 = r5;
            r25 = r6;
            r1 = com.google.android.exoplayer2.Format.createVideoSampleFormat(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
            r8 = 2;
            goto L_0x0451;
        L_0x03cf:
            r3 = "application/x-subrip";
            r3 = r3.equals(r12);
            if (r3 == 0) goto L_0x03e5;
        L_0x03d7:
            r2 = java.lang.Integer.toString(r28);
            r3 = r0.f5746Q;
            r4 = r0.f5755i;
            r1 = com.google.android.exoplayer2.Format.createTextSampleFormat(r2, r12, r1, r3, r4);
            goto L_0x0451;
        L_0x03e5:
            r3 = "text/x-ssa";
            r3 = r3.equals(r12);
            if (r3 == 0) goto L_0x041b;
        L_0x03ed:
            r2 = new java.util.ArrayList;
            r2.<init>(r7);
            r3 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.f10997d;
            r2.add(r3);
            r3 = r0.f5754h;
            r2.add(r3);
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r3 = r0.f5746Q;
            r17 = -1;
            r4 = r0.f5755i;
            r19 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r15 = r1;
            r16 = r3;
            r18 = r4;
            r21 = r2;
            r1 = com.google.android.exoplayer2.Format.createTextSampleFormat(r11, r12, r13, r14, r15, r16, r17, r18, r19, r21);
            goto L_0x0451;
        L_0x041b:
            r3 = "application/vobsub";
            r3 = r3.equals(r12);
            if (r3 != 0) goto L_0x043c;
        L_0x0423:
            r3 = "application/pgs";
            r3 = r3.equals(r12);
            if (r3 != 0) goto L_0x043c;
        L_0x042b:
            r3 = "application/dvbsubs";
            r3 = r3.equals(r12);
            if (r3 == 0) goto L_0x0434;
        L_0x0433:
            goto L_0x043c;
        L_0x0434:
            r1 = new com.google.android.exoplayer2.ParserException;
            r2 = "Unexpected MIME type.";
            r1.<init>(r2);
            throw r1;
        L_0x043c:
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r3 = r0.f5746Q;
            r4 = r0.f5755i;
            r15 = r1;
            r16 = r2;
            r17 = r3;
            r18 = r4;
            r1 = com.google.android.exoplayer2.Format.createImageSampleFormat(r11, r12, r13, r14, r15, r16, r17, r18);
        L_0x0451:
            r2 = r0.f5748b;
            r3 = r27;
            r2 = r3.track(r2, r8);
            r0.f5744O = r2;
            r2 = r0.f5744O;
            r2.format(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.b.a(com.google.android.exoplayer2.extractor.ExtractorOutput, int):void");
        }

        /* renamed from: a */
        public void m7441a() {
            if (this.f5741L != null) {
                this.f5741L.m7446a(this);
            }
        }

        /* renamed from: b */
        public void m7443b() {
            if (this.f5741L != null) {
                this.f5741L.m7444a();
            }
        }

        /* renamed from: c */
        private byte[] m7440c() {
            if (!(this.f5769w == -1.0f || this.f5770x == -1.0f || this.f5771y == -1.0f || this.f5772z == -1.0f || this.f5730A == -1.0f || this.f5731B == -1.0f || this.f5732C == -1.0f || this.f5733D == -1.0f || this.f5734E == -1.0f)) {
                if (this.f5735F != -1.0f) {
                    byte[] bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((int) ((this.f5769w * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5770x * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5771y * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5772z * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5730A * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5731B * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5732C * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f5733D * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) (this.f5734E + 0.5f)));
                    wrap.putShort((short) ((int) (this.f5735F + 0.5f)));
                    wrap.putShort((short) this.f5767u);
                    wrap.putShort((short) this.f5768v);
                    return bArr;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static android.util.Pair<java.lang.String, java.util.List<byte[]>> m7436a(com.google.android.exoplayer2.util.C2302k r6) throws com.google.android.exoplayer2.ParserException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = 16;
            r6.m8390d(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = r6.m8402n();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r2 = 1482049860; // 0x58564944 float:9.4244065E14 double:7.322299212E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r2 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r4 != 0) goto L_0x0019;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0011:
            r6 = new android.util.Pair;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "video/3gpp";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6.<init>(r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            return r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0019:
            r3 = 826496599; // 0x31435657 float:2.8425313E-9 double:4.08343576E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r5 != 0) goto L_0x0062;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0020:
            r0 = r6.m8389d();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = r0 + 20;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = r6.f6929a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0028:
            r1 = r6.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r1 = r1 + -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r0 >= r1) goto L_0x005a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x002d:
            r1 = r6[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r1 != 0) goto L_0x0057;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0031:
            r1 = r0 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r1 = r6[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r1 != 0) goto L_0x0057;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0037:
            r1 = r0 + 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r1 = r6[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r2 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r1 != r2) goto L_0x0057;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x003e:
            r1 = r0 + 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r1 = r6[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r2 = 15;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r1 != r2) goto L_0x0057;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0046:
            r1 = r6.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = java.util.Arrays.copyOfRange(r6, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = new android.util.Pair;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r1 = "video/wvc1";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = java.util.Collections.singletonList(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0.<init>(r1, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            return r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0057:
            r0 = r0 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            goto L_0x0028;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x005a:
            r6 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Failed to find FourCC VC1 initialization data";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0062:
            r6 = "MatroskaExtractor";
            r0 = "Unknown FourCC. Setting mimeType to video/x-unknown";
            android.util.Log.w(r6, r0);
            r6 = new android.util.Pair;
            r0 = "video/x-unknown";
            r6.<init>(r0, r2);
            return r6;
        L_0x0071:
            r6 = new com.google.android.exoplayer2.ParserException;
            r0 = "Error parsing FourCC private data";
            r6.<init>(r0);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.b.a(com.google.android.exoplayer2.util.k):android.util.Pair<java.lang.String, java.util.List<byte[]>>");
        }

        /* renamed from: a */
        private static java.util.List<byte[]> m7438a(byte[] r8) throws com.google.android.exoplayer2.ParserException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = 0;
            r1 = r8[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r2 = 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r1 == r2) goto L_0x000e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0006:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x000e:
            r1 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0011:
            r5 = r8[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = -1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r5 != r6) goto L_0x001b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0016:
            r4 = r4 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            goto L_0x0011;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x001b:
            r5 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r8[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r4 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0021:
            r7 = r8[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r7 != r6) goto L_0x002a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0025:
            r3 = r3 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = r5 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            goto L_0x0021;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x002a:
            r6 = r5 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = r8[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r3 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = r8[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r5 == r1) goto L_0x003b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0033:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x003b:
            r1 = new byte[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            java.lang.System.arraycopy(r8, r6, r1, r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = r6 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r8[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r4 == r5) goto L_0x004e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0046:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x004e:
            r6 = r6 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r8[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = 5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r3 == r4) goto L_0x005c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0054:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x005c:
            r3 = r8.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r3 - r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = new byte[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r8.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r4 - r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            java.lang.System.arraycopy(r8, r6, r3, r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8 = new java.util.ArrayList;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.add(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.add(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            return r8;
        L_0x0071:
            r8 = new com.google.android.exoplayer2.ParserException;
            r0 = "Error parsing vorbis codec private";
            r8.<init>(r0);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.b.a(byte[]):java.util.List<byte[]>");
        }

        /* renamed from: b */
        private static boolean m7439b(com.google.android.exoplayer2.util.C2302k r8) throws com.google.android.exoplayer2.ParserException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = r8.m8397i();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r1 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            if (r0 != r1) goto L_0x0008;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x0007:
            return r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x0008:
            r2 = 65534; // 0xfffe float:9.1833E-41 double:3.2378E-319;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r3 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            if (r0 != r2) goto L_0x0036;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x000e:
            r0 = 24;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r8.m8388c(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r4 = r8.m8405q();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r0 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.f11000g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r6 = r0.getMostSignificantBits();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            if (r0 != 0) goto L_0x0034;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x0023:
            r4 = r8.m8405q();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r8 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.f11000g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r6 = r8.getLeastSignificantBits();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r8 != 0) goto L_0x0034;
        L_0x0033:
            goto L_0x0035;
        L_0x0034:
            r1 = 0;
        L_0x0035:
            return r1;
        L_0x0036:
            return r3;
        L_0x0037:
            r8 = new com.google.android.exoplayer2.ParserException;
            r0 = "Error parsing MS/ACM codec private";
            r8.<init>(r0);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.b.b(com.google.android.exoplayer2.util.k):boolean");
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$c */
    private static final class C2078c {
        /* renamed from: a */
        private final byte[] f5773a = new byte[10];
        /* renamed from: b */
        private boolean f5774b;
        /* renamed from: c */
        private int f5775c;
        /* renamed from: d */
        private int f5776d;
        /* renamed from: e */
        private long f5777e;
        /* renamed from: f */
        private int f5778f;

        /* renamed from: a */
        public void m7444a() {
            this.f5774b = false;
        }

        /* renamed from: a */
        public void m7445a(ExtractorInput extractorInput, int i, int i2) throws IOException, InterruptedException {
            if (!this.f5774b) {
                extractorInput.peekFully(this.f5773a, 0, 10);
                extractorInput.resetPeekPosition();
                if (Ac3Util.m7261b(this.f5773a) != -1) {
                    this.f5774b = true;
                    this.f5775c = 0;
                } else {
                    return;
                }
            }
            if (this.f5775c == null) {
                this.f5778f = i;
                this.f5776d = 0;
            }
            this.f5776d += i2;
        }

        /* renamed from: a */
        public void m7447a(C2077b c2077b, long j) {
            if (this.f5774b) {
                int i = this.f5775c;
                this.f5775c = i + 1;
                if (i == 0) {
                    this.f5777e = j;
                }
                if (this.f5775c >= 16) {
                    c2077b.f5744O.sampleMetadata(this.f5777e, this.f5778f, this.f5776d, 0, c2077b.f5753g);
                    this.f5775c = null;
                }
            }
        }

        /* renamed from: a */
        public void m7446a(C2077b c2077b) {
            if (this.f5774b && this.f5775c > 0) {
                c2077b.f5744O.sampleMetadata(this.f5777e, this.f5778f, this.f5776d, 0, c2077b.f5753g);
                this.f5775c = null;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$1 */
    static class C36301 implements ExtractorsFactory {
        C36301() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new MatroskaExtractor()};
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$a */
    private final class C3631a implements EbmlReaderOutput {
        /* renamed from: a */
        final /* synthetic */ MatroskaExtractor f10993a;

        /* renamed from: a */
        public int mo2279a(int i) {
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    return 5;
                default:
                    return 0;
            }
        }

        /* renamed from: b */
        public boolean mo2285b(int i) {
            if (!(i == 357149030 || i == 524531317 || i == 475249515)) {
                if (i != 374648427) {
                    return false;
                }
            }
            return true;
        }

        private C3631a(MatroskaExtractor matroskaExtractor) {
            this.f10993a = matroskaExtractor;
        }

        /* renamed from: a */
        public void mo2283a(int i, long j, long j2) throws ParserException {
            this.f10993a.m13688a(i, j, j2);
        }

        /* renamed from: c */
        public void mo2286c(int i) throws ParserException {
            this.f10993a.m13684a(i);
        }

        /* renamed from: a */
        public void mo2282a(int i, long j) throws ParserException {
            this.f10993a.m13687a(i, j);
        }

        /* renamed from: a */
        public void mo2280a(int i, double d) throws ParserException {
            this.f10993a.m13685a(i, d);
        }

        /* renamed from: a */
        public void mo2284a(int i, String str) throws ParserException {
            this.f10993a.m13689a(i, str);
        }

        /* renamed from: a */
        public void mo2281a(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException {
            this.f10993a.m13686a(i, i2, extractorInput);
        }
    }

    public void release() {
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new C3632a(), i);
    }

    MatroskaExtractor(C2081b c2081b, int i) {
        this.f11042w = -1;
        this.f11043x = -9223372036854775807L;
        this.f11044y = -9223372036854775807L;
        this.f11045z = -9223372036854775807L;
        this.f11006F = -1;
        this.f11007G = -1;
        this.f11008H = -9223372036854775807L;
        this.f11027h = c2081b;
        this.f11027h.mo2288a(new C3631a());
        c2081b = true;
        if ((i & 1) != 0) {
            c2081b = null;
        }
        this.f11030k = c2081b;
        this.f11028i = new C2083d();
        this.f11029j = new SparseArray();
        this.f11033n = new C2302k(4);
        this.f11034o = new C2302k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11035p = new C2302k(4);
        this.f11031l = new C2302k(C2300i.f6921a);
        this.f11032m = new C2302k(4);
        this.f11036q = new C2302k();
        this.f11037r = new C2302k();
        this.f11038s = new C2302k(8);
        this.f11039t = new C2302k();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return new C2082c().m7454a(extractorInput);
    }

    public void init(ExtractorOutput extractorOutput) {
        this.af = extractorOutput;
    }

    public void seek(long j, long j2) {
        this.f11008H = -9223372036854775807L;
        j = null;
        this.f11012L = 0;
        this.f11027h.mo2287a();
        this.f11028i.m7458a();
        m13682c();
        while (j < this.f11029j.size()) {
            ((C2077b) this.f11029j.valueAt(j)).m7443b();
            j++;
        }
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        int i = 0;
        this.ad = false;
        boolean z = true;
        while (z && !this.ad) {
            z = this.f11027h.mo2289a(extractorInput);
            if (z && m13677a(c2075h, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        while (i < this.f11029j.size()) {
            ((C2077b) this.f11029j.valueAt(i)).m7441a();
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    void m13688a(int i, long j, long j2) throws ParserException {
        if (i == 160) {
            this.ae = false;
        } else if (i == 174) {
            this.f11001A = new C2077b();
        } else if (i == 187) {
            this.f11011K = false;
        } else if (i == 19899) {
            this.f11003C = -1;
            this.f11004D = -1;
        } else if (i == 20533) {
            this.f11001A.f5751e = true;
        } else if (i == 21968) {
            this.f11001A.f5763q = true;
        } else if (i == 25152) {
        } else {
            if (i != 408125543) {
                if (i == 475249515) {
                    this.f11009I = new C2296g();
                    this.f11010J = new C2296g();
                } else if (i == 524531317) {
                    if (this.f11002B != 0) {
                        return;
                    }
                    if (this.f11030k == 0 || this.f11006F == -1) {
                        this.af.seekMap(new C3605b(this.f11045z));
                        this.f11002B = true;
                        return;
                    }
                    this.f11005E = true;
                }
            } else if (this.f11042w == -1 || this.f11042w == j) {
                this.f11042w = j;
                this.f11041v = j2;
            } else {
                throw new ParserException("Multiple Segment elements not supported");
            }
        }
    }

    /* renamed from: a */
    void m13684a(int i) throws ParserException {
        if (i != 160) {
            if (i == 174) {
                if (m13678a(this.f11001A.f5747a) != 0) {
                    this.f11001A.m7442a(this.af, this.f11001A.f5748b);
                    this.f11029j.put(this.f11001A.f5748b, this.f11001A);
                }
                this.f11001A = 0;
            } else if (i == 19899) {
                if (this.f11003C != -1) {
                    if (this.f11004D != -1) {
                        if (this.f11003C == 475249515) {
                            this.f11006F = this.f11004D;
                        }
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i != 25152) {
                if (i != 28032) {
                    if (i == 357149030) {
                        if (this.f11043x == -9223372036854775807L) {
                            this.f11043x = 1000000;
                        }
                        if (this.f11044y != -9223372036854775807L) {
                            this.f11045z = m13669a(this.f11044y);
                        }
                    } else if (i != 374648427) {
                        if (i == 475249515) {
                            if (this.f11002B == 0) {
                                this.af.seekMap(m13683d());
                                this.f11002B = true;
                            }
                        }
                    } else if (this.f11029j.size() == 0) {
                        throw new ParserException("No valid tracks were found");
                    } else {
                        this.af.endTracks();
                    }
                } else if (!(this.f11001A.f5751e == 0 || this.f11001A.f5752f == 0)) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (this.f11001A.f5751e != 0) {
                if (this.f11001A.f5753g == 0) {
                    throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                }
                this.f11001A.f5755i = new DrmInitData(new SchemeData(C2005C.f5444b, "video/webm", this.f11001A.f5753g.f5638b));
            }
        } else if (this.f11012L == 2) {
            if (this.ae == 0) {
                this.f11020T |= 1;
            }
            m13674a((C2077b) this.f11029j.get(this.f11018R), this.f11013M);
            this.f11012L = 0;
        }
    }

    /* renamed from: a */
    void m13687a(int i, long j) throws ParserException {
        boolean z = false;
        StringBuilder stringBuilder;
        switch (i) {
            case 131:
                this.f11001A.f5749c = (int) j;
                return;
            case 136:
                i = this.f11001A;
                if (j == 1) {
                    z = true;
                }
                i.f5742M = z;
                return;
            case 155:
                this.f11014N = m13669a(j);
                return;
            case 159:
                this.f11001A.f5736G = (int) j;
                return;
            case 176:
                this.f11001A.f5756j = (int) j;
                return;
            case 179:
                this.f11009I.m8339a(m13669a(j));
                return;
            case 186:
                this.f11001A.f5757k = (int) j;
                return;
            case 215:
                this.f11001A.f5748b = (int) j;
                return;
            case 231:
                this.f11008H = m13669a(j);
                return;
            case 241:
                if (this.f11011K == 0) {
                    this.f11010J.m8339a(j);
                    this.f11011K = true;
                    return;
                }
                return;
            case 251:
                this.ae = true;
                return;
            case 16980:
                if (j != 3) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentCompAlgo ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("DocTypeReadVersion ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("EBMLReadVersion ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncAlgo ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AESSettingsCipherMode ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncodingOrder ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncodingScope ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 21420:
                this.f11004D = j + this.f11042w;
                return;
            case 21432:
                i = (int) j;
                if (i == 3) {
                    this.f11001A.f5762p = 1;
                    return;
                } else if (i != 15) {
                    switch (i) {
                        case 0:
                            this.f11001A.f5762p = 0;
                            return;
                        case 1:
                            this.f11001A.f5762p = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f11001A.f5762p = 3;
                    return;
                }
            case 21680:
                this.f11001A.f5758l = (int) j;
                return;
            case 21682:
                this.f11001A.f5760n = (int) j;
                return;
            case 21690:
                this.f11001A.f5759m = (int) j;
                return;
            case 21930:
                i = this.f11001A;
                if (j == 1) {
                    z = true;
                }
                i.f5743N = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.f11001A.f5766t = 2;
                        return;
                    case 2:
                        this.f11001A.f5766t = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                i = (int) j;
                if (i != 1) {
                    if (i == 16) {
                        this.f11001A.f5765s = 6;
                        return;
                    } else if (i != 18) {
                        switch (i) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        this.f11001A.f5765s = 7;
                        return;
                    }
                }
                this.f11001A.f5765s = 3;
                return;
            case 21947:
                this.f11001A.f5763q = true;
                i = (int) j;
                if (i == 1) {
                    this.f11001A.f5764r = 1;
                    return;
                } else if (i != 9) {
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f11001A.f5764r = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f11001A.f5764r = 6;
                    return;
                }
            case 21948:
                this.f11001A.f5767u = (int) j;
                return;
            case 21949:
                this.f11001A.f5768v = (int) j;
                return;
            case 22186:
                this.f11001A.f5739J = j;
                return;
            case 22203:
                this.f11001A.f5740K = j;
                return;
            case 25188:
                this.f11001A.f5737H = (int) j;
                return;
            case 2352003:
                this.f11001A.f5750d = (int) j;
                return;
            case 2807729:
                this.f11043x = j;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m13685a(int i, double d) {
        if (i == 181) {
            this.f11001A.f5738I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f11001A.f5769w = (float) d;
                    return;
                case 21970:
                    this.f11001A.f5770x = (float) d;
                    return;
                case 21971:
                    this.f11001A.f5771y = (float) d;
                    return;
                case 21972:
                    this.f11001A.f5772z = (float) d;
                    return;
                case 21973:
                    this.f11001A.f5730A = (float) d;
                    return;
                case 21974:
                    this.f11001A.f5731B = (float) d;
                    return;
                case 21975:
                    this.f11001A.f5732C = (float) d;
                    return;
                case 21976:
                    this.f11001A.f5733D = (float) d;
                    return;
                case 21977:
                    this.f11001A.f5734E = (float) d;
                    return;
                case 21978:
                    this.f11001A.f5735F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f11044y = (long) d;
        }
    }

    /* renamed from: a */
    void m13689a(int i, String str) throws ParserException {
        if (i == 134) {
            this.f11001A.f5747a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f11001A.f5746Q = str;
            }
        } else if ("webm".equals(str) == 0 && "matroska".equals(str) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DocType ");
            stringBuilder.append(str);
            stringBuilder.append(" not supported");
            throw new ParserException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    void m13686a(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException {
        MatroskaExtractor matroskaExtractor = this;
        int i3 = i;
        int i4 = i2;
        ExtractorInput extractorInput2 = extractorInput;
        boolean z = false;
        int i5 = 1;
        if (i3 == 161 || i3 == 163) {
            if (matroskaExtractor.f11012L == 0) {
                matroskaExtractor.f11018R = (int) matroskaExtractor.f11028i.m7457a(extractorInput2, false, true, 8);
                matroskaExtractor.f11019S = matroskaExtractor.f11028i.m7459b();
                matroskaExtractor.f11014N = -9223372036854775807L;
                matroskaExtractor.f11012L = 1;
                matroskaExtractor.f11033n.m8380a();
            }
            C2077b c2077b = (C2077b) matroskaExtractor.f11029j.get(matroskaExtractor.f11018R);
            if (c2077b == null) {
                extractorInput2.skipFully(i4 - matroskaExtractor.f11019S);
                matroskaExtractor.f11012L = 0;
                return;
            }
            if (matroskaExtractor.f11012L == 1) {
                int i6;
                m13670a(extractorInput2, 3);
                int i7 = (matroskaExtractor.f11033n.f6929a[2] & 6) >> 1;
                int i8 = 255;
                if (i7 == 0) {
                    matroskaExtractor.f11016P = 1;
                    matroskaExtractor.f11017Q = m13680a(matroskaExtractor.f11017Q, 1);
                    matroskaExtractor.f11017Q[0] = (i4 - matroskaExtractor.f11019S) - 3;
                } else if (i3 != 163) {
                    throw new ParserException("Lacing only supported in SimpleBlocks.");
                } else {
                    m13670a(extractorInput2, 4);
                    matroskaExtractor.f11016P = (matroskaExtractor.f11033n.f6929a[3] & 255) + 1;
                    matroskaExtractor.f11017Q = m13680a(matroskaExtractor.f11017Q, matroskaExtractor.f11016P);
                    if (i7 == 2) {
                        Arrays.fill(matroskaExtractor.f11017Q, 0, matroskaExtractor.f11016P, ((i4 - matroskaExtractor.f11019S) - 4) / matroskaExtractor.f11016P);
                    } else if (i7 == 1) {
                        r10 = 4;
                        i7 = 0;
                        for (r6 = 0; r6 < matroskaExtractor.f11016P - 1; r6++) {
                            matroskaExtractor.f11017Q[r6] = 0;
                            do {
                                r10++;
                                m13670a(extractorInput2, r10);
                                r14 = matroskaExtractor.f11033n.f6929a[r10 - 1] & 255;
                                int[] iArr = matroskaExtractor.f11017Q;
                                iArr[r6] = iArr[r6] + r14;
                            } while (r14 == 255);
                            i7 += matroskaExtractor.f11017Q[r6];
                        }
                        matroskaExtractor.f11017Q[matroskaExtractor.f11016P - 1] = ((i4 - matroskaExtractor.f11019S) - r10) - i7;
                    } else if (i7 == 3) {
                        r6 = 0;
                        r10 = 4;
                        i7 = 0;
                        while (r6 < matroskaExtractor.f11016P - i5) {
                            matroskaExtractor.f11017Q[r6] = z;
                            r10++;
                            m13670a(extractorInput2, r10);
                            int i9 = r10 - 1;
                            if (matroskaExtractor.f11033n.f6929a[i9] == (byte) 0) {
                                throw new ParserException("No valid varint length mask found");
                            }
                            long j;
                            int[] iArr2;
                            long j2 = 0;
                            r14 = 0;
                            while (r14 < 8) {
                                int i10 = i5 << (7 - r14);
                                if ((matroskaExtractor.f11033n.f6929a[i9] & i10) != 0) {
                                    r10 += r14;
                                    m13670a(extractorInput2, r10);
                                    i6 = i9 + 1;
                                    j2 = (long) ((matroskaExtractor.f11033n.f6929a[i9] & i8) & (i10 ^ -1));
                                    while (i6 < r10) {
                                        i6++;
                                        j2 = (j2 << 8) | ((long) (matroskaExtractor.f11033n.f6929a[i6] & i8));
                                        i8 = 255;
                                    }
                                    if (r6 > 0) {
                                        j = j2 - ((1 << ((r14 * 7) + 6)) - 1);
                                        if (j >= -2147483648L) {
                                            if (j > 2147483647L) {
                                                i6 = (int) j;
                                                iArr2 = matroskaExtractor.f11017Q;
                                                if (r6 == 0) {
                                                    i6 += matroskaExtractor.f11017Q[r6 - 1];
                                                }
                                                iArr2[r6] = i6;
                                                i7 += matroskaExtractor.f11017Q[r6];
                                                r6++;
                                                z = false;
                                                i5 = 1;
                                                i8 = 255;
                                            }
                                        }
                                        throw new ParserException("EBML lacing sample size out of range.");
                                    }
                                    j = j2;
                                    if (j >= -2147483648L) {
                                        if (j > 2147483647L) {
                                            i6 = (int) j;
                                            iArr2 = matroskaExtractor.f11017Q;
                                            if (r6 == 0) {
                                                i6 += matroskaExtractor.f11017Q[r6 - 1];
                                            }
                                            iArr2[r6] = i6;
                                            i7 += matroskaExtractor.f11017Q[r6];
                                            r6++;
                                            z = false;
                                            i5 = 1;
                                            i8 = 255;
                                        }
                                    }
                                    throw new ParserException("EBML lacing sample size out of range.");
                                }
                                r14++;
                                i5 = 1;
                                i8 = 255;
                            }
                            j = j2;
                            if (j >= -2147483648L) {
                                if (j > 2147483647L) {
                                    i6 = (int) j;
                                    iArr2 = matroskaExtractor.f11017Q;
                                    if (r6 == 0) {
                                        i6 += matroskaExtractor.f11017Q[r6 - 1];
                                    }
                                    iArr2[r6] = i6;
                                    i7 += matroskaExtractor.f11017Q[r6];
                                    r6++;
                                    z = false;
                                    i5 = 1;
                                    i8 = 255;
                                }
                            }
                            throw new ParserException("EBML lacing sample size out of range.");
                        }
                        matroskaExtractor.f11017Q[matroskaExtractor.f11016P - 1] = ((i4 - matroskaExtractor.f11019S) - r10) - i7;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected lacing value: ");
                        stringBuilder.append(i7);
                        throw new ParserException(stringBuilder.toString());
                    }
                }
                matroskaExtractor.f11013M = matroskaExtractor.f11008H + m13669a((long) ((matroskaExtractor.f11033n.f6929a[0] << 8) | (matroskaExtractor.f11033n.f6929a[1] & 255)));
                Object obj = (matroskaExtractor.f11033n.f6929a[2] & 8) == 8 ? 1 : null;
                if (c2077b.f5749c != 2) {
                    if (i3 != 163 || (matroskaExtractor.f11033n.f6929a[2] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        i6 = 0;
                        matroskaExtractor.f11020T = i6 | (obj == null ? Integer.MIN_VALUE : 0);
                        matroskaExtractor.f11012L = 2;
                        matroskaExtractor.f11015O = 0;
                    }
                }
                i6 = 1;
                if (obj == null) {
                }
                matroskaExtractor.f11020T = i6 | (obj == null ? Integer.MIN_VALUE : 0);
                matroskaExtractor.f11012L = 2;
                matroskaExtractor.f11015O = 0;
            }
            if (i3 == 163) {
                while (matroskaExtractor.f11015O < matroskaExtractor.f11016P) {
                    m13671a(extractorInput2, c2077b, matroskaExtractor.f11017Q[matroskaExtractor.f11015O]);
                    m13674a(c2077b, matroskaExtractor.f11013M + ((long) ((matroskaExtractor.f11015O * c2077b.f5750d) / AdError.NETWORK_ERROR_CODE)));
                    matroskaExtractor.f11015O++;
                }
                matroskaExtractor.f11012L = 0;
            } else {
                m13671a(extractorInput2, c2077b, matroskaExtractor.f11017Q[0]);
            }
        } else if (i3 == 16981) {
            matroskaExtractor.f11001A.f5752f = new byte[i4];
            extractorInput2.readFully(matroskaExtractor.f11001A.f5752f, 0, i4);
        } else if (i3 == 18402) {
            byte[] bArr = new byte[i4];
            extractorInput2.readFully(bArr, 0, i4);
            matroskaExtractor.f11001A.f5753g = new C2055a(1, bArr, 0, 0);
        } else if (i3 == 21419) {
            Arrays.fill(matroskaExtractor.f11035p.f6929a, (byte) 0);
            extractorInput2.readFully(matroskaExtractor.f11035p.f6929a, 4 - i4, i4);
            matroskaExtractor.f11035p.m8388c(0);
            matroskaExtractor.f11003C = (int) matroskaExtractor.f11035p.m8401m();
        } else if (i3 == 25506) {
            matroskaExtractor.f11001A.f5754h = new byte[i4];
            extractorInput2.readFully(matroskaExtractor.f11001A.f5754h, 0, i4);
        } else if (i3 != 30322) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unexpected id: ");
            stringBuilder2.append(i3);
            throw new ParserException(stringBuilder2.toString());
        } else {
            matroskaExtractor.f11001A.f5761o = new byte[i4];
            extractorInput2.readFully(matroskaExtractor.f11001A.f5761o, 0, i4);
        }
    }

    /* renamed from: a */
    private void m13674a(C2077b c2077b, long j) {
        MatroskaExtractor matroskaExtractor = this;
        C2077b c2077b2 = c2077b;
        if (c2077b2.f5741L != null) {
            c2077b2.f5741L.m7447a(c2077b2, j);
        } else {
            long j2 = j;
            if ("S_TEXT/UTF8".equals(c2077b2.f5747a)) {
                m13675a(c2077b2, "%02d:%02d:%02d,%03d", 19, 1000, f10996c);
            } else if ("S_TEXT/ASS".equals(c2077b2.f5747a)) {
                m13675a(c2077b2, "%01d:%02d:%02d:%02d", 21, 10000, f10999f);
            }
            c2077b2.f5744O.sampleMetadata(j2, matroskaExtractor.f11020T, matroskaExtractor.ac, 0, c2077b2.f5753g);
        }
        matroskaExtractor.ad = true;
        m13682c();
    }

    /* renamed from: c */
    private void m13682c() {
        this.f11021U = 0;
        this.ac = 0;
        this.ab = 0;
        this.f11022V = false;
        this.f11023W = false;
        this.f11025Y = false;
        this.aa = 0;
        this.f11026Z = (byte) 0;
        this.f11024X = false;
        this.f11036q.m8380a();
    }

    /* renamed from: a */
    private void m13670a(ExtractorInput extractorInput, int i) throws IOException, InterruptedException {
        if (this.f11033n.m8387c() < i) {
            if (this.f11033n.m8391e() < i) {
                this.f11033n.m8383a(Arrays.copyOf(this.f11033n.f6929a, Math.max(this.f11033n.f6929a.length * 2, i)), this.f11033n.m8387c());
            }
            extractorInput.readFully(this.f11033n.f6929a, this.f11033n.m8387c(), i - this.f11033n.m8387c());
            this.f11033n.m8386b(i);
        }
    }

    /* renamed from: a */
    private void m13671a(ExtractorInput extractorInput, C2077b c2077b, int i) throws IOException, InterruptedException {
        if ("S_TEXT/UTF8".equals(c2077b.f5747a)) {
            m13672a(extractorInput, f10995b, i);
        } else if ("S_TEXT/ASS".equals(c2077b.f5747a)) {
            m13672a(extractorInput, f10998e, i);
        } else {
            TrackOutput trackOutput = c2077b.f5744O;
            boolean z = true;
            if (!this.f11022V) {
                if (c2077b.f5751e) {
                    this.f11020T &= -1073741825;
                    boolean z2 = this.f11023W;
                    int i2 = ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                    if (!z2) {
                        extractorInput.readFully(this.f11033n.f6929a, 0, 1);
                        this.f11021U++;
                        if ((this.f11033n.f6929a[0] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                        this.f11026Z = this.f11033n.f6929a[0];
                        this.f11023W = true;
                    }
                    if (((this.f11026Z & 1) == 1 ? 1 : null) != null) {
                        Object obj = (this.f11026Z & 2) == 2 ? 1 : null;
                        this.f11020T |= 1073741824;
                        if (!this.f11024X) {
                            extractorInput.readFully(this.f11038s.f6929a, 0, 8);
                            this.f11021U += 8;
                            this.f11024X = true;
                            byte[] bArr = this.f11033n.f6929a;
                            if (obj == null) {
                                i2 = 0;
                            }
                            bArr[0] = (byte) (i2 | 8);
                            this.f11033n.m8388c(0);
                            trackOutput.sampleData(this.f11033n, 1);
                            this.ac++;
                            this.f11038s.m8388c(0);
                            trackOutput.sampleData(this.f11038s, 8);
                            this.ac += 8;
                        }
                        if (obj != null) {
                            if (!this.f11025Y) {
                                extractorInput.readFully(this.f11033n.f6929a, 0, 1);
                                this.f11021U++;
                                this.f11033n.m8388c(0);
                                this.aa = this.f11033n.m8395g();
                                this.f11025Y = true;
                            }
                            int i3 = this.aa * 4;
                            this.f11033n.m8381a(i3);
                            extractorInput.readFully(this.f11033n.f6929a, 0, i3);
                            this.f11021U += i3;
                            short s = (short) ((this.aa / 2) + 1);
                            i2 = (s * 6) + 2;
                            if (this.f11040u == null || this.f11040u.capacity() < i2) {
                                this.f11040u = ByteBuffer.allocate(i2);
                            }
                            this.f11040u.position(0);
                            this.f11040u.putShort(s);
                            i3 = 0;
                            int i4 = 0;
                            while (i3 < this.aa) {
                                int u = this.f11033n.m8409u();
                                if (i3 % 2 == 0) {
                                    this.f11040u.putShort((short) (u - i4));
                                } else {
                                    this.f11040u.putInt(u - i4);
                                }
                                i3++;
                                i4 = u;
                            }
                            i3 = (i - this.f11021U) - i4;
                            if (this.aa % 2 == 1) {
                                this.f11040u.putInt(i3);
                            } else {
                                this.f11040u.putShort((short) i3);
                                this.f11040u.putInt(0);
                            }
                            this.f11039t.m8383a(this.f11040u.array(), i2);
                            trackOutput.sampleData(this.f11039t, i2);
                            this.ac += i2;
                        }
                    }
                } else if (c2077b.f5752f != null) {
                    this.f11036q.m8383a(c2077b.f5752f, c2077b.f5752f.length);
                }
                this.f11022V = true;
            }
            i += this.f11036q.m8387c();
            if (!"V_MPEG4/ISO/AVC".equals(c2077b.f5747a)) {
                if (!"V_MPEGH/ISO/HEVC".equals(c2077b.f5747a)) {
                    if (c2077b.f5741L != null) {
                        if (this.f11036q.m8387c() != 0) {
                            z = false;
                        }
                        C2289a.m8313b(z);
                        c2077b.f5741L.m7445a(extractorInput, this.f11020T, i);
                    }
                    while (this.f11021U < i) {
                        m13668a(extractorInput, trackOutput, i - this.f11021U);
                    }
                    if ("A_VORBIS".equals(c2077b.f5747a) != null) {
                        this.f11034o.m8388c(0);
                        trackOutput.sampleData(this.f11034o, 4);
                        this.ac += 4;
                    }
                }
            }
            byte[] bArr2 = this.f11032m.f6929a;
            bArr2[0] = (byte) 0;
            bArr2[1] = (byte) 0;
            bArr2[2] = (byte) 0;
            int i5 = c2077b.f5745P;
            int i6 = 4 - c2077b.f5745P;
            while (this.f11021U < i) {
                if (this.ab == 0) {
                    m13673a(extractorInput, bArr2, i6, i5);
                    this.f11032m.m8388c(0);
                    this.ab = this.f11032m.m8409u();
                    this.f11031l.m8388c(0);
                    trackOutput.sampleData(this.f11031l, 4);
                    this.ac += 4;
                } else {
                    this.ab -= m13668a(extractorInput, trackOutput, this.ab);
                }
            }
            if ("A_VORBIS".equals(c2077b.f5747a) != null) {
                this.f11034o.m8388c(0);
                trackOutput.sampleData(this.f11034o, 4);
                this.ac += 4;
            }
        }
    }

    /* renamed from: a */
    private void m13672a(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        if (this.f11037r.m8391e() < length) {
            this.f11037r.f6929a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.f11037r.f6929a, 0, bArr.length);
        }
        extractorInput.readFully(this.f11037r.f6929a, bArr.length, i);
        this.f11037r.m8381a(length);
    }

    /* renamed from: a */
    private void m13675a(C2077b c2077b, String str, int i, long j, byte[] bArr) {
        m13676a(this.f11037r.f6929a, this.f11014N, str, i, j, bArr);
        c2077b.f5744O.sampleData(this.f11037r, this.f11037r.m8387c());
        this.ac += this.f11037r.m8387c();
    }

    /* renamed from: a */
    private static void m13676a(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        Object obj;
        Object obj2;
        if (j == -9223372036854775807L) {
            obj = bArr2;
            obj2 = obj;
        } else {
            long j3 = j - (((long) (((int) (j / 3600000000L)) * 3600)) * 1000000);
            long j4 = j3 - (((long) (((int) (j3 / 60000000)) * 60)) * 1000000);
            int i2 = (int) ((j4 - (((long) ((int) (j4 / 1000000))) * 1000000)) / j2);
            obj2 = C2314v.m8491c(String.format(Locale.US, str, new Object[]{Integer.valueOf(r3), Integer.valueOf(r0), Integer.valueOf(r1), Integer.valueOf(i2)}));
            obj = bArr2;
        }
        System.arraycopy(obj2, 0, bArr, i, obj.length);
    }

    /* renamed from: a */
    private void m13673a(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.f11036q.m8385b());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f11036q.m8384a(bArr, i, min);
        }
        this.f11021U += i2;
    }

    /* renamed from: a */
    private int m13668a(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException, InterruptedException {
        int b = this.f11036q.m8385b();
        if (b > 0) {
            extractorInput = Math.min(i, b);
            trackOutput.sampleData(this.f11036q, extractorInput);
        } else {
            extractorInput = trackOutput.sampleData(extractorInput, i, false);
        }
        this.f11021U += extractorInput;
        this.ac += extractorInput;
        return extractorInput;
    }

    /* renamed from: d */
    private SeekMap m13683d() {
        if (!(this.f11042w == -1 || this.f11045z == -9223372036854775807L || this.f11009I == null || this.f11009I.m8337a() == 0 || this.f11010J == null)) {
            if (this.f11010J.m8337a() == this.f11009I.m8337a()) {
                int i;
                int a = this.f11009I.m8337a();
                int[] iArr = new int[a];
                long[] jArr = new long[a];
                long[] jArr2 = new long[a];
                long[] jArr3 = new long[a];
                int i2 = 0;
                for (i = 0; i < a; i++) {
                    jArr3[i] = this.f11009I.m8338a(i);
                    jArr[i] = this.f11042w + this.f11010J.m8338a(i);
                }
                while (true) {
                    i = a - 1;
                    if (i2 < i) {
                        i = i2 + 1;
                        iArr[i2] = (int) (jArr[i] - jArr[i2]);
                        jArr2[i2] = jArr3[i] - jArr3[i2];
                        i2 = i;
                    } else {
                        iArr[i] = (int) ((this.f11042w + this.f11041v) - jArr[i]);
                        jArr2[i] = this.f11045z - jArr3[i];
                        this.f11009I = null;
                        this.f11010J = null;
                        return new C3608a(iArr, jArr, jArr2, jArr3);
                    }
                }
            }
        }
        this.f11009I = null;
        this.f11010J = null;
        return new C3605b(this.f11045z);
    }

    /* renamed from: a */
    private boolean m13677a(C2075h c2075h, long j) {
        if (this.f11005E) {
            this.f11007G = j;
            c2075h.f5726a = this.f11006F;
            this.f11005E = false;
            return true;
        } else if (this.f11002B == null || this.f11007G == -1) {
            return false;
        } else {
            c2075h.f5726a = this.f11007G;
            this.f11007G = -1;
            return true;
        }
    }

    /* renamed from: a */
    private long m13669a(long j) throws ParserException {
        if (this.f11043x == -9223372036854775807L) {
            throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
        }
        return C2314v.m8492d(j, this.f11043x, 1000);
    }

    /* renamed from: a */
    private static boolean m13678a(String str) {
        if (!("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str))) {
            if ("S_DVBSUB".equals(str) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m13680a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
