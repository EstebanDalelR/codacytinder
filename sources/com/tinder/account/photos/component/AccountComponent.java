package com.tinder.account.photos.component;

import com.tinder.account.photos.CurrentUserPhotosView;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.permissions.IsExternalReadPermissionGranted;
import com.tinder.domain.profile.experiment.LoopsPhase1Experiment;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/account/photos/component/AccountComponent;", "", "inject", "", "view", "Lcom/tinder/account/photos/CurrentUserPhotosView;", "Parent", "account_release"}, k = 1, mv = {1, 1, 10})
@AccountScope
public interface AccountComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/account/photos/component/AccountComponent$Parent;", "", "LoopsPhase1Experiment", "Lcom/tinder/domain/profile/experiment/LoopsPhase1Experiment;", "MaxPhotoExperiment", "Lcom/tinder/domain/profile/experiment/MaxPhotoExperiment;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "isExternalReadPermissionGranted", "Lcom/tinder/common/permissions/IsExternalReadPermissionGranted;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "profilePhotoRepository", "Lcom/tinder/domain/profile/repository/ProfilePhotoRepository;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "account_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        LoopsPhase1Experiment LoopsPhase1Experiment();

        @NotNull
        MaxPhotoExperiment MaxPhotoExperiment();

        @NotNull
        C2630h fireworks();

        @NotNull
        IsExternalReadPermissionGranted isExternalReadPermissionGranted();

        @NotNull
        ProfileLocalRepository profileLocalRepository();

        @NotNull
        ProfilePhotoRepository profilePhotoRepository();

        @NotNull
        ProfileRemoteRepository profileRemoteRepository();
    }

    void inject(@NotNull CurrentUserPhotosView currentUserPhotosView);
}
