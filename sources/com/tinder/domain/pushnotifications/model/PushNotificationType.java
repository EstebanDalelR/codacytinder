package com.tinder.domain.pushnotifications.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "", "subscriptionLevel", "Lcom/tinder/domain/pushnotifications/model/SubscriptionLevel;", "(Ljava/lang/String;ILcom/tinder/domain/pushnotifications/model/SubscriptionLevel;)V", "requiresGold", "", "NEW_MATCHES", "MESSAGES", "MESSAGE_LIKES", "SUPER_LIKES", "PLACES", "LIKES_YOU", "TOP_PICKS", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum PushNotificationType {
    ;
    
    private final SubscriptionLevel subscriptionLevel;

    protected PushNotificationType(SubscriptionLevel subscriptionLevel) {
        C2668g.b(subscriptionLevel, "subscriptionLevel");
        this.subscriptionLevel = subscriptionLevel;
    }

    public final boolean requiresGold() {
        return this.subscriptionLevel == SubscriptionLevel.GOLD;
    }
}
