package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.C0799h;
import com.airbnb.lottie.animation.content.C4050b;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C4066n;
import com.airbnb.lottie.model.C0850d;
import com.airbnb.lottie.model.C0852f;
import com.airbnb.lottie.model.C0854g;
import com.airbnb.lottie.model.content.C2993i;
import com.airbnb.lottie.p017b.C0784f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.model.layer.g */
public class C4327g extends C4077a {
    /* renamed from: e */
    private final char[] f14175e = new char[1];
    /* renamed from: f */
    private final RectF f14176f = new RectF();
    /* renamed from: g */
    private final Matrix f14177g = new Matrix();
    /* renamed from: h */
    private final Paint f14178h = new Paint(this, 1) {
        /* renamed from: a */
        final /* synthetic */ C4327g f2254a;
    };
    /* renamed from: i */
    private final Paint f14179i = new Paint(this, 1) {
        /* renamed from: a */
        final /* synthetic */ C4327g f2255a;
    };
    /* renamed from: j */
    private final Map<C0854g, List<C4050b>> f14180j = new HashMap();
    /* renamed from: k */
    private final C4066n f14181k;
    /* renamed from: l */
    private final C0792d f14182l;
    /* renamed from: m */
    private final C0788c f14183m;
    @Nullable
    /* renamed from: n */
    private BaseKeyframeAnimation<Integer, Integer> f14184n;
    @Nullable
    /* renamed from: o */
    private BaseKeyframeAnimation<Integer, Integer> f14185o;
    @Nullable
    /* renamed from: p */
    private BaseKeyframeAnimation<Float, Float> f14186p;
    @Nullable
    /* renamed from: q */
    private BaseKeyframeAnimation<Float, Float> f14187q;

    C4327g(C0792d c0792d, Layer layer) {
        super(c0792d, layer);
        this.f14182l = c0792d;
        this.f14183m = layer.m2936a();
        this.f14181k = layer.m2955s().m15895a();
        this.f14181k.mo1165a((AnimationListener) this);
        m15914a((BaseKeyframeAnimation) this.f14181k);
        c0792d = layer.m2956t();
        if (!(c0792d == null || c0792d.f2182a == null)) {
            this.f14184n = c0792d.f2182a.createAnimation();
            this.f14184n.mo1165a((AnimationListener) this);
            m15914a((BaseKeyframeAnimation) this.f14184n);
        }
        if (!(c0792d == null || c0792d.f2183b == null)) {
            this.f14185o = c0792d.f2183b.createAnimation();
            this.f14185o.mo1165a((AnimationListener) this);
            m15914a((BaseKeyframeAnimation) this.f14185o);
        }
        if (!(c0792d == null || c0792d.f2184c == null)) {
            this.f14186p = c0792d.f2184c.createAnimation();
            this.f14186p.mo1165a((AnimationListener) this);
            m15914a((BaseKeyframeAnimation) this.f14186p);
        }
        if (c0792d != null && c0792d.f2185d != null) {
            this.f14187q = c0792d.f2185d.createAnimation();
            this.f14187q.mo1165a((AnimationListener) this);
            m15914a((BaseKeyframeAnimation) this.f14187q);
        }
    }

    /* renamed from: a */
    void mo3687a(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (this.f14182l.m2859l() == 0) {
            canvas.setMatrix(matrix);
        }
        C0850d c0850d = (C0850d) this.f14181k.mo1163b();
        C0852f c0852f = (C0852f) this.f14183m.m2809k().get(c0850d.f2206b);
        if (c0852f == null) {
            canvas.restore();
            return;
        }
        if (this.f14184n != null) {
            this.f14178h.setColor(((Integer) this.f14184n.mo1163b()).intValue());
        } else {
            this.f14178h.setColor(c0850d.f2211g);
        }
        if (this.f14185o != null) {
            this.f14179i.setColor(((Integer) this.f14185o.mo1163b()).intValue());
        } else {
            this.f14179i.setColor(c0850d.f2212h);
        }
        int intValue = (((Integer) this.d.m2730a().mo1163b()).intValue() * 255) / 100;
        this.f14178h.setAlpha(intValue);
        this.f14179i.setAlpha(intValue);
        if (this.f14186p != null) {
            this.f14179i.setStrokeWidth(((Float) this.f14186p.mo1163b()).floatValue());
        } else {
            this.f14179i.setStrokeWidth((((float) c0850d.f2213i) * this.f14183m.m2812n()) * C0784f.m2768a(matrix));
        }
        if (this.f14182l.m2859l()) {
            m17509a(c0850d, matrix, c0852f, canvas);
        } else {
            m17510a(c0850d, c0852f, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m17509a(C0850d c0850d, Matrix matrix, C0852f c0852f, Canvas canvas) {
        float f = ((float) c0850d.f2207c) / 100.0f;
        float a = C0784f.m2768a(matrix);
        String str = c0850d.f2205a;
        for (int i = 0; i < str.length(); i++) {
            C0854g c0854g = (C0854g) this.f14183m.m2808j().m2080a(C0854g.m2927a(str.charAt(i), c0852f.m2923a(), c0852f.m2925c()));
            if (c0854g != null) {
                m17511a(c0854g, matrix, f, c0850d, canvas);
                float b = ((((float) c0854g.m2929b()) * f) * this.f14183m.m2812n()) * a;
                float f2 = ((float) c0850d.f2209e) / 10.0f;
                if (this.f14187q != null) {
                    f2 += ((Float) this.f14187q.mo1163b()).floatValue();
                }
                canvas.translate(b + (f2 * a), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m17510a(C0850d c0850d, C0852f c0852f, Matrix matrix, Canvas canvas) {
        matrix = C0784f.m2768a(matrix);
        c0852f = this.f14182l.m2827a(c0852f.m2923a(), c0852f.m2925c());
        if (c0852f != null) {
            String str = c0850d.f2205a;
            C0799h k = this.f14182l.m2858k();
            if (k != null) {
                str = k.m2867b(str);
            }
            this.f14178h.setTypeface(c0852f);
            this.f14178h.setTextSize(((float) c0850d.f2207c) * this.f14183m.m2812n());
            this.f14179i.setTypeface(this.f14178h.getTypeface());
            this.f14179i.setTextSize(this.f14178h.getTextSize());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                m17507a(charAt, c0850d, canvas);
                this.f14175e[0] = charAt;
                float measureText = this.f14178h.measureText(this.f14175e, 0, 1);
                float f = ((float) c0850d.f2209e) / 10.0f;
                if (this.f14187q != null) {
                    f += ((Float) this.f14187q.mo1163b()).floatValue();
                }
                canvas.translate(measureText + (f * matrix), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m17511a(C0854g c0854g, Matrix matrix, float f, C0850d c0850d, Canvas canvas) {
        c0854g = m17506a(c0854g);
        for (int i = 0; i < c0854g.size(); i++) {
            Path c = ((C4050b) c0854g.get(i)).mo3174c();
            c.computeBounds(this.f14176f, false);
            this.f14177g.set(matrix);
            this.f14177g.preScale(f, f);
            c.transform(this.f14177g);
            if (c0850d.f2214j) {
                m17508a(c, this.f14178h, canvas);
                m17508a(c, this.f14179i, canvas);
            } else {
                m17508a(c, this.f14179i, canvas);
                m17508a(c, this.f14178h, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m17508a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m17507a(char c, C0850d c0850d, Canvas canvas) {
        this.f14175e[0] = c;
        if (c0850d.f2214j != '\u0000') {
            m17512a(this.f14175e, this.f14178h, canvas);
            m17512a(this.f14175e, this.f14179i, canvas);
            return;
        }
        m17512a(this.f14175e, this.f14179i, canvas);
        m17512a(this.f14175e, this.f14178h, canvas);
    }

    /* renamed from: a */
    private void m17512a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: a */
    private List<C4050b> m17506a(C0854g c0854g) {
        if (this.f14180j.containsKey(c0854g)) {
            return (List) this.f14180j.get(c0854g);
        }
        List a = c0854g.m2928a();
        int size = a.size();
        List<C4050b> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C4050b(this.f14182l, this, (C2993i) a.get(i)));
        }
        this.f14180j.put(c0854g, arrayList);
        return arrayList;
    }
}
