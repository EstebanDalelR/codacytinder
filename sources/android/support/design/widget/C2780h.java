package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.drawable.C0450a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.design.widget.h */
class C2780h extends C0237g {
    /* renamed from: p */
    private InsetDrawable f8798p;

    /* renamed from: android.support.design.widget.h$a */
    static class C0238a extends GradientDrawable {
        public boolean isStateful() {
            return true;
        }

        C0238a() {
        }
    }

    /* renamed from: a */
    void mo275a(int[] iArr) {
    }

    /* renamed from: b */
    void mo276b() {
    }

    /* renamed from: h */
    boolean mo279h() {
        return false;
    }

    C2780h(VisibilityAwareImageButton visibilityAwareImageButton, C0239j c0239j) {
        super(visibilityAwareImageButton, c0239j);
    }

    /* renamed from: a */
    void mo273a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        this.d = C0450a.m1730g(m887k());
        C0450a.m1719a(this.d, colorStateList);
        if (mode != null) {
            C0450a.m1722a(this.d, mode);
        }
        if (i2 > 0) {
            this.f = m865a(i2, colorStateList);
            colorStateList = new LayerDrawable(new Drawable[]{this.f, this.d});
        } else {
            this.f = null;
            colorStateList = this.d;
        }
        this.e = new RippleDrawable(ColorStateList.valueOf(i), colorStateList, null);
        this.g = this.e;
        this.o.mo249a(this.e);
    }

    /* renamed from: a */
    void mo272a(int i) {
        if (this.e instanceof RippleDrawable) {
            ((RippleDrawable) this.e).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo272a(i);
        }
    }

    /* renamed from: a */
    void mo271a(float f, float f2) {
        if (VERSION.SDK_INT != 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(k, animatorSet);
            f2 = new AnimatorSet();
            List arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{this.n.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            f2.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            f2.setInterpolator(a);
            stateListAnimator.addState(l, f2);
            f = new AnimatorSet();
            f.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            f.setInterpolator(a);
            stateListAnimator.addState(m, f);
            this.n.setStateListAnimator(stateListAnimator);
        } else if (this.n.isEnabled()) {
            this.n.setElevation(f);
            if (this.n.isFocused() == null) {
                if (this.n.isPressed() == null) {
                    this.n.setTranslationZ(0.0f);
                }
            }
            this.n.setTranslationZ(f2);
        } else {
            this.n.setElevation(0.0f);
            this.n.setTranslationZ(0.0f);
        }
        if (this.o.mo250b() != null) {
            m881e();
        }
    }

    /* renamed from: a */
    public float mo270a() {
        return this.n.getElevation();
    }

    /* renamed from: d */
    void mo278d() {
        m881e();
    }

    /* renamed from: b */
    void mo277b(Rect rect) {
        if (this.o.mo250b()) {
            this.f8798p = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            this.o.mo249a(this.f8798p);
            return;
        }
        this.o.mo249a(this.e);
    }

    /* renamed from: i */
    C0229c mo280i() {
        return new C2776d();
    }

    /* renamed from: l */
    GradientDrawable mo281l() {
        return new C0238a();
    }

    /* renamed from: a */
    void mo274a(Rect rect) {
        if (this.o.mo250b()) {
            float a = this.o.mo247a();
            float a2 = mo270a() + this.i;
            int ceil = (int) Math.ceil((double) C2781i.m10831b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) C2781i.m10828a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
