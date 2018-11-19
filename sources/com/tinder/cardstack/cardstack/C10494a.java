package com.tinder.cardstack.cardstack;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.cardstack.p180a.C10456e;
import com.tinder.cardstack.p180a.C10458g;
import com.tinder.cardstack.p180a.C12645c;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.cardstack.swipe.CardAnimation;
import com.tinder.cardstack.swipe.CardAnimation.AnimationType;
import com.tinder.cardstack.swipe.CardAnimator;
import com.tinder.cardstack.view.CardStackLayout.CardRewindAnimationStateListener;
import com.tinder.cardstack.view.CardViewHolder;

/* renamed from: com.tinder.cardstack.cardstack.a */
class C10494a extends ItemAnimator {
    /* renamed from: e */
    private static final CardRewindAnimationStateListener f34131e = new C104904();
    /* renamed from: a */
    private final String f34132a = C10494a.class.getSimpleName();
    @NonNull
    /* renamed from: b */
    private CardRewindAnimationStateListener f34133b = f34131e;
    @NonNull
    /* renamed from: c */
    private final CardAnimator f34134c;
    /* renamed from: d */
    private int f34135d = 0;

    /* renamed from: com.tinder.cardstack.cardstack.a$4 */
    static class C104904 implements CardRewindAnimationStateListener {
        public void onRewindAnimationEnded(View view) {
        }

        public void onRewindAnimationProgress(View view, float f) {
        }

        public void onRewindAnimationStarted(View view) {
        }

        C104904() {
        }
    }

    /* renamed from: com.tinder.cardstack.cardstack.a$a */
    private class C10491a extends C8394e implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C10494a f34117a;
        /* renamed from: b */
        private final View f34118b;

        C10491a(C10494a c10494a, View view) {
            this.f34117a = c10494a;
            this.f34118b = view;
        }

        public void onAnimationStart(Animator animator) {
            this.f34117a.f34133b.onRewindAnimationStarted(this.f34118b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f34117a.f34133b.onRewindAnimationEnded(this.f34118b);
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34117a.f34133b.onRewindAnimationProgress(this.f34118b, valueAnimator.getAnimatedFraction());
        }

        public void onAnimationCancel(Animator animator) {
            this.f34117a.f34133b.onRewindAnimationEnded(this.f34118b);
        }
    }

    public void endAnimation(ViewHolder viewHolder) {
    }

    public void endAnimations() {
    }

    public void runPendingAnimations() {
    }

    C10494a(@NonNull CardAnimator cardAnimator) {
        this.f34134c = cardAnimator;
    }

    public boolean animateDisappearance(@NonNull final ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2) {
        itemHolderInfo = this.f34134c.m35811a(viewHolder);
        itemHolderInfo2 = m42411b(viewHolder);
        if (itemHolderInfo != null && itemHolderInfo2 != null) {
            itemHolderInfo.m35788a(true);
            if (itemHolderInfo.m35806r() && itemHolderInfo.m35797i() == AnimationType.SWIPE_OUT) {
                this.f34135d += 1;
                itemHolderInfo.m35785a(new C8394e(this) {
                    /* renamed from: b */
                    final /* synthetic */ C10494a f34114b;

                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        this.f34114b.f34135d = this.f34114b.f34135d - 1;
                        this.f34114b.dispatchAnimationFinished(viewHolder);
                    }
                });
                return true;
            } else if (!itemHolderInfo.m35806r() && itemHolderInfo.m35797i() == AnimationType.RECOVER) {
                this.f34134c.m35817b(itemHolderInfo.m35783a());
                m42409a(viewHolder, itemHolderInfo2);
            } else if (itemHolderInfo.m35806r() && itemHolderInfo.m35797i() == AnimationType.RECOVER) {
                this.f34134c.m35817b(viewHolder);
                m42409a(viewHolder, itemHolderInfo2);
            } else {
                this.f34134c.m35817b(viewHolder);
                dispatchAnimationFinished(itemHolderInfo.m35783a());
            }
        } else if (itemHolderInfo2 != null) {
            m42409a(viewHolder, itemHolderInfo2);
            return true;
        } else {
            ViewCompat.c(viewHolder.itemView, null);
            dispatchAnimationFinished(viewHolder);
        }
        return null;
    }

    public boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        ViewHolder viewHolder2 = viewHolder;
        CardAnimation a = this.f34134c.m35811a(viewHolder2);
        C8361a a2 = m42408a(viewHolder);
        if (a != null) {
            r12.f34134c.m35817b(viewHolder2);
        }
        ViewCompat.c(viewHolder2.itemView, 1.0f);
        if (a2 != null) {
            r12.f34135d++;
            float startX = a2.startX();
            float startY = a2.startY();
            float endX = a2.endX();
            float endY = a2.endY();
            float startRotation = a2.startRotation();
            float endRotation = a2.endRotation();
            ViewHolder viewHolder3 = viewHolder2;
            CardAnimation cardAnimation = a;
            final ViewHolder viewHolder4 = viewHolder2;
            a = new CardAnimation(r12, viewHolder3, AnimationType.RECOVER, new PointF(startX, startY), startX, startY, endX, endY, startRotation, endRotation) {
                /* renamed from: b */
                final /* synthetic */ C10494a f34116b;

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    this.f34116b.f34135d = this.f34116b.f34135d - 1;
                    this.f34116b.dispatchAnimationFinished(viewHolder4);
                }
            };
            if (a2.durationMilli() > 0) {
                cardAnimation.m35784a((long) a2.durationMilli());
            }
            TimeInterpolator interpolator = a2.interpolator();
            if (interpolator != null) {
                cardAnimation.m35786a(interpolator);
            }
            if (m42410a(a2)) {
                AnimatorUpdateListener c10491a = new C10491a(r12, viewHolder2.itemView);
                cardAnimation.m35785a((AnimatorListener) c10491a);
                cardAnimation.m35787a(c10491a);
            }
            r12.f34134c.m35815a(cardAnimation);
            cardAnimation.m35799k();
            return true;
        }
        dispatchAnimationFinished(viewHolder);
        return false;
    }

    public boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        dispatchAnimationFinished(viewHolder);
        return null;
    }

    public boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        dispatchAnimationFinished(viewHolder);
        if (viewHolder != viewHolder2) {
            dispatchAnimationFinished(viewHolder2);
        }
        return null;
    }

    public boolean isRunning() {
        return this.f34135d != 0;
    }

    public void onAnimationStarted(ViewHolder viewHolder) {
        super.onAnimationStarted(viewHolder);
    }

    public void onAnimationFinished(ViewHolder viewHolder) {
        super.onAnimationFinished(viewHolder);
    }

    /* renamed from: a */
    public void m42414a(@NonNull CardRewindAnimationStateListener cardRewindAnimationStateListener) {
        this.f34133b = cardRewindAnimationStateListener;
    }

    /* renamed from: a */
    public void m42413a() {
        this.f34133b = f34131e;
    }

    @Nullable
    /* renamed from: a */
    private C8361a m42408a(@NonNull ViewHolder viewHolder) {
        return viewHolder instanceof CardViewHolder ? ((CardViewHolder) viewHolder).getAppearingAnimation() : null;
    }

    @Nullable
    /* renamed from: b */
    private C8361a m42411b(@NonNull ViewHolder viewHolder) {
        return viewHolder instanceof CardViewHolder ? ((CardViewHolder) viewHolder).getDisappearingAnimation() : null;
    }

    /* renamed from: a */
    private void m42409a(ViewHolder viewHolder, C8361a c8361a) {
        float f;
        float endRotation;
        this.f34135d++;
        final ViewHolder viewHolder2 = viewHolder;
        View view = viewHolder2.itemView;
        float i = ViewCompat.i(view);
        float j = ViewCompat.j(view);
        float n = ViewCompat.n(view);
        if (i == 0.0f) {
            i = c8361a.startX();
        }
        float f2 = i;
        float endX = c8361a.endX();
        if (j != 0.0f) {
            f = j;
        } else {
            f = c8361a.startY();
        }
        float endY = c8361a.endY();
        if (n == 0.0f) {
            n = c8361a.startRotation();
        }
        float f3 = n;
        if (c8361a.endRotation() != -2.14748365E9f || f3 == -2.14748365E9f) {
            endRotation = c8361a.endRotation();
        } else {
            endRotation = f3;
        }
        ViewHolder viewHolder3 = viewHolder2;
        CardAnimation c126503 = new C10498f(r12, viewHolder3, AnimationType.SWIPE_OUT, new PointF(f2, f), f2, f, endX, endY, f3, endRotation) {
            /* renamed from: b */
            final /* synthetic */ C10494a f40787b;

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f40787b.f34135d = this.f40787b.f34135d - 1;
                this.f40787b.dispatchAnimationFinished(viewHolder2);
            }
        };
        if (c8361a.durationMilli() > 0) {
            c126503.m35784a((long) c8361a.durationMilli());
        }
        TimeInterpolator interpolator = c8361a.interpolator();
        if (interpolator != null) {
            c126503.m35786a(interpolator);
        }
        c126503.m35788a(true);
        r12.f34134c.m35815a(c126503);
        c126503.m35799k();
    }

    /* renamed from: a */
    private boolean m42410a(C8361a c8361a) {
        if (!((c8361a instanceof C12645c) || (c8361a instanceof C10456e))) {
            if ((c8361a instanceof C10458g) == null) {
                return null;
            }
        }
        return true;
    }
}
