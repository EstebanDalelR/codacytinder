package com.tinder.notifications.view;

import com.tinder.gold.DropdownOptionsView.C9679a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.notifications.view.a */
public final class C12151a implements MembersInjector<LikesYouNotificationSettingItemView> {
    /* renamed from: a */
    private final Provider<C9679a> f39398a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48299a((LikesYouNotificationSettingItemView) obj);
    }

    /* renamed from: a */
    public void m48299a(LikesYouNotificationSettingItemView likesYouNotificationSettingItemView) {
        C12151a.m48298a(likesYouNotificationSettingItemView, (C9679a) this.f39398a.get());
    }

    /* renamed from: a */
    public static void m48298a(LikesYouNotificationSettingItemView likesYouNotificationSettingItemView, C9679a c9679a) {
        likesYouNotificationSettingItemView.f39390b = c9679a;
    }
}
