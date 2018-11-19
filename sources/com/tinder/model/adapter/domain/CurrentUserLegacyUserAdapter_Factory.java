package com.tinder.model.adapter.domain;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class CurrentUserLegacyUserAdapter_Factory implements Factory<CurrentUserLegacyUserAdapter> {
    private final Provider<BadgeLegacyBadgeAdapter> badgeAdapterProvider;
    private final Provider<GenderLegacyUserAdapter> genderAdapterProvider;
    private final Provider<InstagramInstagramDataSetAdapter> instagramAdapterProvider;
    private final Provider<JobLegacyJobAdapter> jobAdapterProvider;
    private final Provider<PhotoProfilePhotoAdapter> photoAdapterProvider;
    private final Provider<SchoolLegacySchoolAdapter> schoolAdapterProvider;
    private final Provider<SpotifyArtistLegacyArtistAdapter> spotifyTopArtistAdapterProvider;
    private final Provider<SpotifyTrackSearchTrackAdapter> spotifyTrackAdapterProvider;

    public CurrentUserLegacyUserAdapter_Factory(Provider<BadgeLegacyBadgeAdapter> provider, Provider<GenderLegacyUserAdapter> provider2, Provider<PhotoProfilePhotoAdapter> provider3, Provider<JobLegacyJobAdapter> provider4, Provider<SchoolLegacySchoolAdapter> provider5, Provider<InstagramInstagramDataSetAdapter> provider6, Provider<SpotifyArtistLegacyArtistAdapter> provider7, Provider<SpotifyTrackSearchTrackAdapter> provider8) {
        this.badgeAdapterProvider = provider;
        this.genderAdapterProvider = provider2;
        this.photoAdapterProvider = provider3;
        this.jobAdapterProvider = provider4;
        this.schoolAdapterProvider = provider5;
        this.instagramAdapterProvider = provider6;
        this.spotifyTopArtistAdapterProvider = provider7;
        this.spotifyTrackAdapterProvider = provider8;
    }

    public CurrentUserLegacyUserAdapter get() {
        return provideInstance(this.badgeAdapterProvider, this.genderAdapterProvider, this.photoAdapterProvider, this.jobAdapterProvider, this.schoolAdapterProvider, this.instagramAdapterProvider, this.spotifyTopArtistAdapterProvider, this.spotifyTrackAdapterProvider);
    }

    public static CurrentUserLegacyUserAdapter provideInstance(Provider<BadgeLegacyBadgeAdapter> provider, Provider<GenderLegacyUserAdapter> provider2, Provider<PhotoProfilePhotoAdapter> provider3, Provider<JobLegacyJobAdapter> provider4, Provider<SchoolLegacySchoolAdapter> provider5, Provider<InstagramInstagramDataSetAdapter> provider6, Provider<SpotifyArtistLegacyArtistAdapter> provider7, Provider<SpotifyTrackSearchTrackAdapter> provider8) {
        return new CurrentUserLegacyUserAdapter((BadgeLegacyBadgeAdapter) provider.get(), (GenderLegacyUserAdapter) provider2.get(), (PhotoProfilePhotoAdapter) provider3.get(), (JobLegacyJobAdapter) provider4.get(), (SchoolLegacySchoolAdapter) provider5.get(), (InstagramInstagramDataSetAdapter) provider6.get(), (SpotifyArtistLegacyArtistAdapter) provider7.get(), (SpotifyTrackSearchTrackAdapter) provider8.get());
    }

    public static CurrentUserLegacyUserAdapter_Factory create(Provider<BadgeLegacyBadgeAdapter> provider, Provider<GenderLegacyUserAdapter> provider2, Provider<PhotoProfilePhotoAdapter> provider3, Provider<JobLegacyJobAdapter> provider4, Provider<SchoolLegacySchoolAdapter> provider5, Provider<InstagramInstagramDataSetAdapter> provider6, Provider<SpotifyArtistLegacyArtistAdapter> provider7, Provider<SpotifyTrackSearchTrackAdapter> provider8) {
        return new CurrentUserLegacyUserAdapter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static CurrentUserLegacyUserAdapter newCurrentUserLegacyUserAdapter(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return new CurrentUserLegacyUserAdapter((BadgeLegacyBadgeAdapter) obj, (GenderLegacyUserAdapter) obj2, (PhotoProfilePhotoAdapter) obj3, (JobLegacyJobAdapter) obj4, (SchoolLegacySchoolAdapter) obj5, (InstagramInstagramDataSetAdapter) obj6, (SpotifyArtistLegacyArtistAdapter) obj7, (SpotifyTrackSearchTrackAdapter) obj8);
    }
}
