package com.facebook.ads.internal.view.p052c.p054c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.facebook.ads.VideoStartReason;
import java.io.IOException;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.c.c.b */
public class C3364b extends TextureView implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener, SurfaceTextureListener, C1589c {
    /* renamed from: r */
    private static final String f10207r = "b";
    /* renamed from: a */
    private Uri f10208a;
    /* renamed from: b */
    private C1591e f10209b;
    /* renamed from: c */
    private Surface f10210c;
    @Nullable
    /* renamed from: d */
    private MediaPlayer f10211d;
    /* renamed from: e */
    private MediaController f10212e;
    /* renamed from: f */
    private C1590d f10213f = C1590d.IDLE;
    /* renamed from: g */
    private C1590d f10214g = C1590d.IDLE;
    /* renamed from: h */
    private C1590d f10215h = C1590d.IDLE;
    /* renamed from: i */
    private View f10216i;
    /* renamed from: j */
    private int f10217j = 0;
    /* renamed from: k */
    private long f10218k;
    /* renamed from: l */
    private int f10219l = 0;
    /* renamed from: m */
    private int f10220m = 0;
    /* renamed from: n */
    private float f10221n = 1.0f;
    /* renamed from: o */
    private boolean f10222o = false;
    /* renamed from: p */
    private int f10223p = 3;
    /* renamed from: q */
    private boolean f10224q = false;
    /* renamed from: s */
    private int f10225s = 0;
    /* renamed from: t */
    private boolean f10226t = false;
    /* renamed from: u */
    private VideoStartReason f10227u = VideoStartReason.NOT_STARTED;
    /* renamed from: v */
    private final MediaPlayerControl f10228v = new C15861(this);

    /* renamed from: com.facebook.ads.internal.view.c.c.b$1 */
    class C15861 implements MediaPlayerControl {
        /* renamed from: a */
        final /* synthetic */ C3364b f4390a;

        C15861(C3364b c3364b) {
            this.f4390a = c3364b;
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
            return this.f4390a.f10211d != null ? this.f4390a.f10211d.getAudioSessionId() : 0;
        }

        public int getBufferPercentage() {
            return 0;
        }

        public int getCurrentPosition() {
            return this.f4390a.getCurrentPosition();
        }

        public int getDuration() {
            return this.f4390a.getDuration();
        }

        public boolean isPlaying() {
            return this.f4390a.f10211d != null && this.f4390a.f10211d.isPlaying();
        }

        public void pause() {
            this.f4390a.mo1792a(true);
        }

        public void seekTo(int i) {
            this.f4390a.mo1790a(i);
        }

        public void start() {
            this.f4390a.mo1791a(VideoStartReason.USER_STARTED);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.c.b$2 */
    class C15872 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3364b f4391a;

        C15872(C3364b c3364b) {
            this.f4391a = c3364b;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(this.f4391a.f10226t || this.f4391a.f10212e == null || motionEvent.getAction() != 1)) {
                if (this.f4391a.f10212e.isShowing()) {
                    this.f4391a.f10212e.hide();
                    return true;
                }
                this.f4391a.f10212e.show();
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.c.b$3 */
    class C15883 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3364b f4392a;

        C15883(C3364b c3364b) {
            this.f4392a = c3364b;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(this.f4392a.f10226t || this.f4392a.f10212e == null || motionEvent.getAction() != 1)) {
                if (this.f4392a.f10212e.isShowing()) {
                    this.f4392a.f10212e.hide();
                    return true;
                }
                this.f4392a.f10212e.show();
            }
            return true;
        }
    }

    public C3364b(Context context) {
        super(context);
    }

    public C3364b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C3364b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public C3364b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: f */
    private boolean m12944f() {
        if (!(this.f10213f == C1590d.PREPARED || this.f10213f == C1590d.STARTED || this.f10213f == C1590d.PAUSED)) {
            if (this.f10213f != C1590d.PLAYBACK_COMPLETED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private boolean m12945g() {
        return (this.f10213f == C1590d.PREPARING || this.f10213f == C1590d.PREPARED) ? false : true;
    }

    /* renamed from: h */
    private boolean m12946h() {
        return (this.f10213f == C1590d.PREPARING || this.f10213f == C1590d.PREPARED) ? false : true;
    }

    private void setVideoState(C1590d c1590d) {
        if (c1590d != this.f10213f) {
            this.f10213f = c1590d;
            if (this.f10209b != null) {
                this.f10209b.mo1834a(c1590d);
            }
        }
    }

    /* renamed from: a */
    public void m12947a() {
        if (!this.f10224q) {
            mo1792a(false);
        }
    }

    /* renamed from: a */
    public void mo1790a(int i) {
        if (this.f10211d == null || !m12944f()) {
            this.f10217j = i;
        } else if (i < getDuration() && i > 0) {
            this.f10225s = getCurrentPosition();
            this.f10217j = i;
            this.f10211d.seekTo(i);
        }
    }

    /* renamed from: a */
    public void mo1791a(VideoStartReason videoStartReason) {
        this.f10214g = C1590d.STARTED;
        this.f10227u = videoStartReason;
        if (this.f10213f == C1590d.STARTED || this.f10213f == C1590d.PREPARED || this.f10213f == C1590d.IDLE || this.f10213f == C1590d.PAUSED || this.f10213f == C1590d.PLAYBACK_COMPLETED) {
            if (this.f10211d == null) {
                setup(this.f10208a);
            } else {
                if (this.f10217j > 0) {
                    this.f10211d.seekTo(this.f10217j);
                }
                this.f10211d.start();
                setVideoState(C1590d.STARTED);
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: a */
    public void mo1792a(boolean z) {
        C1590d c1590d;
        this.f10214g = C1590d.PAUSED;
        if (this.f10211d == null) {
            c1590d = C1590d.IDLE;
        } else if (m12946h()) {
            if (z) {
                this.f10215h = C1590d.PAUSED;
            }
            this.f10211d.pause();
            if (this.f10213f != C1590d.PLAYBACK_COMPLETED) {
                c1590d = C1590d.PAUSED;
            }
        } else {
            return;
        }
        setVideoState(c1590d);
    }

    /* renamed from: b */
    public void mo1793b() {
        setVideoState(C1590d.PLAYBACK_COMPLETED);
        mo1795c();
        this.f10217j = 0;
    }

    /* renamed from: b */
    public void mo1794b(boolean z) {
        if (this.f10212e != null) {
            this.f10212e.setVisibility(8);
        }
        this.f10226t = true;
    }

    /* renamed from: c */
    public void mo1795c() {
        this.f10214g = C1590d.IDLE;
        if (this.f10211d != null) {
            int currentPosition = this.f10211d.getCurrentPosition();
            if (currentPosition > 0) {
                this.f10217j = currentPosition;
            }
            this.f10211d.stop();
            this.f10211d.reset();
            this.f10211d.release();
            this.f10211d = null;
            if (this.f10212e != null) {
                this.f10212e.hide();
                this.f10212e.setEnabled(false);
            }
        }
        setVideoState(C1590d.IDLE);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public boolean mo1796d() {
        if (this.f10211d == null || VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (TrackInfo trackType : this.f10211d.getTrackInfo()) {
                if (trackType.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            Log.e(f10207r, "Couldn't retrieve video information", e);
            return true;
        }
    }

    /* renamed from: e */
    public void mo1797e() {
        if (this.f10211d != null) {
            this.f10211d.setSurface(null);
            this.f10211d.setOnBufferingUpdateListener(null);
            this.f10211d.setOnCompletionListener(null);
            this.f10211d.setOnErrorListener(null);
            this.f10211d.setOnInfoListener(null);
            this.f10211d.setOnPreparedListener(null);
            this.f10211d.setOnVideoSizeChangedListener(null);
            this.f10211d.setOnSeekCompleteListener(null);
            this.f10211d.reset();
            this.f10211d = null;
        }
    }

    public int getCurrentPosition() {
        return this.f10211d != null ? this.f10211d.getCurrentPosition() : 0;
    }

    public int getDuration() {
        return this.f10211d == null ? 0 : (getState() == C1590d.STARTED || getState() == C1590d.PAUSED || getState() == C1590d.PREPARED || getState() == C1590d.PLAYBACK_COMPLETED) ? this.f10211d.getDuration() : 0;
    }

    public long getInitialBufferTime() {
        return this.f10218k;
    }

    public VideoStartReason getStartReason() {
        return this.f10227u;
    }

    public C1590d getState() {
        return this.f10213f;
    }

    public C1590d getTargetState() {
        return this.f10214g;
    }

    public int getVideoHeight() {
        return this.f10220m;
    }

    public int getVideoWidth() {
        return this.f10219l;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f10221n;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f10211d != null) {
            this.f10211d.pause();
        }
        setVideoState(C1590d.PLAYBACK_COMPLETED);
        mo1790a(0);
        this.f10217j = 0;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f10223p <= 0 || getState() != C1590d.STARTED) {
            setVideoState(C1590d.ERROR);
            mo1795c();
            return true;
        }
        this.f10223p--;
        mo1795c();
        mo1791a(this.f10227u);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInfo(android.media.MediaPlayer r1, int r2, int r3) {
        /*
        r0 = this;
        switch(r2) {
            case 701: goto L_0x000d;
            case 702: goto L_0x0004;
            default: goto L_0x0003;
        };
    L_0x0003:
        goto L_0x0012;
    L_0x0004:
        r1 = r0.m12945g();
        if (r1 == 0) goto L_0x0012;
    L_0x000a:
        r1 = com.facebook.ads.internal.view.p052c.p054c.C1590d.STARTED;
        goto L_0x000f;
    L_0x000d:
        r1 = com.facebook.ads.internal.view.p052c.p054c.C1590d.BUFFERING;
    L_0x000f:
        r0.setVideoState(r1);
    L_0x0012:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.c.b.onInfo(android.media.MediaPlayer, int, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.f10219l;
        r0 = com.facebook.ads.internal.view.p052c.p054c.C3364b.getDefaultSize(r0, r6);
        r1 = r5.f10220m;
        r1 = com.facebook.ads.internal.view.p052c.p054c.C3364b.getDefaultSize(r1, r7);
        r2 = r5.f10219l;
        if (r2 <= 0) goto L_0x008a;
    L_0x0010:
        r2 = r5.f10220m;
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
        r0 = r5.f10219l;
        r0 = r0 * r7;
        r1 = r5.f10220m;
        r1 = r1 * r6;
        if (r0 >= r1) goto L_0x003e;
    L_0x0034:
        r6 = r5.f10219l;
        r6 = r6 * r7;
        r0 = r5.f10220m;
        r0 = r6 / r0;
        r6 = r0;
        goto L_0x008c;
    L_0x003e:
        r0 = r5.f10219l;
        r0 = r0 * r7;
        r1 = r5.f10220m;
        r1 = r1 * r6;
        if (r0 <= r1) goto L_0x008c;
    L_0x0048:
        r7 = r5.f10220m;
        r7 = r7 * r6;
        r0 = r5.f10219l;
        r1 = r7 / r0;
        goto L_0x008b;
    L_0x0051:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r2) goto L_0x0063;
    L_0x0055:
        r0 = r5.f10220m;
        r0 = r0 * r6;
        r2 = r5.f10219l;
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
        r1 = r5.f10219l;
        r1 = r1 * r7;
        r2 = r5.f10220m;
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
        r2 = r5.f10219l;
        r4 = r5.f10220m;
        if (r1 != r3) goto L_0x0083;
    L_0x0079:
        if (r4 <= r7) goto L_0x0083;
    L_0x007b:
        r1 = r5.f10219l;
        r1 = r1 * r7;
        r2 = r5.f10220m;
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.c.b.onMeasure(int, int):void");
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(C1590d.PREPARED);
        if (this.f10222o && !this.f10226t) {
            this.f10212e = new MediaController(getContext());
            this.f10212e.setAnchorView(this.f10216i == null ? this : this.f10216i);
            this.f10212e.setMediaPlayer(this.f10228v);
            this.f10212e.setEnabled(true);
        }
        setRequestedVolume(this.f10221n);
        this.f10219l = mediaPlayer.getVideoWidth();
        this.f10220m = mediaPlayer.getVideoHeight();
        if (this.f10217j > 0) {
            if (this.f10217j >= this.f10211d.getDuration()) {
                this.f10217j = 0;
            }
            this.f10211d.seekTo(this.f10217j);
            this.f10217j = 0;
        }
        if (this.f10214g == C1590d.STARTED) {
            mo1791a(this.f10227u);
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f10209b != null) {
            this.f10209b.mo1833a(this.f10225s, this.f10217j);
            this.f10217j = 0;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f10210c == null) {
            this.f10210c = new Surface(surfaceTexture);
        }
        if (this.f10211d != null) {
            this.f10211d.setSurface(this.f10210c);
            if (this.f10213f == C1590d.PAUSED && this.f10215h != C1590d.PAUSED) {
                mo1791a(this.f10227u);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.f10210c != null) {
            this.f10210c.release();
            this.f10210c = null;
        }
        this.f10215h = this.f10222o ? C1590d.STARTED : this.f10213f;
        if (this.f10213f != C1590d.PAUSED) {
            mo1792a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f10219l = mediaPlayer.getVideoWidth();
        this.f10220m = mediaPlayer.getVideoHeight();
        if (this.f10219l != 0 && this.f10220m != 0) {
            requestLayout();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f10211d != null) {
            if (this.f10212e == null || !this.f10212e.isShowing()) {
                if (!z) {
                    this.f10215h = this.f10222o ? C1590d.STARTED : this.f10213f;
                    if (this.f10213f != C1590d.PAUSED) {
                        m12947a();
                    }
                } else if (this.f10213f == C1590d.PAUSED && this.f10215h != C1590d.PAUSED) {
                    mo1791a(this.f10227u);
                }
            }
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f10224q = z;
    }

    public void setControlsAnchorView(View view) {
        this.f10216i = view;
        view.setOnTouchListener(new C15883(this));
    }

    public void setFullScreen(boolean z) {
        this.f10222o = z;
        if (this.f10222o && !this.f10226t) {
            setOnTouchListener(new C15872(this));
        }
    }

    public void setRequestedVolume(float f) {
        this.f10221n = f;
        if (this.f10211d != null && this.f10213f != C1590d.PREPARING && this.f10213f != C1590d.IDLE) {
            this.f10211d.setVolume(f, f);
        }
    }

    public void setVideoMPD(@Nullable String str) {
    }

    public void setVideoStateChangeListener(C1591e c1591e) {
        this.f10209b = c1591e;
    }

    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        String str;
        StringBuilder stringBuilder;
        String stringBuilder2;
        Object obj;
        String str2;
        StringBuilder stringBuilder3;
        Throwable th;
        this.f10208a = uri;
        AssetFileDescriptor assetFileDescriptor = null;
        if (this.f10211d != null) {
            this.f10211d.reset();
            this.f10211d.setSurface(null);
            mediaPlayer = this.f10211d;
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals("asset")) {
                try {
                    AssetFileDescriptor openFd = getContext().getAssets().openFd(uri.getPath().substring(1));
                    try {
                        MediaPlayer mediaPlayer2 = mediaPlayer;
                        mediaPlayer2.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        if (openFd != null) {
                            try {
                                openFd.close();
                            } catch (IOException e) {
                                str = f10207r;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Unable to close");
                                stringBuilder.append(e);
                                stringBuilder2 = stringBuilder.toString();
                                Log.w(str, stringBuilder2);
                                mediaPlayer.setLooping(false);
                                mediaPlayer.setOnBufferingUpdateListener(this);
                                mediaPlayer.setOnCompletionListener(this);
                                mediaPlayer.setOnErrorListener(this);
                                mediaPlayer.setOnInfoListener(this);
                                mediaPlayer.setOnPreparedListener(this);
                                mediaPlayer.setOnVideoSizeChangedListener(this);
                                mediaPlayer.setOnSeekCompleteListener(this);
                                mediaPlayer.prepareAsync();
                                this.f10211d = mediaPlayer;
                                setVideoState(C1590d.PREPARING);
                                setSurfaceTextureListener(this);
                                if (!isAvailable()) {
                                    onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                                }
                            }
                        }
                    } catch (SecurityException e2) {
                        SecurityException securityException = e2;
                        assetFileDescriptor = openFd;
                        obj = securityException;
                        try {
                            str2 = f10207r;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Failed to open assets ");
                            stringBuilder3.append(obj);
                            Log.w(str2, stringBuilder3.toString());
                            setVideoState(C1590d.ERROR);
                            if (assetFileDescriptor != null) {
                                try {
                                    assetFileDescriptor.close();
                                } catch (IOException e3) {
                                    str = f10207r;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unable to close");
                                    stringBuilder.append(e3);
                                    stringBuilder2 = stringBuilder.toString();
                                    Log.w(str, stringBuilder2);
                                    mediaPlayer.setLooping(false);
                                    mediaPlayer.setOnBufferingUpdateListener(this);
                                    mediaPlayer.setOnCompletionListener(this);
                                    mediaPlayer.setOnErrorListener(this);
                                    mediaPlayer.setOnInfoListener(this);
                                    mediaPlayer.setOnPreparedListener(this);
                                    mediaPlayer.setOnVideoSizeChangedListener(this);
                                    mediaPlayer.setOnSeekCompleteListener(this);
                                    mediaPlayer.prepareAsync();
                                    this.f10211d = mediaPlayer;
                                    setVideoState(C1590d.PREPARING);
                                    setSurfaceTextureListener(this);
                                    if (!isAvailable()) {
                                        onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                                    }
                                }
                            }
                            mediaPlayer.setLooping(false);
                            mediaPlayer.setOnBufferingUpdateListener(this);
                            mediaPlayer.setOnCompletionListener(this);
                            mediaPlayer.setOnErrorListener(this);
                            mediaPlayer.setOnInfoListener(this);
                            mediaPlayer.setOnPreparedListener(this);
                            mediaPlayer.setOnVideoSizeChangedListener(this);
                            mediaPlayer.setOnSeekCompleteListener(this);
                            mediaPlayer.prepareAsync();
                            this.f10211d = mediaPlayer;
                            setVideoState(C1590d.PREPARING);
                            setSurfaceTextureListener(this);
                            if (!isAvailable()) {
                                onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (assetFileDescriptor != null) {
                                try {
                                    assetFileDescriptor.close();
                                } catch (IOException e4) {
                                    str2 = f10207r;
                                    stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append("Unable to close");
                                    stringBuilder3.append(e4);
                                    Log.w(str2, stringBuilder3.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        assetFileDescriptor = openFd;
                        th = th4;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (SecurityException e5) {
                    obj = e5;
                    str2 = f10207r;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Failed to open assets ");
                    stringBuilder3.append(obj);
                    Log.w(str2, stringBuilder3.toString());
                    setVideoState(C1590d.ERROR);
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    mediaPlayer.setLooping(false);
                    mediaPlayer.setOnBufferingUpdateListener(this);
                    mediaPlayer.setOnCompletionListener(this);
                    mediaPlayer.setOnErrorListener(this);
                    mediaPlayer.setOnInfoListener(this);
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.setOnVideoSizeChangedListener(this);
                    mediaPlayer.setOnSeekCompleteListener(this);
                    mediaPlayer.prepareAsync();
                    this.f10211d = mediaPlayer;
                    setVideoState(C1590d.PREPARING);
                    setSurfaceTextureListener(this);
                    if (!isAvailable()) {
                        onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                    }
                }
            }
            mediaPlayer.setDataSource(uri.toString());
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.f10211d = mediaPlayer;
            setVideoState(C1590d.PREPARING);
        } catch (Exception e6) {
            setVideoState(C1590d.ERROR);
            mediaPlayer.release();
            String str3 = f10207r;
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Cannot prepare media player with SurfaceTexture: ");
            stringBuilder4.append(e6);
            Log.e(str3, stringBuilder4.toString());
        }
        setSurfaceTextureListener(this);
        if (!isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
