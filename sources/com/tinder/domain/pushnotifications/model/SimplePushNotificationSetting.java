package com.tinder.domain.pushnotifications.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/pushnotifications/model/SimplePushNotificationSetting;", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "pushNotificationType", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "channelEnabled", "", "enabled", "(Lcom/tinder/domain/pushnotifications/model/PushNotificationType;ZZ)V", "getChannelEnabled", "()Z", "getEnabled", "getPushNotificationType", "()Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SimplePushNotificationSetting extends PushNotificationSetting {
    private final boolean channelEnabled;
    private final boolean enabled;
    @NotNull
    private final PushNotificationType pushNotificationType;

    @NotNull
    public static /* synthetic */ SimplePushNotificationSetting copy$default(SimplePushNotificationSetting simplePushNotificationSetting, PushNotificationType pushNotificationType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            pushNotificationType = simplePushNotificationSetting.pushNotificationType;
        }
        if ((i & 2) != 0) {
            z = simplePushNotificationSetting.channelEnabled;
        }
        if ((i & 4) != 0) {
            z2 = simplePushNotificationSetting.enabled;
        }
        return simplePushNotificationSetting.copy(pushNotificationType, z, z2);
    }

    @NotNull
    public final PushNotificationType component1() {
        return this.pushNotificationType;
    }

    public final boolean component2() {
        return this.channelEnabled;
    }

    public final boolean component3() {
        return this.enabled;
    }

    @NotNull
    public final SimplePushNotificationSetting copy(@NotNull PushNotificationType pushNotificationType, boolean z, boolean z2) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        return new SimplePushNotificationSetting(pushNotificationType, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimplePushNotificationSetting) {
            SimplePushNotificationSetting simplePushNotificationSetting = (SimplePushNotificationSetting) obj;
            if (C2668g.a(this.pushNotificationType, simplePushNotificationSetting.pushNotificationType)) {
                if ((this.channelEnabled == simplePushNotificationSetting.channelEnabled ? 1 : null) != null) {
                    if ((this.enabled == simplePushNotificationSetting.enabled ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        PushNotificationType pushNotificationType = this.pushNotificationType;
        int hashCode = (pushNotificationType != null ? pushNotificationType.hashCode() : 0) * 31;
        int i = this.channelEnabled;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.enabled;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SimplePushNotificationSetting(pushNotificationType=");
        stringBuilder.append(this.pushNotificationType);
        stringBuilder.append(", channelEnabled=");
        stringBuilder.append(this.channelEnabled);
        stringBuilder.append(", enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public final PushNotificationType getPushNotificationType() {
        return this.pushNotificationType;
    }

    public final boolean getChannelEnabled() {
        return this.channelEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public SimplePushNotificationSetting(@NotNull PushNotificationType pushNotificationType, boolean z, boolean z2) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        super(pushNotificationType);
        this.pushNotificationType = pushNotificationType;
        this.channelEnabled = z;
        this.enabled = z2;
    }
}
