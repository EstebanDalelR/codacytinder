package com.bumptech.glide.request.animation;

import com.bumptech.glide.request.animation.C3122d.C1069a;

/* renamed from: com.bumptech.glide.request.animation.e */
public class C3123e<R> implements GlideAnimationFactory<R> {
    /* renamed from: a */
    private final C1069a f9674a;
    /* renamed from: b */
    private GlideAnimation<R> f9675b;

    C3123e(C1069a c1069a) {
        this.f9674a = c1069a;
    }

    public GlideAnimation<R> build(boolean z, boolean z2) {
        if (!z) {
            if (z2) {
                if (!this.f9675b) {
                    this.f9675b = new C3122d(this.f9674a);
                }
                return this.f9675b;
            }
        }
        return C3121c.m12097b();
    }
}
