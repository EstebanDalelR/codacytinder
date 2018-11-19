package com.tinder.profile.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Badge.Type;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Interest;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Job.Builder;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.Photo.Video;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.InstagramPhoto;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProcessedVideo;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java8.util.Objects;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.DateTime;

/* renamed from: com.tinder.profile.adapters.k */
public class C14367k {
    @Inject
    C14367k() {
    }

    @NonNull
    /* renamed from: a */
    public PerspectableUser m54736a(@NonNull User user) {
        return PerspectableUser.builder().profileUser(m54739b(user)).commmonInterests(m54731e(user.getCommonInterests())).distanceMiles(user.getDistanceMiles()).commonConnections(Collections.emptyList()).build();
    }

    @Nullable
    /* renamed from: a */
    public DateTime m54738a(@Nullable Date date) {
        return date == null ? null : new DateTime(date);
    }

    @NonNull
    /* renamed from: b */
    public ProfileUser m54739b(@NonNull User user) {
        List emptyList;
        Instagram a = m54719a(user.getInstagramPhotos(), user.getInstagramDataSet());
        if (user.getSpotifyTopArtists() == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = m54732f(user.getSpotifyTopArtists());
        }
        return ProfileUser.builder().id(user.getId()).name(user.getName()).badges(m54737a(user.getBadges())).bio(user.getBio()).connectionCount(user.getNumConnections()).gender(m54735a(user.getGender(), user.getCustomGender())).hideAge(user.getHideAge()).hideDistance(user.getHideDistance()).instagram(a).jobs(m54740b(user.getJobs())).photos(m54730d(user.getPhotos())).schools(m54741c(user.getSchools())).spotifyConnected(user.isSpotifyConnected()).spotifyThemeTrack(m54725a(user.getSpotifyThemeTrack())).spotifyTopArtists(emptyList).verified(user.isVerified()).birthDate(m54738a(user.getBirthDate())).showGenderOnProfile(user.getShowGenderOnProfile()).build();
    }

    @Nullable
    /* renamed from: a */
    private Gender m54717a(@Nullable com.tinder.enums.Gender gender, boolean z, @Nullable String str) {
        if (gender != null) {
            if (z) {
                return Gender.create(Value.fromId(gender.getBackendId()), str);
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public Gender m54735a(@Nullable com.tinder.enums.Gender gender, @Nullable String str) {
        gender = m54717a(gender, true, str);
        return gender == null ? Gender.create(Value.UNKNOWN) : gender;
    }

    @NonNull
    /* renamed from: d */
    private List<Photo> m54730d(@NonNull List<ProfilePhoto> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<Photo> arrayList = new ArrayList(list.size());
        for (ProfilePhoto profilePhoto : list) {
            if (profilePhoto != null) {
                arrayList.add(m54722a(profilePhoto));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    private Photo m54722a(@NonNull ProfilePhoto profilePhoto) {
        return Photo.builder().id((String) Objects.m59116b(profilePhoto.getPhotoId(), "")).url((String) Objects.m59116b(profilePhoto.imageUrl, "")).renders(m54728b(profilePhoto)).videos(m54729c(profilePhoto)).build();
    }

    /* renamed from: b */
    private List<Render> m54728b(@NonNull ProfilePhoto profilePhoto) {
        ProfilePhoto<ProcessedPhoto> profilePhoto2 = profilePhoto.processedPhotos;
        if (profilePhoto2 != null) {
            if (!profilePhoto2.isEmpty()) {
                List<Render> arrayList = new ArrayList(profilePhoto2.size());
                for (ProcessedPhoto processedPhoto : profilePhoto2) {
                    arrayList.add(Render.builder().width(processedPhoto.width).height(processedPhoto.height).url(processedPhoto.imageUrl).build());
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    /* renamed from: c */
    private List<Video> m54729c(@NonNull ProfilePhoto profilePhoto) {
        ProfilePhoto<ProcessedVideo> profilePhoto2 = profilePhoto.processedVideos;
        if (profilePhoto2 != null) {
            if (!profilePhoto2.isEmpty()) {
                List<Video> arrayList = new ArrayList(profilePhoto2.size());
                for (ProcessedVideo processedVideo : profilePhoto2) {
                    arrayList.add(Video.builder().width(processedVideo.getWidth()).height(processedVideo.getHeight()).url(processedVideo.getUrl()).build());
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    /* renamed from: a */
    public List<Badge> m54737a(@Nullable List<com.tinder.model.Badge> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                List<Badge> arrayList = new ArrayList(list.size());
                for (com.tinder.model.Badge badge : list) {
                    if (badge != null) {
                        arrayList.add(m54716a(badge));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    /* renamed from: a */
    private Badge m54716a(@NonNull com.tinder.model.Badge badge) {
        return Badge.builder().color(String.valueOf(Objects.m59116b(Integer.valueOf(badge.color), ""))).description((String) Objects.m59116b(badge.description, "")).type(Type.fromKey((String) Objects.m59116b(badge.type, ""))).build();
    }

    @NonNull
    /* renamed from: e */
    private List<Interest> m54731e(@NonNull List<com.tinder.model.Interest> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<Interest> arrayList = new ArrayList(list.size());
        for (com.tinder.model.Interest interest : list) {
            if (interest != null) {
                arrayList.add(m54720a(interest));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    private Interest m54720a(@NonNull com.tinder.model.Interest interest) {
        return Interest.builder().id((String) Objects.m59116b(interest.id, "")).name((String) Objects.m59116b(interest.name, "")).build();
    }

    @NonNull
    /* renamed from: b */
    public List<Job> m54740b(@NonNull List<com.tinder.model.Job> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<Job> arrayList = new ArrayList(list.size());
        for (com.tinder.model.Job job : list) {
            if (job != null) {
                arrayList.add(m54721a(job));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    private Job m54721a(@NonNull com.tinder.model.Job job) {
        Builder builder = Job.builder();
        if (job.getCompany() != null) {
            builder.companyId((String) Objects.m59116b(job.getCompany().getId(), "")).companyName((String) Objects.m59116b(job.getCompany().getName(), "")).companyDisplayed(((Boolean) Objects.m59116b(Boolean.valueOf(job.getCompany().isDisplayed()), Boolean.valueOf(false))).booleanValue());
        } else {
            builder.companyId("").companyName("").companyDisplayed(false);
        }
        if (job.getTitle() != null) {
            builder.titleId((String) Objects.m59116b(job.getTitle().getId(), "")).titleName((String) Objects.m59116b(job.getTitle().getName(), "")).titleDisplayed(((Boolean) Objects.m59116b(Boolean.valueOf(job.getTitle().isDisplayed()), Boolean.valueOf(false))).booleanValue());
        } else {
            builder.titleId("").titleName("").titleDisplayed(false);
        }
        return builder.build();
    }

    @NonNull
    /* renamed from: c */
    public List<School> m54741c(@NonNull List<com.tinder.model.School> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<School> arrayList = new ArrayList(list.size());
        for (com.tinder.model.School school : list) {
            if (school != null) {
                arrayList.add(m54723a(school));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    private School m54723a(@NonNull com.tinder.model.School school) {
        return School.builder().id((String) Objects.m59116b(school.getId(), "")).name((String) Objects.m59116b(school.getName(), "")).displayed(((Boolean) Objects.m59116b(Boolean.valueOf(school.isDisplayed()), Boolean.valueOf(false))).booleanValue()).build();
    }

    @Nullable
    /* renamed from: a */
    private SpotifyTrack m54725a(@Nullable SearchTrack searchTrack) {
        if (searchTrack == null) {
            return null;
        }
        return SpotifyTrack.builder().id((String) Objects.m59116b(searchTrack.getId(), "")).name((String) Objects.m59116b(searchTrack.getName(), "")).artworkUrl((String) Objects.m59116b(((Map) searchTrack.getAlbum().getImages().get(0)).get("url"), "")).artists(m54733g(searchTrack.getArtist())).popularity(((Integer) Objects.m59116b(Integer.valueOf(searchTrack.getPopularity()), Integer.valueOf(0))).intValue()).previewUrl((String) Objects.m59116b(searchTrack.getPreviewUrl(), "")).uri((String) Objects.m59116b(searchTrack.getSpotifyUri(), "")).isPlayable(true).build();
    }

    @NonNull
    /* renamed from: f */
    private List<SpotifyArtist> m54732f(@NonNull List<Artist> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SpotifyArtist> arrayList = new ArrayList(list.size());
        for (Artist artist : list) {
            if (artist != null) {
                arrayList.add(m54724a(artist));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    private SpotifyArtist m54724a(@NonNull Artist artist) {
        return SpotifyArtist.builder().name((String) Objects.m59116b(artist.getName(), "")).id((String) Objects.m59116b(artist.getId(), "")).topTrack(m54725a(artist.getTopTrack())).selected(((Boolean) Objects.m59116b(Boolean.valueOf(artist.isSelected()), Boolean.valueOf(false))).booleanValue()).build();
    }

    @NonNull
    /* renamed from: b */
    private SpotifyTrack.Artist m54727b(@NonNull Artist artist) {
        return SpotifyTrack.Artist.builder().id((String) Objects.m59116b(artist.getId(), "")).name((String) Objects.m59116b(artist.getName(), "")).build();
    }

    @NonNull
    /* renamed from: g */
    private List<SpotifyTrack.Artist> m54733g(@NonNull List<Artist> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SpotifyTrack.Artist> arrayList = new ArrayList(list.size());
        for (Artist artist : list) {
            if (artist != null) {
                arrayList.add(m54727b(artist));
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    private Instagram m54719a(@NonNull List<InstagramPhoto> list, @Nullable InstagramDataSet instagramDataSet) {
        if (instagramDataSet != null) {
            if (instagramDataSet.username != null) {
                return Instagram.builder().username((String) Objects.m59116b(instagramDataSet.username, "")).profilePicture((String) Objects.m59116b(instagramDataSet.profileImageUrl, "")).mediaCount(((Integer) Objects.m59116b(Integer.valueOf(instagramDataSet.mediaCount), Integer.valueOf(0))).intValue()).photos(m54734h(list)).completedInitialFetch(true).lastFetchedTime(Optional.m59121b(m54726a(instagramDataSet.lastFetchTime))).build();
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    private DateTime m54726a(@Nullable String str) {
        return str == null ? null : DateTime.a(str);
    }

    @NonNull
    /* renamed from: a */
    private Instagram.Photo m54718a(@NonNull InstagramPhoto instagramPhoto) {
        return Instagram.Photo.builder().link((String) Objects.m59116b(instagramPhoto.mLink, "")).timestampMillis(((Long) Objects.m59116b(Long.valueOf(instagramPhoto.mTimestamp), Long.valueOf(0))).longValue()).thumbnail((String) Objects.m59116b(instagramPhoto.mUrlSmall, "")).image((String) Objects.m59116b(instagramPhoto.mUrlLarge, "")).build();
    }

    @NonNull
    /* renamed from: h */
    private List<Instagram.Photo> m54734h(List<InstagramPhoto> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<Instagram.Photo> arrayList = new ArrayList(list.size());
        for (InstagramPhoto instagramPhoto : list) {
            if (instagramPhoto != null) {
                arrayList.add(m54718a(instagramPhoto));
            }
        }
        return arrayList;
    }
}
