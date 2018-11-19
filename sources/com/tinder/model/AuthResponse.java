package com.tinder.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.passport.model.PassportLocation;

public class AuthResponse {
    private final int ageMax;
    private final int ageMin;
    @Nullable
    private final String authToken;
    private final String blend;
    private final String createDate;
    private final String discoverability;
    private final int distanceFilter;
    private final String errorBody;
    private final boolean hasPhotoResults;
    private final boolean hideAds;
    private final boolean hideAge;
    private final boolean hideDistance;
    private final boolean isAllowedToGroupAdd;
    private final boolean isBanned;
    private final boolean isDiscoverable;
    private final boolean isError;
    private final double latitude;
    @NonNull
    private final PassportLocation location;
    private final double longitude;
    private final boolean needsAgeVerification;
    private final boolean needsGenderVerification;
    private final boolean optimizedPhotos;
    private final boolean showOnlyGroupsInDiscovery;
    private final boolean tweenCollectEmail;
    private final int tweenErrorNumber;
    @Nullable
    private final User user;

    public AuthResponse(@Nullable User user, @Nullable String str, int i, double d, double d2, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i4, String str2, boolean z13, String str3, String str4, String str5, @NonNull PassportLocation passportLocation) {
        this.user = user;
        this.authToken = str;
        this.distanceFilter = i;
        this.latitude = d;
        this.longitude = d2;
        this.ageMin = i2;
        this.ageMax = i3;
        this.isBanned = z;
        this.needsAgeVerification = z2;
        this.needsGenderVerification = z3;
        this.isDiscoverable = z4;
        this.isAllowedToGroupAdd = z5;
        this.showOnlyGroupsInDiscovery = z6;
        this.hideAds = z7;
        this.hideAge = z8;
        this.hideDistance = z9;
        this.optimizedPhotos = z10;
        this.hasPhotoResults = z11;
        this.tweenCollectEmail = z12;
        this.tweenErrorNumber = i4;
        this.createDate = str2;
        this.isError = z13;
        this.errorBody = str3;
        this.discoverability = str4;
        this.blend = str5;
        this.location = passportLocation;
    }

    @Nullable
    public User getUser() {
        return this.user;
    }

    @Nullable
    public String getAuthToken() {
        return this.authToken;
    }

    public int getDistanceFilter() {
        return this.distanceFilter;
    }

    public int getAgeMin() {
        return this.ageMin;
    }

    public int getAgeMax() {
        return this.ageMax;
    }

    public boolean isBanned() {
        return this.isBanned;
    }

    public boolean isNeedsAgeVerification() {
        return this.needsAgeVerification;
    }

    public boolean isNeedsGenderVerification() {
        return this.needsGenderVerification;
    }

    public boolean isDiscoverable() {
        return this.isDiscoverable;
    }

    public boolean isAllowedToGroupAdd() {
        return this.isAllowedToGroupAdd;
    }

    public boolean isShowOnlyGroupsInDiscovery() {
        return this.showOnlyGroupsInDiscovery;
    }

    public boolean isHideAds() {
        return this.hideAds;
    }

    public boolean isHideAge() {
        return this.hideAge;
    }

    public boolean isHideDistance() {
        return this.hideDistance;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public boolean isTraveling() {
        return this.user != null && this.user.isRecAndPassporting();
    }

    public boolean isError() {
        return this.isError;
    }

    public boolean isTweenCollectEmail() {
        return this.tweenCollectEmail;
    }

    public int getTweenErrorNumber() {
        return this.tweenErrorNumber;
    }

    public String getErrorBody() {
        return this.errorBody;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    @NonNull
    public PassportLocation getPassportLocation() {
        return this.location;
    }

    public String getDiscoverability() {
        return this.discoverability;
    }

    public String getBlend() {
        return this.blend;
    }
}
