package com.tinder.profile.view;

import com.tinder.profile.p362a.C14358a;
import com.tinder.profile.view.ProfileInstagramView.C14446a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.p */
public final class C16163p implements MembersInjector<ProfileInstagramView> {
    /* renamed from: a */
    private final Provider<C14358a> f50338a;
    /* renamed from: b */
    private final Provider<C14446a> f50339b;

    public /* synthetic */ void injectMembers(Object obj) {
        m61085a((ProfileInstagramView) obj);
    }

    /* renamed from: a */
    public void m61085a(ProfileInstagramView profileInstagramView) {
        C16163p.m61083a(profileInstagramView, (C14358a) this.f50338a.get());
        C16163p.m61084a(profileInstagramView, this.f50339b.get());
    }

    /* renamed from: a */
    public static void m61083a(ProfileInstagramView profileInstagramView, C14358a c14358a) {
        profileInstagramView.f45774a = c14358a;
    }

    /* renamed from: a */
    public static void m61084a(ProfileInstagramView profileInstagramView, Object obj) {
        profileInstagramView.f45775b = (C14446a) obj;
    }
}
