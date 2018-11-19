package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.C3257h;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1605e;
import com.facebook.ads.internal.view.C1613q;
import com.facebook.ads.internal.view.C3374h;
import com.facebook.ads.internal.view.hscroll.C4443b;

public class MediaView extends RelativeLayout {
    /* renamed from: a */
    private static final String f3534a = "MediaView";
    /* renamed from: b */
    private static final int f3535b = Color.argb(51, 145, 150, 165);
    /* renamed from: c */
    private C1605e f3536c;
    /* renamed from: d */
    private C4443b f3537d;
    /* renamed from: e */
    private MediaViewVideoRenderer f3538e;
    @Nullable
    /* renamed from: f */
    private MediaViewListener f3539f;
    /* renamed from: g */
    private boolean f3540g;
    @Deprecated
    /* renamed from: h */
    private boolean f3541h = true;

    public MediaView(Context context) {
        super(context);
        setImageRenderer(new C1605e(context));
        setCarouselRenderer(new C4443b(context));
        setVideoRenderer(new C3374h(context));
        m4675a();
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageRenderer(new C1605e(context, attributeSet));
        setCarouselRenderer(new C4443b(context, attributeSet));
        setVideoRenderer(new C3374h(context, attributeSet));
        m4675a();
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageRenderer(new C1605e(context, attributeSet, i));
        setCarouselRenderer(new C4443b(context, attributeSet, i));
        setVideoRenderer(new C3374h(context, attributeSet, i));
        m4675a();
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setImageRenderer(new C1605e(context, attributeSet, i, i2));
        setCarouselRenderer(new C4443b(context, attributeSet, i));
        setVideoRenderer(new C3374h(context, attributeSet, i, i2));
        m4675a();
    }

    /* renamed from: a */
    private void m4675a() {
        setBackgroundColor(f3535b);
    }

    /* renamed from: a */
    private boolean m4676a(NativeAd nativeAd) {
        return VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(nativeAd.m12403b());
    }

    /* renamed from: b */
    private boolean m4677b(NativeAd nativeAd) {
        if (nativeAd.m12407f() == null) {
            return false;
        }
        for (NativeAd adCoverImage : nativeAd.m12407f()) {
            if (adCoverImage.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    private void setCarouselRenderer(C4443b c4443b) {
        if (this.f3540g) {
            throw new IllegalStateException("Carousel renderer must be set before nativeAd.");
        }
        if (this.f3537d != null) {
            removeView(this.f3537d);
        }
        float f = an.f4090b;
        int round = Math.round(4.0f * f);
        int round2 = Math.round(f * 12.0f);
        c4443b.setChildSpacing(round);
        c4443b.setPadding(0, round2, 0, round2);
        c4443b.setVisibility(8);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(c4443b, layoutParams);
        this.f3537d = c4443b;
    }

    private void setImageRenderer(C1605e c1605e) {
        if (this.f3540g) {
            throw new IllegalStateException("Image renderer must be set before nativeAd.");
        }
        if (this.f3536c != null) {
            removeView(this.f3536c);
        }
        c1605e.setVisibility(8);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(c1605e, layoutParams);
        this.f3536c = c1605e;
    }

    public void destroy() {
        this.f3538e.pause(false);
        this.f3538e.destroy();
    }

    protected C1425f getAdEventManager() {
        return C3288g.m12671a(getContext());
    }

    @Deprecated
    public boolean isAutoplay() {
        return this.f3538e.shouldAutoplay();
    }

    @Deprecated
    public void setAutoplay(boolean z) {
        this.f3541h = z;
        if (this.f3538e instanceof C3374h) {
            this.f3538e.setAutoplay(z);
            return;
        }
        throw new IllegalStateException("MediaView only supports setAutoplay for backwards compatibility. New MediaViewVideoRenderer classes should implement their own autoplay handling.");
    }

    @Deprecated
    public void setAutoplayOnMobile(boolean z) {
        if (this.f3538e instanceof C3374h) {
            this.f3538e.setAutoplayOnMobile(z);
            return;
        }
        throw new IllegalStateException("MediaView only supports setAutoplayOnMobile for backwards compatibility. New MediaViewVideoRenderer classes should implement their own autoplay handling.");
    }

    public void setListener(final MediaViewListener mediaViewListener) {
        this.f3539f = mediaViewListener;
        if (mediaViewListener == null) {
            this.f3538e.setListener(null);
        } else {
            this.f3538e.setListener(new C1613q(this) {
                /* renamed from: b */
                final /* synthetic */ MediaView f9858b;

                /* renamed from: a */
                public void mo1665a() {
                    mediaViewListener.onVolumeChange(this.f9858b, this.f9858b.f3538e.getVolume());
                }

                /* renamed from: b */
                public void mo1666b() {
                    mediaViewListener.onPause(this.f9858b);
                }

                /* renamed from: c */
                public void mo1667c() {
                    mediaViewListener.onPlay(this.f9858b);
                }

                /* renamed from: d */
                public void mo1668d() {
                    mediaViewListener.onFullscreenBackground(this.f9858b);
                }

                /* renamed from: e */
                public void mo1669e() {
                    mediaViewListener.onFullscreenForeground(this.f9858b);
                }

                /* renamed from: f */
                public void mo1670f() {
                    mediaViewListener.onExitFullscreen(this.f9858b);
                }

                /* renamed from: g */
                public void mo1671g() {
                    mediaViewListener.onEnterFullscreen(this.f9858b);
                }

                /* renamed from: h */
                public void mo1672h() {
                    mediaViewListener.onComplete(this.f9858b);
                }
            });
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f3540g = true;
        nativeAd.m12399a(this);
        nativeAd.setMediaViewAutoplay(this.f3541h);
        if (m4677b(nativeAd)) {
            this.f3536c.setVisibility(8);
            this.f3536c.m5480a(null, null);
            this.f3538e.setVisibility(8);
            this.f3538e.unsetNativeAd();
            bringChildToFront(this.f3537d);
            this.f3537d.setCurrentPosition(0);
            this.f3537d.setAdapter(new C3257h(this.f3537d, nativeAd.m12407f()));
            this.f3537d.setVisibility(0);
        } else if (m4676a(nativeAd)) {
            this.f3536c.setVisibility(8);
            this.f3536c.m5480a(null, null);
            this.f3537d.setVisibility(8);
            this.f3537d.setAdapter(null);
            bringChildToFront(this.f3538e);
            this.f3538e.setNativeAd(nativeAd);
            this.f3538e.setVisibility(0);
        } else {
            if (nativeAd.getAdCoverImage() != null) {
                this.f3538e.setVisibility(8);
                this.f3538e.unsetNativeAd();
                this.f3537d.setVisibility(8);
                this.f3537d.setAdapter(null);
                bringChildToFront(this.f3536c);
                this.f3536c.setVisibility(0);
                new C1505r(this.f3536c).m5301a(nativeAd.getAdCoverImage().getUrl());
            }
        }
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (this.f3540g) {
            throw new IllegalStateException("Video renderer must be set before nativeAd.");
        }
        if (this.f3538e != null) {
            removeView(this.f3538e);
            this.f3538e.destroy();
        }
        mediaViewVideoRenderer.setAdEventManager(getAdEventManager());
        mediaViewVideoRenderer.setVisibility(8);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(mediaViewVideoRenderer, layoutParams);
        this.f3538e = mediaViewVideoRenderer;
    }
}
