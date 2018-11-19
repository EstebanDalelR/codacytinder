package com.tinder.notifications.view;

import com.tinder.notifications.C9942a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.notifications.view.c */
public final class C12153c implements MembersInjector<NotificationSettingsView> {
    /* renamed from: a */
    private final Provider<C9942a> f39400a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48303a((NotificationSettingsView) obj);
    }

    /* renamed from: a */
    public void m48303a(NotificationSettingsView notificationSettingsView) {
        C12153c.m48302a(notificationSettingsView, (C9942a) this.f39400a.get());
    }

    /* renamed from: a */
    public static void m48302a(NotificationSettingsView notificationSettingsView, C9942a c9942a) {
        notificationSettingsView.f44622g = c9942a;
    }
}
