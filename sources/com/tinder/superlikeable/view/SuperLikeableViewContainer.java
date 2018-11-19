package com.tinder.superlikeable.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.common.view.Container;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.superlikeable.C15088a.C15084b;
import com.tinder.superlikeable.C15088a.C15085c;
import com.tinder.superlikeable.C15088a.C15086d;
import com.tinder.superlikeable.analytics.C18200e;
import com.tinder.superlikeable.animation.C15103b;
import com.tinder.superlikeable.animation.C15111c;
import com.tinder.superlikeable.animation.C15118d;
import com.tinder.superlikeable.animation.C15118d.C15112a;
import com.tinder.superlikeable.injector.SuperLikeableInjector$Factory;
import com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView;
import com.tinder.superlikeable.p422b.C15135a;
import com.tinder.superlikeable.p422b.C15137c;
import com.tinder.superlikeable.p422b.C15138d;
import com.tinder.superlikeable.p423c.C15140a;
import com.tinder.superlikeable.p424d.C15141a;
import com.tinder.superlikeable.p480a.C16894a;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.C15148a;
import com.tinder.superlikeable.view.SuperLikeableGridView.CellView;
import com.tinder.superlikeable.view.p425a.C15171a;
import com.tinder.superlikeable.view.target.SuperLikeableGameTarget;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004opqrB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020\u0013J\u000e\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\u001bJ*\u0010C\u001a\u00020,2\"\u0010@\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0)j\u0002`-J\u0016\u0010D\u001a\u00020,2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FH\u0016J\b\u0010H\u001a\u00020\u001fH\u0002J\b\u0010I\u001a\u00020,H\u0002J\u0010\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020,H\u0016J\u000e\u0010N\u001a\u00020,2\u0006\u0010O\u001a\u00020PJ\u0010\u0010Q\u001a\u00020,2\u0006\u0010R\u001a\u00020SH\u0016J\u0018\u0010T\u001a\u00020,2\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020WH\u0002J \u0010X\u001a\u00020,2\u0006\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020+2\u0006\u0010[\u001a\u00020+H\u0002J\b\u0010\\\u001a\u00020,H\u0014J\b\u0010]\u001a\u00020\u001fH\u0016J\b\u0010^\u001a\u00020,H\u0014J\b\u0010_\u001a\u00020,H\u0002J\b\u0010`\u001a\u00020,H\u0016J\u000e\u0010a\u001a\u00020,2\u0006\u0010B\u001a\u00020\u001bJ*\u0010b\u001a\u00020,2\"\u0010@\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0)j\u0002`-J\u000e\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020eJ\u0010\u0010f\u001a\u00020,2\u0006\u0010g\u001a\u00020!H\u0016J\b\u0010h\u001a\u00020,H\u0002J\b\u0010i\u001a\u00020,H\u0016J\b\u0010j\u001a\u00020,H\u0016J\b\u0010k\u001a\u00020,H\u0002J\u001a\u0010l\u001a\u00020,*\u00020\u00102\f\u0010m\u001a\b\u0012\u0004\u0012\u00020,0nH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'RV\u0010(\u001aJ\u0012 \u0012\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0)j\u0002`-0\u0012j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0)j\u0002`-`\u0014X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u000205X\u0004¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "Landroid/widget/FrameLayout;", "Lcom/tinder/common/view/Container;", "Lcom/tinder/superlikeable/view/target/SuperLikeableGameTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "analyticsGameListener", "Lcom/tinder/superlikeable/analytics/AnalyticsSuperLikeableGameListener;", "getAnalyticsGameListener", "()Lcom/tinder/superlikeable/analytics/AnalyticsSuperLikeableGameListener;", "setAnalyticsGameListener", "(Lcom/tinder/superlikeable/analytics/AnalyticsSuperLikeableGameListener;)V", "backgroundScalingView", "Lcom/tinder/superlikeable/view/BackgroundScalingView;", "bottomStarsView", "Lcom/airbnb/lottie/LottieAnimationView;", "exitAnimationListeners", "Ljava/util/HashSet;", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnExitAnimationEndListener;", "Lkotlin/collections/HashSet;", "exitAnimationViewBounds", "Landroid/graphics/Rect;", "flingCompleteExitAnimator", "Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator;", "gameListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$GameListener;", "gridAdapter", "Lcom/tinder/superlikeable/adapter/SuperLikeableRecsGridAdapter;", "interactionEnabled", "", "logoViewStartAnimationPosition", "", "onRecClickedListener", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnRecClickedListener;", "getOnRecClickedListener", "()Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnRecClickedListener;", "setOnRecClickedListener", "(Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnRecClickedListener;)V", "onViewMovedListeners", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "Lcom/tinder/superlikeable/view/OnViewMovedListener;", "presenter", "Lcom/tinder/superlikeable/presenter/SuperLikeableGamePresenter;", "getPresenter", "()Lcom/tinder/superlikeable/presenter/SuperLikeableGamePresenter;", "setPresenter", "(Lcom/tinder/superlikeable/presenter/SuperLikeableGamePresenter;)V", "skipTextView", "Landroid/widget/TextView;", "superLikeableEntranceAnimationShown", "superLikeableEntranceAnimator", "Lcom/tinder/superlikeable/animation/SuperLikeableEntranceAnimator;", "superLikeableGridView", "Lcom/tinder/superlikeable/view/SuperLikeableGridView;", "superLikeableLogoView", "Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView;", "topStarsView", "topTextView", "addExitAnimationListener", "listener", "addGameListener", "gameListener", "addOnViewDragListener", "bindRecs", "recs", "", "Lcom/tinder/domain/recs/model/UserRec;", "checkIfViewReadyForAnimation", "disableInteraction", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "enableInteraction", "notifyCanStartEntranceParams", "params", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "notifyGameStart", "superLikeableGame", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "notifyRecSwiped", "viewIndex", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "notifyViewMoved", "view", "dragX", "dragY", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "onExitAnimationComplete", "presentGameAbnormallyAbortedState", "removeGameListener", "removeOnViewDragListener", "setStringResources", "stringResources", "Lcom/tinder/superlikeable/resources/StringResources;", "setSuperLikeRemainingCount", "superLikeRemainingCount", "startBottomLoopAnimation", "startEntranceAnimation", "startIntroTutorialAnimation", "startTopLoopAnimation", "setOneShotAnimationEndListener", "block", "Lkotlin/Function0;", "GameListener", "OnExitAnimationEndListener", "OnRecClickedListener", "SimpleGameListener", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableViewContainer extends FrameLayout implements Container, SuperLikeableGameTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15140a f52074a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C18200e f52075b;
    /* renamed from: c */
    private final TextView f52076c;
    /* renamed from: d */
    private final TextView f52077d;
    /* renamed from: e */
    private final LottieAnimationView f52078e;
    /* renamed from: f */
    private final LottieAnimationView f52079f;
    /* renamed from: g */
    private final BackgroundScalingView f52080g;
    /* renamed from: h */
    private final SuperLikeableLogoLottieView f52081h;
    /* renamed from: i */
    private final Rect f52082i = new Rect();
    /* renamed from: j */
    private final SuperLikeableGridView f52083j;
    /* renamed from: k */
    private final HashSet<OnExitAnimationEndListener> f52084k = new HashSet();
    /* renamed from: l */
    private final HashSet<Function3<View, Float, Float, C15813i>> f52085l = new HashSet();
    /* renamed from: m */
    private final C15111c f52086m = new C15111c(null, null, null, null, null, null, 63, null);
    /* renamed from: n */
    private final C15118d f52087n = new C15118d(null, 1, null);
    /* renamed from: o */
    private final CopyOnWriteArraySet<GameListener> f52088o = new CopyOnWriteArraySet();
    /* renamed from: p */
    private int f52089p;
    /* renamed from: q */
    private boolean f52090q;
    /* renamed from: r */
    private boolean f52091r;
    /* renamed from: s */
    private C16894a f52092s;
    @Nullable
    /* renamed from: t */
    private OnRecClickedListener f52093t;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J \u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$GameListener;", "", "onBackClick", "", "onGameAbnormallyAborted", "onGameStart", "game", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "onProfileOpen", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "onSkipClick", "onSuperLikeSwipe", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "recIndex", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface GameListener {
        void onBackClick();

        void onGameAbnormallyAborted();

        void onGameStart(@NotNull SuperLikeableGame superLikeableGame);

        void onProfileOpen(@NotNull UserRec userRec);

        void onSkipClick();

        void onSuperLikeSwipe(@NotNull UserRec userRec, @NotNull Method method, int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnExitAnimationEndListener;", "", "onAnimationEnd", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface OnExitAnimationEndListener {
        void onAnimationEnd();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$OnRecClickedListener;", "", "onRecClicked", "", "view", "Landroid/view/View;", "index", "", "rec", "Lcom/tinder/domain/recs/model/UserRec;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface OnRecClickedListener {
        void onRecClicked(@NotNull View view, int i, @NotNull UserRec userRec);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/superlikeable/view/SuperLikeableViewContainer$notifyCanStartEntranceParams$onGlobalLayoutListener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;Landroid/graphics/Rect;Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;)V", "onGlobalLayout", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewContainer$b */
    public static final class C15161b implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableViewContainer f47168a;
        /* renamed from: b */
        final /* synthetic */ Rect f47169b;
        /* renamed from: c */
        final /* synthetic */ C15148a f47170c;

        C15161b(SuperLikeableViewContainer superLikeableViewContainer, Rect rect, C15148a c15148a) {
            this.f47168a = superLikeableViewContainer;
            this.f47169b = rect;
            this.f47170c = c15148a;
        }

        public void onGlobalLayout() {
            C15138d.m56966a(this.f47168a.f52080g, this.f47169b);
            int i = this.f47170c.m57005c().top - this.f47169b.top;
            this.f47168a.f52080g.setTranslationX((float) (this.f47170c.m57005c().left - this.f47169b.left));
            this.f47168a.f52080g.setTranslationY((float) i);
            if (this.f47168a.m62519a()) {
                this.f47168a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f47168a.f52090q = true;
                this.f47168a.getPresenter().m56979d();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/view/SuperLikeableViewContainer$setOneShotAnimationEndListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/airbnb/lottie/LottieAnimationView;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewContainer$c */
    public static final class C15162c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f47171a;
        /* renamed from: b */
        final /* synthetic */ Function0 f47172b;

        C15162c(LottieAnimationView lottieAnimationView, Function0 function0) {
            this.f47171a = lottieAnimationView;
            this.f47172b = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47171a.b(this);
            this.f47172b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$SimpleGameListener;", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$GameListener;", "()V", "onBackClick", "", "onGameAbnormallyAborted", "onGameStart", "game", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "onProfileOpen", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "onSkipClick", "onSuperLikeSwipe", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "recIndex", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewContainer$a */
    public static abstract class C16902a implements GameListener {
        public void onBackClick() {
        }

        public void onGameAbnormallyAborted() {
        }

        public void onGameStart(@NotNull SuperLikeableGame superLikeableGame) {
            C2668g.b(superLikeableGame, "game");
        }

        public void onProfileOpen(@NotNull UserRec userRec) {
            C2668g.b(userRec, "userRec");
        }

        public void onSkipClick() {
        }

        public void onSuperLikeSwipe(@NotNull UserRec userRec, @NotNull Method method, int i) {
            C2668g.b(userRec, "userRec");
            C2668g.b(method, "swipeMethod");
        }
    }

    @NotNull
    /* renamed from: g */
    public static final /* synthetic */ C16894a m62529g(SuperLikeableViewContainer superLikeableViewContainer) {
        superLikeableViewContainer = superLikeableViewContainer.f52092s;
        if (superLikeableViewContainer == null) {
            C2668g.b("gridAdapter");
        }
        return superLikeableViewContainer;
    }

    public SuperLikeableViewContainer(@NotNull final Context context) {
        C2668g.b(context, "context");
        super(context);
        ((SuperLikeableInjector$Factory) context).createSuperLikeableInjector(this).inject(this);
        View.inflate(context, C15086d.superlikeable_view_container, this);
        View findViewById = findViewById(C15085c.top_text_view);
        C2668g.a(findViewById, "findViewById(R.id.top_text_view)");
        this.f52076c = (TextView) findViewById;
        findViewById = findViewById(C15085c.bottom_text_view);
        C2668g.a(findViewById, "findViewById(R.id.bottom_text_view)");
        this.f52077d = (TextView) findViewById;
        findViewById = findViewById(C15085c.superlikeable_grid);
        C2668g.a(findViewById, "findViewById(R.id.superlikeable_grid)");
        this.f52083j = (SuperLikeableGridView) findViewById;
        findViewById = findViewById(C15085c.lottie_top_entrance);
        C2668g.a(findViewById, "findViewById(R.id.lottie_top_entrance)");
        this.f52078e = (LottieAnimationView) findViewById;
        findViewById = findViewById(C15085c.lottie_bottom_entrance);
        C2668g.a(findViewById, "findViewById(R.id.lottie_bottom_entrance)");
        this.f52079f = (LottieAnimationView) findViewById;
        SuperLikeableViewContainer superLikeableViewContainer = this;
        m62515a(this.f52078e, (Function0) new Function0<C15813i>(superLikeableViewContainer) {
            public final String getName() {
                return "startTopLoopAnimation";
            }

            public final KDeclarationContainer getOwner() {
                return C15825i.m59860a(SuperLikeableViewContainer.class);
            }

            public final String getSignature() {
                return "startTopLoopAnimation()V";
            }

            public /* synthetic */ Object invoke() {
                m68139a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m68139a() {
                ((SuperLikeableViewContainer) this.receiver).m62524d();
            }
        });
        m62515a(this.f52079f, (Function0) new Function0<C15813i>(superLikeableViewContainer) {
            public final String getName() {
                return "startBottomLoopAnimation";
            }

            public final KDeclarationContainer getOwner() {
                return C15825i.m59860a(SuperLikeableViewContainer.class);
            }

            public final String getSignature() {
                return "startBottomLoopAnimation()V";
            }

            public /* synthetic */ Object invoke() {
                m68140a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m68140a() {
                ((SuperLikeableViewContainer) this.receiver).m62526e();
            }
        });
        findViewById = findViewById(C15085c.superlikeable_scaling_background_view);
        C2668g.a(findViewById, "findViewById(R.id.superl…_scaling_background_view)");
        this.f52080g = (BackgroundScalingView) findViewById;
        findViewById = findViewById(C15085c.superlikeable_view_container_logo);
        C2668g.a(findViewById, "findViewById(R.id.superl…able_view_container_logo)");
        this.f52081h = (SuperLikeableLogoLottieView) findViewById;
        this.f52077d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter().m56977b();
                for (GameListener onSkipClick : this.f52088o) {
                    onSkipClick.onSkipClick();
                }
            }
        });
        this.f52083j.setOnViewMovedListener(new Function3<View, Float, Float, C15813i>() {
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m67450a((View) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67450a(@NotNull View view, float f, float f2) {
                C2668g.b(view, "view");
                ((CellView) view).mo13541a(f, f2);
                this.m62514a(view, f, f2);
            }
        });
        this.f52083j.setOnCellClickedListener(new Function2<View, Integer, C15813i>() {
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                m67451a((View) obj, ((Number) obj2).intValue());
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67451a(@NotNull View view, int i) {
                C2668g.b(view, "view");
                OnRecClickedListener onRecClickedListener = this.getOnRecClickedListener();
                if (onRecClickedListener != null) {
                    onRecClickedListener.onRecClicked(view, i, SuperLikeableViewContainer.m62529g(this).m62492a(i));
                }
                for (GameListener onProfileOpen : this.f52088o) {
                    onProfileOpen.onProfileOpen(SuperLikeableViewContainer.m62529g(this).m62492a(i));
                }
            }
        });
        this.f52083j.setOnFlingCompleteListener(new Function0<C15813i>() {
            public /* synthetic */ Object invoke() {
                m67452a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67452a() {
                Drawable a = C0432b.a(context, C15084b.superlikeable_star);
                if (a == null) {
                    C2668g.a();
                }
                C15118d h = this.f52087n;
                SuperLikeableViewContainer superLikeableViewContainer = this;
                SuperLikeableGridView i = this.f52083j;
                BackgroundScalingView a2 = this.f52080g;
                Rect j = this.f52082i;
                C2668g.a(a, "drawable");
                C15112a a3 = h.m56942a(superLikeableViewContainer, i, a2, j, a);
                this.m62520b();
                this.f52087n.m56944a(a3, new Function0<C15813i>(this) {
                    public final String getName() {
                        return "onExitAnimationComplete";
                    }

                    public final KDeclarationContainer getOwner() {
                        return C15825i.m59860a(SuperLikeableViewContainer.class);
                    }

                    public final String getSignature() {
                        return "onExitAnimationComplete()V";
                    }

                    public /* synthetic */ Object invoke() {
                        m68141a();
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m68141a() {
                        ((SuperLikeableViewContainer) this.receiver).m62523c();
                    }
                });
            }
        });
        this.f52083j.setOnSwipeListener(new Function3<View, Integer, Method, C15813i>() {
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m67453a((View) obj, ((Number) obj2).intValue(), (Method) obj3);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67453a(@NotNull View view, int i, @NotNull Method method) {
                C2668g.b(view, "<anonymous parameter 0>");
                C2668g.b(method, "swipeMethod");
                this.m62513a(i, method);
            }
        });
        context = this.f52075b;
        if (context == null) {
            C2668g.b("analyticsGameListener");
        }
        m62536a((GameListener) context);
    }

    @NotNull
    public final C15140a getPresenter() {
        C15140a c15140a = this.f52074a;
        if (c15140a == null) {
            C2668g.b("presenter");
        }
        return c15140a;
    }

    public final void setPresenter(@NotNull C15140a c15140a) {
        C2668g.b(c15140a, "<set-?>");
        this.f52074a = c15140a;
    }

    @NotNull
    public final C18200e getAnalyticsGameListener() {
        C18200e c18200e = this.f52075b;
        if (c18200e == null) {
            C2668g.b("analyticsGameListener");
        }
        return c18200e;
    }

    public final void setAnalyticsGameListener(@NotNull C18200e c18200e) {
        C2668g.b(c18200e, "<set-?>");
        this.f52075b = c18200e;
    }

    @Nullable
    public final OnRecClickedListener getOnRecClickedListener() {
        return this.f52093t;
    }

    public final void setOnRecClickedListener(@Nullable OnRecClickedListener onRecClickedListener) {
        this.f52093t = onRecClickedListener;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15140a c15140a = this.f52074a;
        if (c15140a == null) {
            C2668g.b("presenter");
        }
        c15140a.m56976a((SuperLikeableGameTarget) this);
        requestLayout();
    }

    protected void onDetachedFromWindow() {
        this.f52086m.m56930b();
        this.f52087n.m56943a();
        super.onDetachedFromWindow();
        C15140a c15140a = this.f52074a;
        if (c15140a == null) {
            C2668g.b("presenter");
        }
        c15140a.m56975a();
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        if (this.f52091r) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void bindRecs(@NotNull List<? extends UserRec> list) {
        C2668g.b(list, "recs");
        this.f52092s = new C16894a(list);
        list = this.f52083j;
        C16894a c16894a = this.f52092s;
        if (c16894a == null) {
            C2668g.b("gridAdapter");
        }
        list.setAdapter(c16894a);
    }

    public void presentGameAbnormallyAbortedState() {
        for (GameListener onGameAbnormallyAborted : this.f52088o) {
            onGameAbnormallyAborted.onGameAbnormallyAborted();
        }
    }

    public void startEntranceAnimation() {
        this.f52090q = true;
        this.f52080g.setAlpha(1.0f);
        this.f52086m.m56927a(C15103b.f46980a.m56888a((float) (this.f52089p - C15138d.m56965a((View) this.f52081h).top), (View) this.f52080g, (LottieAnimationView) this.f52081h, this.f52076c, this.f52077d, this.f52078e, this.f52079f, this.f52083j, (float) getWidth(), (float) getHeight()));
    }

    public boolean onBackPressed() {
        if (!this.f52091r) {
            return true;
        }
        C15140a c15140a = this.f52074a;
        if (c15140a == null) {
            C2668g.b("presenter");
        }
        c15140a.m56977b();
        for (GameListener onBackClick : this.f52088o) {
            onBackClick.onBackClick();
        }
        return true;
    }

    public void startIntroTutorialAnimation() {
        this.f52083j.m57039a((Function0) new SuperLikeableViewContainer$startIntroTutorialAnimation$1(this));
    }

    public void enableInteraction() {
        this.f52091r = true;
    }

    public void notifyGameStart(@NotNull SuperLikeableGame superLikeableGame) {
        C2668g.b(superLikeableGame, "superLikeableGame");
        for (GameListener onGameStart : this.f52088o) {
            onGameStart.onGameStart(superLikeableGame);
        }
    }

    public void setSuperLikeRemainingCount(int i) {
        this.f52080g.setSuperLikeCount(i);
    }

    public final void setStringResources(@NotNull C15141a c15141a) {
        C2668g.b(c15141a, "stringResources");
        this.f52076c.setText(c15141a.m56982a());
        this.f52077d.setText(c15141a.m56983b());
    }

    /* renamed from: a */
    public final void m62537a(@NotNull OnExitAnimationEndListener onExitAnimationEndListener) {
        C2668g.b(onExitAnimationEndListener, "listener");
        this.f52084k.add(onExitAnimationEndListener);
    }

    /* renamed from: a */
    public final void m62535a(@NotNull C15148a c15148a) {
        C2668g.b(c15148a, "params");
        if (!C15135a.m56960a(this.f52082i)) {
            LayoutParams layoutParams;
            this.f52082i.set(c15148a.m57007e());
            this.f52080g.setBackground(new C15171a(c15148a.m57004b(), c15148a.m57003a()));
            this.f52080g.setAlpha(0.0f);
            this.f52089p = c15148a.m57006d().top;
            if (C15135a.m56960a(c15148a.m57006d())) {
                layoutParams = this.f52081h.getLayoutParams();
                layoutParams.width = c15148a.m57006d().width();
                layoutParams.height = c15148a.m57006d().height();
                this.f52081h.setLayoutParams(layoutParams);
            }
            layoutParams = this.f52080g.getLayoutParams();
            layoutParams.width = c15148a.m57005c().width();
            layoutParams.height = c15148a.m57005c().height();
            this.f52080g.setLayoutParams(layoutParams);
            if (c15148a.m57008f() == null) {
                this.f52081h.m67437i();
            } else {
                this.f52081h.setComposition(c15148a.m57008f());
            }
            m62520b();
            this.f52086m.m56928a((Function0) new SuperLikeableViewContainer$notifyCanStartEntranceParams$1(this));
            C15161b c15161b = new C15161b(this, new Rect(), c15148a);
            getViewTreeObserver().addOnGlobalLayoutListener(c15161b);
            if (this.f52081h.m67438j() == null) {
                this.f52081h.setOnViewReadyListener(new SuperLikeableViewContainer$notifyCanStartEntranceParams$2(this, c15161b));
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void m62536a(@NotNull GameListener gameListener) {
        C2668g.b(gameListener, "gameListener");
        this.f52088o.add(gameListener);
    }

    /* renamed from: b */
    public final void m62538b(@NotNull GameListener gameListener) {
        C2668g.b(gameListener, "gameListener");
        this.f52088o.remove(gameListener);
    }

    /* renamed from: a */
    private final boolean m62519a() {
        return !this.f52090q && !this.f52086m.m56929a() && C15137c.m56962a((View) this) && C15137c.m56962a((View) this.f52080g) && this.f52081h.m67438j() && C15137c.m56963a((ViewGroup) this.f52083j);
    }

    /* renamed from: b */
    private final void m62520b() {
        this.f52091r = false;
    }

    /* renamed from: c */
    private final void m62523c() {
        for (OnExitAnimationEndListener onAnimationEnd : this.f52084k) {
            onAnimationEnd.onAnimationEnd();
        }
        enableInteraction();
    }

    /* renamed from: d */
    private final void m62524d() {
        this.f52078e.b(true);
        this.f52078e.a(0.3f, 1.0f);
    }

    /* renamed from: e */
    private final void m62526e() {
        this.f52079f.b(true);
        this.f52079f.a(0.3f, 1.0f);
    }

    /* renamed from: a */
    private final void m62514a(View view, float f, float f2) {
        for (Function3 invoke : this.f52085l) {
            invoke.invoke(view, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* renamed from: a */
    private final void m62513a(int i, Method method) {
        C16894a c16894a = this.f52092s;
        if (c16894a == null) {
            C2668g.b("gridAdapter");
        }
        UserRec a = c16894a.m62492a(i);
        for (GameListener onSuperLikeSwipe : this.f52088o) {
            onSuperLikeSwipe.onSuperLikeSwipe(a, method, i);
        }
        i = this.f52074a;
        if (i == 0) {
            C2668g.b("presenter");
        }
        i.m56978c();
    }

    /* renamed from: a */
    private final void m62515a(@NotNull LottieAnimationView lottieAnimationView, Function0<C15813i> function0) {
        lottieAnimationView.a(new C15162c(lottieAnimationView, function0));
    }
}
