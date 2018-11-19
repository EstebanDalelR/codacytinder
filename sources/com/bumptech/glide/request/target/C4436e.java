package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.animation.GlideAnimation.ViewAdapter;

/* renamed from: com.bumptech.glide.request.target.e */
public abstract class C4436e<Z> extends C4331i<ImageView, Z> implements ViewAdapter {
    /* renamed from: a */
    protected abstract void mo3962a(Z z);

    public C4436e(ImageView imageView) {
        super(imageView);
    }

    public Drawable getCurrentDrawable() {
        return ((ImageView) this.a).getDrawable();
    }

    public void setDrawable(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void onLoadStarted(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void onLoadFailed(Exception exception, Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void onLoadCleared(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void onResourceReady(Z z, GlideAnimation<? super Z> glideAnimation) {
        if (glideAnimation == null || glideAnimation.animate(z, this) == null) {
            mo3962a(z);
        }
    }
}
