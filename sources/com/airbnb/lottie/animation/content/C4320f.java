package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.annotation.Nullable;
import android.support.v4.util.C0550f;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C0834b;
import com.airbnb.lottie.model.content.C2988d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4077a;

/* renamed from: com.airbnb.lottie.animation.content.f */
public class C4320f extends C4049a {
    /* renamed from: b */
    private final String f14152b;
    /* renamed from: c */
    private final C0550f<LinearGradient> f14153c = new C0550f();
    /* renamed from: d */
    private final C0550f<RadialGradient> f14154d = new C0550f();
    /* renamed from: e */
    private final RectF f14155e = new RectF();
    /* renamed from: f */
    private final GradientType f14156f;
    /* renamed from: g */
    private final int f14157g;
    /* renamed from: h */
    private final BaseKeyframeAnimation<C0834b, C0834b> f14158h;
    /* renamed from: i */
    private final BaseKeyframeAnimation<PointF, PointF> f14159i;
    /* renamed from: j */
    private final BaseKeyframeAnimation<PointF, PointF> f14160j;

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
    }

    public C4320f(C0792d c0792d, C4077a c4077a, C2988d c2988d) {
        super(c0792d, c4077a, c2988d.m11559h().toPaintCap(), c2988d.m11560i().toPaintJoin(), c2988d.m11555d(), c2988d.m11558g(), c2988d.m11561j(), c2988d.m11562k());
        this.f14152b = c2988d.m11552a();
        this.f14156f = c2988d.m11553b();
        this.f14157g = (int) (c0792d.m2861n().m2801c() / 32);
        this.f14158h = c2988d.m11554c().createAnimation();
        this.f14158h.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f14158h);
        this.f14159i = c2988d.m11556e().createAnimation();
        this.f14159i.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f14159i);
        this.f14160j = c2988d.m11557f().createAnimation();
        this.f14160j.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f14160j);
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        getBounds(this.f14155e, matrix);
        if (this.f14156f == GradientType.Linear) {
            this.a.setShader(m17495a());
        } else {
            this.a.setShader(m17496b());
        }
        super.draw(canvas, matrix, i);
    }

    public String getName() {
        return this.f14152b;
    }

    /* renamed from: a */
    private LinearGradient m17495a() {
        long c = (long) m17497c();
        LinearGradient linearGradient = (LinearGradient) this.f14153c.m2025a(c);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f14159i.mo1163b();
        PointF pointF2 = (PointF) this.f14160j.mo1163b();
        C0834b c0834b = (C0834b) this.f14158h.mo1163b();
        LinearGradient linearGradient2 = new LinearGradient((float) ((int) ((this.f14155e.left + (this.f14155e.width() / 2.0f)) + pointF.x)), (float) ((int) ((this.f14155e.top + (this.f14155e.height() / 2.0f)) + pointF.y)), (float) ((int) ((this.f14155e.left + (this.f14155e.width() / 2.0f)) + pointF2.x)), (float) ((int) ((this.f14155e.top + (this.f14155e.height() / 2.0f)) + pointF2.y)), c0834b.m2906b(), c0834b.m2905a(), TileMode.CLAMP);
        this.f14153c.m2032b(c, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: b */
    private RadialGradient m17496b() {
        long c = (long) m17497c();
        RadialGradient radialGradient = (RadialGradient) this.f14154d.m2025a(c);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f14159i.mo1163b();
        PointF pointF2 = (PointF) this.f14160j.mo1163b();
        C0834b c0834b = (C0834b) this.f14158h.mo1163b();
        int[] b = c0834b.m2906b();
        float[] a = c0834b.m2905a();
        int width = (int) ((this.f14155e.left + (this.f14155e.width() / 2.0f)) + pointF.x);
        int height = (int) ((this.f14155e.top + (this.f14155e.height() / 2.0f)) + pointF.y);
        float f = (float) width;
        float f2 = (float) height;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (((int) ((this.f14155e.left + (this.f14155e.width() / 2.0f)) + pointF2.x)) - width), (double) (((int) ((this.f14155e.top + (this.f14155e.height() / 2.0f)) + pointF2.y)) - height)), b, a, TileMode.CLAMP);
        this.f14154d.m2032b(c, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: c */
    private int m17497c() {
        int round = Math.round(this.f14159i.m2724c() * ((float) this.f14157g));
        int round2 = Math.round(this.f14160j.m2724c() * ((float) this.f14157g));
        int round3 = Math.round(this.f14158h.m2724c() * ((float) this.f14157g));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = (i * 31) * round2;
        }
        return round3 != 0 ? (i * 31) * round3 : i;
    }
}
