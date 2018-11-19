package com.tinder.places.carousel.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.p011a.C2891c;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.Deadshot;
import com.tinder.places.card.view.C14184e;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.card.view.PlaceCardView.PlaceCarouselListener;
import com.tinder.places.carousel.adapter.PlacesCarouselAdapter;
import com.tinder.places.carousel.presenter.C10194c;
import com.tinder.places.carousel.target.PlacesCarouselTarget;
import com.tinder.places.carousel.view.CarouselLayoutManager.LayoutTransformer;
import com.tinder.places.carousel.view.CarouselLayoutManager.OnCenterItemChangedListener;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.main.view.PlacesView;
import com.tinder.places.p307b.C12296e;
import com.tinder.places.p307b.C12296e.C10124a;
import com.tinder.places.viewmodel.C14349b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.p459b.C18450a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002JKB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020#H\u0016J\u0006\u0010)\u001a\u00020#J\b\u0010*\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020%H\u0016J\b\u00102\u001a\u00020#H\u0014J\b\u00103\u001a\u00020#H\u0014J\u0006\u00104\u001a\u00020#J\u0012\u00105\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u0019H\u0016J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020@H\u0016J\u0018\u0010A\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020#2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006L"}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselView;", "Landroid/support/v7/widget/RecyclerView;", "Lcom/tinder/places/carousel/target/PlacesCarouselTarget;", "Lcom/tinder/places/card/view/PlaceCardView$PlaceCarouselListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "carouselAdapter", "Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter;", "getCarouselAdapter$Tinder_release", "()Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter;", "setCarouselAdapter$Tinder_release", "(Lcom/tinder/places/carousel/adapter/PlacesCarouselAdapter;)V", "carouselLayoutManager", "Lcom/tinder/places/carousel/view/CarouselLayoutManager;", "getCarouselLayoutManager$Tinder_release", "()Lcom/tinder/places/carousel/view/CarouselLayoutManager;", "setCarouselLayoutManager$Tinder_release", "(Lcom/tinder/places/carousel/view/CarouselLayoutManager;)V", "decelerationInterpolator", "Landroid/view/animation/DecelerateInterpolator;", "enableScrolling", "", "linearOutSlowInInterpolator", "Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;", "presenter", "Lcom/tinder/places/carousel/presenter/PlacesCarouselPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/carousel/presenter/PlacesCarouselPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/carousel/presenter/PlacesCarouselPresenter;)V", "add", "", "index", "", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceCardViewModel;", "allowScrolling", "animateInViews", "disallowScrolling", "findPlacesParentLayout", "Lcom/tinder/places/main/view/PlacesView;", "view", "Landroid/view/View;", "fling", "velocityX", "velocityY", "onAttachedToWindow", "onDetachedFromWindow", "onEntranceAnimationEnded", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "openPlaceRecs", "placeCard", "Lcom/tinder/places/card/view/PlaceCardView;", "pagerScrollEnabled", "enabled", "removePlace", "placeId", "", "set", "setLayoutManager", "layout", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "setSelectedItem", "showErrorDialog", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "showPlaceRecs", "PlacesCenterItemChangedListener", "ScrollingItemAnimator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCarouselView extends RecyclerView implements PlaceCarouselListener, PlacesCarouselTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public PlacesCarouselAdapter f44995a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C10194c f44996b;
    @Inject
    @NotNull
    /* renamed from: c */
    public CarouselLayoutManager f44997c;
    /* renamed from: d */
    private boolean f44998d;
    /* renamed from: e */
    private final DecelerateInterpolator f44999e;
    /* renamed from: f */
    private final C2891c f45000f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselView$PlacesCenterItemChangedListener;", "Lcom/tinder/places/carousel/view/CarouselLayoutManager$OnCenterItemChangedListener;", "(Lcom/tinder/places/carousel/view/PlacesCarouselView;)V", "onCenterItemChanged", "", "adapterPosition", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.PlacesCarouselView$a */
    public final class C12328a implements OnCenterItemChangedListener {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselView f39922a;

        public C12328a(PlacesCarouselView placesCarouselView) {
            this.f39922a = placesCarouselView;
        }

        public void onCenterItemChanged(int i) {
            if (this.f39922a.getCarouselAdapter$Tinder_release().m48670a() && i < this.f39922a.getCarouselAdapter$Tinder_release().getItemCount() && i >= 0) {
                this.f39922a.getPresenter$Tinder_release().m41497a(this.f39922a.getCarouselAdapter$Tinder_release().m48667a(i).a());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselView$ScrollingItemAnimator;", "Lcom/tinder/places/carousel/view/PlacesCarouselItemAnimator;", "carouselLayoutManager", "Lcom/tinder/places/carousel/view/CarouselLayoutManager;", "(Lcom/tinder/places/carousel/view/PlacesCarouselView;Lcom/tinder/places/carousel/view/CarouselLayoutManager;)V", "animateMove", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "fromX", "", "fromY", "toX", "toY", "onRemoveFinished", "", "item", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.PlacesCarouselView$b */
    public final class C14311b extends C14203f {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselView f45329a;

        public C14311b(PlacesCarouselView placesCarouselView, @NotNull CarouselLayoutManager carouselLayoutManager) {
            C2668g.b(carouselLayoutManager, "carouselLayoutManager");
            this.f45329a = placesCarouselView;
            super(carouselLayoutManager);
        }

        public void onRemoveFinished(@Nullable ViewHolder viewHolder) {
            super.onRemoveFinished(viewHolder);
            this.f45329a.getPresenter$Tinder_release().m41502f();
        }

        public boolean animateMove(@NotNull ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            C2668g.b(viewHolder, "holder");
            if (i3 - i != 0) {
                return super.animateMove(viewHolder, i, i2, i3, i4);
            }
            dispatchMoveFinished(viewHolder);
            return true;
        }
    }

    public PlacesCarouselView(@NotNull Context context) {
        C2668g.b(context, "context");
        this(context, null);
    }

    public PlacesCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f44998d = true;
        this.f44999e = new DecelerateInterpolator(1.5f);
        this.f45000f = new C2891c();
        attributeSet = getContext();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.injection.PlacesComponentProvider");
        }
        ((PlacesComponentProvider) attributeSet).getPlacesComponent().inject(this);
        attributeSet = this.f44995a;
        if (attributeSet == null) {
            C2668g.b("carouselAdapter");
        }
        attributeSet.m48669a((PlaceCarouselListener) this);
        attributeSet = this.f44995a;
        if (attributeSet == null) {
            C2668g.b("carouselAdapter");
        }
        setAdapter((Adapter) attributeSet);
        setHasFixedSize(true);
        context = this.f44997c;
        if (context == null) {
            C2668g.b("carouselLayoutManager");
        }
        setLayoutManager((LayoutManager) context);
        attributeSet = this.f44997c;
        if (attributeSet == null) {
            C2668g.b("carouselLayoutManager");
        }
        setItemAnimator((ItemAnimator) new C14311b(this, attributeSet));
        addOnScrollListener((OnScrollListener) new C12329a());
    }

    @NotNull
    public final PlacesCarouselAdapter getCarouselAdapter$Tinder_release() {
        PlacesCarouselAdapter placesCarouselAdapter = this.f44995a;
        if (placesCarouselAdapter == null) {
            C2668g.b("carouselAdapter");
        }
        return placesCarouselAdapter;
    }

    public final void setCarouselAdapter$Tinder_release(@NotNull PlacesCarouselAdapter placesCarouselAdapter) {
        C2668g.b(placesCarouselAdapter, "<set-?>");
        this.f44995a = placesCarouselAdapter;
    }

    @NotNull
    public final C10194c getPresenter$Tinder_release() {
        C10194c c10194c = this.f44996b;
        if (c10194c == null) {
            C2668g.b("presenter");
        }
        return c10194c;
    }

    public final void setPresenter$Tinder_release(@NotNull C10194c c10194c) {
        C2668g.b(c10194c, "<set-?>");
        this.f44996b = c10194c;
    }

    @NotNull
    public final CarouselLayoutManager getCarouselLayoutManager$Tinder_release() {
        CarouselLayoutManager carouselLayoutManager = this.f44997c;
        if (carouselLayoutManager == null) {
            C2668g.b("carouselLayoutManager");
        }
        return carouselLayoutManager;
    }

    public final void setCarouselLayoutManager$Tinder_release(@NotNull CarouselLayoutManager carouselLayoutManager) {
        C2668g.b(carouselLayoutManager, "<set-?>");
        this.f44997c = carouselLayoutManager;
    }

    public void setLayoutManager(@NotNull LayoutManager layoutManager) {
        C2668g.b(layoutManager, "layout");
        super.setLayoutManager(layoutManager);
        if (layoutManager instanceof CarouselLayoutManager) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            carouselLayoutManager.m48693a((LayoutTransformer) new C12330c());
            carouselLayoutManager.m48694a((OnCenterItemChangedListener) new C12328a(this));
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10194c c10194c = this.f44996b;
        if (c10194c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10194c);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        return (!this.f44998d || super.onTouchEvent(motionEvent) == null) ? null : true;
    }

    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        return (!this.f44998d || super.onInterceptTouchEvent(motionEvent) == null) ? null : true;
    }

    public boolean fling(int i, int i2) {
        LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof CarouselLayoutManager) {
            if (i > 350) {
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
                i = this.f44995a;
                if (i == 0) {
                    C2668g.b("carouselAdapter");
                }
                smoothScrollBy(carouselLayoutManager.m48696b(i.getItemCount()), 0, (Interpolator) this.f44999e);
                return true;
            } else if (i < -350) {
                smoothScrollBy(((CarouselLayoutManager) layoutManager).m48697c(), 0, (Interpolator) this.f45000f);
                return true;
            }
        }
        return super.fling(i, i2);
    }

    public void openPlaceRecs(@NotNull PlaceCardView placeCardView) {
        C2668g.b(placeCardView, "placeCard");
        C14349b placeCardViewModel$Tinder_release = placeCardView.getPlaceCardViewModel$Tinder_release();
        if (placeCardViewModel$Tinder_release != null) {
            PlacesView a = m53919a(placeCardView);
            Context context = placeCardView.getContext();
            C2668g.a(context, "placeCard.context");
            C14184e c14184e = new C14184e(context, placeCardViewModel$Tinder_release, placeCardView);
            c14184e.setAlpha(0.01f);
            a.addView(c14184e);
            c14184e.m53898a(placeCardView.getExpansionConfig());
        }
    }

    /* renamed from: a */
    private final PlacesView m53919a(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof PlacesView)) {
            parent = null;
        }
        PlacesView placesView = (PlacesView) parent;
        if (placesView != null) {
            return placesView;
        }
        view = view.getParent();
        if (view != null) {
            return m53919a((ViewGroup) view);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void pagerScrollEnabled(boolean z) {
        this.f44998d = z;
    }

    public void setSelectedItem(@NotNull String str) {
        C2668g.b(str, "placeId");
        PlacesCarouselAdapter placesCarouselAdapter = this.f44995a;
        if (placesCarouselAdapter == null) {
            C2668g.b("carouselAdapter");
        }
        int a = placesCarouselAdapter.m48666a(str);
        if (a >= null) {
            CarouselLayoutManager carouselLayoutManager = this.f44997c;
            if (carouselLayoutManager == null) {
                C2668g.b("carouselLayoutManager");
            }
            if (a != carouselLayoutManager.m48691a()) {
                carouselLayoutManager = this.f44997c;
                if (carouselLayoutManager == null) {
                    C2668g.b("carouselLayoutManager");
                }
                carouselLayoutManager.m48692a(a);
                scrollToPosition(a);
                getAdapter().notifyDataSetChanged();
                allowScrolling();
            }
        }
    }

    /* renamed from: a */
    public final void m53920a() {
        ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            View view = findViewHolderForAdapterPosition.itemView;
            int a = C18450a.a(3.0f);
            for (int i = 1; i < a; i++) {
                ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition2 != null) {
                    View view2 = findViewHolderForAdapterPosition2.itemView;
                    C2668g.a(view2, "viewToAnimate");
                    float x = view2.getX();
                    C2668g.a(view, "frontCard");
                    view2.setTranslationX(-(x - view.getX()));
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", new float[]{x, 0.0f});
                    ofFloat.setInterpolator(new OvershootInterpolator(2.0f / ((float) i)));
                    ofFloat.setStartDelay(((long) i) * 100);
                    ofFloat.start();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m53921b() {
        ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            View view = findViewHolderForAdapterPosition.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.card.view.PlaceCardView");
            }
            ((PlaceCardView) view).m48649b();
        }
    }

    public void add(int i, @NotNull C14349b c14349b) {
        C2668g.b(c14349b, "fromPlace");
        PlacesCarouselAdapter placesCarouselAdapter = this.f44995a;
        if (placesCarouselAdapter == null) {
            C2668g.b("carouselAdapter");
        }
        int a = placesCarouselAdapter.m48670a() ^ 1;
        PlacesCarouselAdapter placesCarouselAdapter2 = this.f44995a;
        if (placesCarouselAdapter2 == null) {
            C2668g.b("carouselAdapter");
        }
        placesCarouselAdapter2.m48671b(i, c14349b);
        if (a != 0) {
            i = this.f44996b;
            if (i == 0) {
                C2668g.b("presenter");
            }
            c14349b = this.f44995a;
            if (c14349b == null) {
                C2668g.b("carouselAdapter");
            }
            i.m41497a(c14349b.m48667a(0).a());
        }
    }

    public void set(int i, @NotNull C14349b c14349b) {
        C2668g.b(c14349b, "fromPlace");
        PlacesCarouselAdapter placesCarouselAdapter = this.f44995a;
        if (placesCarouselAdapter == null) {
            C2668g.b("carouselAdapter");
        }
        placesCarouselAdapter.m48668a(i, c14349b);
    }

    public void removePlace(@NotNull String str) {
        C2668g.b(str, "placeId");
        PlacesCarouselAdapter placesCarouselAdapter = this.f44995a;
        if (placesCarouselAdapter == null) {
            C2668g.b("carouselAdapter");
        }
        placesCarouselAdapter.m48672b(str);
    }

    public void showErrorDialog(@NotNull PlacesApiException placesApiException) {
        C2668g.b(placesApiException, "exception");
        C10124a c10124a = C12296e.f39820a;
        Context context = getContext();
        C2668g.a(context, "context");
        c10124a.m41365a(placesApiException, context).show();
    }

    public void disallowScrolling() {
        C10194c c10194c = this.f44996b;
        if (c10194c == null) {
            C2668g.b("presenter");
        }
        c10194c.m41501e();
    }

    public void allowScrolling() {
        C10194c c10194c = this.f44996b;
        if (c10194c == null) {
            C2668g.b("presenter");
        }
        c10194c.m41502f();
    }

    public void showPlaceRecs(@NotNull PlaceCardView placeCardView) {
        C2668g.b(placeCardView, "placeCard");
        C10194c c10194c = this.f44996b;
        if (c10194c == null) {
            C2668g.b("presenter");
        }
        c10194c.m41496a(placeCardView);
    }
}
