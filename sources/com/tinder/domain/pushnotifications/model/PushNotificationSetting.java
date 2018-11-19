package com.tinder.domain.pushnotifications.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "", "type", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "(Lcom/tinder/domain/pushnotifications/model/PushNotificationType;)V", "getType", "()Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "Lcom/tinder/domain/pushnotifications/model/SimplePushNotificationSetting;", "Lcom/tinder/domain/pushnotifications/model/LikesYouPushNotificationSetting;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class PushNotificationSetting {
    @NotNull
    private final PushNotificationType type;

    private PushNotificationSetting(PushNotificationType pushNotificationType) {
        this.type = pushNotificationType;
    }

    @NotNull
    public final PushNotificationType getType() {
        return this.type;
    }
}
