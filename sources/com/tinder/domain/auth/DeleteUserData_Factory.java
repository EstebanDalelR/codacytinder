package com.tinder.domain.auth;

import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.feed.DraftRepository;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.message.ReactionSettingsRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.usecase.ClearAllPlaces;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteUserData_Factory implements Factory<DeleteUserData> {
    private final Provider<AppRatingRepository> appRatingRepositoryProvider;
    private final Provider<AutoPlayVideoSettingsRepository> autoPlayVideoSettingsRepositoryProvider;
    private final Provider<ClearAllPlaces> clearAllPlacesProvider;
    private final Provider<ClearSharedPreferences> clearSharedPreferencesProvider;
    private final Provider<CrashTimeStampGateway> crashTimeStampGatewayProvider;
    private final Provider<DraftRepository> draftRepositoryProvider;
    private final Provider<FeedRepository> feedRepositoryProvider;
    private final Provider<LastActivityDateRepository> lastActivityDateRepositoryProvider;
    private final Provider<MetaGateway> metaGatewayProvider;
    private final Provider<PlacesConfigProvider> placesConfigProvider;
    private final Provider<ProfileLocalRepository> profileRepositoryProvider;
    private final Provider<ReactionSettingsRepository> reactionSettingsRepositoryProvider;

    public DeleteUserData_Factory(Provider<MetaGateway> provider, Provider<LastActivityDateRepository> provider2, Provider<ReactionSettingsRepository> provider3, Provider<AppRatingRepository> provider4, Provider<CrashTimeStampGateway> provider5, Provider<FeedRepository> provider6, Provider<ProfileLocalRepository> provider7, Provider<DraftRepository> provider8, Provider<AutoPlayVideoSettingsRepository> provider9, Provider<ClearAllPlaces> provider10, Provider<PlacesConfigProvider> provider11, Provider<ClearSharedPreferences> provider12) {
        this.metaGatewayProvider = provider;
        this.lastActivityDateRepositoryProvider = provider2;
        this.reactionSettingsRepositoryProvider = provider3;
        this.appRatingRepositoryProvider = provider4;
        this.crashTimeStampGatewayProvider = provider5;
        this.feedRepositoryProvider = provider6;
        this.profileRepositoryProvider = provider7;
        this.draftRepositoryProvider = provider8;
        this.autoPlayVideoSettingsRepositoryProvider = provider9;
        this.clearAllPlacesProvider = provider10;
        this.placesConfigProvider = provider11;
        this.clearSharedPreferencesProvider = provider12;
    }

    public DeleteUserData get() {
        return provideInstance(this.metaGatewayProvider, this.lastActivityDateRepositoryProvider, this.reactionSettingsRepositoryProvider, this.appRatingRepositoryProvider, this.crashTimeStampGatewayProvider, this.feedRepositoryProvider, this.profileRepositoryProvider, this.draftRepositoryProvider, this.autoPlayVideoSettingsRepositoryProvider, this.clearAllPlacesProvider, this.placesConfigProvider, this.clearSharedPreferencesProvider);
    }

    public static DeleteUserData provideInstance(Provider<MetaGateway> provider, Provider<LastActivityDateRepository> provider2, Provider<ReactionSettingsRepository> provider3, Provider<AppRatingRepository> provider4, Provider<CrashTimeStampGateway> provider5, Provider<FeedRepository> provider6, Provider<ProfileLocalRepository> provider7, Provider<DraftRepository> provider8, Provider<AutoPlayVideoSettingsRepository> provider9, Provider<ClearAllPlaces> provider10, Provider<PlacesConfigProvider> provider11, Provider<ClearSharedPreferences> provider12) {
        return new DeleteUserData((MetaGateway) provider.get(), (LastActivityDateRepository) provider2.get(), (ReactionSettingsRepository) provider3.get(), (AppRatingRepository) provider4.get(), (CrashTimeStampGateway) provider5.get(), (FeedRepository) provider6.get(), (ProfileLocalRepository) provider7.get(), (DraftRepository) provider8.get(), (AutoPlayVideoSettingsRepository) provider9.get(), (ClearAllPlaces) provider10.get(), (PlacesConfigProvider) provider11.get(), (ClearSharedPreferences) provider12.get());
    }

    public static DeleteUserData_Factory create(Provider<MetaGateway> provider, Provider<LastActivityDateRepository> provider2, Provider<ReactionSettingsRepository> provider3, Provider<AppRatingRepository> provider4, Provider<CrashTimeStampGateway> provider5, Provider<FeedRepository> provider6, Provider<ProfileLocalRepository> provider7, Provider<DraftRepository> provider8, Provider<AutoPlayVideoSettingsRepository> provider9, Provider<ClearAllPlaces> provider10, Provider<PlacesConfigProvider> provider11, Provider<ClearSharedPreferences> provider12) {
        return new DeleteUserData_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static DeleteUserData newDeleteUserData(MetaGateway metaGateway, LastActivityDateRepository lastActivityDateRepository, ReactionSettingsRepository reactionSettingsRepository, AppRatingRepository appRatingRepository, CrashTimeStampGateway crashTimeStampGateway, FeedRepository feedRepository, ProfileLocalRepository profileLocalRepository, DraftRepository draftRepository, AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository, ClearAllPlaces clearAllPlaces, PlacesConfigProvider placesConfigProvider, ClearSharedPreferences clearSharedPreferences) {
        return new DeleteUserData(metaGateway, lastActivityDateRepository, reactionSettingsRepository, appRatingRepository, crashTimeStampGateway, feedRepository, profileLocalRepository, draftRepository, autoPlayVideoSettingsRepository, clearAllPlaces, placesConfigProvider, clearSharedPreferences);
    }
}
