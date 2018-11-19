package com.tinder.views.grid;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.CallSuper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView.RecyclerListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.cardstack.view.CardGridLayout;
import com.tinder.chat.activity.C8406b;
import com.tinder.common.view.Container;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.DefaultRecProfileEntranceAnimationDecorator;
import com.tinder.recs.animation.DefaultRecProfileExitAnimationDecorator;
import com.tinder.recs.animation.TappyDefaultRecProfileEntranceAnimationDecorator;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecProfileView;
import com.tinder.recs.view.RecProfileView.GamepadButtonStates;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.view.grid.ParallaxFrameLayout.C15421a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ab;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 |2\u00020\u00012\u00020\u0002:\u0006|}~\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H&J\u0006\u0010A\u001a\u00020>J\u001e\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020GJ\u001e\u0010H\u001a\u00020I2\u0006\u0010D\u001a\u00020E2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020GJ\u0010\u0010J\u001a\u00020G2\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010K\u001a\u00020>H\u0002J\b\u0010L\u001a\u00020>H\u0002J\b\u0010M\u001a\u00020>H\u0002J\r\u0010N\u001a\u00020'H\u0010¢\u0006\u0002\bOJ\r\u0010P\u001a\u00020'H\u0010¢\u0006\u0002\bQJ\u0019\u0010R\u001a\u00020S2\n\u0010T\u001a\u0006\u0012\u0002\b\u00030UH\u0000¢\u0006\u0002\bVJ \u0010W\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020GH\u0016J \u0010X\u001a\u00020I2\u0006\u0010D\u001a\u00020E2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020GH\u0016J\r\u0010Y\u001a\u00020'H\u0010¢\u0006\u0002\bZJ\u0015\u0010[\u001a\u00020>2\u0006\u0010\\\u001a\u00020]H\u0000¢\u0006\u0002\b^J\b\u0010_\u001a\u00020>H\u0017J\u0012\u0010`\u001a\u00020>2\n\u0010T\u001a\u0006\u0012\u0002\b\u00030UJ \u0010a\u001a\u00020>2\u0006\u0010b\u001a\u00020'2\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030U0dJ\b\u0010e\u001a\u00020/H\u0016J\b\u0010f\u001a\u00020>H\u0017J\u001a\u0010g\u001a\u00020>2\u0006\u0010b\u001a\u00020'2\n\u0010T\u001a\u0006\u0012\u0002\b\u00030UJ\u001a\u0010h\u001a\u00020>2\u0006\u0010b\u001a\u00020'2\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\u0012\u0010k\u001a\u00020>2\n\u0010T\u001a\u0006\u0012\u0002\b\u00030UJ\b\u0010l\u001a\u00020mH&J\u0018\u0010n\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010D\u001a\u00020EH&J\u0006\u0010o\u001a\u00020>J\b\u0010p\u001a\u00020>H\u0016J\u0006\u0010q\u001a\u00020>J\u0006\u0010r\u001a\u00020>J\u0006\u0010s\u001a\u00020>J\u000e\u0010t\u001a\u00020>2\u0006\u0010D\u001a\u00020EJ\u0014\u0010u\u001a\u00020>2\n\u00103\u001a\u0006\u0012\u0002\b\u000304H\u0002J\u0006\u0010v\u001a\u00020>J\u0006\u0010w\u001a\u00020>J\u0011\u0010x\u001a\u00020y*\u00020zH\u0000¢\u0006\u0002\b{R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8BX\u0004¢\u0006\u0006\u001a\u0004\b.\u00100R\u0012\u00101\u001a\u000602R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010<\u001a\u00020'8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/tinder/views/grid/RefreshableGridRecsView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/common/view/Container;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activePhotoIndexProvider", "Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "getActivePhotoIndexProvider$Tinder_release", "()Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "setActivePhotoIndexProvider$Tinder_release", "(Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;)V", "cardGridLayout", "Lcom/tinder/cardstack/view/CardGridLayout;", "getCardGridLayout$Tinder_release", "()Lcom/tinder/cardstack/view/CardGridLayout;", "setCardGridLayout$Tinder_release", "(Lcom/tinder/cardstack/view/CardGridLayout;)V", "cardGridLayoutBlockingContainter", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "getCardGridLayoutBlockingContainter$Tinder_release", "()Lcom/tinder/base/view/TouchBlockingFrameLayout;", "setCardGridLayoutBlockingContainter$Tinder_release", "(Lcom/tinder/base/view/TouchBlockingFrameLayout;)V", "chatIntentFactory", "Lcom/tinder/chat/activity/ChatIntentFactory;", "getChatIntentFactory$Tinder_release", "()Lcom/tinder/chat/activity/ChatIntentFactory;", "setChatIntentFactory$Tinder_release", "(Lcom/tinder/chat/activity/ChatIntentFactory;)V", "emptyGridView", "Lcom/tinder/views/grid/GridEmptyView;", "getEmptyGridView$Tinder_release", "()Lcom/tinder/views/grid/GridEmptyView;", "setEmptyGridView$Tinder_release", "(Lcom/tinder/views/grid/GridEmptyView;)V", "greenBackgroundColor", "", "gridViewContainer", "Lcom/tinder/base/view/IdViewAnimator;", "getGridViewContainer$Tinder_release", "()Lcom/tinder/base/view/IdViewAnimator;", "setGridViewContainer$Tinder_release", "(Lcom/tinder/base/view/IdViewAnimator;)V", "isProfileViewAnimating", "", "()Z", "placeholderParallaxManager", "Lcom/tinder/views/grid/RefreshableGridRecsView$ParallaxFrameLayoutManager;", "recProfileView", "Lcom/tinder/recs/view/RecProfileView;", "stampIsAnimating", "swipeRefreshLayout", "Landroid/support/v4/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout$Tinder_release", "()Landroid/support/v4/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout$Tinder_release", "(Landroid/support/v4/widget/SwipeRefreshLayout;)V", "whiteBackgroundColor", "bindAnalyticsSource", "", "profileView", "Lcom/tinder/profile/view/UserRecProfileView;", "clearRecs", "createEntranceAnimationDecorator", "Lcom/tinder/recs/animation/DefaultRecProfileEntranceAnimationDecorator;", "userRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "placeholderPhotoConfig", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "createExitAnimationDecorator", "Lcom/tinder/recs/animation/DefaultRecProfileExitAnimationDecorator;", "createPlaceholderPhotoConfig", "disableScrolling", "dispatchParallaxChange", "enableScrolling", "getHeaderOffset", "getHeaderOffset$Tinder_release", "getHeaderPosition", "getHeaderPosition$Tinder_release", "getRec", "Lcom/tinder/domain/recs/model/Rec;", "card", "Lcom/tinder/cardstack/model/Card;", "getRec$Tinder_release", "getRecProfileEntranceAnimationDecorator", "getRecProfileExitAnimationDecorator", "getSpanCount", "getSpanCount$Tinder_release", "goToChat", "matchId", "", "goToChat$Tinder_release", "hideLoadingMoreAndStopRefreshing", "insertHeader", "insertRecs", "position", "cards", "", "onBackPressed", "onProfileViewDetached", "postInsertRec", "removeRec", "removeAnimation", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "resetCardAnimation", "rootView", "Landroid/view/ViewGroup;", "setupProfileViewListener", "showCardGrid", "showEmptyList", "showGenericError", "showLoadingMore", "showNoNetworkConnectionError", "showProfileForRecCard", "showRecProfileView", "showRefreshing", "smoothScrollToTop", "getGlobalBoundRect", "Landroid/graphics/Rect;", "Landroid/view/View;", "getGlobalBoundRect$Tinder_release", "Companion", "GridLoadingStatusViewHolderFactory", "OnPreDrawListener", "ParallaxFrameLayoutManager", "UserRecProfileViewListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class RefreshableGridRecsView extends FrameLayout implements Container {
    /* renamed from: f */
    public static final RefreshableGridRecsView$a f12557f = new RefreshableGridRecsView$a(null);
    /* renamed from: a */
    private final RefreshableGridRecsView$d f12558a = new RefreshableGridRecsView$d(this);
    /* renamed from: b */
    private RecProfileView<?> f12559b;
    /* renamed from: c */
    private boolean f12560c;
    @NotNull
    @BindView(2131362651)
    public CardGridLayout cardGridLayout;
    @NotNull
    @BindView(2131362653)
    public TouchBlockingFrameLayout cardGridLayoutBlockingContainter;
    @Inject
    @NotNull
    /* renamed from: d */
    public UserRecActivePhotoIndexProvider f12561d;
    @Inject
    @NotNull
    /* renamed from: e */
    public C8406b f12562e;
    @NotNull
    @BindView(2131362402)
    public GridEmptyView emptyGridView;
    /* renamed from: g */
    private HashMap f12563g;
    @BindColor(2131099918)
    @JvmField
    public int greenBackgroundColor;
    @NotNull
    @BindView(2131362652)
    public IdViewAnimator gridViewContainer;
    @NotNull
    @BindView(2131363732)
    public SwipeRefreshLayout swipeRefreshLayout;
    @BindColor(2131100300)
    @JvmField
    public int whiteBackgroundColor;

    /* renamed from: a */
    public View mo3598a(int i) {
        if (this.f12563g == null) {
            this.f12563g = new HashMap();
        }
        View view = (View) this.f12563g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f12563g.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: a */
    public abstract void mo3601a(@NotNull UserRecProfileView userRecProfileView);

    /* renamed from: a */
    public abstract void mo3602a(@NotNull UserRecProfileView userRecProfileView, @NotNull GridUserRecCardView gridUserRecCardView);

    @NotNull
    /* renamed from: b */
    public abstract ViewGroup mo3604b();

    public int getHeaderOffset$Tinder_release() {
        return 0;
    }

    public int getHeaderPosition$Tinder_release() {
        return 0;
    }

    public RefreshableGridRecsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.view_grid_recs, this);
        ButterKnife.m2675a((View) this);
        context = this.cardGridLayout;
        if (context == null) {
            C2668g.m10310b("cardGridLayout");
        }
        context.b(getSpanCount$Tinder_release(), getHeaderOffset$Tinder_release());
        context = this.cardGridLayout;
        if (context == null) {
            C2668g.m10310b("cardGridLayout");
        }
        context.setHasFixedSize(true);
        context = this.cardGridLayout;
        if (context == null) {
            C2668g.m10310b("cardGridLayout");
        }
        context.setRecyclerListener((RecyclerListener) RefreshableGridRecsView$1.f52914a);
        getViewTreeObserver().addOnPreDrawListener((OnPreDrawListener) new RefreshableGridRecsView$c(this));
    }

    @NotNull
    public final SwipeRefreshLayout getSwipeRefreshLayout$Tinder_release() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            C2668g.m10310b("swipeRefreshLayout");
        }
        return swipeRefreshLayout;
    }

    public final void setSwipeRefreshLayout$Tinder_release(@NotNull SwipeRefreshLayout swipeRefreshLayout) {
        C2668g.m10309b(swipeRefreshLayout, "<set-?>");
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @NotNull
    public final CardGridLayout getCardGridLayout$Tinder_release() {
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        return cardGridLayout;
    }

    public final void setCardGridLayout$Tinder_release(@NotNull CardGridLayout cardGridLayout) {
        C2668g.m10309b(cardGridLayout, "<set-?>");
        this.cardGridLayout = cardGridLayout;
    }

    @NotNull
    public final GridEmptyView getEmptyGridView$Tinder_release() {
        GridEmptyView gridEmptyView = this.emptyGridView;
        if (gridEmptyView == null) {
            C2668g.m10310b("emptyGridView");
        }
        return gridEmptyView;
    }

    public final void setEmptyGridView$Tinder_release(@NotNull GridEmptyView gridEmptyView) {
        C2668g.m10309b(gridEmptyView, "<set-?>");
        this.emptyGridView = gridEmptyView;
    }

    @NotNull
    public final IdViewAnimator getGridViewContainer$Tinder_release() {
        IdViewAnimator idViewAnimator = this.gridViewContainer;
        if (idViewAnimator == null) {
            C2668g.m10310b("gridViewContainer");
        }
        return idViewAnimator;
    }

    public final void setGridViewContainer$Tinder_release(@NotNull IdViewAnimator idViewAnimator) {
        C2668g.m10309b(idViewAnimator, "<set-?>");
        this.gridViewContainer = idViewAnimator;
    }

    @NotNull
    public final TouchBlockingFrameLayout getCardGridLayoutBlockingContainter$Tinder_release() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardGridLayoutBlockingContainter;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardGridLayoutBlockingContainter");
        }
        return touchBlockingFrameLayout;
    }

    public final void setCardGridLayoutBlockingContainter$Tinder_release(@NotNull TouchBlockingFrameLayout touchBlockingFrameLayout) {
        C2668g.m10309b(touchBlockingFrameLayout, "<set-?>");
        this.cardGridLayoutBlockingContainter = touchBlockingFrameLayout;
    }

    @NotNull
    public final UserRecActivePhotoIndexProvider getActivePhotoIndexProvider$Tinder_release() {
        UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider = this.f12561d;
        if (userRecActivePhotoIndexProvider == null) {
            C2668g.m10310b("activePhotoIndexProvider");
        }
        return userRecActivePhotoIndexProvider;
    }

    public final void setActivePhotoIndexProvider$Tinder_release(@NotNull UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        C2668g.m10309b(userRecActivePhotoIndexProvider, "<set-?>");
        this.f12561d = userRecActivePhotoIndexProvider;
    }

    @NotNull
    public final C8406b getChatIntentFactory$Tinder_release() {
        C8406b c8406b = this.f12562e;
        if (c8406b == null) {
            C2668g.m10310b("chatIntentFactory");
        }
        return c8406b;
    }

    public final void setChatIntentFactory$Tinder_release(@NotNull C8406b c8406b) {
        C2668g.m10309b(c8406b, "<set-?>");
        this.f12562e = c8406b;
    }

    public int getSpanCount$Tinder_release() {
        Object context = getContext();
        C2668g.m10305a(context, "context");
        return context.getResources().getInteger(R.integer.grid_recs_span_count);
    }

    public boolean onBackPressed() {
        RecProfileView recProfileView = this.f12559b;
        if (recProfileView == null || recProfileView.getParent() == null) {
            return false;
        }
        if (!mo3606d()) {
            recProfileView.exitWithGamepadExitAnimationDisabled(false);
        }
        return true;
    }

    public final void smoothScrollToTop() {
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.smoothScrollToPosition(0);
    }

    public final void insertRecs(int i, @NotNull List<? extends C8395a<?>> list) {
        C2668g.m10309b(list, "cards");
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.a(i + getHeaderOffset$Tinder_release(), list);
    }

    public void removeRec(int i, @Nullable C8361a c8361a) {
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.a(i + getHeaderOffset$Tinder_release(), c8361a);
    }

    public final void clearRecs() {
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.e();
    }

    public final void postInsertRec(int i, @NotNull C8395a<?> c8395a) {
        C2668g.m10309b(c8395a, "card");
        post(new RefreshableGridRecsView$h(this, i, c8395a));
    }

    public final void resetCardAnimation(@NotNull C8395a<?> c8395a) {
        C2668g.m10309b(c8395a, "card");
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.a(c8395a);
    }

    /* renamed from: a */
    public final void m15163a(@NotNull C8395a<?> c8395a) {
        C2668g.m10309b(c8395a, "card");
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.a(getHeaderPosition$Tinder_release(), c8395a);
    }

    public final void showLoadingMore() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            C2668g.m10310b("swipeRefreshLayout");
        }
        swipeRefreshLayout.setRefreshing(false);
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.g();
    }

    public final void showRefreshing() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            C2668g.m10310b("swipeRefreshLayout");
        }
        swipeRefreshLayout.setRefreshing(true);
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.h();
    }

    @CallSuper
    public void hideLoadingMoreAndStopRefreshing() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            C2668g.m10310b("swipeRefreshLayout");
        }
        swipeRefreshLayout.setRefreshing(false);
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        cardGridLayout.h();
    }

    public void showEmptyList() {
        mo3605c();
        IdViewAnimator idViewAnimator = this.gridViewContainer;
        if (idViewAnimator == null) {
            C2668g.m10310b("gridViewContainer");
        }
        idViewAnimator.setDisplayedChildId(R.id.empty_gridview);
    }

    public final void showCardGrid() {
        mo3599a();
        IdViewAnimator idViewAnimator = this.gridViewContainer;
        if (idViewAnimator == null) {
            C2668g.m10310b("gridViewContainer");
        }
        idViewAnimator.setDisplayedChildId(R.id.gridview);
    }

    /* renamed from: a */
    private final void mo3599a() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardGridLayoutBlockingContainter;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardGridLayoutBlockingContainter");
        }
        touchBlockingFrameLayout.stopBlocking();
    }

    /* renamed from: c */
    private final void mo3605c() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.cardGridLayoutBlockingContainter;
        if (touchBlockingFrameLayout == null) {
            C2668g.m10310b("cardGridLayoutBlockingContainter");
        }
        touchBlockingFrameLayout.startBlocking();
    }

    public final void showNoNetworkConnectionError() {
        at.f47621a.a(mo3604b(), R.string.recs_status_no_connection);
    }

    public final void showGenericError() {
        at.f47621a.a(mo3604b(), R.string.oops);
    }

    /* renamed from: b */
    public final void m15169b(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        if (this.f12559b == null) {
            gridUserRecCardView.setEnabled(false);
            mo3605c();
            PlaceholderPhotoConfig a = mo3600a(gridUserRecCardView);
            Object userRec = gridUserRecCardView.getUserRecCard().userRec();
            C2668g.m10305a(userRec, "rec");
            UserRecProfileView userRecProfileView = new UserRecProfileView(getContext(), userRec, a.displayedPhotoIndex(), new GamepadButtonStates(true, RecFieldDecorationExtensionsKt.isSuperLikeable((Rec) userRec), true, false, 8, null));
            RecProfileView recProfileView = userRecProfileView;
            this.f12559b = recProfileView;
            mo3602a(userRecProfileView, gridUserRecCardView);
            mo3601a(userRecProfileView);
            userRecProfileView.getProfileView().m15111a(false);
            userRecProfileView.setEnterAnimationDecorator(m15170c(gridUserRecCardView, userRecProfileView, a));
            userRecProfileView.setExitAnimationDecorator(m15171d(gridUserRecCardView, userRecProfileView, a));
            m15152a(recProfileView);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private final boolean mo3606d() {
        /*
        r5 = this;
        r0 = r5.f12559b;
        r1 = 0;
        if (r0 == 0) goto L_0x0026;
    L_0x0005:
        r2 = r0.getEnterAnimationDecorator();
        r0 = r0.getExitAnimationDecorator();
        r3 = 0;
        if (r2 == 0) goto L_0x0015;
    L_0x0010:
        r2 = r2.getState();
        goto L_0x0016;
    L_0x0015:
        r2 = r3;
    L_0x0016:
        r4 = com.tinder.recs.animation.RecProfileAnimationDecorator.State.RUNNING;
        if (r2 == r4) goto L_0x0024;
    L_0x001a:
        if (r0 == 0) goto L_0x0020;
    L_0x001c:
        r3 = r0.getState();
    L_0x0020:
        r0 = com.tinder.recs.animation.RecProfileAnimationDecorator.State.RUNNING;
        if (r3 != r0) goto L_0x0025;
    L_0x0024:
        r1 = 1;
    L_0x0025:
        return r1;
    L_0x0026:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.views.grid.RefreshableGridRecsView.d():boolean");
    }

    @NotNull
    /* renamed from: a */
    public PlaceholderPhotoConfig mo3600a(@NotNull GridUserRecCardView gridUserRecCardView) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        Rect a = m15159a((View) gridUserRecCardView.getParallaxFrameLayout());
        Object build = PlaceholderPhotoConfig.builder().displayedPhotoIndex(gridUserRecCardView.getDisplayedPhotoIndex()).displayedPhotoUrl(gridUserRecCardView.getDisplayedPhotoUrl()).photoCount(gridUserRecCardView.getPhotoCount()).showPageIndicator(false).placeholderX(a.left).placeholderY(a.top - av.m10220b(getContext())).placeholderWidth(a.width()).placeholderHeight(a.height()).placeholderParallaxFactor(1.16f).build();
        C2668g.m10305a(build, "PlaceholderPhotoConfig.b…\n                .build()");
        return build;
    }

    /* renamed from: a */
    private final void m15152a(RecProfileView<?> recProfileView) {
        recProfileView.enterWithGamepadEntranceAnimationDisabled(mo3604b(), false);
        this.f12559b = recProfileView;
    }

    @NotNull
    /* renamed from: b */
    public final Rec m15167b(@NotNull C8395a<?> c8395a) {
        C2668g.m10309b(c8395a, "card");
        c8395a = c8395a.getItem();
        if (!(c8395a instanceof Rec)) {
            c8395a = null;
        }
        Rec rec = (Rec) c8395a;
        if (rec != null) {
            return rec;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Card item is expected to implement ");
        stringBuilder.append(Rec.class.getSimpleName());
        throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
    }

    /* renamed from: f */
    private final void m15158f() {
        CardGridLayout cardGridLayout = this.cardGridLayout;
        if (cardGridLayout == null) {
            C2668g.m10310b("cardGridLayout");
        }
        Collection arrayList = new ArrayList();
        Iterator it = C19068g.b(0, cardGridLayout.getChildCount()).iterator();
        while (it.hasNext()) {
            int b = ((ab) it).b();
            CardGridLayout cardGridLayout2 = this.cardGridLayout;
            if (cardGridLayout2 == null) {
                C2668g.m10310b("cardGridLayout");
            }
            View childAt = cardGridLayout2.getChildAt(b);
            if (!(childAt instanceof GridUserRecCardView)) {
                childAt = null;
            }
            GridUserRecCardView gridUserRecCardView = (GridUserRecCardView) childAt;
            if (gridUserRecCardView != null) {
                arrayList.add(gridUserRecCardView);
            }
        }
        for (GridUserRecCardView parallaxFrameLayout : (List) arrayList) {
            parallaxFrameLayout.getParallaxFrameLayout().getParallaxManager().e();
        }
    }

    @NotNull
    /* renamed from: a */
    public DefaultRecProfileEntranceAnimationDecorator m15162a(@NotNull GridUserRecCardView gridUserRecCardView, @NotNull UserRecProfileView userRecProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        C2668g.m10309b(userRecProfileView, "profileView");
        C2668g.m10309b(placeholderPhotoConfig, "placeholderPhotoConfig");
        return (DefaultRecProfileEntranceAnimationDecorator) new TappyDefaultRecProfileEntranceAnimationDecorator(userRecProfileView, placeholderPhotoConfig);
    }

    @NotNull
    /* renamed from: b */
    public DefaultRecProfileExitAnimationDecorator m15168b(@NotNull GridUserRecCardView gridUserRecCardView, @NotNull UserRecProfileView userRecProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        C2668g.m10309b(userRecProfileView, "profileView");
        C2668g.m10309b(placeholderPhotoConfig, "placeholderPhotoConfig");
        return new DefaultRecProfileExitAnimationDecorator(userRecProfileView, placeholderPhotoConfig);
    }

    @NotNull
    /* renamed from: c */
    public final DefaultRecProfileEntranceAnimationDecorator m15170c(@NotNull GridUserRecCardView gridUserRecCardView, @NotNull UserRecProfileView userRecProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        C2668g.m10309b(userRecProfileView, "profileView");
        C2668g.m10309b(placeholderPhotoConfig, "placeholderPhotoConfig");
        placeholderPhotoConfig = m15162a(gridUserRecCardView, userRecProfileView, placeholderPhotoConfig);
        placeholderPhotoConfig.addEndListener(new RefreshableGridRecsView$f(this, userRecProfileView, gridUserRecCardView));
        userRecProfileView.getPlaceholderImageView().parallaxFramelayout().setParallaxManager((C15421a) this.f12558a);
        return placeholderPhotoConfig;
    }

    @NotNull
    /* renamed from: d */
    public final DefaultRecProfileExitAnimationDecorator m15171d(@NotNull GridUserRecCardView gridUserRecCardView, @NotNull UserRecProfileView userRecProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.m10309b(gridUserRecCardView, "userRecCardView");
        C2668g.m10309b(userRecProfileView, "profileView");
        C2668g.m10309b(placeholderPhotoConfig, "placeholderPhotoConfig");
        placeholderPhotoConfig = m15168b(gridUserRecCardView, userRecProfileView, placeholderPhotoConfig);
        placeholderPhotoConfig.addEndListener(new RefreshableGridRecsView$g(this, userRecProfileView, gridUserRecCardView));
        return placeholderPhotoConfig;
    }

    @CallSuper
    /* renamed from: e */
    public void m15172e() {
        mo3599a();
        this.f12559b = (RecProfileView) null;
    }

    @NotNull
    /* renamed from: a */
    public final Rect m15159a(@NotNull View view) {
        C2668g.m10309b(view, "$receiver");
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        rect.set(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return rect;
    }
}
