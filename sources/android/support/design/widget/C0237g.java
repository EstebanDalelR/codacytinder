package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.C0181a.C0172c;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.view.ViewCompat;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

@RequiresApi(14)
/* renamed from: android.support.design.widget.g */
class C0237g {
    /* renamed from: a */
    static final Interpolator f859a = C0226a.f782c;
    /* renamed from: j */
    static final int[] f860j = new int[]{16842919, 16842910};
    /* renamed from: k */
    static final int[] f861k = new int[]{16842908, 16842910};
    /* renamed from: l */
    static final int[] f862l = new int[]{16842910};
    /* renamed from: m */
    static final int[] f863m = new int[0];
    /* renamed from: b */
    int f864b = 0;
    /* renamed from: c */
    C2781i f865c;
    /* renamed from: d */
    Drawable f866d;
    /* renamed from: e */
    Drawable f867e;
    /* renamed from: f */
    C0229c f868f;
    /* renamed from: g */
    Drawable f869g;
    /* renamed from: h */
    float f870h;
    /* renamed from: i */
    float f871i;
    /* renamed from: n */
    final VisibilityAwareImageButton f872n;
    /* renamed from: o */
    final C0239j f873o;
    /* renamed from: p */
    private final C0246l f874p;
    /* renamed from: q */
    private float f875q;
    /* renamed from: r */
    private final Rect f876r = new Rect();
    /* renamed from: s */
    private OnPreDrawListener f877s;

    /* renamed from: android.support.design.widget.g$3 */
    class C02343 implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ C0237g f854a;

        C02343(C0237g c0237g) {
            this.f854a = c0237g;
        }

        public boolean onPreDraw() {
            this.f854a.m886j();
            return true;
        }
    }

    /* renamed from: android.support.design.widget.g$c */
    interface C0235c {
        /* renamed from: a */
        void mo242a();

        /* renamed from: b */
        void mo243b();
    }

    /* renamed from: android.support.design.widget.g$e */
    private abstract class C0236e extends AnimatorListenerAdapter implements AnimatorUpdateListener {
        /* renamed from: a */
        private boolean f855a;
        /* renamed from: b */
        final /* synthetic */ C0237g f856b;
        /* renamed from: c */
        private float f857c;
        /* renamed from: d */
        private float f858d;

        /* renamed from: a */
        protected abstract float mo269a();

        private C0236e(C0237g c0237g) {
            this.f856b = c0237g;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f855a) {
                this.f857c = this.f856b.f865c.m10834a();
                this.f858d = mo269a();
                this.f855a = true;
            }
            this.f856b.f865c.m10838b(this.f857c + ((this.f858d - this.f857c) * valueAnimator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            this.f856b.f865c.m10838b(this.f858d);
            this.f855a = null;
        }
    }

    /* renamed from: android.support.design.widget.g$a */
    private class C2777a extends C0236e {
        /* renamed from: a */
        final /* synthetic */ C0237g f8795a;

        /* renamed from: a */
        protected float mo269a() {
            return 0.0f;
        }

        C2777a(C0237g c0237g) {
            this.f8795a = c0237g;
            super();
        }
    }

    /* renamed from: android.support.design.widget.g$b */
    private class C2778b extends C0236e {
        /* renamed from: a */
        final /* synthetic */ C0237g f8796a;

        C2778b(C0237g c0237g) {
            this.f8796a = c0237g;
            super();
        }

        /* renamed from: a */
        protected float mo269a() {
            return this.f8796a.f870h + this.f8796a.f871i;
        }
    }

    /* renamed from: android.support.design.widget.g$d */
    private class C2779d extends C0236e {
        /* renamed from: a */
        final /* synthetic */ C0237g f8797a;

        C2779d(C0237g c0237g) {
            this.f8797a = c0237g;
            super();
        }

        /* renamed from: a */
        protected float mo269a() {
            return this.f8797a.f870h;
        }
    }

    /* renamed from: b */
    void mo277b(Rect rect) {
    }

    /* renamed from: d */
    void mo278d() {
    }

    /* renamed from: h */
    boolean mo279h() {
        return true;
    }

    C0237g(VisibilityAwareImageButton visibilityAwareImageButton, C0239j c0239j) {
        this.f872n = visibilityAwareImageButton;
        this.f873o = c0239j;
        this.f874p = new C0246l();
        this.f874p.m916a(f860j, m859a(new C2778b(this)));
        this.f874p.m916a(f861k, m859a(new C2778b(this)));
        this.f874p.m916a(f862l, m859a(new C2779d(this)));
        this.f874p.m916a(f863m, m859a(new C2777a(this)));
        this.f875q = this.f872n.getRotation();
    }

    /* renamed from: a */
    void mo273a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        this.f866d = C0450a.m1730g(m887k());
        C0450a.m1719a(this.f866d, colorStateList);
        if (mode != null) {
            C0450a.m1722a(this.f866d, mode);
        }
        this.f867e = C0450a.m1730g(m887k());
        C0450a.m1719a(this.f867e, C0237g.m860b(i));
        if (i2 > 0) {
            this.f868f = m865a(i2, colorStateList);
            colorStateList = new Drawable[]{this.f868f, this.f866d, this.f867e};
        } else {
            this.f868f = null;
            colorStateList = new Drawable[]{this.f866d, this.f867e};
        }
        this.f869g = new LayerDrawable(colorStateList);
        this.f865c = new C2781i(this.f872n.getContext(), this.f869g, this.f873o.mo247a(), this.f870h, this.f870h + this.f871i);
        this.f865c.m10837a(false);
        this.f873o.mo249a(this.f865c);
    }

    /* renamed from: a */
    void m869a(ColorStateList colorStateList) {
        if (this.f866d != null) {
            C0450a.m1719a(this.f866d, colorStateList);
        }
        if (this.f868f != null) {
            this.f868f.m806a(colorStateList);
        }
    }

    /* renamed from: a */
    void m871a(Mode mode) {
        if (this.f866d != null) {
            C0450a.m1722a(this.f866d, mode);
        }
    }

    /* renamed from: a */
    void mo272a(int i) {
        if (this.f867e != null) {
            C0450a.m1719a(this.f867e, C0237g.m860b(i));
        }
    }

    /* renamed from: a */
    final void m866a(float f) {
        if (this.f870h != f) {
            this.f870h = f;
            mo271a(f, this.f871i);
        }
    }

    /* renamed from: a */
    float mo270a() {
        return this.f870h;
    }

    /* renamed from: b */
    final void m876b(float f) {
        if (this.f871i != f) {
            this.f871i = f;
            mo271a(this.f870h, f);
        }
    }

    /* renamed from: a */
    void mo271a(float f, float f2) {
        if (this.f865c != null) {
            this.f865c.m10836a(f, this.f871i + f);
            m881e();
        }
    }

    /* renamed from: a */
    void mo275a(int[] iArr) {
        this.f874p.m915a(iArr);
    }

    /* renamed from: b */
    void mo276b() {
        this.f874p.m914a();
    }

    /* renamed from: a */
    void m873a(@Nullable final C0235c c0235c, final boolean z) {
        if (!m890n()) {
            this.f872n.animate().cancel();
            if (m862p()) {
                this.f864b = 1;
                this.f872n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C0226a.f782c).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0237g f849c;
                    /* renamed from: d */
                    private boolean f850d;

                    public void onAnimationStart(Animator animator) {
                        this.f849c.f872n.internalSetVisibility(0, z);
                        this.f850d = false;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.f850d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f849c.f864b = 0;
                        if (this.f850d == null) {
                            this.f849c.f872n.internalSetVisibility(z ? 8 : 4, z);
                            if (c0235c != null) {
                                c0235c.mo243b();
                            }
                        }
                    }
                });
            } else {
                this.f872n.internalSetVisibility(z ? 8 : 4, z);
                if (c0235c != null) {
                    c0235c.mo243b();
                }
            }
        }
    }

    /* renamed from: b */
    void m878b(@Nullable final C0235c c0235c, final boolean z) {
        if (!m889m()) {
            this.f872n.animate().cancel();
            if (m862p()) {
                this.f864b = 2;
                if (this.f872n.getVisibility() != 0) {
                    this.f872n.setAlpha(0.0f);
                    this.f872n.setScaleY(0.0f);
                    this.f872n.setScaleX(0.0f);
                }
                this.f872n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C0226a.f783d).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0237g f853c;

                    public void onAnimationStart(Animator animator) {
                        this.f853c.f872n.internalSetVisibility(0, z);
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f853c.f864b = 0;
                        if (c0235c != null) {
                            c0235c.mo242a();
                        }
                    }
                });
            } else {
                this.f872n.internalSetVisibility(0, z);
                this.f872n.setAlpha(1.0f);
                this.f872n.setScaleY(1.0f);
                this.f872n.setScaleX(1.0f);
                if (c0235c != null) {
                    c0235c.mo242a();
                }
            }
        }
    }

    /* renamed from: c */
    final Drawable m879c() {
        return this.f869g;
    }

    /* renamed from: e */
    final void m881e() {
        Rect rect = this.f876r;
        mo274a(rect);
        mo277b(rect);
        this.f873o.mo248a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    void mo274a(Rect rect) {
        this.f865c.getPadding(rect);
    }

    /* renamed from: f */
    void m882f() {
        if (mo279h()) {
            m861o();
            this.f872n.getViewTreeObserver().addOnPreDrawListener(this.f877s);
        }
    }

    /* renamed from: g */
    void m883g() {
        if (this.f877s != null) {
            this.f872n.getViewTreeObserver().removeOnPreDrawListener(this.f877s);
            this.f877s = null;
        }
    }

    /* renamed from: a */
    C0229c m865a(int i, ColorStateList colorStateList) {
        Context context = this.f872n.getContext();
        C0229c i2 = mo280i();
        i2.m805a(C0432b.m1647c(context, C0172c.design_fab_stroke_top_outer_color), C0432b.m1647c(context, C0172c.design_fab_stroke_top_inner_color), C0432b.m1647c(context, C0172c.design_fab_stroke_end_inner_color), C0432b.m1647c(context, C0172c.design_fab_stroke_end_outer_color));
        i2.m804a((float) i);
        i2.m806a(colorStateList);
        return i2;
    }

    /* renamed from: i */
    C0229c mo280i() {
        return new C0229c();
    }

    /* renamed from: j */
    void m886j() {
        float rotation = this.f872n.getRotation();
        if (this.f875q != rotation) {
            this.f875q = rotation;
            m863q();
        }
    }

    /* renamed from: o */
    private void m861o() {
        if (this.f877s == null) {
            this.f877s = new C02343(this);
        }
    }

    /* renamed from: k */
    GradientDrawable m887k() {
        GradientDrawable l = mo281l();
        l.setShape(1);
        l.setColor(-1);
        return l;
    }

    /* renamed from: l */
    GradientDrawable mo281l() {
        return new GradientDrawable();
    }

    /* renamed from: m */
    boolean m889m() {
        boolean z = false;
        if (this.f872n.getVisibility() != 0) {
            if (this.f864b == 2) {
                z = true;
            }
            return z;
        }
        if (this.f864b != 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    boolean m890n() {
        boolean z = false;
        if (this.f872n.getVisibility() == 0) {
            if (this.f864b == 1) {
                z = true;
            }
            return z;
        }
        if (this.f864b != 2) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private android.animation.ValueAnimator m859a(@android.support.annotation.NonNull android.support.design.widget.C0237g.C0236e r4) {
        /*
        r3 = this;
        r0 = new android.animation.ValueAnimator;
        r0.<init>();
        r1 = f859a;
        r0.setInterpolator(r1);
        r1 = 100;
        r0.setDuration(r1);
        r0.addListener(r4);
        r0.addUpdateListener(r4);
        r4 = 2;
        r4 = new float[r4];
        r4 = {0, 1065353216};
        r0.setFloatValues(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.g.a(android.support.design.widget.g$e):android.animation.ValueAnimator");
    }

    /* renamed from: b */
    private static ColorStateList m860b(int i) {
        r1 = new int[3][];
        int[] iArr = new int[]{f861k, i, f860j};
        iArr[1] = i;
        r1[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r1, iArr);
    }

    /* renamed from: p */
    private boolean m862p() {
        return ViewCompat.m2234z(this.f872n) && !this.f872n.isInEditMode();
    }

    /* renamed from: q */
    private void m863q() {
        if (VERSION.SDK_INT == 19) {
            if (this.f875q % 90.0f != 0.0f) {
                if (this.f872n.getLayerType() != 1) {
                    this.f872n.setLayerType(1, null);
                }
            } else if (this.f872n.getLayerType() != 0) {
                this.f872n.setLayerType(0, null);
            }
        }
        if (this.f865c != null) {
            this.f865c.m10835a(-this.f875q);
        }
        if (this.f868f != null) {
            this.f868f.m807b(-this.f875q);
        }
    }
}
