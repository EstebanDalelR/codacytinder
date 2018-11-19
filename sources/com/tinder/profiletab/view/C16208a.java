package com.tinder.profiletab.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.profiletab.p368b.C14461a;
import com.tinder.profiletab.presenter.C14476x;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.view.a */
public final class C16208a implements MembersInjector<ProfileTabView> {
    /* renamed from: a */
    private final Provider<C14476x> f50446a;
    /* renamed from: b */
    private final Provider<Lifecycle> f50447b;
    /* renamed from: c */
    private final Provider<C14461a> f50448c;

    public /* synthetic */ void injectMembers(Object obj) {
        m61161a((ProfileTabView) obj);
    }

    /* renamed from: a */
    public void m61161a(ProfileTabView profileTabView) {
        C16208a.m61160a(profileTabView, (C14476x) this.f50446a.get());
        C16208a.m61158a(profileTabView, (Lifecycle) this.f50447b.get());
        C16208a.m61159a(profileTabView, (C14461a) this.f50448c.get());
    }

    /* renamed from: a */
    public static void m61160a(ProfileTabView profileTabView, C14476x c14476x) {
        profileTabView.f12484b = c14476x;
    }

    /* renamed from: a */
    public static void m61158a(ProfileTabView profileTabView, Lifecycle lifecycle) {
        profileTabView.f12485c = lifecycle;
    }

    /* renamed from: a */
    public static void m61159a(ProfileTabView profileTabView, C14461a c14461a) {
        profileTabView.f12486d = c14461a;
    }
}
