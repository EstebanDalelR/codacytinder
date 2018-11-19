package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0785b;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4070d;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4077a;
import com.airbnb.lottie.p017b.C0784f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.a */
public abstract class C4049a implements DrawingContent, AnimationListener {
    /* renamed from: a */
    final Paint f12825a = new Paint(1);
    /* renamed from: b */
    private final PathMeasure f12826b = new PathMeasure();
    /* renamed from: c */
    private final Path f12827c = new Path();
    /* renamed from: d */
    private final Path f12828d = new Path();
    /* renamed from: e */
    private final RectF f12829e = new RectF();
    /* renamed from: f */
    private final C0792d f12830f;
    /* renamed from: g */
    private final List<C0770a> f12831g = new ArrayList();
    /* renamed from: h */
    private final float[] f12832h;
    /* renamed from: i */
    private final BaseKeyframeAnimation<?, Float> f12833i;
    /* renamed from: j */
    private final BaseKeyframeAnimation<?, Integer> f12834j;
    /* renamed from: k */
    private final List<BaseKeyframeAnimation<?, Float>> f12835k;
    @Nullable
    /* renamed from: l */
    private final BaseKeyframeAnimation<?, Float> f12836l;

    /* renamed from: com.airbnb.lottie.animation.content.a$a */
    private static final class C0770a {
        /* renamed from: a */
        private final List<C2965h> f2097a;
        @Nullable
        /* renamed from: b */
        private final C2966n f2098b;

        private C0770a(@Nullable C2966n c2966n) {
            this.f2097a = new ArrayList();
            this.f2098b = c2966n;
        }
    }

    C4049a(C0792d c0792d, C4077a c4077a, Cap cap, Join join, C4070d c4070d, C4068b c4068b, List<C4068b> list, C4068b c4068b2) {
        Enum enumR;
        this.f12830f = c0792d;
        this.f12825a.setStyle(Style.STROKE);
        this.f12825a.setStrokeCap(cap);
        this.f12825a.setStrokeJoin(join);
        this.f12834j = c4070d.createAnimation();
        this.f12833i = c4068b.createAnimation();
        if (c4068b2 == null) {
            this.f12836l = null;
        } else {
            this.f12836l = c4068b2.createAnimation();
        }
        this.f12835k = new ArrayList(list.size());
        this.f12832h = new float[list.size()];
        for (enumR = null; enumR < list.size(); enumR++) {
            this.f12835k.add(((C4068b) list.get(enumR)).createAnimation());
        }
        c4077a.m15914a(this.f12834j);
        c4077a.m15914a(this.f12833i);
        for (enumR = null; enumR < this.f12835k.size(); enumR++) {
            c4077a.m15914a((BaseKeyframeAnimation) this.f12835k.get(enumR));
        }
        if (this.f12836l != null) {
            c4077a.m15914a(this.f12836l);
        }
        this.f12834j.mo1165a((AnimationListener) this);
        this.f12833i.mo1165a((AnimationListener) this);
        for (c0792d = null; c0792d < list.size(); c0792d++) {
            ((BaseKeyframeAnimation) this.f12835k.get(c0792d)).mo1165a((AnimationListener) this);
        }
        if (this.f12836l != null) {
            this.f12836l.mo1165a((AnimationListener) this);
        }
    }

    public void onValueChanged() {
        this.f12830f.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        C2966n c2966n = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = (Content) list.get(size);
            if (content instanceof C2966n) {
                C2966n c2966n2 = (C2966n) content;
                if (c2966n2.m11474a() == Type.Individually) {
                    c2966n = c2966n2;
                }
            }
        }
        if (c2966n != null) {
            c2966n.m11475a(this);
        }
        Object obj = null;
        for (list = list2.size() - 1; list >= null; list--) {
            content = (Content) list2.get(list);
            if (content instanceof C2966n) {
                C2966n c2966n3 = (C2966n) content;
                if (c2966n3.m11474a() == Type.Individually) {
                    if (obj != null) {
                        this.f12831g.add(obj);
                    }
                    obj = new C0770a(c2966n3);
                    c2966n3.m11475a(this);
                }
            }
            if (content instanceof C2965h) {
                if (obj == null) {
                    obj = new C0770a(c2966n);
                }
                obj.f2097a.add((C2965h) content);
            }
        }
        if (obj != null) {
            this.f12831g.add(obj);
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        C0785b.m2775a("StrokeContent#draw");
        this.f12825a.setAlpha((int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f12834j.mo1163b()).intValue())) / 1120403456) * 1132396544));
        this.f12825a.setStrokeWidth(((Float) this.f12833i.mo1163b()).floatValue() * C0784f.m2768a(matrix));
        if (this.f12825a.getStrokeWidth() <= 0) {
            C0785b.m2776b("StrokeContent#draw");
            return;
        }
        m15850a(matrix);
        for (i = 0; i < this.f12831g.size(); i++) {
            C0770a c0770a = (C0770a) this.f12831g.get(i);
            if (c0770a.f2098b != null) {
                m15849a(canvas, c0770a, matrix);
            } else {
                C0785b.m2775a("StrokeContent#buildPath");
                this.f12827c.reset();
                for (int size = c0770a.f2097a.size() - 1; size >= 0; size--) {
                    this.f12827c.addPath(((C2965h) c0770a.f2097a.get(size)).mo3174c(), matrix);
                }
                C0785b.m2776b("StrokeContent#buildPath");
                C0785b.m2775a("StrokeContent#drawPath");
                canvas.drawPath(this.f12827c, this.f12825a);
                C0785b.m2776b("StrokeContent#drawPath");
            }
        }
        C0785b.m2776b("StrokeContent#draw");
    }

    /* renamed from: a */
    private void m15849a(Canvas canvas, C0770a c0770a, Matrix matrix) {
        C0785b.m2775a("StrokeContent#applyTrimPath");
        if (c0770a.f2098b == null) {
            C0785b.m2776b("StrokeContent#applyTrimPath");
            return;
        }
        this.f12827c.reset();
        for (int size = c0770a.f2097a.size() - 1; size >= 0; size--) {
            this.f12827c.addPath(((C2965h) c0770a.f2097a.get(size)).mo3174c(), matrix);
        }
        this.f12826b.setPath(this.f12827c, false);
        float length = this.f12826b.getLength();
        while (this.f12826b.nextContour()) {
            length += this.f12826b.getLength();
        }
        float floatValue = (((Float) c0770a.f2098b.m11478d().mo1163b()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) c0770a.f2098b.m11476b().mo1163b()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) c0770a.f2098b.m11477c().mo1163b()).floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = c0770a.f2097a.size() - 1; size2 >= 0; size2--) {
            float f2;
            this.f12828d.set(((C2965h) c0770a.f2097a.get(size2)).mo3174c());
            this.f12828d.transform(matrix);
            this.f12826b.setPath(this.f12828d, false);
            float length2 = this.f12826b.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                f2 = floatValue3 - length;
                if (f2 < f + length2 && f < f2) {
                    C0784f.m2771a(this.f12828d, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f2 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f12828d, this.f12825a);
                    f += length2;
                }
            }
            f2 = f + length2;
            if (f2 >= floatValue2) {
                if (f <= floatValue3) {
                    if (f2 > floatValue3 || floatValue2 >= f) {
                        float f4 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                        if (floatValue3 <= f2) {
                            f3 = (floatValue3 - f) / length2;
                        }
                        C0784f.m2771a(this.f12828d, f4, f3, 0.0f);
                        canvas.drawPath(this.f12828d, this.f12825a);
                    } else {
                        canvas.drawPath(this.f12828d, this.f12825a);
                    }
                }
            }
            f += length2;
        }
        C0785b.m2776b("StrokeContent#applyTrimPath");
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        C0785b.m2775a("StrokeContent#getBounds");
        this.f12827c.reset();
        for (int i = 0; i < this.f12831g.size(); i++) {
            C0770a c0770a = (C0770a) this.f12831g.get(i);
            for (int i2 = 0; i2 < c0770a.f2097a.size(); i2++) {
                this.f12827c.addPath(((C2965h) c0770a.f2097a.get(i2)).mo3174c(), matrix);
            }
        }
        this.f12827c.computeBounds(this.f12829e, false);
        matrix = ((Float) this.f12833i.mo1163b()).floatValue() / 2.0f;
        this.f12829e.set(this.f12829e.left - matrix, this.f12829e.top - matrix, this.f12829e.right + matrix, this.f12829e.bottom + matrix);
        rectF.set(this.f12829e);
        rectF.set(rectF.left - 1065353216, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C0785b.m2776b("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m15850a(Matrix matrix) {
        C0785b.m2775a("StrokeContent#applyDashPattern");
        if (this.f12835k.isEmpty()) {
            C0785b.m2776b("StrokeContent#applyDashPattern");
            return;
        }
        matrix = C0784f.m2768a(matrix);
        for (int i = 0; i < this.f12835k.size(); i++) {
            this.f12832h[i] = ((Float) ((BaseKeyframeAnimation) this.f12835k.get(i)).mo1163b()).floatValue();
            if (i % 2 == 0) {
                if (this.f12832h[i] < 1.0f) {
                    this.f12832h[i] = 1.0f;
                }
            } else if (this.f12832h[i] < 0.1f) {
                this.f12832h[i] = 0.1f;
            }
            float[] fArr = this.f12832h;
            fArr[i] = fArr[i] * matrix;
        }
        this.f12825a.setPathEffect(new DashPathEffect(this.f12832h, this.f12836l == null ? null : ((Float) this.f12836l.mo1163b()).floatValue()));
        C0785b.m2776b("StrokeContent#applyDashPattern");
    }
}
