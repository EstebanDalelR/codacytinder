package com.tinder.toppicks.view;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tinder.R;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.cardstack.cardgrid.view.LoadingStatusViewHolderFactory;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardGridLayout;
import com.tinder.cardstack.view.CardGridLayout.OnScrollProgressListener;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.Tag;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.card.TopPickTeaserRecCard;
import com.tinder.recsgrid.C14780a;
import com.tinder.toppicks.TopPicksComponentProvider;
import com.tinder.toppicks.exhausted.C15264a;
import com.tinder.toppicks.exhausted.C15267e;
import com.tinder.toppicks.header.C15270a;
import com.tinder.toppicks.header.C17028c;
import com.tinder.toppicks.p482c.C16988a;
import com.tinder.toppicks.presenter.C17082e;
import com.tinder.utils.at;
import com.tinder.views.grid.GridUserRecCardView;
import com.tinder.views.grid.RefreshableGridRecsView;
import com.tinder.views.grid.RefreshableGridRecsView$e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003[\\]B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u00102\u001a\u00020\u0019H\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0019H\u0016J\b\u0010;\u001a\u00020\u0019H\u0016J\n\u0010<\u001a\u0004\u0018\u000101H\u0002J\u0006\u0010=\u001a\u00020\u0019J\r\u0010>\u001a\u00020?H\u0010¢\u0006\u0002\b@J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BJ\b\u0010D\u001a\u00020\u0019H\u0016J\u000e\u0010E\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015J\b\u0010F\u001a\u00020\u0019H\u0014J\b\u0010G\u001a\u00020\u0019H\u0014J\b\u0010H\u001a\u00020\u0019H\u0007J\u0006\u0010I\u001a\u00020\u0019J\b\u0010J\u001a\u00020\u0019H\u0007J\u0010\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020OH\u0016J\u000e\u0010P\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020?J\u0018\u0010R\u001a\u00020\u00192\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u000209H\u0016J\b\u0010S\u001a\u00020\u0019H\u0016J\u0010\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020\u0019H\u0016J\f\u0010X\u001a\u00020Y*\u00020ZH\u0002R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R7\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00060%R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGridRecsView;", "Lcom/tinder/views/grid/RefreshableGridRecsView;", "Lcom/tinder/toppicks/view/TopPicksGridRecsTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle$Tinder_release", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle$Tinder_release", "(Landroid/arch/lifecycle/Lifecycle;)V", "loadingStatusViewHolderFactory", "Lcom/tinder/toppicks/view/TopPicksGridRecsView$DummyLoadingStatusViewHolderFactory;", "onScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "paywallCallBack", "Lkotlin/Function1;", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "Lkotlin/ParameterName;", "name", "source", "", "getPaywallCallBack", "()Lkotlin/jvm/functions/Function1;", "setPaywallCallBack", "(Lkotlin/jvm/functions/Function1;)V", "presenter", "Lcom/tinder/toppicks/presenter/TopPicksGridRecsPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/toppicks/presenter/TopPicksGridRecsPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/toppicks/presenter/TopPicksGridRecsPresenter;)V", "topPicksCardViewHolderFactory", "Lcom/tinder/toppicks/view/TopPicksGridRecsView$TopPicksCardViewHolderFactory;", "topPicksTeaserExhaustedViewModelFactory", "Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;", "getTopPicksTeaserExhaustedViewModelFactory$Tinder_release", "()Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;", "setTopPicksTeaserExhaustedViewModelFactory$Tinder_release", "(Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;)V", "topPickscardsFactory", "Lcom/tinder/toppicks/header/TopPicksCardsFactory;", "tutorialRunner", "Lcom/tinder/recsgrid/GridCollectionTutorialRunner;", "viewPagerParent", "Landroid/support/v4/view/ViewPager;", "attachPaywallOverscrollListener", "bindAnalyticsSource", "profileView", "Lcom/tinder/profile/view/UserRecProfileView;", "createPlaceholderPhotoConfig", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "userRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "detachPaywallOverscrollListener", "displayTutorial", "findViewPagerParent", "forceRecsLoad", "getHeaderOffset", "", "getHeaderOffset$Tinder_release", "getTeasers", "", "Lcom/tinder/toppicks/exhausted/TopPickTeaserExhaustedViewModel;", "insertHeader", "invokePaywall", "onAttachedToWindow", "onDetachedFromWindow", "onPause", "onPurchaseSuccess", "onResume", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "rootView", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "setBottomPaddingForList", "padding", "setupProfileViewListener", "showSuperLikeNetworkError", "showSuperLikePaywall", "rec", "Lcom/tinder/domain/recs/model/Rec;", "showTutorial", "hasHeader", "", "Lcom/tinder/cardstack/view/CardGridLayout;", "DummyLoadingStatusViewHolderFactory", "SpanSizeLookup", "TopPicksCardViewHolderFactory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksGridRecsView extends RefreshableGridRecsView implements LifecycleObserver, TopPicksGridRecsTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C17082e f14067a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15267e f14068b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Lifecycle f14069c;
    /* renamed from: g */
    private final TopPicksGridRecsView$a f14070g;
    /* renamed from: h */
    private final TopPicksGridRecsView$c f14071h;
    /* renamed from: i */
    private final C15270a f14072i;
    /* renamed from: j */
    private ViewPager f14073j;
    /* renamed from: k */
    private OnScrollListener f14074k;
    @Nullable
    /* renamed from: l */
    private Function1<? super TopPicksPaywallSource, C15813i> f14075l;
    /* renamed from: m */
    private final C14780a f14076m;
    /* renamed from: n */
    private HashMap f14077n;

    /* renamed from: a */
    public View mo3598a(int i) {
        if (this.f14077n == null) {
            this.f14077n = new HashMap();
        }
        View view = (View) this.f14077n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f14077n.put(Integer.valueOf(i), view);
        return view;
    }

    public int getHeaderOffset$Tinder_release() {
        return 1;
    }

    /* renamed from: b */
    public /* synthetic */ ViewGroup mo3604b() {
        return mo3599a();
    }

    public /* synthetic */ TopPicksGridRecsView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksGridRecsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.f14070g = new TopPicksGridRecsView$a(this);
        this.f14071h = new TopPicksGridRecsView$c(this);
        this.f14072i = new C15270a();
        this.f14074k = (OnScrollListener) new C16988a(new TopPicksGridRecsView$onScrollListener$1(this));
        this.f14076m = new C14780a();
        context = C14398a.a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.TopPicksComponentProvider");
        }
        ((TopPicksComponentProvider) context).provideTopPicksComponent().inject(this);
        getSwipeRefreshLayout$Tinder_release().setEnabled(null);
        getCardGridLayout$Tinder_release().setLoadingStatusViewHolderFactory((LoadingStatusViewHolderFactory) this.f14070g);
        getCardGridLayout$Tinder_release().setCardStackViewHolderFactory((Factory) this.f14071h);
        getCardGridLayout$Tinder_release().setOnScrollProgressListener((OnScrollProgressListener) new TopPicksGridRecsView$1(this));
        getCardGridLayout$Tinder_release().setOnPreSwipeListener((OnPreSwipeListener) new TopPicksGridRecsView$2(this));
        getCardGridLayout$Tinder_release().getLayoutManager().setSpanSizeLookup((SpanSizeLookup) new TopPicksGridRecsView$b(this));
    }

    @Nullable
    public final Function1<TopPicksPaywallSource, C15813i> getPaywallCallBack() {
        return this.f14075l;
    }

    public final void setPaywallCallBack(@Nullable Function1<? super TopPicksPaywallSource, C15813i> function1) {
        this.f14075l = function1;
    }

    @NotNull
    public final C17082e getPresenter$Tinder_release() {
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        return c17082e;
    }

    public final void setPresenter$Tinder_release(@NotNull C17082e c17082e) {
        C2668g.m10309b(c17082e, "<set-?>");
        this.f14067a = c17082e;
    }

    @NotNull
    public final C15267e getTopPicksTeaserExhaustedViewModelFactory$Tinder_release() {
        C15267e c15267e = this.f14068b;
        if (c15267e == null) {
            C2668g.m10310b("topPicksTeaserExhaustedViewModelFactory");
        }
        return c15267e;
    }

    public final void setTopPicksTeaserExhaustedViewModelFactory$Tinder_release(@NotNull C15267e c15267e) {
        C2668g.m10309b(c15267e, "<set-?>");
        this.f14068b = c15267e;
    }

    @NotNull
    public final Lifecycle getLifecycle$Tinder_release() {
        Lifecycle lifecycle = this.f14069c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle$Tinder_release(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f14069c = lifecycle;
    }

    /* renamed from: a */
    public void mo3602a(@NotNull UserRecProfileView userRecProfileView, @NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.m10309b(userRecProfileView, "profileView");
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        userRecProfileView.setListener(new RefreshableGridRecsView$e(this, gridUserRecCardView, c17082e));
    }

    /* renamed from: a */
    public void mo3601a(@NotNull UserRecProfileView userRecProfileView) {
        C2668g.m10309b(userRecProfileView, "profileView");
        userRecProfileView.a(ProfileScreenSource.TOP_PICKS);
    }

    public final void setBottomPaddingForList(int i) {
        getCardGridLayout$Tinder_release().setClipToPadding(false);
        getCardGridLayout$Tinder_release().setPadding(getCardGridLayout$Tinder_release().getPaddingStart(), getCardGridLayout$Tinder_release().getPaddingTop(), getCardGridLayout$Tinder_release().getPaddingRight(), i);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.f14069c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
        this.f14073j = m17370f();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycle = this.f14069c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
        this.f14076m.a();
        Deadshot.drop(this);
        this.f14073j = (ViewPager) null;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c17082e);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        this.f14076m.a();
        Deadshot.drop(this);
    }

    public void reset(@NotNull ResetReason resetReason) {
        C2668g.m10309b(resetReason, "reason");
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        c17082e.a(resetReason);
    }

    public void showTutorial() {
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        c17082e.m();
    }

    public void displayTutorial() {
        this.f14076m.a(getCardGridLayout$Tinder_release(), mo3599a(), 1);
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        c17082e.l();
    }

    /* renamed from: a */
    public final void m17374a(@NotNull TopPicksPaywallSource topPicksPaywallSource) {
        C2668g.m10309b(topPicksPaywallSource, "source");
        Function1 function1 = this.f14075l;
        if (function1 != null) {
            C15813i c15813i = (C15813i) function1.invoke(topPicksPaywallSource);
        }
    }

    public void insertHeader() {
        if (!m17369a(getCardGridLayout$Tinder_release())) {
            m15163a((C8395a) this.f14072i.a(true));
        }
    }

    @NotNull
    /* renamed from: a */
    public TouchBlockingFrameLayout mo3599a() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Object window = ((Activity) context).getWindow();
        C2668g.m10305a(window, "(context as Activity)\n                .window");
        window = window.getDecorView();
        C2668g.m10305a(window, "(context as Activity)\n  …               .decorView");
        window = window.getRootView().findViewById(R.id.main_activity_container);
        C2668g.m10305a(window, "(context as Activity)\n  ….main_activity_container)");
        return (TouchBlockingFrameLayout) window;
    }

    public void attachPaywallOverscrollListener() {
        getCardGridLayout$Tinder_release().addOnScrollListener(this.f14074k);
    }

    public void detachPaywallOverscrollListener() {
        getCardGridLayout$Tinder_release().removeOnScrollListener(this.f14074k);
    }

    public void showSuperLikePaywall(@NotNull Rec rec) {
        C2668g.m10309b(rec, "rec");
        C10076o a = C10076o.a(SuperlikePaywallSource.TOP_PICKS);
        String name = RecFieldDecorationExtensionsKt.name(rec);
        String thumbnailImageUrl = RecFieldDecorationExtensionsKt.thumbnailImageUrl(rec);
        Object obj = null;
        if ((((CharSequence) name).length() == 0 ? 1 : null) == null) {
            CharSequence charSequence = thumbnailImageUrl;
            if (charSequence == null || charSequence.length() == 0) {
                obj = 1;
            }
            if (obj == null) {
                a.a(C10075b.a(name, thumbnailImageUrl));
                a.a(getContext());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create SuperLike paywall intended user for rec: ");
        stringBuilder.append(rec.getId());
        C0001a.m29c(new IllegalArgumentException(stringBuilder.toString()));
        a.a(getContext());
    }

    public void showSuperLikeNetworkError() {
        at.f47621a.a(this, R.string.cannot_superlike);
    }

    @NotNull
    public final List<C15264a> getTeasers() {
        Object adapter = getCardGridLayout$Tinder_release().getAdapter();
        List<C15264a> arrayList = new ArrayList();
        C2668g.m10305a(adapter, "adapter");
        int itemCount = adapter.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (arrayList.size() == 3) {
                break;
            }
            C8395a a = adapter.a(i);
            if (!(a instanceof TopPickTeaserRecCard)) {
                a = null;
            }
            TopPickTeaserRecCard topPickTeaserRecCard = (TopPickTeaserRecCard) a;
            if (topPickTeaserRecCard != null) {
                ViewHolder findViewHolderForAdapterPosition = getCardGridLayout$Tinder_release().findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition != null) {
                    View view = findViewHolderForAdapterPosition.itemView;
                    if (view != null) {
                        C15267e c15267e = this.f14068b;
                        if (c15267e == null) {
                            C2668g.m10310b("topPicksTeaserExhaustedViewModelFactory");
                        }
                        arrayList.add(c15267e.a(arrayList.size(), topPickTeaserRecCard.getItem(), view.getWidth(), new PointF(view.getX(), view.getY())));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo3605c() {
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        c17082e.j();
        mo3606d();
    }

    /* renamed from: d */
    public final void mo3606d() {
        C17082e c17082e = this.f14067a;
        if (c17082e == null) {
            C2668g.m10310b("presenter");
        }
        c17082e.k();
    }

    /* renamed from: f */
    private final ViewPager m17370f() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof ViewPager)) {
            parent = parent.getParent();
        }
        if (!(parent instanceof ViewPager)) {
            parent = (ViewParent) null;
        }
        return (ViewPager) parent;
    }

    /* renamed from: a */
    private final boolean m17369a(@NotNull CardGridLayout cardGridLayout) {
        Object adapter = cardGridLayout.getAdapter();
        C2668g.m10305a(adapter, "this.adapter");
        int itemCount = adapter.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (cardGridLayout.getAdapter().a(i) instanceof C17028c) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public PlaceholderPhotoConfig mo3600a(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        if (!(gridUserRecCardView instanceof TopPicksUserRecCardView)) {
            return super.mo3600a(gridUserRecCardView);
        }
        UserRec userRec = gridUserRecCardView.getUserRecCard().userRec();
        if (userRec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.TopPickUserRec");
        }
        Tag tag = (Tag) C19301m.g(((TopPickUserRec) userRec).getTags());
        Object build = PlaceholderPhotoConfig.builder(super.mo3600a(gridUserRecCardView)).placeholderTagName(tag != null ? tag.getName() : null).build();
        C2668g.m10305a(build, "DefaultRecProfileAnimati…\n                .build()");
        return build;
    }
}
