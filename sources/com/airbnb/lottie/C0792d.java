package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.model.layer.C4322b;
import com.airbnb.lottie.model.layer.Layer.C0858a;
import com.airbnb.lottie.p016a.C0764a;
import com.airbnb.lottie.p016a.C0765b;
import com.airbnb.lottie.p017b.C0781c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.airbnb.lottie.d */
public class C0792d extends Drawable implements Callback {
    /* renamed from: c */
    private static final String f2157c = "d";
    @Nullable
    /* renamed from: a */
    C0766a f2158a;
    @Nullable
    /* renamed from: b */
    C0799h f2159b;
    /* renamed from: d */
    private boolean f2160d;
    /* renamed from: e */
    private final Matrix f2161e = new Matrix();
    /* renamed from: f */
    private C0788c f2162f;
    /* renamed from: g */
    private final C0781c f2163g = new C0781c();
    /* renamed from: h */
    private float f2164h = 1.0f;
    /* renamed from: i */
    private float f2165i = 1.0f;
    /* renamed from: j */
    private final Set<C0790a> f2166j = new HashSet();
    /* renamed from: k */
    private final ArrayList<C0791b> f2167k = new ArrayList();
    @Nullable
    /* renamed from: l */
    private C0765b f2168l;
    @Nullable
    /* renamed from: m */
    private String f2169m;
    @Nullable
    /* renamed from: n */
    private ImageAssetDelegate f2170n;
    @Nullable
    /* renamed from: o */
    private C0764a f2171o;
    /* renamed from: p */
    private boolean f2172p;
    @Nullable
    /* renamed from: q */
    private C4322b f2173q;
    /* renamed from: r */
    private int f2174r = 255;
    /* renamed from: s */
    private boolean f2175s;

    /* renamed from: com.airbnb.lottie.d$1 */
    class C07891 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C0792d f2153a;

        C07891(C0792d c0792d) {
            this.f2153a = c0792d;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f2153a.f2173q != null) {
                this.f2153a.f2173q.mo3686a(this.f2153a.f2163g.m2753c());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.d$a */
    private static class C0790a {
        /* renamed from: a */
        final String f2154a;
        @Nullable
        /* renamed from: b */
        final String f2155b;
        @Nullable
        /* renamed from: c */
        final ColorFilter f2156c;

        C0790a(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
            this.f2154a = str;
            this.f2155b = str2;
            this.f2156c = colorFilter;
        }

        public int hashCode() {
            int hashCode = this.f2154a != null ? 527 * this.f2154a.hashCode() : 17;
            return this.f2155b != null ? (hashCode * 31) * this.f2155b.hashCode() : hashCode;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0790a)) {
                return false;
            }
            C0790a c0790a = (C0790a) obj;
            if (hashCode() != c0790a.hashCode() || this.f2156c != c0790a.f2156c) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: com.airbnb.lottie.d$b */
    private interface C0791b {
        /* renamed from: a */
        void mo1166a(C0788c c0788c);
    }

    public int getOpacity() {
        return -3;
    }

    public C0792d() {
        this.f2163g.setRepeatCount(0);
        this.f2163g.setInterpolator(new LinearInterpolator());
        this.f2163g.addUpdateListener(new C07891(this));
    }

    /* renamed from: a */
    public boolean m2838a() {
        return this.f2172p;
    }

    /* renamed from: a */
    public void m2837a(boolean z) {
        if (VERSION.SDK_INT < 19) {
            Log.w(f2157c, "Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f2172p = z;
        if (this.f2162f) {
            m2820p();
        }
    }

    /* renamed from: a */
    public void m2836a(@Nullable String str) {
        this.f2169m = str;
    }

    @Nullable
    /* renamed from: b */
    public String m2841b() {
        return this.f2169m;
    }

    /* renamed from: c */
    public void m2846c() {
        if (this.f2168l != null) {
            this.f2168l.m2697a();
        }
    }

    /* renamed from: a */
    public boolean m2839a(C0788c c0788c) {
        if (this.f2162f == c0788c) {
            return null;
        }
        m2822r();
        this.f2162f = c0788c;
        m2847c(this.f2164h);
        m2852e(this.f2165i);
        m2823s();
        m2820p();
        m2821q();
        Iterator it = new ArrayList(this.f2167k).iterator();
        while (it.hasNext()) {
            ((C0791b) it.next()).mo1166a(c0788c);
            it.remove();
        }
        this.f2167k.clear();
        c0788c.m2798a(this.f2175s);
        this.f2163g.m2751b();
        return true;
    }

    /* renamed from: b */
    public void m2845b(boolean z) {
        this.f2175s = z;
        if (this.f2162f != null) {
            this.f2162f.m2798a(z);
        }
    }

    @Nullable
    /* renamed from: d */
    public PerformanceTracker m2849d() {
        return this.f2162f != null ? this.f2162f.m2795a() : null;
    }

    /* renamed from: p */
    private void m2820p() {
        this.f2173q = new C4322b(this, C0858a.m2934a(this.f2162f), this.f2162f.m2807i(), this.f2162f);
    }

    /* renamed from: q */
    private void m2821q() {
        if (this.f2173q != null) {
            for (C0790a c0790a : this.f2166j) {
                this.f2173q.addColorFilter(c0790a.f2154a, c0790a.f2155b, c0790a.f2156c);
            }
        }
    }

    /* renamed from: r */
    private void m2822r() {
        m2846c();
        this.f2173q = null;
        this.f2168l = null;
        invalidateSelf();
    }

    public void invalidateSelf() {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.f2174r = i;
    }

    public int getAlpha() {
        return this.f2174r;
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Use addColorFilter instead.");
    }

    /* renamed from: a */
    public void m2832a(ColorFilter colorFilter) {
        m2817a(null, null, colorFilter);
    }

    /* renamed from: a */
    private void m2817a(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        C0790a c0790a = new C0790a(str, str2, colorFilter);
        if (colorFilter == null && this.f2166j.contains(c0790a)) {
            this.f2166j.remove(c0790a);
        } else {
            this.f2166j.add(new C0790a(str, str2, colorFilter));
        }
        if (this.f2173q != null) {
            this.f2173q.addColorFilter(str, str2, colorFilter);
        }
    }

    public void draw(@NonNull Canvas canvas) {
        C0785b.m2775a("Drawable#draw");
        if (this.f2173q != null) {
            float f = this.f2165i;
            float a = m2814a(canvas);
            if (f > a) {
                f = this.f2165i / a;
            } else {
                a = f;
                f = 1.0f;
            }
            if (f > 1.0f) {
                canvas.save();
                float width = ((float) this.f2162f.m2799b().width()) / 2.0f;
                float height = ((float) this.f2162f.m2799b().height()) / 2.0f;
                float f2 = width * a;
                float f3 = height * a;
                canvas.translate((m2860m() * width) - f2, (m2860m() * height) - f3);
                canvas.scale(f, f, f2, f3);
            }
            this.f2161e.reset();
            this.f2161e.preScale(a, a);
            this.f2173q.draw(canvas, this.f2161e, this.f2174r);
            C0785b.m2776b("Drawable#draw");
            if (f > 1.0f) {
                canvas.restore();
            }
        }
    }

    /* renamed from: e */
    void m2851e() {
        this.f2160d = true;
        this.f2163g.m2747a();
    }

    /* renamed from: c */
    public void m2848c(boolean z) {
        this.f2163g.setRepeatCount(z ? true : false);
    }

    /* renamed from: f */
    public boolean m2853f() {
        return this.f2163g.getRepeatCount() == -1;
    }

    /* renamed from: g */
    public boolean m2854g() {
        return this.f2163g.isRunning();
    }

    /* renamed from: h */
    public void m2855h() {
        m2819d(true);
    }

    /* renamed from: i */
    public void m2856i() {
        boolean z;
        if (this.f2163g.getAnimatedFraction() != this.f2163g.m2755d()) {
            if (!this.f2160d) {
                z = false;
                m2819d(z);
            }
        }
        z = true;
        m2819d(z);
    }

    /* renamed from: d */
    private void m2819d(final boolean z) {
        if (this.f2173q == null) {
            this.f2167k.add(new C0791b(this) {
                /* renamed from: b */
                final /* synthetic */ C0792d f9216b;

                /* renamed from: a */
                public void mo1166a(C0788c c0788c) {
                    this.f9216b.m2819d(z);
                }
            });
            return;
        }
        if (z) {
            this.f2163g.start();
        } else {
            this.f2163g.m2756e();
        }
    }

    /* renamed from: a */
    public void m2829a(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.f2163g.m2749a(f, f2);
        this.f2163g.setCurrentPlayTime(0);
        m2850d(f);
        m2819d((boolean) 0.0f);
    }

    /* renamed from: a */
    public void m2830a(final int i) {
        if (this.f2162f == null) {
            this.f2167k.add(new C0791b(this) {
                /* renamed from: b */
                final /* synthetic */ C0792d f9218b;

                /* renamed from: a */
                public void mo1166a(C0788c c0788c) {
                    this.f9218b.m2830a(i);
                }
            });
        } else {
            m2828a(((float) i) / this.f2162f.m2811m());
        }
    }

    /* renamed from: a */
    public void m2828a(float f) {
        this.f2163g.m2752b(f);
    }

    /* renamed from: b */
    public void m2843b(final int i) {
        if (this.f2162f == null) {
            this.f2167k.add(new C0791b(this) {
                /* renamed from: b */
                final /* synthetic */ C0792d f9220b;

                /* renamed from: a */
                public void mo1166a(C0788c c0788c) {
                    this.f9220b.m2843b(i);
                }
            });
        } else {
            m2842b(((float) i) / this.f2162f.m2811m());
        }
    }

    /* renamed from: b */
    public void m2842b(float f) {
        this.f2163g.m2754c(f);
    }

    /* renamed from: c */
    public void m2847c(float f) {
        this.f2164h = f;
        this.f2163g.m2750a(f < 0.0f);
        if (this.f2162f != null) {
            this.f2163g.setDuration((long) (((float) this.f2162f.m2801c()) / Math.abs(f)));
        }
    }

    /* renamed from: d */
    public void m2850d(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f2163g.m2748a(f);
        if (this.f2173q != null) {
            this.f2173q.mo3686a(f);
        }
    }

    /* renamed from: j */
    public float m2857j() {
        return this.f2163g.m2753c();
    }

    /* renamed from: e */
    public void m2852e(float f) {
        this.f2165i = f;
        m2823s();
    }

    /* renamed from: a */
    public void m2833a(ImageAssetDelegate imageAssetDelegate) {
        this.f2170n = imageAssetDelegate;
        if (this.f2168l != null) {
            this.f2168l.m2698a(imageAssetDelegate);
        }
    }

    /* renamed from: a */
    public void m2834a(C0766a c0766a) {
        this.f2158a = c0766a;
        if (this.f2171o != null) {
            this.f2171o.m2695a(c0766a);
        }
    }

    /* renamed from: a */
    public void m2835a(C0799h c0799h) {
        this.f2159b = c0799h;
    }

    @Nullable
    /* renamed from: k */
    public C0799h m2858k() {
        return this.f2159b;
    }

    /* renamed from: l */
    public boolean m2859l() {
        return this.f2159b == null && this.f2162f.m2808j().m2082b() > 0;
    }

    /* renamed from: m */
    public float m2860m() {
        return this.f2165i;
    }

    /* renamed from: n */
    public C0788c m2861n() {
        return this.f2162f;
    }

    /* renamed from: s */
    private void m2823s() {
        if (this.f2162f != null) {
            float m = m2860m();
            setBounds(0, 0, (int) (((float) this.f2162f.m2799b().width()) * m), (int) (((float) this.f2162f.m2799b().height()) * m));
        }
    }

    /* renamed from: o */
    public void m2862o() {
        this.f2167k.clear();
        this.f2163g.cancel();
    }

    /* renamed from: a */
    public void m2831a(AnimatorListener animatorListener) {
        this.f2163g.addListener(animatorListener);
    }

    /* renamed from: b */
    public void m2844b(AnimatorListener animatorListener) {
        this.f2163g.removeListener(animatorListener);
    }

    public int getIntrinsicWidth() {
        return this.f2162f == null ? -1 : (int) (((float) this.f2162f.m2799b().width()) * m2860m());
    }

    public int getIntrinsicHeight() {
        return this.f2162f == null ? -1 : (int) (((float) this.f2162f.m2799b().height()) * m2860m());
    }

    @Nullable
    /* renamed from: b */
    public Bitmap m2840b(String str) {
        C0765b t = m2824t();
        return t != null ? t.m2696a(str) : null;
    }

    /* renamed from: t */
    private C0765b m2824t() {
        if (getCallback() == null) {
            return null;
        }
        if (!(this.f2168l == null || this.f2168l.m2699a(m2826v()))) {
            this.f2168l.m2697a();
            this.f2168l = null;
        }
        if (this.f2168l == null) {
            this.f2168l = new C0765b(getCallback(), this.f2169m, this.f2170n, this.f2162f.m2810l());
        }
        return this.f2168l;
    }

    @Nullable
    /* renamed from: a */
    public Typeface m2827a(String str, String str2) {
        C0764a u = m2825u();
        return u != null ? u.m2694a(str, str2) : null;
    }

    /* renamed from: u */
    private C0764a m2825u() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f2171o == null) {
            this.f2171o = new C0764a(getCallback(), this.f2158a);
        }
        return this.f2171o;
    }

    @Nullable
    /* renamed from: v */
    private Context m2826v() {
        Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private float m2814a(@NonNull Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f2162f.m2799b().width()), ((float) canvas.getHeight()) / ((float) this.f2162f.m2799b().height()));
    }
}
