package com.tinder.model.adapter.domain;

import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.ProfileUser.Builder;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.model.Career;
import com.tinder.model.User;
import javax.inject.Inject;
import org.joda.time.DateTime;

public class CurrentUserLegacyUserAdapter extends C2645i<ProfileUser, User> {
    private final BadgeLegacyBadgeAdapter badgeAdapter;
    private final GenderLegacyUserAdapter genderAdapter;
    private final InstagramInstagramDataSetAdapter instagramAdapter;
    private final JobLegacyJobAdapter jobAdapter;
    private final PhotoProfilePhotoAdapter photoAdapter;
    private final SchoolLegacySchoolAdapter schoolAdapter;
    private final SpotifyArtistLegacyArtistAdapter spotifyTopArtistAdapter;
    private final SpotifyTrackSearchTrackAdapter spotifyTrackAdapter;

    @Inject
    public CurrentUserLegacyUserAdapter(BadgeLegacyBadgeAdapter badgeLegacyBadgeAdapter, GenderLegacyUserAdapter genderLegacyUserAdapter, PhotoProfilePhotoAdapter photoProfilePhotoAdapter, JobLegacyJobAdapter jobLegacyJobAdapter, SchoolLegacySchoolAdapter schoolLegacySchoolAdapter, InstagramInstagramDataSetAdapter instagramInstagramDataSetAdapter, SpotifyArtistLegacyArtistAdapter spotifyArtistLegacyArtistAdapter, SpotifyTrackSearchTrackAdapter spotifyTrackSearchTrackAdapter) {
        this.badgeAdapter = badgeLegacyBadgeAdapter;
        this.genderAdapter = genderLegacyUserAdapter;
        this.photoAdapter = photoProfilePhotoAdapter;
        this.jobAdapter = jobLegacyJobAdapter;
        this.schoolAdapter = schoolLegacySchoolAdapter;
        this.instagramAdapter = instagramInstagramDataSetAdapter;
        this.spotifyTopArtistAdapter = spotifyArtistLegacyArtistAdapter;
        this.spotifyTrackAdapter = spotifyTrackSearchTrackAdapter;
    }

    public ProfileUser adapt(User user) {
        Career career = user.getCareer();
        Builder schools = ProfileUser.builder().id(user.getId()).badges(this.badgeAdapter.adapt(user.getBadges())).bio(user.getBio()).birthDate(new DateTime(user.getBirthDate())).gender(this.genderAdapter.adapt(user)).name(user.getName()).photos(this.photoAdapter.adapt(user.getPhotos())).jobs(this.jobAdapter.adapt(career.getJobs())).schools(this.schoolAdapter.adapt(career.getSchools()));
        SpotifyTrack spotifyTrack = null;
        schools = schools.instagram(user.getInstagramDataSet() != null ? this.instagramAdapter.adapt(user.getInstagramDataSet()) : null).spotifyTopArtists(user.getSpotifyTopArtists() != null ? this.spotifyTopArtistAdapter.adapt(user.getSpotifyTopArtists()) : null);
        if (user.getSpotifyThemeTrack() != null) {
            spotifyTrack = this.spotifyTrackAdapter.adapt(user.getSpotifyThemeTrack());
        }
        return schools.spotifyThemeTrack(spotifyTrack).spotifyConnected(user.isSpotifyConnected()).hideDistance(user.getHideDistance()).hideAge(user.getHideAge()).connectionCount(user.getNumConnections()).verified(user.isVerified()).showGenderOnProfile(user.getShowGenderOnProfile()).build();
    }
}
