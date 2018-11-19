package com.tinder.notifications.view;

import com.tinder.notifications.C9945f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.notifications.view.b */
public final class C12152b implements MembersInjector<NotificationSettingItemView> {
    /* renamed from: a */
    private final Provider<C9945f> f39399a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48301a((NotificationSettingItemView) obj);
    }

    /* renamed from: a */
    public void m48301a(NotificationSettingItemView notificationSettingItemView) {
        C12152b.m48300a(notificationSettingItemView, (C9945f) this.f39399a.get());
    }

    /* renamed from: a */
    public static void m48300a(NotificationSettingItemView notificationSettingItemView, C9945f c9945f) {
        notificationSettingItemView.f43096b = c9945f;
    }
}
