package com.tinder.reactions.gestures.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.R;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.gestures.common.C14664b;
import com.tinder.reactions.gestures.common.C14666c;
import com.tinder.reactions.p389d.C14618a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/reactions/gestures/view/PullAndReleaseAnimationView;", "Lcom/tinder/reactions/gestures/view/GrandGestureAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "grandGestureAnimationPulser", "Lcom/tinder/reactions/gestures/common/GrandGestureAnimationPulser;", "isGoingBackToNeutral", "", "marginBottom", "", "progressAtTouchUp", "reverseToNeutralAnimationListener", "Landroid/animation/AnimatorListenerAdapter;", "dispatchGestureActivatedEventAfterDelay", "", "delayMs", "", "goBackToNeutral", "isMeasured", "isWithinProgressLimits", "scaledProgress", "onAttachedToWindow", "onDetachedFromWindow", "release", "removeReverseAnimationListenerAndStopPulsing", "resetProgress", "shouldRelease", "startPulsing", "Companion", "PullAndReleaseOnTouchDelegate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PullAndReleaseAnimationView extends GrandGestureAnimationView {
    /* renamed from: a */
    public static final C14669a f59381a = new C14669a();
    /* renamed from: b */
    private final float f59382b = getResources().getDimension(R.dimen.pull_and_release_bottom_margin);
    /* renamed from: c */
    private boolean f59383c;
    /* renamed from: d */
    private float f59384d;
    /* renamed from: e */
    private final C14664b f59385e = new C14664b(this, 0.0f, 0.03f, 0, 0.0f, 24, null);
    /* renamed from: f */
    private final AnimatorListenerAdapter f59386f = ((AnimatorListenerAdapter) new C14671e(this));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/gestures/view/PullAndReleaseAnimationView$Companion;", "", "()V", "ANIMATION_SPEED_FOR_REVERSING", "", "DEFAULT_ANIMATION_SPEED", "GRAND_GESTURE_ACTIVATION_DELAY_MS", "", "MAX_PROGRESS_FOR_ANIMATION_PULSE", "PROGRESS_AT_MAX_PULL", "PROGRESS_AT_NEUTRAL_PULL", "PROGRESS_DIFFERENCE_THRESHOLD_FOR_RELEASE", "", "SIDE_TOUCH_AREA_CUTOFF_FACTOR", "TOP_TOUCH_AREA_CUTOFF_FACTOR", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.PullAndReleaseAnimationView$a */
    public static final class C14669a {
        private C14669a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/reactions/gestures/view/PullAndReleaseAnimationView$release$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/gestures/view/PullAndReleaseAnimationView;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.PullAndReleaseAnimationView$d */
    public static final class C14670d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PullAndReleaseAnimationView f46246a;

        C14670d(PullAndReleaseAnimationView pullAndReleaseAnimationView) {
            this.f46246a = pullAndReleaseAnimationView;
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            this.f46246a.b(this);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f46246a.b(this);
            this.f46246a.mo14139i();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/reactions/gestures/view/PullAndReleaseAnimationView$reverseToNeutralAnimationListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/gestures/view/PullAndReleaseAnimationView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.PullAndReleaseAnimationView$e */
    public static final class C14671e extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ PullAndReleaseAnimationView f46247a;

        C14671e(PullAndReleaseAnimationView pullAndReleaseAnimationView) {
            this.f46247a = pullAndReleaseAnimationView;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            super.onAnimationStart(animator);
            this.f46247a.f59383c = true;
            this.f46247a.f59385e.m55903b();
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            this.f46247a.f59383c = false;
            this.f46247a.b(this);
            this.f46247a.setSpeed(1.0f);
            this.f46247a.m68098p();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/gestures/view/PullAndReleaseAnimationView$PullAndReleaseOnTouchDelegate;", "Lcom/tinder/reactions/gestures/common/GrandGestureTouchDelegate;", "view", "Landroid/view/View;", "(Lcom/tinder/reactions/gestures/view/PullAndReleaseAnimationView;Landroid/view/View;)V", "actionMoveNotTriggered", "", "pullableArea", "Landroid/graphics/Rect;", "calculateNewProgress", "", "newY", "checkEventAndTriggerIncorrectInteraction", "", "event", "Landroid/view/MotionEvent;", "handleActionDown", "handleActionMove", "handleActionMoveNotTriggered", "handleActionUp", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.PullAndReleaseAnimationView$b */
    private final class C16354b extends C14666c {
        /* renamed from: a */
        final /* synthetic */ PullAndReleaseAnimationView f50875a;
        /* renamed from: b */
        private final Rect f50876b;
        /* renamed from: c */
        private boolean f50877c;

        public C16354b(PullAndReleaseAnimationView pullAndReleaseAnimationView, @NotNull View view) {
            C2668g.b(view, "view");
            this.f50875a = pullAndReleaseAnimationView;
            super(view);
            float bottom = (((float) view.getBottom()) - (((float) view.getBottom()) * 0.3f)) - pullAndReleaseAnimationView.f59382b;
            float bottom2 = ((float) view.getBottom()) - pullAndReleaseAnimationView.f59382b;
            pullAndReleaseAnimationView = ((float) view.getRight()) * 0.43f;
            this.f50876b = new Rect((int) (((float) view.getLeft()) + pullAndReleaseAnimationView), (int) bottom, (int) (((float) view.getRight()) - pullAndReleaseAnimationView), (int) bottom2);
        }

        /* renamed from: c */
        protected void mo11973c(@NotNull View view, @NotNull MotionEvent motionEvent) {
            C2668g.b(view, "view");
            C2668g.b(motionEvent, "event");
            this.f50877c = true;
            if (this.f50876b.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY())) != null) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                this.f50875a.f();
                this.f50875a.m68099q();
            }
        }

        /* renamed from: a */
        protected void mo11970a(@NotNull View view, @NotNull MotionEvent motionEvent) {
            C2668g.b(view, "view");
            C2668g.b(motionEvent, "event");
            view.getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f50877c) {
                m61695d(view, motionEvent);
                return;
            }
            this.f50875a.f59384d = m61694a(motionEvent.getY());
            if (this.f50875a.f59384d <= null) {
                this.f50875a.m67182j();
                this.f50875a.m68098p();
            } else if (this.f50875a.m68097o() != null) {
                this.f50875a.m68095m();
            } else if (this.f50875a.getProgress() != null && this.f50875a.getProgress() < 1043878380) {
                this.f50875a.m67182j();
                this.f50875a.m68094l();
            } else if (this.f50875a.getProgress() > 1043878380) {
                this.f50875a.mo14139i();
            }
        }

        /* renamed from: b */
        protected void mo11972b(@NotNull View view, @NotNull MotionEvent motionEvent) {
            C2668g.b(view, "view");
            C2668g.b(motionEvent, "event");
            float y = motionEvent.getY();
            if (this.f50876b.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) y)) != null) {
                this.f50877c = null;
                this.f50875a.f();
                this.f50875a.m68099q();
                view = m61694a(y);
                if (this.f50875a.m68084a((float) view) != null) {
                    this.f50875a.setProgress(view);
                }
            }
        }

        /* renamed from: d */
        private final void m61695d(View view, MotionEvent motionEvent) {
            m61696e(view, motionEvent);
            if (this.f50875a.getProgress() > 1022739087 && this.f50875a.getProgress() <= 1043878380) {
                this.f50875a.m68094l();
            } else if (this.f50875a.getProgress() > 1043878380) {
                this.f50875a.mo14139i();
            } else {
                this.f50875a.m68098p();
            }
        }

        /* renamed from: e */
        private final void m61696e(View view, MotionEvent motionEvent) {
            if (this.f50876b.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY())) != null) {
                this.f50875a.m67182j();
            }
        }

        /* renamed from: a */
        private final float m61694a(float f) {
            return C14618a.f46122a.m55773a(f, (float) this.f50876b.bottom, (float) this.f50876b.top, 0.0f, 0.18f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.PullAndReleaseAnimationView$3 */
    static final class C187483<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C187483 f58246a = new C187483();

        C187483() {
        }

        public /* synthetic */ void call(Object obj) {
            m67185a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67185a(Throwable th) {
            C0001a.c(th, "Error observing layout changes for pull and release gesture", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.PullAndReleaseAnimationView$c */
    static final class C18749c<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ PullAndReleaseAnimationView f58247a;

        C18749c(PullAndReleaseAnimationView pullAndReleaseAnimationView) {
            this.f58247a = pullAndReleaseAnimationView;
        }

        public /* synthetic */ void call(Object obj) {
            m67186a((Long) obj);
        }

        /* renamed from: a */
        public final void m67186a(Long l) {
            this.f58247a.m67183k();
        }
    }

    /* renamed from: a */
    private final boolean m68084a(float f) {
        return f >= 0.0f && f <= 0.18f;
    }

    public PullAndReleaseAnimationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        View view = this;
        C5707b.c(view).j(C14612a.f46118a.m55756a(view)).f((Func1) new Func1<Void, Boolean>() {
            public /* synthetic */ Object call(Object obj) {
                return Boolean.valueOf(m65342a((Void) obj));
            }

            /* renamed from: a */
            public final boolean m65342a(Void voidR) {
                return this.m68096n();
            }
        }).c(1).a(C19397a.a()).a((Action1) new Action1<Void>() {
            public /* synthetic */ void call(Object obj) {
                m67184a((Void) obj);
            }

            /* renamed from: a */
            public final void m67184a(Void voidR) {
                this.setOnTouchListener(new C16354b(this, this));
            }
        }, C187483.f58246a);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m68098p();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m68099q();
    }

    /* renamed from: i */
    public void mo14139i() {
        super.mo14139i();
        m68098p();
    }

    /* renamed from: l */
    private final void m68094l() {
        b(this.f59386f);
        a(this.f59386f);
        setSpeed(-1.0f);
        a(0.0f, getProgress());
    }

    /* renamed from: m */
    private final void m68095m() {
        m68080a(100);
        d();
        a(new C14670d(this));
    }

    /* renamed from: a */
    private final void m68080a(long j) {
        Observable.b(j, TimeUnit.MILLISECONDS).j(C14612a.f46118a.m55756a(this)).a(C19397a.a()).d(new C18749c(this));
    }

    /* renamed from: n */
    private final boolean m68096n() {
        return getMeasuredHeight() > 0 && getMeasuredWidth() > 0;
    }

    /* renamed from: o */
    private final boolean m68097o() {
        return ((double) (0.18f - this.f59384d)) <= 0.02d;
    }

    /* renamed from: p */
    private final void m68098p() {
        if (!this.f59383c) {
            this.f59385e.m55902a();
        }
    }

    /* renamed from: q */
    private final void m68099q() {
        b(this.f59386f);
        this.f59385e.m55903b();
    }
}
