package com.tinder.boost.provider;

import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.provider.k */
public final class C10445k implements MembersInjector<C10443i> {
    /* renamed from: a */
    private final Provider<BoostProfileFacesRepository> f34032a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42310a((C10443i) obj);
    }

    /* renamed from: a */
    public void m42310a(C10443i c10443i) {
        C10445k.m42309a(c10443i, (BoostProfileFacesRepository) this.f34032a.get());
    }

    /* renamed from: a */
    public static void m42309a(C10443i c10443i, BoostProfileFacesRepository boostProfileFacesRepository) {
        c10443i.f34027a = boostProfileFacesRepository;
    }
}
