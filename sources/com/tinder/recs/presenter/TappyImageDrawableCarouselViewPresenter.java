package com.tinder.recs.presenter;

import android.graphics.drawable.Drawable;
import com.tinder.api.ManagerWebServices;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.recs.data.CarouselViewImageDownloader;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.exception.UnexpectedImageIndexException;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappy.TappyCarouselViewTarget;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002\u0011\u0014\u0018\u00002\u00020\u0001:\u00014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u001cJ\u0010\u0010+\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0018\u0010-\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0016\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter;", "", "carouselViewImageDownloader", "Lcom/tinder/recs/data/CarouselViewImageDownloader;", "activePhotoIndexProvider", "Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;", "maxPhotosAllowed", "", "currentDisplayedImageIndexHolder", "Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$CurrentDisplayedImageIndexHolder;", "(Lcom/tinder/recs/data/CarouselViewImageDownloader;Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;ILcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$CurrentDisplayedImageIndexHolder;)V", "currentIndex", "displayedPhotoUrl", "", "getDisplayedPhotoUrl", "()Ljava/lang/String;", "onImageClearListener", "com/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$onImageClearListener$1", "Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$onImageClearListener$1;", "onImageLoadListener", "com/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1", "Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1;", "photoUrls", "", "target", "Lcom/tinder/recs/view/tappy/TappyCarouselViewTarget;", "userId", "bind", "", "dispatchPageChange", "newPosition", "downloadAllImagesIfNeeded", "downloadImage", "index", "url", "fetchAdjacentImages", "handleShowPhotoAtIndex", "handleTapRegionEvent", "tapRegion", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "isOverTap", "", "handleViewRecycled", "isValidIndex", "onImageLoadCleared", "onImageLoaded", "drawable", "Landroid/graphics/drawable/Drawable;", "showPhotoAtIndex", "updateSize", "width", "height", "CurrentDisplayedImageIndexHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyImageDrawableCarouselViewPresenter {
    private final UserRecActivePhotoIndexProvider activePhotoIndexProvider;
    private final CarouselViewImageDownloader carouselViewImageDownloader;
    private final CurrentDisplayedImageIndexHolder currentDisplayedImageIndexHolder;
    private int currentIndex;
    private final int maxPhotosAllowed;
    private final TappyImageDrawableCarouselViewPresenter$onImageClearListener$1 onImageClearListener = new TappyImageDrawableCarouselViewPresenter$onImageClearListener$1(this);
    private final TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1 onImageLoadListener = new TappyImageDrawableCarouselViewPresenter$onImageLoadListener$1(this);
    private List<String> photoUrls;
    @DeadshotTarget
    @Nullable
    @JvmField
    public TappyCarouselViewTarget target;
    private String userId;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tinder/recs/presenter/TappyImageDrawableCarouselViewPresenter$CurrentDisplayedImageIndexHolder;", "", "()V", "currentDisplayedImageIndex", "", "getCurrentDisplayedImageIndex", "()I", "setCurrentDisplayedImageIndex", "(I)V", "reset", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class CurrentDisplayedImageIndexHolder {
        private int currentDisplayedImageIndex = Integer.MIN_VALUE;

        public final int getCurrentDisplayedImageIndex() {
            return this.currentDisplayedImageIndex;
        }

        public final void setCurrentDisplayedImageIndex(int i) {
            this.currentDisplayedImageIndex = i;
        }

        public final void reset() {
            this.currentDisplayedImageIndex = Integer.MIN_VALUE;
        }
    }

    @Inject
    public TappyImageDrawableCarouselViewPresenter(@NotNull CarouselViewImageDownloader carouselViewImageDownloader, @NotNull UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider, int i, @NotNull CurrentDisplayedImageIndexHolder currentDisplayedImageIndexHolder) {
        C2668g.b(carouselViewImageDownloader, "carouselViewImageDownloader");
        C2668g.b(userRecActivePhotoIndexProvider, "activePhotoIndexProvider");
        C2668g.b(currentDisplayedImageIndexHolder, "currentDisplayedImageIndexHolder");
        this.carouselViewImageDownloader = carouselViewImageDownloader;
        this.activePhotoIndexProvider = userRecActivePhotoIndexProvider;
        this.maxPhotosAllowed = i;
        this.currentDisplayedImageIndexHolder = currentDisplayedImageIndexHolder;
    }

    public final void updateSize(int i, int i2) {
        this.carouselViewImageDownloader.updatePhotoSize(i, i2);
    }

    public final void bind(@NotNull String str, @NotNull List<String> list, int i) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(list, "photoUrls");
        TappyCarouselViewTarget tappyCarouselViewTarget = this.target;
        if (tappyCarouselViewTarget != null) {
            tappyCarouselViewTarget.showProgressBar();
        }
        this.carouselViewImageDownloader.cancelDownloadRequestsIfInProgress();
        this.carouselViewImageDownloader.setOnImageLoadedListener(this.onImageLoadListener);
        this.carouselViewImageDownloader.setOnRecsImageClearedListener(this.onImageClearListener);
        this.photoUrls = list;
        this.userId = str;
        this.currentIndex = i;
        fetchAdjacentImages(i);
    }

    public final void handleShowPhotoAtIndex(int i) {
        if (i != this.currentIndex) {
            showPhotoAtIndex(i);
        }
    }

    @NotNull
    public final String getDisplayedPhotoUrl() {
        List list = this.photoUrls;
        if (list == null) {
            C2668g.b("photoUrls");
        }
        return (String) list.get(this.currentIndex);
    }

    public final void handleTapRegionEvent(@NotNull TapRegion tapRegion, boolean z) {
        C2668g.b(tapRegion, "tapRegion");
        if (z) {
            z = this.target;
            if (z) {
                z.dispatchOverTapEvent(tapRegion);
                return;
            }
            return;
        }
        downloadAllImagesIfNeeded();
        dispatchPageChange(this.currentIndex + (tapRegion == TapRegion.LEFT ? -1 : true));
    }

    public final void handleViewRecycled() {
        TappyCarouselViewTarget tappyCarouselViewTarget = this.target;
        if (tappyCarouselViewTarget != null) {
            tappyCarouselViewTarget.clearImageDrawable();
        }
        tappyCarouselViewTarget = this.target;
        if (tappyCarouselViewTarget != null) {
            tappyCarouselViewTarget.hideProgressBar();
        }
        this.carouselViewImageDownloader.setOnImageLoadedListener(null);
        this.carouselViewImageDownloader.setOnRecsImageClearedListener(null);
        this.carouselViewImageDownloader.cancelDownloadRequestsIfInProgress();
        this.currentDisplayedImageIndexHolder.reset();
    }

    private final boolean isValidIndex(int i) {
        if (i >= 0) {
            List list = this.photoUrls;
            if (list == null) {
                C2668g.b("photoUrls");
            }
            if (i < Math.min(list.size(), this.maxPhotosAllowed)) {
                return true;
            }
        }
        return false;
    }

    private final void fetchAdjacentImages(int i) {
        int i2 = i - 1;
        i++;
        if (i2 <= i) {
            while (true) {
                if (isValidIndex(i2)) {
                    List list = this.photoUrls;
                    if (list == null) {
                        C2668g.b("photoUrls");
                    }
                    downloadImage(i2, (String) list.get(i2));
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void downloadAllImagesIfNeeded() {
        List list = this.photoUrls;
        if (list == null) {
            C2668g.b("photoUrls");
        }
        int min = Math.min(list.size(), this.maxPhotosAllowed);
        for (int i = 0; i < min; i++) {
            if (!this.carouselViewImageDownloader.isDownloadAlreadyRequested(i)) {
                List list2 = this.photoUrls;
                if (list2 == null) {
                    C2668g.b("photoUrls");
                }
                downloadImage(i, (String) list2.get(i));
            }
        }
    }

    private final void showPhotoAtIndex(int i) {
        if (isValidIndex(i)) {
            this.currentIndex = i;
            UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider = this.activePhotoIndexProvider;
            String str = this.userId;
            if (str == null) {
                C2668g.b(ManagerWebServices.PARAM_USER_ID);
            }
            userRecActivePhotoIndexProvider.updateActivePhotoIndex(str, this.currentIndex);
            if (!this.carouselViewImageDownloader.isImageDownloaded(i)) {
                TappyCarouselViewTarget tappyCarouselViewTarget = this.target;
                if (tappyCarouselViewTarget != null) {
                    tappyCarouselViewTarget.clearImageDrawable();
                    tappyCarouselViewTarget.showProgressBar();
                    this.currentDisplayedImageIndexHolder.reset();
                }
            }
            if (!this.carouselViewImageDownloader.isImageDownloadInProgress(i)) {
                List list = this.photoUrls;
                if (list == null) {
                    C2668g.b("photoUrls");
                }
                downloadImage(i, (String) list.get(i));
            }
            return;
        }
        List list2 = this.photoUrls;
        if (list2 == null) {
            C2668g.b("photoUrls");
        }
        C0001a.b(new UnexpectedImageIndexException(i, list2.size()));
    }

    private final void downloadImage(int i, String str) {
        this.carouselViewImageDownloader.downloadImage(i, str);
    }

    private final void dispatchPageChange(int i) {
        if (isValidIndex(i)) {
            TappyCarouselViewTarget tappyCarouselViewTarget = this.target;
            if (tappyCarouselViewTarget != null) {
                List list = this.photoUrls;
                if (list == null) {
                    C2668g.b("photoUrls");
                }
                String str = (String) list.get(i);
                List list2 = this.photoUrls;
                if (list2 == null) {
                    C2668g.b("photoUrls");
                }
                tappyCarouselViewTarget.dispatchPageChange(i, str, list2.size());
            }
        }
    }

    private final void onImageLoaded(int i, Drawable drawable) {
        if (i == this.currentIndex) {
            this.currentDisplayedImageIndexHolder.setCurrentDisplayedImageIndex(i);
            TappyCarouselViewTarget tappyCarouselViewTarget = this.target;
            if (tappyCarouselViewTarget != null) {
                tappyCarouselViewTarget.setImageDrawable(drawable);
                tappyCarouselViewTarget.hideProgressBar();
                tappyCarouselViewTarget.dispatchImageLoaded(drawable, i);
            }
        }
    }

    private final void onImageLoadCleared(int i) {
        if (i == this.currentDisplayedImageIndexHolder.getCurrentDisplayedImageIndex()) {
            this.currentDisplayedImageIndexHolder.reset();
            i = this.target;
            if (i != 0) {
                i.clearImageDrawable();
                i.showProgressBar();
            }
        }
    }
}
