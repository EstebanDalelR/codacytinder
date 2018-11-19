package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dq;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ah implements VoidUseCase<C8419a> {
    /* renamed from: a */
    private final C2630h f34222a;
    /* renamed from: b */
    private final C10522a f34223b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher$Request;", "", "matchId", "", "message", "url", "messageSentDate", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getMatchId", "()Ljava/lang/String;", "getMessage", "getMessageSentDate", "()Lorg/joda/time/DateTime;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ah$a */
    public static final class C8419a {
        @NotNull
        /* renamed from: a */
        private final String f29885a;
        @NotNull
        /* renamed from: b */
        private final String f29886b;
        @NotNull
        /* renamed from: c */
        private final String f29887c;
        @NotNull
        /* renamed from: d */
        private final DateTime f29888d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8419a) {
                    C8419a c8419a = (C8419a) obj;
                    if (C2668g.a(this.f29885a, c8419a.f29885a) && C2668g.a(this.f29886b, c8419a.f29886b) && C2668g.a(this.f29887c, c8419a.f29887c) && C2668g.a(this.f29888d, c8419a.f29888d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f29885a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29886b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29887c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            DateTime dateTime = this.f29888d;
            if (dateTime != null) {
                i = dateTime.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29885a);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29886b);
            stringBuilder.append(", url=");
            stringBuilder.append(this.f29887c);
            stringBuilder.append(", messageSentDate=");
            stringBuilder.append(this.f29888d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8419a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DateTime dateTime) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "url");
            C2668g.b(dateTime, "messageSentDate");
            this.f29885a = str;
            this.f29886b = str2;
            this.f29887c = str3;
            this.f29888d = dateTime;
        }

        @NotNull
        /* renamed from: a */
        public final String m35912a() {
            return this.f29885a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35913b() {
            return this.f29886b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35914c() {
            return this.f29887c;
        }

        @NotNull
        /* renamed from: d */
        public final DateTime m35915d() {
            return this.f29888d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatTapLinkEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ah$b */
    static final class C12681b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ ah f40945a;

        C12681b(ah ahVar) {
            this.f40945a = ahVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49965a((dq) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49965a(dq dqVar) {
            this.f40945a.f34222a.a(dqVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ah$c */
    static final class C13670c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8419a f43531a;

        C13670c(C8419a c8419a) {
            this.f43531a = c8419a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatTapLinkEvent logged for matchId: ");
            stringBuilder.append(this.f43531a.m35912a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ah$d */
    static final class C13671d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13671d f43532a = new C13671d();

        C13671d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53223a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53223a(Throwable th) {
            C0001a.c(th, "ChatTapLinkEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public ah(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34222a = c2630h;
        this.f34223b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42571a((C8419a) obj);
    }

    /* renamed from: a */
    public void m42571a(@NotNull C8419a c8419a) {
        C2668g.b(c8419a, "request");
        this.f34223b.m42538a(c8419a.m35912a(), c8419a.m35913b(), c8419a.m35914c(), c8419a.m35915d()).k(new C12681b(this)).b().b(Schedulers.io()).a(new C13670c(c8419a), (Action1) C13671d.f43532a);
    }
}
