package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.model.settings.TopPhotoSettings;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos.Result;
import io.reactivex.functions.BiFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/usecase/ObserveProfilePhotos$Result;", "topPhotoSettings", "Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "photos", "", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "apply"}, k = 3, mv = {1, 1, 10})
final class ObserveProfilePhotos$execute$1<T1, T2, R> implements BiFunction<TopPhotoSettings, List<? extends ProfilePhoto>, Result> {
    public static final ObserveProfilePhotos$execute$1 INSTANCE = new ObserveProfilePhotos$execute$1();

    ObserveProfilePhotos$execute$1() {
    }

    @NotNull
    public final Result apply(@NotNull TopPhotoSettings topPhotoSettings, @NotNull List<? extends ProfilePhoto> list) {
        C2668g.b(topPhotoSettings, "topPhotoSettings");
        C2668g.b(list, "photos");
        return new Result(list, topPhotoSettings.getTopPhotoId());
    }
}
