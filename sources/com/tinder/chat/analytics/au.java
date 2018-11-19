package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.hn;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/analytics/GifSelectEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/GifSelectEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "sendEvent", "Lrx/Single;", "Lcom/tinder/etl/event/GIFSelectEvent;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class au implements VoidUseCase<C8424a> {
    /* renamed from: a */
    private final C2630h f34249a;
    /* renamed from: b */
    private final C10522a f34250b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/tinder/chat/analytics/GifSelectEventDispatcher$Request;", "", "matchId", "", "query", "gifId", "gifUrl", "position", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getGifId", "()Ljava/lang/String;", "getGifUrl", "getMatchId", "getPosition", "()I", "getQuery", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.au$a */
    public static final class C8424a {
        @NotNull
        /* renamed from: a */
        private final String f29905a;
        @NotNull
        /* renamed from: b */
        private final String f29906b;
        @NotNull
        /* renamed from: c */
        private final String f29907c;
        @NotNull
        /* renamed from: d */
        private final String f29908d;
        /* renamed from: e */
        private final int f29909e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8424a) {
                C8424a c8424a = (C8424a) obj;
                if (C2668g.a(this.f29905a, c8424a.f29905a) && C2668g.a(this.f29906b, c8424a.f29906b) && C2668g.a(this.f29907c, c8424a.f29907c) && C2668g.a(this.f29908d, c8424a.f29908d)) {
                    if ((this.f29909e == c8424a.f29909e ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f29905a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29906b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29907c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29908d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + this.f29909e;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29905a);
            stringBuilder.append(", query=");
            stringBuilder.append(this.f29906b);
            stringBuilder.append(", gifId=");
            stringBuilder.append(this.f29907c);
            stringBuilder.append(", gifUrl=");
            stringBuilder.append(this.f29908d);
            stringBuilder.append(", position=");
            stringBuilder.append(this.f29909e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8424a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "query");
            C2668g.b(str3, "gifId");
            C2668g.b(str4, "gifUrl");
            this.f29905a = str;
            this.f29906b = str2;
            this.f29907c = str3;
            this.f29908d = str4;
            this.f29909e = i;
        }

        @NotNull
        /* renamed from: a */
        public final String m35938a() {
            return this.f29905a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35939b() {
            return this.f29906b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35940c() {
            return this.f29907c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35941d() {
            return this.f29908d;
        }

        /* renamed from: e */
        public final int m35942e() {
            return this.f29909e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GIFSelectEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.au$b */
    static final class C12686b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ au f40960a;

        C12686b(au auVar) {
            this.f40960a = auVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49979a((hn) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49979a(hn hnVar) {
            this.f40960a.f34249a.a(hnVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.au$c */
    static final class C13680c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8424a f43541a;

        C13680c(C8424a c8424a) {
            this.f43541a = c8424a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GifSelectEvent logged for matchId: ");
            stringBuilder.append(this.f43541a.m35938a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.au$d */
    static final class C13681d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13681d f43542a = new C13681d();

        C13681d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53229a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53229a(Throwable th) {
            C0001a.c(th, "GifSelectEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public au(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34249a = c2630h;
        this.f34250b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42604a((C8424a) obj);
    }

    /* renamed from: a */
    public void m42604a(@NotNull C8424a c8424a) {
        C2668g.b(c8424a, "request");
        m42603b(c8424a).d(new C12686b(this)).b().b(Schedulers.io()).a(new C13680c(c8424a), (Action1) C13681d.f43542a);
    }

    /* renamed from: b */
    private final Single<hn> m42603b(C8424a c8424a) {
        return this.f34250b.m42552a(c8424a.m35938a(), c8424a.m35939b(), c8424a.m35940c(), c8424a.m35941d(), c8424a.m35942e());
    }
}
