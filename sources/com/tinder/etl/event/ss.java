package com.tinder.etl.event;

class ss implements EtlField<Number> {
    public String description() {
        return "version of push notification (see: https://confluence.gotinder.com/display/ENG/Push+Notifications#PushNotifications-SNSSparksEventsExplained)";
    }

    public String name() {
        return "pushNotificationVersion";
    }

    ss() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
