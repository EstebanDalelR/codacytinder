package com.tinder.model.builders;

import com.tinder.model.AuthResponse;
import com.tinder.model.User;
import com.tinder.passport.model.PassportLocation;

public class AuthResponseBuilder {
    private String blend;
    private String discoverability;
    private boolean hasPhotoResults;
    private boolean isError;
    private boolean isTraveling;
    private boolean isTweenShouldCollectEmail;
    private double latitude;
    private double longitude;
    private int mAgeMax;
    private int mAgeMin;
    private String mAuthToken = null;
    private String mCreateDate;
    private int mDistanceFilter;
    private String mErrorBody;
    private boolean mHideAds;
    private boolean mHideAge;
    private boolean mHideDistance;
    private boolean mIsAllowedToGroupAdd;
    private boolean mIsBanned;
    private boolean mIsDiscoverable;
    private boolean mNeedsAgeVerification;
    private boolean mNeedsGenderVerification;
    private PassportLocation mPassportLocation;
    private boolean mShowOnlyGroupsInDiscovery;
    private int mTweenErrorNumber;
    private User mUser = null;
    private boolean optimizedPhotos;

    public AuthResponseBuilder setUser(User user) {
        this.mUser = user;
        return this;
    }

    public AuthResponseBuilder setAuthToken(String str) {
        this.mAuthToken = str;
        return this;
    }

    public AuthResponseBuilder setDistanceFilter(int i) {
        this.mDistanceFilter = i;
        return this;
    }

    public AuthResponseBuilder setAgeMin(int i) {
        this.mAgeMin = i;
        return this;
    }

    public AuthResponseBuilder setAgeMax(int i) {
        this.mAgeMax = i;
        return this;
    }

    public AuthResponseBuilder setIsBanned(boolean z) {
        this.mIsBanned = z;
        return this;
    }

    public AuthResponseBuilder setNeedsAgeVerification(boolean z) {
        this.mNeedsAgeVerification = z;
        return this;
    }

    public AuthResponseBuilder setNeedsGenderVerification(boolean z) {
        this.mNeedsGenderVerification = z;
        return this;
    }

    public AuthResponseBuilder setIsDiscoverable(boolean z) {
        this.mIsDiscoverable = z;
        return this;
    }

    public AuthResponseBuilder setIsAllowedToGroupAdd(boolean z) {
        this.mIsAllowedToGroupAdd = z;
        return this;
    }

    public AuthResponseBuilder setShowOnlyGroupsInDiscovery(boolean z) {
        this.mShowOnlyGroupsInDiscovery = z;
        return this;
    }

    public AuthResponseBuilder setHideAds(boolean z) {
        this.mHideAds = z;
        return this;
    }

    public AuthResponseBuilder setHideAge(boolean z) {
        this.mHideAge = z;
        return this;
    }

    public AuthResponseBuilder setHideDistance(boolean z) {
        this.mHideDistance = z;
        return this;
    }

    public AuthResponseBuilder setOptimizedPhotos(boolean z) {
        this.optimizedPhotos = z;
        return this;
    }

    public AuthResponseBuilder setHasPhotoResults(boolean z) {
        this.hasPhotoResults = z;
        return this;
    }

    public AuthResponseBuilder setLatitude(double d) {
        this.latitude = d;
        return this;
    }

    public AuthResponseBuilder setLongitude(double d) {
        this.longitude = d;
        return this;
    }

    public AuthResponseBuilder setTraveling(boolean z) {
        this.isTraveling = z;
        return this;
    }

    public AuthResponseBuilder setError(boolean z) {
        this.isError = z;
        return this;
    }

    public AuthResponseBuilder setTweenShouldCollectEmail(boolean z) {
        this.isTweenShouldCollectEmail = z;
        return this;
    }

    public AuthResponseBuilder setTweenErrorNumber(int i) {
        this.mTweenErrorNumber = i;
        return this;
    }

    public AuthResponseBuilder setErrorBody(String str) {
        this.mErrorBody = str;
        return this;
    }

    public AuthResponseBuilder setCreateDate(String str) {
        this.mCreateDate = str;
        return this;
    }

    public AuthResponseBuilder setPassportLocation(PassportLocation passportLocation) {
        this.mPassportLocation = passportLocation;
        return this;
    }

    public AuthResponseBuilder setDiscoverability(String str) {
        this.discoverability = str;
        return this;
    }

    public AuthResponseBuilder setBlend(String str) {
        this.blend = str;
        return this;
    }

    public AuthResponse build() {
        if (this.mUser != null) {
            r0.mUser.setRecAndPassporting(r0.isTraveling);
        }
        User user = r0.mUser;
        String str = r0.mAuthToken;
        int i = r0.mDistanceFilter;
        double d = r0.latitude;
        double d2 = r0.longitude;
        int i2 = r0.mAgeMin;
        int i3 = r0.mAgeMax;
        boolean z = r0.mIsBanned;
        boolean z2 = r0.mNeedsAgeVerification;
        boolean z3 = r0.mNeedsGenderVerification;
        boolean z4 = r0.mIsDiscoverable;
        boolean z5 = z4;
        return new AuthResponse(user, str, i, d, d2, i2, i3, z, z2, z3, z5, r0.mIsAllowedToGroupAdd, r0.mShowOnlyGroupsInDiscovery, r0.mHideAds, r0.mHideAge, r0.mHideDistance, r0.optimizedPhotos, r0.hasPhotoResults, r0.isTweenShouldCollectEmail, r0.mTweenErrorNumber, r0.mCreateDate, r0.isError, r0.mErrorBody, r0.discoverability, r0.blend, r0.mPassportLocation);
    }
}
