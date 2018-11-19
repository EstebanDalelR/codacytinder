package com.tinder.interactors.p262a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.tinder.api.model.meta.Meta;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.api.model.meta.Meta.ProfileEditingConfig;
import com.tinder.api.model.profile.Notification;
import com.tinder.api.model.profile.Rating;
import com.tinder.data.meta.p226a.C10849m;
import com.tinder.domain.config.model.JobEditingConfig;
import com.tinder.domain.config.model.SchoolEditingConfig;
import com.tinder.model.GlobalConfig;
import com.tinder.model.GlobalConfig.SuperlikeALCMode;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.ReportNotification;
import com.tinder.model.UserMeta;
import com.tinder.model.auth.AccountConfig;
import com.tinder.utils.ad;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;

/* renamed from: com.tinder.interactors.a.i */
public class C9712i {
    /* renamed from: a */
    private static final AccountConfig f32295a = AccountConfig.newInstance(false);
    /* renamed from: b */
    private final C9710e f32296b;
    /* renamed from: c */
    private final C9711g f32297c;
    /* renamed from: d */
    private final C9708a f32298d;
    /* renamed from: e */
    private final C9709c f32299e;
    /* renamed from: f */
    private final C10849m f32300f;

    @Inject
    public C9712i(C9710e c9710e, C9711g c9711g, C9708a c9708a, C9709c c9709c, C10849m c10849m) {
        this.f32296b = c9710e;
        this.f32297c = c9711g;
        this.f32298d = c9708a;
        this.f32299e = c9709c;
        this.f32300f = c10849m;
    }

    @NonNull
    /* renamed from: a */
    public UserMeta m40199a(@NonNull Meta meta) {
        UserMeta userMeta = new UserMeta();
        userMeta.setSubscription(this.f32300f.m43327b(meta.purchases()));
        userMeta.setGlobalConfig(m40198a(meta.globals()));
        userMeta.setTutorials(meta.tutorials() != null ? meta.tutorials() : Collections.emptyList());
        m40196a(meta.rating(), userMeta);
        userMeta.setCanCreateSquad(meta.canCreateSquad());
        userMeta.setMillisRateLimitedUntil(meta.rating().rateLimitUntil());
        userMeta.setLikesPercentRemaining(meta.rating().likesRemaining());
        InstagramDataSet a = this.f32299e.m40182a(meta.user().instagram());
        userMeta.instagramDataSet = a;
        try {
            userMeta.setUser(this.f32297c.m40186a(meta.user()));
        } catch (ParseException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Something wrong when convert mete.user moshi to User");
            stringBuilder.append(e.getLocalizedMessage());
            ad.c(stringBuilder.toString());
        }
        userMeta.setCanCreateSquad(false);
        userMeta.setSquadsDiscoverable(false);
        userMeta.getUser().setInstagramDataSet(a);
        userMeta.setTravelingInfo(this.f32296b.m40184a(meta.travel()));
        userMeta.setClientConfig(this.f32298d.m40180a(meta.clientResources()));
        userMeta.reportNotifications = m40201a(meta.notifications());
        userMeta.setAccountConfig(m40200a(meta.accountConfig()));
        return userMeta;
    }

    @NonNull
    /* renamed from: a */
    List<ReportNotification> m40201a(@Nullable List<Notification> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<ReportNotification> arrayList = new ArrayList(list.size());
        for (Notification notification : list) {
            ReportNotification reportNotification = new ReportNotification();
            reportNotification.showReport = true;
            reportNotification.reasons = notification.reasons();
            reportNotification.type = notification.type();
            reportNotification.tier = notification.tier();
            arrayList.add(reportNotification);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    GlobalConfig m40198a(@Nullable Globals globals) {
        GlobalConfig globalConfig = new GlobalConfig();
        if (globals == null) {
            return globalConfig;
        }
        globalConfig.adSwipeLimit = globals.adSwipeInterval();
        globalConfig.blendEnabled = globals.recsBlend();
        globalConfig.fetchConnections = globals.fetchConnections();
        globalConfig.fireboarding = globals.fireboarding();
        globalConfig.groupsEnabled = globals.squadsEnabled();
        globalConfig.isSelectEnabled = globals.selectEnable();
        globalConfig.photoOptimizerFeatureEnabled = globals.photoOptimizerEnabled();
        globalConfig.photoPreviewEnabled = globals.photoPreviewEnabled();
        globalConfig.superLikeEnabled = globals.superLike();
        globalConfig.videoBpcSwipeEnabled = globals.videoSwipeEnable();
        globalConfig.plusEnabled = globals.plus();
        globalConfig.rateApp = globals.rateApp();
        globalConfig.recsInterval = globals.recsInterval();
        globalConfig.setPhotoOptimizerHasResult(globals.photoOptimizerHasResult());
        globalConfig.setBoostAvailable(globals.boost());
        globalConfig.setBoostDuration((long) globals.boostDuration());
        globalConfig.setBoostIntroMultiplier((double) globals.boostIntroMultiplier());
        globalConfig.setDiscountAvailable(globals.discount());
        globalConfig.setSubscriptionExpired(globals.subscriptionExpired());
        globalConfig.setSuperlikeALCMode(m40197a(globals.superLikeAlcMode()));
        globalConfig.setCanEditJobs(globals.canEditJobs());
        globalConfig.setCanEditSchools(globals.canEditSchools());
        globalConfig.setCanShowCommonConnections(globals.canShowCommonConnections());
        globalConfig.setCanAddPhotosFromFacebook(globals.canAddPhotosFromFacebook());
        m40195a(globals, globalConfig);
        globalConfig.setIsFastMatchEnabled(((Boolean) Objects.b(globals.isFastMatchEnabled(), Boolean.valueOf(false))).booleanValue());
        globalConfig.setCanEditEmail((Boolean) Objects.b(globals.canEditEmail(), Boolean.valueOf(true)));
        return globalConfig;
    }

    /* renamed from: a */
    private void m40195a(@NonNull Globals globals, GlobalConfig globalConfig) {
        ProfileEditingConfig profileEditingConfig = globals.profileEditingConfig();
        if (profileEditingConfig != null) {
            globalConfig.setSchoolEditingConfig(new SchoolEditingConfig(globals.canEditSchools(), ((Integer) Objects.b(profileEditingConfig.schoolNameMaxLength(), Integer.valueOf(com.tinder.domain.config.model.ProfileEditingConfig.DEFAULT_MAX_LENGTH))).intValue()));
            globalConfig.setJobEditingConfig(new JobEditingConfig(globals.canEditJobs(), ((Integer) Objects.b(profileEditingConfig.jobTitleMaxLength(), Integer.valueOf(com.tinder.domain.config.model.ProfileEditingConfig.DEFAULT_MAX_LENGTH))).intValue(), ((Integer) Objects.b(profileEditingConfig.companyNameMaxLength(), Integer.valueOf(com.tinder.domain.config.model.ProfileEditingConfig.DEFAULT_MAX_LENGTH))).intValue()));
        }
    }

    @NonNull
    /* renamed from: a */
    SuperlikeALCMode m40197a(int i) {
        if (i == 2) {
            return SuperlikeALCMode.ALL;
        }
        return SuperlikeALCMode.PLUS;
    }

    /* renamed from: a */
    private void m40196a(@NonNull Rating rating, @NonNull UserMeta userMeta) {
        userMeta.setLikesPercentRemaining(rating.likesRemaining());
        userMeta.setMillisRateLimitedUntil(rating.rateLimitUntil());
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: a */
    AccountConfig m40200a(@Nullable Meta.AccountConfig accountConfig) {
        if (accountConfig == null) {
            return f32295a;
        }
        accountConfig = (accountConfig.needPassword() == null || accountConfig.needPassword().booleanValue() == null) ? null : true;
        return AccountConfig.newInstance(accountConfig);
    }
}
