package com.tinder.account.analytics;

import com.tinder.etl.event.C11328i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory;", "", "()V", "create", "Lcom/tinder/etl/event/AccountThirdPartyIntegrationEvent;", "integrationAction", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationAction;", "integrationFrom", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationFrom;", "integrationPartner", "Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationPartner;", "integrationSuccess", "", "IntegrationAction", "IntegrationFrom", "IntegrationPartner", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AccountThirdPartyIntegrationEventFactory {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONNECT", "DISCONNECT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum IntegrationAction {
        ;
        
        @NotNull
        private final String value;

        protected IntegrationAction(String str) {
            C2668g.m10309b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationFrom;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SETTINGS", "MODAL", "CHAT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum IntegrationFrom {
        ;
        
        @NotNull
        private final String value;

        protected IntegrationFrom(String str) {
            C2668g.m10309b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/account/analytics/AccountThirdPartyIntegrationEventFactory$IntegrationPartner;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SNAPCHAT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum IntegrationPartner {
        ;
        
        @NotNull
        private final String value;

        protected IntegrationPartner(String str) {
            C2668g.m10309b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @NotNull
    /* renamed from: a */
    public final C11328i m9778a(@NotNull IntegrationAction integrationAction, @NotNull IntegrationFrom integrationFrom, @NotNull IntegrationPartner integrationPartner, boolean z) {
        C2668g.m10309b(integrationAction, "integrationAction");
        C2668g.m10309b(integrationFrom, "integrationFrom");
        C2668g.m10309b(integrationPartner, "integrationPartner");
        Object a = C11328i.a().a(integrationAction.getValue()).b(integrationFrom.getValue()).c(integrationPartner.getValue()).a(Boolean.valueOf(z)).a();
        C2668g.m10305a(a, "AccountThirdPartyIntegra…\n                .build()");
        return a;
    }
}
