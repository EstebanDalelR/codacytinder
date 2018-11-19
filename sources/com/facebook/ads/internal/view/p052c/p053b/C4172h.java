package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p054c.C1590d;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3340m;

/* renamed from: com.facebook.ads.internal.view.c.b.h */
public class C4172h extends C3361o implements OnTouchListener {
    /* renamed from: a */
    private final C3340m f13317a;
    /* renamed from: b */
    private final C3336i f13318b;
    /* renamed from: c */
    private final C3338k f13319c;
    /* renamed from: d */
    private final C3330c f13320d;
    /* renamed from: e */
    private final C1581m f13321e;

    /* renamed from: com.facebook.ads.internal.view.c.b.h$1 */
    class C41681 extends C3340m {
        /* renamed from: a */
        final /* synthetic */ C4172h f13313a;

        C41681(C4172h c4172h) {
            this.f13313a = c4172h;
        }

        /* renamed from: a */
        public void m16533a(C3339l c3339l) {
            this.f13313a.setVisibility(0);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.h$2 */
    class C41692 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C4172h f13314a;

        C41692(C4172h c4172h) {
            this.f13314a = c4172h;
        }

        /* renamed from: a */
        public void m16535a(C3335h c3335h) {
            this.f13314a.f13321e.setChecked(true);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.h$3 */
    class C41703 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C4172h f13315a;

        C41703(C4172h c4172h) {
            this.f13315a = c4172h;
        }

        /* renamed from: a */
        public void m16537a(C3337j c3337j) {
            this.f13315a.f13321e.setChecked(false);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.h$4 */
    class C41714 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C4172h f13316a;

        C41714(C4172h c4172h) {
            this.f13316a = c4172h;
        }

        /* renamed from: a */
        public void m16539a(C3329b c3329b) {
            this.f13316a.f13321e.setChecked(true);
        }
    }

    public C4172h(Context context) {
        this(context, null);
    }

    public C4172h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4172h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13317a = new C41681(this);
        this.f13318b = new C41692(this);
        this.f13319c = new C41703(this);
        this.f13320d = new C41714(this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13321e = new C1581m(context);
        this.f13321e.setChecked(true);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.f13321e, layoutParams);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        this.f13321e.setOnTouchListener(this);
        setOnTouchListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4995a(this.f13317a, this.f13320d, this.f13318b, this.f13319c);
        }
    }

    /* renamed from: b */
    protected void mo3340b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4997b(this.f13319c, this.f13318b, this.f13320d, this.f13317a);
        }
        setOnTouchListener(null);
        this.f13321e.setOnTouchListener(null);
        super.mo3340b();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        C3394u videoView = getVideoView();
        if (videoView == null) {
            return false;
        }
        if (!(videoView.getState() == C1590d.PREPARED || videoView.getState() == C1590d.PAUSED)) {
            if (videoView.getState() != C1590d.PLAYBACK_COMPLETED) {
                if (videoView.getState() == C1590d.STARTED) {
                    videoView.m13058a(true);
                }
                return false;
            }
        }
        videoView.m13055a(VideoStartReason.USER_STARTED);
        return true;
    }
}
