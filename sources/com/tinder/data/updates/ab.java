package com.tinder.data.updates;

import com.tinder.data.adapter.C10738l;
import com.tinder.data.database.C8645h;
import com.tinder.data.updates.p332a.C11035a;
import com.tinder.domain.boost.repository.BoostCursorRepository;
import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.match.usecase.BlockMatches;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.updates.PollIntervalRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ab implements Factory<C11085z> {
    /* renamed from: a */
    private final Provider<ac> f41747a;
    /* renamed from: b */
    private final Provider<ai> f41748b;
    /* renamed from: c */
    private final Provider<af> f41749c;
    /* renamed from: d */
    private final Provider<C10738l> f41750d;
    /* renamed from: e */
    private final Provider<C11035a> f41751e;
    /* renamed from: f */
    private final Provider<LastActivityDateRepository> f41752f;
    /* renamed from: g */
    private final Provider<PollIntervalRepository> f41753g;
    /* renamed from: h */
    private final Provider<BoostProfileFacesRepository> f41754h;
    /* renamed from: i */
    private final Provider<BoostCursorRepository> f41755i;
    /* renamed from: j */
    private final Provider<C8645h> f41756j;
    /* renamed from: k */
    private final Provider<BlockMatches> f41757k;
    /* renamed from: l */
    private final Provider<PlacesConfigProvider> f41758l;

    public /* synthetic */ Object get() {
        return m50998a();
    }

    public ab(Provider<ac> provider, Provider<ai> provider2, Provider<af> provider3, Provider<C10738l> provider4, Provider<C11035a> provider5, Provider<LastActivityDateRepository> provider6, Provider<PollIntervalRepository> provider7, Provider<BoostProfileFacesRepository> provider8, Provider<BoostCursorRepository> provider9, Provider<C8645h> provider10, Provider<BlockMatches> provider11, Provider<PlacesConfigProvider> provider12) {
        this.f41747a = provider;
        this.f41748b = provider2;
        this.f41749c = provider3;
        this.f41750d = provider4;
        this.f41751e = provider5;
        this.f41752f = provider6;
        this.f41753g = provider7;
        this.f41754h = provider8;
        this.f41755i = provider9;
        this.f41756j = provider10;
        this.f41757k = provider11;
        this.f41758l = provider12;
    }

    /* renamed from: a */
    public C11085z m50998a() {
        return m50996a(this.f41747a, this.f41748b, this.f41749c, this.f41750d, this.f41751e, this.f41752f, this.f41753g, this.f41754h, this.f41755i, this.f41756j, this.f41757k, this.f41758l);
    }

    /* renamed from: a */
    public static C11085z m50996a(Provider<ac> provider, Provider<ai> provider2, Provider<af> provider3, Provider<C10738l> provider4, Provider<C11035a> provider5, Provider<LastActivityDateRepository> provider6, Provider<PollIntervalRepository> provider7, Provider<BoostProfileFacesRepository> provider8, Provider<BoostCursorRepository> provider9, Provider<C8645h> provider10, Provider<BlockMatches> provider11, Provider<PlacesConfigProvider> provider12) {
        return new C11085z((ac) provider.get(), (ai) provider2.get(), (af) provider3.get(), (C10738l) provider4.get(), (C11035a) provider5.get(), (LastActivityDateRepository) provider6.get(), (PollIntervalRepository) provider7.get(), (BoostProfileFacesRepository) provider8.get(), (BoostCursorRepository) provider9.get(), (C8645h) provider10.get(), (BlockMatches) provider11.get(), (PlacesConfigProvider) provider12.get());
    }

    /* renamed from: b */
    public static ab m50997b(Provider<ac> provider, Provider<ai> provider2, Provider<af> provider3, Provider<C10738l> provider4, Provider<C11035a> provider5, Provider<LastActivityDateRepository> provider6, Provider<PollIntervalRepository> provider7, Provider<BoostProfileFacesRepository> provider8, Provider<BoostCursorRepository> provider9, Provider<C8645h> provider10, Provider<BlockMatches> provider11, Provider<PlacesConfigProvider> provider12) {
        return new ab(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }
}
