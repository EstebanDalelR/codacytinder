package com.tinder.reactions.gestures.common;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.ranges.C18464j;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ>\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\rH\u0002J \u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0002J\b\u0010)\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0002J \u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0018\u0010.\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010/\u001a\u000200H\u0014J\u0018\u00101\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010/\u001a\u000200H\u0014J\u0018\u00102\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010/\u001a\u000200H\u0014J0\u00103\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00032\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0014J\u0006\u00107\u001a\u00020\u001fR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/tinder/reactions/gestures/common/FlingAndResetViewOnTouchDelegate;", "Lcom/tinder/reactions/gestures/common/GrandGestureTouchDelegate;", "flingableComponent", "Landroid/view/View;", "flingComponentPositionChangedListener", "Lcom/tinder/reactions/gestures/common/FlingComponentPositionChangedListener;", "flingInteractionEventListener", "Lcom/tinder/reactions/gestures/common/FlingInteractionEventListener;", "flingableComponentHeight", "", "flingableComponentWidth", "(Landroid/view/View;Lcom/tinder/reactions/gestures/common/FlingComponentPositionChangedListener;Lcom/tinder/reactions/gestures/common/FlingInteractionEventListener;FF)V", "actionMoveNotTriggered", "", "dX", "dY", "flingGlideAnimationListener", "com/tinder/reactions/gestures/common/FlingAndResetViewOnTouchDelegate$flingGlideAnimationListener$1", "Lcom/tinder/reactions/gestures/common/FlingAndResetViewOnTouchDelegate$flingGlideAnimationListener$1;", "flingGlideEndX", "flingGlideEndY", "hasFlung", "originX", "originY", "resetPositionGlideAnimationListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "getResetPositionGlideAnimationListener", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "shouldIgnoreCurrentTouchEvent", "verticalDragLimit", "animateView", "", "view", "newX", "newY", "interpolator", "Landroid/view/animation/Interpolator;", "durationMs", "", "isResetToOriginAnimation", "animateViewTo", "flingableViewNotAtOrigin", "glideViewToOriginalPosition", "glideViewToVerticalLimit", "startY", "velocityY", "handleActionDown", "event", "Landroid/view/MotionEvent;", "handleActionMove", "handleActionUp", "handleOnFling", "downEvent", "moveEvent", "velocityX", "resetToOriginalPosition", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.common.a */
public final class C16349a extends C14666c {
    /* renamed from: a */
    private boolean f50855a;
    /* renamed from: b */
    private boolean f50856b;
    /* renamed from: c */
    private float f50857c;
    /* renamed from: d */
    private float f50858d;
    /* renamed from: e */
    private final float f50859e = this.f50866l.getX();
    /* renamed from: f */
    private final float f50860f = this.f50866l.getY();
    /* renamed from: g */
    private final float f50861g = (this.f50859e * 1070386381);
    /* renamed from: h */
    private final float f50862h;
    /* renamed from: i */
    private final float f50863i;
    /* renamed from: j */
    private final C14661a f50864j;
    /* renamed from: k */
    private boolean f50865k;
    /* renamed from: l */
    private final View f50866l;
    /* renamed from: m */
    private final FlingComponentPositionChangedListener f50867m;
    /* renamed from: n */
    private final FlingInteractionEventListener f50868n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/reactions/gestures/common/FlingAndResetViewOnTouchDelegate$flingGlideAnimationListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/gestures/common/FlingAndResetViewOnTouchDelegate;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.common.a$a */
    public static final class C14661a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C16349a f46228a;

        C14661a(C16349a c16349a) {
            this.f46228a = c16349a;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46228a.f50868n.verticalLimitReached();
            this.f46228a.f50855a = false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.common.a$b */
    static final class C14662b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C16349a f46229a;

        C14662b(C16349a c16349a) {
            this.f46229a = c16349a;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            this.f46229a.f50867m.verticalPositionChangedOnGlide(Math.abs(((Float) valueAnimator).floatValue()), this.f46229a.f50855a ? this.f46229a.f50863i : this.f46229a.f50861g, this.f46229a.f50860f);
        }
    }

    public C16349a(@NotNull View view, @NotNull FlingComponentPositionChangedListener flingComponentPositionChangedListener, @NotNull FlingInteractionEventListener flingInteractionEventListener, float f, float f2) {
        C2668g.b(view, "flingableComponent");
        C2668g.b(flingComponentPositionChangedListener, "flingComponentPositionChangedListener");
        C2668g.b(flingInteractionEventListener, "flingInteractionEventListener");
        super(view);
        this.f50866l = view;
        this.f50867m = flingComponentPositionChangedListener;
        this.f50868n = flingInteractionEventListener;
        this.f50862h = this.f50859e - (f2 / ((float) 4));
        this.f50863i = this.f50861g - (f / ((float) 2));
        this.f50864j = new C14661a(this);
    }

    /* renamed from: b */
    private final AnimatorUpdateListener m61674b() {
        return new C14662b(this);
    }

    /* renamed from: a */
    public final void m61680a() {
        if (m61676c()) {
            m61669a(this.f50866l, this.f50859e, this.f50860f, null, 0, true);
        }
    }

    /* renamed from: a */
    protected void mo11970a(@NotNull View view, @NotNull MotionEvent motionEvent) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "event");
        view.getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f50865k == null) {
            if (this.f50856b != null) {
                this.f50868n.verticalLimitNotReached();
                return;
            }
            this.f50865k = false;
            if (this.f50855a == null) {
                this.f50868n.verticalLimitNotReached();
                m61667a(view);
            }
        }
    }

    /* renamed from: b */
    protected void mo11972b(@NotNull View view, @NotNull MotionEvent motionEvent) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "event");
        this.f50856b = false;
        if (this.f50865k) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        } else if (view.getY() <= this.f50861g) {
            this.f50865k = true;
            this.f50868n.verticalLimitReached();
        } else {
            this.f50867m.verticalPositionChangedOnDrag(view.getY(), this.f50861g, this.f50860f);
            m61668a(view, motionEvent.getRawX() + this.f50857c, motionEvent.getRawY() + this.f50858d);
        }
    }

    /* renamed from: c */
    protected void mo11973c(@NotNull View view, @NotNull MotionEvent motionEvent) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "event");
        this.f50856b = true;
        this.f50865k = false;
        this.f50857c = view.getX() - motionEvent.getRawX();
        this.f50858d = view.getY() - motionEvent.getRawY();
        view.getParent().requestDisallowInterceptTouchEvent(true);
    }

    /* renamed from: a */
    protected boolean mo11971a(@NotNull View view, @NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f, float f2) {
        C2668g.b(view, "view");
        C2668g.b(motionEvent, "downEvent");
        C2668g.b(motionEvent2, "moveEvent");
        f = motionEvent.getRawY();
        if (C18464j.m66924a((ClosedRange) new C18461c(60, 600), f - motionEvent2.getRawY()) && Math.abs(f2) > ((float) 200)) {
            this.f50855a = true;
            m61666a(f, f2, view);
            return true;
        } else if (motionEvent2.getRawY() - motionEvent.getRawY() <= ((float) 60) || Math.abs(f2) <= ((float) 200)) {
            this.f50855a = false;
            return false;
        } else {
            this.f50855a = false;
            return false;
        }
    }

    /* renamed from: a */
    private final void m61666a(float f, float f2, View view) {
        View view2 = view;
        C16349a.m61670a(this, view2, this.f50862h, this.f50863i, null, (long) (Math.abs((f2 * 0.75f) / Math.abs(f - this.f50863i)) + ((float) 100)), true, 8, null);
    }

    /* renamed from: a */
    private final void m61667a(View view) {
        m61669a(view, this.f50859e, this.f50860f, new DecelerateInterpolator(2.5f), 340, true);
    }

    /* renamed from: a */
    private final void m61668a(View view, float f, float f2) {
        C16349a.m61670a(this, view, f, f2, null, 0, false, 24, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m61670a(C16349a c16349a, View view, float f, float f2, Interpolator interpolator, long j, boolean z, int i, Object obj) {
        c16349a.m61669a(view, f, f2, (i & 8) != 0 ? (Interpolator) null : interpolator, (i & 16) != 0 ? 0 : j, z);
    }

    /* renamed from: a */
    private final void m61669a(View view, float f, float f2, Interpolator interpolator, long j, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        f = ObjectAnimator.ofFloat(view, View.X, new float[]{f});
        view = ObjectAnimator.ofFloat(view, View.Y, new float[]{f2});
        animatorSet.playTogether(new Animator[]{(Animator) f, (Animator) view});
        animatorSet.setDuration(j);
        view.removeAllListeners();
        animatorSet.removeAllListeners();
        if (z) {
            animatorSet.setInterpolator(interpolator);
            view.addUpdateListener(m61674b());
        } else {
            view.removeUpdateListener(m61674b());
        }
        if (this.f50855a != null) {
            animatorSet.addListener((AnimatorListener) this.f50864j);
        } else {
            animatorSet.removeListener((AnimatorListener) this.f50864j);
        }
        animatorSet.start();
    }

    /* renamed from: c */
    private final boolean m61676c() {
        if (this.f50866l.getX() == this.f50859e) {
            if (this.f50866l.getY() == this.f50860f) {
                return false;
            }
        }
        return true;
    }
}
