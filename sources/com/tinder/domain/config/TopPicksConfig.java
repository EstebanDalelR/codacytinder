package com.tinder.domain.config;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/config/TopPicksConfig;", "", "isEnabled", "", "notificationOffset", "", "pushNotificationEnabled", "notificationMessage", "tooltipSwipeThreshold", "", "(ZLjava/lang/String;ZLjava/lang/String;I)V", "()Z", "getNotificationMessage", "()Ljava/lang/String;", "getNotificationOffset", "getPushNotificationEnabled", "getTooltipSwipeThreshold", "()I", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksConfig {
    private final boolean isEnabled;
    @NotNull
    private final String notificationMessage;
    @NotNull
    private final String notificationOffset;
    private final boolean pushNotificationEnabled;
    private final int tooltipSwipeThreshold;

    public TopPicksConfig(boolean z, @NotNull String str, boolean z2, @NotNull String str2, int i) {
        C2668g.b(str, "notificationOffset");
        C2668g.b(str2, "notificationMessage");
        this.isEnabled = z;
        this.notificationOffset = str;
        this.pushNotificationEnabled = z2;
        this.notificationMessage = str2;
        this.tooltipSwipeThreshold = i;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public final String getNotificationOffset() {
        return this.notificationOffset;
    }

    public final boolean getPushNotificationEnabled() {
        return this.pushNotificationEnabled;
    }

    @NotNull
    public final String getNotificationMessage() {
        return this.notificationMessage;
    }

    public final int getTooltipSwipeThreshold() {
        return this.tooltipSwipeThreshold;
    }
}
