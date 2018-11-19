package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C0776o;
import com.airbnb.lottie.model.content.C2990f;
import com.airbnb.lottie.model.layer.C4077a;
import com.airbnb.lottie.p017b.C0783e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.animation.content.k */
public class C4057k implements DrawingContent, GreedyContent, C2965h, AnimationListener {
    /* renamed from: a */
    private final Matrix f12902a = new Matrix();
    /* renamed from: b */
    private final Path f12903b = new Path();
    /* renamed from: c */
    private final C0792d f12904c;
    /* renamed from: d */
    private final C4077a f12905d;
    /* renamed from: e */
    private final String f12906e;
    /* renamed from: f */
    private final BaseKeyframeAnimation<Float, Float> f12907f;
    /* renamed from: g */
    private final BaseKeyframeAnimation<Float, Float> f12908g;
    /* renamed from: h */
    private final C0776o f12909h;
    /* renamed from: i */
    private C4050b f12910i;

    public C4057k(C0792d c0792d, C4077a c4077a, C2990f c2990f) {
        this.f12904c = c0792d;
        this.f12905d = c4077a;
        this.f12906e = c2990f.m11567a();
        this.f12907f = c2990f.m11568b().createAnimation();
        c4077a.m15914a(this.f12907f);
        this.f12907f.mo1165a((AnimationListener) this);
        this.f12908g = c2990f.m11569c().createAnimation();
        c4077a.m15914a(this.f12908g);
        this.f12908g.mo1165a((AnimationListener) this);
        this.f12909h = c2990f.m11570d().m11515h();
        this.f12909h.m2732a(c4077a);
        this.f12909h.m2731a((AnimationListener) this);
    }

    public void absorbContent(ListIterator<Content> listIterator) {
        if (this.f12910i == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            List arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.f12910i = new C4050b(this.f12904c, this.f12905d, "Repeater", arrayList, null);
        }
    }

    public String getName() {
        return this.f12906e;
    }

    public void setContents(List<Content> list, List<Content> list2) {
        this.f12910i.setContents(list, list2);
    }

    /* renamed from: c */
    public Path mo3174c() {
        Path c = this.f12910i.mo3174c();
        this.f12903b.reset();
        float floatValue = ((Float) this.f12907f.mo1163b()).floatValue();
        float floatValue2 = ((Float) this.f12908g.mo1163b()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f12902a.set(this.f12909h.m2729a(((float) i) + floatValue2));
            this.f12903b.addPath(c, this.f12902a);
        }
        return this.f12903b;
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f12907f.mo1163b()).floatValue();
        float floatValue2 = ((Float) this.f12908g.mo1163b()).floatValue();
        float floatValue3 = ((Float) this.f12909h.m2733b().mo1163b()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f12909h.m2734c().mo1163b()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f12902a.set(matrix);
            float f = (float) i2;
            this.f12902a.preConcat(this.f12909h.m2729a(f + floatValue2));
            this.f12910i.draw(canvas, this.f12902a, (int) (((float) i) * C0783e.m2759a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        this.f12910i.getBounds(rectF, matrix);
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        this.f12910i.addColorFilter(str, str2, colorFilter);
    }

    public void onValueChanged() {
        this.f12904c.invalidateSelf();
    }
}
