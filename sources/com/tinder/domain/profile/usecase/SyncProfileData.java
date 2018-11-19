package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileOption.AccountInfo;
import com.tinder.domain.profile.model.ProfileOption.AccountSettings;
import com.tinder.domain.profile.model.ProfileOption.ActivityFeed;
import com.tinder.domain.profile.model.ProfileOption.EmailSettings;
import com.tinder.domain.profile.model.ProfileOption.Facebook;
import com.tinder.domain.profile.model.ProfileOption.Instagram;
import com.tinder.domain.profile.model.ProfileOption.Interests;
import com.tinder.domain.profile.model.ProfileOption.Likes;
import com.tinder.domain.profile.model.ProfileOption.Onboarding;
import com.tinder.domain.profile.model.ProfileOption.Places;
import com.tinder.domain.profile.model.ProfileOption.PlusControl;
import com.tinder.domain.profile.model.ProfileOption.Products;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.ProfileOption.SmartPhoto;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.model.ProfileOption.TopPhoto;
import com.tinder.domain.profile.model.ProfileOption.Tutorials;
import com.tinder.domain.profile.model.ProfileOption.User;
import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import io.reactivex.C3956a;
import io.reactivex.annotations.Experimental;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Experimental
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/profile/usecase/SyncProfileData;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "(Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SyncProfileData implements CompletableUseCase<ProfileDataRequest> {
    @NotNull
    @JvmField
    public static final ProfileDataRequest ALL_PROFILE_OPTIONS_SYNC_REQUEST = ProfileDataRequest.Companion.builder().with(Purchase.INSTANCE).with(SuperLikes.INSTANCE).with(Products.INSTANCE).with(Tutorials.INSTANCE).with(ActivityFeed.INSTANCE).with(PlusControl.INSTANCE).with(Likes.INSTANCE).with(Places.INSTANCE).with(AccountInfo.INSTANCE).with(AccountSettings.INSTANCE).with(WebProfile.INSTANCE).with(SmartPhoto.INSTANCE).with(TopPhoto.INSTANCE).with(User.INSTANCE).with(Facebook.INSTANCE).with(Interests.INSTANCE).with(Instagram.INSTANCE).with(EmailSettings.INSTANCE).with(Onboarding.INSTANCE).build();
    public static final Companion Companion = new Companion();
    private final ProfileRemoteRepository profileRemoteRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/profile/usecase/SyncProfileData$Companion;", "", "()V", "ALL_PROFILE_OPTIONS_SYNC_REQUEST", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @Inject
    public SyncProfileData(@NotNull ProfileRemoteRepository profileRemoteRepository) {
        C2668g.b(profileRemoteRepository, "profileRemoteRepository");
        this.profileRemoteRepository = profileRemoteRepository;
    }

    @NotNull
    public C3956a execute(@NotNull ProfileDataRequest profileDataRequest) {
        C2668g.b(profileDataRequest, "request");
        return this.profileRemoteRepository.fetch(profileDataRequest);
    }
}
