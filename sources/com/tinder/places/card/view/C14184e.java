package com.tinder.places.card.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.view.C0597f;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.cardstack.view.CardGridLayout;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.places.model.PlacesConfigExpansion;
import com.tinder.domain.places.model.PlacesConfigExpansion.Size;
import com.tinder.domain.recs.model.RecSource.Places;
import com.tinder.managers.ManagerApp;
import com.tinder.places.card.p308a.C10125a;
import com.tinder.places.card.presenter.C12306h;
import com.tinder.places.injection.PlacesRecsComponent;
import com.tinder.places.injection.PlacesRecsComponentProvider;
import com.tinder.places.main.view.BackButtonHandler;
import com.tinder.places.main.view.BackButtonRegistrar;
import com.tinder.places.recs.target.PlaceRecsContainerTarget;
import com.tinder.places.recs.view.PlacesRecsView;
import com.tinder.places.viewmodel.C14349b;
import com.tinder.places.viewmodel.PlaceColor.C14346b;
import com.tinder.utils.an;
import com.tinder.utils.au;
import com.tinder.viewmodel.C15425d;
import com.tinder.views.CustomTextView;
import com.tinder.views.RoundedFrameLayout;
import com.tinder.views.grid.GridEmptyView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004_`abB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020+H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020+H\u0016J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020+H\u0016J\u000e\u00106\u001a\u00020 2\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020+H\u0016J\b\u0010;\u001a\u00020 H\u0014J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020 H\u0014J0\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0014J\b\u0010E\u001a\u00020 H\u0002J\b\u0010F\u001a\u00020 H\u0016J\u0010\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020\rH\u0002J\u0010\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020+H\u0002J\u0018\u0010K\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010J\u001a\u00020+H\u0002J\u0010\u0010L\u001a\u00020 2\u0006\u00105\u001a\u00020+H\u0016J \u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020 2\u0006\u0010:\u001a\u00020+H\u0016J\u0010\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020\u001fH\u0016J\u0010\u0010U\u001a\u00020 2\u0006\u0010N\u001a\u00020\rH\u0016J\u0010\u0010V\u001a\u00020 2\u0006\u0010W\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u00020Z2\u0006\u00105\u001a\u00020+H\u0002J0\u0010[\u001a\u00020 2\u0006\u0010\\\u001a\u00020+2\u0006\u0010:\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00103\u001a\u00020+2\u0006\u0010]\u001a\u00020\u001fH\u0016J\b\u0010^\u001a\u00020 H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\u001ej\u0002`!X\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardExpanded;", "Lcom/tinder/views/RoundedFrameLayout;", "Lcom/tinder/places/injection/PlacesRecsComponentProvider;", "Lcom/tinder/places/main/view/BackButtonHandler;", "Lcom/tinder/places/recs/target/PlaceRecsContainerTarget;", "context", "Landroid/content/Context;", "viewModel", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "placeCard", "Lcom/tinder/places/card/view/PlaceCardView;", "(Landroid/content/Context;Lcom/tinder/places/viewmodel/PlaceCardViewModel;Lcom/tinder/places/card/view/PlaceCardView;)V", "cardSidePadding", "", "cardTopPadding", "placesRecsComponent", "Lcom/tinder/places/injection/PlacesRecsComponent;", "getPlacesRecsComponent", "()Lcom/tinder/places/injection/PlacesRecsComponent;", "setPlacesRecsComponent", "(Lcom/tinder/places/injection/PlacesRecsComponent;)V", "presenter", "Lcom/tinder/places/card/presenter/PlacesCardExpandedPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/card/presenter/PlacesCardExpandedPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/card/presenter/PlacesCardExpandedPresenter;)V", "runningAnimation", "Landroid/animation/Animator;", "toolbarCollapser", "Lkotlin/Function2;", "", "", "Lcom/tinder/places/card/view/ToolbarCollapser;", "animateDownToolbar", "bind", "item", "expand", "findBackButtonRegistrar", "Lcom/tinder/places/main/view/BackButtonRegistrar;", "view", "Landroid/view/View;", "getAdjustedCoords", "Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "origin", "getWindowSize", "hideCollapsedAndShowExpanded", "hideExpandedAndShowCollapsed", "measureCard", "cardSize", "measureIntro", "introSize", "measureTeaser", "teaserSize", "measureThenResize", "nonAdjusted", "Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "measureTitle", "titleSize", "onAttachedToWindow", "onBackPressed", "", "onDetachedFromWindow", "onLayout", "changed", "left", "top", "right", "bottom", "registerBackButtonHandler", "resizeRecsToWindow", "resizeToolbarBackground", "height", "resizeView", "size", "setMarginPosition", "setRecsPosition", "setTeaserVisitorCounts", "totalVisitors", "newVisitors", "background", "Lcom/tinder/places/viewmodel/PlaceColor$PlacesGradient;", "setTitlePosition", "setTitleTextFontSize", "fontSize", "setTotalVisitorsCount", "setupDagger", "placeId", "", "setupTeaserThumbnails", "Lcom/tinder/places/card/view/PlaceRecTeasersView;", "shrink", "initialSize", "titleFontSize", "unregisterBackButtonHandler", "DidExpandListener", "RecsGridAnimationListener", "TeaserBounceAnimation", "ToolbarSwipeDownListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.e */
public final class C14184e extends RoundedFrameLayout implements PlacesRecsComponentProvider, BackButtonHandler, PlaceRecsContainerTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C12306h f44966a;
    @NotNull
    /* renamed from: b */
    public PlacesRecsComponent f44967b;
    /* renamed from: c */
    private Animator f44968c;
    /* renamed from: d */
    private final int f44969d = ((int) au.a(this, R.dimen.place_card_inner_padding));
    /* renamed from: e */
    private final int f44970e = ((int) au.a(this, R.dimen.place_card_inner_side_padding));
    /* renamed from: f */
    private final Function2<Float, Integer, C15813i> f44971f;
    /* renamed from: g */
    private final PlaceCardView f44972g;
    /* renamed from: h */
    private HashMap f44973h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardExpanded$RecsGridAnimationListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "newSidePadding", "", "newTopPadding", "(Lcom/tinder/places/card/view/PlaceCardExpanded;II)V", "HALFWAY", "", "QUARTERWAY", "negRecOffset", "oldLeftPadding", "oldRightPadding", "oldTopPadding", "correctGridScroll", "", "onAnimationUpdate", "updatedAnimation", "Landroid/animation/ValueAnimator;", "setTranslation", "view", "Landroid/view/View;", "left", "top", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$b */
    public final class C10167b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33184a;
        /* renamed from: b */
        private final float f33185b = 1048576000;
        /* renamed from: c */
        private final float f33186c = 1056964608;
        /* renamed from: d */
        private final int f33187d;
        /* renamed from: e */
        private final int f33188e;
        /* renamed from: f */
        private final int f33189f;
        /* renamed from: g */
        private final int f33190g;
        /* renamed from: h */
        private final int f33191h;
        /* renamed from: i */
        private final int f33192i;

        public C10167b(C14184e c14184e, int i, int i2) {
            this.f33184a = c14184e;
            this.f33191h = i;
            this.f33192i = i2;
            CardGridLayout cardGridLayout = (CardGridLayout) c14184e.m53897a(C6248a.gridview);
            C2668g.a(cardGridLayout, "gridview");
            this.f33187d = cardGridLayout.getPaddingRight();
            cardGridLayout = (CardGridLayout) c14184e.m53897a(C6248a.gridview);
            C2668g.a(cardGridLayout, "gridview");
            this.f33188e = cardGridLayout.getPaddingLeft();
            cardGridLayout = (CardGridLayout) c14184e.m53897a(C6248a.gridview);
            C2668g.a(cardGridLayout, "gridview");
            this.f33189f = cardGridLayout.getPaddingTop();
            this.f33190g = ((int) au.a(c14184e, R.dimen.places_recs_grid_side_offset)) / -2;
        }

        public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "updatedAnimation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) valueAnimator).floatValue();
            m41462a();
            int a = C10184f.m41465a(this.f33188e, this.f33191h, floatValue);
            int a2 = C10184f.m41465a(this.f33187d, this.f33191h, floatValue);
            ((CardGridLayout) this.f33184a.m53897a(C6248a.gridview)).setPadding(a, C10184f.m41465a(this.f33189f, this.f33192i, floatValue), a2, 0);
            if (floatValue > this.f33186c) {
                CardGridLayout cardGridLayout = (CardGridLayout) this.f33184a.m53897a(C6248a.gridview);
                C2668g.a(cardGridLayout, "gridview");
                if (cardGridLayout.getChildCount() > 1) {
                    View childAt = ((CardGridLayout) this.f33184a.m53897a(C6248a.gridview)).getChildAt(1);
                    if (floatValue < this.f33186c + this.f33185b) {
                        valueAnimator = C10184f.m41465a(0, this.f33190g, (floatValue - this.f33186c) / this.f33185b);
                        C2668g.a(childAt, "second");
                        m41463a(childAt, valueAnimator, valueAnimator);
                        return;
                    }
                    valueAnimator = C10184f.m41465a(this.f33190g, 0, (floatValue - (this.f33186c + this.f33185b)) / this.f33185b);
                    C2668g.a(childAt, "second");
                    m41463a(childAt, valueAnimator, valueAnimator);
                }
            }
        }

        /* renamed from: a */
        private final void m41462a() {
            CardGridLayout cardGridLayout = (CardGridLayout) this.f33184a.m53897a(C6248a.gridview);
            C2668g.a(cardGridLayout, "gridview");
            cardGridLayout.getLayoutManager().scrollToPosition(0);
        }

        /* renamed from: a */
        private final void m41463a(View view, int i, int i2) {
            view.setTranslationY((float) i2);
            view.setTranslationX((float) i);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardExpanded$TeaserBounceAnimation;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "teasers", "Landroid/view/View;", "distance", "", "(Lcom/tinder/places/card/view/PlaceCardExpanded;Landroid/view/View;I)V", "getDistance", "()I", "startTime", "", "startY", "getTeasers", "()Landroid/view/View;", "onAnimationUpdate", "", "updatedAnimation", "Landroid/animation/ValueAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$c */
    public final class C10168c implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33193a;
        /* renamed from: b */
        private final float f33194b = 0.3f;
        /* renamed from: c */
        private final int f33195c;
        @NotNull
        /* renamed from: d */
        private final View f33196d;
        /* renamed from: e */
        private final int f33197e;

        public C10168c(C14184e c14184e, @NotNull View view, int i) {
            C2668g.b(view, "teasers");
            this.f33193a = c14184e;
            this.f33196d = view;
            this.f33197e = i;
            c14184e = this.f33196d.getLayoutParams();
            if (c14184e == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            this.f33195c = ((LayoutParams) c14184e).topMargin;
        }

        public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "updatedAnimation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            if (valueAnimator > this.f33194b) {
                double sin = (Math.sin(((double) ((valueAnimator - this.f33194b) / (((float) 1) - this.f33194b))) * 3.141592653589793d) * ((double) this.f33197e)) + ((double) this.f33195c);
                valueAnimator = this.f33196d.getLayoutParams();
                if (valueAnimator == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                LayoutParams layoutParams = (LayoutParams) valueAnimator;
                layoutParams.topMargin = (int) sin;
                this.f33196d.setLayoutParams(layoutParams);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardExpanded$ToolbarSwipeDownListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/tinder/places/card/view/PlaceCardExpanded;)V", "oldY", "", "Ljava/lang/Float;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$d */
    public final class C10169d implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33198a;
        /* renamed from: b */
        private Float f33199b;

        public C10169d(C14184e c14184e) {
            this.f33198a = c14184e;
        }

        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            C2668g.b(view, "v");
            C2668g.b(motionEvent, "event");
            switch (C0597f.a(motionEvent)) {
                case null:
                    this.f33199b = Float.valueOf(motionEvent.getY());
                    return true;
                case 1:
                    view = this.f33199b;
                    if (view == null) {
                        return true;
                    }
                    if (motionEvent.getY() - ((Number) view).floatValue() > ((float) 50)) {
                        this.f33198a.getPresenter$Tinder_release().m48599e();
                    }
                    this.f33199b = (Float) null;
                    return true;
                default:
                    return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$e */
    static final class C10170e implements OnClickListener {
        /* renamed from: a */
        public static final C10170e f33200a = new C10170e();

        C10170e() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$f */
    static final class C10171f implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33201a;

        C10171f(C14184e c14184e) {
            this.f33201a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = (TextView) this.f33201a.m53897a(C6248a.visitorCountTextViewExpanded);
            C2668g.a(textView, "visitorCountTextViewExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            textView.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$g */
    static final class C10172g implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33202a;
        /* renamed from: b */
        final /* synthetic */ float f33203b;
        /* renamed from: c */
        final /* synthetic */ float f33204c;

        C10172g(C14184e c14184e, float f, float f2) {
            this.f33202a = c14184e;
            this.f33203b = f;
            this.f33204c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            ((CustomTextView) this.f33202a.m53897a(C6248a.titleTextViewExpanded)).setTextSize(0, (valueAnimator.getAnimatedFraction() * this.f33203b) + this.f33204c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$h */
    static final class C10173h implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33205a;
        /* renamed from: b */
        final /* synthetic */ float f33206b;
        /* renamed from: c */
        final /* synthetic */ float f33207c;

        C10173h(C14184e c14184e, float f, float f2) {
            this.f33205a = c14184e;
            this.f33206b = f;
            this.f33207c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = this.f33206b;
            C2668g.a(valueAnimator, "it");
            ((CustomTextView) this.f33205a.m53897a(C6248a.titleTextViewExpanded)).setTextSize(0, f - (valueAnimator.getAnimatedFraction() * (-this.f33207c)));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$i */
    static final class C10174i implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33208a;

        C10174i(C14184e c14184e) {
            this.f33208a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CustomTextView customTextView = (CustomTextView) this.f33208a.m53897a(C6248a.titleTextViewExpanded);
            C2668g.a(customTextView, "titleTextViewExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            customTextView.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$j */
    static final class C10175j implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ PlaceRecTeasersView f33209a;

        C10175j(PlaceRecTeasersView placeRecTeasersView) {
            this.f33209a = placeRecTeasersView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PlaceRecTeasersView placeRecTeasersView = this.f33209a;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            placeRecTeasersView.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$k */
    static final class C10176k implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33210a;

        C10176k(C14184e c14184e) {
            this.f33210a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = (TextView) this.f33210a.m53897a(C6248a.visitorCountTextViewExpanded);
            C2668g.a(textView, "visitorCountTextViewExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            textView.setAlpha(1.0f - ((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$l */
    static final class C10177l implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33211a;

        C10177l(C14184e c14184e) {
            this.f33211a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = (ImageView) this.f33211a.m53897a(C6248a.expandedCardHeaderBackground);
            C2668g.a(imageView, "expandedCardHeaderBackground");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            imageView.setAlpha(1.0f - ((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$m */
    static final class C10178m implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33212a;

        C10178m(C14184e c14184e) {
            this.f33212a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PlacesRecsView placesRecsView = (PlacesRecsView) this.f33212a.m53897a(C6248a.expandedRecsView);
            C2668g.a(placesRecsView, "expandedRecsView");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            placesRecsView.setAlpha(1.0f - ((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$n */
    static final class C10179n implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33213a;

        C10179n(C14184e c14184e) {
            this.f33213a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = (ImageView) this.f33213a.m53897a(C6248a.collapseCardExpanded);
            C2668g.a(imageView, "collapseCardExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            imageView.setAlpha(1.0f - ((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$o */
    static final class C10180o implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33214a;

        C10180o(C14184e c14184e) {
            this.f33214a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = (ImageView) this.f33214a.m53897a(C6248a.verticalEllipsesExpanded);
            C2668g.a(imageView, "verticalEllipsesExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            imageView.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$p */
    static final class C10181p implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33215a;

        C10181p(C14184e c14184e) {
            this.f33215a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CustomTextView customTextView = (CustomTextView) this.f33215a.m53897a(C6248a.introPlaceTextExpanded);
            C2668g.a(customTextView, "introPlaceTextExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            customTextView.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$q */
    static final class C10182q implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33216a;

        C10182q(C14184e c14184e) {
            this.f33216a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = (TextView) this.f33216a.m53897a(C6248a.seeRecsExpanded);
            C2668g.a(textView, "seeRecsExpanded");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            textView.setAlpha(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$r */
    static final class C10183r implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C14184e f33217a;

        C10183r(C14184e c14184e) {
            this.f33217a = c14184e;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CustomTextView customTextView = (CustomTextView) this.f33217a.m53897a(C6248a.titleTextMini);
            C2668g.a(customTextView, "titleTextMini");
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            customTextView.setAlpha(1.0f - ((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardExpanded$DidExpandListener;", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/places/card/view/PlaceCardExpanded;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.view.e$a */
    public final class C12318a extends an {
        /* renamed from: a */
        final /* synthetic */ C14184e f39889a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.card.view.e$a$a */
        static final class C10166a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C12318a f33183a;

            C10166a(C12318a c12318a) {
                this.f33183a = c12318a;
            }

            public final void onClick(View view) {
                this.f33183a.f39889a.getPresenter$Tinder_release().m48599e();
            }
        }

        public C12318a(C14184e c14184e) {
            this.f39889a = c14184e;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            ((ImageView) this.f39889a.m53897a(C6248a.collapseCardExpanded)).setOnClickListener(new C10166a(this));
            ((LinearLayout) this.f39889a.m53897a(C6248a.expandedPlacesHeader)).setOnTouchListener(new C10169d(this.f39889a));
            ((PlacesRecsView) this.f39889a.m53897a(C6248a.expandedRecsView)).m53084d();
            ((PlacesRecsView) this.f39889a.m53897a(C6248a.expandedRecsView)).setToolbarCollapser(this.f39889a.f44971f);
            C14184e c14184e = this.f39889a;
            LinearLayout linearLayout = (LinearLayout) this.f39889a.m53897a(C6248a.expandedPlacesHeader);
            C2668g.a(linearLayout, "expandedPlacesHeader");
            c14184e.m53888b(linearLayout.getHeight() * 2);
        }
    }

    /* renamed from: a */
    public View m53897a(int i) {
        if (this.f44973h == null) {
            this.f44973h = new HashMap();
        }
        View view = (View) this.f44973h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f44973h.put(Integer.valueOf(i), view);
        return view;
    }

    public C14184e(@NotNull Context context, @NotNull C14349b c14349b, @NotNull PlaceCardView placeCardView) {
        C2668g.b(context, "context");
        C2668g.b(c14349b, "viewModel");
        C2668g.b(placeCardView, "placeCard");
        super(context, null);
        this.f44972g = placeCardView;
        setCornerRadius((int) au.a(this, R.dimen.place_card_corner_radius));
        setRoundTop(true);
        setClipToPadding(false);
        if (VERSION.SDK_INT >= 21) {
            ViewCompat.i(this, 4.0f);
        }
        setupDagger(c14349b.a());
        context = context.getSystemService("layout_inflater");
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) context).inflate(R.layout.view_place_card_expanded, this, true);
        m53886a(c14349b);
        context = this.f44966a;
        if (context == null) {
            C2668g.b("presenter");
        }
        context.m48591a(c14349b.a());
        this.f44971f = (Function2) new PlaceCardExpanded$toolbarCollapser$1(this);
    }

    @NotNull
    public final C12306h getPresenter$Tinder_release() {
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        return c12306h;
    }

    public final void setPresenter$Tinder_release(@NotNull C12306h c12306h) {
        C2668g.b(c12306h, "<set-?>");
        this.f44966a = c12306h;
    }

    @NotNull
    public PlacesRecsComponent getPlacesRecsComponent() {
        PlacesRecsComponent placesRecsComponent = this.f44967b;
        if (placesRecsComponent == null) {
            C2668g.b("placesRecsComponent");
        }
        return placesRecsComponent;
    }

    public void setPlacesRecsComponent(@NotNull PlacesRecsComponent placesRecsComponent) {
        C2668g.b(placesRecsComponent, "<set-?>");
        this.f44967b = placesRecsComponent;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c12306h);
        m53884a();
    }

    protected void onDetachedFromWindow() {
        m53887b();
        Animator animator = this.f44968c;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public boolean onBackPressed() {
        boolean onBackPressed = ((PlacesRecsView) m53897a(C6248a.expandedRecsView)).onBackPressed();
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        c12306h.m48592a(onBackPressed);
        return true;
    }

    public void expand() {
        setAlpha(1.0f);
        Size windowSize = getWindowSize();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C2668g.a(ofFloat, "cardAnim");
        ofFloat.setInterpolator(C10184f.f33218a);
        ofFloat.setDuration(500);
        ofFloat.addUpdateListener(new C10187n(this, windowSize.getWidth(), windowSize.getHeight(), 0.0f, 0.0f));
        ofFloat.addListener(new C12318a(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C2668g.a(ofFloat2, "linearAnim");
        ofFloat2.setDuration(500);
        TextView textView = (TextView) m53897a(C6248a.visitorCountTextViewExpanded);
        C2668g.a(textView, "visitorCountTextViewExpanded");
        if (textView.getVisibility() == 0) {
            ofFloat2.addUpdateListener(new C10171f(this));
        }
        LinearLayout linearLayout = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout, "expandedPlacesHeader");
        ofFloat2.addUpdateListener(new C10165c(linearLayout, this.f44970e, this.f44969d));
        float a = au.a(this, R.dimen.place_card_front_title_size);
        CustomTextView customTextView = (CustomTextView) m53897a(C6248a.titleTextViewExpanded);
        C2668g.a(customTextView, "titleTextViewExpanded");
        float textSize = customTextView.getTextSize();
        a -= textSize;
        if (a != 0.0f) {
            ofFloat2.addUpdateListener(new C10172g(this, a, textSize));
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C2668g.a(ofFloat3, "recsAnim");
        ofFloat3.setInterpolator(C10184f.f33219b);
        ofFloat3.setDuration(500);
        LinearLayout linearLayout2 = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout2, "expandedPlacesHeader");
        ofFloat3.addUpdateListener(new C10167b(this, this.f44970e, linearLayout2.getHeight() + ((int) au.a(this, R.dimen.place_expanded_title_margin))));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat3).with(ofFloat2);
        animatorSet.start();
        this.f44968c = animatorSet;
        this.f44972g.setVisibility(8);
        this.f44972g.setVisibilityLocked(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void shrink(@org.jetbrains.annotations.NotNull com.tinder.domain.places.model.PlacesConfigExpansion.Size r9, @org.jetbrains.annotations.NotNull com.tinder.domain.places.model.PlacesConfigExpansion.Size r10, @org.jetbrains.annotations.NotNull com.tinder.domain.places.model.PlacesConfigExpansion.Size r11, @org.jetbrains.annotations.NotNull com.tinder.domain.places.model.PlacesConfigExpansion.Size r12, float r13) {
        /*
        r8 = this;
        r0 = "initialSize";
        kotlin.jvm.internal.C2668g.b(r9, r0);
        r0 = "titleSize";
        kotlin.jvm.internal.C2668g.b(r10, r0);
        r0 = "teaserSize";
        kotlin.jvm.internal.C2668g.b(r11, r0);
        r0 = "introSize";
        kotlin.jvm.internal.C2668g.b(r12, r0);
        r0 = r8.f44968c;
        if (r0 == 0) goto L_0x001b;
    L_0x0018:
        r0.cancel();
    L_0x001b:
        r0 = com.tinder.C6250b.C6248a.expandedRecsView;
        r0 = r8.m53897a(r0);
        r0 = (com.tinder.places.recs.view.PlacesRecsView) r0;
        r1 = 0;
        r0.setToolbarCollapser(r1);
        r0 = 1;
        r8.setRoundBottom(r0);
        r1 = com.tinder.C6250b.C6248a.introPlaceTextExpanded;
        r1 = r8.m53897a(r1);
        r1 = (com.tinder.views.CustomTextView) r1;
        r2 = "introPlaceTextExpanded";
        kotlin.jvm.internal.C2668g.a(r1, r2);
        r1 = (android.view.View) r1;
        r8.m53889b(r1, r12);
        r12 = 2;
        r1 = new float[r12];
        r1 = {0, 1065353216};
        r1 = android.animation.ValueAnimator.ofFloat(r1);
        r2 = "cardMoveDownAnim";
        kotlin.jvm.internal.C2668g.a(r1, r2);
        r2 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r1.setDuration(r2);
        r2 = com.tinder.places.card.view.C10184f.f33220c;
        r2 = (android.animation.TimeInterpolator) r2;
        r1.setInterpolator(r2);
        r2 = new com.tinder.places.card.view.m;
        r3 = r8;
        r3 = (android.view.View) r3;
        r4 = r9.getY();
        r4 = (float) r4;
        r5 = 0;
        r2.<init>(r3, r4, r5);
        r2 = (android.animation.ValueAnimator.AnimatorUpdateListener) r2;
        r1.addUpdateListener(r2);
        r2 = new float[r12];
        r2 = {0, 1065353216};
        r2 = android.animation.ValueAnimator.ofFloat(r2);
        r4 = "cardShrinkAnim";
        kotlin.jvm.internal.C2668g.a(r2, r4);
        r6 = 4642824187726004223; // 0x406e9fffffffffff float:NaN double:244.99999999999997;
        r6 = (long) r6;
        r2.setDuration(r6);
        r4 = new android.view.animation.DecelerateInterpolator;
        r6 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r4.<init>(r6);
        r4 = (android.animation.TimeInterpolator) r4;
        r2.setInterpolator(r4);
        r4 = new com.tinder.places.card.view.b;
        r6 = r9.getHeight();
        r4.<init>(r3, r6, r5);
        r4 = (android.animation.ValueAnimator.AnimatorUpdateListener) r4;
        r2.addUpdateListener(r4);
        r4 = com.tinder.C6250b.C6248a.titleTextViewExpanded;
        r4 = r8.m53897a(r4);
        r4 = (com.tinder.views.CustomTextView) r4;
        r5 = "titleTextViewExpanded";
        kotlin.jvm.internal.C2668g.a(r4, r5);
        r4 = r4.getTextSize();
        r13 = r13 - r4;
        r5 = 0;
        r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1));
        if (r5 == 0) goto L_0x00c0;
    L_0x00b6:
        r5 = new com.tinder.places.card.view.e$h;
        r5.<init>(r8, r4, r13);
        r5 = (android.animation.ValueAnimator.AnimatorUpdateListener) r5;
        r2.addUpdateListener(r5);
    L_0x00c0:
        r13 = new float[r12];
        r13 = {0, 1065353216};
        r13 = android.animation.ValueAnimator.ofFloat(r13);
        r4 = "cardFadeOutAnim";
        kotlin.jvm.internal.C2668g.a(r13, r4);
        r4 = 100;
        r13.setDuration(r4);
        r4 = new com.tinder.places.card.view.m;
        r5 = r9.getX();
        r5 = (float) r5;
        r4.<init>(r3, r5, r0);
        r4 = (android.animation.ValueAnimator.AnimatorUpdateListener) r4;
        r13.addUpdateListener(r4);
        r4 = new com.tinder.places.card.view.b;
        r9 = r9.getWidth();
        r4.<init>(r3, r9, r0);
        r4 = (android.animation.ValueAnimator.AnimatorUpdateListener) r4;
        r13.addUpdateListener(r4);
        r9 = new com.tinder.places.card.view.c;
        r0 = com.tinder.C6250b.C6248a.expandedPlacesHeader;
        r0 = r8.m53897a(r0);
        r0 = (android.widget.LinearLayout) r0;
        r3 = "expandedPlacesHeader";
        kotlin.jvm.internal.C2668g.a(r0, r3);
        r0 = (android.view.View) r0;
        r3 = r10.getX();
        r10 = r10.getY();
        r9.<init>(r0, r3, r10);
        r9 = (android.animation.ValueAnimator.AnimatorUpdateListener) r9;
        r13.addUpdateListener(r9);
        r9 = new com.tinder.places.card.view.e$k;
        r9.<init>(r8);
        r9 = (android.animation.ValueAnimator.AnimatorUpdateListener) r9;
        r13.addUpdateListener(r9);
        r9 = new com.tinder.places.card.view.e$l;
        r9.<init>(r8);
        r9 = (android.animation.ValueAnimator.AnimatorUpdateListener) r9;
        r13.addUpdateListener(r9);
        r9 = new com.tinder.places.card.view.e$m;
        r9.<init>(r8);
        r9 = (android.animation.ValueAnimator.AnimatorUpdateListener) r9;
        r13.addUpdateListener(r9);
        r9 = new com.tinder.places.card.view.e$n;
        r9.<init>(r8);
        r9 = (android.animation.ValueAnimator.AnimatorUpdateListener) r9;
        r13.addUpdateListener(r9);
        r9 = r8.m53881a(r11);
        r10 = new float[r12];
        r10 = {0, 1065353216};
        r10 = android.animation.ValueAnimator.ofFloat(r10);
        r0 = "cardFadeInAnim";
        kotlin.jvm.internal.C2668g.a(r10, r0);
        r3 = 4640361281679785984; // 0x4065e00000000000 float:0.0 double:175.0;
        r3 = (long) r3;
        r10.setDuration(r3);
        r0 = new com.tinder.places.card.view.e$o;
        r0.<init>(r8);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r10.addUpdateListener(r0);
        r0 = new com.tinder.places.card.view.e$p;
        r0.<init>(r8);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r10.addUpdateListener(r0);
        r0 = new com.tinder.places.card.view.e$q;
        r0.<init>(r8);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r10.addUpdateListener(r0);
        r0 = com.tinder.C6250b.C6248a.titleTextMini;
        r0 = r8.m53897a(r0);
        r0 = (com.tinder.views.CustomTextView) r0;
        r3 = "titleTextMini";
        kotlin.jvm.internal.C2668g.a(r0, r3);
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0199;
    L_0x0185:
        r0 = new com.tinder.places.card.view.e$r;
        r0.<init>(r8);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r13.addUpdateListener(r0);
        r0 = new com.tinder.places.card.view.e$i;
        r0.<init>(r8);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r10.addUpdateListener(r0);
    L_0x0199:
        r12 = new float[r12];
        r12 = {0, 1065353216};
        r12 = android.animation.ValueAnimator.ofFloat(r12);
        r0 = "teaserBounceAnim";
        kotlin.jvm.internal.C2668g.a(r12, r0);
        r3 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r12.setDuration(r3);
        r11 = r11.getHeight();
        r3 = (double) r11;
        r5 = 4590429028186199163; // 0x3fb47ae147ae147b float:89128.96 double:0.08;
        r3 = r3 * r5;
        r11 = (int) r3;
        r0 = new com.tinder.places.card.view.e$c;
        r3 = r9;
        r3 = (android.view.View) r3;
        r0.<init>(r8, r3, r11);
        r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0;
        r12.addUpdateListener(r0);
        r11 = new com.tinder.places.card.view.e$j;
        r11.<init>(r9);
        r11 = (android.animation.ValueAnimator.AnimatorUpdateListener) r11;
        r12.addUpdateListener(r11);
        r9 = new com.tinder.places.card.view.o;
        r11 = r8.f44972g;
        r9.<init>(r8, r11);
        r9 = (android.animation.Animator.AnimatorListener) r9;
        r12.addListener(r9);
        r9 = new android.animation.AnimatorSet;
        r9.<init>();
        r13 = (android.animation.Animator) r13;
        r11 = r9.play(r13);
        r1 = (android.animation.Animator) r1;
        r11 = r11.with(r1);
        r2 = (android.animation.Animator) r2;
        r11 = r11.with(r2);
        r10 = (android.animation.Animator) r10;
        r10 = r11.before(r10);
        r12 = (android.animation.Animator) r12;
        r10.before(r12);
        r9.start();
        r9 = (android.animation.Animator) r9;
        r8.f44968c = r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.places.card.view.e.shrink(com.tinder.domain.places.model.PlacesConfigExpansion$Size, com.tinder.domain.places.model.PlacesConfigExpansion$Size, com.tinder.domain.places.model.PlacesConfigExpansion$Size, com.tinder.domain.places.model.PlacesConfigExpansion$Size, float):void");
    }

    public void setTotalVisitorsCount(int i) {
        TextView textView = (TextView) m53897a(C6248a.visitorCountTextViewExpanded);
        C2668g.a(textView, "visitorCountTextViewExpanded");
        C10125a c10125a = C10125a.f33093a;
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        textView.setText(c10125a.m41366a(i, resources));
        textView = (TextView) m53897a(C6248a.seeRecsExpanded);
        C2668g.a(textView, "seeRecsExpanded");
        c10125a = C10125a.f33093a;
        resources = getResources();
        C2668g.a(resources, "resources");
        textView.setText(c10125a.m41367b(i, resources));
        textView = (TextView) m53897a(C6248a.seeRecsExpanded);
        C2668g.a(textView, "seeRecsExpanded");
        c10125a = C10125a.f33093a;
        resources = getResources();
        C2668g.a(resources, "resources");
        textView.setBackground(c10125a.m41368c(i, resources));
    }

    /* renamed from: a */
    private final PlaceRecTeasersView m53881a(Size size) {
        PlaceRecTeasersView placeRecTeasersView = (PlaceRecTeasersView) m53897a(C6248a.teasersThumbnails);
        C2668g.a(placeRecTeasersView, "teasersThumbnails");
        placeRecTeasersView.setVisibility(0);
        placeRecTeasersView = (PlaceRecTeasersView) m53897a(C6248a.teasersThumbnails);
        C2668g.a(placeRecTeasersView, "teasersThumbnails");
        ViewGroup.LayoutParams layoutParams = placeRecTeasersView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.topMargin = size.getY();
        layoutParams2.leftMargin = size.getX();
        layoutParams2.width = size.getWidth();
        layoutParams2.height = size.getHeight();
        PlaceRecTeasersView placeRecTeasersView2 = (PlaceRecTeasersView) m53897a(C6248a.teasersThumbnails);
        C2668g.a(placeRecTeasersView2, "teasersThumbnails");
        placeRecTeasersView2.setLayoutParams(layoutParams2);
        ((PlaceRecTeasersView) m53897a(C6248a.teasersThumbnails)).m48652a(new C15425d(((PlacesRecsView) m53897a(C6248a.expandedRecsView)).getCurrentRecsTeaserImages(), null));
        size = this.f44966a;
        if (size == null) {
            C2668g.b("presenter");
        }
        size.m48600f();
        placeRecTeasersView2 = (PlaceRecTeasersView) m53897a(C6248a.teasersThumbnails);
        C2668g.a(placeRecTeasersView2, "teasersThumbnails");
        return placeRecTeasersView2;
    }

    public void setTeaserVisitorCounts(int i, int i2, @NotNull C14346b c14346b) {
        C2668g.b(c14346b, "background");
        Context context = getContext();
        C2668g.a(context, "context");
        ((PlaceRecTeasersView) m53897a(C6248a.teasersThumbnails)).m48651a(i, i2, c14346b.a(context));
    }

    public void setTitleTextFontSize(float f) {
        ((CustomTextView) m53897a(C6248a.titleTextViewExpanded)).setTextSize(0, f);
    }

    /* renamed from: a */
    public final void m53898a(@NotNull PlacesConfigExpansion placesConfigExpansion) {
        C2668g.b(placesConfigExpansion, "nonAdjusted");
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        c12306h.m48589a(placesConfigExpansion);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z = this.f44966a;
        if (!z) {
            C2668g.b("presenter");
        }
        z.m48601g();
    }

    public void measureCard(@NotNull Size size) {
        C2668g.b(size, "cardSize");
        size = m53880a((View) this, size);
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        c12306h.m48588a(size);
        m53890b(size);
    }

    public void measureTeaser(@NotNull Size size) {
        C2668g.b(size, "teaserSize");
        PlacesRecsView placesRecsView = (PlacesRecsView) m53897a(C6248a.expandedRecsView);
        C2668g.a(placesRecsView, "expandedRecsView");
        size = m53880a((View) placesRecsView, size);
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        c12306h.m48594b(size);
    }

    public void measureTitle(@NotNull Size size) {
        C2668g.b(size, "titleSize");
        LinearLayout linearLayout = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout, "expandedPlacesHeader");
        size = m53880a((View) linearLayout, size);
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        c12306h.m48596c(size);
    }

    public void measureIntro(@NotNull Size size) {
        C2668g.b(size, "introSize");
        CustomTextView customTextView = (CustomTextView) m53897a(C6248a.introPlaceTextExpanded);
        C2668g.a(customTextView, "introPlaceTextExpanded");
        size = m53880a((View) customTextView, size);
        C12306h c12306h = this.f44966a;
        if (c12306h == null) {
            C2668g.b("presenter");
        }
        c12306h.m48598d(size);
    }

    /* renamed from: a */
    private final Size m53880a(View view, Size size) {
        view = Size.Companion.getAbsoluteSize(view);
        return new Size(size.getX() - view.getX(), size.getY() - view.getY(), size.getWidth(), size.getHeight());
    }

    private final void setupDagger(String str) {
        Context context = getContext();
        C2668g.a(context, "context");
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        str = ((ManagerApp) context).h().placesRecsComponentBuilder().bindRecSource(new Places(Long.parseLong(str))).build();
        C2668g.a(str, "(context.applicationCont…\n                .build()");
        setPlacesRecsComponent(str);
        getPlacesRecsComponent().inject(this);
    }

    /* renamed from: a */
    private final void m53886a(C14349b c14349b) {
        setOnClickListener(C10170e.f33200a);
        Context context = getContext();
        C2668g.a(context, "context");
        setBackground(c14349b.a(context));
        ImageView imageView = (ImageView) m53897a(C6248a.expandedCardHeaderBackground);
        Context context2 = getContext();
        C2668g.a(context2, "context");
        imageView.setImageDrawable(c14349b.b(context2));
        CustomTextView customTextView = (CustomTextView) m53897a(C6248a.titleTextViewExpanded);
        C2668g.a(customTextView, "titleTextViewExpanded");
        customTextView.setText(c14349b.b());
        customTextView = (CustomTextView) m53897a(C6248a.titleTextMini);
        C2668g.a(customTextView, "titleTextMini");
        customTextView.setText(c14349b.b());
        customTextView = (CustomTextView) m53897a(C6248a.introPlaceTextExpanded);
        C2668g.a(customTextView, "introPlaceTextExpanded");
        context2 = getContext();
        C2668g.a(context2, "context");
        customTextView.setText(c14349b.c(context2));
    }

    public void setRecsPosition(@NotNull Size size) {
        C2668g.b(size, "teaserSize");
        ((CardGridLayout) m53897a(C6248a.gridview)).setPadding(size.getX(), size.getY(), 0, 0);
    }

    public void setTitlePosition(@NotNull Size size) {
        C2668g.b(size, "titleSize");
        LinearLayout linearLayout = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout, "expandedPlacesHeader");
        m53889b(linearLayout, size);
    }

    /* renamed from: b */
    private final void m53888b(int i) {
        ImageView imageView = (ImageView) m53897a(C6248a.expandedCardHeaderBackground);
        C2668g.a(imageView, "expandedCardHeaderBackground");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.height = i;
        ImageView imageView2 = (ImageView) m53897a(C6248a.expandedCardHeaderBackground);
        C2668g.a(imageView2, "expandedCardHeaderBackground");
        imageView2.setLayoutParams(layoutParams2);
    }

    public void resizeRecsToWindow() {
        GridEmptyView gridEmptyView = (GridEmptyView) m53897a(C6248a.empty_gridview);
        C2668g.a(gridEmptyView, "empty_gridview");
        gridEmptyView.setVisibility(8);
        PlacesRecsView placesRecsView = (PlacesRecsView) m53897a(C6248a.expandedRecsView);
        C2668g.a(placesRecsView, "expandedRecsView");
        ViewGroup.LayoutParams layoutParams = placesRecsView.getLayoutParams();
        layoutParams.width = getWindowSize().getWidth();
        PlacesRecsView placesRecsView2 = (PlacesRecsView) m53897a(C6248a.expandedRecsView);
        C2668g.a(placesRecsView2, "expandedRecsView");
        placesRecsView2.setLayoutParams(layoutParams);
        CardGridLayout cardGridLayout = (CardGridLayout) m53897a(C6248a.gridview);
        C2668g.a(cardGridLayout, "gridview");
        cardGridLayout.setClipToPadding(false);
    }

    private final Size getWindowSize() {
        ViewParent parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        return new Size(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }

    /* renamed from: b */
    private final void m53889b(View view, Size size) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.leftMargin = size.getX();
        layoutParams2.topMargin = size.getY();
        view.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    private final void m53890b(Size size) {
        setX((float) size.getX());
        setY((float) size.getY());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = size.getHeight();
        layoutParams.width = size.getWidth();
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m53884a() {
        ViewParent parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        m53882a((View) parent).setBackButtonHandler(this);
    }

    /* renamed from: b */
    private final void m53887b() {
        ViewParent parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        m53882a((View) parent).setBackButtonHandler((BackButtonHandler) null);
    }

    /* renamed from: a */
    private final BackButtonRegistrar m53882a(View view) {
        BackButtonRegistrar backButtonRegistrar = (BackButtonRegistrar) (!(view instanceof BackButtonRegistrar) ? null : view);
        if (backButtonRegistrar != null) {
            return backButtonRegistrar;
        }
        view = view.getParent();
        if (view != null) {
            return m53882a(view);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: c */
    private final void m53892c() {
        CustomTextView customTextView = (CustomTextView) m53897a(C6248a.titleTextViewExpanded);
        C2668g.a(customTextView, "titleTextViewExpanded");
        customTextView.setVisibility(8);
        TextView textView = (TextView) m53897a(C6248a.visitorCountTextViewExpanded);
        C2668g.a(textView, "visitorCountTextViewExpanded");
        textView.setVisibility(8);
        customTextView = (CustomTextView) m53897a(C6248a.titleTextMini);
        C2668g.a(customTextView, "titleTextMini");
        customTextView.setVisibility(0);
    }

    /* renamed from: d */
    private final void m53894d() {
        CustomTextView customTextView = (CustomTextView) m53897a(C6248a.titleTextViewExpanded);
        C2668g.a(customTextView, "titleTextViewExpanded");
        customTextView.setVisibility(0);
        TextView textView = (TextView) m53897a(C6248a.visitorCountTextViewExpanded);
        C2668g.a(textView, "visitorCountTextViewExpanded");
        textView.setVisibility(0);
        customTextView = (CustomTextView) m53897a(C6248a.titleTextMini);
        C2668g.a(customTextView, "titleTextMini");
        customTextView.setVisibility(8);
    }

    /* renamed from: e */
    private final void m53896e() {
        LinearLayout linearLayout = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout, "expandedPlacesHeader");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i = layoutParams2.topMargin;
        int i2 = layoutParams2.leftMargin;
        layoutParams2.topMargin = 0;
        LinearLayout linearLayout2 = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout2, "expandedPlacesHeader");
        linearLayout2.setLayoutParams(layoutParams2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C2668g.a(ofFloat, "anim");
        ofFloat.setDuration(100);
        LinearLayout linearLayout3 = (LinearLayout) m53897a(C6248a.expandedPlacesHeader);
        C2668g.a(linearLayout3, "expandedPlacesHeader");
        ofFloat.addUpdateListener(new C10165c(linearLayout3, i2, i));
        ofFloat.start();
        this.f44968c = ofFloat;
    }
}
