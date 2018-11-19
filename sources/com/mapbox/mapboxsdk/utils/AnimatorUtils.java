package com.mapbox.mapboxsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.annotation.AnimatorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.p011a.C2890b;
import android.view.View;

public class AnimatorUtils {

    public interface OnAnimationEndListener {
        void onAnimationEnd();
    }

    public static void animate(@NonNull View view, @AnimatorRes int i, @Nullable OnAnimationEndListener onAnimationEndListener) {
        animate(view, i, -1, onAnimationEndListener);
    }

    public static void animate(final View view, @AnimatorRes int i, int i2, @Nullable final OnAnimationEndListener onAnimationEndListener) {
        if (view != null) {
            view.setLayerType(2, null);
            i = AnimatorInflater.loadAnimator(view.getContext(), i);
            if (i2 != -1) {
                i.setDuration((long) i2);
            }
            i.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    view.setLayerType(0, null);
                    if (onAnimationEndListener != null) {
                        onAnimationEndListener.onAnimationEnd();
                    }
                }
            });
            i.setTarget(view);
            i.start();
        }
    }

    public static void animate(@NonNull View view, @AnimatorRes int i) {
        animate(view, i, -1);
    }

    public static void animate(@NonNull View view, @AnimatorRes int i, int i2) {
        animate(view, i, i2, null);
    }

    public static void rotate(@NonNull final View view, float f) {
        view.setLayerType(2, null);
        f = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{view.getRotation(), f});
        f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setLayerType(0, null);
            }
        });
        f.start();
    }

    public static void rotateBy(@NonNull final View view, float f) {
        view.setLayerType(2, null);
        view.animate().rotationBy(f).setInterpolator(new C2890b()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setLayerType(0, null);
            }
        });
    }

    public static void alpha(@NonNull final View view, float f, @Nullable final OnAnimationEndListener onAnimationEndListener) {
        view.setLayerType(2, null);
        f = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), f});
        f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                view.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setLayerType(0, null);
                if (onAnimationEndListener != null) {
                    onAnimationEndListener.onAnimationEnd();
                }
            }
        });
        f.start();
    }

    public static void alpha(@NonNull View view, float f) {
        alpha(view, f, null);
    }
}
