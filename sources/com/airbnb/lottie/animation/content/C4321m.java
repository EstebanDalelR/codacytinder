package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C4077a;

/* renamed from: com.airbnb.lottie.animation.content.m */
public class C4321m extends C4049a {
    /* renamed from: b */
    private final String f14161b;
    /* renamed from: c */
    private final BaseKeyframeAnimation<Integer, Integer> f14162c;

    public C4321m(C0792d c0792d, C4077a c4077a, ShapeStroke shapeStroke) {
        super(c0792d, c4077a, shapeStroke.m11535g().toPaintCap(), shapeStroke.m11536h().toPaintJoin(), shapeStroke.m11531c(), shapeStroke.m11532d(), shapeStroke.m11533e(), shapeStroke.m11534f());
        this.f14161b = shapeStroke.m11529a();
        this.f14162c = shapeStroke.m11530b().createAnimation();
        this.f14162c.mo1165a((AnimationListener) this);
        c4077a.m15914a(this.f14162c);
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        this.a.setColor(((Integer) this.f14162c.mo1163b()).intValue());
        super.draw(canvas, matrix, i);
    }

    public String getName() {
        return this.f14161b;
    }
}
