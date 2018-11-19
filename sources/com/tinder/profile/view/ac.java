package com.tinder.profile.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.profile.adapters.C14369o;
import com.tinder.profile.presenter.ak;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ac implements MembersInjector<ProfileView> {
    /* renamed from: a */
    private final Provider<ak> f50319a;
    /* renamed from: b */
    private final Provider<C14369o> f50320b;
    /* renamed from: c */
    private final Provider<Lifecycle> f50321c;
    /* renamed from: d */
    private final Provider<C14548a> f50322d;
    /* renamed from: e */
    private final Provider<C14550a> f50323e;

    public /* synthetic */ void injectMembers(Object obj) {
        m61061a((ProfileView) obj);
    }

    /* renamed from: a */
    public void m61061a(ProfileView profileView) {
        m61058a(profileView, (ak) this.f50319a.get());
        m61057a(profileView, (C14369o) this.f50320b.get());
        m61056a(profileView, (Lifecycle) this.f50321c.get());
        m61059a(profileView, (C14548a) this.f50322d.get());
        m61060a(profileView, (C14550a) this.f50323e.get());
    }

    /* renamed from: a */
    public static void m61058a(ProfileView profileView, ak akVar) {
        profileView.f12466a = akVar;
    }

    /* renamed from: a */
    public static void m61057a(ProfileView profileView, C14369o c14369o) {
        profileView.f12467b = c14369o;
    }

    /* renamed from: a */
    public static void m61056a(ProfileView profileView, Lifecycle lifecycle) {
        profileView.f12468c = lifecycle;
    }

    /* renamed from: a */
    public static void m61059a(ProfileView profileView, C14548a c14548a) {
        profileView.f12469d = c14548a;
    }

    /* renamed from: a */
    public static void m61060a(ProfileView profileView, C14550a c14550a) {
        profileView.f12470e = c14550a;
    }
}
