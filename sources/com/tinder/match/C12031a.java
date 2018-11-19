package com.tinder.match;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.match.a */
public final class C12031a implements MembersInjector<DeleteSponsoredMessageJobService> {
    /* renamed from: a */
    private final Provider<MatchRepository> f39136a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48123a((DeleteSponsoredMessageJobService) obj);
    }

    /* renamed from: a */
    public void m48123a(DeleteSponsoredMessageJobService deleteSponsoredMessageJobService) {
        C12031a.m48122a(deleteSponsoredMessageJobService, (MatchRepository) this.f39136a.get());
    }

    /* renamed from: a */
    public static void m48122a(DeleteSponsoredMessageJobService deleteSponsoredMessageJobService, MatchRepository matchRepository) {
        deleteSponsoredMessageJobService.f39135a = matchRepository;
    }
}
