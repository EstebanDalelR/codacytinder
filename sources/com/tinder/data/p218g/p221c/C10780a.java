package com.tinder.data.p218g.p221c;

import android.content.SharedPreferences;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/settings/source/SharedPreferencesNotificationSettingsSource;", "Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "notificationSettingsKeyMap", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "Lcom/tinder/data/settings/source/SharedPreferencesNotificationSettingsSource$SettingsValues;", "disablePushNotification", "", "pushNotificationType", "enablePushNotification", "getLikesYouNotificationFrequency", "", "isPushNotificationEnabled", "", "saveLikesYouNotificationFrequency", "frequency", "togglePushNotification", "enabled", "SettingsValues", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.g.c.a */
public final class C10780a implements NotificationSettingsSource {
    /* renamed from: a */
    private final Map<PushNotificationType, C8666a> f35208a = ae.a(new Pair[]{C15811g.a(PushNotificationType.NEW_MATCHES, new C8666a("KEY_NEW_MATCH_PUSH_ENABLED", true)), C15811g.a(PushNotificationType.MESSAGES, new C8666a("KEY_NEW_MESSAGE_PUSH_ENABLED", true)), C15811g.a(PushNotificationType.MESSAGE_LIKES, new C8666a("KEY_MESSAGE_LIKE_PUSH_ENABLED", true)), C15811g.a(PushNotificationType.SUPER_LIKES, new C8666a("KEY_SUPERLIKE_PUSH_ENABLED", true)), C15811g.a(PushNotificationType.TOP_PICKS, new C8666a("KEY_TOP_PiCKS_PUSH_ENABLED", true)), C15811g.a(PushNotificationType.PLACES, new C8666a("KEY_PLACES_PUSH_ENABLED", true))});
    /* renamed from: b */
    private final SharedPreferences f35209b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/settings/source/SharedPreferencesNotificationSettingsSource$SettingsValues;", "", "key", "", "defaultVal", "", "(Ljava/lang/String;Z)V", "getDefaultVal", "()Z", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.g.c.a$a */
    public static final class C8666a {
        @NotNull
        /* renamed from: a */
        private final String f30519a;
        /* renamed from: b */
        private final boolean f30520b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8666a) {
                C8666a c8666a = (C8666a) obj;
                if (C2668g.a(this.f30519a, c8666a.f30519a)) {
                    if ((this.f30520b == c8666a.f30520b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30519a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i = this.f30520b;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SettingsValues(key=");
            stringBuilder.append(this.f30519a);
            stringBuilder.append(", defaultVal=");
            stringBuilder.append(this.f30520b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8666a(@NotNull String str, boolean z) {
            C2668g.b(str, "key");
            this.f30519a = str;
            this.f30520b = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m36938a() {
            return this.f30519a;
        }

        /* renamed from: b */
        public final boolean m36939b() {
            return this.f30520b;
        }
    }

    @Inject
    public C10780a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f35209b = sharedPreferences;
    }

    public boolean isPushNotificationEnabled(@NotNull PushNotificationType pushNotificationType) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        C8666a c8666a = (C8666a) this.f35208a.get(pushNotificationType);
        return c8666a != null ? this.f35209b.getBoolean(c8666a.m36938a(), c8666a.m36939b()) : null;
    }

    public void enablePushNotification(@NotNull PushNotificationType pushNotificationType) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        m43234a(pushNotificationType, true);
    }

    public void disablePushNotification(@NotNull PushNotificationType pushNotificationType) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        m43234a(pushNotificationType, false);
    }

    /* renamed from: a */
    private final void m43234a(PushNotificationType pushNotificationType, boolean z) {
        C8666a c8666a = (C8666a) this.f35208a.get(pushNotificationType);
        if (c8666a != null) {
            this.f35209b.edit().putBoolean(c8666a.m36938a(), z).apply();
        }
    }

    public int getLikesYouNotificationFrequency() {
        return this.f35209b.getInt("KEY_FAST_MATCH_NOTIFICATION_FREQUENCY", 1);
    }

    public void saveLikesYouNotificationFrequency(int i) {
        this.f35209b.edit().putInt("KEY_FAST_MATCH_NOTIFICATION_FREQUENCY", i).apply();
    }
}
