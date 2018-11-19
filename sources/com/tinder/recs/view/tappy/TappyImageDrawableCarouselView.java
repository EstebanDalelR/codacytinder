package com.tinder.recs.view.tappy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.common.model.Photo;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter;
import com.tinder.recs.view.tappablecards.ImageDrawableTappableView;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappy.TappyCarouselView.OnImageLoadedListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H\u0016J \u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\"H\u0016J(\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"H\u0014J\u0018\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001bH\u0016J.\u00105\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\"H\u0002J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0012\u0010:\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010;\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010<\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006="}, d2 = {"Lcom/tinder/recs/view/tappy/TappyImageDrawableCarouselView;", "Lcom/tinder/recs/view/tappablecards/ImageDrawableTappableView;", "Lcom/tinder/recs/view/tappy/TappyCarouselView;", "Landroid/graphics/drawable/Drawable;", "Lcom/tinder/recs/view/tappy/TappyCarouselViewTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onImageLoadedListener", "Lcom/tinder/recs/view/tappy/TappyCarouselView$OnImageLoadedListener;", "onPhotoPageChangeListener", "Lcom/tinder/base/view/listener/OnPhotoPageChangeListener;", "photoUrlFactory", "Lcom/tinder/recs/RecsPhotoUrlFactory;", "getPhotoUrlFactory$Tinder_release", "()Lcom/tinder/recs/RecsPhotoUrlFactory;", "setPhotoUrlFactory$Tinder_release", "(Lcom/tinder/recs/RecsPhotoUrlFactory;)V", "presenter", "Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter;)V", "bind", "", "userId", "", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "index", "", "clearImageDrawable", "dispatchImageLoaded", "drawable", "dispatchPageChange", "newPosition", "photoUrl", "totalSize", "onSizeChanged", "w", "h", "oldw", "oldh", "onTapRegionEvent", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "isOverTap", "", "onViewRecycled", "photoUrlForSize", "photoIndex", "width", "height", "setImageDrawable", "setOnImageLoadedListener", "setOnPhotoPageChangeListener", "showPhotoAtIndex", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyImageDrawableCarouselView extends ImageDrawableTappableView implements TappyCarouselView<Drawable>, TappyCarouselViewTarget {
    private HashMap _$_findViewCache;
    private OnImageLoadedListener onImageLoadedListener;
    private OnPhotoPageChangeListener onPhotoPageChangeListener;
    @Inject
    @NotNull
    public RecsPhotoUrlFactory photoUrlFactory;
    @Inject
    @NotNull
    public TappyImageDrawableCarouselViewPresenter presenter;

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

    public TappyImageDrawableCarouselView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
    }

    @NotNull
    public final TappyImageDrawableCarouselViewPresenter getPresenter$Tinder_release() {
        TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter = this.presenter;
        if (tappyImageDrawableCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        return tappyImageDrawableCarouselViewPresenter;
    }

    public final void setPresenter$Tinder_release(@NotNull TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter) {
        C2668g.b(tappyImageDrawableCarouselViewPresenter, "<set-?>");
        this.presenter = tappyImageDrawableCarouselViewPresenter;
    }

    @NotNull
    public final RecsPhotoUrlFactory getPhotoUrlFactory$Tinder_release() {
        RecsPhotoUrlFactory recsPhotoUrlFactory = this.photoUrlFactory;
        if (recsPhotoUrlFactory == null) {
            C2668g.b("photoUrlFactory");
        }
        return recsPhotoUrlFactory;
    }

    public final void setPhotoUrlFactory$Tinder_release(@NotNull RecsPhotoUrlFactory recsPhotoUrlFactory) {
        C2668g.b(recsPhotoUrlFactory, "<set-?>");
        this.photoUrlFactory = recsPhotoUrlFactory;
    }

    public void bind(@NotNull String str, @NotNull List<? extends Photo> list, int i) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "photos");
        TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter = this.presenter;
        if (tappyImageDrawableCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, tappyImageDrawableCarouselViewPresenter);
        Iterable<Photo> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        int i2 = 0;
        for (Photo photo : iterable) {
            int i3 = i2 + 1;
            arrayList.add(photoUrlForSize(list, i2, getWidth(), getHeight()));
            i2 = i3;
        }
        List list2 = (List) arrayList;
        list = this.presenter;
        if (list == null) {
            C2668g.b("presenter");
        }
        list.bind(str, list2, i);
    }

    public void onViewRecycled() {
        TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter = this.presenter;
        if (tappyImageDrawableCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyImageDrawableCarouselViewPresenter.handleViewRecycled();
        Deadshot.drop(this);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = this.presenter;
        if (i3 == 0) {
            C2668g.b("presenter");
        }
        i3.updateSize(i, i2);
    }

    public void showPhotoAtIndex(int i) {
        TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter = this.presenter;
        if (tappyImageDrawableCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyImageDrawableCarouselViewPresenter.handleShowPhotoAtIndex(i);
        setActivePage(i);
    }

    public void setOnPhotoPageChangeListener(@Nullable OnPhotoPageChangeListener onPhotoPageChangeListener) {
        this.onPhotoPageChangeListener = onPhotoPageChangeListener;
    }

    public void setOnImageLoadedListener(@Nullable OnImageLoadedListener onImageLoadedListener) {
        this.onImageLoadedListener = onImageLoadedListener;
    }

    public void dispatchPageChange(int i, @NotNull String str, int i2) {
        C2668g.b(str, "photoUrl");
        OnPhotoPageChangeListener onPhotoPageChangeListener = this.onPhotoPageChangeListener;
        if (onPhotoPageChangeListener != null) {
            onPhotoPageChangeListener.onPhotoPageChange(str, i, i2);
        }
        str = this.presenter;
        if (str == null) {
            C2668g.b("presenter");
        }
        str.handleShowPhotoAtIndex(i);
    }

    public void dispatchImageLoaded(@NotNull Drawable drawable, int i) {
        C2668g.b(drawable, "drawable");
        OnImageLoadedListener onImageLoadedListener = this.onImageLoadedListener;
        if (onImageLoadedListener != null) {
            onImageLoadedListener.onImageLoaded(drawable, i);
        }
    }

    public void onTapRegionEvent(@NotNull TapRegion tapRegion, boolean z) {
        C2668g.b(tapRegion, "tapRegion");
        super.onTapRegionEvent(tapRegion, z);
        TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter = this.presenter;
        if (tappyImageDrawableCarouselViewPresenter == null) {
            C2668g.b("presenter");
        }
        tappyImageDrawableCarouselViewPresenter.handleTapRegionEvent(tapRegion, z);
    }

    public void setImageDrawable(@NotNull Drawable drawable) {
        C2668g.b(drawable, "drawable");
        setImage(drawable);
    }

    public void clearImageDrawable() {
        clearImage();
    }

    private final String photoUrlForSize(List<? extends Photo> list, int i, int i2, int i3) {
        if (i > list.size() - 1) {
            return "";
        }
        RecsPhotoUrlFactory recsPhotoUrlFactory = this.photoUrlFactory;
        if (recsPhotoUrlFactory == null) {
            C2668g.b("photoUrlFactory");
        }
        list = recsPhotoUrlFactory.createUrl((Photo) list.get(i), i2, i3);
        C2668g.a(list, "photoUrlFactory.createUr…otoIndex], width, height)");
        return list;
    }
}
