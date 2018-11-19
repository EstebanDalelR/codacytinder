package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C4237a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C3604c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2311t;
import com.google.android.exoplayer2.util.C2314v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class MediaCodecRenderer extends C4237a {
    /* renamed from: b */
    private static final byte[] f14351b = C2314v.m8500h("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    /* renamed from: A */
    private long f14352A;
    /* renamed from: B */
    private int f14353B;
    /* renamed from: C */
    private int f14354C;
    /* renamed from: D */
    private ByteBuffer f14355D;
    /* renamed from: E */
    private boolean f14356E;
    /* renamed from: F */
    private boolean f14357F;
    /* renamed from: G */
    private int f14358G;
    /* renamed from: H */
    private int f14359H;
    /* renamed from: I */
    private boolean f14360I;
    /* renamed from: J */
    private boolean f14361J;
    /* renamed from: K */
    private boolean f14362K;
    /* renamed from: L */
    private boolean f14363L;
    /* renamed from: M */
    private boolean f14364M;
    /* renamed from: N */
    private boolean f14365N;
    /* renamed from: a */
    protected C2037c f14366a;
    /* renamed from: c */
    private final MediaCodecSelector f14367c;
    @Nullable
    /* renamed from: d */
    private final DrmSessionManager<C3604c> f14368d;
    /* renamed from: e */
    private final boolean f14369e;
    /* renamed from: f */
    private final DecoderInputBuffer f14370f;
    /* renamed from: g */
    private final DecoderInputBuffer f14371g;
    /* renamed from: h */
    private final C2122i f14372h;
    /* renamed from: i */
    private final List<Long> f14373i;
    /* renamed from: j */
    private final BufferInfo f14374j;
    /* renamed from: k */
    private Format f14375k;
    /* renamed from: l */
    private DrmSession<C3604c> f14376l;
    /* renamed from: m */
    private DrmSession<C3604c> f14377m;
    /* renamed from: n */
    private MediaCodec f14378n;
    /* renamed from: o */
    private C2130a f14379o;
    /* renamed from: p */
    private int f14380p;
    /* renamed from: q */
    private boolean f14381q;
    /* renamed from: r */
    private boolean f14382r;
    /* renamed from: s */
    private boolean f14383s;
    /* renamed from: t */
    private boolean f14384t;
    /* renamed from: u */
    private boolean f14385u;
    /* renamed from: v */
    private boolean f14386v;
    /* renamed from: w */
    private boolean f14387w;
    /* renamed from: x */
    private boolean f14388x;
    /* renamed from: y */
    private ByteBuffer[] f14389y;
    /* renamed from: z */
    private ByteBuffer[] f14390z;

    public static class DecoderInitializationException extends Exception {
        /* renamed from: a */
        public final String f6108a;
        /* renamed from: b */
        public final boolean f6109b;
        /* renamed from: c */
        public final String f6110c;
        /* renamed from: d */
        public final String f6111d;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder init failed: [");
            stringBuilder.append(i);
            stringBuilder.append("], ");
            stringBuilder.append(format);
            super(stringBuilder.toString(), th);
            this.f6108a = format.sampleMimeType;
            this.f6109b = z;
            this.f6110c = null;
            this.f6111d = m7640a(i);
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder init failed: ");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(format);
            super(stringBuilder.toString(), th);
            this.f6108a = format.sampleMimeType;
            this.f6109b = z;
            this.f6110c = str;
            this.f6111d = C2314v.f6956a >= true ? m7641a(th) : null;
        }

        @TargetApi(21)
        /* renamed from: a */
        private static String m7641a(Throwable th) {
            return th instanceof CodecException ? ((CodecException) th).getDiagnosticInfo() : null;
        }

        /* renamed from: a */
        private static String m7640a(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            stringBuilder.append(str);
            stringBuilder.append(Math.abs(i));
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    protected int mo3979a(MediaCodec mediaCodec, C2130a c2130a, Format format, Format format2) {
        return 0;
    }

    /* renamed from: a */
    protected abstract int mo3980a(MediaCodecSelector mediaCodecSelector, DrmSessionManager<C3604c> drmSessionManager, Format format) throws DecoderQueryException;

    /* renamed from: a */
    protected void mo3717a() {
    }

    /* renamed from: a */
    protected void mo3983a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    /* renamed from: a */
    protected void mo3985a(DecoderInputBuffer decoderInputBuffer) {
    }

    /* renamed from: a */
    protected abstract void mo3986a(C2130a c2130a, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DecoderQueryException;

    /* renamed from: a */
    protected void mo3987a(String str, long j, long j2) {
    }

    /* renamed from: a */
    protected abstract boolean mo3988a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws ExoPlaybackException;

    /* renamed from: a */
    protected boolean mo3993a(C2130a c2130a) {
        return true;
    }

    /* renamed from: b */
    protected void mo3720b() {
    }

    /* renamed from: b */
    protected void mo3994b(long j) {
    }

    /* renamed from: i */
    protected void mo3991i() throws ExoPlaybackException {
    }

    /* renamed from: o */
    protected long m17977o() {
        return 0;
    }

    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public MediaCodecRenderer(int i, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<C3604c> drmSessionManager, boolean z) {
        super(i);
        C2289a.m8313b(C2314v.f6956a >= 16 ? 1 : 0);
        this.f14367c = (MediaCodecSelector) C2289a.m8309a((Object) mediaCodecSelector);
        this.f14368d = drmSessionManager;
        this.f14369e = z;
        this.f14370f = new DecoderInputBuffer(0);
        this.f14371g = DecoderInputBuffer.m13515e();
        this.f14372h = new C2122i();
        this.f14373i = new ArrayList();
        this.f14374j = new BufferInfo();
        this.f14358G = 0;
        this.f14359H = 0;
    }

    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return mo3980a(this.f14367c, this.f14368d, format);
        } catch (Format format2) {
            throw ExoPlaybackException.m7218a(format2, m16848f());
        }
    }

    /* renamed from: a */
    protected C2130a mo3981a(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws DecoderQueryException {
        return mediaCodecSelector.getDecoderInfo(format.sampleMimeType, z);
    }

    /* renamed from: j */
    protected final void m17972j() throws ExoPlaybackException {
        if (this.f14378n == null) {
            if (this.f14375k != null) {
                MediaCrypto a;
                boolean requiresSecureDecoderComponent;
                StringBuilder stringBuilder;
                long elapsedRealtime;
                long elapsedRealtime2;
                C2037c c2037c;
                this.f14376l = this.f14377m;
                String str = this.f14375k.sampleMimeType;
                if (this.f14376l != null) {
                    C3604c c3604c = (C3604c) this.f14376l.getMediaCrypto();
                    if (c3604c != null) {
                        a = c3604c.m13566a();
                        requiresSecureDecoderComponent = c3604c.requiresSecureDecoderComponent(str);
                        if (this.f14379o == null) {
                            try {
                                this.f14379o = mo3981a(this.f14367c, this.f14375k, requiresSecureDecoderComponent);
                                if (this.f14379o == null && requiresSecureDecoderComponent) {
                                    this.f14379o = mo3981a(this.f14367c, this.f14375k, false);
                                    if (this.f14379o != null) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Drm session requires secure decoder for ");
                                        stringBuilder.append(str);
                                        stringBuilder.append(", but no secure decoder available. Trying to proceed with ");
                                        stringBuilder.append(this.f14379o.f6122a);
                                        stringBuilder.append(".");
                                        Log.w("MediaCodecRenderer", stringBuilder.toString());
                                    }
                                }
                            } catch (Throwable e) {
                                m17934a(new DecoderInitializationException(this.f14375k, e, requiresSecureDecoderComponent, -49998));
                            }
                            if (this.f14379o == null) {
                                m17934a(new DecoderInitializationException(this.f14375k, null, requiresSecureDecoderComponent, -49999));
                            }
                        }
                        if (!mo3993a(this.f14379o)) {
                            str = this.f14379o.f6122a;
                            this.f14380p = m17938b(str);
                            this.f14381q = m17937a(str, this.f14375k);
                            this.f14382r = mo3989a(str);
                            this.f14383s = m17943c(str);
                            this.f14384t = m17944d(str);
                            this.f14385u = m17945e(str);
                            this.f14386v = m17940b(str, this.f14375k);
                            try {
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("createCodec:");
                                stringBuilder.append(str);
                                C2311t.m8447a(stringBuilder.toString());
                                this.f14378n = MediaCodec.createByCodecName(str);
                                C2311t.m8446a();
                                C2311t.m8447a("configureCodec");
                                mo3986a(this.f14379o, this.f14378n, this.f14375k, a);
                                C2311t.m8446a();
                                C2311t.m8447a("startCodec");
                                this.f14378n.start();
                                C2311t.m8446a();
                                elapsedRealtime2 = SystemClock.elapsedRealtime();
                                mo3987a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                m17947p();
                            } catch (Throwable e2) {
                                m17934a(new DecoderInitializationException(this.f14375k, e2, requiresSecureDecoderComponent, str));
                            }
                            this.f14352A = getState() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                            m17950s();
                            m17951t();
                            this.f14365N = true;
                            c2037c = this.f14366a;
                            c2037c.f5610a++;
                        }
                    } else if (this.f14376l.getError() == null) {
                        return;
                    }
                }
                a = null;
                requiresSecureDecoderComponent = false;
                if (this.f14379o == null) {
                    this.f14379o = mo3981a(this.f14367c, this.f14375k, requiresSecureDecoderComponent);
                    this.f14379o = mo3981a(this.f14367c, this.f14375k, false);
                    if (this.f14379o != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Drm session requires secure decoder for ");
                        stringBuilder.append(str);
                        stringBuilder.append(", but no secure decoder available. Trying to proceed with ");
                        stringBuilder.append(this.f14379o.f6122a);
                        stringBuilder.append(".");
                        Log.w("MediaCodecRenderer", stringBuilder.toString());
                    }
                    if (this.f14379o == null) {
                        m17934a(new DecoderInitializationException(this.f14375k, null, requiresSecureDecoderComponent, -49999));
                    }
                }
                if (!mo3993a(this.f14379o)) {
                    str = this.f14379o.f6122a;
                    this.f14380p = m17938b(str);
                    this.f14381q = m17937a(str, this.f14375k);
                    this.f14382r = mo3989a(str);
                    this.f14383s = m17943c(str);
                    this.f14384t = m17944d(str);
                    this.f14385u = m17945e(str);
                    this.f14386v = m17940b(str, this.f14375k);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("createCodec:");
                    stringBuilder.append(str);
                    C2311t.m8447a(stringBuilder.toString());
                    this.f14378n = MediaCodec.createByCodecName(str);
                    C2311t.m8446a();
                    C2311t.m8447a("configureCodec");
                    mo3986a(this.f14379o, this.f14378n, this.f14375k, a);
                    C2311t.m8446a();
                    C2311t.m8447a("startCodec");
                    this.f14378n.start();
                    C2311t.m8446a();
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    mo3987a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    m17947p();
                    if (getState() != 2) {
                    }
                    this.f14352A = getState() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    m17950s();
                    m17951t();
                    this.f14365N = true;
                    c2037c = this.f14366a;
                    c2037c.f5610a++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m17934a(DecoderInitializationException decoderInitializationException) throws ExoPlaybackException {
        throw ExoPlaybackException.m7218a(decoderInitializationException, m16848f());
    }

    /* renamed from: k */
    protected final MediaCodec m17973k() {
        return this.f14378n;
    }

    /* renamed from: l */
    protected final C2130a m17974l() {
        return this.f14379o;
    }

    /* renamed from: a */
    protected void mo3719a(boolean z) throws ExoPlaybackException {
        this.f14366a = new C2037c();
    }

    /* renamed from: a */
    protected void mo3718a(long j, boolean z) throws ExoPlaybackException {
        this.f14362K = false;
        this.f14363L = false;
        if (this.f14378n != null) {
            mo3996n();
        }
    }

    /* renamed from: c */
    protected void mo3721c() {
        this.f14375k = null;
        try {
            mo3995m();
            try {
                if (this.f14376l != null) {
                    this.f14368d.releaseSession(this.f14376l);
                }
                try {
                    if (!(this.f14377m == null || this.f14377m == this.f14376l)) {
                        this.f14368d.releaseSession(this.f14377m);
                    }
                    this.f14376l = null;
                    this.f14377m = null;
                } catch (Throwable th) {
                    this.f14376l = null;
                    this.f14377m = null;
                }
            } catch (Throwable th2) {
                this.f14376l = null;
                this.f14377m = null;
            }
        } catch (Throwable th3) {
            this.f14376l = null;
            this.f14377m = null;
        }
    }

    /* renamed from: m */
    protected void mo3995m() {
        this.f14352A = -9223372036854775807L;
        m17950s();
        m17951t();
        this.f14364M = false;
        this.f14356E = false;
        this.f14373i.clear();
        m17948q();
        this.f14379o = null;
        this.f14357F = false;
        this.f14360I = false;
        this.f14381q = false;
        this.f14382r = false;
        this.f14380p = 0;
        this.f14383s = false;
        this.f14384t = false;
        this.f14386v = false;
        this.f14387w = false;
        this.f14388x = false;
        this.f14361J = false;
        this.f14358G = 0;
        this.f14359H = 0;
        if (this.f14378n != null) {
            C2037c c2037c = this.f14366a;
            c2037c.f5611b++;
            try {
                this.f14378n.stop();
                try {
                    this.f14378n.release();
                    this.f14378n = null;
                    if (this.f14376l != null && this.f14377m != this.f14376l) {
                        try {
                            this.f14368d.releaseSession(this.f14376l);
                        } finally {
                            this.f14376l = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f14378n = null;
                    if (!(this.f14376l == null || this.f14377m == this.f14376l)) {
                        this.f14368d.releaseSession(this.f14376l);
                    }
                } finally {
                    this.f14376l = null;
                }
            } catch (Throwable th2) {
                this.f14378n = null;
                if (!(this.f14376l == null || this.f14377m == this.f14376l)) {
                    try {
                        this.f14368d.releaseSession(this.f14376l);
                    } finally {
                        this.f14376l = null;
                    }
                }
            } finally {
                this.f14376l = null;
            }
        }
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.f14363L) {
            mo3991i();
            return;
        }
        if (this.f14375k == null) {
            this.f14371g.mo2221a();
            int a = m16839a(this.f14372h, this.f14371g, true);
            if (a == -5) {
                mo3984a(this.f14372h.f6062a);
            } else if (a == -4) {
                C2289a.m8313b(this.f14371g.m7344c());
                this.f14362K = true;
                m17954w();
                return;
            } else {
                return;
            }
        }
        m17972j();
        if (this.f14378n != null) {
            C2311t.m8447a("drainAndFeed");
            while (mo3992a(j, j2)) {
            }
            while (mo3990h() != null) {
            }
            C2311t.m8446a();
        } else {
            j2 = this.f14366a;
            j2.f5613d += m16838a(j);
            this.f14371g.mo2221a();
            j = m16839a(this.f14372h, this.f14371g, 0);
            if (j == -5) {
                mo3984a(this.f14372h.f6062a);
            } else if (j == -4) {
                C2289a.m8313b(this.f14371g.m7344c());
                this.f14362K = true;
                m17954w();
            }
        }
        this.f14366a.m7353a();
    }

    /* renamed from: n */
    protected void mo3996n() throws ExoPlaybackException {
        this.f14352A = -9223372036854775807L;
        m17950s();
        m17951t();
        this.f14365N = true;
        this.f14364M = false;
        this.f14356E = false;
        this.f14373i.clear();
        this.f14387w = false;
        this.f14388x = false;
        if (!this.f14382r) {
            if (!this.f14384t || !this.f14361J) {
                if (this.f14359H != 0) {
                    mo3995m();
                    m17972j();
                } else {
                    this.f14378n.flush();
                    this.f14360I = false;
                }
                if (this.f14357F && this.f14375k != null) {
                    this.f14358G = 1;
                    return;
                }
            }
        }
        mo3995m();
        m17972j();
        if (this.f14357F) {
        }
    }

    /* renamed from: h */
    private boolean mo3990h() throws ExoPlaybackException {
        if (!(this.f14378n == null || this.f14359H == 2)) {
            if (!this.f14362K) {
                if (this.f14353B < 0) {
                    this.f14353B = this.f14378n.dequeueInputBuffer(0);
                    if (this.f14353B < 0) {
                        return false;
                    }
                    this.f14370f.f10830b = mo3982a(this.f14353B);
                    this.f14370f.mo2221a();
                }
                if (this.f14359H == 1) {
                    if (!this.f14383s) {
                        this.f14361J = true;
                        this.f14378n.queueInputBuffer(this.f14353B, 0, 0, 0, 4);
                        m17950s();
                    }
                    this.f14359H = 2;
                    return false;
                } else if (this.f14387w) {
                    this.f14387w = false;
                    this.f14370f.f10830b.put(f14351b);
                    this.f14378n.queueInputBuffer(this.f14353B, 0, f14351b.length, 0, 0);
                    m17950s();
                    this.f14360I = true;
                    return true;
                } else {
                    int i;
                    int i2;
                    if (this.f14364M) {
                        i = -4;
                        i2 = 0;
                    } else {
                        if (this.f14358G == 1) {
                            for (i = 0; i < this.f14375k.initializationData.size(); i++) {
                                this.f14370f.f10830b.put((byte[]) this.f14375k.initializationData.get(i));
                            }
                            this.f14358G = 2;
                        }
                        i = this.f14370f.f10830b.position();
                        i2 = i;
                        i = m16839a(this.f14372h, this.f14370f, false);
                    }
                    if (i == -3) {
                        return false;
                    }
                    if (i == -5) {
                        if (this.f14358G == 2) {
                            this.f14370f.mo2221a();
                            this.f14358G = 1;
                        }
                        mo3984a(this.f14372h.f6062a);
                        return true;
                    } else if (this.f14370f.m7344c()) {
                        if (this.f14358G == 2) {
                            this.f14370f.mo2221a();
                            this.f14358G = 1;
                        }
                        this.f14362K = true;
                        if (this.f14360I) {
                            try {
                                if (!this.f14383s) {
                                    this.f14361J = true;
                                    this.f14378n.queueInputBuffer(this.f14353B, 0, 0, 0, 4);
                                    m17950s();
                                }
                                return false;
                            } catch (Exception e) {
                                throw ExoPlaybackException.m7218a(e, m16848f());
                            }
                        }
                        m17954w();
                        return false;
                    } else if (!this.f14365N || this.f14370f.m7345d()) {
                        this.f14365N = false;
                        boolean g = this.f14370f.m13520g();
                        this.f14364M = m17941b(g);
                        if (this.f14364M) {
                            return false;
                        }
                        if (this.f14381q && !g) {
                            C2300i.m8355a(this.f14370f.f10830b);
                            if (this.f14370f.f10830b.position() == 0) {
                                return true;
                            }
                            this.f14381q = false;
                        }
                        try {
                            long j = this.f14370f.f10831c;
                            if (this.f14370f.m7342b()) {
                                this.f14373i.add(Long.valueOf(j));
                            }
                            this.f14370f.m13521h();
                            mo3985a(this.f14370f);
                            if (g) {
                                this.f14378n.queueSecureInputBuffer(this.f14353B, 0, m17932a(this.f14370f, i2), j, 0);
                            } else {
                                this.f14378n.queueInputBuffer(this.f14353B, 0, this.f14370f.f10830b.limit(), j, 0);
                            }
                            m17950s();
                            this.f14360I = true;
                            this.f14358G = 0;
                            C2037c c2037c = this.f14366a;
                            c2037c.f5612c++;
                            return true;
                        } catch (Exception e2) {
                            throw ExoPlaybackException.m7218a(e2, m16848f());
                        }
                    } else {
                        this.f14370f.mo2221a();
                        if (this.f14358G == 2) {
                            this.f14358G = 1;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    private void m17947p() {
        if (C2314v.f6956a < 21) {
            this.f14389y = this.f14378n.getInputBuffers();
            this.f14390z = this.f14378n.getOutputBuffers();
        }
    }

    /* renamed from: q */
    private void m17948q() {
        if (C2314v.f6956a < 21) {
            this.f14389y = null;
            this.f14390z = null;
        }
    }

    /* renamed from: a */
    private ByteBuffer mo3982a(int i) {
        if (C2314v.f6956a >= 21) {
            return this.f14378n.getInputBuffer(i);
        }
        return this.f14389y[i];
    }

    /* renamed from: b */
    private ByteBuffer m17939b(int i) {
        if (C2314v.f6956a >= 21) {
            return this.f14378n.getOutputBuffer(i);
        }
        return this.f14390z[i];
    }

    /* renamed from: r */
    private boolean m17949r() {
        return this.f14354C >= 0;
    }

    /* renamed from: s */
    private void m17950s() {
        this.f14353B = -1;
        this.f14370f.f10830b = null;
    }

    /* renamed from: t */
    private void m17951t() {
        this.f14354C = -1;
        this.f14355D = null;
    }

    /* renamed from: a */
    private static CryptoInfo m17932a(DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer = decoderInputBuffer.f10829a.m7351a();
        if (i == 0) {
            return decoderInputBuffer;
        }
        if (decoderInputBuffer.numBytesOfClearData == null) {
            decoderInputBuffer.numBytesOfClearData = new int[1];
        }
        int[] iArr = decoderInputBuffer.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return decoderInputBuffer;
    }

    /* renamed from: b */
    private boolean m17941b(boolean z) throws ExoPlaybackException {
        if (this.f14376l != null) {
            if (z || !this.f14369e) {
                z = this.f14376l.getState();
                boolean z2 = true;
                if (z) {
                    throw ExoPlaybackException.m7218a(this.f14376l.getError(), m16848f());
                }
                if (z) {
                    z2 = false;
                }
                return z2;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected void mo3984a(Format format) throws ExoPlaybackException {
        Format format2 = this.f14375k;
        this.f14375k = format;
        if ((C2314v.m8480a(this.f14375k.drmInitData, format2 == null ? null : format2.drmInitData) ^ 1) != null) {
            if (this.f14375k.drmInitData == null) {
                this.f14377m = null;
            } else if (this.f14368d == null) {
                throw ExoPlaybackException.m7218a(new IllegalStateException("Media requires a DrmSessionManager"), m16848f());
            } else {
                this.f14377m = this.f14368d.acquireSession(Looper.myLooper(), this.f14375k.drmInitData);
                if (this.f14377m == this.f14376l) {
                    this.f14368d.releaseSession(this.f14377m);
                }
            }
        }
        boolean z = false;
        if (this.f14377m == this.f14376l && this.f14378n != null) {
            format = mo3979a(this.f14378n, this.f14379o, format2, this.f14375k);
            if (format != 3) {
                switch (format) {
                    case null:
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }
            this.f14357F = true;
            this.f14358G = 1;
            if (this.f14380p == 2 || (this.f14380p == 1 && this.f14375k.width == format2.width && this.f14375k.height == format2.height)) {
                z = true;
            }
            this.f14387w = z;
            z = true;
        }
        if (!z) {
            if (this.f14360I != null) {
                this.f14359H = 1;
                return;
            }
            mo3995m();
            m17972j();
        }
    }

    public boolean isEnded() {
        return this.f14363L;
    }

    public boolean isReady() {
        return (this.f14375k == null || this.f14364M || (!m16849g() && !m17949r() && (this.f14352A == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f14352A))) ? false : true;
    }

    /* renamed from: a */
    private boolean mo3992a(long r16, long r18) throws com.google.android.exoplayer2.ExoPlaybackException {
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
        r15 = this;
        r12 = r15;
        r0 = r12.m17949r();
        r13 = 1;
        r14 = 0;
        if (r0 != 0) goto L_0x00a2;
    L_0x0009:
        r0 = r12.f14385u;
        if (r0 == 0) goto L_0x0029;
    L_0x000d:
        r0 = r12.f14361J;
        if (r0 == 0) goto L_0x0029;
    L_0x0011:
        r0 = r12.f14378n;	 Catch:{ IllegalStateException -> 0x001e }
        r1 = r12.f14374j;	 Catch:{ IllegalStateException -> 0x001e }
        r2 = r12.m17977o();	 Catch:{ IllegalStateException -> 0x001e }
        r0 = r0.dequeueOutputBuffer(r1, r2);	 Catch:{ IllegalStateException -> 0x001e }
        goto L_0x0035;
    L_0x001e:
        r12.m17954w();
        r0 = r12.f14363L;
        if (r0 == 0) goto L_0x0028;
    L_0x0025:
        r12.mo3995m();
    L_0x0028:
        return r14;
    L_0x0029:
        r0 = r12.f14378n;
        r1 = r12.f14374j;
        r2 = r12.m17977o();
        r0 = r0.dequeueOutputBuffer(r1, r2);
    L_0x0035:
        if (r0 < 0) goto L_0x0083;
    L_0x0037:
        r1 = r12.f14388x;
        if (r1 == 0) goto L_0x0043;
    L_0x003b:
        r12.f14388x = r14;
        r1 = r12.f14378n;
        r1.releaseOutputBuffer(r0, r14);
        return r13;
    L_0x0043:
        r1 = r12.f14374j;
        r1 = r1.size;
        if (r1 != 0) goto L_0x0055;
    L_0x0049:
        r1 = r12.f14374j;
        r1 = r1.flags;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0055;
    L_0x0051:
        r12.m17954w();
        return r14;
    L_0x0055:
        r12.f14354C = r0;
        r0 = r12.m17939b(r0);
        r12.f14355D = r0;
        r0 = r12.f14355D;
        if (r0 == 0) goto L_0x0078;
    L_0x0061:
        r0 = r12.f14355D;
        r1 = r12.f14374j;
        r1 = r1.offset;
        r0.position(r1);
        r0 = r12.f14355D;
        r1 = r12.f14374j;
        r1 = r1.offset;
        r2 = r12.f14374j;
        r2 = r2.size;
        r1 = r1 + r2;
        r0.limit(r1);
    L_0x0078:
        r0 = r12.f14374j;
        r0 = r0.presentationTimeUs;
        r0 = r12.m17942c(r0);
        r12.f14356E = r0;
        goto L_0x00a2;
    L_0x0083:
        r1 = -2;
        if (r0 != r1) goto L_0x008a;
    L_0x0086:
        r12.m17952u();
        return r13;
    L_0x008a:
        r1 = -3;
        if (r0 != r1) goto L_0x0091;
    L_0x008d:
        r12.m17953v();
        return r13;
    L_0x0091:
        r0 = r12.f14383s;
        if (r0 == 0) goto L_0x00a1;
    L_0x0095:
        r0 = r12.f14362K;
        if (r0 != 0) goto L_0x009e;
    L_0x0099:
        r0 = r12.f14359H;
        r1 = 2;
        if (r0 != r1) goto L_0x00a1;
    L_0x009e:
        r12.m17954w();
    L_0x00a1:
        return r14;
    L_0x00a2:
        r0 = r12.f14385u;
        if (r0 == 0) goto L_0x00cf;
    L_0x00a6:
        r0 = r12.f14361J;
        if (r0 == 0) goto L_0x00cf;
    L_0x00aa:
        r5 = r12.f14378n;	 Catch:{ IllegalStateException -> 0x00c4 }
        r6 = r12.f14355D;	 Catch:{ IllegalStateException -> 0x00c4 }
        r7 = r12.f14354C;	 Catch:{ IllegalStateException -> 0x00c4 }
        r0 = r12.f14374j;	 Catch:{ IllegalStateException -> 0x00c4 }
        r8 = r0.flags;	 Catch:{ IllegalStateException -> 0x00c4 }
        r0 = r12.f14374j;	 Catch:{ IllegalStateException -> 0x00c4 }
        r9 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x00c4 }
        r11 = r12.f14356E;	 Catch:{ IllegalStateException -> 0x00c4 }
        r0 = r12;	 Catch:{ IllegalStateException -> 0x00c4 }
        r1 = r16;	 Catch:{ IllegalStateException -> 0x00c4 }
        r3 = r18;	 Catch:{ IllegalStateException -> 0x00c4 }
        r0 = r0.mo3988a(r1, r3, r5, r6, r7, r8, r9, r11);	 Catch:{ IllegalStateException -> 0x00c4 }
        goto L_0x00e8;
    L_0x00c4:
        r12.m17954w();
        r0 = r12.f14363L;
        if (r0 == 0) goto L_0x00ce;
    L_0x00cb:
        r12.mo3995m();
    L_0x00ce:
        return r14;
    L_0x00cf:
        r5 = r12.f14378n;
        r6 = r12.f14355D;
        r7 = r12.f14354C;
        r0 = r12.f14374j;
        r8 = r0.flags;
        r0 = r12.f14374j;
        r9 = r0.presentationTimeUs;
        r11 = r12.f14356E;
        r0 = r12;
        r1 = r16;
        r3 = r18;
        r0 = r0.mo3988a(r1, r3, r5, r6, r7, r8, r9, r11);
    L_0x00e8:
        if (r0 == 0) goto L_0x0105;
    L_0x00ea:
        r0 = r12.f14374j;
        r0 = r0.presentationTimeUs;
        r12.mo3994b(r0);
        r0 = r12.f14374j;
        r0 = r0.flags;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00fb;
    L_0x00f9:
        r0 = 1;
        goto L_0x00fc;
    L_0x00fb:
        r0 = 0;
    L_0x00fc:
        r12.m17951t();
        if (r0 != 0) goto L_0x0102;
    L_0x0101:
        return r13;
    L_0x0102:
        r12.m17954w();
    L_0x0105:
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.a(long, long):boolean");
    }

    /* renamed from: u */
    private void m17952u() throws ExoPlaybackException {
        MediaFormat outputFormat = this.f14378n.getOutputFormat();
        if (this.f14380p != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f14388x = true;
            return;
        }
        if (this.f14386v) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo3983a(this.f14378n, outputFormat);
    }

    /* renamed from: v */
    private void m17953v() {
        if (C2314v.f6956a < 21) {
            this.f14390z = this.f14378n.getOutputBuffers();
        }
    }

    /* renamed from: w */
    private void m17954w() throws ExoPlaybackException {
        if (this.f14359H == 2) {
            mo3995m();
            m17972j();
            return;
        }
        this.f14363L = true;
        mo3991i();
    }

    /* renamed from: c */
    private boolean m17942c(long j) {
        int size = this.f14373i.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f14373i.get(i)).longValue() == j) {
                this.f14373i.remove(i);
                return 1;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean mo3989a(String str) {
        if (C2314v.f6956a >= 18 && !(C2314v.f6956a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str)))) {
            if (C2314v.f6956a == 19 && C2314v.f6959d.startsWith("SM-G800")) {
                if (!"OMX.Exynos.avc.dec".equals(str)) {
                    if ("OMX.Exynos.avc.dec.secure".equals(str) != null) {
                    }
                }
            }
            return null;
        }
        return true;
    }

    /* renamed from: b */
    private int m17938b(String str) {
        if (C2314v.f6956a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (C2314v.f6959d.startsWith("SM-T585") || C2314v.f6959d.startsWith("SM-A510") || C2314v.f6959d.startsWith("SM-A520") || C2314v.f6959d.startsWith("SM-J700"))) {
            return 2;
        }
        return (C2314v.f6956a >= 24 || ((!"OMX.Nvidia.h264.decode".equals(str) && "OMX.Nvidia.h264.decode.secure".equals(str) == null) || ("flounder".equals(C2314v.f6957b) == null && "flounder_lte".equals(C2314v.f6957b) == null && "grouper".equals(C2314v.f6957b) == null && "tilapia".equals(C2314v.f6957b) == null))) ? null : 1;
    }

    /* renamed from: a */
    private static boolean m17937a(String str, Format format) {
        return (C2314v.f6956a >= 21 || format.initializationData.isEmpty() == null || "OMX.MTK.VIDEO.DECODER.AVC".equals(str) == null) ? null : true;
    }

    /* renamed from: c */
    private static boolean m17943c(String str) {
        return (C2314v.f6956a > 17 || (!"OMX.rk.video_decoder.avc".equals(str) && "OMX.allwinner.video.decoder.avc".equals(str) == null)) ? null : true;
    }

    /* renamed from: d */
    private static boolean m17944d(String str) {
        return ((C2314v.f6956a > 23 || !"OMX.google.vorbis.decoder".equals(str)) && (C2314v.f6956a > 19 || !"hb2000".equals(C2314v.f6957b) || (!"OMX.amlogic.avc.decoder.awesome".equals(str) && "OMX.amlogic.avc.decoder.awesome.secure".equals(str) == null))) ? null : true;
    }

    /* renamed from: e */
    private static boolean m17945e(String str) {
        return (C2314v.f6956a != 21 || "OMX.google.aac.decoder".equals(str) == null) ? null : true;
    }

    /* renamed from: b */
    private static boolean m17940b(String str, Format format) {
        if (C2314v.f6956a > 18 || format.channelCount != 1 || "OMX.MTK.AUDIO.DECODER.MP3".equals(str) == null) {
            return false;
        }
        return true;
    }
}
