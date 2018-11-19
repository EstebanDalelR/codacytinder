package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.support.transition.C0351r.C0350a;
import android.view.View;

class ab {

    /* renamed from: android.support.transition.ab$a */
    private static class C0326a extends AnimatorListenerAdapter {
        /* renamed from: a */
        private final View f1134a;
        /* renamed from: b */
        private final View f1135b;
        /* renamed from: c */
        private final int f1136c;
        /* renamed from: d */
        private final int f1137d;
        /* renamed from: e */
        private int[] f1138e;
        /* renamed from: f */
        private float f1139f;
        /* renamed from: g */
        private float f1140g;
        /* renamed from: h */
        private final float f1141h;
        /* renamed from: i */
        private final float f1142i;

        private C0326a(View view, View view2, int i, int i2, float f, float f2) {
            this.f1135b = view;
            this.f1134a = view2;
            this.f1136c = i - Math.round(this.f1135b.getTranslationX());
            this.f1137d = i2 - Math.round(this.f1135b.getTranslationY());
            this.f1141h = f;
            this.f1142i = f2;
            this.f1138e = (int[]) this.f1134a.getTag(C0350a.transition_position);
            if (this.f1138e != null) {
                this.f1134a.setTag(C0350a.transition_position, 0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1138e == null) {
                this.f1138e = new int[2];
            }
            this.f1138e[0] = Math.round(((float) this.f1136c) + this.f1135b.getTranslationX());
            this.f1138e[1] = Math.round(((float) this.f1137d) + this.f1135b.getTranslationY());
            this.f1134a.setTag(C0350a.transition_position, this.f1138e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1135b.setTranslationX(this.f1141h);
            this.f1135b.setTranslationY(this.f1142i);
        }

        public void onAnimationPause(Animator animator) {
            this.f1139f = this.f1135b.getTranslationX();
            this.f1140g = this.f1135b.getTranslationY();
            this.f1135b.setTranslationX(this.f1141h);
            this.f1135b.setTranslationY(this.f1142i);
        }

        public void onAnimationResume(Animator animator) {
            this.f1135b.setTranslationX(this.f1139f);
            this.f1135b.setTranslationY(this.f1140g);
        }
    }

    /* renamed from: a */
    static Animator m1230a(View view, C0358z c0358z, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        C0358z c0358z2 = c0358z;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c0358z2.f1197b.getTag(C0350a.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view2.setTranslationX(f5);
        view2.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        C0326a c0326a = new C0326a(view2, c0358z2.f1197b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(c0326a);
        C0324a.m1228a(ofPropertyValuesHolder, c0326a);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
