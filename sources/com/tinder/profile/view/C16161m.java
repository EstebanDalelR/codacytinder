package com.tinder.profile.view;

import com.tinder.profile.adapters.C14368m;
import com.tinder.spotify.p416b.C18162n;
import com.tinder.spotify.p416b.C18165v;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.m */
public final class C16161m implements MembersInjector<ProfileAnthemView> {
    /* renamed from: a */
    private final Provider<C18165v> f50334a;
    /* renamed from: b */
    private final Provider<C18162n> f50335b;
    /* renamed from: c */
    private final Provider<C14368m> f50336c;

    public /* synthetic */ void injectMembers(Object obj) {
        m61080a((ProfileAnthemView) obj);
    }

    /* renamed from: a */
    public void m61080a(ProfileAnthemView profileAnthemView) {
        C16161m.m61079a(profileAnthemView, (C18165v) this.f50334a.get());
        C16161m.m61078a(profileAnthemView, (C18162n) this.f50335b.get());
        C16161m.m61077a(profileAnthemView, (C14368m) this.f50336c.get());
    }

    /* renamed from: a */
    public static void m61079a(ProfileAnthemView profileAnthemView, C18165v c18165v) {
        profileAnthemView.f50243a = c18165v;
    }

    /* renamed from: a */
    public static void m61078a(ProfileAnthemView profileAnthemView, C18162n c18162n) {
        profileAnthemView.f50244b = c18162n;
    }

    /* renamed from: a */
    public static void m61077a(ProfileAnthemView profileAnthemView, C14368m c14368m) {
        profileAnthemView.f50245c = c14368m;
    }
}
