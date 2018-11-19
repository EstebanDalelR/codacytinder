package com.tinder.recs.view.loops;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.C0592b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.domain.common.model.Photo;
import com.tinder.recs.C14694R;
import com.tinder.recs.injection.RecsCardsInjector$Factory;
import com.tinder.recs.view.loops.presenter.TappyLoopsCarouselViewPresenter;
import com.tinder.recs.view.loops.target.TappyLoopsCarouselTarget;
import com.tinder.recs.view.tappablecards.TapRegionDetector;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappablecards.TappableCarouselView.OnOverTapListener;
import com.tinder.recs.view.tappablecards.TappableCarouselView.OnTapListener;
import com.tinder.recs.view.tappablecards.TappyPageIndicatorView;
import com.tinder.recs.view.tappy.TappyCarouselView;
import com.tinder.recs.view.tappy.TappyCarouselView.OnImageLoadedListener;
import com.tinder.utils.C15365p;
import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import com.tinder.video.view.LoopView;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)2\u0006\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020 H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\"H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\b\u00104\u001a\u00020 H\u0016J\u0010\u00105\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020\u0003H\u0016J\u0012\u00108\u001a\u00020 2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u00109\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010:\u001a\u00020 2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010;\u001a\u00020 2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010<\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J$\u0010=\u001a\u00020 2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0)2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0)H\u0016J\b\u0010B\u001a\u00020 H\u0016J\u0010\u0010C\u001a\u00020 2\u0006\u0010*\u001a\u00020\u000bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/tinder/recs/view/loops/TappyLoopsCarouselView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/recs/view/tappy/TappyCarouselView;", "Lcom/tinder/domain/common/model/Photo;", "Lcom/tinder/recs/view/loops/target/TappyLoopsCarouselTarget;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activePage", "", "onImageLoadedListener", "Lcom/tinder/recs/view/tappy/TappyCarouselView$OnImageLoadedListener;", "onOverTapListener", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnOverTapListener;", "onPhotoPageChangeListener", "Lcom/tinder/base/view/listener/OnPhotoPageChangeListener;", "onTapListener", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnTapListener;", "overTapAnimator", "Landroid/animation/ObjectAnimator;", "pageCount", "presenter", "Lcom/tinder/recs/view/loops/presenter/TappyLoopsCarouselViewPresenter;", "getPresenter$recs_cards_release", "()Lcom/tinder/recs/view/loops/presenter/TappyLoopsCarouselViewPresenter;", "setPresenter$recs_cards_release", "(Lcom/tinder/recs/view/loops/presenter/TappyLoopsCarouselViewPresenter;)V", "tapRegionDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "animateOverTap", "", "region", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "targetView", "Landroid/view/View;", "bind", "userId", "", "photos", "", "index", "clearImage", "dispatchTapRegionEvent", "tapRegion", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "hidePageIndicator", "onTouchEvent", "onViewRecycled", "setActivePage", "setImage", "image", "setOnImageLoadedListener", "setOnOverTapListener", "setOnPhotoPageChangeListener", "setOnTapListener", "setPageCount", "showMedia", "videoViewModels", "Lcom/tinder/video/model/VideoViewModel;", "imageViewModels", "Lcom/tinder/video/model/ImageViewModel;", "showPageIndicator", "showPhotoAtIndex", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class TappyLoopsCarouselView extends ConstraintLayout implements TappyLoopsCarouselTarget, TappyCarouselView<Photo> {
    private HashMap _$_findViewCache;
    private int activePage;
    private OnImageLoadedListener onImageLoadedListener;
    private OnOverTapListener onOverTapListener;
    private OnPhotoPageChangeListener onPhotoPageChangeListener;
    private OnTapListener onTapListener;
    private final ObjectAnimator overTapAnimator;
    private int pageCount;
    @Inject
    @NotNull
    public TappyLoopsCarouselViewPresenter presenter;
    private final C0592b tapRegionDetector;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public void clearImage() {
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        return true;
    }

    public void setImage(@NotNull Photo photo) {
        C2668g.b(photo, ManagerWebServices.IG_PARAM_IMAGE);
    }

    public /* synthetic */ TappyLoopsCarouselView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TappyLoopsCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.tapRegionDetector = TapRegionDetector.INSTANCE.create(this, new TappyLoopsCarouselView$tapRegionDetector$1(this));
        this.overTapAnimator = new ObjectAnimator();
        attributeSet = C15365p.m57675b(context);
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.injection.RecsCardsInjector.Factory");
        }
        ((RecsCardsInjector$Factory) attributeSet).provideRecsCardsInjector().inject(this);
        ConstraintLayout.inflate(context, C14694R.layout.view_tappable_loops_carousel, this);
        this.overTapAnimator.setProperty(View.ROTATION_Y);
        this.overTapAnimator.setDuration(140);
    }

    @NotNull
    public final TappyLoopsCarouselViewPresenter getPresenter$recs_cards_release() {
        TappyLoopsCarouselViewPresenter tappyLoopsCarouselViewPresenter = this.presenter;
        if (tappyLoopsCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        return tappyLoopsCarouselViewPresenter;
    }

    public final void setPresenter$recs_cards_release(@NotNull TappyLoopsCarouselViewPresenter tappyLoopsCarouselViewPresenter) {
        C2668g.b(tappyLoopsCarouselViewPresenter, "<set-?>");
        this.presenter = tappyLoopsCarouselViewPresenter;
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        this.tapRegionDetector.a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void bind(@NotNull String str, @NotNull List<? extends Photo> list, int i) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "photos");
        TappyLoopsCarouselViewPresenter tappyLoopsCarouselViewPresenter = this.presenter;
        if (tappyLoopsCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyLoopsCarouselViewPresenter.onTake(this);
        tappyLoopsCarouselViewPresenter = this.presenter;
        if (tappyLoopsCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyLoopsCarouselViewPresenter.bind(str, list, i);
    }

    public void showPhotoAtIndex(int i) {
        TappyLoopsCarouselViewPresenter tappyLoopsCarouselViewPresenter = this.presenter;
        if (tappyLoopsCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyLoopsCarouselViewPresenter.onShowPhotoAtIndex(i);
        setActivePage(i);
    }

    public void showMedia(@NotNull List<C17251d> list, @NotNull List<C17250a> list2) {
        C2668g.b(list, "videoViewModels");
        C2668g.b(list2, "imageViewModels");
        ((LoopView) _$_findCachedViewById(C14694R.id.loopView)).m57806a(list, list2);
    }

    public void onViewRecycled() {
        TappyLoopsCarouselViewPresenter tappyLoopsCarouselViewPresenter = this.presenter;
        if (tappyLoopsCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyLoopsCarouselViewPresenter.onDrop();
    }

    public void showPageIndicator() {
        TappyPageIndicatorView tappyPageIndicatorView = (TappyPageIndicatorView) _$_findCachedViewById(C14694R.id.tappyLoopsPageIndicatorView);
        C2668g.a(tappyPageIndicatorView, "tappyLoopsPageIndicatorView");
        tappyPageIndicatorView.setVisibility(0);
    }

    public void hidePageIndicator() {
        TappyPageIndicatorView tappyPageIndicatorView = (TappyPageIndicatorView) _$_findCachedViewById(C14694R.id.tappyLoopsPageIndicatorView);
        C2668g.a(tappyPageIndicatorView, "tappyLoopsPageIndicatorView");
        tappyPageIndicatorView.setVisibility(4);
    }

    public void dispatchTapRegionEvent(@NotNull TapRegion tapRegion) {
        C2668g.b(tapRegion, "tapRegion");
        boolean isOverTap = TapRegionDetector.INSTANCE.isOverTap(tapRegion, this.activePage, this.pageCount);
        OnTapListener onTapListener = this.onTapListener;
        if (onTapListener != null) {
            onTapListener.onTap(tapRegion, isOverTap);
        }
    }

    public void setOnImageLoadedListener(@Nullable OnImageLoadedListener onImageLoadedListener) {
        this.onImageLoadedListener = onImageLoadedListener;
    }

    public void setOnPhotoPageChangeListener(@Nullable OnPhotoPageChangeListener onPhotoPageChangeListener) {
        this.onPhotoPageChangeListener = onPhotoPageChangeListener;
    }

    public void setPageCount(int i) {
        this.pageCount = i;
        ((TappyPageIndicatorView) _$_findCachedViewById(C14694R.id.tappyLoopsPageIndicatorView)).setPageCount(i);
    }

    public void setActivePage(int i) {
        this.activePage = i;
        ((TappyPageIndicatorView) _$_findCachedViewById(C14694R.id.tappyLoopsPageIndicatorView)).setActivePage(i);
    }

    public void setOnTapListener(@Nullable OnTapListener onTapListener) {
        this.onTapListener = onTapListener;
    }

    public void setOnOverTapListener(@Nullable OnOverTapListener onOverTapListener) {
        this.onOverTapListener = onOverTapListener;
    }

    public void animateOverTap(@NotNull TapRegion tapRegion, @NotNull View view) {
        float floatValue;
        C2668g.b(tapRegion, "region");
        C2668g.b(view, "targetView");
        if (this.overTapAnimator.isRunning()) {
            Object animatedValue = this.overTapAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            floatValue = ((Float) animatedValue).floatValue();
            this.overTapAnimator.cancel();
        } else {
            floatValue = 0.0f;
        }
        tapRegion = (float) (tapRegion == TapRegion.LEFT ? -2 : 2);
        this.overTapAnimator.setTarget(view);
        this.overTapAnimator.setFloatValues(new float[]{floatValue, tapRegion, 0.0f});
        this.overTapAnimator.start();
    }
}
