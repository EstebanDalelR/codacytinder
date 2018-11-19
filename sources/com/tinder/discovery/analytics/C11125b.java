package com.tinder.discovery.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/discovery/analytics/AddSessionNotificationEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "sessionEventFactory", "Lcom/tinder/discovery/analytics/SessionEventFactory;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/discovery/analytics/SessionEventFactory;Lio/reactivex/Scheduler;)V", "execute", "", "request", "Request", "discovery_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.analytics.b */
public final class C11125b implements VoidUseCase<C8880a> {
    /* renamed from: a */
    private final C2630h f36001a;
    /* renamed from: b */
    private final C8881i f36002b;
    /* renamed from: c */
    private final C15679f f36003c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/discovery/analytics/AddSessionNotificationEvent$Request;", "", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "notificationType", "Lcom/tinder/discovery/analytics/model/NotificationType;", "name", "", "(Lcom/tinder/discovery/model/DiscoverySegment;Lcom/tinder/discovery/analytics/model/NotificationType;Ljava/lang/String;)V", "getDiscoverySegment", "()Lcom/tinder/discovery/model/DiscoverySegment;", "getName", "()Ljava/lang/String;", "getNotificationType", "()Lcom/tinder/discovery/analytics/model/NotificationType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.b$a */
    public static final class C8880a {
        @NotNull
        /* renamed from: a */
        private final DiscoverySegment f31081a;
        @NotNull
        /* renamed from: b */
        private final NotificationType f31082b;
        @Nullable
        /* renamed from: c */
        private final String f31083c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8880a) {
                    C8880a c8880a = (C8880a) obj;
                    if (C2668g.a(this.f31081a, c8880a.f31081a) && C2668g.a(this.f31082b, c8880a.f31082b) && C2668g.a(this.f31083c, c8880a.f31083c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            DiscoverySegment discoverySegment = this.f31081a;
            int i = 0;
            int hashCode = (discoverySegment != null ? discoverySegment.hashCode() : 0) * 31;
            NotificationType notificationType = this.f31082b;
            hashCode = (hashCode + (notificationType != null ? notificationType.hashCode() : 0)) * 31;
            String str = this.f31083c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(discoverySegment=");
            stringBuilder.append(this.f31081a);
            stringBuilder.append(", notificationType=");
            stringBuilder.append(this.f31082b);
            stringBuilder.append(", name=");
            stringBuilder.append(this.f31083c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8880a(@NotNull DiscoverySegment discoverySegment, @NotNull NotificationType notificationType, @Nullable String str) {
            C2668g.b(discoverySegment, "discoverySegment");
            C2668g.b(notificationType, "notificationType");
            this.f31081a = discoverySegment;
            this.f31082b = notificationType;
            this.f31083c = str;
        }

        @NotNull
        /* renamed from: a */
        public final DiscoverySegment m37660a() {
            return this.f31081a;
        }

        @NotNull
        /* renamed from: b */
        public final NotificationType m37661b() {
            return this.f31082b;
        }

        @Nullable
        /* renamed from: c */
        public final String m37662c() {
            return this.f31083c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.b$b */
    static final class C11123b implements Action {
        /* renamed from: a */
        final /* synthetic */ C11125b f35998a;
        /* renamed from: b */
        final /* synthetic */ C8880a f35999b;

        C11123b(C11125b c11125b, C8880a c8880a) {
            this.f35998a = c11125b;
            this.f35999b = c8880a;
        }

        public final void run() {
            this.f35998a.f36001a.a(this.f35998a.f36002b.m37665a(this.f35999b.m37660a(), this.f35999b.m37661b(), this.f35999b.m37662c()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.analytics.b$c */
    static final class C11124c implements Action {
        /* renamed from: a */
        final /* synthetic */ C8880a f36000a;

        C11124c(C8880a c8880a) {
            this.f36000a = c8880a;
        }

        public final void run() {
            C0001a.b("Session.Notification event added for %s, type %s, name %s", new Object[]{this.f36000a.m37660a(), this.f36000a.m37661b(), this.f36000a.m37662c()});
        }
    }

    @Inject
    public C11125b(@NotNull C2630h c2630h, @NotNull C8881i c8881i, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c8881i, "sessionEventFactory");
        C2668g.b(c15679f, "ioScheduler");
        this.f36001a = c2630h;
        this.f36002b = c8881i;
        this.f36003c = c15679f;
    }

    public /* synthetic */ void execute(Object obj) {
        m43865a((C8880a) obj);
    }

    /* renamed from: a */
    public void m43865a(@NotNull C8880a c8880a) {
        C2668g.b(c8880a, "request");
        C3956a b = C3956a.a(new C11123b(this, c8880a)).b(this.f36003c);
        Action c11124c = new C11124c(c8880a);
        c8880a = (Function1) AddSessionNotificationEvent$execute$3.f45314a;
        if (c8880a != null) {
            c8880a = new C11126c(c8880a);
        }
        b.a(c11124c, (Consumer) c8880a);
    }
}
