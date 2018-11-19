package com.tinder.data.toppicks;

import com.tinder.data.toppicks.store.C8798a;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import com.tinder.domain.toppicks.model.TopPicksRefreshTime;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/data/toppicks/TopPicksApplicationDataRepository;", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "topPicksSharedPreferencesDataStore", "Lcom/tinder/data/toppicks/store/TopPicksSharedPreferencesDataStore;", "notificationSettingsSource", "Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "(Lcom/tinder/data/toppicks/store/TopPicksSharedPreferencesDataStore;Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;)V", "areNotificationsAllowed", "", "clearNotificationJobId", "", "getNotificationJobId", "", "getNotificationMessage", "getNotificationScheduleTime", "", "getTopPicksRefreshTime", "Lcom/tinder/domain/toppicks/model/TopPicksRefreshTime;", "hasSeenTutorial", "isDailyPushEnabled", "isTopPicksEnabled", "markTutorialAsSeen", "resetNotificationScheduleTime", "saveNotificationJobId", "id", "saveNotificationScheduleTime", "notificationTime", "saveTopPicksRefreshTime", "topPicksRefreshTime", "setAreNotificationsAllowed", "allowed", "setNotificationMessage", "message", "setTopPicksEnabled", "enabled", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.k */
public final class C11017k implements TopPicksApplicationRepository {
    /* renamed from: a */
    private final C8798a f35762a;
    /* renamed from: b */
    private final NotificationSettingsSource f35763b;

    @Inject
    public C11017k(@NotNull C8798a c8798a, @NotNull NotificationSettingsSource notificationSettingsSource) {
        C2668g.b(c8798a, "topPicksSharedPreferencesDataStore");
        C2668g.b(notificationSettingsSource, "notificationSettingsSource");
        this.f35762a = c8798a;
        this.f35763b = notificationSettingsSource;
    }

    public boolean isDailyPushEnabled() {
        return this.f35763b.isPushNotificationEnabled(PushNotificationType.TOP_PICKS);
    }

    public void saveTopPicksRefreshTime(@NotNull TopPicksRefreshTime topPicksRefreshTime) {
        C2668g.b(topPicksRefreshTime, "topPicksRefreshTime");
        this.f35762a.m37443a(topPicksRefreshTime);
    }

    @NotNull
    public TopPicksRefreshTime getTopPicksRefreshTime() {
        return this.f35762a.m37440a();
    }

    public void markTutorialAsSeen() {
        this.f35762a.m37446b();
    }

    public boolean hasSeenTutorial() {
        return this.f35762a.m37449c();
    }

    public void setTopPicksEnabled(boolean z) {
        this.f35762a.m37445a(z);
    }

    public boolean isTopPicksEnabled() {
        return this.f35762a.m37450d();
    }

    public void saveNotificationJobId(@NotNull String str) {
        C2668g.b(str, "id");
        this.f35762a.m37444a(str);
    }

    @Nullable
    public String getNotificationJobId() {
        return this.f35762a.m37451e();
    }

    public void clearNotificationJobId() {
        this.f35762a.m37452f();
    }

    public void saveNotificationScheduleTime(long j) {
        this.f35762a.m37442a(j);
    }

    public void resetNotificationScheduleTime() {
        this.f35762a.m37442a(0);
    }

    public long getNotificationScheduleTime() {
        return this.f35762a.m37453g();
    }

    public void setNotificationMessage(@NotNull String str) {
        C2668g.b(str, "message");
        this.f35762a.m37447b(str);
    }

    @NotNull
    public String getNotificationMessage() {
        return this.f35762a.m37454h();
    }

    public void setAreNotificationsAllowed(boolean z) {
        this.f35762a.m37448b(z);
    }

    public boolean areNotificationsAllowed() {
        return this.f35762a.m37455i();
    }
}
