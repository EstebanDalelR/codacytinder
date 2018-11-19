package com.facebook.ads.internal.view.p052c.p053b;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;

/* renamed from: com.facebook.ads.internal.view.c.b.g */
public class C4167g extends C3361o implements OnLayoutChangeListener {
    /* renamed from: a */
    private final ImageView f13310a;
    /* renamed from: b */
    private final C1429s<C3337j> f13311b = new C33561(this);
    /* renamed from: c */
    private final C1429s<C3329b> f13312c = new C33572(this);

    /* renamed from: com.facebook.ads.internal.view.c.b.g$1 */
    class C33561 extends C1429s<C3337j> {
        /* renamed from: a */
        final /* synthetic */ C4167g f10175a;

        C33561(C4167g c4167g) {
            this.f10175a = c4167g;
        }

        /* renamed from: a */
        public Class<C3337j> mo1725a() {
            return C3337j.class;
        }

        /* renamed from: a */
        public void m12905a(C3337j c3337j) {
            this.f10175a.setVisibility(8);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.g$2 */
    class C33572 extends C1429s<C3329b> {
        /* renamed from: a */
        final /* synthetic */ C4167g f10176a;

        C33572(C4167g c4167g) {
            this.f10176a = c4167g;
        }

        /* renamed from: a */
        public Class<C3329b> mo1725a() {
            return C3329b.class;
        }

        /* renamed from: a */
        public void m12908a(C3329b c3329b) {
            this.f10176a.setVisibility(0);
        }
    }

    public C4167g(Context context) {
        super(context);
        this.f13310a = new ImageView(context);
        this.f13310a.setScaleType(ScaleType.FIT_CENTER);
        this.f13310a.setBackgroundColor(-16777216);
    }

    /* renamed from: a */
    protected void mo3339a() {
        super.mo3339a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m4995a(this.f13311b, this.f13312c);
            getVideoView().addOnLayoutChangeListener(this);
        }
    }

    /* renamed from: b */
    protected void mo3340b() {
        if (getVideoView() != null) {
            getVideoView().removeOnLayoutChangeListener(this);
            getVideoView().getEventBus().m4997b(this.f13312c, this.f13311b);
        }
        super.mo3340b();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        i4 -= i2;
        i3 -= i;
        if (layoutParams.height != i4 || layoutParams.width != i3 || layoutParams.topMargin != i2 || layoutParams.leftMargin != i) {
            ViewGroup.LayoutParams layoutParams2 = new LayoutParams(i3, i4);
            layoutParams2.topMargin = i2;
            layoutParams2.leftMargin = i;
            this.f13310a.setLayoutParams(new LayoutParams(i3, i4));
            if (this.f13310a.getParent() == null) {
                addView(this.f13310a);
            }
            setLayoutParams(layoutParams2);
        }
    }

    public void setImage(@Nullable String str) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        new C1505r(this.f13310a).m5301a(str);
    }
}
