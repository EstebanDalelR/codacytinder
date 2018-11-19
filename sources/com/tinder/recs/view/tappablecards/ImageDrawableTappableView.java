package com.tinder.recs.view.tappablecards;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0592b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tinder.api.ManagerWebServices;
import com.tinder.recs.C14694R;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappablecards.TappableCarouselView.OnOverTapListener;
import com.tinder.recs.view.tappablecards.TappableCarouselView.OnTapListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010)\u001a\u00020\u001bH\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020%H\u0016J\u0010\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u0003H\u0016J\u0012\u00102\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u00103\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u00104\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020\u001bH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/tinder/recs/view/tappablecards/ImageDrawableTappableView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activePage", "", "imageView", "Landroid/widget/ImageView;", "onOverTapListener", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnOverTapListener;", "onTapListener", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView$OnTapListener;", "overTapAnimator", "Landroid/animation/ObjectAnimator;", "pageCount", "pageIndicator", "Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorView;", "progressBar", "Landroid/widget/ProgressBar;", "tapRegionDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "animateOverTap", "", "region", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "targetView", "Landroid/view/View;", "clearImage", "dispatchOverTapEvent", "tapRegion", "dispatchTapRegionEvent", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "getProgressBarDefaultVisibilityState", "hidePageIndicator", "hideProgressBar", "onOverTap", "onTapRegionEvent", "isOverTap", "onTouchEvent", "setActivePage", "setImage", "image", "setOnOverTapListener", "setOnTapListener", "setPageCount", "showPageIndicator", "showProgressBar", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public class ImageDrawableTappableView extends FrameLayout implements TappableCarouselView<Drawable> {
    private HashMap _$_findViewCache;
    private int activePage;
    private final ImageView imageView;
    private OnOverTapListener onOverTapListener;
    private OnTapListener onTapListener;
    private final ObjectAnimator overTapAnimator;
    private int pageCount;
    private TappyPageIndicatorView pageIndicator;
    private final ProgressBar progressBar;
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

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        return true;
    }

    public /* synthetic */ ImageDrawableTappableView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public ImageDrawableTappableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.tapRegionDetector = TapRegionDetector.INSTANCE.create(this, new ImageDrawableTappableView$tapRegionDetector$1(this));
        this.overTapAnimator = new ObjectAnimator();
        context = View.inflate(context, C14694R.layout.view_tappable_photo_carousel, this);
        View findViewById = context.findViewById(C14694R.id.tappable_carousel_progressbar);
        C2668g.a(findViewById, "view.findViewById(R.id.t…ble_carousel_progressbar)");
        this.progressBar = (ProgressBar) findViewById;
        findViewById = context.findViewById(C14694R.id.tappable_carousel_imageview);
        C2668g.a(findViewById, "view.findViewById(R.id.t…pable_carousel_imageview)");
        this.imageView = (ImageView) findViewById;
        context = context.findViewById(C14694R.id.tappable_carousel_imageview_indicator);
        C2668g.a(context, "view.findViewById(R.id.t…usel_imageview_indicator)");
        this.pageIndicator = (TappyPageIndicatorView) context;
        this.overTapAnimator.setProperty(View.ROTATION_Y);
        this.overTapAnimator.setDuration(140);
        this.progressBar.setVisibility(getProgressBarDefaultVisibilityState(attributeSet));
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        this.tapRegionDetector.a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setImage(@NotNull Drawable drawable) {
        C2668g.b(drawable, ManagerWebServices.IG_PARAM_IMAGE);
        this.imageView.setImageDrawable(drawable);
    }

    public void clearImage() {
        this.imageView.setImageDrawable(null);
    }

    public void setOnTapListener(@Nullable OnTapListener onTapListener) {
        this.onTapListener = onTapListener;
    }

    public void setOnOverTapListener(@Nullable OnOverTapListener onOverTapListener) {
        this.onOverTapListener = onOverTapListener;
    }

    public void showProgressBar() {
        this.progressBar.setVisibility(0);
    }

    public void hideProgressBar() {
        this.progressBar.setVisibility(4);
    }

    public void showPageIndicator() {
        this.pageIndicator.setVisibility(0);
    }

    public void hidePageIndicator() {
        this.pageIndicator.setVisibility(8);
    }

    public void setPageCount(int i) {
        this.pageCount = i;
        this.pageIndicator.setPageCount(i);
    }

    public void setActivePage(int i) {
        this.activePage = i;
        this.pageIndicator.setActivePage(i);
    }

    public void dispatchTapRegionEvent(@NotNull TapRegion tapRegion) {
        C2668g.b(tapRegion, "tapRegion");
        onTapRegionEvent(tapRegion, TapRegionDetector.INSTANCE.isOverTap(tapRegion, this.activePage, this.pageCount));
    }

    public void onTapRegionEvent(@NotNull TapRegion tapRegion, boolean z) {
        C2668g.b(tapRegion, "tapRegion");
        OnTapListener onTapListener = this.onTapListener;
        if (onTapListener != null) {
            onTapListener.onTap(tapRegion, z);
        }
    }

    public void dispatchOverTapEvent(@NotNull TapRegion tapRegion) {
        C2668g.b(tapRegion, "tapRegion");
        onOverTap(tapRegion);
    }

    public void onOverTap(@NotNull TapRegion tapRegion) {
        C2668g.b(tapRegion, "tapRegion");
        OnOverTapListener onOverTapListener = this.onOverTapListener;
        if (onOverTapListener != null) {
            onOverTapListener.onOverTap(tapRegion);
        }
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

    private final int getProgressBarDefaultVisibilityState(AttributeSet attributeSet) {
        if (attributeSet != null) {
            Context context = getContext();
            C2668g.a(context, "context");
            attributeSet = context.getTheme().obtainStyledAttributes(attributeSet, C14694R.styleable.TappableCarouselView, 0, 0);
            try {
                if (attributeSet.getBoolean(C14694R.styleable.TappableCarouselView_hideProgressBar, false)) {
                    return 8;
                }
                attributeSet.recycle();
            } finally {
                attributeSet.recycle();
            }
        }
        return 0;
    }
}
