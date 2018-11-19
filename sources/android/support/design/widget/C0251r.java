package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.support.annotation.RequiresApi;
import android.support.design.C0181a.C0171b;
import android.support.design.C0181a.C0176g;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

@RequiresApi(21)
/* renamed from: android.support.design.widget.r */
class C0251r {
    /* renamed from: a */
    private static final int[] f903a = new int[]{16843848};

    /* renamed from: a */
    static void m925a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m927a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        attributeSet = context.obtainStyledAttributes(attributeSet, f903a, i, i2);
        try {
            if (attributeSet.hasValue(0) != 0) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, attributeSet.getResourceId(0, 0)));
            }
            attributeSet.recycle();
        } catch (Throwable th) {
            attributeSet.recycle();
        }
    }

    /* renamed from: a */
    static void m926a(View view, float f) {
        int integer = view.getResources().getInteger(C0176g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0171b.state_collapsible, -C0171b.state_collapsed}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
