package com.facebook.ads.internal.view.p052c.p054c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.facebook.ads.AdSettings;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1482c;
import com.google.android.exoplayer2.C2053e;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C3599d;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer.EventListener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.SimpleExoPlayer.VideoListener;
import com.google.android.exoplayer2.extractor.C3622c;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveVideoTrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.C3722e;
import com.google.android.exoplayer2.upstream.C3724g;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.C2314v;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.c.c.a */
public class C4188a extends TextureView implements SurfaceTextureListener, C1589c, EventListener, VideoListener {
    /* renamed from: a */
    private static final String f13347a = "a";
    /* renamed from: b */
    private final Handler f13348b = new Handler();
    /* renamed from: c */
    private Uri f13349c;
    @Nullable
    /* renamed from: d */
    private String f13350d;
    /* renamed from: e */
    private C1591e f13351e;
    /* renamed from: f */
    private Surface f13352f;
    @Nullable
    /* renamed from: g */
    private SimpleExoPlayer f13353g;
    /* renamed from: h */
    private MediaController f13354h;
    /* renamed from: i */
    private C1590d f13355i = C1590d.IDLE;
    /* renamed from: j */
    private C1590d f13356j = C1590d.IDLE;
    /* renamed from: k */
    private C1590d f13357k = C1590d.IDLE;
    /* renamed from: l */
    private View f13358l;
    /* renamed from: m */
    private boolean f13359m = false;
    /* renamed from: n */
    private boolean f13360n = false;
    /* renamed from: o */
    private long f13361o;
    /* renamed from: p */
    private long f13362p;
    /* renamed from: q */
    private long f13363q;
    /* renamed from: r */
    private int f13364r;
    /* renamed from: s */
    private int f13365s;
    /* renamed from: t */
    private float f13366t = 1.0f;
    /* renamed from: u */
    private int f13367u = -1;
    /* renamed from: v */
    private boolean f13368v = false;
    /* renamed from: w */
    private boolean f13369w = false;
    /* renamed from: x */
    private VideoStartReason f13370x = VideoStartReason.NOT_STARTED;

    /* renamed from: com.facebook.ads.internal.view.c.c.a$1 */
    class C15831 implements MediaPlayerControl {
        /* renamed from: a */
        final /* synthetic */ C4188a f4387a;

        C15831(C4188a c4188a) {
            this.f4387a = c4188a;
        }

        public boolean canPause() {
            return true;
        }

        public boolean canSeekBackward() {
            return true;
        }

        public boolean canSeekForward() {
            return true;
        }

        public int getAudioSessionId() {
            return this.f4387a.f13353g != null ? this.f4387a.f13353g.m16836c() : 0;
        }

        public int getBufferPercentage() {
            return this.f4387a.f13353g != null ? this.f4387a.f13353g.getBufferedPercentage() : 0;
        }

        public int getCurrentPosition() {
            return this.f4387a.getCurrentPosition();
        }

        public int getDuration() {
            return this.f4387a.getDuration();
        }

        public boolean isPlaying() {
            return this.f4387a.f13353g != null && this.f4387a.f13353g.getPlayWhenReady();
        }

        public void pause() {
            this.f4387a.mo1792a(true);
        }

        public void seekTo(int i) {
            this.f4387a.mo1790a(i);
        }

        public void start() {
            this.f4387a.mo1791a(VideoStartReason.USER_STARTED);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.c.a$2 */
    class C15842 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C4188a f4388a;

        C15842(C4188a c4188a) {
            this.f4388a = c4188a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f4388a.f13354h != null && motionEvent.getAction() == 1) {
                if (this.f4388a.f13354h.isShowing()) {
                    this.f4388a.f13354h.hide();
                    return true;
                }
                this.f4388a.f13354h.show();
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.c.a$3 */
    class C15853 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C4188a f4389a;

        C15853(C4188a c4188a) {
            this.f4389a = c4188a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f4389a.f13354h != null && motionEvent.getAction() == 1) {
                if (this.f4389a.f13354h.isShowing()) {
                    this.f4389a.f13354h.hide();
                    return true;
                }
                this.f4389a.f13354h.show();
            }
            return true;
        }
    }

    public C4188a(Context context) {
        super(context);
    }

    public C4188a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4188a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public C4188a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: f */
    private void m16581f() {
        TransferListener c3722e = new C3722e();
        this.f13353g = C2053e.m7373a(getContext(), new DefaultTrackSelector(this.f13348b, new Factory(c3722e)), new C3599d());
        this.f13353g.m16831a((VideoListener) this);
        this.f13353g.addListener(this);
        this.f13353g.setPlayWhenReady(false);
        if (this.f13360n && !this.f13368v) {
            this.f13354h = new MediaController(getContext());
            this.f13354h.setAnchorView(this.f13358l == null ? this : this.f13358l);
            this.f13354h.setMediaPlayer(new C15831(this));
            this.f13354h.setEnabled(true);
        }
        if (this.f13350d == null || this.f13350d.length() <= 0 || AdSettings.isTestMode(getContext())) {
            this.f13353g.prepare(new ExtractorMediaSource(this.f13349c, new C3724g(getContext(), C2314v.m8465a(getContext(), "ads"), c3722e), new C3622c(), null, null));
        }
        setVideoState(C1590d.PREPARING);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: g */
    private void m16582g() {
        if (this.f13352f != null) {
            this.f13352f.release();
            this.f13352f = null;
        }
        if (this.f13353g != null) {
            this.f13353g.release();
            this.f13353g = null;
        }
        this.f13354h = null;
        this.f13359m = false;
        setVideoState(C1590d.IDLE);
    }

    private void setVideoState(C1590d c1590d) {
        if (c1590d != this.f13355i) {
            this.f13355i = c1590d;
            if (this.f13355i == C1590d.STARTED) {
                this.f13359m = true;
            }
            if (this.f13351e != null) {
                this.f13351e.mo1834a(c1590d);
            }
        }
    }

    /* renamed from: a */
    public void m16583a() {
        if (!this.f13369w) {
            mo1792a(false);
        }
    }

    /* renamed from: a */
    public void mo1790a(int i) {
        if (this.f13353g != null) {
            this.f13367u = getCurrentPosition();
            this.f13353g.seekTo((long) i);
            return;
        }
        this.f13363q = (long) i;
    }

    /* renamed from: a */
    public void mo1791a(VideoStartReason videoStartReason) {
        this.f13356j = C1590d.STARTED;
        this.f13370x = videoStartReason;
        if (this.f13353g == null) {
            setup(this.f13349c);
            return;
        }
        if (this.f13355i == C1590d.PREPARED || this.f13355i == C1590d.PAUSED || this.f13355i == C1590d.PLAYBACK_COMPLETED) {
            this.f13353g.setPlayWhenReady(true);
            setVideoState(C1590d.STARTED);
        }
    }

    /* renamed from: a */
    public void mo1792a(boolean z) {
        if (this.f13353g != null) {
            this.f13353g.setPlayWhenReady(false);
        } else {
            setVideoState(C1590d.IDLE);
        }
    }

    /* renamed from: b */
    public void mo1793b() {
        setVideoState(C1590d.PLAYBACK_COMPLETED);
    }

    /* renamed from: b */
    public void mo1794b(boolean z) {
        this.f13368v = z;
    }

    /* renamed from: c */
    public void mo1795c() {
        this.f13356j = C1590d.IDLE;
        if (this.f13353g != null) {
            this.f13353g.stop();
            this.f13353g.release();
            this.f13353g = null;
        }
        setVideoState(C1590d.IDLE);
    }

    /* renamed from: d */
    public boolean mo1796d() {
        return (this.f13353g == null || this.f13353g.m16834b() == null) ? false : true;
    }

    /* renamed from: e */
    public void mo1797e() {
        m16582g();
    }

    public int getCurrentPosition() {
        return this.f13353g != null ? (int) this.f13353g.getCurrentPosition() : 0;
    }

    public int getDuration() {
        return this.f13353g == null ? 0 : (int) this.f13353g.getDuration();
    }

    public long getInitialBufferTime() {
        return this.f13362p;
    }

    public VideoStartReason getStartReason() {
        return this.f13370x;
    }

    public C1590d getState() {
        return this.f13355i;
    }

    public C1590d getTargetState() {
        return this.f13356j;
    }

    public int getVideoHeight() {
        return this.f13365s;
    }

    public int getVideoWidth() {
        return this.f13364r;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f13366t;
    }

    public void onLoadingChanged(boolean z) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.f13364r;
        r0 = com.facebook.ads.internal.view.p052c.p054c.C4188a.getDefaultSize(r0, r6);
        r1 = r5.f13365s;
        r1 = com.facebook.ads.internal.view.p052c.p054c.C4188a.getDefaultSize(r1, r7);
        r2 = r5.f13364r;
        if (r2 <= 0) goto L_0x008a;
    L_0x0010:
        r2 = r5.f13365s;
        if (r2 <= 0) goto L_0x008a;
    L_0x0014:
        r0 = android.view.View.MeasureSpec.getMode(r6);
        r6 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r2) goto L_0x0051;
    L_0x0028:
        if (r1 != r2) goto L_0x0051;
    L_0x002a:
        r0 = r5.f13364r;
        r0 = r0 * r7;
        r1 = r5.f13365s;
        r1 = r1 * r6;
        if (r0 >= r1) goto L_0x003e;
    L_0x0034:
        r6 = r5.f13364r;
        r6 = r6 * r7;
        r0 = r5.f13365s;
        r0 = r6 / r0;
        r6 = r0;
        goto L_0x008c;
    L_0x003e:
        r0 = r5.f13364r;
        r0 = r0 * r7;
        r1 = r5.f13365s;
        r1 = r1 * r6;
        if (r0 <= r1) goto L_0x008c;
    L_0x0048:
        r7 = r5.f13365s;
        r7 = r7 * r6;
        r0 = r5.f13364r;
        r1 = r7 / r0;
        goto L_0x008b;
    L_0x0051:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r2) goto L_0x0063;
    L_0x0055:
        r0 = r5.f13365s;
        r0 = r0 * r6;
        r2 = r5.f13364r;
        r0 = r0 / r2;
        if (r1 != r3) goto L_0x0061;
    L_0x005e:
        if (r0 <= r7) goto L_0x0061;
    L_0x0060:
        goto L_0x008c;
    L_0x0061:
        r7 = r0;
        goto L_0x008c;
    L_0x0063:
        if (r1 != r2) goto L_0x0073;
    L_0x0065:
        r1 = r5.f13364r;
        r1 = r1 * r7;
        r2 = r5.f13365s;
        r1 = r1 / r2;
        if (r0 != r3) goto L_0x0071;
    L_0x006e:
        if (r1 <= r6) goto L_0x0071;
    L_0x0070:
        goto L_0x008c;
    L_0x0071:
        r6 = r1;
        goto L_0x008c;
    L_0x0073:
        r2 = r5.f13364r;
        r4 = r5.f13365s;
        if (r1 != r3) goto L_0x0083;
    L_0x0079:
        if (r4 <= r7) goto L_0x0083;
    L_0x007b:
        r1 = r5.f13364r;
        r1 = r1 * r7;
        r2 = r5.f13365s;
        r1 = r1 / r2;
        goto L_0x0085;
    L_0x0083:
        r1 = r2;
        r7 = r4;
    L_0x0085:
        if (r0 != r3) goto L_0x0071;
    L_0x0087:
        if (r1 <= r6) goto L_0x0071;
    L_0x0089:
        goto L_0x0048;
    L_0x008a:
        r6 = r0;
    L_0x008b:
        r7 = r1;
    L_0x008c:
        r5.setMeasuredDimension(r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.c.a.onMeasure(int, int):void");
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        setVideoState(C1590d.ERROR);
        exoPlaybackException.printStackTrace();
        C1482c.m5218a(C1481b.m5215a(exoPlaybackException, "[ExoPlayer] Error during playback of ExoPlayer"));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPlayerStateChanged(boolean r9, int r10) {
        /*
        r8 = this;
        switch(r10) {
            case 1: goto L_0x0094;
            case 2: goto L_0x0081;
            case 3: goto L_0x001f;
            case 4: goto L_0x0004;
            default: goto L_0x0003;
        };
    L_0x0003:
        return;
    L_0x0004:
        if (r9 == 0) goto L_0x000b;
    L_0x0006:
        r10 = com.facebook.ads.internal.view.p052c.p054c.C1590d.PLAYBACK_COMPLETED;
        r8.setVideoState(r10);
    L_0x000b:
        r10 = r8.f13353g;
        r0 = 0;
        if (r10 == 0) goto L_0x001c;
    L_0x0010:
        r10 = r8.f13353g;
        r10.setPlayWhenReady(r0);
        if (r9 != 0) goto L_0x001c;
    L_0x0017:
        r9 = r8.f13353g;
        r9.seekToDefaultPosition();
    L_0x001c:
        r8.f13359m = r0;
        return;
    L_0x001f:
        r0 = r8.f13361o;
        r2 = 0;
        r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r10 == 0) goto L_0x0031;
    L_0x0027:
        r0 = java.lang.System.currentTimeMillis();
        r4 = r8.f13361o;
        r6 = r0 - r4;
        r8.f13362p = r6;
    L_0x0031:
        r10 = r8.f13366t;
        r8.setRequestedVolume(r10);
        r0 = r8.f13363q;
        r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r10 <= 0) goto L_0x0051;
    L_0x003c:
        r0 = r8.f13363q;
        r10 = r8.f13353g;
        r4 = r10.getDuration();
        r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r10 >= 0) goto L_0x0051;
    L_0x0048:
        r10 = r8.f13353g;
        r0 = r8.f13363q;
        r10.seekTo(r0);
        r8.f13363q = r2;
    L_0x0051:
        r10 = r8.f13353g;
        r0 = r10.getCurrentPosition();
        r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r10 == 0) goto L_0x0064;
    L_0x005b:
        if (r9 != 0) goto L_0x0064;
    L_0x005d:
        r10 = r8.f13359m;
        if (r10 == 0) goto L_0x0064;
    L_0x0061:
        r9 = com.facebook.ads.internal.view.p052c.p054c.C1590d.PAUSED;
        goto L_0x0096;
    L_0x0064:
        if (r9 != 0) goto L_0x0099;
    L_0x0066:
        r9 = r8.f13355i;
        r10 = com.facebook.ads.internal.view.p052c.p054c.C1590d.PLAYBACK_COMPLETED;
        if (r9 == r10) goto L_0x0099;
    L_0x006c:
        r9 = com.facebook.ads.internal.view.p052c.p054c.C1590d.PREPARED;
        r8.setVideoState(r9);
        r9 = r8.f13356j;
        r10 = com.facebook.ads.internal.view.p052c.p054c.C1590d.STARTED;
        if (r9 != r10) goto L_0x0099;
    L_0x0077:
        r9 = r8.f13370x;
        r8.mo1791a(r9);
        r9 = com.facebook.ads.internal.view.p052c.p054c.C1590d.IDLE;
        r8.f13356j = r9;
        return;
    L_0x0081:
        r9 = r8.f13367u;
        if (r9 < 0) goto L_0x0099;
    L_0x0085:
        r9 = r8.f13367u;
        r10 = -1;
        r8.f13367u = r10;
        r10 = r8.f13351e;
        r0 = r8.getCurrentPosition();
        r10.mo1833a(r9, r0);
        return;
    L_0x0094:
        r9 = com.facebook.ads.internal.view.p052c.p054c.C1590d.IDLE;
    L_0x0096:
        r8.setVideoState(r9);
    L_0x0099:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.c.a.onPlayerStateChanged(boolean, int):void");
    }

    public void onPositionDiscontinuity() {
    }

    public void onRenderedFirstFrame() {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f13352f != null) {
            this.f13352f.release();
        }
        this.f13352f = new Surface(surfaceTexture);
        if (this.f13353g != null) {
            this.f13353g.setVideoSurface(this.f13352f);
            if (this.f13355i == C1590d.PAUSED && this.f13357k != C1590d.PAUSED) {
                mo1791a(this.f13370x);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.f13352f != null) {
            this.f13352f.release();
            this.f13352f = null;
            if (this.f13353g != null) {
                this.f13353g.setVideoSurface(null);
            }
        }
        this.f13357k = this.f13360n ? C1590d.STARTED : this.f13355i;
        if (this.f13355i != C1590d.PAUSED) {
            mo1792a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onTimelineChanged(C2165q c2165q, Object obj) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        this.f13364r = i;
        this.f13365s = i2;
        if (this.f13364r != 0 && this.f13365s != 0) {
            requestLayout();
        }
    }

    public void onVideoTracksDisabled() {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f13353g != null) {
            if (this.f13354h == null || !this.f13354h.isShowing()) {
                if (!z) {
                    this.f13357k = this.f13360n ? C1590d.STARTED : this.f13355i;
                    if (this.f13355i != C1590d.PAUSED) {
                        m16583a();
                    }
                } else if (this.f13355i == C1590d.PAUSED && this.f13357k != C1590d.PAUSED) {
                    mo1791a(this.f13370x);
                }
            }
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f13369w = z;
    }

    public void setControlsAnchorView(View view) {
        this.f13358l = view;
        view.setOnTouchListener(new C15853(this));
    }

    public void setFullScreen(boolean z) {
        this.f13360n = z;
        if (z && !this.f13368v) {
            setOnTouchListener(new C15842(this));
        }
    }

    public void setRequestedVolume(float f) {
        this.f13366t = f;
        if (this.f13353g != null && this.f13355i != C1590d.PREPARING && this.f13355i != C1590d.IDLE) {
            this.f13353g.m16830a(f);
        }
    }

    public void setVideoMPD(@Nullable String str) {
        this.f13350d = str;
    }

    public void setVideoStateChangeListener(C1591e c1591e) {
        this.f13351e = c1591e;
    }

    public void setup(Uri uri) {
        if (this.f13353g != null) {
            m16582g();
        }
        this.f13349c = uri;
        setSurfaceTextureListener(this);
        m16581f();
    }
}
