package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v4.util.C0550f;
import com.airbnb.lottie.C0785b;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.b */
public class C4322b extends C4077a {
    @Nullable
    /* renamed from: e */
    private final BaseKeyframeAnimation<Float, Float> f14163e;
    /* renamed from: f */
    private final List<C4077a> f14164f = new ArrayList();
    /* renamed from: g */
    private final RectF f14165g = new RectF();
    /* renamed from: h */
    private final RectF f14166h = new RectF();

    public C4322b(C0792d c0792d, Layer layer, List<Layer> list, C0788c c0788c) {
        super(c0792d, layer);
        layer = layer.m2957u();
        if (layer != null) {
            this.f14163e = layer.createAnimation();
            m15914a((BaseKeyframeAnimation) this.f14163e);
            this.f14163e.mo1165a((AnimationListener) this);
        } else {
            this.f14163e = null;
        }
        layer = new C0550f(c0788c.m2807i().size());
        int size = list.size() - 1;
        C4077a c4077a = null;
        while (true) {
            int i = 0;
            if (size >= 0) {
                Layer layer2 = (Layer) list.get(size);
                C4077a a = C4077a.m15900a(layer2, c0792d, c0788c);
                if (a != null) {
                    layer.m2032b(a.m15911a().m2941e(), a);
                    if (c4077a == null) {
                        this.f14164f.add(0, a);
                        switch (layer2.m2948l()) {
                            case Add:
                            case Invert:
                                c4077a = a;
                                break;
                            default:
                                break;
                        }
                    }
                    c4077a.m15915a(a);
                    c4077a = null;
                }
                size--;
            } else {
                while (i < layer.m2029b()) {
                    C4077a c4077a2 = (C4077a) layer.m2025a(layer.m2030b(i));
                    C4077a c4077a3 = (C4077a) layer.m2025a(c4077a2.m15911a().m2949m());
                    if (c4077a3 != null) {
                        c4077a2.m15916b(c4077a3);
                    }
                    i++;
                }
                return;
            }
        }
    }

    /* renamed from: a */
    void mo3687a(Canvas canvas, Matrix matrix, int i) {
        C0785b.m2775a("CompositionLayer#draw");
        canvas.save();
        this.f14166h.set(0.0f, 0.0f, (float) this.c.m2944h(), (float) this.c.m2945i());
        matrix.mapRect(this.f14166h);
        for (int size = this.f14164f.size() - 1; size >= 0; size--) {
            if (!this.f14166h.isEmpty() ? canvas.clipRect(this.f14166h) : true) {
                ((C4077a) this.f14164f.get(size)).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        C0785b.m2776b("CompositionLayer#draw");
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        super.getBounds(rectF, matrix);
        this.f14165g.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (matrix = this.f14164f.size() - 1; matrix >= null; matrix--) {
            ((C4077a) this.f14164f.get(matrix)).getBounds(this.f14165g, this.a);
            if (rectF.isEmpty()) {
                rectF.set(this.f14165g);
            } else {
                rectF.set(Math.min(rectF.left, this.f14165g.left), Math.min(rectF.top, this.f14165g.top), Math.max(rectF.right, this.f14165g.right), Math.max(rectF.bottom, this.f14165g.bottom));
            }
        }
    }

    /* renamed from: a */
    public void mo3686a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.mo3686a(f);
        if (this.f14163e != null) {
            f = ((float) ((long) (((Float) this.f14163e.mo1163b()).floatValue() * 1000.0f))) / ((float) this.b.m2861n().m2801c());
        }
        if (this.c.m2938b() != 0.0f) {
            f /= this.c.m2938b();
        }
        f -= this.c.m2939c();
        for (int size = this.f14164f.size() - 1; size >= 0; size--) {
            ((C4077a) this.f14164f.get(size)).mo3686a(f);
        }
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        for (int i = 0; i < this.f14164f.size(); i++) {
            C4077a c4077a = (C4077a) this.f14164f.get(i);
            String f = c4077a.m15911a().m2942f();
            if (str == null) {
                c4077a.addColorFilter(null, null, colorFilter);
            } else if (f.equals(str)) {
                c4077a.addColorFilter(str, str2, colorFilter);
            }
        }
    }
}
