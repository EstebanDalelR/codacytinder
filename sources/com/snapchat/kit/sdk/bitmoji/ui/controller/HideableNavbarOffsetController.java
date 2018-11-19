package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.animation.AccelerateInterpolator;

public class HideableNavbarOffsetController extends OnScrollListener {
    /* renamed from: a */
    private final Runnable f25849a = new C59161(this);
    /* renamed from: b */
    private final Handler f25850b = new Handler(Looper.getMainLooper());
    /* renamed from: c */
    private final OnNavbarOffsetChangeListener f25851c;
    /* renamed from: d */
    private final int f25852d;
    /* renamed from: e */
    private int f25853e = 0;
    /* renamed from: f */
    private ValueAnimator f25854f;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.HideableNavbarOffsetController$1 */
    class C59161 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ HideableNavbarOffsetController f21658a;

        /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.HideableNavbarOffsetController$1$1 */
        class C59151 implements AnimatorUpdateListener {
            /* renamed from: a */
            final /* synthetic */ C59161 f21657a;

            C59151(C59161 c59161) {
                this.f21657a = c59161;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21657a.f21658a.m30763b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        C59161(HideableNavbarOffsetController hideableNavbarOffsetController) {
            this.f21658a = hideableNavbarOffsetController;
        }

        public void run() {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f21658a.f25853e, 0});
            long a = (long) ((((float) this.f21658a.f25853e) / ((float) this.f21658a.f25852d)) * 300.0f);
            ofInt.addUpdateListener(new C59151(this));
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setDuration(a);
            ofInt.start();
            if (this.f21658a.f25854f != null) {
                this.f21658a.f25854f.cancel();
            }
            this.f21658a.f25854f = ofInt;
        }
    }

    public interface OnNavbarOffsetChangeListener {
        void onNavbarOffsetChange(int i);

        boolean shouldAdjustNavbarOffset();
    }

    public HideableNavbarOffsetController(OnNavbarOffsetChangeListener onNavbarOffsetChangeListener, int i) {
        this.f25851c = onNavbarOffsetChangeListener;
        this.f25852d = i;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.f25851c.shouldAdjustNavbarOffset() != null) {
            m30765a(this.f25853e + i2);
        }
    }

    /* renamed from: a */
    public void m30765a(int i) {
        m30763b(i);
        this.f25850b.removeCallbacks(this.f25849a);
        if (this.f25853e > 0 && this.f25853e < this.f25852d) {
            this.f25850b.postDelayed(this.f25849a, 3000);
        }
    }

    /* renamed from: b */
    private void m30763b(int i) {
        this.f25853e = Math.max(0, Math.min(i, this.f25852d));
        this.f25851c.onNavbarOffsetChange(this.f25853e);
    }
}
