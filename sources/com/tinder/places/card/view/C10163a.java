package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Vibrator;
import android.support.v4.view.C0597f;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tinder.utils.an;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0006J(\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/places/card/view/CardPushTouchListener;", "Landroid/view/View$OnTouchListener;", "vibrator", "Landroid/os/Vibrator;", "callback", "Lkotlin/Function0;", "", "(Landroid/os/Vibrator;Lkotlin/jvm/functions/Function0;)V", "downAnimation", "Landroid/animation/AnimatorSet;", "upAnimation", "cancelAnimations", "getScaleAnimation", "view", "Landroid/view/View;", "start", "", "end", "dur", "onTouch", "", "event", "Landroid/view/MotionEvent;", "startUpAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.a */
public final class C10163a implements OnTouchListener {
    /* renamed from: a */
    private AnimatorSet f33170a;
    /* renamed from: b */
    private AnimatorSet f33171b;
    /* renamed from: c */
    private final Vibrator f33172c;
    /* renamed from: d */
    private final Function0<C15813i> f33173d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/card/view/CardPushTouchListener$startUpAnimation$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.a$a */
    public static final class C12316a extends an {
        /* renamed from: a */
        final /* synthetic */ Function0 f39887a;

        C12316a(Function0 function0) {
            this.f39887a = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            animator = this.f39887a;
            if (animator != null) {
                C15813i c15813i = (C15813i) animator.invoke();
            }
        }
    }

    public C10163a(@Nullable Vibrator vibrator, @NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "callback");
        this.f33172c = vibrator;
        this.f33173d = function0;
    }

    public /* synthetic */ C10163a(Vibrator vibrator, Function0 function0, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            vibrator = null;
        }
        this(vibrator, function0);
    }

    public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "event");
        int a = C0597f.a(motionEvent);
        int width = view.getWidth();
        int height = view.getHeight();
        Object obj = null;
        switch (a) {
            case 0:
                motionEvent = view.getScaleX();
                AnimatorSet animatorSet = this.f33171b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f33170a = m41458a(view, motionEvent, 0.96f, ((float) 150) * ((motionEvent - 0.96f) / 0.04000002f));
                view = this.f33172c;
                if (view != null) {
                    view.vibrate(25);
                }
                view = this.f33170a;
                if (view == null) {
                    return true;
                }
                view.start();
                return true;
            case 1:
                m41459a(view, this.f33173d);
                return true;
            case 2:
                a = (int) motionEvent.getX();
                motionEvent = (int) motionEvent.getY();
                if (a > 0 && motionEvent > null && a < width && motionEvent < height) {
                    obj = 1;
                }
                if (obj != null) {
                    return true;
                }
                C10163a.m41460a(this, view, null, 2, null);
                return true;
            case 3:
                C10163a.m41460a(this, view, null, 2, null);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m41460a(C10163a c10163a, View view, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c10163a.m41459a(view, function0);
    }

    /* renamed from: a */
    private final void m41459a(View view, Function0<C15813i> function0) {
        AnimatorSet animatorSet = this.f33171b;
        if (animatorSet == null || !animatorSet.isRunning()) {
            float scaleX = view.getScaleX();
            AnimatorSet animatorSet2 = this.f33170a;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f33171b = m41458a(view, scaleX, 1.0f, ((float) 150) * ((((float) 1) - scaleX) / 0.04000002f));
            view = this.f33171b;
            if (view != null) {
                view.addListener(new C12316a(function0));
            }
            view = this.f33172c;
            if (view != null) {
                view.vibrate(25);
            }
            view = this.f33171b;
            if (view != null) {
                view.start();
            }
        }
    }

    /* renamed from: a */
    public final void m41461a() {
        AnimatorSet animatorSet = this.f33171b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        animatorSet = this.f33170a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: a */
    private final AnimatorSet m41458a(View view, float f, float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f, f2});
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f, f2});
        f = new AnimatorSet();
        f.playTogether(new Animator[]{ofFloat, (Animator) view});
        f.setDuration((long) f3);
        return f;
    }
}
