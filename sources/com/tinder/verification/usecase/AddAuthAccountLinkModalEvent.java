package com.tinder.verification.usecase;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.be;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\t\n\u000bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent;", "Lkotlin/Function1;", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Request;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "invoke", "request", "Action", "Request", "Value", "verification_release"}, k = 1, mv = {1, 1, 10})
public final class AddAuthAccountLinkModalEvent implements Function1<C15389a, C15813i> {
    /* renamed from: a */
    private final C2630h f56628a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Action;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "SHOW", "HIDE", "verification_release"}, k = 1, mv = {1, 1, 10})
    public enum Action {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Action(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Value;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "DISMISSIBLE", "NON_DISMISSIBLE", "REMIND_ME_LATER", "VIEW_FAQ", "VERIFY", "APP_CLOSE", "verification_release"}, k = 1, mv = {1, 1, 10})
    public enum Value {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Value(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Request;", "", "action", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Action;", "value", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Value;", "(Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Action;Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Value;)V", "getAction", "()Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Action;", "getValue", "()Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Value;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "verification_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.usecase.AddAuthAccountLinkModalEvent$a */
    public static final class C15389a {
        @NotNull
        /* renamed from: a */
        private final Action f47661a;
        @NotNull
        /* renamed from: b */
        private final Value f47662b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15389a) {
                    C15389a c15389a = (C15389a) obj;
                    if (C2668g.a(this.f47661a, c15389a.f47661a) && C2668g.a(this.f47662b, c15389a.f47662b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Action action = this.f47661a;
            int i = 0;
            int hashCode = (action != null ? action.hashCode() : 0) * 31;
            Value value = this.f47662b;
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(action=");
            stringBuilder.append(this.f47661a);
            stringBuilder.append(", value=");
            stringBuilder.append(this.f47662b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15389a(@NotNull Action action, @NotNull Value value) {
            C2668g.b(action, "action");
            C2668g.b(value, "value");
            this.f47661a = action;
            this.f47662b = value;
        }

        @NotNull
        /* renamed from: a */
        public final Action m57719a() {
            return this.f47661a;
        }

        @NotNull
        /* renamed from: b */
        public final Value m57720b() {
            return this.f47662b;
        }
    }

    public AddAuthAccountLinkModalEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f56628a = c2630h;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m66233a((C15389a) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public void m66233a(@NotNull C15389a c15389a) {
        C2668g.b(c15389a, "request");
        this.f56628a.a(be.a().a(c15389a.m57719a().getAnalyticsValue()).b(c15389a.m57720b().getAnalyticsValue()).a());
    }
}
