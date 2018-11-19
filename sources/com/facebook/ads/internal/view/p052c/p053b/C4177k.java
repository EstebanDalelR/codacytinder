package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;

/* renamed from: com.facebook.ads.internal.view.c.b.k */
public class C4177k extends C3361o {
    /* renamed from: a */
    private final C1429s<C3339l> f13331a;

    /* renamed from: com.facebook.ads.internal.view.c.b.k$1 */
    class C33601 extends C1429s<C3339l> {
        /* renamed from: a */
        final /* synthetic */ C4177k f10191a;

        C33601(C4177k c4177k) {
            this.f10191a = c4177k;
        }

        /* renamed from: a */
        public Class<C3339l> mo1725a() {
            return C3339l.class;
        }

        /* renamed from: a */
        public void m12922a(C3339l c3339l) {
            this.f10191a.setVisibility(8);
        }
    }

    public C4177k(Context context) {
        this(context, null);
    }

    public C4177k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4177k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13331a = new C33601(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        View progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, Mode.SRC_IN);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4996a(this.f13331a);
        }
    }

    /* renamed from: b */
    protected void mo3340b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4998b(this.f13331a);
        }
        setVisibility(8);
        super.mo3340b();
    }
}
