package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.p048a.C1475a;
import com.facebook.ads.internal.p047k.p048a.C1475a.C1474a;
import com.facebook.ads.internal.view.C1613q;
import com.facebook.ads.internal.view.C4202p;
import com.facebook.ads.internal.view.p052c.p054c.C1590d;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3331d;
import com.facebook.ads.internal.view.p052c.p080a.C3332e;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3340m;
import com.facebook.ads.internal.view.p052c.p080a.C3343p;
import com.facebook.ads.internal.view.p052c.p080a.C3344q;
import com.facebook.ads.internal.view.p052c.p080a.C3348u;
import com.facebook.ads.internal.view.p052c.p080a.C3349v;

public abstract class MediaViewVideoRenderer extends FrameLayout {
    /* renamed from: d */
    private static final String f3542d = "MediaViewVideoRenderer";
    @Nullable
    /* renamed from: a */
    protected NativeAd f3543a;
    /* renamed from: b */
    protected VideoAutoplayBehavior f3544b;
    /* renamed from: c */
    final C4202p f3545c;
    /* renamed from: e */
    private final C3340m f3546e = new C41331(this);
    /* renamed from: f */
    private final C3338k f3547f = new C41342(this);
    /* renamed from: g */
    private final C3336i f3548g = new C41353(this);
    /* renamed from: h */
    private final C3344q f3549h = new C41364(this);
    /* renamed from: i */
    private final C3330c f3550i = new C41375(this);
    /* renamed from: j */
    private final C3349v f3551j = new C41386(this);
    /* renamed from: k */
    private final C3332e f3552k = new C41397(this);
    /* renamed from: l */
    private boolean f3553l;
    /* renamed from: m */
    private boolean f3554m;
    /* renamed from: n */
    private boolean f3555n = true;
    /* renamed from: o */
    private boolean f3556o = true;

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$1 */
    class C41331 extends C3340m {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13125a;

        C41331(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13125a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16237a(C3339l c3339l) {
            this.f13125a.onPrepared();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$2 */
    class C41342 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13126a;

        C41342(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13126a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16239a(C3337j c3337j) {
            this.f13126a.onPlayed();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$3 */
    class C41353 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13127a;

        C41353(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13127a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16241a(C3335h c3335h) {
            this.f13127a.onPaused();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$4 */
    class C41364 extends C3344q {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13128a;

        C41364(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13128a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16243a(C3343p c3343p) {
            this.f13128a.onSeek();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$5 */
    class C41375 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13129a;

        C41375(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13129a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16245a(C3329b c3329b) {
            this.f13129a.onCompleted();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$6 */
    class C41386 extends C3349v {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13130a;

        C41386(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13130a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16247a(C3348u c3348u) {
            this.f13130a.onVolumeChanged();
        }
    }

    /* renamed from: com.facebook.ads.MediaViewVideoRenderer$7 */
    class C41397 extends C3332e {
        /* renamed from: a */
        final /* synthetic */ MediaViewVideoRenderer f13131a;

        C41397(MediaViewVideoRenderer mediaViewVideoRenderer) {
            this.f13131a = mediaViewVideoRenderer;
        }

        /* renamed from: a */
        public void m16249a(C3331d c3331d) {
            this.f13131a.onError();
        }
    }

    public MediaViewVideoRenderer(Context context) {
        super(context);
        this.f3545c = new C4202p(context);
        m4678a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3545c = new C4202p(context, attributeSet);
        m4678a();
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3545c = new C4202p(context, attributeSet, i);
        m4678a();
    }

    @TargetApi(21)
    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3545c = new C4202p(context, attributeSet, i, i2);
        m4678a();
    }

    /* renamed from: a */
    private void m4678a() {
        this.f3545c.setEnableBackgroundVideo(shouldAllowBackgroundPlayback());
        this.f3545c.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f3545c);
        this.f3545c.getEventBus().m4995a(this.f3546e, this.f3547f, this.f3548g, this.f3549h, this.f3550i, this.f3551j, this.f3552k);
    }

    public void destroy() {
        this.f3545c.m13067k();
    }

    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (this.f3553l) {
            this.f3553l = false;
            if (this.f3554m) {
                this.f3545c.m13055a(videoStartReason);
            }
            onSeekDisengaged();
            return;
        }
        Log.w(f3542d, "disengageSeek called without engageSeek.");
    }

    public final void engageSeek() {
        if (this.f3553l) {
            Log.w(f3542d, "engageSeek called without disengageSeek.");
            return;
        }
        this.f3553l = true;
        this.f3554m = C1590d.STARTED.equals(this.f3545c.getState());
        this.f3545c.m13058a(false);
        onSeekEngaged();
    }

    @IntRange(from = 0)
    public final int getCurrentTimeMs() {
        return this.f3545c.getCurrentPosition();
    }

    @IntRange(from = 0)
    public final int getDuration() {
        return this.f3545c.getDuration();
    }

    @FloatRange(from = 0.0d, to = 0.0d)
    public final float getVolume() {
        return this.f3545c.getVolume();
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    public final void pause(boolean z) {
        this.f3545c.m13058a(z);
    }

    public final void play(VideoStartReason videoStartReason) {
        this.f3545c.m13055a(videoStartReason);
    }

    public final void seekTo(@IntRange(from = 0) int i) {
        if (this.f3553l) {
            this.f3545c.m13053a(i);
        } else {
            Log.w(f3542d, "Seeking must be preceded by a call to engageSeek, and followed by a call to disengageSeek.");
        }
    }

    final void setAdEventManager(C1425f c1425f) {
        this.f3545c.setAdEventManager(c1425f);
    }

    @Deprecated
    void setAutoplay(boolean z) {
        this.f3555n = z;
    }

    @Deprecated
    void setAutoplayOnMobile(boolean z) {
        this.f3556o = z;
    }

    final void setListener(C1613q c1613q) {
        this.f3545c.setListener(c1613q);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f3543a = nativeAd;
        this.f3545c.m16647a(nativeAd.m12405d(), nativeAd.m12408g());
        this.f3545c.setVideoMPD(nativeAd.m12404c());
        this.f3545c.setVideoURI(nativeAd.m12403b());
        this.f3545c.setVideoCTA(nativeAd.getAdCallToAction());
        this.f3545c.setNativeAd(nativeAd);
        this.f3544b = nativeAd.m12406e();
    }

    public final void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f3545c.setVolume(f);
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public boolean shouldAutoplay() {
        boolean z = false;
        if (this.f3545c != null) {
            if (this.f3545c.getState() == C1590d.PLAYBACK_COMPLETED) {
                return false;
            }
            if (this.f3544b == VideoAutoplayBehavior.DEFAULT) {
                if (this.f3555n && (this.f3556o || C1475a.m5158c(getContext()) == C1474a.MOBILE_INTERNET)) {
                    z = true;
                }
                return z;
            } else if (this.f3544b == VideoAutoplayBehavior.ON) {
                z = true;
            }
        }
        return z;
    }

    public void unsetNativeAd() {
        pause(false);
        this.f3545c.m16647a(null, null);
        this.f3545c.setVideoMPD(null);
        this.f3545c.setVideoURI((Uri) null);
        this.f3545c.setVideoCTA(null);
        this.f3545c.setNativeAd(null);
        this.f3544b = VideoAutoplayBehavior.DEFAULT;
        this.f3543a = null;
    }
}
