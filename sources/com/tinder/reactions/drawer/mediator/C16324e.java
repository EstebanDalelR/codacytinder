package com.tinder.reactions.drawer.mediator;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.C0592b;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.grandgesturessdk.common.interfaces.LayoutChangedInterface;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.common.view.C14617a;
import com.tinder.reactions.drawer.p391b.C14624a;
import com.tinder.reactions.drawer.provider.C14639g;
import com.tinder.reactions.drawer.provider.C16327e;
import com.tinder.reactions.drawer.view.AnimatorTouchInterface;
import com.tinder.reactions.drawer.view.OnTouchInterceptor;
import com.tinder.reactions.drawer.view.ReactionDrawer;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.C15830a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n*\u0001I\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u001f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010P\u001a\u00020\u00012\u0006\u0010Q\u001a\u00020\u0012H\u0016J\u0018\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\nH\u0002J\b\u0010V\u001a\u00020\u000fH\u0002J\b\u0010W\u001a\u00020SH\u0016J\b\u0010X\u001a\u00020SH\u0002J\b\u0010Y\u001a\u00020SH\u0002J\u0010\u0010Z\u001a\u00020S2\u0006\u0010[\u001a\u00020\nH\u0002J\u0010\u0010\\\u001a\u00020S2\u0006\u0010]\u001a\u00020\u0015H\u0002J\u0010\u0010^\u001a\u00020S2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010a\u001a\u00020S2\u0006\u0010_\u001a\u00020`H\u0002J\b\u0010b\u001a\u00020SH\u0016J\u0018\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020\nH\u0002J\u0010\u0010g\u001a\u00020`2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010h\u001a\u00020`2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010i\u001a\u00020S2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\nH\u0002J\b\u0010n\u001a\u00020\u000fH\u0002J\u0006\u0010o\u001a\u00020SJ\u0010\u0010p\u001a\u00020\u00012\u0006\u0010q\u001a\u00020rH\u0016J\u0010\u0010s\u001a\u00020S2\u0006\u0010_\u001a\u00020`H\u0002J\b\u0010t\u001a\u00020SH\u0002J\b\u0010u\u001a\u00020SH\u0002J\b\u0010v\u001a\u00020SH\u0002J\b\u0010w\u001a\u00020SH\u0002J\u0010\u0010x\u001a\u00020S2\u0006\u0010?\u001a\u00020\u0015H\u0002J\b\u0010y\u001a\u00020SH\u0002J\b\u0010z\u001a\u00020SH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8B@BX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R$\u0010$\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\n\n\u0002\u0010'\"\u0004\b%\u0010&R\u000e\u0010(\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R+\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR+\u0010-\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8B@BX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001e\u00101\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\"\u0004\b2\u0010!R\u001e\u00103\u001a\u0002048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u000e\u0010?\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u00020A8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u00020IX\u0004¢\u0006\u0004\n\u0002\u0010JR+\u0010K\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n8B@BX\u0002¢\u0006\u0012\n\u0004\bN\u0010\u001c\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010!R\u0012\u0010O\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010'¨\u0006|"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/DrawerMediator;", "Lcom/tinder/reactions/drawer/mediator/DrawerLayoutController;", "Lcom/tinder/reactions/drawer/view/ReactionDrawer;", "drawerContainer", "Landroid/support/v7/widget/CardView;", "drawerContainerAnimatorTouchInterface", "Lcom/tinder/reactions/drawer/view/AnimatorTouchInterface;", "bottomBarAnimatorTouchInterface", "(Landroid/support/v7/widget/CardView;Lcom/tinder/reactions/drawer/view/AnimatorTouchInterface;Lcom/tinder/reactions/drawer/view/AnimatorTouchInterface;)V", "MAX_ELEVATION", "", "MAX_RADIUS", "OVERSHOOT_INTERPOLATOR", "Landroid/view/animation/OvershootInterpolator;", "animationStarted", "", "animatorContainers", "", "Lcom/tinder/reactions/drawer/mediator/AnimatorControllerInterface;", "canDrag", "<set-?>", "", "drawerCloseWidth", "getDrawerCloseWidth", "()I", "setDrawerCloseWidth", "(I)V", "drawerCloseWidth$delegate", "Lkotlin/properties/ReadWriteProperty;", "drawerCloseY", "getDrawerCloseY", "()F", "setDrawerCloseY", "(F)V", "drawerCloseY$delegate", "value", "drawerCurrentY", "setDrawerCurrentY", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "drawerOpen", "drawerOpenWidth", "getDrawerOpenWidth", "setDrawerOpenWidth", "drawerOpenWidth$delegate", "drawerOpenY", "getDrawerOpenY", "setDrawerOpenY", "drawerOpenY$delegate", "drawerPercentageOpen", "setDrawerPercentageOpen", "drawerPresenter", "Lcom/tinder/reactions/drawer/presenter/DrawerPresenter;", "getDrawerPresenter$Tinder_release", "()Lcom/tinder/reactions/drawer/presenter/DrawerPresenter;", "setDrawerPresenter$Tinder_release", "(Lcom/tinder/reactions/drawer/presenter/DrawerPresenter;)V", "drawerProvider", "Lcom/tinder/reactions/drawer/provider/ReactionDrawerProvider;", "getDrawerProvider$Tinder_release", "()Lcom/tinder/reactions/drawer/provider/ReactionDrawerProvider;", "setDrawerProvider$Tinder_release", "(Lcom/tinder/reactions/drawer/provider/ReactionDrawerProvider;)V", "drawerState", "drawerStateUpdatesProvider", "Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;", "getDrawerStateUpdatesProvider$Tinder_release", "()Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;", "setDrawerStateUpdatesProvider$Tinder_release", "(Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;)V", "gestureDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "gestureListener", "com/tinder/reactions/drawer/mediator/DrawerMediator$gestureListener$1", "Lcom/tinder/reactions/drawer/mediator/DrawerMediator$gestureListener$1;", "touchStartY", "getTouchStartY", "setTouchStartY", "touchStartY$delegate", "velocityMs", "addAnimatorController", "animatorController", "animateDrawer", "", "startPosition", "endPosition", "canAnimateDrawer", "collapseDrawer", "dispatchDrawerClosedEvent", "dispatchDrawerOpenedEvent", "dispatchDrawerSlideEvent", "offset", "dispatchDrawerStateChangedEvent", "state", "dragToBottom", "event", "Landroid/view/MotionEvent;", "dragToTop", "expandDrawer", "getAnimationDuration", "", "start", "end", "handleBottomBarTouchEvent", "handleDrawerTouchEvent", "initStopPositions", "view", "Landroid/view/View;", "isDragging", "yLocation", "isPastThreshold", "onDestroy", "setLayoutChangedController", "layoutChangedInterface", "Lcom/tinder/grandgesturessdk/common/interfaces/LayoutChangedInterface;", "snapDrawerOnActionUp", "updateDrawer", "updateDrawerElevation", "updateDrawerOpenY", "updateDrawerRadius", "updateDrawerState", "updateDrawerWidth", "updateDrawerY", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.mediator.e */
public final class C16324e implements DrawerLayoutController, ReactionDrawer {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50773a = new KProperty[]{C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(C16324e.class), "drawerCloseY", "getDrawerCloseY()F")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(C16324e.class), "drawerOpenY", "getDrawerOpenY()F")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(C16324e.class), "drawerCloseWidth", "getDrawerCloseWidth()I")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(C16324e.class), "drawerOpenWidth", "getDrawerOpenWidth()I")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(C16324e.class), "touchStartY", "getTouchStartY()F"))};
    /* renamed from: e */
    public static final C14630a f50774e = new C14630a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C14639g f50775b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C16327e f50776c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C14624a f50777d;
    /* renamed from: f */
    private final float f50778f = this.f50796x.getResources().getDimension(R.dimen.max_drawer_radius);
    /* renamed from: g */
    private final float f50779g = this.f50796x.getResources().getDimension(R.dimen.max_drawer_elevation);
    /* renamed from: h */
    private final OvershootInterpolator f50780h = new OvershootInterpolator(0.8f);
    /* renamed from: i */
    private final List<AnimatorControllerInterface> f50781i = ((List) new ArrayList());
    /* renamed from: j */
    private final ReadWriteProperty f50782j = C15830a.f49034a.m59887a();
    /* renamed from: k */
    private final ReadWriteProperty f50783k = C15830a.f49034a.m59887a();
    /* renamed from: l */
    private final ReadWriteProperty f50784l = C15830a.f49034a.m59887a();
    /* renamed from: m */
    private final ReadWriteProperty f50785m = C15830a.f49034a.m59887a();
    /* renamed from: n */
    private final ReadWriteProperty f50786n = C15830a.f49034a.m59887a();
    /* renamed from: o */
    private boolean f50787o = true;
    /* renamed from: p */
    private boolean f50788p;
    /* renamed from: q */
    private boolean f50789q;
    /* renamed from: r */
    private Float f50790r;
    /* renamed from: s */
    private int f50791s;
    /* renamed from: t */
    private Float f50792t;
    /* renamed from: u */
    private float f50793u;
    /* renamed from: v */
    private final C16323d f50794v = new C16323d(this);
    /* renamed from: w */
    private final C0592b f50795w = new C0592b(this.f50796x.getContext(), this.f50794v);
    /* renamed from: x */
    private final CardView f50796x;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/DrawerMediator$Companion;", "", "()V", "ANIMATION_DURATION", "", "CLICK_THRESHOLD", "", "ELEVATION_NORMALIZATION_EXPONENT", "", "FLING_VELOCITY_THRESHOLD", "", "MILLISECOND_DENOMINATOR", "MIN_ANIMATION_DURATION", "MIN_RADIUS", "OFF_SCREEN_OFFSET", "OVERSHOOT_INTERPOLATOR_TENSION", "PERCENTAGE_OPEN_THRESHOLD", "SCROLL_UP_RESISTANCE", "WIDTH_SCALE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$a */
    public static final class C14630a {
        private C14630a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$b */
    static final class C14631b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C16324e f46146a;

        C14631b(C16324e c16324e) {
            this.f46146a = c16324e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C16324e c16324e = this.f46146a;
            C2668g.a(valueAnimator, "animation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            c16324e.m61546a((Float) valueAnimator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/reactions/drawer/mediator/DrawerMediator$animateDrawer$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/drawer/mediator/DrawerMediator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$c */
    public static final class C14632c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C16324e f46147a;

        C14632c(C16324e c16324e) {
            this.f46147a = c16324e;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f46147a.f50787o = true;
            this.f46147a.f50788p = false;
            this.f46147a.f50790r = (Float) null;
            this.f46147a.m61565d(0);
            if (this.f46147a.f50789q != null) {
                this.f46147a.m61578i();
            } else {
                this.f46147a.m61579j();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"com/tinder/reactions/drawer/mediator/DrawerMediator$gestureListener$1", "Lcom/tinder/reactions/common/view/EmptyOnGestureListener;", "(Lcom/tinder/reactions/drawer/mediator/DrawerMediator;)V", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "onSingleTapUp", "e", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$d */
    public static final class C16323d extends C14617a {
        /* renamed from: a */
        final /* synthetic */ C16324e f50772a;

        C16323d(C16324e c16324e) {
            this.f50772a = c16324e;
        }

        public boolean onFling(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2, float f, float f2) {
            C2668g.b(motionEvent, "e1");
            C2668g.b(motionEvent2, "e2");
            this.f50772a.f50788p = false;
            if (this.f50772a.m61580k() != null) {
                this.f50772a.f50790r = Float.valueOf(f2 / ((float) 1.401E-42f));
                if (this.f50772a.f50789q != null) {
                    if (f2 > 10.0f) {
                        this.f50772a.collapseDrawer();
                    } else if (f2 > ((float) null)) {
                        this.f50772a.expandDrawer();
                    }
                } else if (f2 < -10.0f) {
                    this.f50772a.expandDrawer();
                } else if (f2 < ((float) null)) {
                    this.f50772a.collapseDrawer();
                }
            }
            return false;
        }

        public boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
            C2668g.b(motionEvent, "e");
            if (this.f50772a.f50789q) {
                motionEvent.setAction(3);
                this.f50772a.collapseDrawer();
                this.f50772a.m61587a().m55788a();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$h */
    static final class C17964h<T, R> implements Func1<View, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C16324e f55897a;

        C17964h(C16324e c16324e) {
            this.f55897a = c16324e;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65299a((View) obj));
        }

        /* renamed from: a */
        public final boolean m65299a(View view) {
            return (this.f55897a.f50791s == null && this.f55897a.f50789q == null) ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$e */
    static final class C18714e<T> implements Action1<View> {
        /* renamed from: a */
        final /* synthetic */ C16324e f58195a;
        /* renamed from: b */
        final /* synthetic */ View f58196b;

        C18714e(C16324e c16324e, View view) {
            this.f58195a = c16324e;
            this.f58196b = view;
        }

        public /* synthetic */ void call(Object obj) {
            m67140a((View) obj);
        }

        /* renamed from: a */
        public final void m67140a(View view) {
            this.f58195a.m61546a(Float.valueOf(this.f58196b.getY()));
            C16324e c16324e = this.f58195a;
            Float d = this.f58195a.f50792t;
            if (d == null) {
                C2668g.a();
            }
            c16324e.m61538a(d.floatValue());
            this.f58195a.m61540a(this.f58196b.getWidth());
            this.f58195a.m61551b((int) (((double) this.f58196b.getWidth()) * 0.95d));
            this.f58195a.m61576h();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$f */
    static final class C18715f<T> implements Action1<View> {
        /* renamed from: a */
        final /* synthetic */ C16324e f58197a;
        /* renamed from: b */
        final /* synthetic */ LayoutChangedInterface f58198b;

        C18715f(C16324e c16324e, LayoutChangedInterface layoutChangedInterface) {
            this.f58197a = c16324e;
            this.f58198b = layoutChangedInterface;
        }

        public /* synthetic */ void call(Object obj) {
            m67141a((View) obj);
        }

        /* renamed from: a */
        public final void m67141a(View view) {
            this.f58197a.f50796x.getLayoutParams().height = (int) (this.f58198b.getView().getY() - this.f58197a.f50796x.getY());
            this.f58197a.f50796x.requestLayout();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.e$g */
    static final class C18716g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18716g f58199a = new C18716g();

        C18716g() {
        }

        public /* synthetic */ void call(Object obj) {
            m67142a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67142a(Throwable th) {
            C0001a.c(th, "Failed to observe layout changes for Drawer", new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m61538a(float f) {
        this.f50782j.setValue(this, f50773a[0], Float.valueOf(f));
    }

    /* renamed from: a */
    private final void m61540a(int i) {
        this.f50784l.setValue(this, f50773a[2], Integer.valueOf(i));
    }

    /* renamed from: b */
    private final void m61550b(float f) {
        this.f50783k.setValue(this, f50773a[1], Float.valueOf(f));
    }

    /* renamed from: b */
    private final void m61551b(int i) {
        this.f50785m.setValue(this, f50773a[3], Integer.valueOf(i));
    }

    /* renamed from: c */
    private final float m61556c() {
        return ((Number) this.f50782j.getValue(this, f50773a[0])).floatValue();
    }

    /* renamed from: c */
    private final void m61558c(float f) {
        this.f50786n.setValue(this, f50773a[4], Float.valueOf(f));
    }

    /* renamed from: d */
    private final float m61562d() {
        return ((Number) this.f50783k.getValue(this, f50773a[1])).floatValue();
    }

    /* renamed from: e */
    private final int m61567e() {
        return ((Number) this.f50784l.getValue(this, f50773a[2])).intValue();
    }

    /* renamed from: f */
    private final int m61571f() {
        return ((Number) this.f50785m.getValue(this, f50773a[3])).intValue();
    }

    /* renamed from: g */
    private final float m61574g() {
        return ((Number) this.f50786n.getValue(this, f50773a[4])).floatValue();
    }

    /* renamed from: b */
    public final void m61588b() {
    }

    @Inject
    public C16324e(@NotNull CardView cardView, @NotNull AnimatorTouchInterface animatorTouchInterface, @NotNull AnimatorTouchInterface animatorTouchInterface2) {
        C2668g.b(cardView, "drawerContainer");
        C2668g.b(animatorTouchInterface, "drawerContainerAnimatorTouchInterface");
        C2668g.b(animatorTouchInterface2, "bottomBarAnimatorTouchInterface");
        this.f50796x = cardView;
        cardView = C14398a.m54830a(this.f50796x.getContext());
        if (cardView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) cardView).provideChatActivityComponent().inject(this);
        m61541a((View) this.f50796x);
        this.f50796x.setCardElevation(0.0f);
        this.f50796x.setRadius(1.0f);
        animatorTouchInterface.setTouchInterceptor((OnTouchInterceptor) new OnTouchInterceptor() {
            @NotNull
            public MotionEvent OnTouch(@NotNull MotionEvent motionEvent) {
                C2668g.b(motionEvent, "event");
                return this.m61536a(motionEvent);
            }
        });
        animatorTouchInterface2.setTouchInterceptor((OnTouchInterceptor) new OnTouchInterceptor() {
            @NotNull
            public MotionEvent OnTouch(@NotNull MotionEvent motionEvent) {
                C2668g.b(motionEvent, "event");
                return this.m61548b(motionEvent);
            }
        });
        m61579j();
        cardView = this.f50775b;
        if (cardView == null) {
            C2668g.b("drawerProvider");
        }
        cardView.m55829a(this);
    }

    @NotNull
    /* renamed from: a */
    public final C14624a m61587a() {
        C14624a c14624a = this.f50777d;
        if (c14624a == null) {
            C2668g.b("drawerPresenter");
        }
        return c14624a;
    }

    /* renamed from: a */
    private final void m61546a(Float f) {
        if (this.f50792t != null) {
            Float f2 = this.f50792t;
            if (f2 == null) {
                C2668g.a();
            }
            m61564d((f2.floatValue() - m61556c()) / (m61562d() - m61556c()));
        }
        this.f50792t = f;
    }

    /* renamed from: d */
    private final void m61564d(float f) {
        this.f50793u = f;
        m61582m();
        m61568e(f);
    }

    @NotNull
    public DrawerLayoutController addAnimatorController(@NotNull AnimatorControllerInterface animatorControllerInterface) {
        C2668g.b(animatorControllerInterface, "animatorController");
        this.f50781i.add(animatorControllerInterface);
        return this;
    }

    @NotNull
    public DrawerLayoutController setLayoutChangedController(@NotNull LayoutChangedInterface layoutChangedInterface) {
        C2668g.b(layoutChangedInterface, "layoutChangedInterface");
        Observable layoutChangedObservable = layoutChangedInterface.getLayoutChangedObservable();
        C14612a c14612a = C14612a.f46118a;
        View rootView = this.f50796x.getRootView();
        C2668g.a(rootView, "drawerContainer.rootView");
        Observable.b(layoutChangedObservable, c14612a.m55759d(rootView).f(new C17964h(this))).j(C14612a.f46118a.m55756a(layoutChangedInterface.getView())).a(C19397a.a()).a(new C18715f(this, layoutChangedInterface), (Action1) C18716g.f58199a);
        return this;
    }

    public void expandDrawer() {
        if (this.f50791s == 0 && !this.f50789q) {
            m61576h();
        }
        Float f = this.f50792t;
        if (f == null) {
            C2668g.a();
        }
        m61539a(f.floatValue(), m61562d());
        this.f50789q = true;
    }

    public void collapseDrawer() {
        Float f = this.f50792t;
        if (f == null) {
            C2668g.a();
        }
        m61539a(f.floatValue(), m61556c());
        this.f50789q = false;
    }

    /* renamed from: h */
    private final void m61576h() {
        m61550b(this.f50796x.getY() + (((float) this.f50796x.getHeight()) * -0.9f));
    }

    /* renamed from: a */
    private final void m61539a(float f, float f2) {
        if (this.f50791s == 0) {
            m61576h();
        }
        m61565d(2);
        f = ValueAnimator.ofFloat(new float[]{f, f2});
        f.addUpdateListener((AnimatorUpdateListener) new C14631b(this));
        f.addListener((AnimatorListener) new C14632c(this));
        C2668g.a(f, "drawerAnimator");
        f.setInterpolator((TimeInterpolator) this.f50780h);
        if (this.f50789q != null) {
            f2 = this.f50792t;
            if (f2 == null) {
                C2668g.a();
            }
            f.setDuration(m61547b(f2.floatValue(), m61556c()));
        } else {
            f2 = this.f50792t;
            if (f2 == null) {
                C2668g.a();
            }
            f.setDuration(m61547b(f2.floatValue(), m61562d()));
        }
        this.f50787o = false;
        f.start();
    }

    /* renamed from: b */
    private final long m61547b(float f, float f2) {
        if (this.f50790r != null) {
            if (!m61581l()) {
                f2 -= f;
                f = this.f50790r;
                if (f == null) {
                    C2668g.a();
                }
                f = (long) Math.abs(f2 / f.floatValue());
                if (f < 1.4E-43f) {
                    return 100;
                }
                if (f < 4.2E-43f) {
                    return f;
                }
                return 300;
            }
        }
        return 300;
    }

    /* renamed from: e */
    private final void m61568e(float f) {
        C16327e c16327e = this.f50776c;
        if (c16327e == null) {
            C2668g.b("drawerStateUpdatesProvider");
        }
        c16327e.m61612a(this.f50796x, f);
    }

    /* renamed from: i */
    private final void m61578i() {
        C16327e c16327e = this.f50776c;
        if (c16327e == null) {
            C2668g.b("drawerStateUpdatesProvider");
        }
        c16327e.m61611a((View) this.f50796x);
    }

    /* renamed from: j */
    private final void m61579j() {
        C16327e c16327e = this.f50776c;
        if (c16327e == null) {
            C2668g.b("drawerStateUpdatesProvider");
        }
        c16327e.m61614b((View) this.f50796x);
    }

    /* renamed from: c */
    private final void m61559c(int i) {
        C16327e c16327e = this.f50776c;
        if (c16327e == null) {
            C2668g.b("drawerStateUpdatesProvider");
        }
        c16327e.m61610a(i);
    }

    /* renamed from: a */
    private final MotionEvent m61536a(MotionEvent motionEvent) {
        this.f50795w.a(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                m61558c(motionEvent.getRawY());
                break;
            case 1:
                if (C2668g.a(this.f50792t, m61556c()) && m61580k()) {
                    m61565d(0);
                    m61579j();
                } else if (this.f50791s == 1) {
                    m61569e(motionEvent);
                }
                this.f50788p = false;
                break;
            case 2:
                if (this.f50787o) {
                    if (!this.f50789q) {
                        if (!m61580k()) {
                            if (this.f50791s == 0) {
                                m61558c(motionEvent.getRawY());
                                break;
                            }
                        }
                        this.f50788p = true;
                        m61560c(motionEvent);
                        break;
                    }
                    this.f50788p = true;
                    m61566d(motionEvent);
                    break;
                }
                break;
            default:
                break;
        }
        return motionEvent;
    }

    /* renamed from: b */
    private final MotionEvent m61548b(MotionEvent motionEvent) {
        if (this.f50791s != 0) {
            motionEvent.setAction(3);
        }
        return motionEvent;
    }

    /* renamed from: c */
    private final void m61560c(MotionEvent motionEvent) {
        float c = m61556c() + ((motionEvent.getRawY() - m61574g()) / ((float) 4));
        if (c >= m61556c() || !m61573f(motionEvent.getRawY())) {
            if ((C2668g.a(this.f50792t, m61556c()) ^ 1) != 0) {
                motionEvent.setAction(0);
            }
            m61546a(Float.valueOf(m61556c()));
            return;
        }
        if (this.f50791s == 0) {
            m61576h();
            m61565d(1);
        }
        motionEvent.setAction(3);
        m61546a(Float.valueOf(c));
    }

    /* renamed from: d */
    private final void m61566d(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY() - m61574g();
        if (rawY > ((float) 0) && m61573f(motionEvent.getRawY())) {
            motionEvent.setAction(3);
            if (this.f50791s == null) {
                m61565d(1);
            }
            m61546a(Float.valueOf(m61562d() + rawY));
        }
    }

    /* renamed from: a */
    private final void m61541a(View view) {
        C14612a.f46118a.m55760e(view).d(new C18714e(this, view));
    }

    /* renamed from: k */
    private final boolean m61580k() {
        if (this.f50788p) {
            return true;
        }
        boolean z = this.f50787o;
        for (AnimatorControllerInterface allowDrag : this.f50781i) {
            z &= allowDrag.allowDrag();
        }
        return z;
    }

    /* renamed from: e */
    private final void m61569e(MotionEvent motionEvent) {
        if (m61573f(motionEvent.getRawY())) {
            motionEvent.setAction(3);
            if (this.f50789q != null) {
                if (m61581l() != null) {
                    collapseDrawer();
                } else {
                    expandDrawer();
                }
            } else if (m61581l() != null) {
                expandDrawer();
            } else {
                collapseDrawer();
            }
        }
    }

    /* renamed from: l */
    private final boolean m61581l() {
        boolean z = false;
        if (this.f50789q) {
            if (0.2f > this.f50793u) {
                z = true;
            }
            return z;
        }
        if (0.2f < this.f50793u) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private final boolean m61573f(float f) {
        return Math.abs(m61574g() - f) > ((float) 10);
    }

    /* renamed from: m */
    private final void m61582m() {
        m61583n();
        m61584o();
        m61585p();
        m61586q();
    }

    /* renamed from: n */
    private final void m61583n() {
        Float f = this.f50792t;
        if (f == null) {
            C2668g.a();
        }
        if (f.floatValue() < m61562d()) {
            this.f50796x.setY(m61562d());
            return;
        }
        f = this.f50792t;
        if (f == null) {
            C2668g.a();
        }
        if (f.floatValue() > m61556c()) {
            this.f50796x.setY(m61556c());
            return;
        }
        CardView cardView = this.f50796x;
        Float f2 = this.f50792t;
        if (f2 == null) {
            C2668g.a();
        }
        cardView.setY(f2.floatValue());
    }

    /* renamed from: o */
    private final void m61584o() {
        float pow = (float) (Math.pow((double) this.f50793u, 2.0d) * ((double) this.f50779g));
        if (pow > this.f50779g) {
            this.f50796x.setCardElevation(this.f50779g);
        } else if (pow < ((float) 0)) {
            this.f50796x.setCardElevation(0.0f);
        } else {
            this.f50796x.setCardElevation(pow);
        }
    }

    /* renamed from: p */
    private final void m61585p() {
        float f = ((this.f50778f - 1.0f) * this.f50793u) + 1.0f;
        if (f > this.f50778f) {
            this.f50796x.setRadius(this.f50778f);
        } else if (f < 1.0f) {
            this.f50796x.setRadius(1.0f);
        } else {
            this.f50796x.setRadius(f);
        }
    }

    /* renamed from: q */
    private final void m61586q() {
        int e = (int) (((float) m61567e()) - (((float) (m61567e() - m61571f())) * this.f50793u));
        if (e > m61567e()) {
            this.f50796x.getLayoutParams().width = m61567e();
        } else if (e < m61571f()) {
            this.f50796x.getLayoutParams().width = m61571f();
        } else {
            this.f50796x.getLayoutParams().width = e;
        }
        this.f50796x.requestLayout();
    }

    /* renamed from: d */
    private final void m61565d(int i) {
        this.f50791s = i;
        m61559c(i);
    }
}
