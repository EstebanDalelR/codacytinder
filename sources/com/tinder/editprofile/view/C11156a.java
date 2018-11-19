package com.tinder.editprofile.view;

import com.tinder.editprofile.p237a.C8947a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.editprofile.view.a */
public final class C11156a implements MembersInjector<EditFeedSettingItemView> {
    /* renamed from: a */
    private final Provider<C8947a> f36067a;

    public /* synthetic */ void injectMembers(Object obj) {
        m43922a((EditFeedSettingItemView) obj);
    }

    /* renamed from: a */
    public void m43922a(EditFeedSettingItemView editFeedSettingItemView) {
        C11156a.m43921a(editFeedSettingItemView, (C8947a) this.f36067a.get());
    }

    /* renamed from: a */
    public static void m43921a(EditFeedSettingItemView editFeedSettingItemView, C8947a c8947a) {
        editFeedSettingItemView.f41825a = c8947a;
    }
}
