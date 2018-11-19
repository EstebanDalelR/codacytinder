package com.bumptech.glide.request.animation;

import android.view.View;
import com.bumptech.glide.request.animation.GlideAnimation.ViewAdapter;

public class ViewPropertyAnimation<R> implements GlideAnimation<R> {
    /* renamed from: a */
    private final Animator f9663a;

    public interface Animator {
        void animate(View view);
    }

    public boolean animate(R r, ViewAdapter viewAdapter) {
        if (viewAdapter.getView() != null) {
            this.f9663a.animate(viewAdapter.getView());
        }
        return null;
    }
}
