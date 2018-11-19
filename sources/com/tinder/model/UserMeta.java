package com.tinder.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.model.auth.AccountConfig;
import com.tinder.p238f.p240b.p241a.p242a.C9367c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMeta {
    @Nullable
    private AccountConfig accountConfig;
    private boolean canCreateSquad;
    @Nullable
    private ClientConfig clientConfig;
    @Nullable
    public InstagramDataSet instagramDataSet = new InstagramDataSet();
    private int likesPercentRemaining;
    private GlobalConfig mGlobalConfig;
    private C9367c mTravelingInfo;
    private User mUser;
    private long millisRateLimitedUntil;
    public List<ReportNotification> reportNotifications = new ArrayList();
    private boolean squadsDiscoverable;
    private Subscription subscription;
    private SuperlikeStatus superlikeStatus;
    private List<String> tutorials = new ArrayList();

    public void setClientConfig(@Nullable ClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    @Nullable
    public ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    public void setCanCreateSquad(boolean z) {
        this.canCreateSquad = z;
    }

    public boolean isSquadsDiscoverable() {
        return this.squadsDiscoverable;
    }

    public void setSquadsDiscoverable(boolean z) {
        this.squadsDiscoverable = z;
    }

    public GlobalConfig getGlobalConfig() {
        return this.mGlobalConfig;
    }

    @Deprecated
    public void setGlobalConfig(GlobalConfig globalConfig) {
        this.mGlobalConfig = globalConfig;
    }

    @NonNull
    public List<String> getTutorials() {
        return this.tutorials.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(this.tutorials);
    }

    public boolean removeTutorial(String str) {
        return this.tutorials.remove(str);
    }

    public void setTutorials(@NonNull List<String> list) {
        this.tutorials = list;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User user) {
        this.mUser = user;
    }

    public C9367c getTravelingInfo() {
        return this.mTravelingInfo;
    }

    public void setTravelingInfo(C9367c c9367c) {
        this.mTravelingInfo = c9367c;
    }

    @Nullable
    public AccountConfig getAccountConfig() {
        return this.accountConfig;
    }

    public void setAccountConfig(@Nullable AccountConfig accountConfig) {
        this.accountConfig = accountConfig;
    }

    public int getLikesPercentRemaining() {
        return this.likesPercentRemaining;
    }

    public void setLikesPercentRemaining(int i) {
        this.likesPercentRemaining = i;
    }

    public long getMillisRateLimitedUntil() {
        return this.millisRateLimitedUntil;
    }

    public void setMillisRateLimitedUntil(long j) {
        this.millisRateLimitedUntil = j;
    }

    public SuperlikeStatus getSuperlikeStatus() {
        return this.superlikeStatus;
    }

    public void setSuperlikeStatus(SuperlikeStatus superlikeStatus) {
        this.superlikeStatus = superlikeStatus;
    }

    public Subscription getSubscription() {
        return this.subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
