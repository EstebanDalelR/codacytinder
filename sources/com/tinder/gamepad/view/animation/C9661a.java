package com.tinder.gamepad.view.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3443i;
import p000a.p001a.C0001a;

@Deprecated
/* renamed from: com.tinder.gamepad.view.animation.a */
public class C9661a {
    @NonNull
    /* renamed from: a */
    private static C3443i f32197a = C3443i.c();

    /* renamed from: a */
    public static C1811f m40067a() {
        return f32197a.b();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    public static void m40069a(@NonNull View view, float f, float f2, long j, long j2, AnimatorListener animatorListener) {
        view.setOnTouchListener(new C9662b(view, f, f2, j, animatorListener, j2));
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m40070a(@NonNull View view, float f, float f2, long j, AnimatorListener animatorListener, long j2, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    C9661a.m40066a(view, f, f2, j, animatorListener).start();
                    break;
                case 1:
                    break;
                default:
                    C0001a.b("motion event not recognized", new Object[0]);
                    break;
            }
        }
        C9661a.m40071b(view, f, f2, j2, animatorListener).start();
        return false;
    }

    /* renamed from: a */
    public static void m40068a(@NonNull View view, float f, float f2, long j, long j2) {
        C9661a.m40069a(view, f, f2, j, j2, null);
    }

    @NonNull
    /* renamed from: a */
    private static AnimatorSet m40066a(View view, float f, float f2, long j, @Nullable AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f, f2});
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f, f2});
        f = new AnimatorSet();
        f.playTogether(new Animator[]{ofFloat, view});
        f.setDuration(j);
        if (animatorListener != null) {
            f.addListener(animatorListener);
        }
        return f;
    }

    @NonNull
    /* renamed from: b */
    private static AnimatorSet m40071b(View view, float f, float f2, long j, @Nullable AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f2, f});
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f2, f});
        f = new AnimatorSet();
        f.playTogether(new Animator[]{ofFloat, view});
        f.setDuration(j);
        f.setInterpolator(new OvershootInterpolator(4.0f));
        if (animatorListener != null) {
            f.addListener(animatorListener);
        }
        return f;
    }
}
