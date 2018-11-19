package com.airbnb.lottie.model.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.annotation.CallSuper;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.util.Log;
import com.airbnb.lottie.C0785b;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C0773f;
import com.airbnb.lottie.animation.keyframe.C0776o;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4060b;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class C4077a implements DrawingContent, AnimationListener {
    /* renamed from: a */
    final Matrix f12928a = new Matrix();
    /* renamed from: b */
    final C0792d f12929b;
    /* renamed from: c */
    final Layer f12930c;
    /* renamed from: d */
    final C0776o f12931d;
    /* renamed from: e */
    private final Path f12932e = new Path();
    /* renamed from: f */
    private final Matrix f12933f = new Matrix();
    /* renamed from: g */
    private final Paint f12934g = new Paint(1);
    /* renamed from: h */
    private final Paint f12935h = new Paint(1);
    /* renamed from: i */
    private final Paint f12936i = new Paint(1);
    /* renamed from: j */
    private final Paint f12937j = new Paint();
    /* renamed from: k */
    private final RectF f12938k = new RectF();
    /* renamed from: l */
    private final RectF f12939l = new RectF();
    /* renamed from: m */
    private final RectF f12940m = new RectF();
    /* renamed from: n */
    private final RectF f12941n = new RectF();
    /* renamed from: o */
    private final String f12942o;
    @Nullable
    /* renamed from: p */
    private C0773f f12943p;
    @Nullable
    /* renamed from: q */
    private C4077a f12944q;
    @Nullable
    /* renamed from: r */
    private C4077a f12945r;
    /* renamed from: s */
    private List<C4077a> f12946s;
    /* renamed from: t */
    private final List<BaseKeyframeAnimation<?, ?>> f12947t = new ArrayList();
    /* renamed from: u */
    private boolean f12948u = true;

    /* renamed from: a */
    abstract void mo3687a(Canvas canvas, Matrix matrix, int i);

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
    }

    public void setContents(List<Content> list, List<Content> list2) {
    }

    @Nullable
    /* renamed from: a */
    static C4077a m15900a(Layer layer, C0792d c0792d, C0788c c0788c) {
        switch (layer.m2947k()) {
            case Shape:
                return new C4325e(c0792d, layer);
            case PreComp:
                return new C4322b(c0792d, layer, c0788c.m2800b(layer.m2943g()), c0788c);
            case Solid:
                return new C4326f(c0792d, layer);
            case Image:
                return new C4323c(c0792d, layer, c0788c.m2812n());
            case Null:
                return new C4324d(c0792d, layer);
            case Text:
                return new C4327g(c0792d, layer);
            default:
                c0788c = new StringBuilder();
                c0788c.append("Unknown layer type ");
                c0788c.append(layer.m2947k());
                Log.w("LOTTIE", c0788c.toString());
                return null;
        }
    }

    C4077a(C0792d c0792d, Layer layer) {
        this.f12929b = c0792d;
        this.f12930c = layer;
        c0792d = new StringBuilder();
        c0792d.append(layer.m2942f());
        c0792d.append("#draw");
        this.f12942o = c0792d.toString();
        this.f12937j.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f12935h.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        if (layer.m2948l() == MatteType.Invert) {
            this.f12936i.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f12936i.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f12931d = layer.m2951o().m11515h();
        this.f12931d.m2731a((AnimationListener) this);
        this.f12931d.m2732a(this);
        if (layer.m2946j() != null && layer.m2946j().isEmpty() == null) {
            this.f12943p = new C0773f(layer.m2946j());
            for (BaseKeyframeAnimation baseKeyframeAnimation : this.f12943p.m2726b()) {
                m15914a(baseKeyframeAnimation);
                baseKeyframeAnimation.mo1165a((AnimationListener) this);
            }
            for (BaseKeyframeAnimation baseKeyframeAnimation2 : this.f12943p.m2727c()) {
                m15914a(baseKeyframeAnimation2);
                baseKeyframeAnimation2.mo1165a((AnimationListener) this);
            }
        }
        m15908d();
    }

    public void onValueChanged() {
        m15909e();
    }

    /* renamed from: a */
    Layer m15911a() {
        return this.f12930c;
    }

    /* renamed from: a */
    void m15915a(@Nullable C4077a c4077a) {
        this.f12944q = c4077a;
    }

    /* renamed from: b */
    boolean m15917b() {
        return this.f12944q != null;
    }

    /* renamed from: b */
    void m15916b(@Nullable C4077a c4077a) {
        this.f12945r = c4077a;
    }

    /* renamed from: d */
    private void m15908d() {
        boolean z = true;
        if (this.f12930c.m2940d().isEmpty()) {
            m15905a(true);
            return;
        }
        final BaseKeyframeAnimation c4060b = new C4060b(this.f12930c.m2940d());
        c4060b.m2720a();
        c4060b.mo1165a(new AnimationListener(this) {
            /* renamed from: b */
            final /* synthetic */ C4077a f9309b;

            public void onValueChanged() {
                this.f9309b.m15905a(((Float) c4060b.mo1163b()).floatValue() == 1.0f);
            }
        });
        if (((Float) c4060b.mo1163b()).floatValue() != 1.0f) {
            z = false;
        }
        m15905a(z);
        m15914a(c4060b);
    }

    /* renamed from: e */
    private void m15909e() {
        this.f12929b.invalidateSelf();
    }

    /* renamed from: a */
    public void m15914a(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (!(baseKeyframeAnimation instanceof C2971m)) {
            this.f12947t.add(baseKeyframeAnimation);
        }
    }

    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix) {
        this.f12928a.set(matrix);
        this.f12928a.preConcat(this.f12931d.m2735d());
    }

    @SuppressLint({"WrongConstant"})
    public void draw(Canvas canvas, Matrix matrix, int i) {
        C0785b.m2775a(this.f12942o);
        if (this.f12948u) {
            m15910f();
            C0785b.m2775a("Layer#parentMatrix");
            this.f12933f.reset();
            this.f12933f.set(matrix);
            for (int size = this.f12946s.size() - 1; size >= 0; size--) {
                this.f12933f.preConcat(((C4077a) this.f12946s.get(size)).f12931d.m2735d());
            }
            C0785b.m2776b("Layer#parentMatrix");
            i = (int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f12931d.m2730a().mo1163b()).intValue())) / 1120403456) * 1132396544);
            if (m15917b() || m15918c()) {
                C0785b.m2775a("Layer#computeBounds");
                this.f12938k.set(0.0f, 0.0f, 0.0f, 0.0f);
                getBounds(this.f12938k, this.f12933f);
                m15907b(this.f12938k, this.f12933f);
                this.f12933f.preConcat(this.f12931d.m2735d());
                m15903a(this.f12938k, this.f12933f);
                this.f12938k.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                C0785b.m2776b("Layer#computeBounds");
                C0785b.m2775a("Layer#saveLayer");
                canvas.saveLayer(this.f12938k, this.f12934g, 31);
                C0785b.m2776b("Layer#saveLayer");
                m15901a(canvas);
                C0785b.m2775a("Layer#drawLayer");
                mo3687a(canvas, this.f12933f, i);
                C0785b.m2776b("Layer#drawLayer");
                if (m15918c()) {
                    m15902a(canvas, this.f12933f);
                }
                if (m15917b()) {
                    C0785b.m2775a("Layer#drawMatte");
                    C0785b.m2775a("Layer#saveLayer");
                    canvas.saveLayer(this.f12938k, this.f12936i, 19);
                    C0785b.m2776b("Layer#saveLayer");
                    m15901a(canvas);
                    this.f12944q.draw(canvas, matrix, i);
                    C0785b.m2775a("Layer#restoreLayer");
                    canvas.restore();
                    C0785b.m2776b("Layer#restoreLayer");
                    C0785b.m2776b("Layer#drawMatte");
                }
                C0785b.m2775a("Layer#restoreLayer");
                canvas.restore();
                C0785b.m2776b("Layer#restoreLayer");
                m15906b(C0785b.m2776b(this.f12942o));
                return;
            }
            this.f12933f.preConcat(this.f12931d.m2735d());
            C0785b.m2775a("Layer#drawLayer");
            mo3687a(canvas, this.f12933f, i);
            C0785b.m2776b("Layer#drawLayer");
            m15906b(C0785b.m2776b(this.f12942o));
            return;
        }
        C0785b.m2776b(this.f12942o);
    }

    /* renamed from: b */
    private void m15906b(float f) {
        this.f12929b.m2861n().m2795a().m2690a(this.f12930c.m2942f(), f);
    }

    /* renamed from: a */
    private void m15901a(Canvas canvas) {
        C0785b.m2775a("Layer#clearLayer");
        canvas.drawRect(this.f12938k.left - 1.0f, this.f12938k.top - 1.0f, this.f12938k.right + 1.0f, this.f12938k.bottom + 1.0f, this.f12937j);
        C0785b.m2776b("Layer#clearLayer");
    }

    /* renamed from: a */
    private void m15903a(RectF rectF, Matrix matrix) {
        this.f12939l.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m15918c()) {
            int size = this.f12943p.m2725a().size();
            int i = 0;
            while (i < size) {
                Mask mask = (Mask) this.f12943p.m2725a().get(i);
                this.f12932e.set((Path) ((BaseKeyframeAnimation) this.f12943p.m2726b().get(i)).mo1163b());
                this.f12932e.transform(matrix);
                switch (mask.m2896a()) {
                    case MaskModeSubtract:
                        return;
                    case MaskModeIntersect:
                        return;
                    case MaskModeUnknown:
                        return;
                    default:
                        this.f12932e.computeBounds(this.f12941n, false);
                        if (i == 0) {
                            this.f12939l.set(this.f12941n);
                        } else {
                            this.f12939l.set(Math.min(this.f12939l.left, this.f12941n.left), Math.min(this.f12939l.top, this.f12941n.top), Math.max(this.f12939l.right, this.f12941n.right), Math.max(this.f12939l.bottom, this.f12941n.bottom));
                        }
                        i++;
                }
            }
            rectF.set(Math.max(rectF.left, this.f12939l.left), Math.max(rectF.top, this.f12939l.top), Math.min(rectF.right, this.f12939l.right), Math.min(rectF.bottom, this.f12939l.bottom));
        }
    }

    /* renamed from: b */
    private void m15907b(RectF rectF, Matrix matrix) {
        if (m15917b() && this.f12930c.m2948l() != MatteType.Invert) {
            this.f12944q.getBounds(this.f12940m, matrix);
            rectF.set(Math.max(rectF.left, this.f12940m.left), Math.max(rectF.top, this.f12940m.top), Math.min(rectF.right, this.f12940m.right), Math.min(rectF.bottom, this.f12940m.bottom));
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private void m15902a(Canvas canvas, Matrix matrix) {
        C0785b.m2775a("Layer#drawMask");
        C0785b.m2775a("Layer#saveLayer");
        canvas.saveLayer(this.f12938k, this.f12935h, 19);
        C0785b.m2776b("Layer#saveLayer");
        m15901a(canvas);
        int size = this.f12943p.m2725a().size();
        for (int i = 0; i < size; i++) {
            Mask mask = (Mask) this.f12943p.m2725a().get(i);
            this.f12932e.set((Path) ((BaseKeyframeAnimation) this.f12943p.m2726b().get(i)).mo1163b());
            this.f12932e.transform(matrix);
            if (C08592.f2252b[mask.m2896a().ordinal()] != 1) {
                this.f12932e.setFillType(FillType.WINDING);
            } else {
                this.f12932e.setFillType(FillType.INVERSE_WINDING);
            }
            BaseKeyframeAnimation baseKeyframeAnimation = (BaseKeyframeAnimation) this.f12943p.m2727c().get(i);
            int alpha = this.f12934g.getAlpha();
            this.f12934g.setAlpha((int) (((float) ((Integer) baseKeyframeAnimation.mo1163b()).intValue()) * 2.55f));
            canvas.drawPath(this.f12932e, this.f12934g);
            this.f12934g.setAlpha(alpha);
        }
        C0785b.m2775a("Layer#restoreLayer");
        canvas.restore();
        C0785b.m2776b("Layer#restoreLayer");
        C0785b.m2776b("Layer#drawMask");
    }

    /* renamed from: c */
    boolean m15918c() {
        return (this.f12943p == null || this.f12943p.m2726b().isEmpty()) ? false : true;
    }

    /* renamed from: a */
    private void m15905a(boolean z) {
        if (z != this.f12948u) {
            this.f12948u = z;
            m15909e();
        }
    }

    /* renamed from: a */
    void mo3686a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f12930c.m2938b() != 0.0f) {
            f /= this.f12930c.m2938b();
        }
        if (this.f12944q != null) {
            this.f12944q.mo3686a(f);
        }
        for (int i = 0; i < this.f12947t.size(); i++) {
            ((BaseKeyframeAnimation) this.f12947t.get(i)).mo1162a(f);
        }
    }

    /* renamed from: f */
    private void m15910f() {
        if (this.f12946s == null) {
            if (this.f12945r == null) {
                this.f12946s = Collections.emptyList();
                return;
            }
            this.f12946s = new ArrayList();
            for (C4077a c4077a = this.f12945r; c4077a != null; c4077a = c4077a.f12945r) {
                this.f12946s.add(c4077a);
            }
        }
    }

    public String getName() {
        return this.f12930c.m2942f();
    }
}
