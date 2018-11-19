package com.tinder.domain.toppicks.repo;

import com.tinder.domain.toppicks.model.TopPicksRefreshTime;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nH&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\fH&J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0007H&J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "", "areNotificationsAllowed", "", "clearNotificationJobId", "", "getNotificationJobId", "", "getNotificationMessage", "getNotificationScheduleTime", "", "getTopPicksRefreshTime", "Lcom/tinder/domain/toppicks/model/TopPicksRefreshTime;", "hasSeenTutorial", "isDailyPushEnabled", "isTopPicksEnabled", "markTutorialAsSeen", "resetNotificationScheduleTime", "saveNotificationJobId", "id", "saveNotificationScheduleTime", "notificationTime", "saveTopPicksRefreshTime", "topPicksRefreshTime", "setAreNotificationsAllowed", "allowed", "setNotificationMessage", "message", "setTopPicksEnabled", "enabled", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksApplicationRepository {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long DEFAULT_NOTIFICATION_SCHEDULE_TIME = 0;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository$Companion;", "", "()V", "DEFAULT_NOTIFICATION_SCHEDULE_TIME", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long DEFAULT_NOTIFICATION_SCHEDULE_TIME = 0;

        private Companion() {
        }
    }

    boolean areNotificationsAllowed();

    void clearNotificationJobId();

    @Nullable
    String getNotificationJobId();

    @NotNull
    String getNotificationMessage();

    long getNotificationScheduleTime();

    @NotNull
    TopPicksRefreshTime getTopPicksRefreshTime();

    boolean hasSeenTutorial();

    boolean isDailyPushEnabled();

    boolean isTopPicksEnabled();

    void markTutorialAsSeen();

    void resetNotificationScheduleTime();

    void saveNotificationJobId(@NotNull String str);

    void saveNotificationScheduleTime(long j);

    void saveTopPicksRefreshTime(@NotNull TopPicksRefreshTime topPicksRefreshTime);

    void setAreNotificationsAllowed(boolean z);

    void setNotificationMessage(@NotNull String str);

    void setTopPicksEnabled(boolean z);
}
