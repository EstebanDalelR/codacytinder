package com.tinder.interactors.p262a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.tinder.api.model.common.Job;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.ProcessedFile;
import com.tinder.api.model.common.School;
import com.tinder.enums.Gender;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.Badge;
import com.tinder.model.Career;
import com.tinder.model.Career.Builder;
import com.tinder.model.Interest;
import com.tinder.model.Job.Company;
import com.tinder.model.Job.Title;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProcessedVideo;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.utils.DateUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java8.util.Objects;

/* renamed from: com.tinder.interactors.a.g */
public class C9711g {
    /* renamed from: a */
    final DateFormat f32294a = DateUtils.a();

    @NonNull
    /* renamed from: a */
    public User m40186a(com.tinder.api.model.common.User user) throws ParseException {
        Date date;
        int i;
        C9711g c9711g = this;
        boolean equals = "-1".equals(user.birthDate());
        Date date2 = null;
        if (equals) {
            date = null;
        } else {
            date = c9711g.f32294a.parse(user.birthDate());
        }
        if (user.pingTime() != null) {
            date2 = c9711g.f32294a.parse(user.pingTime());
        }
        User user2 = new User(user.name(), user.bio(), date, user.id(), date2, Gender.fromBackendId(user.gender().intValue()), null, null, user.distanceFilter().intValue(), m40190b(user.photos()), user.activeTime(), user.locationName(), user.locationProximity(), ((Boolean) Objects.b(user.isVerified(), Boolean.valueOf(false))).booleanValue(), false, false, m40188a(user.badges()), user.username(), m40185a(user.jobs(), user.schools()), false, false, ((Boolean) Objects.b(user.photosProcessing(), Boolean.valueOf(false))).booleanValue(), ((Boolean) Objects.b(user.photoOptimizerEnabled(), Boolean.valueOf(false))).booleanValue(), ((Boolean) Objects.b(user.isNew(), Boolean.valueOf(false))).booleanValue(), user.contentHash(), null, null);
        user2.setCommonInterests(m40192d(user.interests()));
        user2.setNumConnections(user.connectionCount().intValue());
        if (user.hideAge() != null) {
            user2.setHideAge(user.hideAge().booleanValue());
        }
        if (user.hideDistance() != null) {
            user2.setHideDistance(user.hideDistance().booleanValue());
        }
        user2.setContentHash(user.contentHash());
        if (user.showGenderOnProfile() != null) {
            user2.setShowGenderOnProfile(user.showGenderOnProfile().booleanValue());
        }
        user2.setCreateDate(user.createDate());
        if (user.discoverable() != null) {
            user2.setDiscoverable(user.discoverable().booleanValue());
        }
        if (user.distanceFilter() == null) {
            i = 50;
        } else {
            i = user.distanceFilter().intValue();
        }
        user2.setDistanceFilter(i);
        if (user.genderFilter() != null) {
            user2.setInterestedIn(m40187a(user.genderFilter().intValue()));
        }
        i = user2.getAgeInt();
        if (i > 0) {
            int intValue;
            if (user.ageFilterMin() != null) {
                intValue = user.ageFilterMin().intValue();
            } else {
                intValue = Math.max(18, i - 10);
            }
            user2.setAgeFilterMin(intValue);
            user2.setAgeFilterMax(user.ageFilterMax() != null ? user.ageFilterMax().intValue() : i + 10);
        } else {
            user2.setAgeFilterMin(18);
            user2.setAgeFilterMax(AdError.NETWORK_ERROR_CODE);
        }
        if (user.hideAds() != null) {
            user2.setHideAds(user.hideAds().booleanValue());
        }
        user2.setAgeVerificationRequired(equals);
        user2.setGenderVerificationRequired(user.gender().intValue() == -1);
        user2.setDiscoverability(ManagerProfile.c(user.discoverableParty()));
        user2.setBlend(ManagerProfile.b(user.blend()));
        user2.setIsSpotifyConnected(((Boolean) Objects.b(user.spotifyConnected(), Boolean.valueOf(false))).booleanValue());
        return user2;
    }

    /* renamed from: a */
    public List<Gender> m40187a(int i) {
        List<Gender> arrayList = new ArrayList(2);
        if (i == -1) {
            arrayList.add(Gender.MALE);
            arrayList.add(Gender.FEMALE);
        } else if (i == 0) {
            arrayList.add(Gender.MALE);
        } else {
            arrayList.add(Gender.FEMALE);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public List<Badge> m40188a(@Nullable List<com.tinder.api.model.common.Badge> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<Badge> arrayList = new ArrayList(list.size());
        for (com.tinder.api.model.common.Badge badge : list) {
            arrayList.add(new Badge(badge.type(), badge.description(), badge.color()));
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    public List<ProfilePhoto> m40190b(@Nullable List<Photo> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<ProfilePhoto> arrayList = new ArrayList(list.size());
        for (Photo photo : list) {
            ProfilePhoto profilePhoto = new ProfilePhoto(photo.url(), photo.id(), m40189a(photo.processedFiles(), photo.id()), m40191c(photo.processedVideos()));
            profilePhoto.facebookId = photo.fbId();
            if (photo.xdistancePercent() != null) {
                profilePhoto.xDistancePercent = photo.xdistancePercent().floatValue();
            }
            if (photo.xoffsetPercent() != null) {
                profilePhoto.xOffsetPercent = photo.xoffsetPercent().floatValue();
            }
            if (photo.ydistancePercent() != null) {
                profilePhoto.yDistancePercent = photo.ydistancePercent().floatValue();
            }
            if (photo.yoffsetPercent() != null) {
                profilePhoto.yOffsetPercent = photo.yoffsetPercent().floatValue();
            }
            arrayList.add(profilePhoto);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public List<ProcessedPhoto> m40189a(@Nullable List<ProcessedFile> list, String str) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<ProcessedPhoto> arrayList = new ArrayList(list.size());
        for (ProcessedFile processedFile : list) {
            ProcessedPhoto processedPhoto = new ProcessedPhoto(processedFile.url(), processedFile.width().intValue(), processedFile.height().intValue());
            processedPhoto.setPhotoId(str);
            arrayList.add(processedPhoto);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public List<ProcessedVideo> m40191c(@Nullable List<com.tinder.api.model.common.ProcessedVideo> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<ProcessedVideo> arrayList = new ArrayList(list.size());
        for (com.tinder.api.model.common.ProcessedVideo processedVideo : list) {
            arrayList.add(new ProcessedVideo(processedVideo.url(), processedVideo.width().intValue(), processedVideo.height().intValue()));
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public List<Interest> m40192d(@Nullable List<com.tinder.api.model.common.Interest> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<Interest> arrayList = new ArrayList(list.size());
        for (com.tinder.api.model.common.Interest interest : list) {
            arrayList.add(new Interest(interest.id(), interest.name()));
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public Career m40185a(List<Job> list, List<School> list2) {
        return new Builder().teaser(null).jobs(list != null ? m40193e(list) : Collections.emptyList()).schools(list2 != null ? m40194f(list2) : Collections.emptyList()).build();
    }

    @NonNull
    /* renamed from: e */
    public List<com.tinder.model.Job> m40193e(@Nullable List<Job> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<com.tinder.model.Job> arrayList = new ArrayList();
        for (Job job : list) {
            com.tinder.model.Job job2 = new com.tinder.model.Job();
            Company company = new Company();
            company.mId = job.companyId();
            company.mName = job.companyName();
            if (job.isCompanyDisplayed() != null) {
                company.mDisplayed = job.isCompanyDisplayed().booleanValue();
            }
            job2.mCompany = company;
            Title title = new Title();
            title.mId = job.titleId();
            title.mName = job.titleName();
            if (job.isTitleDisplayed() != null) {
                title.mDisplayed = job.isTitleDisplayed().booleanValue();
            }
            job2.mTitle = title;
            arrayList.add(job2);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: f */
    public List<com.tinder.model.School> m40194f(@Nullable List<School> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<com.tinder.model.School> arrayList = new ArrayList();
        for (School school : list) {
            String str = null;
            String id = school.id() != null ? school.id() : null;
            if (school.name() != null) {
                str = school.name();
            }
            arrayList.add(new com.tinder.model.School(id, str, school.displayed() != null ? school.displayed().booleanValue() : false));
        }
        return arrayList;
    }
}
