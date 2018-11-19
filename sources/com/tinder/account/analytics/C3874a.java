package com.tinder.account.analytics;

import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationAction;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationFrom;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationPartner;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.etl.event.EtlEvent;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "accountThirdPartyIntegrationEventFactory", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory;Lio/reactivex/Scheduler;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.analytics.a */
public final class C3874a implements VoidUseCase<C2613a> {
    /* renamed from: a */
    private final C2630h f12135a;
    /* renamed from: b */
    private final AccountThirdPartyIntegrationEventFactory f12136b;
    /* renamed from: c */
    private final C15679f f12137c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/tinder/account/analytics/AddAccountThirdPartyIntegrationEvent$Request;", "", "integrationAction", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationAction;", "integrationFrom", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationFrom;", "integrationPartner", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationPartner;", "integrationSuccess", "", "(Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationAction;Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationFrom;Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationPartner;Z)V", "getIntegrationAction", "()Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationAction;", "getIntegrationFrom", "()Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationFrom;", "getIntegrationPartner", "()Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationPartner;", "getIntegrationSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.analytics.a$a */
    public static final class C2613a {
        @NotNull
        /* renamed from: a */
        private final IntegrationAction f8147a;
        @NotNull
        /* renamed from: b */
        private final IntegrationFrom f8148b;
        @NotNull
        /* renamed from: c */
        private final IntegrationPartner f8149c;
        /* renamed from: d */
        private final boolean f8150d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2613a) {
                C2613a c2613a = (C2613a) obj;
                if (C2668g.m10308a(this.f8147a, c2613a.f8147a) && C2668g.m10308a(this.f8148b, c2613a.f8148b) && C2668g.m10308a(this.f8149c, c2613a.f8149c)) {
                    if ((this.f8150d == c2613a.f8150d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            IntegrationAction integrationAction = this.f8147a;
            int i = 0;
            int hashCode = (integrationAction != null ? integrationAction.hashCode() : 0) * 31;
            IntegrationFrom integrationFrom = this.f8148b;
            hashCode = (hashCode + (integrationFrom != null ? integrationFrom.hashCode() : 0)) * 31;
            IntegrationPartner integrationPartner = this.f8149c;
            if (integrationPartner != null) {
                i = integrationPartner.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f8150d;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(integrationAction=");
            stringBuilder.append(this.f8147a);
            stringBuilder.append(", integrationFrom=");
            stringBuilder.append(this.f8148b);
            stringBuilder.append(", integrationPartner=");
            stringBuilder.append(this.f8149c);
            stringBuilder.append(", integrationSuccess=");
            stringBuilder.append(this.f8150d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C2613a(@NotNull IntegrationAction integrationAction, @NotNull IntegrationFrom integrationFrom, @NotNull IntegrationPartner integrationPartner, boolean z) {
            C2668g.m10309b(integrationAction, "integrationAction");
            C2668g.m10309b(integrationFrom, "integrationFrom");
            C2668g.m10309b(integrationPartner, "integrationPartner");
            this.f8147a = integrationAction;
            this.f8148b = integrationFrom;
            this.f8149c = integrationPartner;
            this.f8150d = z;
        }

        @NotNull
        /* renamed from: a */
        public final IntegrationAction m9779a() {
            return this.f8147a;
        }

        @NotNull
        /* renamed from: b */
        public final IntegrationFrom m9780b() {
            return this.f8148b;
        }

        @NotNull
        /* renamed from: c */
        public final IntegrationPartner m9781c() {
            return this.f8149c;
        }

        /* renamed from: d */
        public final boolean m9782d() {
            return this.f8150d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.analytics.a$b */
    static final class C3872b implements Action {
        /* renamed from: a */
        final /* synthetic */ C3874a f12132a;
        /* renamed from: b */
        final /* synthetic */ C2613a f12133b;

        C3872b(C3874a c3874a, C2613a c2613a) {
            this.f12132a = c3874a;
            this.f12133b = c2613a;
        }

        public final void run() {
            this.f12132a.f12135a.m9860a((EtlEvent) this.f12132a.f12136b.m9778a(this.f12133b.m9779a(), this.f12133b.m9780b(), this.f12133b.m9781c(), this.f12133b.m9782d()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.analytics.a$c */
    static final class C3873c implements Action {
        /* renamed from: a */
        final /* synthetic */ C2613a f12134a;

        C3873c(C2613a c2613a) {
            this.f12134a = c2613a;
        }

        public final void run() {
            C0001a.m25b("Account.ThirdPartyIntegration added: action %s, from %s, partner %s, success: %s", this.f12134a.m9779a(), this.f12134a.m9780b(), this.f12134a.m9781c(), Boolean.valueOf(this.f12134a.m9782d()));
        }
    }

    @Inject
    public C3874a(@NotNull C2630h c2630h, @NotNull AccountThirdPartyIntegrationEventFactory accountThirdPartyIntegrationEventFactory, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.m10309b(c2630h, "fireworks");
        C2668g.m10309b(accountThirdPartyIntegrationEventFactory, "accountThirdPartyIntegrationEventFactory");
        C2668g.m10309b(c15679f, "ioScheduler");
        this.f12135a = c2630h;
        this.f12136b = accountThirdPartyIntegrationEventFactory;
        this.f12137c = c15679f;
    }

    public /* synthetic */ void execute(Object obj) {
        m14618a((C2613a) obj);
    }

    /* renamed from: a */
    public void m14618a(@NotNull C2613a c2613a) {
        C2668g.m10309b(c2613a, "request");
        C3956a b = C3956a.m15275a((Action) new C3872b(this, c2613a)).m15294b(this.f12137c);
        Action c3873c = new C3873c(c2613a);
        c2613a = (Function1) AddAccountThirdPartyIntegrationEvent$execute$3.f14815a;
        if (c2613a != null) {
            c2613a = new C3875b(c2613a);
        }
        b.m15288a(c3873c, (Consumer) c2613a);
    }
}
