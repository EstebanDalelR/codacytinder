package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C2989e;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4077a;
import com.airbnb.lottie.p017b.C0784f;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.j */
public class C4056j implements C2965h, AnimationListener {
    /* renamed from: a */
    private final Path f12893a = new Path();
    /* renamed from: b */
    private final RectF f12894b = new RectF();
    /* renamed from: c */
    private final String f12895c;
    /* renamed from: d */
    private final C0792d f12896d;
    /* renamed from: e */
    private final BaseKeyframeAnimation<?, PointF> f12897e;
    /* renamed from: f */
    private final BaseKeyframeAnimation<?, PointF> f12898f;
    /* renamed from: g */
    private final BaseKeyframeAnimation<?, Float> f12899g;
    @Nullable
    /* renamed from: h */
    private C2966n f12900h;
    /* renamed from: i */
    private boolean f12901i;

    public C4056j(C0792d c0792d, C4077a c4077a, C2989e c2989e) {
        this.f12895c = c2989e.m11563a();
        this.f12896d = c0792d;
        this.f12897e = c2989e.m11566d().createAnimation();
        this.f12898f = c2989e.m11565c().createAnimation();
        this.f12899g = c2989e.m11564b().createAnimation();
        c4077a.m15914a(this.f12897e);
        c4077a.m15914a(this.f12898f);
        c4077a.m15914a(this.f12899g);
        this.f12897e.mo1165a((AnimationListener) this);
        this.f12898f.mo1165a((AnimationListener) this);
        this.f12899g.mo1165a((AnimationListener) this);
    }

    public String getName() {
        return this.f12895c;
    }

    public void onValueChanged() {
        m15868a();
    }

    /* renamed from: a */
    private void m15868a() {
        this.f12901i = false;
        this.f12896d.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            Content content = (Content) list.get(list2);
            if (content instanceof C2966n) {
                C2966n c2966n = (C2966n) content;
                if (c2966n.m11474a() == Type.Simultaneously) {
                    this.f12900h = c2966n;
                    this.f12900h.m11475a(this);
                }
            }
        }
    }

    /* renamed from: c */
    public Path mo3174c() {
        if (this.f12901i) {
            return this.f12893a;
        }
        this.f12893a.reset();
        PointF pointF = (PointF) this.f12898f.mo1163b();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float floatValue = this.f12899g == null ? 0.0f : ((Float) this.f12899g.mo1163b()).floatValue();
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF pointF2 = (PointF) this.f12897e.mo1163b();
        this.f12893a.moveTo(pointF2.x + f, (pointF2.y - f2) + floatValue);
        this.f12893a.lineTo(pointF2.x + f, (pointF2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            float f3 = floatValue * 2.0f;
            this.f12894b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.f12893a.arcTo(this.f12894b, 0.0f, 90.0f, false);
        }
        this.f12893a.lineTo((pointF2.x - f) + floatValue, pointF2.y + f2);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.f12894b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.f12893a.arcTo(this.f12894b, 90.0f, 90.0f, false);
        }
        this.f12893a.lineTo(pointF2.x - f, (pointF2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.f12894b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.f12893a.arcTo(this.f12894b, 180.0f, 90.0f, false);
        }
        this.f12893a.lineTo((pointF2.x + f) - floatValue, pointF2.y - f2);
        if (floatValue > 0.0f) {
            floatValue *= 2.0f;
            this.f12894b.set((pointF2.x + f) - floatValue, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + floatValue);
            this.f12893a.arcTo(this.f12894b, 270.0f, 90.0f, false);
        }
        this.f12893a.close();
        C0784f.m2772a(this.f12893a, this.f12900h);
        this.f12901i = true;
        return this.f12893a;
    }
}
