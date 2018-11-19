package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p053b.C4167g;
import com.facebook.ads.internal.view.p052c.p053b.C4172h;
import com.facebook.ads.internal.view.p052c.p054c.C1590d;

/* renamed from: com.facebook.ads.internal.view.h */
public final class C3374h extends MediaViewVideoRenderer {
    /* renamed from: d */
    private static final String f10253d = "h";
    /* renamed from: e */
    private final C4167g f10254e;
    /* renamed from: f */
    private final C1517a f10255f = m12986b();
    @Nullable
    /* renamed from: g */
    private C4202p f10256g;
    /* renamed from: h */
    private boolean f10257h;
    /* renamed from: i */
    private boolean f10258i;
    /* renamed from: j */
    private boolean f10259j;

    /* renamed from: com.facebook.ads.internal.view.h$2 */
    class C16062 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3374h f4454a;

        C16062(C3374h c3374h) {
            this.f4454a = c3374h;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f4454a.f10256g != null && motionEvent.getAction() == 1) {
                this.f4454a.f10256g.mo3349c();
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.h$1 */
    class C33731 extends C1516a {
        /* renamed from: a */
        final /* synthetic */ C3374h f10252a;

        C33731(C3374h c3374h) {
            this.f10252a = c3374h;
        }

        /* renamed from: a */
        public void mo1681a() {
            if (this.f10252a.f10256g != null) {
                if (!this.f10252a.f10259j && (this.f10252a.f10258i || this.f10252a.shouldAutoplay())) {
                    this.f10252a.play(VideoStartReason.AUTO_STARTED);
                }
                this.f10252a.f10258i = false;
                this.f10252a.f10259j = false;
            }
        }

        /* renamed from: b */
        public void mo1829b() {
            if (this.f10252a.f10256g != null) {
                if (this.f10252a.f10256g.getState() == C1590d.PAUSED) {
                    this.f10252a.f10259j = true;
                } else if (this.f10252a.f10256g.getState() == C1590d.STARTED) {
                    this.f10252a.f10258i = true;
                }
                this.f10252a.pause(this.f10252a.f10259j);
            }
        }
    }

    public C3374h(Context context) {
        super(context);
        this.f10254e = new C4167g(context);
        m12984a();
    }

    public C3374h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10254e = new C4167g(context);
        m12984a();
    }

    public C3374h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10254e = new C4167g(context);
        m12984a();
    }

    @TargetApi(21)
    public C3374h(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f10254e = new C4167g(context);
        m12984a();
    }

    /* renamed from: a */
    private void m12984a() {
        setVolume(0.0f);
        float f = an.f4090b;
        int i = (int) (2.0f * f);
        int i2 = (int) (f * 25.0f);
        C1582n c4172h = new C4172h(getContext());
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        c4172h.setPadding(i, i2, i2, i);
        c4172h.setLayoutParams(layoutParams);
        for (i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(0);
            if (childAt instanceof C4202p) {
                this.f10256g = (C4202p) childAt;
                break;
            }
        }
        if (this.f10256g == null) {
            Log.e(f10253d, "Unable to find MediaViewVideo child.");
        } else {
            this.f10256g.m13056a(this.f10254e);
            this.f10256g.m13056a(c4172h);
        }
        this.f10255f.m5349a(0);
        this.f10255f.m5352b((int) Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    /* renamed from: b */
    private C1517a m12986b() {
        return new C1517a(this, 50, true, new C33731(this));
    }

    /* renamed from: c */
    private void m12989c() {
        if (getVisibility() == 0 && this.f10257h && hasWindowFocus()) {
            this.f10255f.m5348a();
            return;
        }
        if (this.f10256g != null && this.f10256g.getState() == C1590d.PAUSED) {
            this.f10259j = true;
        }
        this.f10255f.m5351b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10257h = true;
        m12989c();
    }

    protected void onDetachedFromWindow() {
        this.f10257h = false;
        m12989c();
        super.onDetachedFromWindow();
    }

    public void onPrepared() {
        super.onPrepared();
        setOnTouchListener(new C16062(this));
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m12989c();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m12989c();
    }

    public void setNativeAd(NativeAd nativeAd) {
        super.setNativeAd(nativeAd);
        this.f10258i = false;
        this.f10259j = false;
        C4167g c4167g = this.f10254e;
        String url = (nativeAd == null || nativeAd.getAdCoverImage() == null) ? null : nativeAd.getAdCoverImage().getUrl();
        c4167g.setImage(url);
        this.f10255f.m5348a();
    }
}
