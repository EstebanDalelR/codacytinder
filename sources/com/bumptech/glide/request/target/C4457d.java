package com.bumptech.glide.request.target;

import android.widget.ImageView;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;

/* renamed from: com.bumptech.glide.request.target.d */
public class C4457d extends C4436e<C1041b> {
    /* renamed from: b */
    private int f14822b;
    /* renamed from: c */
    private C1041b f14823c;

    public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
        m18638a((C1041b) obj, glideAnimation);
    }

    public C4457d(ImageView imageView) {
        this(imageView, -1);
    }

    public C4457d(ImageView imageView, int i) {
        super(imageView);
        this.f14822b = i;
    }

    /* renamed from: a */
    public void m18638a(C1041b c1041b, GlideAnimation<? super C1041b> glideAnimation) {
        if (!c1041b.mo1328a()) {
            float intrinsicWidth = ((float) c1041b.getIntrinsicWidth()) / ((float) c1041b.getIntrinsicHeight());
            if (Math.abs((((float) ((ImageView) this.a).getWidth()) / ((float) ((ImageView) this.a).getHeight())) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                c1041b = new C3125h(c1041b, ((ImageView) this.a).getWidth());
            }
        }
        super.onResourceReady(c1041b, glideAnimation);
        this.f14823c = c1041b;
        c1041b.mo1327a(this.f14822b);
        c1041b.start();
    }

    /* renamed from: a */
    protected void m18637a(C1041b c1041b) {
        ((ImageView) this.a).setImageDrawable(c1041b);
    }

    public void onStart() {
        if (this.f14823c != null) {
            this.f14823c.start();
        }
    }

    public void onStop() {
        if (this.f14823c != null) {
            this.f14823c.stop();
        }
    }
}
