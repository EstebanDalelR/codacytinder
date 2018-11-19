package com.tinder.domain.profile.repository;

import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.model.settings.TopPhotoSettings;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/profile/repository/ProfilePhotoRepository;", "", "addPendingFacebookPhoto", "Lio/reactivex/Completable;", "pendingFacebookPhoto", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "delete", "profilePhoto", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "observe", "Lio/reactivex/Observable;", "", "observeTopPhotoSettings", "Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "updateOrder", "photo", "upload", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface ProfilePhotoRepository {
    @NotNull
    C3956a addPendingFacebookPhoto(@NotNull PendingFacebookPhoto pendingFacebookPhoto);

    @NotNull
    C3956a delete(@NotNull ProfilePhoto profilePhoto);

    @NotNull
    C3959e<List<ProfilePhoto>> observe();

    @NotNull
    C3959e<TopPhotoSettings> observeTopPhotoSettings();

    @NotNull
    C3956a updateOrder(@NotNull List<? extends ProfilePhoto> list);

    @NotNull
    C3956a upload(@NotNull LocalProfilePhoto localProfilePhoto);
}
