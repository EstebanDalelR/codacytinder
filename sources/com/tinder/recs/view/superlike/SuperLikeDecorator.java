package com.tinder.recs.view.superlike;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.C0597f;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.CardDecorationListener;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener;
import com.tinder.recs.view.RecCardView;
import com.tinder.recs.view.RecCardView$OnTouchEventListener;

public class SuperLikeDecorator implements OnCardPairStateChangeListener {
    private static final int DISPLACEMENT_RATIO_MULTIPLIER = 2;
    private static final int MAX_SCALE = 20;
    private static final int SCALE_ANIMATION_DURATION_MS = 300;
    private static final int SCALE_ANIMATION_START_DELAY_MS = 150;
    private static final int SCALE_EXPONENTIAL = 10;
    private static final int SCALE_EXPONENTIAL_FACTOR = 4;
    @Nullable
    private RecCardView cardAbove;
    @Nullable
    private CardDecorationListenerInternal cardDecorationListenerInternal;
    private final CardStackLayout cardStackLayout;
    private final RecCardView currentCardView;
    private boolean isAboveCardTouched;
    private final boolean isRevert;
    private final SuperLikeOverlayView superLikeOverlay;
    @Nullable
    private ValueAnimator valueAnimator;

    /* renamed from: com.tinder.recs.view.superlike.SuperLikeDecorator$1 */
    class C147251 extends AnimatorListenerAdapter {
        C147251() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            SuperLikeDecorator.this.superLikeOverlay.setVisibility(8);
        }
    }

    private final class CardDecorationListenerInternal implements CardDecorationListener {
        public void onDecorationDraw(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
        }

        private CardDecorationListenerInternal() {
        }

        public void onDecorationDrawOver(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2) {
            if (SuperLikeDecorator.this.isAboveCardTouched != null || z) {
                SuperLikeDecorator.this.superLikeOverlay.scale(Math.min(20.0f, (float) Math.pow(0.0f, Math.pow((Math.sqrt(Math.pow((double) Math.abs(f), 2.0d) + Math.pow((double) Math.abs(f2), 2.0d)) / Math.sqrt(Math.pow((double) view.getWidth(), 2.0d) + Math.pow((double) view.getHeight(), 2.0d))) * 4611686018427387904, 0))));
            }
        }
    }

    private final class CardTouchListenerInternal implements RecCardView$OnTouchEventListener {
        private CardTouchListenerInternal() {
        }

        public void onTouchEvent(MotionEvent motionEvent) {
            motionEvent = C0597f.a(motionEvent);
            if (motionEvent != 3) {
                switch (motionEvent) {
                    case null:
                        SuperLikeDecorator.this.isAboveCardTouched = true;
                        return;
                    case 1:
                        break;
                    default:
                        return;
                }
            }
            SuperLikeDecorator.this.isAboveCardTouched = false;
        }
    }

    public SuperLikeDecorator(SuperLikeOverlayView superLikeOverlayView, RecCardView recCardView, CardStackLayout cardStackLayout, boolean z) {
        this.superLikeOverlay = superLikeOverlayView;
        this.currentCardView = recCardView;
        this.cardStackLayout = cardStackLayout;
        this.isRevert = z;
    }

    public void onMovedToTop() {
        destroy();
        float scale = this.superLikeOverlay.getScale();
        if (scale < 20.0f && !this.isRevert) {
            int i = this.superLikeOverlay.getScale() == 1.0f ? 150 : 0;
            long scale2 = (long) (((20.0f - this.superLikeOverlay.getScale()) * 300.0f) / 20.0f);
            this.superLikeOverlay.setVisibility(0);
            this.valueAnimator = this.superLikeOverlay.getAnimator(scale, 20.0f);
            this.valueAnimator.setStartDelay((long) i);
            this.valueAnimator.setDuration(scale2);
            this.valueAnimator.addUpdateListener(new SuperLikeDecorator$$Lambda$0(this));
            this.valueAnimator.addListener(new C147251());
            this.valueAnimator.start();
        }
    }

    final /* synthetic */ void lambda$onMovedToTop$0$SuperLikeDecorator(ValueAnimator valueAnimator) {
        this.superLikeOverlay.scale(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onPairCreated(@NonNull View view, @NonNull View view2) {
        if (view2 == this.currentCardView) {
            RecCardView recCardView = (RecCardView) view;
            this.cardAbove = recCardView;
            if (this.valueAnimator != null) {
                this.valueAnimator.cancel();
            }
            this.superLikeOverlay.setVisibility(0);
            recCardView.setOnTouchEventListener(new CardTouchListenerInternal());
            this.cardDecorationListenerInternal = new CardDecorationListenerInternal();
            this.cardStackLayout.a(this.cardAbove, this.cardDecorationListenerInternal);
        }
    }

    public void onPairDestroyed(View view, View view2) {
        if (view2 == this.currentCardView) {
            destroy();
        }
    }

    public void destroy() {
        if (this.cardAbove != null) {
            if (this.valueAnimator != null) {
                this.valueAnimator.cancel();
                this.valueAnimator = null;
            }
            if (this.cardDecorationListenerInternal == null) {
                throw new IllegalStateException("cardDecorationListenerInternal is null");
            }
            this.cardStackLayout.b(this.cardAbove, this.cardDecorationListenerInternal);
            this.superLikeOverlay.setVisibility(8);
            this.cardAbove.setOnTouchEventListener(null);
            this.cardDecorationListenerInternal = null;
            this.cardAbove = null;
        }
    }
}
