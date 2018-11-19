package com.bumptech.glide.request.animation;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.animation.GlideAnimation.ViewAdapter;

/* renamed from: com.bumptech.glide.request.animation.b */
public class C3119b<T extends Drawable> implements GlideAnimation<T> {
    /* renamed from: a */
    private final GlideAnimation<T> f9669a;
    /* renamed from: b */
    private final int f9670b;

    public /* synthetic */ boolean animate(Object obj, ViewAdapter viewAdapter) {
        return m12095a((Drawable) obj, viewAdapter);
    }

    public C3119b(GlideAnimation<T> glideAnimation, int i) {
        this.f9669a = glideAnimation;
        this.f9670b = i;
    }

    /* renamed from: a */
    public boolean m12095a(T t, ViewAdapter viewAdapter) {
        if (viewAdapter.getCurrentDrawable() != null) {
            Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{viewAdapter.getCurrentDrawable(), t});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.f9670b);
            viewAdapter.setDrawable(transitionDrawable);
            return true;
        }
        this.f9669a.animate(t, viewAdapter);
        return false;
    }
}
