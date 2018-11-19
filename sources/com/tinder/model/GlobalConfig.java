package com.tinder.model;

import com.tinder.domain.config.model.JobEditingConfig;
import com.tinder.domain.config.model.SchoolEditingConfig;

public class GlobalConfig {
    public static final boolean CAN_EDIT_EMAIL_DEFAULT = false;
    public static final int DEFAULT_RECS_INTERVAL = 4000;
    public static final int DEFAULT_UPDATES_INTERVAL = 2000;
    public int adSwipeLimit;
    public boolean blendEnabled;
    private boolean canEditEmail = false;
    public boolean fetchConnections;
    public boolean fireboarding;
    public boolean groupsEnabled;
    private boolean isFastMatchEnabled = false;
    public boolean isSelectEnabled;
    private JobEditingConfig jobEditingConfig = JobEditingConfig.DEFAULT;
    private boolean mBoostAvailable;
    private long mBoostDuration;
    private double mBoostIntroMultiplier;
    private boolean mCanAddPhotosFromFacebook = false;
    private boolean mCanEditJobs = false;
    private boolean mCanEditSchools = false;
    private boolean mCanShowCommonConnections = false;
    private boolean mDiscountAvailable;
    private boolean mSubscriptionExpired;
    private SuperlikeALCMode mSuperlikeALCMode = SuperlikeALCMode.PLUS;
    public boolean photoOptimizerFeatureEnabled;
    private boolean photoOptimizerHasResult = false;
    public boolean photoPreviewEnabled = false;
    public boolean plusEnabled;
    public boolean rateApp;
    public int recsInterval = DEFAULT_RECS_INTERVAL;
    private SchoolEditingConfig schoolEditingConfig = SchoolEditingConfig.DEFAULT;
    public boolean superLikeEnabled;
    public int updatesInterval = 2000;
    public boolean videoBpcSwipeEnabled;

    public enum SuperlikeALCMode {
        PLUS,
        ALL
    }

    public boolean isFastMatchEnabled() {
        return this.isFastMatchEnabled;
    }

    public void setIsFastMatchEnabled(boolean z) {
        this.isFastMatchEnabled = z;
    }

    public boolean isPlusEnabled() {
        return this.plusEnabled;
    }

    public void setDiscountAvailable(boolean z) {
        this.mDiscountAvailable = z;
    }

    public boolean getDiscountAvailable() {
        return this.mDiscountAvailable;
    }

    public boolean isSubscriptionExpired() {
        return this.mSubscriptionExpired;
    }

    public void setSubscriptionExpired(boolean z) {
        this.mSubscriptionExpired = z;
    }

    public boolean isBoostAvailable() {
        return this.mBoostAvailable;
    }

    public void setBoostAvailable(boolean z) {
        this.mBoostAvailable = z;
    }

    public long getBoostDuration() {
        return this.mBoostDuration;
    }

    public void setBoostDuration(long j) {
        this.mBoostDuration = j;
    }

    public double getBoostIntroMultiplier() {
        return this.mBoostIntroMultiplier;
    }

    public void setBoostIntroMultiplier(double d) {
        this.mBoostIntroMultiplier = d;
    }

    public SuperlikeALCMode getSuperlikeALCMode() {
        return this.mSuperlikeALCMode;
    }

    public void setSuperlikeALCMode(SuperlikeALCMode superlikeALCMode) {
        this.mSuperlikeALCMode = superlikeALCMode;
    }

    @Deprecated
    public boolean canEditJobs() {
        return this.mCanEditJobs;
    }

    @Deprecated
    public void setCanEditJobs(boolean z) {
        this.mCanEditJobs = z;
    }

    @Deprecated
    public boolean canEditSchools() {
        return this.mCanEditSchools;
    }

    @Deprecated
    public void setCanEditSchools(boolean z) {
        this.mCanEditSchools = z;
    }

    public void setCanShowCommonConnections(boolean z) {
        this.mCanShowCommonConnections = z;
    }

    public boolean canShowCommonConnections() {
        return this.mCanShowCommonConnections;
    }

    public void setCanAddPhotosFromFacebook(boolean z) {
        this.mCanAddPhotosFromFacebook = z;
    }

    public boolean canAddPhotosFromFacebook() {
        return this.mCanAddPhotosFromFacebook;
    }

    public boolean isPhotoOptimizerHasResult() {
        return this.photoOptimizerHasResult;
    }

    public void setPhotoOptimizerHasResult(boolean z) {
        this.photoOptimizerHasResult = z;
    }

    public SchoolEditingConfig schoolEditingConfig() {
        return this.schoolEditingConfig;
    }

    public void setSchoolEditingConfig(SchoolEditingConfig schoolEditingConfig) {
        this.schoolEditingConfig = schoolEditingConfig;
    }

    public JobEditingConfig jobEditingConfig() {
        return this.jobEditingConfig;
    }

    public void setJobEditingConfig(JobEditingConfig jobEditingConfig) {
        this.jobEditingConfig = jobEditingConfig;
    }

    public void setCanEditEmail(Boolean bool) {
        this.canEditEmail = bool.booleanValue();
    }

    public boolean canEditEmail() {
        return this.canEditEmail;
    }
}
