package com.tinder.recsads.model;

import android.graphics.drawable.Drawable;
import com.tinder.domain.common.model.Photo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\b\u0010\u000f\u001a\u00020\u0003H&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fH&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/tinder/recsads/model/BrandedProfileCardAd;", "", "bio", "", "body", "clickthroughText", "clickthroughUrl", "destroy", "", "endDate", "Lorg/joda/time/DateTime;", "imageDrawables", "", "Landroid/graphics/drawable/Drawable;", "images", "lineItemId", "profileImageUrl", "profilePhotos", "Lcom/tinder/domain/common/model/Photo;", "subtitle", "title", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public interface BrandedProfileCardAd {
    @NotNull
    String bio();

    @NotNull
    String body();

    @NotNull
    String clickthroughText();

    @NotNull
    String clickthroughUrl();

    void destroy();

    @NotNull
    DateTime endDate();

    @NotNull
    List<Drawable> imageDrawables();

    @NotNull
    List<String> images();

    @NotNull
    String lineItemId();

    @Nullable
    String profileImageUrl();

    @NotNull
    List<Photo> profilePhotos();

    @NotNull
    String subtitle();

    @NotNull
    String title();
}
