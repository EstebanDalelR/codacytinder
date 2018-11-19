package com.tinder.data.toppicks.store;

import android.content.SharedPreferences;
import com.tinder.domain.toppicks.model.TopPicksRefreshTime;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/data/toppicks/store/TopPicksSharedPreferencesDataStore;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "areTopPicksNotificationsAllowed", "", "clearNotificationJobId", "", "getCachedTopPicksCount", "", "getNotificationJobId", "", "getNotificationScheduleTime", "", "getRefreshTime", "Lcom/tinder/domain/toppicks/model/TopPicksRefreshTime;", "getTopPicksNotificationMessage", "hasSeenTutorial", "isDailyPushEnabled", "isTopPicksEnabled", "markTutorialAsSeen", "saveNotificationJobId", "id", "saveNotificationScheduleTime", "notificationTime", "saveRefreshTime", "refreshTime", "setCachedTopPicksCount", "count", "setDailyPushEnabled", "enabled", "setTopPicksEnabled", "setTopPicksNotificationMessage", "message", "setTopPicksNotificationsAllowed", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.store.a */
public final class C8798a {
    /* renamed from: a */
    private final SharedPreferences f30874a;

    @Inject
    public C8798a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f30874a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m37443a(@NotNull TopPicksRefreshTime topPicksRefreshTime) {
        C2668g.b(topPicksRefreshTime, "refreshTime");
        this.f30874a.edit().putLong("KEY_TOP_PICKS_REFRESH_TIME", topPicksRefreshTime.getTime().getMillis()).apply();
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksRefreshTime m37440a() {
        return new TopPicksRefreshTime(new DateTime(this.f30874a.getLong("KEY_TOP_PICKS_REFRESH_TIME", 0)));
    }

    /* renamed from: b */
    public final void m37446b() {
        this.f30874a.edit().putBoolean("KEY_HAS_SEEN_TOP_PICKS_TUTORIAL", true).apply();
    }

    /* renamed from: c */
    public final boolean m37449c() {
        return this.f30874a.getBoolean("KEY_HAS_SEEN_TOP_PICKS_TUTORIAL", false);
    }

    /* renamed from: a */
    public final void m37445a(boolean z) {
        this.f30874a.edit().putBoolean("KEY_IS_TOP_PICKS_ENABLED", z).apply();
    }

    /* renamed from: d */
    public final boolean m37450d() {
        return this.f30874a.getBoolean("KEY_IS_TOP_PICKS_ENABLED", false);
    }

    /* renamed from: a */
    public final void m37444a(@NotNull String str) {
        C2668g.b(str, "id");
        this.f30874a.edit().putString("KEY_TOP_PICKS_DAILY_NOTIFICATION_ID", str).apply();
    }

    @Nullable
    /* renamed from: e */
    public final String m37451e() {
        return this.f30874a.getString("KEY_TOP_PICKS_DAILY_NOTIFICATION_ID", null);
    }

    /* renamed from: f */
    public final void m37452f() {
        this.f30874a.edit().remove("KEY_TOP_PICKS_DAILY_NOTIFICATION_ID").apply();
    }

    /* renamed from: a */
    public final void m37442a(long j) {
        this.f30874a.edit().putLong("KEY_TOP_PICKS_DAILY_NOTIFICATION_TIME", j).apply();
    }

    /* renamed from: g */
    public final long m37453g() {
        return this.f30874a.getLong("KEY_TOP_PICKS_DAILY_NOTIFICATION_TIME", 0);
    }

    /* renamed from: b */
    public final void m37447b(@NotNull String str) {
        C2668g.b(str, "message");
        this.f30874a.edit().putString("KEY_TOP_PICKS_NOTIFICATION_MESSAGE", str).apply();
    }

    @NotNull
    /* renamed from: h */
    public final String m37454h() {
        String string = this.f30874a.getString("KEY_TOP_PICKS_NOTIFICATION_MESSAGE", "");
        C2668g.a(string, "sharedPreferences.getStr…NOTIFICATION_MESSAGE, \"\")");
        return string;
    }

    /* renamed from: b */
    public final void m37448b(boolean z) {
        this.f30874a.edit().putBoolean("KEY_TOP_PICKS_DAILY_NOTIFICATIONS_ALLOWED", z).apply();
    }

    /* renamed from: i */
    public final boolean m37455i() {
        return this.f30874a.getBoolean("KEY_TOP_PICKS_DAILY_NOTIFICATIONS_ALLOWED", false);
    }

    /* renamed from: a */
    public final void m37441a(int i) {
        this.f30874a.edit().putInt("KEY_TOP_PICKS_CACHED_COUNT", i).apply();
    }

    /* renamed from: j */
    public final int m37456j() {
        return this.f30874a.getInt("KEY_TOP_PICKS_CACHED_COUNT", 0);
    }
}
