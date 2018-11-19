package com.tinder.recs.data;

import android.graphics.drawable.Drawable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&JH\u0010\r\u001a\u00020\u00032>\u0010\u000e\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014H&J3\u0010\u0015\u001a\u00020\u00032)\u0010\u0016\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H&¨\u0006\u001c"}, d2 = {"Lcom/tinder/recs/data/CarouselViewImageDownloader;", "", "cancelDownloadRequestsIfInProgress", "", "downloadImage", "index", "", "url", "", "isDownloadAlreadyRequested", "", "isImageDownloadInProgress", "isImageDownloaded", "setOnImageLoadedListener", "onImageLoadedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcom/tinder/recs/data/OnRecsImageLoadedListener;", "setOnRecsImageClearedListener", "onRecsImageClearedListener", "Lkotlin/Function1;", "Lcom/tinder/recs/data/OnImageLoadClearListener;", "updatePhotoSize", "width", "height", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface CarouselViewImageDownloader {
    void cancelDownloadRequestsIfInProgress();

    void downloadImage(int i, @NotNull String str);

    boolean isDownloadAlreadyRequested(int i);

    boolean isImageDownloadInProgress(int i);

    boolean isImageDownloaded(int i);

    void setOnImageLoadedListener(@Nullable Function2<? super Integer, ? super Drawable, C15813i> function2);

    void setOnRecsImageClearedListener(@Nullable Function1<? super Integer, C15813i> function1);

    void updatePhotoSize(int i, int i2);
}
