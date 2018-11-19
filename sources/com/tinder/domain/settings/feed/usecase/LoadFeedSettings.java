package com.tinder.domain.settings.feed.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.profile.model.ProfileOption.ActivityFeed;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.settings.feed.model.FeedSettings;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/settings/feed/usecase/LoadFeedSettings;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "(Lcom/tinder/domain/profile/repository/ProfileLocalRepository;)V", "defaultFeedSettings", "execute", "Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadFeedSettings implements ObservableResultUseCase<FeedSettings> {
    private final FeedSettings defaultFeedSettings = new FeedSettings(ak.a());
    private final ProfileLocalRepository profileLocalRepository;

    @Inject
    public LoadFeedSettings(@NotNull ProfileLocalRepository profileLocalRepository) {
        C2668g.b(profileLocalRepository, "profileLocalRepository");
        this.profileLocalRepository = profileLocalRepository;
    }

    @NotNull
    public C3959e<FeedSettings> execute() {
        return this.profileLocalRepository.loadProfileOption(ActivityFeed.INSTANCE, this.defaultFeedSettings);
    }
}
