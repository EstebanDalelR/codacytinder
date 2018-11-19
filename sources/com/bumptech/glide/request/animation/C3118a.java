package com.bumptech.glide.request.animation;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bumptech.glide.request.animation.C3122d.C1069a;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: com.bumptech.glide.request.animation.a */
public class C3118a<T extends Drawable> implements GlideAnimationFactory<T> {
    /* renamed from: a */
    private final C3123e<T> f9665a;
    /* renamed from: b */
    private final int f9666b;
    /* renamed from: c */
    private C3119b<T> f9667c;
    /* renamed from: d */
    private C3119b<T> f9668d;

    /* renamed from: com.bumptech.glide.request.animation.a$a */
    private static class C3117a implements C1069a {
        /* renamed from: a */
        private final int f9664a;

        C3117a(int i) {
            this.f9664a = i;
        }

        /* renamed from: a */
        public Animation mo1351a() {
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.f9664a);
            return alphaAnimation;
        }
    }

    public C3118a() {
        this(MapboxConstants.ANIMATION_DURATION);
    }

    public C3118a(int i) {
        this(new C3123e(new C3117a(i)), i);
    }

    C3118a(C3123e<T> c3123e, int i) {
        this.f9665a = c3123e;
        this.f9666b = i;
    }

    public GlideAnimation<T> build(boolean z, boolean z2) {
        if (z) {
            return C3121c.m12097b();
        }
        if (z2) {
            return m12093a();
        }
        return m12094b();
    }

    /* renamed from: a */
    private GlideAnimation<T> m12093a() {
        if (this.f9667c == null) {
            this.f9667c = new C3119b(this.f9665a.build(false, true), this.f9666b);
        }
        return this.f9667c;
    }

    /* renamed from: b */
    private GlideAnimation<T> m12094b() {
        if (this.f9668d == null) {
            this.f9668d = new C3119b(this.f9665a.build(false, false), this.f9666b);
        }
        return this.f9668d;
    }
}
