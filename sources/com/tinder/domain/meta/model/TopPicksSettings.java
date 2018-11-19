package com.tinder.domain.meta.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/meta/model/TopPicksSettings;", "", "isEnabled", "", "areNotificationsAllowed", "notificationMessage", "", "dailyNotificationOffsets", "", "", "(ZZLjava/lang/String;Ljava/util/Map;)V", "getAreNotificationsAllowed", "()Z", "getDailyNotificationOffsets", "()Ljava/util/Map;", "getNotificationMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksSettings {
    private final boolean areNotificationsAllowed;
    @NotNull
    private final Map<String, Integer> dailyNotificationOffsets;
    private final boolean isEnabled;
    @NotNull
    private final String notificationMessage;

    @NotNull
    public static /* synthetic */ TopPicksSettings copy$default(TopPicksSettings topPicksSettings, boolean z, boolean z2, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = topPicksSettings.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = topPicksSettings.areNotificationsAllowed;
        }
        if ((i & 4) != 0) {
            str = topPicksSettings.notificationMessage;
        }
        if ((i & 8) != 0) {
            map = topPicksSettings.dailyNotificationOffsets;
        }
        return topPicksSettings.copy(z, z2, str, map);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final boolean component2() {
        return this.areNotificationsAllowed;
    }

    @NotNull
    public final String component3() {
        return this.notificationMessage;
    }

    @NotNull
    public final Map<String, Integer> component4() {
        return this.dailyNotificationOffsets;
    }

    @NotNull
    public final TopPicksSettings copy(boolean z, boolean z2, @NotNull String str, @NotNull Map<String, Integer> map) {
        C2668g.b(str, "notificationMessage");
        C2668g.b(map, "dailyNotificationOffsets");
        return new TopPicksSettings(z, z2, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopPicksSettings) {
            TopPicksSettings topPicksSettings = (TopPicksSettings) obj;
            if ((this.isEnabled == topPicksSettings.isEnabled ? 1 : null) != null) {
                return (this.areNotificationsAllowed == topPicksSettings.areNotificationsAllowed ? 1 : null) != null && C2668g.a(this.notificationMessage, topPicksSettings.notificationMessage) && C2668g.a(this.dailyNotificationOffsets, topPicksSettings.dailyNotificationOffsets);
            }
        }
    }

    public int hashCode() {
        int i = this.isEnabled;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.areNotificationsAllowed;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        String str = this.notificationMessage;
        int i3 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.dailyNotificationOffsets;
        if (map != null) {
            i3 = map.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPicksSettings(isEnabled=");
        stringBuilder.append(this.isEnabled);
        stringBuilder.append(", areNotificationsAllowed=");
        stringBuilder.append(this.areNotificationsAllowed);
        stringBuilder.append(", notificationMessage=");
        stringBuilder.append(this.notificationMessage);
        stringBuilder.append(", dailyNotificationOffsets=");
        stringBuilder.append(this.dailyNotificationOffsets);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPicksSettings(boolean z, boolean z2, @NotNull String str, @NotNull Map<String, Integer> map) {
        C2668g.b(str, "notificationMessage");
        C2668g.b(map, "dailyNotificationOffsets");
        this.isEnabled = z;
        this.areNotificationsAllowed = z2;
        this.notificationMessage = str;
        this.dailyNotificationOffsets = map;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean getAreNotificationsAllowed() {
        return this.areNotificationsAllowed;
    }

    @NotNull
    public final String getNotificationMessage() {
        return this.notificationMessage;
    }

    @NotNull
    public final Map<String, Integer> getDailyNotificationOffsets() {
        return this.dailyNotificationOffsets;
    }
}
