package com.bumptech.glide.request.animation;

import android.view.animation.Animation;
import com.bumptech.glide.request.animation.GlideAnimation.ViewAdapter;

/* renamed from: com.bumptech.glide.request.animation.d */
public class C3122d<R> implements GlideAnimation<R> {
    /* renamed from: a */
    private final C1069a f9673a;

    /* renamed from: com.bumptech.glide.request.animation.d$a */
    interface C1069a {
        /* renamed from: a */
        Animation mo1351a();
    }

    C3122d(C1069a c1069a) {
        this.f9673a = c1069a;
    }

    public boolean animate(R r, ViewAdapter viewAdapter) {
        r = viewAdapter.getView();
        if (r != null) {
            r.clearAnimation();
            r.startAnimation(this.f9673a.mo1351a());
        }
        return null;
    }
}
