package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.annotation.Nullable;
import android.support.v4.util.C0550f;
import com.airbnb.lottie.C0785b;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C0834b;
import com.airbnb.lottie.model.content.C2987c;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4077a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.e */
public class C4053e implements DrawingContent, AnimationListener {
    /* renamed from: a */
    private final String f12859a;
    /* renamed from: b */
    private final C0550f<LinearGradient> f12860b = new C0550f();
    /* renamed from: c */
    private final C0550f<RadialGradient> f12861c = new C0550f();
    /* renamed from: d */
    private final Matrix f12862d = new Matrix();
    /* renamed from: e */
    private final Path f12863e = new Path();
    /* renamed from: f */
    private final Paint f12864f = new Paint(1);
    /* renamed from: g */
    private final RectF f12865g = new RectF();
    /* renamed from: h */
    private final List<C2965h> f12866h = new ArrayList();
    /* renamed from: i */
    private final GradientType f12867i;
    /* renamed from: j */
    private final BaseKeyframeAnimation<C0834b, C0834b> f12868j;
    /* renamed from: k */
    private final BaseKeyframeAnimation<Integer, Integer> f12869k;
    /* renamed from: l */
    private final BaseKeyframeAnimation<PointF, PointF> f12870l;
    /* renamed from: m */
    private final BaseKeyframeAnimation<PointF, PointF> f12871m;
    /* renamed from: n */
    private final C0792d f12872n;
    /* renamed from: o */
    private final int f12873o;

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
    }

    public C4053e(C0792d c0792d, C4077a c4077a, C2987c c2987c) {
        this.f12859a = c2987c.m11545a();
        this.f12872n = c0792d;
        this.f12867i = c2987c.m11546b();
        this.f12863e.setFillType(c2987c.m11547c());
        this.f12873o = (int) (c0792d.m2861n().m2801c() / 32);
        this.f12868j = c2987c.m11548d().createAnimation();
        this.f12868j.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f12868j);
        this.f12869k = c2987c.m11549e().createAnimation();
        this.f12869k.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f12869k);
        this.f12870l = c2987c.m11550f().createAnimation();
        this.f12870l.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f12870l);
        this.f12871m = c2987c.m11551g().createAnimation();
        this.f12871m.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f12871m);
    }

    public void onValueChanged() {
        this.f12872n.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (list = null; list < list2.size(); list++) {
            Content content = (Content) list2.get(list);
            if (content instanceof C2965h) {
                this.f12866h.add((C2965h) content);
            }
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader a;
        C0785b.m2775a("GradientFillContent#draw");
        this.f12863e.reset();
        for (int i2 = 0; i2 < this.f12866h.size(); i2++) {
            this.f12863e.addPath(((C2965h) this.f12866h.get(i2)).mo3174c(), matrix);
        }
        this.f12863e.computeBounds(this.f12865g, false);
        if (this.f12867i == GradientType.Linear) {
            a = m15858a();
        } else {
            a = m15859b();
        }
        this.f12862d.set(matrix);
        a.setLocalMatrix(this.f12862d);
        this.f12864f.setShader(a);
        this.f12864f.setAlpha((int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f12869k.mo1163b()).intValue())) / 100.0f) * 1132396544));
        canvas.drawPath(this.f12863e, this.f12864f);
        C0785b.m2776b("GradientFillContent#draw");
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        this.f12863e.reset();
        for (int i = 0; i < this.f12866h.size(); i++) {
            this.f12863e.addPath(((C2965h) this.f12866h.get(i)).mo3174c(), matrix);
        }
        this.f12863e.computeBounds(rectF, false);
        rectF.set(rectF.left - 1065353216, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.f12859a;
    }

    /* renamed from: a */
    private LinearGradient m15858a() {
        long c = (long) m15860c();
        LinearGradient linearGradient = (LinearGradient) this.f12860b.m2025a(c);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f12870l.mo1163b();
        PointF pointF2 = (PointF) this.f12871m.mo1163b();
        C0834b c0834b = (C0834b) this.f12868j.mo1163b();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, c0834b.m2906b(), c0834b.m2905a(), TileMode.CLAMP);
        this.f12860b.m2032b(c, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: b */
    private RadialGradient m15859b() {
        long c = (long) m15860c();
        RadialGradient radialGradient = (RadialGradient) this.f12861c.m2025a(c);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f12870l.mo1163b();
        PointF pointF2 = (PointF) this.f12871m.mo1163b();
        C0834b c0834b = (C0834b) this.f12868j.mo1163b();
        int[] b = c0834b.m2906b();
        float[] a = c0834b.m2905a();
        float f = pointF.x;
        float f2 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2)), b, a, TileMode.CLAMP);
        this.f12861c.m2032b(c, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: c */
    private int m15860c() {
        int round = Math.round(this.f12870l.m2724c() * ((float) this.f12873o));
        int round2 = Math.round(this.f12871m.m2724c() * ((float) this.f12873o));
        int round3 = Math.round(this.f12868j.m2724c() * ((float) this.f12873o));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = (i * 31) * round2;
        }
        return round3 != 0 ? (i * 31) * round3 : i;
    }
}
