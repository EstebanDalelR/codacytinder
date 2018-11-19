package com.tinder.places.recs.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import com.facebook.ads.AdError;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.cardstack.cardgrid.view.C10483c;
import com.tinder.cardstack.cardgrid.view.LoadingStatusViewHolderFactory;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.cardstack.view.CardGridLayout;
import com.tinder.cardstack.view.CardGridLayout.OnScrollProgressListener;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.common.view.Container;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.places.injection.PlacesRecsComponentProvider;
import com.tinder.places.recs.presenter.C12433a;
import com.tinder.places.recs.target.PlacesRecsGridTarget;
import com.tinder.places.viewmodel.PlaceColor;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.DefaultRecProfileEntranceAnimationDecorator;
import com.tinder.recs.animation.DefaultRecProfileExitAnimationDecorator;
import com.tinder.recs.animation.PlaceRecProfileEntranceAnimationDecorator;
import com.tinder.recs.animation.RecProfileAnimationDecorator.StartListener;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recsgrid.C14780a;
import com.tinder.utils.ao;
import com.tinder.utils.au;
import com.tinder.utils.av;
import com.tinder.views.grid.GridUserRecCardView;
import com.tinder.views.grid.RefreshableGridRecsView;
import com.tinder.views.grid.RefreshableGridRecsView$d;
import com.tinder.views.grid.RefreshableGridRecsView$e;
import com.tinder.views.grid.p450b.C15455a;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.ranges.C19068g;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Z[\\]B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\f2\u0006\u00101\u001a\u000202H\u0002J\f\u00103\u001a\b\u0012\u0004\u0012\u00020504J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u00020\fH\u0002J \u00109\u001a\u00020:2\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020'2\u0006\u0010;\u001a\u00020)H\u0016J \u0010<\u001a\u00020=2\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020'2\u0006\u0010;\u001a\u00020)H\u0016J\r\u0010>\u001a\u00020\fH\u0010¢\u0006\u0002\b?J\u0006\u0010@\u001a\u00020$J\b\u0010A\u001a\u00020$H\u0014J\b\u0010B\u001a\u00020$H\u0014J\u0006\u0010C\u001a\u00020$J\b\u0010D\u001a\u00020$H\u0014J\u001a\u0010E\u001a\u00020$2\u0006\u00108\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J(\u0010K\u001a\u00020$2 \u0010L\u001a\u001c\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020$\u0018\u00010Mj\u0004\u0018\u0001`OJ\u0018\u0010P\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020$H\u0016J\b\u0010X\u001a\u00020$H\u0016J\b\u0010Y\u001a\u00020$H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006^"}, d2 = {"Lcom/tinder/places/recs/view/PlacesRecsView;", "Lcom/tinder/views/grid/RefreshableGridRecsView;", "Lcom/tinder/places/recs/target/PlacesRecsGridTarget;", "Lcom/tinder/common/view/Container;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "color", "Lcom/tinder/places/viewmodel/PlaceColor;", "finalHeight", "", "gridSideOffset", "gridTopOffset", "injected", "", "loadingStatusViewHolderFactory", "Lcom/tinder/places/recs/view/PlacesRecsView$PlacesLoadingStatusViewHolderFactory;", "placesCardViewHolderFactory", "Lcom/tinder/places/recs/view/PlacesRecsView$PlacesCardViewHolderFactory;", "placesRecsTutorialRunner", "Lcom/tinder/recsgrid/GridCollectionTutorialRunner;", "getPlacesRecsTutorialRunner", "()Lcom/tinder/recsgrid/GridCollectionTutorialRunner;", "placesRecsTutorialRunner$delegate", "Lkotlin/Lazy;", "placesScrollListener", "Lcom/tinder/places/recs/view/PlaceRecsScrollListener;", "presenter", "Lcom/tinder/places/recs/presenter/PlacesRecsGridPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/recs/presenter/PlacesRecsGridPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/recs/presenter/PlacesRecsGridPresenter;)V", "animateLike", "", "bindAnalyticsSource", "profileView", "Lcom/tinder/profile/view/UserRecProfileView;", "createPlaceholderPhotoConfig", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "userRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "findComponentProvider", "Lcom/tinder/places/injection/PlacesRecsComponentProvider;", "view", "Landroid/view/View;", "findGridSpacingItemDecorationIndex", "grid", "Lcom/tinder/cardstack/view/CardGridLayout;", "getCurrentRecsTeaserImages", "", "", "getRecAt", "Lcom/tinder/domain/recs/model/UserRec;", "position", "getRecProfileEntranceAnimationDecorator", "Lcom/tinder/recs/animation/DefaultRecProfileEntranceAnimationDecorator;", "placeholderPhotoConfig", "getRecProfileExitAnimationDecorator", "Lcom/tinder/recs/animation/DefaultRecProfileExitAnimationDecorator;", "getSpanCount", "getSpanCount$Tinder_release", "inject", "onAttachedToWindow", "onDetachedFromWindow", "onExpansionEnd", "onFinishInflate", "removeRec", "removeAnimation", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "rootView", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "setColor", "setToolbarCollapser", "toolbarCollapser", "Lkotlin/Function2;", "", "Lcom/tinder/places/card/view/ToolbarCollapser;", "setupProfileViewListener", "showNotification", "viewModel", "Lcom/tinder/views/grid/viewmodel/GridNotificationViewModel;", "showSuperLikePaywall", "rec", "Lcom/tinder/domain/recs/model/Rec;", "showTinderGoldPaywall", "showTinderPlusPaywall", "showTutorial", "OffsetItemDecoration", "PlacesCardViewHolderFactory", "PlacesLoadingStatusViewHolderFactory", "TranslationCallbackCardViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesRecsView extends RefreshableGridRecsView implements Container, PlacesRecsGridTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f43358a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesRecsView.class), "placesRecsTutorialRunner", "getPlacesRecsTutorialRunner()Lcom/tinder/recsgrid/GridCollectionTutorialRunner;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C12433a f43359b;
    /* renamed from: c */
    private final C12439c f43360c = new C12439c(this);
    /* renamed from: g */
    private final C12438b f43361g = new C12438b(this);
    /* renamed from: h */
    private PlaceColor f43362h;
    /* renamed from: i */
    private final int f43363i = ((int) au.a(this, R.dimen.places_recs_grid_side_offset));
    /* renamed from: j */
    private final int f43364j = ((int) au.a(this, R.dimen.places_recs_grid_top_offset));
    /* renamed from: k */
    private C12444a f43365k;
    /* renamed from: l */
    private final int f43366l;
    /* renamed from: m */
    private final Lazy f43367m;
    /* renamed from: n */
    private boolean f43368n;
    /* renamed from: o */
    private HashMap f43369o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/recs/view/PlacesRecsView$OffsetItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "(Lcom/tinder/places/recs/view/PlacesRecsView;)V", "initialSecondCardScale", "", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$a */
    public final class C12437a extends ItemDecoration {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsView f40115a;
        /* renamed from: b */
        private final float f40116b = 0.77f;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010¸\u0006\u0011"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "(Lkotlin/jvm/functions/Function1;)V", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.recs.view.PlacesRecsView$a$a */
        public static final class C10282a implements OnLayoutChangeListener {
            /* renamed from: a */
            final /* synthetic */ C12437a f33419a;

            public C10282a(C12437a c12437a) {
                this.f33419a = c12437a;
            }

            public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                PlacesRecsView.m53072b(this.f33419a.f40115a).m48929b(view);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.recs.view.PlacesRecsView$a$b */
        static final class C10283b implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C12437a f33420a;
            /* renamed from: b */
            final /* synthetic */ View f33421b;
            /* renamed from: c */
            final /* synthetic */ int f33422c;

            C10283b(C12437a c12437a, View view, int i) {
                this.f33420a = c12437a;
                this.f33421b = view;
                this.f33422c = i;
            }

            public final void run() {
                this.f33421b.setPivotX(C10287c.m41678a(this.f33422c) ? 0.0f : (float) this.f33421b.getWidth());
                this.f33421b.setPivotY(0.0f);
                this.f33421b.setScaleX(this.f33420a.f40116b);
                this.f33421b.setScaleY(this.f33420a.f40116b);
            }
        }

        public C12437a(PlacesRecsView placesRecsView) {
            this.f40115a = placesRecsView;
        }

        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull State state) {
            C2668g.b(rect, "outRect");
            C2668g.b(view, "view");
            C2668g.b(recyclerView, "parent");
            C2668g.b(state, "state");
            state = recyclerView.getChildAdapterPosition(view);
            if (state != -1) {
                if (recyclerView.getAdapter().getItemViewType(state) == 1001) {
                    rect.set(0, 0, 0, 0);
                    return;
                }
                if (C10287c.m41678a(state) != null) {
                    rect.right = this.f40115a.f43363i;
                } else {
                    rect.left = this.f40115a.f43363i;
                }
                if (state == null) {
                    rect.top = 0;
                    if (ViewCompat.z(view) == null || view.isLayoutRequested() != null) {
                        view.addOnLayoutChangeListener((OnLayoutChangeListener) new C10282a(this));
                    } else {
                        PlacesRecsView.m53072b(this.f40115a).m48929b(view);
                    }
                } else {
                    rect.top = this.f40115a.f43364j;
                    view.post((Runnable) new C10283b(this, view, state));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0004\u0018\u00002\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/tinder/places/recs/view/PlacesRecsView$PlacesCardViewHolderFactory;", "Lcom/tinder/cardstack/view/CardViewHolder$Factory;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "(Lcom/tinder/places/recs/view/PlacesRecsView;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getViewType", "card", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$b */
    private final class C12438b implements Factory<CardViewHolder<C8395a<?>>, C8395a<?>> {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsView f40117a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.recs.view.PlacesRecsView$b$a */
        static final class C10284a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C12438b f33423a;
            /* renamed from: b */
            final /* synthetic */ PlacesUserRecCardView f33424b;

            C10284a(C12438b c12438b, PlacesUserRecCardView placesUserRecCardView) {
                this.f33423a = c12438b;
                this.f33424b = placesUserRecCardView;
            }

            public final void onClick(View view) {
                this.f33423a.f40117a.b(this.f33424b);
            }
        }

        public int getViewType(@Nullable C8395a<?> c8395a) {
            return 0;
        }

        public C12438b(PlacesRecsView placesRecsView) {
            this.f40117a = placesRecsView;
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
            i = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recs_card_places, viewGroup, false);
            if (i == 0) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.recs.view.PlacesUserRecCardView");
            }
            PlacesUserRecCardView placesUserRecCardView = (PlacesUserRecCardView) i;
            placesUserRecCardView.m53998a(viewGroup);
            viewGroup = this.f40117a.f43362h;
            if (viewGroup != null) {
                placesUserRecCardView.setColor(viewGroup);
            }
            placesUserRecCardView.setOnClickListener((OnClickListener) new C10284a(this, placesUserRecCardView));
            placesUserRecCardView.getParallaxFrameLayout().setParallaxManager(new RefreshableGridRecsView$d(this.f40117a));
            return (CardViewHolder) new C13605d(this.f40117a, placesUserRecCardView);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/places/recs/view/PlacesRecsView$PlacesLoadingStatusViewHolderFactory;", "Lcom/tinder/cardstack/cardgrid/view/LoadingStatusViewHolderFactory;", "(Lcom/tinder/places/recs/view/PlacesRecsView;)V", "createViewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getViewType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$c */
    public final class C12439c implements LoadingStatusViewHolderFactory {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsView f40118a;

        public int getViewType() {
            return AdError.NO_FILL_ERROR_CODE;
        }

        public C12439c(PlacesRecsView placesRecsView) {
            this.f40118a = placesRecsView;
        }

        @NotNull
        public ViewHolder createViewHolder(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            if (i != AdError.NO_FILL_ERROR_CODE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported view type: ");
                stringBuilder.append(i);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
            viewGroup = LayoutInflater.from(this.f40118a.getContext()).inflate(R.layout.view_places_grid_load_more_recs, viewGroup, false);
            i = viewGroup.findViewById(R.id.recs_loading_progressbar);
            C2668g.a(i, "view.findViewById<Progre…recs_loading_progressbar)");
            ((ProgressBar) i).getIndeterminateDrawable().setColorFilter(-1, Mode.MULTIPLY);
            return (ViewHolder) new ao(viewGroup);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationStart"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$e */
    static final class C12440e implements StartListener {
        /* renamed from: a */
        final /* synthetic */ GridUserRecCardView f40119a;

        C12440e(GridUserRecCardView gridUserRecCardView) {
            this.f40119a = gridUserRecCardView;
        }

        public final void onAnimationStart() {
            this.f40119a.setVisibility(4);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationStart"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$f */
    static final class C12441f implements StartListener {
        /* renamed from: a */
        final /* synthetic */ UserRecProfileView f40120a;

        C12441f(UserRecProfileView userRecProfileView) {
            this.f40120a = userRecProfileView;
        }

        public final void onAnimationStart() {
            View gamepadView = this.f40120a.getGamepadView();
            if (gamepadView != null) {
                gamepadView.setVisibility(8);
            }
            this.f40120a.getEntranceBackground().setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/places/recs/view/PlacesRecsView$onFinishInflate$1", "Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;", "(Lcom/tinder/places/recs/view/PlacesRecsView;)V", "onScrolled", "", "progress", "", "velocity", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$g */
    public static final class C12442g implements OnScrollProgressListener {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsView f40121a;

        C12442g(PlacesRecsView placesRecsView) {
            this.f40121a = placesRecsView;
        }

        public void onScrolled(float f, float f2) {
            this.f40121a.getPresenter$Tinder_release().m48909a(f, f2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "card", "Lcom/tinder/cardstack/model/Card;", "", "kotlin.jvm.PlatformType", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "onPreSwipe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$h */
    static final class C12443h implements OnPreSwipeListener {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsView f40122a;

        C12443h(PlacesRecsView placesRecsView) {
            this.f40122a = placesRecsView;
        }

        public final boolean onPreSwipe(@NotNull C8395a<Object> c8395a, @NotNull SwipeDirection swipeDirection) {
            C2668g.b(c8395a, "card");
            C2668g.b(swipeDirection, "swipeDirection");
            c8395a = this.f40122a.b(c8395a);
            switch (C10286b.f33426a[swipeDirection.ordinal()]) {
                case 1:
                    this.f40122a.getPresenter$Tinder_release().passOnRec(c8395a, SwipeOrigin.GRID);
                    return true;
                case 2:
                    this.f40122a.getPresenter$Tinder_release().likeOnRec(c8395a, SwipeOrigin.GRID);
                    return true;
                default:
                    return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/recs/view/PlacesRecsView$TranslationCallbackCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Lcom/tinder/views/grid/GridUserRecCardView;", "(Lcom/tinder/places/recs/view/PlacesRecsView;Lcom/tinder/views/grid/GridUserRecCardView;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.PlacesRecsView$d */
    public final class C13605d extends CardViewHolder<C8395a<?>> {
        /* renamed from: a */
        final /* synthetic */ PlacesRecsView f43357a;

        public C13605d(PlacesRecsView placesRecsView, @NotNull GridUserRecCardView gridUserRecCardView) {
            C2668g.b(gridUserRecCardView, "itemView");
            this.f43357a = placesRecsView;
            super(gridUserRecCardView);
            gridUserRecCardView.setVerticalTranslationListener((Function0) new PlacesRecsView$TranslationCallbackCardViewHolder$1(this, gridUserRecCardView));
        }
    }

    private final C14780a getPlacesRecsTutorialRunner() {
        Lazy lazy = this.f43367m;
        KProperty kProperty = f43358a[0];
        return (C14780a) lazy.getValue();
    }

    /* renamed from: a */
    public View m53075a(int i) {
        if (this.f43369o == null) {
            this.f43369o = new HashMap();
        }
        View view = (View) this.f43369o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f43369o.put(Integer.valueOf(i), view);
        return view;
    }

    public void animateLike() {
    }

    public int getSpanCount$Tinder_release() {
        return 1;
    }

    public void showNotification(@NotNull C15455a c15455a) {
        C2668g.b(c15455a, "viewModel");
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ C12444a m53072b(PlacesRecsView placesRecsView) {
        placesRecsView = placesRecsView.f43365k;
        if (placesRecsView == null) {
            C2668g.b("placesScrollListener");
        }
        return placesRecsView;
    }

    /* renamed from: b */
    public /* synthetic */ ViewGroup m53081b() {
        return m53083c();
    }

    public PlacesRecsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f43366l = av.c() - av.b(context);
        this.f43367m = C18451c.a((Function0) PlacesRecsView$placesRecsTutorialRunner$2.f45087a);
    }

    @NotNull
    public final C12433a getPresenter$Tinder_release() {
        C12433a c12433a = this.f43359b;
        if (c12433a == null) {
            C2668g.b("presenter");
        }
        return c12433a;
    }

    public final void setPresenter$Tinder_release(@NotNull C12433a c12433a) {
        C2668g.b(c12433a, "<set-?>");
        this.f43359b = c12433a;
    }

    /* renamed from: a */
    public final void m53078a() {
        if (!this.f43368n) {
            m53071b((View) this).getPlacesRecsComponent().inject(this);
            this.f43368n = true;
        }
    }

    /* renamed from: b */
    private final PlacesRecsComponentProvider m53071b(View view) {
        PlacesRecsComponentProvider placesRecsComponentProvider = (PlacesRecsComponentProvider) (!(view instanceof PlacesRecsComponentProvider) ? null : view);
        if (placesRecsComponentProvider != null) {
            return placesRecsComponentProvider;
        }
        view = view.getParent();
        if (view != null) {
            return m53071b(view);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        getCardGridLayout$Tinder_release().setCardStackViewHolderFactory(this.f43361g);
        getCardGridLayout$Tinder_release().setLoadingStatusViewHolderFactory(this.f43360c);
        getCardGridLayout$Tinder_release().setOnScrollProgressListener(new C12442g(this));
        getCardGridLayout$Tinder_release().setOnPreSwipeListener(new C12443h(this));
        int a = m53067a(getCardGridLayout$Tinder_release());
        if (a != -1) {
            getCardGridLayout$Tinder_release().removeItemDecorationAt(a);
        }
        int i = this.f43364j;
        CardGridLayout cardGridLayout = (CardGridLayout) m53075a(C6248a.gridview);
        C2668g.a(cardGridLayout, "gridview");
        this.f43365k = new C12444a(i, 0.77f, cardGridLayout, this.f43366l, new PlacesRecsView$onFinishInflate$3(this));
        CardGridLayout cardGridLayout2 = (CardGridLayout) m53075a(C6248a.gridview);
        C12444a c12444a = this.f43365k;
        if (c12444a == null) {
            C2668g.b("placesScrollListener");
        }
        cardGridLayout2.addOnScrollListener(c12444a);
        getCardGridLayout$Tinder_release().addItemDecoration(new C12437a(this));
        getCardGridLayout$Tinder_release().setVerticalScrollBarEnabled(false);
        getCardGridLayout$Tinder_release().setOverScrollMode(2);
        getSwipeRefreshLayout$Tinder_release().setEnabled(false);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m53078a();
        C12433a c12433a = this.f43359b;
        if (c12433a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c12433a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public void m53080a(@NotNull UserRecProfileView userRecProfileView, @NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.b(userRecProfileView, "profileView");
        C2668g.b(gridUserRecCardView, "userRecCardView");
        C12433a c12433a = this.f43359b;
        if (c12433a == null) {
            C2668g.b("presenter");
        }
        userRecProfileView.setListener(new RefreshableGridRecsView$e(this, gridUserRecCardView, c12433a));
    }

    /* renamed from: a */
    public void m53079a(@NotNull UserRecProfileView userRecProfileView) {
        C2668g.b(userRecProfileView, "profileView");
        userRecProfileView.a(ProfileScreenSource.PLACES_RECS);
    }

    public void removeRec(int i, @Nullable C8361a c8361a) {
        String id;
        super.removeRec(i, c8361a);
        c8361a = this.f43359b;
        if (c8361a == null) {
            C2668g.b("presenter");
        }
        UserRec b = m53070b(i);
        if (b != null) {
            PerspectableUser user = b.getUser();
            if (user != null) {
                id = user.id();
                c8361a.m48910a(i, id);
            }
        }
        id = null;
        c8361a.m48910a(i, id);
    }

    @NotNull
    /* renamed from: a */
    public DefaultRecProfileEntranceAnimationDecorator m53077a(@NotNull GridUserRecCardView gridUserRecCardView, @NotNull UserRecProfileView userRecProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.b(gridUserRecCardView, "userRecCardView");
        C2668g.b(userRecProfileView, "profileView");
        C2668g.b(placeholderPhotoConfig, "placeholderPhotoConfig");
        PlaceRecProfileEntranceAnimationDecorator placeRecProfileEntranceAnimationDecorator = new PlaceRecProfileEntranceAnimationDecorator(userRecProfileView, placeholderPhotoConfig);
        placeRecProfileEntranceAnimationDecorator.addStartListener((StartListener) new C12440e(gridUserRecCardView));
        return placeRecProfileEntranceAnimationDecorator;
    }

    @NotNull
    /* renamed from: b */
    public DefaultRecProfileExitAnimationDecorator m53082b(@NotNull GridUserRecCardView gridUserRecCardView, @NotNull UserRecProfileView userRecProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.b(gridUserRecCardView, "userRecCardView");
        C2668g.b(userRecProfileView, "profileView");
        C2668g.b(placeholderPhotoConfig, "placeholderPhotoConfig");
        gridUserRecCardView = new DefaultRecProfileExitAnimationDecorator(userRecProfileView, placeholderPhotoConfig);
        gridUserRecCardView.addStartListener((StartListener) new C12441f(userRecProfileView));
        return gridUserRecCardView;
    }

    @NotNull
    /* renamed from: a */
    public PlaceholderPhotoConfig m53076a(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.b(gridUserRecCardView, "userRecCardView");
        float parallaxFactor = gridUserRecCardView.getParallaxFrameLayout().getParallaxFactor();
        Rect a = a(gridUserRecCardView);
        gridUserRecCardView = PlaceholderPhotoConfig.builder().displayedPhotoIndex(gridUserRecCardView.getDisplayedPhotoIndex()).displayedPhotoUrl(gridUserRecCardView.getDisplayedPhotoUrl()).photoCount(gridUserRecCardView.getPhotoCount()).showPageIndicator(false).placeholderX(a.left).placeholderY(a.top - av.b(getContext())).placeholderWidth((int) (((float) a.width()) * gridUserRecCardView.getScaleX())).placeholderHeight((int) (((float) a.height()) * gridUserRecCardView.getScaleY())).placeholderParallaxFactor(parallaxFactor).build();
        C2668g.a(gridUserRecCardView, "DefaultRecProfileAnimati…\n                .build()");
        return gridUserRecCardView;
    }

    @NotNull
    /* renamed from: c */
    public TouchBlockingFrameLayout m53083c() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Window window = ((Activity) context).getWindow();
        C2668g.a(window, "(context as Activity)\n            .window");
        View decorView = window.getDecorView();
        C2668g.a(decorView, "(context as Activity)\n  …ow\n            .decorView");
        decorView = decorView.getRootView().findViewById(R.id.main_activity_container);
        C2668g.a(decorView, "(context as Activity)\n  ….main_activity_container)");
        return (TouchBlockingFrameLayout) decorView;
    }

    public void setColor(@Nullable PlaceColor placeColor) {
        this.f43362h = placeColor;
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

    public void showTinderPlusPaywall() {
        C10076o.m41167a((PaywallTypeSource) PlusPaywallSource.GAMEPAD_LIKE).m41175a(getContext());
    }

    public void showTinderGoldPaywall() {
        C10076o.m41167a((PaywallTypeSource) GoldPaywallSource.PLACES_SWIPE).m41175a(getContext());
    }

    public void showTutorial() {
        C14780a.a(getPlacesRecsTutorialRunner(), getCardGridLayout$Tinder_release(), m53083c(), 0, 4, null);
    }

    @NotNull
    public final List<String> getCurrentRecsTeaserImages() {
        C12433a c12433a = this.f43359b;
        if (c12433a == null) {
            C2668g.b("presenter");
        }
        return c12433a.m48917h();
    }

    public final void setToolbarCollapser(@Nullable Function2<? super Float, ? super Integer, C15813i> function2) {
        C12444a c12444a = this.f43365k;
        if (c12444a == null) {
            C2668g.b("placesScrollListener");
        }
        c12444a.m48928a((Function2) function2);
    }

    /* renamed from: d */
    public final void m53084d() {
        C12444a c12444a = this.f43365k;
        if (c12444a == null) {
            C2668g.b("placesScrollListener");
        }
        c12444a.m48925a();
    }

    /* renamed from: b */
    private final UserRec m53070b(int i) {
        i = getCardGridLayout$Tinder_release().getAdapter().m42467a(i);
        if (!(i instanceof UserRecCard)) {
            i = 0;
        }
        UserRecCard userRecCard = (UserRecCard) i;
        return userRecCard != null ? userRecCard.userRec() : null;
    }

    /* renamed from: a */
    private final int m53067a(CardGridLayout cardGridLayout) {
        for (Object next : C19068g.b(0, cardGridLayout.getItemDecorationCount())) {
            if (cardGridLayout.getItemDecorationAt(((Number) next).intValue()) instanceof C10483c) {
                break;
            }
        }
        Object next2 = null;
        Integer num = (Integer) next2;
        return num != null ? num.intValue() : -1;
    }
}
