package com.tinder.domain.pushnotifications.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/pushnotifications/model/LikesYouPushNotificationSetting;", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "frequency", "", "likesYouNotificationSettingConfig", "Lcom/tinder/domain/pushnotifications/model/LikesYouNotificationSettingConfig;", "(ILcom/tinder/domain/pushnotifications/model/LikesYouNotificationSettingConfig;)V", "getFrequency", "()I", "getLikesYouNotificationSettingConfig", "()Lcom/tinder/domain/pushnotifications/model/LikesYouNotificationSettingConfig;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LikesYouPushNotificationSetting extends PushNotificationSetting {
    private final int frequency;
    @NotNull
    private final LikesYouNotificationSettingConfig likesYouNotificationSettingConfig;

    @NotNull
    public static /* synthetic */ LikesYouPushNotificationSetting copy$default(LikesYouPushNotificationSetting likesYouPushNotificationSetting, int i, LikesYouNotificationSettingConfig likesYouNotificationSettingConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = likesYouPushNotificationSetting.frequency;
        }
        if ((i2 & 2) != 0) {
            likesYouNotificationSettingConfig = likesYouPushNotificationSetting.likesYouNotificationSettingConfig;
        }
        return likesYouPushNotificationSetting.copy(i, likesYouNotificationSettingConfig);
    }

    public final int component1() {
        return this.frequency;
    }

    @NotNull
    public final LikesYouNotificationSettingConfig component2() {
        return this.likesYouNotificationSettingConfig;
    }

    @NotNull
    public final LikesYouPushNotificationSetting copy(int i, @NotNull LikesYouNotificationSettingConfig likesYouNotificationSettingConfig) {
        C2668g.b(likesYouNotificationSettingConfig, "likesYouNotificationSettingConfig");
        return new LikesYouPushNotificationSetting(i, likesYouNotificationSettingConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LikesYouPushNotificationSetting) {
            LikesYouPushNotificationSetting likesYouPushNotificationSetting = (LikesYouPushNotificationSetting) obj;
            return (this.frequency == likesYouPushNotificationSetting.frequency ? 1 : null) != null && C2668g.a(this.likesYouNotificationSettingConfig, likesYouPushNotificationSetting.likesYouNotificationSettingConfig);
        }
    }

    public int hashCode() {
        int i = this.frequency * 31;
        LikesYouNotificationSettingConfig likesYouNotificationSettingConfig = this.likesYouNotificationSettingConfig;
        return i + (likesYouNotificationSettingConfig != null ? likesYouNotificationSettingConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LikesYouPushNotificationSetting(frequency=");
        stringBuilder.append(this.frequency);
        stringBuilder.append(", likesYouNotificationSettingConfig=");
        stringBuilder.append(this.likesYouNotificationSettingConfig);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final LikesYouNotificationSettingConfig getLikesYouNotificationSettingConfig() {
        return this.likesYouNotificationSettingConfig;
    }

    public LikesYouPushNotificationSetting(int i, @NotNull LikesYouNotificationSettingConfig likesYouNotificationSettingConfig) {
        C2668g.b(likesYouNotificationSettingConfig, "likesYouNotificationSettingConfig");
        super(PushNotificationType.LIKES_YOU);
        this.frequency = i;
        this.likesYouNotificationSettingConfig = likesYouNotificationSettingConfig;
    }
}
