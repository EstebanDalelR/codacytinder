package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2153n;
import com.google.android.exoplayer2.C4237a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener.C2020a;
import com.google.android.exoplayer2.audio.AudioSink.Listener;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C3604c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.mediacodec.C2130a;
import com.google.android.exoplayer2.mediacodec.C2131b;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.MediaClock;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.audio.g */
public class C4444g extends MediaCodecRenderer implements MediaClock {
    /* renamed from: b */
    private final Context f14749b;
    /* renamed from: c */
    private final C2020a f14750c;
    /* renamed from: d */
    private final AudioSink f14751d;
    /* renamed from: e */
    private int f14752e;
    /* renamed from: f */
    private boolean f14753f;
    /* renamed from: g */
    private boolean f14754g;
    /* renamed from: h */
    private MediaFormat f14755h;
    /* renamed from: i */
    private int f14756i;
    /* renamed from: j */
    private int f14757j;
    /* renamed from: k */
    private int f14758k;
    /* renamed from: l */
    private int f14759l;
    /* renamed from: m */
    private long f14760m;
    /* renamed from: n */
    private boolean f14761n;
    /* renamed from: o */
    private boolean f14762o;

    /* renamed from: com.google.android.exoplayer2.audio.g$a */
    private final class C3593a implements Listener {
        /* renamed from: a */
        final /* synthetic */ C4444g f10774a;

        private C3593a(C4444g c4444g) {
            this.f10774a = c4444g;
        }

        public void onAudioSessionId(int i) {
            this.f10774a.f14750c.m7264a(i);
            this.f10774a.mo3982a(i);
        }

        public void onPositionDiscontinuity() {
            this.f10774a.mo3990h();
            this.f10774a.f14762o = true;
        }

        public void onUnderrun(int i, long j, long j2) {
            this.f10774a.f14750c.m7265a(i, j, j2);
            this.f10774a.m18489a(i, j, j2);
        }
    }

    /* renamed from: a */
    protected int mo3979a(MediaCodec mediaCodec, C2130a c2130a, Format format, Format format2) {
        return 0;
    }

    /* renamed from: a */
    protected void mo3982a(int i) {
    }

    /* renamed from: a */
    protected void m18489a(int i, long j, long j2) {
    }

    public MediaClock getMediaClock() {
        return this;
    }

    /* renamed from: h */
    protected void mo3990h() {
    }

    public C4444g(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<C3604c> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, @Nullable C2027b c2027b, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, drmSessionManager, z, handler, audioRendererEventListener, new DefaultAudioSink(c2027b, audioProcessorArr));
    }

    public C4444g(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<C3604c> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1, mediaCodecSelector, drmSessionManager, z);
        this.f14749b = context.getApplicationContext();
        this.f14751d = audioSink;
        this.f14750c = new C2020a(handler, audioRendererEventListener);
        audioSink.setListener(new C3593a());
    }

    /* renamed from: a */
    protected int mo3980a(MediaCodecSelector mediaCodecSelector, DrmSessionManager<C3604c> drmSessionManager, Format format) throws DecoderQueryException {
        String str = format.sampleMimeType;
        boolean z = false;
        if (!C2297h.m8342a(str)) {
            return 0;
        }
        int i = C2314v.f6956a >= 21 ? 32 : 0;
        drmSessionManager = C4237a.m16837a((DrmSessionManager) drmSessionManager, format.drmInitData);
        int i2 = 4;
        if (drmSessionManager != null && mo3989a(str) && mediaCodecSelector.getPassthroughDecoderInfo() != null) {
            return (i | 8) | 4;
        }
        int i3 = 1;
        if (("audio/raw".equals(str) && !this.f14751d.isEncodingSupported(format.pcmEncoding)) || !this.f14751d.isEncodingSupported(2)) {
            return 1;
        }
        boolean z2;
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z2 = false;
            for (int i4 = 0; i4 < drmInitData.schemeDataCount; i4++) {
                z2 |= drmInitData.get(i4).requiresSecureDecryption;
            }
        } else {
            z2 = false;
        }
        C2130a decoderInfo = mediaCodecSelector.getDecoderInfo(str, z2);
        if (decoderInfo == null) {
            if (z2 && mediaCodecSelector.getDecoderInfo(str, false) != null) {
                i3 = 2;
            }
            return i3;
        } else if (drmSessionManager == null) {
            return 2;
        } else {
            if (C2314v.f6956a < 21 || ((format.sampleRate == -1 || decoderInfo.m7671a(format.sampleRate) != null) && (format.channelCount == -1 || decoderInfo.m7674b(format.channelCount) != null))) {
                z = true;
            }
            if (!z) {
                i2 = 3;
            }
            return (i | 8) | i2;
        }
    }

    /* renamed from: a */
    protected C2130a mo3981a(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws DecoderQueryException {
        if (mo3989a(format.sampleMimeType)) {
            C2130a passthroughDecoderInfo = mediaCodecSelector.getPassthroughDecoderInfo();
            if (passthroughDecoderInfo != null) {
                return passthroughDecoderInfo;
            }
        }
        return super.mo3981a(mediaCodecSelector, format, z);
    }

    /* renamed from: a */
    protected boolean mo3989a(String str) {
        str = C2297h.m8349h(str);
        return (str == null || this.f14751d.isEncodingSupported(str) == null) ? null : true;
    }

    /* renamed from: a */
    protected void mo3986a(C2130a c2130a, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.f14752e = m18484a(c2130a, format, m16846d());
        this.f14754g = C4444g.m18480b(c2130a.f6122a);
        this.f14753f = c2130a.f6128g;
        c2130a = m18485a(format, c2130a.f6123b == null ? "audio/raw" : c2130a.f6123b, this.f14752e);
        mediaCodec.configure(c2130a, null, mediaCrypto, 0);
        if (this.f14753f != null) {
            this.f14755h = c2130a;
            this.f14755h.setString("mime", format.sampleMimeType);
            return;
        }
        this.f14755h = null;
    }

    /* renamed from: a */
    protected void mo3987a(String str, long j, long j2) {
        this.f14750c.m7268a(str, j, j2);
    }

    /* renamed from: a */
    protected void mo3984a(Format format) throws ExoPlaybackException {
        super.mo3984a(format);
        this.f14750c.m7266a(format);
        this.f14756i = "audio/raw".equals(format.sampleMimeType) ? format.pcmEncoding : 2;
        this.f14757j = format.channelCount;
        this.f14758k = format.encoderDelay;
        this.f14759l = format.encoderPadding;
    }

    /* renamed from: a */
    protected void mo3983a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        if (this.f14755h != null) {
            mediaCodec = C2297h.m8349h(this.f14755h.getString("mime"));
            mediaFormat = this.f14755h;
        } else {
            mediaCodec = this.f14756i;
        }
        int i = mediaCodec;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f14754g == null || integer != 6 || this.f14757j >= 6) {
            mediaCodec = null;
        } else {
            mediaCodec = new int[this.f14757j];
            for (mediaFormat = null; mediaFormat < this.f14757j; mediaFormat++) {
                mediaCodec[mediaFormat] = mediaFormat;
            }
        }
        try {
            this.f14751d.configure(i, integer, integer2, 0, mediaCodec, this.f14758k, this.f14759l);
        } catch (MediaCodec mediaCodec2) {
            throw ExoPlaybackException.m7218a(mediaCodec2, m16848f());
        }
    }

    /* renamed from: a */
    protected void mo3719a(boolean z) throws ExoPlaybackException {
        super.mo3719a(z);
        this.f14750c.m7267a(this.a);
        z = m16847e().f6157b;
        if (z) {
            this.f14751d.enableTunnelingV21(z);
        } else {
            this.f14751d.disableTunneling();
        }
    }

    /* renamed from: a */
    protected void mo3718a(long j, boolean z) throws ExoPlaybackException {
        super.mo3718a(j, z);
        this.f14751d.reset();
        this.f14760m = j;
        this.f14761n = true;
        this.f14762o = true;
    }

    /* renamed from: a */
    protected void mo3717a() {
        super.mo3717a();
        this.f14751d.play();
    }

    /* renamed from: b */
    protected void mo3720b() {
        m18481p();
        this.f14751d.pause();
        super.mo3720b();
    }

    /* renamed from: c */
    protected void mo3721c() {
        try {
            this.f14751d.release();
            try {
                super.mo3721c();
            } finally {
                this.a.m7353a();
                this.f14750c.m7269b(this.a);
            }
        } catch (Throwable th) {
            super.mo3721c();
        } finally {
            this.a.m7353a();
            this.f14750c.m7269b(this.a);
        }
    }

    public boolean isEnded() {
        return super.isEnded() && this.f14751d.isEnded();
    }

    public boolean isReady() {
        if (!this.f14751d.hasPendingData()) {
            if (!super.isReady()) {
                return false;
            }
        }
        return true;
    }

    public long getPositionUs() {
        if (getState() == 2) {
            m18481p();
        }
        return this.f14760m;
    }

    public C2153n setPlaybackParameters(C2153n c2153n) {
        return this.f14751d.setPlaybackParameters(c2153n);
    }

    public C2153n getPlaybackParameters() {
        return this.f14751d.getPlaybackParameters();
    }

    /* renamed from: a */
    protected void mo3985a(DecoderInputBuffer decoderInputBuffer) {
        if (this.f14761n && !decoderInputBuffer.m7342b()) {
            if (Math.abs(decoderInputBuffer.f10831c - this.f14760m) > 500000) {
                this.f14760m = decoderInputBuffer.f10831c;
            }
            this.f14761n = null;
        }
    }

    /* renamed from: a */
    protected boolean mo3988a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws ExoPlaybackException {
        if (this.f14753f != null && (i2 & 2) != null) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            j = this.a;
            j.f5615f++;
            this.f14751d.handleDiscontinuity();
            return true;
        } else {
            try {
                if (this.f14751d.handleBuffer(byteBuffer, j3) == null) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                j = this.a;
                j.f5614e++;
                return true;
            } catch (long j4) {
                throw ExoPlaybackException.m7218a(j4, m16848f());
            }
        }
    }

    /* renamed from: i */
    protected void mo3991i() throws ExoPlaybackException {
        try {
            this.f14751d.playToEndOfStream();
        } catch (Exception e) {
            throw ExoPlaybackException.m7218a(e, m16848f());
        }
    }

    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        switch (i) {
            case 2:
                this.f14751d.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.f14751d.setAudioAttributes((C2026a) obj);
                return;
            default:
                super.handleMessage(i, obj);
                return;
        }
    }

    /* renamed from: a */
    protected int m18484a(C2130a c2130a, Format format, Format[] formatArr) {
        return m18477a(c2130a, format);
    }

    /* renamed from: a */
    private int m18477a(C2130a c2130a, Format format) {
        if (C2314v.f6956a < 24 && "OMX.google.raw.decoder".equals(c2130a.f6122a) != null) {
            c2130a = true;
            if (C2314v.f6956a == 23) {
                PackageManager packageManager = this.f14749b.getPackageManager();
                if (packageManager != null && packageManager.hasSystemFeature("android.software.leanback")) {
                    c2130a = null;
                }
            }
            if (c2130a != null) {
                return -1;
            }
        }
        return format.maxInputSize;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    protected MediaFormat m18485a(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        C2131b.m7680a(mediaFormat, format.initializationData);
        C2131b.m7678a(mediaFormat, "max-input-size", i);
        if (C2314v.f6956a >= 23) {
            mediaFormat.setInteger("priority", null);
        }
        return mediaFormat;
    }

    /* renamed from: p */
    private void m18481p() {
        long currentPositionUs = this.f14751d.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.f14762o) {
                currentPositionUs = Math.max(this.f14760m, currentPositionUs);
            }
            this.f14760m = currentPositionUs;
            this.f14762o = false;
        }
    }

    /* renamed from: b */
    private static boolean m18480b(String str) {
        return (C2314v.f6956a >= 24 || "OMX.SEC.aac.dec".equals(str) == null || "samsung".equals(C2314v.f6958c) == null || (C2314v.f6957b.startsWith("zeroflte") == null && C2314v.f6957b.startsWith("herolte") == null && C2314v.f6957b.startsWith("heroqlte") == null)) ? null : true;
    }
}
