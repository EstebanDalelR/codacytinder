package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.cy;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatDeleteMessageEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatDeleteMessageEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.j */
public final class C10533j implements VoidUseCase<C8430a> {
    /* renamed from: a */
    private final C2630h f34265a;
    /* renamed from: b */
    private final C10522a f34266b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tinder/chat/analytics/ChatDeleteMessageEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "messageIndex", "contentId", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "getMatchId", "getMessage", "getMessageIndex", "()I", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.j$a */
    public static final class C8430a {
        @NotNull
        /* renamed from: a */
        private final String f29923a;
        /* renamed from: b */
        private final int f29924b;
        @NotNull
        /* renamed from: c */
        private final String f29925c;
        /* renamed from: d */
        private final int f29926d;
        @NotNull
        /* renamed from: e */
        private final String f29927e;
        @Nullable
        /* renamed from: f */
        private final String f29928f;
        @Nullable
        /* renamed from: g */
        private final String f29929g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8430a) {
                C8430a c8430a = (C8430a) obj;
                if (C2668g.a(this.f29923a, c8430a.f29923a)) {
                    if ((this.f29924b == c8430a.f29924b ? 1 : null) != null && C2668g.a(this.f29925c, c8430a.f29925c)) {
                        return (this.f29926d == c8430a.f29926d ? 1 : null) != null && C2668g.a(this.f29927e, c8430a.f29927e) && C2668g.a(this.f29928f, c8430a.f29928f) && C2668g.a(this.f29929g, c8430a.f29929g);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29923a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29924b) * 31;
            String str2 = this.f29925c;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29926d) * 31;
            str2 = this.f29927e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29928f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29929g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29923a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29924b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29925c);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29926d);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29927e);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29928f);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29929g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8430a(@NotNull String str, int i, @NotNull String str2, int i2, @NotNull String str3, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            this.f29923a = str;
            this.f29924b = i;
            this.f29925c = str2;
            this.f29926d = i2;
            this.f29927e = str3;
            this.f29928f = str4;
            this.f29929g = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35955a() {
            return this.f29923a;
        }

        /* renamed from: b */
        public final int m35956b() {
            return this.f29924b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35957c() {
            return this.f29925c;
        }

        /* renamed from: d */
        public final int m35958d() {
            return this.f29926d;
        }

        @NotNull
        /* renamed from: e */
        public final String m35959e() {
            return this.f29927e;
        }

        @Nullable
        /* renamed from: f */
        public final String m35960f() {
            return this.f29928f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35961g() {
            return this.f29929g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatDeleteMessageEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.j$b */
    static final class C12693b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10533j f40974a;

        C12693b(C10533j c10533j) {
            this.f40974a = c10533j;
        }

        public /* synthetic */ Object call(Object obj) {
            m49992a((cy) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49992a(cy cyVar) {
            this.f40974a.f34265a.a(cyVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.j$c */
    static final class C13688c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8430a f43549a;

        C13688c(C8430a c8430a) {
            this.f43549a = c8430a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatDeleteMessageEvent logged for matchId: ");
            stringBuilder.append(this.f43549a.m35955a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.j$d */
    static final class C13689d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13689d f43550a = new C13689d();

        C13689d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53233a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53233a(Throwable th) {
            C0001a.c(th, "ChatDeleteMessageEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10533j(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34265a = c2630h;
        this.f34266b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42618a((C8430a) obj);
    }

    /* renamed from: a */
    public void m42618a(@NotNull C8430a c8430a) {
        C2668g.b(c8430a, "request");
        this.f34266b.m42560d(c8430a.m35955a(), c8430a.m35956b(), c8430a.m35957c(), c8430a.m35959e(), c8430a.m35958d(), c8430a.m35960f(), c8430a.m35961g()).d(new C12693b(this)).b().b(Schedulers.io()).a(new C13688c(c8430a), (Action1) C13689d.f43550a);
    }
}
