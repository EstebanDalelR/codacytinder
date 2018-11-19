package com.tinder.tinderplus.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.paywall.viewmodels.C10083b;
import com.tinder.paywall.viewmodels.C10094p;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.model.C15219p.C15218b;
import com.tinder.tinderplus.model.C15219p.C15218b.C15217a;
import com.tinder.tinderplus.p428a.C15193i;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddPlusPurchaseEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "etlEventFactory", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;", "perksOrderResolver", "Lcom/tinder/paywall/viewmodels/PerkOrderResolver;", "firstPerkResolver", "Lcom/tinder/paywall/viewmodels/FirstPerkResolver;", "tinderPlusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;Lcom/tinder/paywall/viewmodels/PerkOrderResolver;Lcom/tinder/paywall/viewmodels/FirstPerkResolver;Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;)V", "createPlusRestoreOptions", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory$Options;", "paywallConfig", "execute", "Lrx/Completable;", "config", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tinderplus.analytics.a */
public final class C16935a implements CompletableUseCase<C10074a> {
    /* renamed from: a */
    private final C2630h f52203a;
    /* renamed from: b */
    private final C15219p f52204b;
    /* renamed from: c */
    private final C10094p f52205c;
    /* renamed from: d */
    private final C10083b f52206d;
    /* renamed from: e */
    private final C15193i f52207e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.a$a */
    static final class C18967a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16935a f58655a;
        /* renamed from: b */
        final /* synthetic */ C10074a f58656b;

        C18967a(C16935a c16935a, C10074a c10074a) {
            this.f58655a = c16935a;
            this.f58656b = c10074a;
        }

        public final void call() {
            this.f58655a.f52203a.a(this.f58655a.f52204b.m57271b(this.f58655a.m62616b(this.f58656b)));
        }
    }

    @Inject
    public C16935a(@NotNull C2630h c2630h, @NotNull C15219p c15219p, @NotNull C10094p c10094p, @NotNull C10083b c10083b, @NotNull C15193i c15193i) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15219p, "etlEventFactory");
        C2668g.b(c10094p, "perksOrderResolver");
        C2668g.b(c10083b, "firstPerkResolver");
        C2668g.b(c15193i, "tinderPlusInteractor");
        this.f52203a = c2630h;
        this.f52204b = c15219p;
        this.f52205c = c10094p;
        this.f52206d = c10083b;
        this.f52207e = c15193i;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62617a((C10074a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62617a(@NotNull C10074a c10074a) {
        C2668g.b(c10074a, "config");
        c10074a = Completable.a(new C18967a(this, c10074a));
        C2668g.a(c10074a, "Completable.fromAction {…addEvent(event)\n        }");
        return c10074a;
    }

    /* renamed from: b */
    private final C15218b m62616b(C10074a c10074a) {
        boolean z = c10074a.a() == PlusPaywallSource.DISCOUNT_NOTIFICATION;
        C15217a b = C15218b.m57256h().mo12634b(c10074a.b());
        C10094p c10094p = this.f52205c;
        C10083b c10083b = this.f52206d;
        PaywallTypeSource a = c10074a.a();
        C2668g.a(a, "paywallConfig.source()");
        PaywallPerk a2 = c10083b.a(a);
        List d = this.f52207e.m57124d();
        C2668g.a(d, "tinderPlusInteractor.perks");
        c10074a = b.mo12630a(c10094p.a(a2, d, z)).mo12629a(Integer.valueOf(c10074a.a().getAnalyticsSource())).mo12631a(z).mo12632a();
        C2668g.a(c10074a, "TinderPlusEtlEventFactor…\n                .build()");
        return c10074a;
    }
}
