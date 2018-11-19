package com.tinder.toppicks.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.C0432b;
import android.support.v4.view.p011a.C2890b;
import android.support.v7.widget.CardView;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.p012a.p013a.C0745a;
import com.tinder.R;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.toppicks.C15224a;
import com.tinder.toppicks.FadeAnimation;
import com.tinder.toppicks.counter.TopPicksBottomCounterView;
import com.tinder.utils.C15365p;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003@ABB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020\u000bH\u0002J\b\u0010-\u001a\u00020\u000bH\u0016J\b\u0010.\u001a\u00020\u000bH\u0002J\u0010\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000201H\u0002J\u0010\u00105\u001a\u0002032\u0006\u00100\u001a\u000201H\u0002J\u0012\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020\u000bH\u0002J\b\u0010:\u001a\u00020\u000bH\u0002J\b\u0010;\u001a\u00020\u000bH\u0002J\b\u0010<\u001a\u00020\u000bH\u0017J\u0010\u0010=\u001a\u00020*2\u0006\u0010+\u001a\u00020#H\u0002J\f\u0010>\u001a\u00020?*\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "analyticsSource", "", "paywallListener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "(Landroid/content/Context;ILcom/tinder/paywall/legacy/ListenerPaywall;)V", "animationEndListener", "Lkotlin/Function0;", "", "getAnimationEndListener", "()Lkotlin/jvm/functions/Function0;", "setAnimationEndListener", "(Lkotlin/jvm/functions/Function0;)V", "animationStartListener", "getAnimationStartListener", "setAnimationStartListener", "background", "Landroid/view/View;", "bottomBar", "Lcom/tinder/toppicks/counter/TopPicksBottomCounterView;", "canDismiss", "", "clickDetector", "Landroid/view/GestureDetector;", "fullView", "Landroid/widget/FrameLayout;", "paywallCard", "Landroid/support/v7/widget/CardView;", "paywallMargin", "paywallView", "Lcom/tinder/toppicks/dialog/TopPicksPaywallView;", "screenHeight", "", "swipeDetector", "animateBottomBarBounds", "margin", "duration", "", "bottomBarBackgroundFade", "Landroid/view/ViewPropertyAnimator;", "endValue", "collapse", "dismiss", "expand", "fadeBackground", "fadeAnimation", "Lcom/tinder/toppicks/FadeAnimation;", "fadeBottomBar", "Landroid/animation/Animator;", "fade", "fadePaywallViewContents", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "postAnimationDismiss", "setupDialogAttributes", "setupViews", "show", "translatePaywallView", "displayMetrics", "Landroid/util/DisplayMetrics;", "ClickListener", "FlingDirection", "SwipeListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksPaywallDialog extends Dialog {
    @Nullable
    /* renamed from: a */
    private Function0<C15813i> f47339a;
    @Nullable
    /* renamed from: b */
    private Function0<C15813i> f47340b;
    /* renamed from: c */
    private boolean f47341c = true;
    /* renamed from: d */
    private CardView f47342d;
    /* renamed from: e */
    private TopPicksBottomCounterView f47343e;
    /* renamed from: f */
    private FrameLayout f47344f;
    /* renamed from: g */
    private View f47345g;
    /* renamed from: h */
    private TopPicksPaywallView f47346h;
    /* renamed from: i */
    private final GestureDetector f47347i;
    /* renamed from: j */
    private final GestureDetector f47348j;
    /* renamed from: k */
    private final int f47349k;
    /* renamed from: l */
    private final float f47350l;
    /* renamed from: m */
    private final int f47351m;
    /* renamed from: n */
    private final ListenerPaywall f47352n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$FlingDirection;", "", "(Ljava/lang/String;I)V", "UP", "DOWN", "LEFT", "RIGHT", "NONE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum FlingDirection {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$ClickListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog;)V", "onSingleTapUp", "", "e", "Landroid/view/MotionEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$a */
    private final class C15239a extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47327a;

        public boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
            return true;
        }

        public C15239a(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47327a = topPicksPaywallDialog;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J,\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$SwipeListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog;)V", "getFlingDirection", "Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$FlingDirection;", "x1", "", "y1", "x2", "y2", "onFling", "", "eventOne", "Landroid/view/MotionEvent;", "eventTwo", "velocityX", "velocityY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$b */
    private final class C15240b extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47328a;

        public C15240b(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47328a = topPicksPaywallDialog;
        }

        public boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
            f = 0.0f;
            f2 = motionEvent != null ? motionEvent.getX() : 0.0f;
            motionEvent = motionEvent != null ? motionEvent.getY() : null;
            float x = motionEvent2 != null ? motionEvent2.getX() : 0.0f;
            if (motionEvent2 != null) {
                f = motionEvent2.getY();
            }
            return m57309a(f2, motionEvent, x, f) == FlingDirection.DOWN ? true : null;
        }

        /* renamed from: a */
        private final FlingDirection m57309a(float f, float f2, float f3, float f4) {
            f = Math.toDegrees(Math.atan2((double) (f2 - f4), (double) (f3 - f)));
            f3 = (double) 6.3E-44f;
            if (f > f3 && f <= ((double) 135)) {
                return FlingDirection.UP;
            }
            if ((f >= ((double) 135) && f < ((double) 180)) || (f < ((double) -13) && f > ((double) -44))) {
                return FlingDirection.LEFT;
            }
            double d = (double) -45;
            if (f < d && f >= ((double) -135)) {
                return FlingDirection.DOWN;
            }
            if (f <= d || f > f3) {
                return FlingDirection.NONE;
            }
            return FlingDirection.RIGHT;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/toppicks/dialog/TopPicksPaywallDialog$collapse$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$collapse$1;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$c */
    public static final class C15241c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47329a;

        C15241c(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47329a = topPicksPaywallDialog;
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            super.onAnimationCancel(animator);
            this.f47329a.m57330f();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/toppicks/dialog/TopPicksPaywallDialog$collapse$3$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$collapse$3;)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$d */
    public static final class C15242d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47330a;

        C15242d(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47330a = topPicksPaywallDialog;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            super.onAnimationStart(animator);
            TopPicksPaywallDialog.m57328e(this.f47330a).setVisibility(0);
            TopPicksPaywallDialog.m57328e(this.f47330a).m62754a(FadeAnimation.OUT, 0).start();
            this.f47330a.m57314a(0, 200);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/toppicks/dialog/TopPicksPaywallDialog$expand$2$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$expand$2;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$e */
    public static final class C15243e extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47331a;

        C15243e(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47331a = topPicksPaywallDialog;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            TopPicksPaywallDialog.m57328e(this.f47331a).setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/toppicks/dialog/TopPicksPaywallDialog$expand$3$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/toppicks/dialog/TopPicksPaywallDialog$expand$3;)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$f */
    public static final class C15244f extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47332a;

        C15244f(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47332a = topPicksPaywallDialog;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            super.onAnimationStart(animator);
            this.f47332a.m57325c(FadeAnimation.IN);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$g */
    static final class C15246g implements OnShowListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47334a;

        C15246g(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47334a = topPicksPaywallDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            TopPicksPaywallDialog.m57313a(this.f47334a).post(new Runnable() {
                public final void run() {
                    this.f47334a.m57327d();
                    Function0 a = this.f47334a.m57333a();
                    if (a != null) {
                        C15813i c15813i = (C15813i) a.invoke();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$h */
    static final class C15247h implements Runnable {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47335a;

        C15247h(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47335a = topPicksPaywallDialog;
        }

        public final void run() {
            super.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$i */
    static final class C15248i implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47336a;

        C15248i(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47336a = topPicksPaywallDialog;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f47336a.f47347i.onTouchEvent(motionEvent) != null) {
                this.f47336a.dismiss();
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$j */
    static final class C15249j implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47337a;

        C15249j(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47337a = topPicksPaywallDialog;
        }

        public final void onClick(View view) {
            this.f47337a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.dialog.TopPicksPaywallDialog$k */
    static final class C15250k implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksPaywallDialog f47338a;

        C15250k(TopPicksPaywallDialog topPicksPaywallDialog) {
            this.f47338a = topPicksPaywallDialog;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(this.f47338a.f47347i.onTouchEvent(motionEvent) == null && this.f47338a.f47348j.onTouchEvent(motionEvent) == null)) {
                this.f47338a.dismiss();
            }
            return true;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m57313a(TopPicksPaywallDialog topPicksPaywallDialog) {
        topPicksPaywallDialog = topPicksPaywallDialog.f47344f;
        if (topPicksPaywallDialog == null) {
            C2668g.b("fullView");
        }
        return topPicksPaywallDialog;
    }

    @NotNull
    /* renamed from: e */
    public static final /* synthetic */ TopPicksBottomCounterView m57328e(TopPicksPaywallDialog topPicksPaywallDialog) {
        topPicksPaywallDialog = topPicksPaywallDialog.f47343e;
        if (topPicksPaywallDialog == null) {
            C2668g.b("bottomBar");
        }
        return topPicksPaywallDialog;
    }

    public TopPicksPaywallDialog(@NotNull Context context, int i, @Nullable ListenerPaywall listenerPaywall) {
        C2668g.b(context, "context");
        super(context, R.style.TopPicksDialog);
        this.f47351m = i;
        this.f47352n = listenerPaywall;
        this.f47347i = new GestureDetector(context, (OnGestureListener) new C15240b(this));
        this.f47348j = new GestureDetector(context, (OnGestureListener) new C15239a(this));
        this.f47349k = (int) context.getResources().getDimension(R.dimen.dialog_width_padding);
        this.f47350l = (float) m57311a(context).heightPixels;
    }

    @Nullable
    /* renamed from: a */
    public final Function0<C15813i> m57333a() {
        return this.f47339a;
    }

    /* renamed from: a */
    public final void m57334a(@Nullable Function0<C15813i> function0) {
        this.f47339a = function0;
    }

    /* renamed from: b */
    public final void m57335b(@Nullable Function0<C15813i> function0) {
        this.f47340b = function0;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.top_picks_dialog_view);
        m57321b();
        m57324c();
        setOnShowListener((OnShowListener) new C15246g(this));
    }

    /* renamed from: b */
    private final void m57321b() {
        View findViewById = findViewById(R.id.paywall_view);
        C2668g.a(findViewById, "findViewById(R.id.paywall_view)");
        this.f47346h = (TopPicksPaywallView) findViewById;
        findViewById = findViewById(R.id.paywall_card);
        C2668g.a(findViewById, "findViewById(R.id.paywall_card)");
        this.f47342d = (CardView) findViewById;
        findViewById = findViewById(R.id.bottom_counter_view);
        C2668g.a(findViewById, "findViewById(R.id.bottom_counter_view)");
        this.f47343e = (TopPicksBottomCounterView) findViewById;
        findViewById = findViewById(R.id.full_view);
        C2668g.a(findViewById, "findViewById(R.id.full_view)");
        this.f47344f = (FrameLayout) findViewById;
        findViewById = findViewById(R.id.background_view);
        C2668g.a(findViewById, "findViewById(R.id.background_view)");
        this.f47345g = findViewById;
    }

    /* renamed from: c */
    private final void m57324c() {
        Window window = getWindow();
        C2668g.a(window, "window");
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        Window window2 = getWindow();
        C2668g.a(window2, "window");
        window2.setAttributes(attributes);
        if (VERSION.SDK_INT >= 21) {
            window = getWindow();
            C2668g.a(window, "window");
            window.setStatusBarColor(C0432b.c(getContext(), R.color.black));
        }
        TopPicksPaywallView topPicksPaywallView = this.f47346h;
        if (topPicksPaywallView == null) {
            C2668g.b("paywallView");
        }
        topPicksPaywallView.setSource(TopPicksPaywallSource.Companion.a(this.f47351m));
        topPicksPaywallView = this.f47346h;
        if (topPicksPaywallView == null) {
            C2668g.b("paywallView");
        }
        topPicksPaywallView.setDismissCallback(new TopPicksPaywallDialog$setupDialogAttributes$1(this));
        topPicksPaywallView = this.f47346h;
        if (topPicksPaywallView == null) {
            C2668g.b("paywallView");
        }
        topPicksPaywallView.setPaywallListener(this.f47352n);
        CardView cardView = this.f47342d;
        if (cardView == null) {
            C2668g.b("paywallCard");
        }
        cardView.setTranslationY(this.f47350l);
    }

    @SuppressLint({"all"})
    public void show() {
        super.show();
        CardView cardView = this.f47342d;
        if (cardView == null) {
            C2668g.b("paywallCard");
        }
        cardView.setOnTouchListener(new C15248i(this));
        View view = this.f47345g;
        if (view == null) {
            C2668g.b("background");
        }
        view.setOnClickListener(new C15249j(this));
        view = this.f47345g;
        if (view == null) {
            C2668g.b("background");
        }
        view.setOnTouchListener(new C15250k(this));
    }

    public void dismiss() {
        if (this.f47341c) {
            this.f47341c = false;
            m57329e();
        }
    }

    /* renamed from: d */
    private final void m57327d() {
        Animator a = m57310a(FadeAnimation.OUT);
        a.setInterpolator(new C2890b());
        a.start();
        m57316a(this, this.f47349k, 0, 2, null);
        ViewPropertyAnimator b = m57320b(0.0f);
        b.setListener(new C15243e(this));
        b.setStartDelay(250);
        b.setDuration(300);
        b.start();
        ViewPropertyAnimator a2 = m57312a(0.0f);
        a2.setListener(new C15244f(this));
        a2.setStartDelay(150);
        a2.start();
        TopPicksPaywallView topPicksPaywallView = this.f47346h;
        if (topPicksPaywallView == null) {
            C2668g.b("paywallView");
        }
        a = topPicksPaywallView.m62772a(FadeAnimation.IN, 200);
        a.setStartDelay(300);
        C0745a.a(a, new TopPicksPaywallDialog$expand$$inlined$apply$lambda$3(this), null, null, null, 14, null);
        a.start();
    }

    /* renamed from: e */
    private final void m57329e() {
        ViewPropertyAnimator a = m57312a(this.f47350l);
        a.setListener(new C15241c(this));
        a.setInterpolator(new LinearInterpolator());
        a.start();
        Animator b = m57319b(FadeAnimation.OUT);
        Function1 topPicksPaywallDialog$collapse$$inlined$apply$lambda$2 = new TopPicksPaywallDialog$collapse$$inlined$apply$lambda$2(this);
        C0745a.a(b, null, new TopPicksPaywallDialog$collapse$$inlined$apply$lambda$3(this), topPicksPaywallDialog$collapse$$inlined$apply$lambda$2, null, 9, null);
        b.start();
        a = m57320b(1.0f);
        a.setListener(new C15242d(this));
        a.setDuration(0);
        a.setStartDelay(150);
        a.start();
        b = m57310a(FadeAnimation.IN);
        b.setStartDelay(300);
        b.setInterpolator(new LinearInterpolator());
        C0745a.a(b, new TopPicksPaywallDialog$collapse$$inlined$apply$lambda$5(this), null, new TopPicksPaywallDialog$collapse$$inlined$apply$lambda$6(this), null, 10, null);
        b.start();
    }

    /* renamed from: f */
    private final void m57330f() {
        Function0 function0 = this.f47340b;
        if (function0 != null) {
            C15813i c15813i = (C15813i) function0.invoke();
        }
        this.f47341c = true;
        FrameLayout frameLayout = this.f47344f;
        if (frameLayout == null) {
            C2668g.b("fullView");
        }
        frameLayout.post(new C15247h(this));
    }

    /* renamed from: a */
    static /* synthetic */ void m57316a(TopPicksPaywallDialog topPicksPaywallDialog, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        topPicksPaywallDialog.m57314a(i, j);
    }

    /* renamed from: a */
    private final void m57314a(int i, long j) {
        FrameLayout frameLayout = this.f47344f;
        if (frameLayout == null) {
            C2668g.b("fullView");
        }
        if (frameLayout == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        TransitionManager.beginDelayedTransition(frameLayout, new ChangeBounds().setDuration(j).setInterpolator(new C2890b()));
        j = this.f47343e;
        if (j == null) {
            C2668g.b("bottomBar");
        }
        j = j.getLayoutParams();
        if (j == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j;
        layoutParams.setMargins(i, 0, i, 0);
        i = this.f47343e;
        if (i == 0) {
            C2668g.b("bottomBar");
        }
        i.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final Animator m57310a(FadeAnimation fadeAnimation) {
        TopPicksBottomCounterView topPicksBottomCounterView = this.f47343e;
        if (topPicksBottomCounterView == null) {
            C2668g.b("bottomBar");
        }
        return topPicksBottomCounterView.m62754a(fadeAnimation, 200);
    }

    /* renamed from: a */
    private final ViewPropertyAnimator m57312a(float f) {
        CardView cardView = this.f47342d;
        if (cardView == null) {
            C2668g.b("paywallCard");
        }
        f = cardView.animate().translationY(f);
        f.setDuration(300);
        C2668g.a(f, "paywallCard.animate().tr…ATE_ANIM_MILLIS\n        }");
        return f;
    }

    /* renamed from: b */
    private final ViewPropertyAnimator m57320b(float f) {
        TopPicksBottomCounterView topPicksBottomCounterView = this.f47343e;
        if (topPicksBottomCounterView == null) {
            C2668g.b("bottomBar");
        }
        f = topPicksBottomCounterView.animate().alpha(f);
        C2668g.a(f, "bottomBar.animate().alpha(endValue)");
        return f;
    }

    /* renamed from: b */
    private final Animator m57319b(FadeAnimation fadeAnimation) {
        TopPicksPaywallView topPicksPaywallView = this.f47346h;
        if (topPicksPaywallView == null) {
            C2668g.b("paywallView");
        }
        return topPicksPaywallView.m62772a(fadeAnimation, 200);
    }

    /* renamed from: c */
    private final void m57325c(FadeAnimation fadeAnimation) {
        View[] viewArr = new View[1];
        View view = this.f47345g;
        if (view == null) {
            C2668g.b("background");
        }
        viewArr[0] = view;
        new C15224a(viewArr).m57292a(fadeAnimation, 200).start();
    }

    /* renamed from: a */
    private final DisplayMetrics m57311a(@NotNull Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        context = C15365p.m57675b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        context = ((Activity) context).getWindowManager();
        C2668g.a(context, "(this.findActivity() as Activity).windowManager");
        context.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }
}
