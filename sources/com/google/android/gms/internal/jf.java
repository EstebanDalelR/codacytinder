package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.ar;
import java.util.HashMap;
import java.util.Map;

@zzzv
@TargetApi(14)
public final class jf extends jp implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    /* renamed from: c */
    private static final Map<Integer, String> f26892c = new HashMap();
    /* renamed from: d */
    private final kd f26893d;
    /* renamed from: e */
    private final boolean f26894e;
    /* renamed from: f */
    private int f26895f = 0;
    /* renamed from: g */
    private int f26896g = 0;
    /* renamed from: h */
    private MediaPlayer f26897h;
    /* renamed from: i */
    private Uri f26898i;
    /* renamed from: j */
    private int f26899j;
    /* renamed from: k */
    private int f26900k;
    /* renamed from: l */
    private int f26901l;
    /* renamed from: m */
    private int f26902m;
    /* renamed from: n */
    private int f26903n;
    /* renamed from: o */
    private kb f26904o;
    /* renamed from: p */
    private boolean f26905p;
    /* renamed from: q */
    private int f26906q;
    /* renamed from: r */
    private zzama f26907r;

    static {
        if (VERSION.SDK_INT >= 17) {
            f26892c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f26892c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f26892c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f26892c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f26892c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f26892c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f26892c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f26892c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f26892c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f26892c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f26892c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f26892c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f26892c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f26892c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f26892c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f26892c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public jf(Context context, boolean z, boolean z2, kc kcVar, kd kdVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f26893d = kdVar;
        this.f26905p = z;
        this.f26894e = z2;
        this.f26893d.m19964a(this);
    }

    /* renamed from: a */
    private final void m31579a(float r2) {
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
        r1 = this;
        r0 = r1.f26897h;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r1.f26897h;	 Catch:{ IllegalStateException -> 0x0009 }
        r0.setVolume(r2, r2);	 Catch:{ IllegalStateException -> 0x0009 }
    L_0x0009:
        return;
    L_0x000a:
        r2 = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().";
        com.google.android.gms.internal.hx.m19916e(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jf.a(float):void");
    }

    /* renamed from: a */
    private final void m31580a(boolean z) {
        ec.m27332a("AdMediaPlayerView release");
        if (this.f26904o != null) {
            this.f26904o.m27413b();
            this.f26904o = null;
        }
        if (this.f26897h != null) {
            this.f26897h.reset();
            this.f26897h.release();
            this.f26897h = null;
            m31581b(0);
            if (z) {
                this.f26896g = 0;
                this.f26896g = 0;
            }
        }
    }

    /* renamed from: b */
    private final void m31581b(int i) {
        if (i == 3) {
            this.f26893d.m19967c();
            this.b.m19976b();
        } else if (this.f26895f == 3) {
            this.f26893d.m19968d();
            this.b.m19977c();
        }
        this.f26895f = i;
    }

    /* renamed from: f */
    private final void m31582f() {
        ec.m27332a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f26898i != null && surfaceTexture != null) {
            m31580a(false);
            try {
                ar.t();
                this.f26897h = new MediaPlayer();
                this.f26897h.setOnBufferingUpdateListener(this);
                this.f26897h.setOnCompletionListener(this);
                this.f26897h.setOnErrorListener(this);
                this.f26897h.setOnInfoListener(this);
                this.f26897h.setOnPreparedListener(this);
                this.f26897h.setOnVideoSizeChangedListener(this);
                this.f26901l = 0;
                if (this.f26905p) {
                    this.f26904o = new kb(getContext());
                    this.f26904o.m27412a(surfaceTexture, getWidth(), getHeight());
                    this.f26904o.start();
                    SurfaceTexture c = this.f26904o.m27414c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f26904o.m27413b();
                        this.f26904o = null;
                    }
                }
                this.f26897h.setDataSource(getContext(), this.f26898i);
                ar.u();
                this.f26897h.setSurface(new Surface(surfaceTexture));
                this.f26897h.setAudioStreamType(3);
                this.f26897h.setScreenOnWhilePlaying(true);
                this.f26897h.prepareAsync();
                m31581b(1);
            } catch (Throwable e) {
                String valueOf = String.valueOf(this.f26898i);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Failed to initialize MediaPlayer at ");
                stringBuilder.append(valueOf);
                hx.m19914c(stringBuilder.toString(), e);
                onError(this.f26897h, 1, 0);
            }
        }
    }

    /* renamed from: g */
    private final void m31583g() {
        if (this.f26894e && m31584h() && this.f26897h.getCurrentPosition() > 0 && this.f26896g != 3) {
            ec.m27332a("AdMediaPlayerView nudging MediaPlayer");
            m31579a(0.0f);
            this.f26897h.start();
            int currentPosition = this.f26897h.getCurrentPosition();
            long currentTimeMillis = ar.k().currentTimeMillis();
            while (m31584h() && this.f26897h.getCurrentPosition() == currentPosition) {
                if (ar.k().currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f26897h.pause();
            mo4635e();
        }
    }

    /* renamed from: h */
    private final boolean m31584h() {
        return (this.f26897h == null || this.f26895f == -1 || this.f26895f == 0 || this.f26895f == 1) ? false : true;
    }

    /* renamed from: a */
    public final String mo6875a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f26905p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* renamed from: a */
    public final void mo6876a(float f, float f2) {
        if (this.f26904o != null) {
            this.f26904o.m27410a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo6877a(int i) {
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("AdMediaPlayerView seek ");
        stringBuilder.append(i);
        ec.m27332a(stringBuilder.toString());
        if (m31584h()) {
            this.f26897h.seekTo(i);
            this.f26906q = 0;
            return;
        }
        this.f26906q = i;
    }

    /* renamed from: a */
    public final void mo6878a(zzama zzama) {
        this.f26907r = zzama;
    }

    /* renamed from: b */
    public final void mo6879b() {
        ec.m27332a("AdMediaPlayerView stop");
        if (this.f26897h != null) {
            this.f26897h.stop();
            this.f26897h.release();
            this.f26897h = null;
            m31581b(0);
            this.f26896g = 0;
        }
        this.f26893d.m19965b();
    }

    /* renamed from: c */
    public final void mo6880c() {
        ec.m27332a("AdMediaPlayerView play");
        if (m31584h()) {
            this.f26897h.start();
            m31581b(3);
            this.a.m19951a();
            fk.f16060a.post(new jm(this));
        }
        this.f26896g = 3;
    }

    /* renamed from: d */
    public final void mo6881d() {
        ec.m27332a("AdMediaPlayerView pause");
        if (m31584h() && this.f26897h.isPlaying()) {
            this.f26897h.pause();
            m31581b(4);
            fk.f16060a.post(new jn(this));
        }
        this.f26896g = 4;
    }

    /* renamed from: e */
    public final void mo4635e() {
        m31579a(this.b.m19973a());
    }

    public final int getCurrentPosition() {
        return m31584h() ? this.f26897h.getCurrentPosition() : 0;
    }

    public final int getDuration() {
        return m31584h() ? this.f26897h.getDuration() : -1;
    }

    public final int getVideoHeight() {
        return this.f26897h != null ? this.f26897h.getVideoHeight() : 0;
    }

    public final int getVideoWidth() {
        return this.f26897h != null ? this.f26897h.getVideoWidth() : 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f26901l = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        ec.m27332a("AdMediaPlayerView completion");
        m31581b(5);
        this.f26896g = 5;
        fk.f16060a.post(new jh(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f26892c.get(Integer.valueOf(i));
        String str2 = (String) f26892c.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer error: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        hx.m19916e(stringBuilder.toString());
        m31581b(-1);
        this.f26896g = -1;
        fk.f16060a.post(new ji(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f26892c.get(Integer.valueOf(i));
        String str2 = (String) f26892c.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer info: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        ec.m27332a(stringBuilder.toString());
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.f26899j;
        r0 = getDefaultSize(r0, r6);
        r1 = r5.f26900k;
        r1 = getDefaultSize(r1, r7);
        r2 = r5.f26899j;
        if (r2 <= 0) goto L_0x008e;
    L_0x0010:
        r2 = r5.f26900k;
        if (r2 <= 0) goto L_0x008e;
    L_0x0014:
        r2 = r5.f26904o;
        if (r2 != 0) goto L_0x008e;
    L_0x0018:
        r0 = android.view.View.MeasureSpec.getMode(r6);
        r6 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r2) goto L_0x0055;
    L_0x002c:
        if (r1 != r2) goto L_0x0055;
    L_0x002e:
        r0 = r5.f26899j;
        r0 = r0 * r7;
        r1 = r5.f26900k;
        r1 = r1 * r6;
        if (r0 >= r1) goto L_0x0042;
    L_0x0038:
        r6 = r5.f26899j;
        r6 = r6 * r7;
        r0 = r5.f26900k;
        r0 = r6 / r0;
        r6 = r0;
        goto L_0x0090;
    L_0x0042:
        r0 = r5.f26899j;
        r0 = r0 * r7;
        r1 = r5.f26900k;
        r1 = r1 * r6;
        if (r0 <= r1) goto L_0x0090;
    L_0x004c:
        r7 = r5.f26900k;
        r7 = r7 * r6;
        r0 = r5.f26899j;
        r1 = r7 / r0;
        goto L_0x008f;
    L_0x0055:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r2) goto L_0x0067;
    L_0x0059:
        r0 = r5.f26900k;
        r0 = r0 * r6;
        r2 = r5.f26899j;
        r0 = r0 / r2;
        if (r1 != r3) goto L_0x0065;
    L_0x0062:
        if (r0 <= r7) goto L_0x0065;
    L_0x0064:
        goto L_0x0090;
    L_0x0065:
        r7 = r0;
        goto L_0x0090;
    L_0x0067:
        if (r1 != r2) goto L_0x0077;
    L_0x0069:
        r1 = r5.f26899j;
        r1 = r1 * r7;
        r2 = r5.f26900k;
        r1 = r1 / r2;
        if (r0 != r3) goto L_0x0075;
    L_0x0072:
        if (r1 <= r6) goto L_0x0075;
    L_0x0074:
        goto L_0x0090;
    L_0x0075:
        r6 = r1;
        goto L_0x0090;
    L_0x0077:
        r2 = r5.f26899j;
        r4 = r5.f26900k;
        if (r1 != r3) goto L_0x0087;
    L_0x007d:
        if (r4 <= r7) goto L_0x0087;
    L_0x007f:
        r1 = r5.f26899j;
        r1 = r1 * r7;
        r2 = r5.f26900k;
        r1 = r1 / r2;
        goto L_0x0089;
    L_0x0087:
        r1 = r2;
        r7 = r4;
    L_0x0089:
        if (r0 != r3) goto L_0x0075;
    L_0x008b:
        if (r1 <= r6) goto L_0x0075;
    L_0x008d:
        goto L_0x004c;
    L_0x008e:
        r6 = r0;
    L_0x008f:
        r7 = r1;
    L_0x0090:
        r5.setMeasuredDimension(r6, r7);
        r0 = r5.f26904o;
        if (r0 == 0) goto L_0x009c;
    L_0x0097:
        r0 = r5.f26904o;
        r0.m27411a(r6, r7);
    L_0x009c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 != r1) goto L_0x00b9;
    L_0x00a2:
        r0 = r5.f26902m;
        if (r0 <= 0) goto L_0x00aa;
    L_0x00a6:
        r0 = r5.f26902m;
        if (r0 != r6) goto L_0x00b2;
    L_0x00aa:
        r0 = r5.f26903n;
        if (r0 <= 0) goto L_0x00b5;
    L_0x00ae:
        r0 = r5.f26903n;
        if (r0 == r7) goto L_0x00b5;
    L_0x00b2:
        r5.m31583g();
    L_0x00b5:
        r5.f26902m = r6;
        r5.f26903n = r7;
    L_0x00b9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jf.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        ec.m27332a("AdMediaPlayerView prepared");
        m31581b(2);
        this.f26893d.m19963a();
        fk.f16060a.post(new jg(this));
        this.f26899j = mediaPlayer.getVideoWidth();
        this.f26900k = mediaPlayer.getVideoHeight();
        if (this.f26906q != 0) {
            mo6877a(this.f26906q);
        }
        m31583g();
        int i = this.f26899j;
        int i2 = this.f26900k;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("AdMediaPlayerView stream dimensions: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        hx.m19915d(stringBuilder.toString());
        if (this.f26896g == 3) {
            mo6880c();
        }
        mo4635e();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ec.m27332a("AdMediaPlayerView surface created");
        m31582f();
        fk.f16060a.post(new jj(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ec.m27332a("AdMediaPlayerView surface destroyed");
        if (this.f26897h != null && this.f26906q == 0) {
            this.f26906q = this.f26897h.getCurrentPosition();
        }
        if (this.f26904o != null) {
            this.f26904o.m27413b();
        }
        fk.f16060a.post(new jl(this));
        m31580a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ec.m27332a("AdMediaPlayerView surface changed");
        Object obj = null;
        Object obj2 = this.f26896g == 3 ? 1 : null;
        if (this.f26899j == i && this.f26900k == i2) {
            obj = 1;
        }
        if (!(this.f26897h == null || obj2 == null || r0 == null)) {
            if (this.f26906q != 0) {
                mo6877a(this.f26906q);
            }
            mo6880c();
        }
        if (this.f26904o != null) {
            this.f26904o.m27411a(i, i2);
        }
        fk.f16060a.post(new jk(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f26893d.m19966b(this);
        this.a.m19952a(surfaceTexture, this.f26907r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("AdMediaPlayerView size changed: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        ec.m27332a(stringBuilder.toString());
        this.f26899j = mediaPlayer.getVideoWidth();
        this.f26900k = mediaPlayer.getVideoHeight();
        if (this.f26899j != 0 && this.f26900k != 0) {
            requestLayout();
        }
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzil zzd = zzil.zzd(parse);
        if (zzd != null) {
            parse = Uri.parse(zzd.url);
        }
        this.f26898i = parse;
        this.f26906q = 0;
        m31582f();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        String name = getClass().getName();
        String toHexString = Integer.toHexString(hashCode());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(toHexString).length());
        stringBuilder.append(name);
        stringBuilder.append("@");
        stringBuilder.append(toHexString);
        return stringBuilder.toString();
    }
}
