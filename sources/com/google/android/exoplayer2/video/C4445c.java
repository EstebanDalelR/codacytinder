package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.C4237a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C3604c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.mediacodec.C2130a;
import com.google.android.exoplayer2.mediacodec.C2131b;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2311t;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.video.VideoRendererEventListener.C2326a;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.video.c */
public class C4445c extends MediaCodecRenderer {
    /* renamed from: c */
    private static final int[] f14763c = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    /* renamed from: A */
    private int f14764A = -1;
    /* renamed from: B */
    private int f14765B = -1;
    /* renamed from: C */
    private int f14766C;
    /* renamed from: D */
    private float f14767D = -1.0f;
    /* renamed from: E */
    private int f14768E;
    /* renamed from: F */
    private int f14769F;
    /* renamed from: G */
    private int f14770G;
    /* renamed from: H */
    private float f14771H;
    /* renamed from: I */
    private boolean f14772I;
    /* renamed from: J */
    private int f14773J;
    /* renamed from: K */
    private long f14774K = -9223372036854775807L;
    /* renamed from: L */
    private long f14775L = -9223372036854775807L;
    /* renamed from: M */
    private int f14776M;
    /* renamed from: b */
    C2331b f14777b;
    /* renamed from: d */
    private final Context f14778d;
    /* renamed from: e */
    private final C2334d f14779e;
    /* renamed from: f */
    private final C2326a f14780f;
    /* renamed from: g */
    private final long f14781g;
    /* renamed from: h */
    private final int f14782h;
    /* renamed from: i */
    private final boolean f14783i = C4445c.m18521w();
    /* renamed from: j */
    private final long[] f14784j = new long[10];
    /* renamed from: k */
    private final long[] f14785k = new long[10];
    /* renamed from: l */
    private C2330a f14786l;
    /* renamed from: m */
    private boolean f14787m;
    /* renamed from: n */
    private Surface f14788n;
    /* renamed from: o */
    private Surface f14789o;
    /* renamed from: p */
    private int f14790p = 1;
    /* renamed from: q */
    private boolean f14791q;
    /* renamed from: r */
    private long f14792r;
    /* renamed from: s */
    private long f14793s = -9223372036854775807L;
    /* renamed from: t */
    private long f14794t;
    /* renamed from: u */
    private int f14795u;
    /* renamed from: v */
    private int f14796v;
    /* renamed from: w */
    private int f14797w;
    /* renamed from: x */
    private long f14798x;
    /* renamed from: y */
    private int f14799y;
    /* renamed from: z */
    private float f14800z = -1.0f;

    /* renamed from: com.google.android.exoplayer2.video.c$a */
    protected static final class C2330a {
        /* renamed from: a */
        public final int f6999a;
        /* renamed from: b */
        public final int f7000b;
        /* renamed from: c */
        public final int f7001c;

        public C2330a(int i, int i2, int i3) {
            this.f6999a = i;
            this.f7000b = i2;
            this.f7001c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: com.google.android.exoplayer2.video.c$b */
    private final class C2331b implements OnFrameRenderedListener {
        /* renamed from: a */
        final /* synthetic */ C4445c f7002a;

        private C2331b(C4445c c4445c, MediaCodec mediaCodec) {
            this.f7002a = c4445c;
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
            if (this == this.f7002a.f14777b) {
                this.f7002a.mo3990h();
            }
        }
    }

    /* renamed from: c */
    private static boolean m18512c(long j) {
        return j < -30000;
    }

    /* renamed from: d */
    private static boolean m18513d(long j) {
        return j < -500000;
    }

    public C4445c(Context context, MediaCodecSelector mediaCodecSelector, long j, @Nullable DrmSessionManager<C3604c> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        super(2, mediaCodecSelector, drmSessionManager, z);
        this.f14781g = j;
        this.f14782h = i;
        this.f14778d = context.getApplicationContext();
        this.f14779e = new C2334d(context);
        this.f14780f = new C2326a(handler, videoRendererEventListener);
        m18517s();
    }

    /* renamed from: a */
    protected int mo3980a(MediaCodecSelector mediaCodecSelector, DrmSessionManager<C3604c> drmSessionManager, Format format) throws DecoderQueryException {
        String str = format.sampleMimeType;
        int i = 0;
        if (!C2297h.m8343b(str)) {
            return 0;
        }
        boolean z;
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.schemeDataCount; i2++) {
                z |= drmInitData.get(i2).requiresSecureDecryption;
            }
        } else {
            z = false;
        }
        C2130a decoderInfo = mediaCodecSelector.getDecoderInfo(str, z);
        int i3 = 2;
        if (decoderInfo == null) {
            if (!z || mediaCodecSelector.getDecoderInfo(str, false) == null) {
                i3 = 1;
            }
            return i3;
        } else if (C4237a.m16837a((DrmSessionManager) drmSessionManager, drmInitData) == null) {
            return 2;
        } else {
            mediaCodecSelector = decoderInfo.m7675b(format.codecs);
            if (mediaCodecSelector != null && format.width > null && format.height > null) {
                if (C2314v.f6956a >= 21) {
                    mediaCodecSelector = decoderInfo.m7672a(format.width, format.height, (double) format.frameRate);
                } else {
                    mediaCodecSelector = format.width * format.height <= MediaCodecUtil.m7654b() ? true : null;
                    if (mediaCodecSelector == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("FalseCheck [legacyFrameSize, ");
                        stringBuilder.append(format.width);
                        stringBuilder.append("x");
                        stringBuilder.append(format.height);
                        stringBuilder.append("] [");
                        stringBuilder.append(C2314v.f6960e);
                        stringBuilder.append("]");
                        Log.d("MediaCodecVideoRenderer", stringBuilder.toString());
                    }
                }
            }
            drmSessionManager = decoderInfo.f6125d != null ? 16 : 8;
            if (decoderInfo.f6126e != null) {
                i = 32;
            }
            return (mediaCodecSelector != null ? 4 : 3) | (drmSessionManager | i);
        }
    }

    /* renamed from: a */
    protected void mo3719a(boolean z) throws ExoPlaybackException {
        super.mo3719a(z);
        this.f14773J = m16847e().f6157b;
        this.f14772I = this.f14773J;
        this.f14780f.m8518a(this.a);
        this.f14779e.m8538a();
    }

    /* renamed from: a */
    protected void mo3726a(Format[] formatArr, long j) throws ExoPlaybackException {
        if (this.f14775L == -9223372036854775807L) {
            this.f14775L = j;
        } else {
            if (this.f14776M == this.f14784j.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many stream changes, so dropping offset: ");
                stringBuilder.append(this.f14784j[this.f14776M - 1]);
                Log.w("MediaCodecVideoRenderer", stringBuilder.toString());
            } else {
                this.f14776M++;
            }
            this.f14784j[this.f14776M - 1] = j;
            this.f14785k[this.f14776M - 1] = this.f14774K;
        }
        super.mo3726a(formatArr, j);
    }

    /* renamed from: a */
    protected void mo3718a(long j, boolean z) throws ExoPlaybackException {
        super.mo3718a(j, z);
        m18515q();
        this.f14792r = -9223372036854775807L;
        this.f14796v = 0;
        this.f14774K = -9223372036854775807L;
        if (this.f14776M != 0) {
            this.f14775L = this.f14784j[this.f14776M - 1];
            this.f14776M = 0;
        }
        if (z) {
            m18514p();
        } else {
            this.f14793s = -9223372036854775807L;
        }
    }

    public boolean isReady() {
        if (super.isReady() && (this.f14791q || ((this.f14789o != null && this.f14788n == this.f14789o) || m17973k() == null || this.f14772I))) {
            this.f14793s = -9223372036854775807L;
            return true;
        } else if (this.f14793s == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f14793s) {
                return true;
            }
            this.f14793s = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: a */
    protected void mo3717a() {
        super.mo3717a();
        this.f14795u = 0;
        this.f14794t = SystemClock.elapsedRealtime();
        this.f14798x = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: b */
    protected void mo3720b() {
        this.f14793s = -9223372036854775807L;
        m18520v();
        super.mo3720b();
    }

    /* renamed from: c */
    protected void mo3721c() {
        this.f14764A = -1;
        this.f14765B = -1;
        this.f14767D = -1.0f;
        this.f14800z = -1.0f;
        this.f14775L = -9223372036854775807L;
        this.f14774K = -9223372036854775807L;
        this.f14776M = 0;
        m18517s();
        m18515q();
        this.f14779e.m8539b();
        this.f14777b = null;
        this.f14772I = false;
        try {
            super.mo3721c();
        } finally {
            this.a.m7353a();
            this.f14780f.m8520b(this.a);
        }
    }

    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            m18507a((Surface) obj);
        } else if (i == 4) {
            this.f14790p = ((Integer) obj).intValue();
            i = m17973k();
            if (i != 0) {
                i.setVideoScalingMode(this.f14790p);
            }
        } else {
            super.handleMessage(i, obj);
        }
    }

    /* renamed from: a */
    private void m18507a(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            if (this.f14789o != null) {
                surface = this.f14789o;
            } else {
                C2130a l = m17974l();
                if (l != null && m18511b(l)) {
                    this.f14789o = DummySurface.newInstanceV17(this.f14778d, l.f6127f);
                    surface = this.f14789o;
                }
            }
        }
        if (this.f14788n != surface) {
            this.f14788n = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec k = m17973k();
                if (C2314v.f6956a < 23 || k == null || surface == null || this.f14787m) {
                    mo3995m();
                    m17972j();
                } else {
                    C4445c.m18505a(k, surface);
                }
            }
            if (surface == null || surface == this.f14789o) {
                m18517s();
                m18515q();
                return;
            }
            m18519u();
            m18515q();
            if (state == 2) {
                m18514p();
            }
        } else if (surface != null && surface != this.f14789o) {
            m18519u();
            m18516r();
        }
    }

    /* renamed from: a */
    protected boolean mo3993a(C2130a c2130a) {
        if (this.f14788n == null) {
            if (m18511b(c2130a) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    protected void mo3986a(C2130a c2130a, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DecoderQueryException {
        this.f14786l = m18525a(c2130a, format, m16846d());
        format = m18524a(format, this.f14786l, this.f14783i, this.f14773J);
        if (this.f14788n == null) {
            C2289a.m8313b(m18511b(c2130a));
            if (this.f14789o == null) {
                this.f14789o = DummySurface.newInstanceV17(this.f14778d, c2130a.f6127f);
            }
            this.f14788n = this.f14789o;
        }
        mediaCodec.configure(format, this.f14788n, mediaCrypto, 0);
        if (C2314v.f6956a >= 23 && this.f14772I != null) {
            this.f14777b = new C2331b(mediaCodec);
        }
    }

    /* renamed from: a */
    protected int mo3979a(MediaCodec mediaCodec, C2130a c2130a, Format format, Format format2) {
        if (C4445c.m18509a(c2130a.f6125d, format, format2) == null || format2.width > this.f14786l.f6999a || format2.height > this.f14786l.f7000b || C4445c.m18510b(format2) > this.f14786l.f7001c) {
            return null;
        }
        return format.initializationDataEquals(format2) != null ? true : 3;
    }

    @CallSuper
    /* renamed from: m */
    protected void mo3995m() {
        try {
            super.mo3995m();
        } finally {
            this.f14797w = 0;
            if (this.f14789o != null) {
                if (this.f14788n == this.f14789o) {
                    this.f14788n = null;
                }
                this.f14789o.release();
                this.f14789o = null;
            }
        }
    }

    @CallSuper
    /* renamed from: n */
    protected void mo3996n() throws ExoPlaybackException {
        super.mo3996n();
        this.f14797w = 0;
    }

    /* renamed from: a */
    protected void mo3987a(String str, long j, long j2) {
        this.f14780f.m8519a(str, j, j2);
        this.f14787m = C4445c.m18508a(str);
    }

    /* renamed from: a */
    protected void mo3984a(Format format) throws ExoPlaybackException {
        super.mo3984a(format);
        this.f14780f.m8517a(format);
        this.f14800z = format.pixelWidthHeightRatio;
        this.f14799y = format.rotationDegrees;
    }

    @CallSuper
    /* renamed from: a */
    protected void mo3985a(DecoderInputBuffer decoderInputBuffer) {
        this.f14797w++;
        this.f14774K = Math.max(decoderInputBuffer.f10831c, this.f14774K);
        if (C2314v.f6956a < 23 && this.f14772I != null) {
            mo3990h();
        }
    }

    /* renamed from: a */
    protected void mo3983a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        Object obj = (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) ? 1 : null;
        if (obj != null) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f14764A = integer;
        if (obj != null) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f14765B = integer2;
        this.f14767D = this.f14800z;
        if (C2314v.f6956a < 21) {
            this.f14766C = this.f14799y;
        } else if (this.f14799y == 90 || this.f14799y == 270) {
            mediaFormat = this.f14764A;
            this.f14764A = this.f14765B;
            this.f14765B = mediaFormat;
            this.f14767D = 1065353216 / this.f14767D;
        }
        mediaCodec.setVideoScalingMode(this.f14790p);
    }

    /* renamed from: a */
    protected boolean mo3988a(long r24, long r26, android.media.MediaCodec r28, java.nio.ByteBuffer r29, int r30, int r31, long r32, boolean r34) throws com.google.android.exoplayer2.ExoPlaybackException {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r23 = this;
        r7 = r23;
        r5 = r24;
        r8 = r26;
        r10 = r28;
        r11 = r30;
        r0 = r32;
        r2 = r7.f14792r;
        r12 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r4 != 0) goto L_0x0019;
    L_0x0017:
        r7.f14792r = r5;
    L_0x0019:
        r2 = r7.f14775L;
        r12 = r0 - r2;
        r14 = 1;
        if (r34 == 0) goto L_0x0024;
    L_0x0020:
        r7.m18529a(r10, r11, r12);
        return r14;
    L_0x0024:
        r2 = 0;
        r2 = r0 - r5;
        r4 = r7.f14788n;
        r15 = r7.f14789o;
        r16 = 0;
        if (r4 != r15) goto L_0x003a;
    L_0x002f:
        r0 = com.google.android.exoplayer2.video.C4445c.m18512c(r2);
        if (r0 == 0) goto L_0x0039;
    L_0x0035:
        r7.m18529a(r10, r11, r12);
        return r14;
    L_0x0039:
        return r16;
    L_0x003a:
        r17 = android.os.SystemClock.elapsedRealtime();
        r19 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r17 = r17 * r19;
        r4 = r23.getState();
        r15 = 2;
        if (r4 != r15) goto L_0x004b;
    L_0x0049:
        r4 = 1;
        goto L_0x004c;
    L_0x004b:
        r4 = 0;
    L_0x004c:
        r15 = r7.f14791q;
        if (r15 == 0) goto L_0x00e1;
    L_0x0050:
        if (r4 == 0) goto L_0x0062;
    L_0x0052:
        r14 = r7.f14798x;
        r21 = r12;
        r12 = r17 - r14;
        r12 = r7.m18548c(r2, r12);
        if (r12 == 0) goto L_0x0064;
    L_0x005e:
        r3 = r21;
        goto L_0x00e2;
    L_0x0062:
        r21 = r12;
    L_0x0064:
        if (r4 == 0) goto L_0x00e0;
    L_0x0066:
        r12 = r7.f14792r;
        r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r4 != 0) goto L_0x006e;
    L_0x006c:
        goto L_0x00e0;
    L_0x006e:
        r4 = 0;
        r12 = r17 - r8;
        r14 = r2 - r12;
        r2 = java.lang.System.nanoTime();
        r14 = r14 * r19;
        r12 = r2 + r14;
        r4 = r7.f14779e;
        r12 = r4.m8537a(r0, r12);
        r0 = r12 - r2;
        r14 = r0 / r19;
        r0 = r7.m18545b(r14, r8);
        if (r0 == 0) goto L_0x0097;
    L_0x008b:
        r0 = r7;
        r1 = r10;
        r2 = r11;
        r3 = r21;
        r0 = r0.m18539a(r1, r2, r3, r5);
        if (r0 == 0) goto L_0x0097;
    L_0x0096:
        return r16;
    L_0x0097:
        r0 = r7.mo3992a(r14, r8);
        if (r0 == 0) goto L_0x00a4;
    L_0x009d:
        r3 = r21;
        r7.m18543b(r10, r11, r3);
        r0 = 1;
        return r0;
    L_0x00a4:
        r3 = r21;
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r1 = 21;
        if (r0 < r1) goto L_0x00bc;
    L_0x00ac:
        r0 = 50000; // 0xc350 float:7.0065E-41 double:2.47033E-319;
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x00df;
    L_0x00b3:
        r0 = r7;
        r1 = r10;
        r2 = r11;
        r5 = r12;
        r0.m18544b(r1, r2, r3, r5);
        r0 = 1;
        return r0;
    L_0x00bc:
        r0 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x00df;
    L_0x00c2:
        r0 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
        r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x00da;
    L_0x00c8:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r5 = r14 - r0;
        r5 = r5 / r19;	 Catch:{ InterruptedException -> 0x00d2 }
        java.lang.Thread.sleep(r5);	 Catch:{ InterruptedException -> 0x00d2 }
        goto L_0x00da;
    L_0x00d2:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return r16;
    L_0x00da:
        r7.m18547c(r10, r11, r3);
        r0 = 1;
        return r0;
    L_0x00df:
        return r16;
    L_0x00e0:
        return r16;
    L_0x00e1:
        r3 = r12;
    L_0x00e2:
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r1 = 21;
        if (r0 < r1) goto L_0x00f4;
    L_0x00e8:
        r5 = java.lang.System.nanoTime();
        r0 = r7;
        r1 = r10;
        r2 = r11;
        r0.m18544b(r1, r2, r3, r5);
    L_0x00f2:
        r0 = 1;
        goto L_0x00f8;
    L_0x00f4:
        r7.m18547c(r10, r11, r3);
        goto L_0x00f2;
    L_0x00f8:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @CallSuper
    /* renamed from: b */
    protected void mo3994b(long j) {
        this.f14797w--;
        while (this.f14776M != 0 && j >= this.f14785k[0]) {
            this.f14775L = this.f14784j[0];
            this.f14776M--;
            System.arraycopy(this.f14784j, 1, this.f14784j, 0, this.f14776M);
            System.arraycopy(this.f14785k, 1, this.f14785k, 0, this.f14776M);
        }
    }

    /* renamed from: a */
    protected boolean mo3992a(long j, long j2) {
        return C4445c.m18512c(j);
    }

    /* renamed from: b */
    protected boolean m18545b(long j, long j2) {
        return C4445c.m18513d(j);
    }

    /* renamed from: c */
    protected boolean m18548c(long j, long j2) {
        return (C4445c.m18512c(j) == null || j2 <= 100000) ? 0 : 1;
    }

    /* renamed from: a */
    protected void m18529a(MediaCodec mediaCodec, int i, long j) {
        C2311t.m8447a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, 0);
        C2311t.m8446a();
        mediaCodec = this.a;
        mediaCodec.f5615f++;
    }

    /* renamed from: b */
    protected void m18543b(MediaCodec mediaCodec, int i, long j) {
        C2311t.m8447a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, 0);
        C2311t.m8446a();
        mo3982a(1);
    }

    /* renamed from: a */
    protected boolean m18539a(MediaCodec mediaCodec, int i, long j, long j2) throws ExoPlaybackException {
        mediaCodec = m16838a(j2);
        if (mediaCodec == null) {
            return null;
        }
        i = this.a;
        i.f5618i++;
        mo3982a(this.f14797w + mediaCodec);
        mo3996n();
        return true;
    }

    /* renamed from: a */
    protected void mo3982a(int i) {
        C2037c c2037c = this.a;
        c2037c.f5616g += i;
        this.f14795u += i;
        this.f14796v += i;
        this.a.f5617h = Math.max(this.f14796v, this.a.f5617h);
        if (this.f14795u >= this.f14782h) {
            m18520v();
        }
    }

    /* renamed from: c */
    protected void m18547c(MediaCodec mediaCodec, int i, long j) {
        m18518t();
        C2311t.m8447a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2311t.m8446a();
        this.f14798x = SystemClock.elapsedRealtime() * 1000;
        mediaCodec = this.a;
        mediaCodec.f5614e++;
        this.f14796v = null;
        mo3990h();
    }

    @TargetApi(21)
    /* renamed from: b */
    protected void m18544b(MediaCodec mediaCodec, int i, long j, long j2) {
        m18518t();
        C2311t.m8447a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C2311t.m8446a();
        this.f14798x = SystemClock.elapsedRealtime() * 1000;
        mediaCodec = this.a;
        mediaCodec.f5614e++;
        this.f14796v = null;
        mo3990h();
    }

    /* renamed from: b */
    private boolean m18511b(C2130a c2130a) {
        return (C2314v.f6956a < 23 || this.f14772I || C4445c.m18508a(c2130a.f6122a) || (c2130a.f6127f != null && DummySurface.isSecureSupported(this.f14778d) == null)) ? null : true;
    }

    /* renamed from: p */
    private void m18514p() {
        this.f14793s = this.f14781g > 0 ? SystemClock.elapsedRealtime() + this.f14781g : -9223372036854775807L;
    }

    /* renamed from: q */
    private void m18515q() {
        this.f14791q = false;
        if (C2314v.f6956a >= 23 && this.f14772I) {
            MediaCodec k = m17973k();
            if (k != null) {
                this.f14777b = new C2331b(k);
            }
        }
    }

    /* renamed from: h */
    void mo3990h() {
        if (!this.f14791q) {
            this.f14791q = true;
            this.f14780f.m8516a(this.f14788n);
        }
    }

    /* renamed from: r */
    private void m18516r() {
        if (this.f14791q) {
            this.f14780f.m8516a(this.f14788n);
        }
    }

    /* renamed from: s */
    private void m18517s() {
        this.f14768E = -1;
        this.f14769F = -1;
        this.f14771H = -1.0f;
        this.f14770G = -1;
    }

    /* renamed from: t */
    private void m18518t() {
        if (this.f14764A != -1 || this.f14765B != -1) {
            if (this.f14768E != this.f14764A || this.f14769F != this.f14765B || this.f14770G != this.f14766C || this.f14771H != this.f14767D) {
                this.f14780f.m8514a(this.f14764A, this.f14765B, this.f14766C, this.f14767D);
                this.f14768E = this.f14764A;
                this.f14769F = this.f14765B;
                this.f14770G = this.f14766C;
                this.f14771H = this.f14767D;
            }
        }
    }

    /* renamed from: u */
    private void m18519u() {
        if (this.f14768E != -1 || this.f14769F != -1) {
            this.f14780f.m8514a(this.f14768E, this.f14769F, this.f14770G, this.f14771H);
        }
    }

    /* renamed from: v */
    private void m18520v() {
        if (this.f14795u > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f14780f.m8515a(this.f14795u, elapsedRealtime - this.f14794t);
            this.f14795u = 0;
            this.f14794t = elapsedRealtime;
        }
    }

    @TargetApi(23)
    /* renamed from: a */
    private static void m18505a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m18506a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    protected MediaFormat m18524a(Format format, C2330a c2330a, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.sampleMimeType);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        C2131b.m7680a(mediaFormat, format.initializationData);
        C2131b.m7677a(mediaFormat, "frame-rate", format.frameRate);
        C2131b.m7678a(mediaFormat, "rotation-degrees", format.rotationDegrees);
        C2131b.m7676a(mediaFormat, format.colorInfo);
        mediaFormat.setInteger("max-width", c2330a.f6999a);
        mediaFormat.setInteger("max-height", c2330a.f7000b);
        C2131b.m7678a(mediaFormat, "max-input-size", c2330a.f7001c);
        if (C2314v.f6956a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            C4445c.m18506a(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* renamed from: a */
    protected C2330a m18525a(C2130a c2130a, Format format, Format[] formatArr) throws DecoderQueryException {
        int i = format.width;
        int i2 = format.height;
        int b = C4445c.m18510b(format);
        if (formatArr.length == 1) {
            return new C2330a(i, i2, b);
        }
        int i3 = i2;
        int i4 = b;
        i2 = 0;
        b = i;
        for (Format format2 : formatArr) {
            if (C4445c.m18509a(c2130a.f6125d, format, format2)) {
                int i5;
                if (format2.width != -1) {
                    if (format2.height != -1) {
                        i5 = 0;
                        i2 |= i5;
                        b = Math.max(b, format2.width);
                        i3 = Math.max(i3, format2.height);
                        i4 = Math.max(i4, C4445c.m18510b(format2));
                    }
                }
                i5 = 1;
                i2 |= i5;
                b = Math.max(b, format2.width);
                i3 = Math.max(i3, format2.height);
                i4 = Math.max(i4, C4445c.m18510b(format2));
            }
        }
        if (i2 != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Resolutions unknown. Codec max resolution: ");
            stringBuilder.append(b);
            stringBuilder.append("x");
            stringBuilder.append(i3);
            Log.w("MediaCodecVideoRenderer", stringBuilder.toString());
            c2130a = C4445c.m18504a(c2130a, format);
            if (c2130a != null) {
                b = Math.max(b, c2130a.x);
                i3 = Math.max(i3, c2130a.y);
                i4 = Math.max(i4, C4445c.m18503a(format.sampleMimeType, b, i3));
                format = new StringBuilder();
                format.append("Codec max resolution adjusted to: ");
                format.append(b);
                format.append("x");
                format.append(i3);
                Log.w("MediaCodecVideoRenderer", format.toString());
            }
        }
        return new C2330a(b, i3, i4);
    }

    /* renamed from: a */
    private static Point m18504a(C2130a c2130a, Format format) throws DecoderQueryException {
        int i = 0;
        Object obj = format.height > format.width ? 1 : null;
        int i2 = obj != null ? format.height : format.width;
        int i3 = obj != null ? format.width : format.height;
        float f = ((float) i3) / ((float) i2);
        int[] iArr = f14763c;
        int length = iArr.length;
        while (i < length) {
            int i4 = iArr[i];
            int i5 = (int) (((float) i4) * f);
            if (i4 > i2) {
                if (i5 > i3) {
                    int i6;
                    if (C2314v.f6956a >= 21) {
                        i6 = obj != null ? i5 : i4;
                        if (obj == null) {
                            i4 = i5;
                        }
                        Point a = c2130a.m7670a(i6, i4);
                        if (c2130a.m7672a(a.x, a.y, (double) format.frameRate)) {
                            return a;
                        }
                    } else {
                        i4 = C2314v.m8455a(i4, 16) * 16;
                        i6 = C2314v.m8455a(i5, 16) * 16;
                        if (i4 * i6 <= MediaCodecUtil.m7654b()) {
                            format = obj != null ? i6 : i4;
                            if (obj != null) {
                                i6 = i4;
                            }
                            return new Point(format, i6);
                        }
                    }
                    i++;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    private static int m18510b(Format format) {
        if (format.maxInputSize == -1) {
            return C4445c.m18503a(format.sampleMimeType, format.width, format.height);
        }
        int i = 0;
        for (int i2 = 0; i2 < format.initializationData.size(); i2++) {
            i += ((byte[]) format.initializationData.get(i2)).length;
        }
        return format.maxInputSize + i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static int m18503a(java.lang.String r5, int r6, int r7) {
        /*
        r0 = -1;
        if (r6 == r0) goto L_0x007e;
    L_0x0003:
        if (r7 != r0) goto L_0x0007;
    L_0x0005:
        goto L_0x007e;
    L_0x0007:
        r1 = r5.hashCode();
        r2 = 4;
        r3 = 3;
        r4 = 2;
        switch(r1) {
            case -1664118616: goto L_0x0044;
            case -1662541442: goto L_0x003a;
            case 1187890754: goto L_0x0030;
            case 1331836730: goto L_0x0026;
            case 1599127256: goto L_0x001c;
            case 1599127257: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x004e;
    L_0x0012:
        r1 = "video/x-vnd.on2.vp9";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x001a:
        r5 = 5;
        goto L_0x004f;
    L_0x001c:
        r1 = "video/x-vnd.on2.vp8";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x0024:
        r5 = 3;
        goto L_0x004f;
    L_0x0026:
        r1 = "video/avc";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x002e:
        r5 = 2;
        goto L_0x004f;
    L_0x0030:
        r1 = "video/mp4v-es";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x0038:
        r5 = 1;
        goto L_0x004f;
    L_0x003a:
        r1 = "video/hevc";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x0042:
        r5 = 4;
        goto L_0x004f;
    L_0x0044:
        r1 = "video/3gpp";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x004c:
        r5 = 0;
        goto L_0x004f;
    L_0x004e:
        r5 = -1;
    L_0x004f:
        switch(r5) {
            case 0: goto L_0x0075;
            case 1: goto L_0x0075;
            case 2: goto L_0x0059;
            case 3: goto L_0x0056;
            case 4: goto L_0x0053;
            case 5: goto L_0x0053;
            default: goto L_0x0052;
        };
    L_0x0052:
        return r0;
    L_0x0053:
        r6 = r6 * r7;
        goto L_0x0078;
    L_0x0056:
        r6 = r6 * r7;
        goto L_0x0077;
    L_0x0059:
        r5 = "BRAVIA 4K 2015";
        r1 = com.google.android.exoplayer2.util.C2314v.f6959d;
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x0064;
    L_0x0063:
        return r0;
    L_0x0064:
        r5 = 16;
        r6 = com.google.android.exoplayer2.util.C2314v.m8455a(r6, r5);
        r7 = com.google.android.exoplayer2.util.C2314v.m8455a(r7, r5);
        r6 = r6 * r7;
        r6 = r6 * 16;
        r6 = r6 * 16;
        goto L_0x0077;
    L_0x0075:
        r6 = r6 * r7;
    L_0x0077:
        r2 = 2;
    L_0x0078:
        r6 = r6 * 3;
        r2 = r2 * 2;
        r6 = r6 / r2;
        return r6;
    L_0x007e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    private static boolean m18509a(boolean z, Format format, Format format2) {
        return format.sampleMimeType.equals(format2.sampleMimeType) && format.rotationDegrees == format2.rotationDegrees && ((z || (format.width == format2.width && format.height == format2.height)) && C2314v.m8480a(format.colorInfo, format2.colorInfo));
    }

    /* renamed from: w */
    private static boolean m18521w() {
        return C2314v.f6956a <= 22 && "foster".equals(C2314v.f6957b) && "NVIDIA".equals(C2314v.f6958c);
    }

    /* renamed from: a */
    private static boolean m18508a(String str) {
        if (!((("deb".equals(C2314v.f6957b) || "flo".equals(C2314v.f6957b) || "mido".equals(C2314v.f6957b) || "santoni".equals(C2314v.f6957b)) && "OMX.qcom.video.decoder.avc".equals(str)) || ((("tcl_eu".equals(C2314v.f6957b) || "SVP-DTV15".equals(C2314v.f6957b) || "BRAVIA_ATV2".equals(C2314v.f6957b) || C2314v.f6957b.startsWith("panell_") || "F3311".equals(C2314v.f6957b) || "M5c".equals(C2314v.f6957b) || "QM16XE_U".equals(C2314v.f6957b) || "A7010a48".equals(C2314v.f6957b) || "woods_f".equals(C2314v.f6959d)) && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) || (("ALE-L21".equals(C2314v.f6959d) || "CAM-L21".equals(C2314v.f6959d)) && "OMX.k3.video.decoder.avc".equals(str))))) {
            if (!"HUAWEI VNS-L21".equals(C2314v.f6959d) || "OMX.IMG.MSVDX.Decoder.AVC".equals(str) == null) {
                return null;
            }
        }
        return true;
    }
}
