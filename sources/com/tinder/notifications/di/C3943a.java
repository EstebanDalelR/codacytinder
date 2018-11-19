package com.tinder.notifications.di;

import android.content.res.Resources;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import com.tinder.gold.DropdownOptionsView.C9679a;
import com.tinder.notifications.C9942a;
import com.tinder.notifications.C9943c;
import com.tinder.notifications.C9945f;
import com.tinder.notifications.di.SettingsNotificationComponent.Parent;
import com.tinder.notifications.view.C12151a;
import com.tinder.notifications.view.C12152b;
import com.tinder.notifications.view.C12153c;
import com.tinder.notifications.view.LikesYouNotificationSettingItemView;
import com.tinder.notifications.view.NotificationSettingItemView;
import com.tinder.notifications.view.NotificationSettingsView;
import dagger.internal.C15521i;

/* renamed from: com.tinder.notifications.di.a */
public final class C3943a implements SettingsNotificationComponent {
    /* renamed from: a */
    private Parent f12425a;

    /* renamed from: com.tinder.notifications.di.a$a */
    public static final class C2653a {
        /* renamed from: a */
        private Parent f8356a;

        private C2653a() {
        }

        /* renamed from: a */
        public SettingsNotificationComponent m10149a() {
            if (this.f8356a != null) {
                return new C3943a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2653a m10150a(Parent parent) {
            this.f8356a = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3943a(C2653a c2653a) {
        m15039a(c2653a);
    }

    /* renamed from: a */
    public static C2653a m15035a() {
        return new C2653a();
    }

    /* renamed from: b */
    private C9943c m15040b() {
        return new C9943c((SubscriptionProvider) C15521i.a(this.f12425a.subscriptionProvider(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: c */
    private C9942a m15041c() {
        return new C9942a((NotificationSettingsRepository) C15521i.a(this.f12425a.notificationSettingsRepository(), "Cannot return null from a non-@Nullable component method"), m15040b());
    }

    /* renamed from: d */
    private C9679a m15042d() {
        return new C9679a((Resources) C15521i.a(this.f12425a.resources(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: e */
    private C9945f m15043e() {
        return new C9945f((Resources) C15521i.a(this.f12425a.resources(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: a */
    private void m15039a(C2653a c2653a) {
        this.f12425a = c2653a.f8356a;
    }

    public void inject(NotificationSettingsView notificationSettingsView) {
        m15038a(notificationSettingsView);
    }

    public void inject(LikesYouNotificationSettingItemView likesYouNotificationSettingItemView) {
        m15036a(likesYouNotificationSettingItemView);
    }

    public void inject(NotificationSettingItemView notificationSettingItemView) {
        m15037a(notificationSettingItemView);
    }

    /* renamed from: a */
    private NotificationSettingsView m15038a(NotificationSettingsView notificationSettingsView) {
        C12153c.a(notificationSettingsView, m15041c());
        return notificationSettingsView;
    }

    /* renamed from: a */
    private LikesYouNotificationSettingItemView m15036a(LikesYouNotificationSettingItemView likesYouNotificationSettingItemView) {
        C12151a.a(likesYouNotificationSettingItemView, m15042d());
        return likesYouNotificationSettingItemView;
    }

    /* renamed from: a */
    private NotificationSettingItemView m15037a(NotificationSettingItemView notificationSettingItemView) {
        C12152b.a(notificationSettingItemView, m15043e());
        return notificationSettingItemView;
    }
}
