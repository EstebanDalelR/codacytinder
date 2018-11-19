package com.tinder.fastmatch.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import butterknife.BindString;
import com.tinder.R;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.cardstack.cardgrid.view.DragSessionListener;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.CardGridLayout.OnScrollProgressListener;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.common.view.Container;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.fastmatch.FastMatchRecsActivityComponentProvider;
import com.tinder.fastmatch.presenter.C11648i;
import com.tinder.fastmatch.target.FastMatchRecsGridTarget;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.C16256g;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recsgrid.C14780a;
import com.tinder.utils.C15365p;
import com.tinder.utils.RxUtils;
import com.tinder.utils.an;
import com.tinder.views.grid.GridUserRecCardView;
import com.tinder.views.grid.RefreshableGridRecsView;
import com.tinder.views.grid.RefreshableGridRecsView$b;
import com.tinder.views.grid.RefreshableGridRecsView$d;
import com.tinder.views.grid.RefreshableGridRecsView$e;
import com.tinder.views.grid.p450b.C15455a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002BCB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020/H\u0014J\b\u00104\u001a\u00020/H\u0014J\b\u00105\u001a\u00020/H\u0014J\b\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020/H\u0016R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010R\u001e\u0010(\u001a\u00020)8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006D"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsView;", "Lcom/tinder/views/grid/RefreshableGridRecsView;", "Lcom/tinder/fastmatch/target/FastMatchRecsGridTarget;", "Lcom/tinder/common/view/Container;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundColorAnimatorFactory", "Lcom/tinder/fastmatch/view/FastMatchRecsView$BackgroundColorAnimatorFactory;", "errorTitleText", "", "getErrorTitleText$Tinder_release", "()Ljava/lang/String;", "setErrorTitleText$Tinder_release", "(Ljava/lang/String;)V", "fastMatchCardViewHolderFactory", "Lcom/tinder/fastmatch/view/FastMatchRecsView$FastMatchCardViewHolderFactory;", "fastMatchRecsTutorialRunner", "Lcom/tinder/recsgrid/GridCollectionTutorialRunner;", "isAnimatingLike", "", "loadingStatusViewHolderFactory", "Lcom/tinder/views/grid/RefreshableGridRecsView$GridLoadingStatusViewHolderFactory;", "notificationDispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "getNotificationDispatcher$Tinder_release", "()Lcom/tinder/pushnotifications/NotificationDispatcher;", "setNotificationDispatcher$Tinder_release", "(Lcom/tinder/pushnotifications/NotificationDispatcher;)V", "presenter", "Lcom/tinder/fastmatch/presenter/FastMatchRecsGridPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/fastmatch/presenter/FastMatchRecsGridPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/fastmatch/presenter/FastMatchRecsGridPresenter;)V", "successTitleText", "getSuccessTitleText$Tinder_release", "setSuccessTitleText$Tinder_release", "tinderNotificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "getTinderNotificationFactory$Tinder_release", "()Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "setTinderNotificationFactory$Tinder_release", "(Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;)V", "animateLike", "", "bindAnalyticsSource", "profileView", "Lcom/tinder/profile/view/UserRecProfileView;", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "rootView", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "setupProfileViewListener", "userRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "showNotification", "viewModel", "Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel;", "showSuperLikePaywall", "rec", "Lcom/tinder/domain/recs/model/Rec;", "showTutorial", "BackgroundColorAnimatorFactory", "FastMatchCardViewHolderFactory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchRecsView extends RefreshableGridRecsView implements Container, FastMatchRecsGridTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C11648i f41915a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C14548a f41916b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C14550a f41917c;
    @BindString(2131820943)
    @NotNull
    public String errorTitleText;
    /* renamed from: g */
    private final RefreshableGridRecsView$b f41918g = new RefreshableGridRecsView$b(this);
    /* renamed from: h */
    private final C11667b f41919h = new C11667b(this);
    /* renamed from: i */
    private final C14780a f41920i = new C14780a();
    /* renamed from: j */
    private final C9411a f41921j = new C9411a(this);
    /* renamed from: k */
    private boolean f41922k;
    /* renamed from: l */
    private HashMap f41923l;
    @BindString(2131821249)
    @NotNull
    public String successTitleText;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsView$BackgroundColorAnimatorFactory;", "", "(Lcom/tinder/fastmatch/view/FastMatchRecsView;)V", "createToGreen", "Landroid/animation/Animator;", "createToWhite", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$a */
    private final class C9411a {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f31537a;

        public C9411a(FastMatchRecsView fastMatchRecsView) {
            this.f31537a = fastMatchRecsView;
        }

        @NotNull
        /* renamed from: a */
        public final Animator m39356a() {
            ObjectAnimator duration = ObjectAnimator.ofInt(this.f31537a.getCardGridLayout$Tinder_release(), "backgroundColor", new int[]{this.f31537a.whiteBackgroundColor, this.f31537a.greenBackgroundColor}).setDuration(500);
            duration.setEvaluator(new ArgbEvaluator());
            C2668g.a(duration, "animator");
            return duration;
        }

        @NotNull
        /* renamed from: b */
        public final Animator m39357b() {
            ObjectAnimator duration = ObjectAnimator.ofInt(this.f31537a.getCardGridLayout$Tinder_release(), "backgroundColor", new int[]{this.f31537a.greenBackgroundColor, this.f31537a.whiteBackgroundColor}).setDuration(500);
            duration.setEvaluator(new ArgbEvaluator());
            C2668g.a(duration, "animator");
            return duration;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsView$FastMatchCardViewHolderFactory;", "Lcom/tinder/cardstack/view/CardViewHolder$Factory;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "(Lcom/tinder/fastmatch/view/FastMatchRecsView;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getViewType", "card", "SimpleCardViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$b */
    private final class C11667b implements Factory<CardViewHolder<C8395a<?>>, C8395a<?>> {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f38146a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$b$b */
        static final class C9412b implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C11667b f31538a;
            /* renamed from: b */
            final /* synthetic */ GridUserRecCardView f31539b;

            C9412b(C11667b c11667b, GridUserRecCardView gridUserRecCardView) {
                this.f31538a = c11667b;
                this.f31539b = gridUserRecCardView;
            }

            public final void onClick(View view) {
                this.f31538a.f38146a.b(this.f31539b);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsView$FastMatchCardViewHolderFactory$SimpleCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Landroid/view/View;", "(Lcom/tinder/fastmatch/view/FastMatchRecsView$FastMatchCardViewHolderFactory;Landroid/view/View;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$b$a */
        public final class C13209a extends CardViewHolder<C8395a<?>> {
            /* renamed from: a */
            final /* synthetic */ C11667b f41913a;

            public C13209a(C11667b c11667b, @NotNull View view) {
                C2668g.b(view, "itemView");
                this.f41913a = c11667b;
                super(view);
            }
        }

        public int getViewType(@Nullable C8395a<?> c8395a) {
            return 0;
        }

        public C11667b(FastMatchRecsView fastMatchRecsView) {
            this.f38146a = fastMatchRecsView;
        }

        @NotNull
        public CardViewHolder<C8395a<?>> createViewHolder(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            if (i != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported view type: ");
                stringBuilder.append(i);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
            viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recs_card_fast_match, viewGroup, false);
            if (viewGroup == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.grid.GridUserRecCardView");
            }
            GridUserRecCardView gridUserRecCardView = (GridUserRecCardView) viewGroup;
            gridUserRecCardView.setOnClickListener((OnClickListener) new C9412b(this, gridUserRecCardView));
            gridUserRecCardView.getParallaxFrameLayout().setParallaxManager(new RefreshableGridRecsView$d(this.f38146a));
            return (CardViewHolder) new C13209a(this, gridUserRecCardView);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/fastmatch/view/FastMatchRecsView$animateLike$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/fastmatch/view/FastMatchRecsView;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$c */
    public static final class C11668c extends an {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f38147a;

        C11668c(FastMatchRecsView fastMatchRecsView) {
            this.f38147a = fastMatchRecsView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f38147a.f41922k = false;
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            this.f38147a.f41922k = false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/fastmatch/view/FastMatchRecsView$onFinishInflate$1", "Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;", "(Lcom/tinder/fastmatch/view/FastMatchRecsView;)V", "onScrolled", "", "progress", "", "velocity", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$d */
    public static final class C11669d implements OnScrollProgressListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f38148a;

        C11669d(FastMatchRecsView fastMatchRecsView) {
            this.f38148a = fastMatchRecsView;
        }

        public void onScrolled(float f, float f2) {
            this.f38148a.getPresenter$Tinder_release().m47446a(f, f2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "card", "Lcom/tinder/cardstack/model/Card;", "", "kotlin.jvm.PlatformType", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "onPreSwipe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$e */
    static final class C11670e implements OnPreSwipeListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f38149a;

        C11670e(FastMatchRecsView fastMatchRecsView) {
            this.f38149a = fastMatchRecsView;
        }

        public final boolean onPreSwipe(@NotNull C8395a<Object> c8395a, @NotNull SwipeDirection swipeDirection) {
            C2668g.b(c8395a, "card");
            C2668g.b(swipeDirection, "swipeDirection");
            c8395a = this.f38149a.b(c8395a);
            switch (C9419g.f31560a[swipeDirection.ordinal()]) {
                case 1:
                    this.f38149a.getPresenter$Tinder_release().passOnRec(c8395a, SwipeOrigin.GRID);
                    return true;
                case 2:
                    this.f38149a.getPresenter$Tinder_release().likeOnRec(c8395a, SwipeOrigin.GRID);
                    return true;
                default:
                    return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$f */
    static final class C11671f implements OnRefreshListener {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f38150a;

        C11671f(FastMatchRecsView fastMatchRecsView) {
            this.f38150a = fastMatchRecsView;
        }

        public final void onRefresh() {
            this.f38150a.getPresenter$Tinder_release().m47451f();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/pushnotifications/model/MatchNotification;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.FastMatchRecsView$g */
    static final class C13210g<T, R> implements Func1<C16256g, Completable> {
        /* renamed from: a */
        final /* synthetic */ FastMatchRecsView f41914a;

        C13210g(FastMatchRecsView fastMatchRecsView) {
            this.f41914a = fastMatchRecsView;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51194a((C16256g) obj);
        }

        /* renamed from: a */
        public final Completable m51194a(final C16256g c16256g) {
            return Completable.a(new Action0() {
                public final void call() {
                    C14550a notificationDispatcher$Tinder_release = this.f41914a.getNotificationDispatcher$Tinder_release();
                    C16256g c16256g = c16256g;
                    C2668g.a(c16256g, "it");
                    notificationDispatcher$Tinder_release.a(c16256g);
                }
            });
        }
    }

    /* renamed from: a */
    public View m51196a(int i) {
        if (this.f41923l == null) {
            this.f41923l = new HashMap();
        }
        View view = (View) this.f41923l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f41923l.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: b */
    public /* synthetic */ ViewGroup m51200b() {
        return m51197a();
    }

    public FastMatchRecsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        context = C15365p.b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.fastmatch.FastMatchRecsActivityComponentProvider");
        }
        ((FastMatchRecsActivityComponentProvider) context).getFastMatchRecsActivityComponent().inject(this);
        getCardGridLayout$Tinder_release().setDragSessionListener((DragSessionListener) new DragSessionListener() {
            public void onDragStarted() {
                this.getSwipeRefreshLayout$Tinder_release().setEnabled(false);
            }

            public void onDragEnded() {
                this.getSwipeRefreshLayout$Tinder_release().setEnabled(true);
            }
        });
    }

    @NotNull
    public final C11648i getPresenter$Tinder_release() {
        C11648i c11648i = this.f41915a;
        if (c11648i == null) {
            C2668g.b("presenter");
        }
        return c11648i;
    }

    public final void setPresenter$Tinder_release(@NotNull C11648i c11648i) {
        C2668g.b(c11648i, "<set-?>");
        this.f41915a = c11648i;
    }

    @NotNull
    public final C14548a getTinderNotificationFactory$Tinder_release() {
        C14548a c14548a = this.f41916b;
        if (c14548a == null) {
            C2668g.b("tinderNotificationFactory");
        }
        return c14548a;
    }

    public final void setTinderNotificationFactory$Tinder_release(@NotNull C14548a c14548a) {
        C2668g.b(c14548a, "<set-?>");
        this.f41916b = c14548a;
    }

    @NotNull
    public final C14550a getNotificationDispatcher$Tinder_release() {
        C14550a c14550a = this.f41917c;
        if (c14550a == null) {
            C2668g.b("notificationDispatcher");
        }
        return c14550a;
    }

    public final void setNotificationDispatcher$Tinder_release(@NotNull C14550a c14550a) {
        C2668g.b(c14550a, "<set-?>");
        this.f41917c = c14550a;
    }

    @NotNull
    public final String getSuccessTitleText$Tinder_release() {
        String str = this.successTitleText;
        if (str == null) {
            C2668g.b("successTitleText");
        }
        return str;
    }

    public final void setSuccessTitleText$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.successTitleText = str;
    }

    @NotNull
    public final String getErrorTitleText$Tinder_release() {
        String str = this.errorTitleText;
        if (str == null) {
            C2668g.b("errorTitleText");
        }
        return str;
    }

    public final void setErrorTitleText$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.errorTitleText = str;
    }

    /* renamed from: a */
    public void m51199a(@NotNull UserRecProfileView userRecProfileView, @NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.b(userRecProfileView, "profileView");
        C2668g.b(gridUserRecCardView, "userRecCardView");
        C11648i c11648i = this.f41915a;
        if (c11648i == null) {
            C2668g.b("presenter");
        }
        userRecProfileView.setListener(new RefreshableGridRecsView$e(this, gridUserRecCardView, c11648i));
    }

    /* renamed from: a */
    public void m51198a(@NotNull UserRecProfileView userRecProfileView) {
        C2668g.b(userRecProfileView, "profileView");
        userRecProfileView.a(ProfileScreenSource.LIKES_YOU);
    }

    public void showNotification(@NotNull C15455a c15455a) {
        C2668g.b(c15455a, "viewModel");
        if (c15455a.c()) {
            C14548a c14548a = this.f41916b;
            if (c14548a == null) {
                C2668g.b("tinderNotificationFactory");
            }
            String string = getResources().getString(R.string.tap_to_chat_with, new Object[]{c15455a.a()});
            C2668g.a(string, "resources.getString(R.st…hat_with, viewModel.name)");
            String d = c15455a.d();
            c15455a = c15455a.b();
            String str = this.successTitleText;
            if (str == null) {
                C2668g.b("successTitleText");
            }
            c14548a.a(string, d, c15455a, str).c(new C13210g(this)).b(Schedulers.io()).b(RxUtils.b());
            return;
        }
        C14550a c14550a = this.f41917c;
        if (c14550a == null) {
            C2668g.b("notificationDispatcher");
        }
        C14548a c14548a2 = this.f41916b;
        if (c14548a2 == null) {
            C2668g.b("tinderNotificationFactory");
        }
        c15455a = getResources().getString(R.string.failed_to_match_with, new Object[]{c15455a.a()});
        C2668g.a(c15455a, "resources.getString(R.st…tch_with, viewModel.name)");
        string = this.errorTitleText;
        if (string == null) {
            C2668g.b("errorTitleText");
        }
        c14550a.a(c14548a2.b(c15455a, string));
    }

    public void showTutorial() {
        C14780a.a(this.f41920i, getCardGridLayout$Tinder_release(), m51197a(), 0, 4, null);
    }

    public void animateLike() {
        if (!this.f41922k) {
            this.f41922k = true;
            Animator a = this.f41921j.m39356a();
            this.f41921j.m39357b().addListener(new C11668c(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{a, r2});
            animatorSet.start();
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        getCardGridLayout$Tinder_release().setCardStackViewHolderFactory(this.f41919h);
        getCardGridLayout$Tinder_release().setLoadingStatusViewHolderFactory(this.f41918g);
        getCardGridLayout$Tinder_release().setOnScrollProgressListener(new C11669d(this));
        getCardGridLayout$Tinder_release().setOnPreSwipeListener(new C11670e(this));
        getSwipeRefreshLayout$Tinder_release().setOnRefreshListener(new C11671f(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11648i c11648i = this.f41915a;
        if (c11648i == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c11648i);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    @NotNull
    /* renamed from: a */
    public TouchBlockingFrameLayout m51197a() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Window window = ((Activity) context).getWindow();
        C2668g.a(window, "(context as Activity)\n                    .window");
        View decorView = window.getDecorView();
        C2668g.a(decorView, "(context as Activity)\n  …               .decorView");
        decorView = decorView.getRootView().findViewById(R.id.touch_blocking_container);
        C2668g.a(decorView, "(context as Activity)\n  …touch_blocking_container)");
        return (TouchBlockingFrameLayout) decorView;
    }

    public void showSuperLikePaywall(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        C10076o a = C10076o.m41167a((PaywallTypeSource) SuperlikePaywallSource.SUPERLIKE_EXHAUSTED);
        String name = RecFieldDecorationExtensionsKt.name(rec);
        String thumbnailImageUrl = RecFieldDecorationExtensionsKt.thumbnailImageUrl(rec);
        Object obj = null;
        if ((((CharSequence) name).length() == 0 ? 1 : null) == null) {
            CharSequence charSequence = thumbnailImageUrl;
            if (charSequence == null || charSequence.length() == 0) {
                obj = 1;
            }
            if (obj == null) {
                a.m41171a(C10075b.m41164a(name, thumbnailImageUrl));
                a.m41175a(getContext());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create SuperLike paywall intended user for rec: ");
        stringBuilder.append(rec.getId());
        C0001a.c(new IllegalArgumentException(stringBuilder.toString()));
        a.m41175a(getContext());
    }
}
