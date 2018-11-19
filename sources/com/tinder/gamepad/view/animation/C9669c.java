package com.tinder.gamepad.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u0000 %2\u00020\u0001:\u0001%B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u001c\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0002J<\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0002J<\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0002J\"\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0002J\u0006\u0010!\u001a\u00020\u0010J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010$\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/gamepad/view/animation/GamepadCounterAnimation;", "", "frame", "Landroid/view/View;", "icon", "text", "gamepadAnimationListener", "Lcom/tinder/gamepad/view/animation/GamepadAnimationListener;", "startDelayMS", "", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tinder/gamepad/view/animation/GamepadAnimationListener;J)V", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "rotationAnimationSet", "Landroid/animation/AnimatorSet;", "addAnimationListener", "", "cancel", "createAnimation", "reverse", "", "startDelay", "createContentScaleAnimator", "Landroid/animation/ValueAnimator;", "from", "", "to", "frontView", "backView", "isReverse", "delayMs", "createContentTranslationAnimator", "createFrameScaleAnimator", "removeListener", "resetView", "setListener", "start", "Companion", "gamepad_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepad.view.animation.c */
public final class C9669c {
    /* renamed from: a */
    public static final C9663a f32217a = new C9663a();
    /* renamed from: b */
    private final AccelerateDecelerateInterpolator f32218b;
    /* renamed from: c */
    private final AnimatorSet f32219c;
    /* renamed from: d */
    private final View f32220d;
    /* renamed from: e */
    private final View f32221e;
    /* renamed from: f */
    private final View f32222f;
    /* renamed from: g */
    private GamepadAnimationListener f32223g;
    /* renamed from: h */
    private final long f32224h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/gamepad/view/animation/GamepadCounterAnimation$Companion;", "", "()V", "DURATION_MS", "", "gamepad_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.animation.c$a */
    public static final class C9663a {
        private C9663a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/gamepad/view/animation/GamepadCounterAnimation$addAnimationListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/gamepad/view/animation/GamepadCounterAnimation;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "gamepad_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.animation.c$b */
    public static final class C9664b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C9669c f32204a;

        C9664b(C9669c c9669c) {
            this.f32204a = c9669c;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            animator = this.f32204a.f32223g;
            if (animator != null) {
                animator.onAnimationFinished();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/gamepad/view/animation/GamepadCounterAnimation$createAnimation$visibilityAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.animation.c$c */
    static final class C9665c implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C9669c f32205a;
        /* renamed from: b */
        final /* synthetic */ boolean f32206b;

        C9665c(C9669c c9669c, boolean z) {
            this.f32205a = c9669c;
            this.f32206b = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            } else if (((Float) valueAnimator).floatValue() < 0.5f) {
            } else {
                if (this.f32206b != null) {
                    this.f32205a.f32221e.setVisibility(0);
                    this.f32205a.f32222f.setVisibility(4);
                    return;
                }
                this.f32205a.f32221e.setVisibility(4);
                this.f32205a.f32222f.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/gamepad/view/animation/GamepadCounterAnimation$createContentScaleAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.animation.c$d */
    static final class C9666d implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ long f32207a;
        /* renamed from: b */
        final /* synthetic */ boolean f32208b;
        /* renamed from: c */
        final /* synthetic */ View f32209c;
        /* renamed from: d */
        final /* synthetic */ View f32210d;

        C9666d(long j, boolean z, View view, View view2) {
            this.f32207a = j;
            this.f32208b = z;
            this.f32209c = view;
            this.f32210d = view2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            if (this.f32208b) {
                this.f32209c.setScaleX(valueAnimator);
            } else {
                this.f32210d.setScaleX(valueAnimator);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/gamepad/view/animation/GamepadCounterAnimation$createContentTranslationAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.animation.c$e */
    static final class C9667e implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ long f32211a;
        /* renamed from: b */
        final /* synthetic */ boolean f32212b;
        /* renamed from: c */
        final /* synthetic */ View f32213c;
        /* renamed from: d */
        final /* synthetic */ View f32214d;

        C9667e(long j, boolean z, View view, View view2) {
            this.f32211a = j;
            this.f32212b = z;
            this.f32213c = view;
            this.f32214d = view2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            if (this.f32212b) {
                this.f32213c.setTranslationX(valueAnimator);
            } else {
                this.f32214d.setTranslationX(valueAnimator);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/gamepad/view/animation/GamepadCounterAnimation$createFrameScaleAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepad.view.animation.c$f */
    static final class C9668f implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C9669c f32215a;
        /* renamed from: b */
        final /* synthetic */ long f32216b;

        C9668f(C9669c c9669c, long j) {
            this.f32215a = c9669c;
            this.f32216b = j;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View d = this.f32215a.f32220d;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            d.setScaleX(((Float) valueAnimator).floatValue());
        }
    }

    public C9669c(@NotNull View view, @NotNull View view2, @NotNull View view3, @Nullable GamepadAnimationListener gamepadAnimationListener, long j) {
        C2668g.b(view, "frame");
        C2668g.b(view2, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(view3, ManagerWebServices.PARAM_TEXT);
        this.f32220d = view;
        this.f32221e = view2;
        this.f32222f = view3;
        this.f32223g = gamepadAnimationListener;
        this.f32224h = j;
        this.f32218b = new AccelerateDecelerateInterpolator();
        this.f32219c = new AnimatorSet();
    }

    public /* synthetic */ C9669c(View view, View view2, View view3, GamepadAnimationListener gamepadAnimationListener, long j, int i, C15823e c15823e) {
        if ((i & 8) != null) {
            gamepadAnimationListener = null;
        }
        GamepadAnimationListener gamepadAnimationListener2 = gamepadAnimationListener;
        if ((i & 16) != null) {
            j = 0;
        }
        this(view, view2, view3, gamepadAnimationListener2, j);
    }

    /* renamed from: a */
    public final void m40086a() {
        this.f32219c.removeAllListeners();
        AnimatorSet a = C9669c.m40072a(this, false, 0, 2, null);
        AnimatorSet a2 = m40073a(true, 3200);
        this.f32219c.playTogether(new Animator[]{a, a2});
        this.f32219c.setStartDelay(this.f32224h);
        m40083c();
        this.f32219c.start();
    }

    /* renamed from: b */
    public final void m40087b() {
        if (this.f32219c.isRunning()) {
            this.f32223g = (GamepadAnimationListener) null;
            this.f32219c.removeAllListeners();
            this.f32219c.cancel();
            m40085d();
        }
    }

    /* renamed from: c */
    private final void m40083c() {
        if (this.f32223g != null) {
            this.f32219c.addListener(new C9664b(this));
        }
    }

    /* renamed from: a */
    static /* synthetic */ AnimatorSet m40072a(C9669c c9669c, boolean z, long j, int i, Object obj) {
        if ((i & 1) != null) {
            z = false;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        return c9669c.m40073a(z, j);
    }

    /* renamed from: a */
    private final AnimatorSet m40073a(boolean z, long j) {
        float width = ((float) this.f32220d.getWidth()) * 0.245f;
        ValueAnimator a = C9669c.m40076a(this, 1.0f, 0.49f, 0, 4, null);
        ValueAnimator a2 = m40074a(0.49f, 1.0f, 100);
        boolean z2 = z;
        ValueAnimator a3 = C9669c.m40077a(this, 0.0f, width, this.f32221e, this.f32222f, z2, 0, 32, null);
        ValueAnimator a4 = m40075a(-width, 0.0f, this.f32222f, this.f32221e, z2, 100);
        ValueAnimator b = C9669c.m40080b(this, 1.0f, 0.0f, this.f32221e, this.f32222f, z2, 0, 32, null);
        ValueAnimator b2 = m40079b(0.0f, 1.0f, this.f32222f, this.f32221e, z2, 100);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addUpdateListener(new C9665c(this, z));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, a2, a3, a4, b, b2, ofFloat});
        animatorSet.setInterpolator(this.f32218b);
        animatorSet.setStartDelay(j);
        return animatorSet;
    }

    /* renamed from: a */
    static /* synthetic */ ValueAnimator m40076a(C9669c c9669c, float f, float f2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        return c9669c.m40074a(f, f2, j);
    }

    /* renamed from: a */
    private final ValueAnimator m40074a(float f, float f2, long j) {
        f = ValueAnimator.ofFloat(new float[]{f, f2});
        f.setDuration(100);
        f.setStartDelay(j);
        f.addUpdateListener((AnimatorUpdateListener) new C9668f(this, j));
        C2668g.a(f, "ValueAnimator.ofFloat(fr…t\n            }\n        }");
        return f;
    }

    /* renamed from: a */
    static /* synthetic */ ValueAnimator m40077a(C9669c c9669c, float f, float f2, View view, View view2, boolean z, long j, int i, Object obj) {
        return c9669c.m40075a(f, f2, view, view2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0 : j);
    }

    /* renamed from: a */
    private final ValueAnimator m40075a(float f, float f2, View view, View view2, boolean z, long j) {
        f = ValueAnimator.ofFloat(new float[]{f, f2});
        f.setDuration(100);
        f.setStartDelay(j);
        f.addUpdateListener(new C9667e(j, z, view2, view));
        C2668g.a(f, "ValueAnimator.ofFloat(fr…}\n            }\n        }");
        return f;
    }

    /* renamed from: b */
    static /* synthetic */ ValueAnimator m40080b(C9669c c9669c, float f, float f2, View view, View view2, boolean z, long j, int i, Object obj) {
        return c9669c.m40079b(f, f2, view, view2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0 : j);
    }

    /* renamed from: b */
    private final ValueAnimator m40079b(float f, float f2, View view, View view2, boolean z, long j) {
        f = ValueAnimator.ofFloat(new float[]{f, f2});
        f.setDuration(100);
        f.setStartDelay(j);
        f.addUpdateListener(new C9666d(j, z, view2, view));
        C2668g.a(f, "ValueAnimator.ofFloat(fr…}\n            }\n        }");
        return f;
    }

    /* renamed from: d */
    private final void m40085d() {
        this.f32220d.setScaleX(1.0f);
        this.f32221e.setScaleX(1.0f);
        this.f32222f.setScaleX(1.0f);
        this.f32221e.setTranslationX(0.0f);
        this.f32222f.setTranslationX(0.0f);
        this.f32221e.setVisibility(0);
        this.f32222f.setVisibility(4);
    }
}
