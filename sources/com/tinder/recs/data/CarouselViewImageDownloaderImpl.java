package com.tinder.recs.data;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import com.bumptech.glide.request.target.Target;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002*+B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005H\u0002JH\u0010'\u001a\u00020\u00102>\u0010\t\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nj\u0004\u0018\u0001`\u0011H\u0016J3\u0010(\u001a\u00020\u00102)\u0010\u0012\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000RF\u0010\t\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nj\u0004\u0018\u0001`\u0011X\u000e¢\u0006\u0002\n\u0000R1\u0010\u0012\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u00000\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006,"}, d2 = {"Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl;", "Lcom/tinder/recs/data/CarouselViewImageDownloader;", "downloadRequestManager", "Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl$DownloadRequestManager;", "maxTargetCount", "", "downloadStatus", "", "(Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl$DownloadRequestManager;I[I)V", "onImageLoadedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "Landroid/graphics/drawable/Drawable;", "drawable", "", "Lcom/tinder/recs/data/OnRecsImageLoadedListener;", "onRecsImageClearedListener", "Lkotlin/Function1;", "Lcom/tinder/recs/data/OnImageLoadClearListener;", "prefetchGlideTargets", "", "Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl$PrefetchTarget;", "[Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl$PrefetchTarget;", "cancelDownloadRequestsIfInProgress", "createGlideTargetsIfNeeded", "width", "height", "downloadImage", "url", "", "isDownloadAlreadyRequested", "", "isImageDownloadInProgress", "isImageDownloaded", "setClear", "setDownloaded", "setDownloading", "setOnImageLoadedListener", "setOnRecsImageClearedListener", "updatePhotoSize", "DownloadRequestManager", "PrefetchTarget", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class CarouselViewImageDownloaderImpl implements CarouselViewImageDownloader {
    private final DownloadRequestManager downloadRequestManager;
    private final int[] downloadStatus;
    private final int maxTargetCount;
    private Function2<? super Integer, ? super Drawable, C15813i> onImageLoadedListener;
    private Function1<? super Integer, C15813i> onRecsImageClearedListener;
    private final PrefetchTarget[] prefetchGlideTargets;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl$DownloadRequestManager;", "", "requestManager", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "clearTarget", "", "target", "Lcom/bumptech/glide/request/target/Target;", "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;", "loadInTarget", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class DownloadRequestManager {
        private final RequestManager requestManager;

        public DownloadRequestManager(@NotNull RequestManager requestManager) {
            C2668g.b(requestManager, "requestManager");
            this.requestManager = requestManager;
        }

        public final void loadInTarget(@NotNull String str, @NotNull Target<C1041b> target) {
            C2668g.b(str, "url");
            C2668g.b(target, "target");
            this.requestManager.a(str).a(DiskCacheStrategy.SOURCE).b(target);
        }

        public final void clearTarget(@NotNull Target<C1041b> target) {
            C2668g.b(target, "target");
            C0994i.a(target);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0013H\u0016R\u0014\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl$PrefetchTarget;", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;", "targetPosition", "", "width", "height", "(Lcom/tinder/recs/data/CarouselViewImageDownloaderImpl;III)V", "getHeight$Tinder_release", "()I", "getTargetPosition$Tinder_release", "getWidth$Tinder_release", "onLoadCleared", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "drawable", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private final class PrefetchTarget extends C4330g<C1041b> {
        private final int height;
        private final int targetPosition;
        private final int width;

        public PrefetchTarget(int i, int i2, int i3) {
            super(i2, i3);
            this.targetPosition = i;
            this.width = i2;
            this.height = i3;
        }

        public final int getTargetPosition$Tinder_release() {
            return this.targetPosition;
        }

        public final int getWidth$Tinder_release() {
            return this.width;
        }

        public final int getHeight$Tinder_release() {
            return this.height;
        }

        public void onResourceReady(@NotNull C1041b c1041b, @Nullable GlideAnimation<? super C1041b> glideAnimation) {
            C2668g.b(c1041b, "drawable");
            CarouselViewImageDownloaderImpl.this.setDownloaded(this.targetPosition);
            glideAnimation = CarouselViewImageDownloaderImpl.this.onImageLoadedListener;
            if (glideAnimation != null) {
                C15813i c15813i = (C15813i) glideAnimation.invoke(Integer.valueOf(this.targetPosition), c1041b);
            }
        }

        public void onLoadCleared(@Nullable Drawable drawable) {
            CarouselViewImageDownloaderImpl.this.setClear(this.targetPosition);
            drawable = CarouselViewImageDownloaderImpl.this.onRecsImageClearedListener;
            if (drawable != null) {
                C15813i c15813i = (C15813i) drawable.invoke(Integer.valueOf(this.targetPosition));
            }
        }
    }

    @Inject
    public CarouselViewImageDownloaderImpl(@NotNull DownloadRequestManager downloadRequestManager, int i, @NotNull int[] iArr) {
        C2668g.b(downloadRequestManager, "downloadRequestManager");
        C2668g.b(iArr, "downloadStatus");
        this.downloadRequestManager = downloadRequestManager;
        this.maxTargetCount = i;
        this.downloadStatus = iArr;
        this.onRecsImageClearedListener = (Function1) CarouselViewImageDownloaderImpl$onRecsImageClearedListener$1.INSTANCE;
        downloadRequestManager = new PrefetchTarget[this.maxTargetCount];
        i = downloadRequestManager.length;
        for (iArr = null; iArr < i; iArr++) {
            downloadRequestManager[iArr] = new PrefetchTarget(iArr, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        this.prefetchGlideTargets = downloadRequestManager;
    }

    @Inject
    public /* synthetic */ CarouselViewImageDownloaderImpl(DownloadRequestManager downloadRequestManager, int i, int[] iArr, int i2, C15823e c15823e) {
        if ((i2 & 4) != 0) {
            iArr = new int[i];
        }
        this(downloadRequestManager, i, iArr);
    }

    public void updatePhotoSize(int i, int i2) {
        createGlideTargetsIfNeeded(i, i2);
    }

    public void downloadImage(int i, @NotNull String str) {
        C2668g.b(str, "url");
        setDownloading(i);
        this.downloadRequestManager.loadInTarget(str, (Target) this.prefetchGlideTargets[i]);
    }

    public void cancelDownloadRequestsIfInProgress() {
        int length = this.prefetchGlideTargets.length;
        for (int i = 0; i < length; i++) {
            setClear(i);
            this.downloadRequestManager.clearTarget(this.prefetchGlideTargets[i]);
        }
    }

    public void setOnImageLoadedListener(@Nullable Function2<? super Integer, ? super Drawable, C15813i> function2) {
        this.onImageLoadedListener = function2;
    }

    public void setOnRecsImageClearedListener(@Nullable Function1<? super Integer, C15813i> function1) {
        this.onRecsImageClearedListener = function1;
    }

    public boolean isDownloadAlreadyRequested(int i) {
        if (!isImageDownloadInProgress(i)) {
            if (isImageDownloaded(i) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isImageDownloaded(int i) {
        return this.downloadStatus[i] == 2;
    }

    public boolean isImageDownloadInProgress(int i) {
        return this.downloadStatus[i] == 1;
    }

    private final void setDownloaded(int i) {
        this.downloadStatus[i] = 2;
    }

    private final void setDownloading(int i) {
        this.downloadStatus[i] = 1;
    }

    private final void setClear(int i) {
        this.downloadStatus[i] = 0;
    }

    private final void createGlideTargetsIfNeeded(int i, int i2) {
        int length = this.prefetchGlideTargets.length;
        for (int i3 = 0; i3 < length; i3++) {
            PrefetchTarget prefetchTarget = this.prefetchGlideTargets[i3];
            if (prefetchTarget.getHeight$Tinder_release() != i2 || prefetchTarget.getWidth$Tinder_release() != i) {
                this.prefetchGlideTargets[i3] = new PrefetchTarget(i3, i, i2);
            }
        }
    }
}
