package com.tinder.domain.auth;

import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.feed.DraftRepository;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.message.ReactionSettingsRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.usecase.ClearAllPlaces;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/domain/auth/DeleteUserData;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "lastActivityDateRepository", "Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "reactionSettingsRepository", "Lcom/tinder/domain/message/ReactionSettingsRepository;", "appRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "crashTimeStampGateway", "Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;", "feedRepository", "Lcom/tinder/domain/feed/FeedRepository;", "profileRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "draftRepository", "Lcom/tinder/domain/feed/DraftRepository;", "autoPlayVideoSettingsRepository", "Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "clearAllPlaces", "Lcom/tinder/domain/places/usecase/ClearAllPlaces;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "clearSharedPreferences", "Lcom/tinder/domain/auth/ClearSharedPreferences;", "(Lcom/tinder/domain/meta/gateway/MetaGateway;Lcom/tinder/domain/common/repository/LastActivityDateRepository;Lcom/tinder/domain/message/ReactionSettingsRepository;Lcom/tinder/domain/apprating/AppRatingRepository;Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;Lcom/tinder/domain/feed/FeedRepository;Lcom/tinder/domain/profile/repository/ProfileLocalRepository;Lcom/tinder/domain/feed/DraftRepository;Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;Lcom/tinder/domain/places/usecase/ClearAllPlaces;Lcom/tinder/domain/places/PlacesConfigProvider;Lcom/tinder/domain/auth/ClearSharedPreferences;)V", "execute", "Lrx/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteUserData implements SimpleCompletableUseCase {
    private final AppRatingRepository appRatingRepository;
    private final AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository;
    private final ClearAllPlaces clearAllPlaces;
    private final ClearSharedPreferences clearSharedPreferences;
    private final CrashTimeStampGateway crashTimeStampGateway;
    private final DraftRepository draftRepository;
    private final FeedRepository feedRepository;
    private final LastActivityDateRepository lastActivityDateRepository;
    private final MetaGateway metaGateway;
    private final PlacesConfigProvider placesConfigProvider;
    private final ProfileLocalRepository profileRepository;
    private final ReactionSettingsRepository reactionSettingsRepository;

    @Inject
    public DeleteUserData(@NotNull MetaGateway metaGateway, @NotNull LastActivityDateRepository lastActivityDateRepository, @NotNull ReactionSettingsRepository reactionSettingsRepository, @NotNull AppRatingRepository appRatingRepository, @NotNull CrashTimeStampGateway crashTimeStampGateway, @NotNull FeedRepository feedRepository, @NotNull ProfileLocalRepository profileLocalRepository, @NotNull DraftRepository draftRepository, @NotNull AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository, @NotNull ClearAllPlaces clearAllPlaces, @NotNull PlacesConfigProvider placesConfigProvider, @NotNull ClearSharedPreferences clearSharedPreferences) {
        C2668g.m10309b(metaGateway, "metaGateway");
        C2668g.m10309b(lastActivityDateRepository, "lastActivityDateRepository");
        C2668g.m10309b(reactionSettingsRepository, "reactionSettingsRepository");
        C2668g.m10309b(appRatingRepository, "appRatingRepository");
        C2668g.m10309b(crashTimeStampGateway, "crashTimeStampGateway");
        C2668g.m10309b(feedRepository, "feedRepository");
        C2668g.m10309b(profileLocalRepository, "profileRepository");
        C2668g.m10309b(draftRepository, "draftRepository");
        C2668g.m10309b(autoPlayVideoSettingsRepository, "autoPlayVideoSettingsRepository");
        C2668g.m10309b(clearAllPlaces, "clearAllPlaces");
        C2668g.m10309b(placesConfigProvider, "placesConfigProvider");
        C2668g.m10309b(clearSharedPreferences, "clearSharedPreferences");
        this.metaGateway = metaGateway;
        this.lastActivityDateRepository = lastActivityDateRepository;
        this.reactionSettingsRepository = reactionSettingsRepository;
        this.appRatingRepository = appRatingRepository;
        this.crashTimeStampGateway = crashTimeStampGateway;
        this.feedRepository = feedRepository;
        this.profileRepository = profileLocalRepository;
        this.draftRepository = draftRepository;
        this.autoPlayVideoSettingsRepository = autoPlayVideoSettingsRepository;
        this.clearAllPlaces = clearAllPlaces;
        this.placesConfigProvider = placesConfigProvider;
        this.clearSharedPreferences = clearSharedPreferences;
    }

    @NotNull
    public Completable execute() {
        Object c = Completable.m10374c(this.metaGateway.clear(), RxJavaInteropExtKt.toV1Completable(this.lastActivityDateRepository.clearLastActivityDate()), this.reactionSettingsRepository.clearReactionSettings(), this.appRatingRepository.clearAppRatingPreferences(), this.crashTimeStampGateway.clear(), this.feedRepository.clear(), RxJavaInteropExtKt.toV1Completable(this.profileRepository.clear()), this.draftRepository.clear(), RxJavaInteropExtKt.toV1Completable(this.autoPlayVideoSettingsRepository.clear()), this.clearAllPlaces.execute(), this.placesConfigProvider.clear(), RxJavaInteropExtKt.toV1Completable(this.clearSharedPreferences.invoke()));
        C2668g.m10305a(c, "rx.Completable.mergeDela…V1Completable()\n        )");
        return c;
    }
}
