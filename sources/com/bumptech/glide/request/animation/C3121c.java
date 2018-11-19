package com.bumptech.glide.request.animation;

import com.bumptech.glide.request.animation.GlideAnimation.ViewAdapter;

/* renamed from: com.bumptech.glide.request.animation.c */
public class C3121c<R> implements GlideAnimation<R> {
    /* renamed from: a */
    private static final C3121c<?> f9671a = new C3121c();
    /* renamed from: b */
    private static final GlideAnimationFactory<?> f9672b = new C3120a();

    /* renamed from: com.bumptech.glide.request.animation.c$a */
    public static class C3120a<R> implements GlideAnimationFactory<R> {
        public GlideAnimation<R> build(boolean z, boolean z2) {
            return C3121c.f9671a;
        }
    }

    public boolean animate(Object obj, ViewAdapter viewAdapter) {
        return false;
    }

    /* renamed from: a */
    public static <R> GlideAnimationFactory<R> m12096a() {
        return f9672b;
    }

    /* renamed from: b */
    public static <R> GlideAnimation<R> m12097b() {
        return f9671a;
    }
}
