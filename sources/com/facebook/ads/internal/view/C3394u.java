package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.p041h.C1427q;
import com.facebook.ads.internal.p041h.C1428r;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.p047k.al.C1477a;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p053b.C3361o;
import com.facebook.ads.internal.view.p052c.p054c.C1589c;
import com.facebook.ads.internal.view.p052c.p054c.C1590d;
import com.facebook.ads.internal.view.p052c.p054c.C1591e;
import com.facebook.ads.internal.view.p052c.p054c.C3364b;
import com.facebook.ads.internal.view.p052c.p054c.C4188a;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3331d;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import com.facebook.ads.internal.view.p052c.p080a.C3343p;
import com.facebook.ads.internal.view.p052c.p080a.C3345r;
import com.facebook.ads.internal.view.p052c.p080a.C3346s;
import com.facebook.ads.internal.view.p052c.p080a.C3347t;
import com.facebook.ads.internal.view.p052c.p080a.C3348u;
import com.facebook.ads.internal.view.p052c.p080a.C3350w;
import com.facebook.ads.internal.view.p052c.p080a.C3351x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.u */
public class C3394u extends RelativeLayout implements C1477a, C1591e {
    /* renamed from: b */
    private static final C3339l f10325b = new C3339l();
    /* renamed from: c */
    private static final C3331d f10326c = new C3331d();
    /* renamed from: d */
    private static final C3329b f10327d = new C3329b();
    /* renamed from: e */
    private static final C3341n f10328e = new C3341n();
    /* renamed from: f */
    private static final C3345r f10329f = new C3345r();
    /* renamed from: g */
    private static final C3335h f10330g = new C3335h();
    /* renamed from: h */
    private static final C3346s f10331h = new C3346s();
    /* renamed from: i */
    private static final C3337j f10332i = new C3337j();
    /* renamed from: j */
    private static final C3348u f10333j = new C3348u();
    /* renamed from: k */
    private static final C3351x f10334k = new C3351x();
    /* renamed from: l */
    private static final C3350w f10335l = new C3350w();
    /* renamed from: a */
    protected final C1589c f10336a;
    /* renamed from: m */
    private final List<C1582n> f10337m = new ArrayList();
    /* renamed from: n */
    private final Handler f10338n = new Handler();
    /* renamed from: o */
    private final C1428r<C1429s, C1427q> f10339o = new C1428r();
    /* renamed from: p */
    private boolean f10340p;
    /* renamed from: q */
    private boolean f10341q;
    /* renamed from: r */
    private final OnTouchListener f10342r = new C16182(this);

    /* renamed from: com.facebook.ads.internal.view.u$1 */
    class C16171 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3394u f4480a;

        C16171(C3394u c3394u) {
            this.f4480a = c3394u;
        }

        public void run() {
            if (!this.f4480a.f10340p) {
                this.f4480a.f10339o.m4994a(C3394u.f10328e);
                this.f4480a.f10338n.postDelayed(this, 250);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.u$2 */
    class C16182 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3394u f4481a;

        C16182(C3394u c3394u) {
            this.f4481a = c3394u;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f4481a.f10339o.m4994a(new C3347t(view, motionEvent));
            return false;
        }
    }

    public C3394u(Context context) {
        super(context);
        this.f10336a = C1418g.m4930a(context) ? new C4188a(context) : new C3364b(context);
        mo3349c();
    }

    public C3394u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10336a = C1418g.m4930a(context) ? new C4188a(context, attributeSet) : new C3364b(context, attributeSet);
        mo3349c();
    }

    public C3394u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10336a = C1418g.m4930a(context) ? new C4188a(context, attributeSet, i) : new C3364b(context, attributeSet, i);
        mo3349c();
    }

    @TargetApi(21)
    public C3394u(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f10336a = C1418g.m4930a(context) ? new C4188a(context, attributeSet, i, i2) : new C3364b(context, attributeSet, i, i2);
        mo3349c();
    }

    /* renamed from: c */
    private void mo3349c() {
        this.f10336a.setRequestedVolume(1.0f);
        this.f10336a.setVideoStateChangeListener(this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) this.f10336a, layoutParams);
        setOnTouchListener(this.f10342r);
    }

    /* renamed from: a */
    public void m13053a(int i) {
        this.f10336a.mo1790a(i);
    }

    /* renamed from: a */
    public void mo1833a(int i, int i2) {
        this.f10339o.m4994a(new C3343p(i, i2));
    }

    /* renamed from: a */
    public void m13055a(VideoStartReason videoStartReason) {
        if (this.f10340p && this.f10336a.getState() == C1590d.PLAYBACK_COMPLETED) {
            this.f10340p = false;
        }
        this.f10336a.mo1791a(videoStartReason);
    }

    /* renamed from: a */
    public void m13056a(C1582n c1582n) {
        this.f10337m.add(c1582n);
    }

    /* renamed from: a */
    public void mo1834a(C1590d c1590d) {
        C1428r c1428r;
        C1427q c1427q;
        if (c1590d == C1590d.PREPARED) {
            c1428r = this.f10339o;
            c1427q = f10325b;
        } else if (c1590d == C1590d.ERROR) {
            this.f10340p = true;
            c1428r = this.f10339o;
            c1427q = f10326c;
        } else if (c1590d == C1590d.PLAYBACK_COMPLETED) {
            this.f10340p = true;
            this.f10338n.removeCallbacksAndMessages(null);
            c1428r = this.f10339o;
            c1427q = f10327d;
        } else if (c1590d == C1590d.STARTED) {
            this.f10339o.m4994a(f10332i);
            this.f10338n.removeCallbacksAndMessages(null);
            this.f10338n.postDelayed(new C16171(this), 250);
            return;
        } else {
            if (c1590d == C1590d.PAUSED) {
                c1428r = this.f10339o;
                c1427q = f10330g;
            } else if (c1590d == C1590d.IDLE) {
                c1428r = this.f10339o;
                c1427q = f10331h;
            } else {
                return;
            }
            c1428r.m4994a(c1427q);
            this.f10338n.removeCallbacksAndMessages(null);
            return;
        }
        c1428r.m4994a(c1427q);
    }

    /* renamed from: a */
    public void m13058a(boolean z) {
        this.f10336a.mo1792a(z);
    }

    /* renamed from: a */
    public boolean mo1835a() {
        return C1418g.m4930a(getContext());
    }

    /* renamed from: b */
    public boolean mo1836b() {
        return this.f10341q;
    }

    /* renamed from: e */
    public void m13061e() {
        for (C1582n c1582n : this.f10337m) {
            if (c1582n instanceof C3361o) {
                C3361o c3361o = (C3361o) c1582n;
                if (c3361o.getParent() == null) {
                    addView(c3361o);
                    c3361o.mo1788a(this);
                }
            } else {
                c1582n.mo1788a(this);
            }
        }
    }

    /* renamed from: f */
    public void m13062f() {
        for (C1582n c1582n : this.f10337m) {
            if (c1582n instanceof C3361o) {
                C3361o c3361o = (C3361o) c1582n;
                if (c3361o.getParent() != null) {
                    c3361o.mo1789b(this);
                    removeView(c3361o);
                }
            } else {
                c1582n.mo1789b(this);
            }
        }
    }

    /* renamed from: g */
    public void m13063g() {
        getEventBus().m4994a(f10329f);
        this.f10336a.mo1793b();
    }

    public int getCurrentPosition() {
        return this.f10336a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f10336a.getDuration();
    }

    @NonNull
    public C1428r<C1429s, C1427q> getEventBus() {
        return this.f10339o;
    }

    public long getInitialBufferTime() {
        return this.f10336a.getInitialBufferTime();
    }

    public C1590d getState() {
        return this.f10336a.getState();
    }

    public TextureView getTextureView() {
        return (TextureView) this.f10336a;
    }

    public int getVideoHeight() {
        return this.f10336a.getVideoHeight();
    }

    public VideoStartReason getVideoStartReason() {
        return this.f10336a.getStartReason();
    }

    public View getVideoView() {
        return this.f10336a.getView();
    }

    public int getVideoWidth() {
        return this.f10336a.getVideoWidth();
    }

    public float getVolume() {
        return this.f10336a.getVolume();
    }

    /* renamed from: h */
    public void m13064h() {
        this.f10336a.mo1795c();
    }

    /* renamed from: i */
    public void m13065i() {
        this.f10336a.mo1794b(true);
    }

    /* renamed from: j */
    boolean m13066j() {
        return this.f10336a.mo1796d();
    }

    /* renamed from: k */
    public void m13067k() {
        this.f10336a.setVideoStateChangeListener(null);
        this.f10336a.mo1797e();
    }

    protected void onAttachedToWindow() {
        this.f10339o.m4994a(f10335l);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        this.f10339o.m4994a(f10334k);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.f10336a != null) {
            this.f10336a.setControlsAnchorView(view);
        }
    }

    public void setIsFullScreen(boolean z) {
        this.f10341q = z;
        this.f10336a.setFullScreen(z);
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.f10336a.setVideoMPD(str);
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            m13062f();
        } else {
            m13061e();
            this.f10336a.setup(uri);
        }
        this.f10340p = false;
    }

    public void setVideoURI(@Nullable String str) {
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f) {
        this.f10336a.setRequestedVolume(f);
        getEventBus().m4994a(f10333j);
    }
}
