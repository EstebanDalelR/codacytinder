package com.tinder.tinderplus.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.paywall.viewmodels.C10083b;
import com.tinder.paywall.viewmodels.C10094p;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.model.C15219p.C15218b;
import com.tinder.tinderplus.model.C15219p.C15218b.C15217a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddPlusRestoreEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/tinderplus/analytics/AddPlusRestoreEvent$Params;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "etlEventFactory", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;", "perkOrderResolver", "Lcom/tinder/paywall/viewmodels/PerkOrderResolver;", "firstPerkResolver", "Lcom/tinder/paywall/viewmodels/FirstPerkResolver;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;Lcom/tinder/paywall/viewmodels/PerkOrderResolver;Lcom/tinder/paywall/viewmodels/FirstPerkResolver;)V", "createPlusRestoreOptions", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory$Options;", "paywallConfig", "Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "perks", "", "", "execute", "Lrx/Completable;", "params", "Params", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tinderplus.analytics.b */
public final class C16936b implements CompletableUseCase<C15200a> {
    /* renamed from: a */
    private final C2630h f52208a;
    /* renamed from: b */
    private final C15219p f52209b;
    /* renamed from: c */
    private final C10094p f52210c;
    /* renamed from: d */
    private final C10083b f52211d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddPlusRestoreEvent$Params;", "", "config", "Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "perks", "", "", "(Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;Ljava/util/List;)V", "getConfig", "()Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "getPerks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.b$a */
    public static final class C15200a {
        @NotNull
        /* renamed from: a */
        private final C10074a f47271a;
        @NotNull
        /* renamed from: b */
        private final List<String> f47272b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15200a) {
                    C15200a c15200a = (C15200a) obj;
                    if (C2668g.a(this.f47271a, c15200a.f47271a) && C2668g.a(this.f47272b, c15200a.f47272b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C10074a c10074a = this.f47271a;
            int i = 0;
            int hashCode = (c10074a != null ? c10074a.hashCode() : 0) * 31;
            List list = this.f47272b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Params(config=");
            stringBuilder.append(this.f47271a);
            stringBuilder.append(", perks=");
            stringBuilder.append(this.f47272b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15200a(@NotNull C10074a c10074a, @NotNull List<String> list) {
            C2668g.b(c10074a, "config");
            C2668g.b(list, "perks");
            this.f47271a = c10074a;
            this.f47272b = list;
        }

        @NotNull
        /* renamed from: a */
        public final C10074a m57127a() {
            return this.f47271a;
        }

        @NotNull
        /* renamed from: b */
        public final List<String> m57128b() {
            return this.f47272b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.b$b */
    static final class C18968b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16936b f58657a;
        /* renamed from: b */
        final /* synthetic */ C15200a f58658b;

        C18968b(C16936b c16936b, C15200a c15200a) {
            this.f58657a = c16936b;
            this.f58658b = c15200a;
        }

        public final void call() {
            this.f58657a.f52208a.a(this.f58657a.f52209b.m57272c(this.f58657a.m62618a(this.f58658b.m57127a(), this.f58658b.m57128b())));
        }
    }

    @Inject
    public C16936b(@NotNull C2630h c2630h, @NotNull C15219p c15219p, @NotNull C10094p c10094p, @NotNull C10083b c10083b) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15219p, "etlEventFactory");
        C2668g.b(c10094p, "perkOrderResolver");
        C2668g.b(c10083b, "firstPerkResolver");
        this.f52208a = c2630h;
        this.f52209b = c15219p;
        this.f52210c = c10094p;
        this.f52211d = c10083b;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62622a((C15200a) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62622a(@NotNull C15200a c15200a) {
        C2668g.b(c15200a, "params");
        c15200a = Completable.a(new C18968b(this, c15200a));
        C2668g.a(c15200a, "Completable.fromAction {…addEvent(event)\n        }");
        return c15200a;
    }

    /* renamed from: a */
    private final C15218b m62618a(C10074a c10074a, List<String> list) {
        boolean z = c10074a.a() == PlusPaywallSource.DISCOUNT_NOTIFICATION;
        C15217a b = C15218b.m57256h().mo12634b(c10074a.b());
        C10094p c10094p = this.f52210c;
        C10083b c10083b = this.f52211d;
        PaywallTypeSource a = c10074a.a();
        C2668g.a(a, "paywallConfig.source()");
        c10074a = b.mo12630a(c10094p.a(c10083b.a(a), list, z)).mo12629a(Integer.valueOf(c10074a.a().getAnalyticsSource())).mo12631a(z).mo12632a();
        C2668g.a(c10074a, "TinderPlusEtlEventFactor…\n                .build()");
        return c10074a;
    }
}
