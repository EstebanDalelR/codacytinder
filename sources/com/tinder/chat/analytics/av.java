package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.ho;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/analytics/GifShownEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/GifShownEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/GIFShownEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class av implements VoidUseCase<C8425a> {
    /* renamed from: a */
    private final C2630h f34251a;
    /* renamed from: b */
    private final C10522a f34252b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/tinder/chat/analytics/GifShownEventDispatcher$Request;", "", "matchId", "", "query", "gifId", "gifUrl", "gifPosition", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getGifId", "()Ljava/lang/String;", "getGifPosition", "()I", "getGifUrl", "getMatchId", "getQuery", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.av$a */
    public static final class C8425a {
        @NotNull
        /* renamed from: a */
        private final String f29910a;
        @NotNull
        /* renamed from: b */
        private final String f29911b;
        @NotNull
        /* renamed from: c */
        private final String f29912c;
        @NotNull
        /* renamed from: d */
        private final String f29913d;
        /* renamed from: e */
        private final int f29914e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8425a) {
                C8425a c8425a = (C8425a) obj;
                if (C2668g.a(this.f29910a, c8425a.f29910a) && C2668g.a(this.f29911b, c8425a.f29911b) && C2668g.a(this.f29912c, c8425a.f29912c) && C2668g.a(this.f29913d, c8425a.f29913d)) {
                    if ((this.f29914e == c8425a.f29914e ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f29910a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29911b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29912c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29913d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + this.f29914e;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29910a);
            stringBuilder.append(", query=");
            stringBuilder.append(this.f29911b);
            stringBuilder.append(", gifId=");
            stringBuilder.append(this.f29912c);
            stringBuilder.append(", gifUrl=");
            stringBuilder.append(this.f29913d);
            stringBuilder.append(", gifPosition=");
            stringBuilder.append(this.f29914e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8425a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "query");
            C2668g.b(str3, "gifId");
            C2668g.b(str4, "gifUrl");
            this.f29910a = str;
            this.f29911b = str2;
            this.f29912c = str3;
            this.f29913d = str4;
            this.f29914e = i;
        }

        @NotNull
        /* renamed from: a */
        public final String m35943a() {
            return this.f29910a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35944b() {
            return this.f29911b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35945c() {
            return this.f29912c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35946d() {
            return this.f29913d;
        }

        /* renamed from: e */
        public final int m35947e() {
            return this.f29914e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GIFShownEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.av$b */
    static final class C12687b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ av f40961a;

        C12687b(av avVar) {
            this.f40961a = avVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49980a((ho) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49980a(ho hoVar) {
            this.f40961a.f34251a.a(hoVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.av$c */
    static final class C13682c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8425a f43543a;

        C13682c(C8425a c8425a) {
            this.f43543a = c8425a;
        }

        public final void call() {
            C8425a c8425a = this.f43543a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GifShownEvent logged for query: ");
            stringBuilder.append('\'');
            stringBuilder.append(c8425a.m35944b());
            stringBuilder.append("', gifId: ");
            stringBuilder.append(c8425a.m35945c());
            stringBuilder.append(", url: ");
            stringBuilder.append(c8425a.m35946d());
            stringBuilder.append(", position: ");
            stringBuilder.append(c8425a.m35947e());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.av$d */
    static final class C13683d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ av f43544a;

        C13683d(av avVar) {
            this.f43544a = avVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53230a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53230a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f43544a.getClass().getSimpleName());
            stringBuilder.append(" failed.");
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public av(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34251a = c2630h;
        this.f34252b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42607a((C8425a) obj);
    }

    /* renamed from: a */
    public void m42607a(@NotNull C8425a c8425a) {
        C2668g.b(c8425a, "request");
        m42606b(c8425a).d(new C12687b(this)).b().b(Schedulers.io()).a(new C13682c(c8425a), (Action1) new C13683d(this));
    }

    /* renamed from: b */
    private final Single<ho> m42606b(C8425a c8425a) {
        return this.f34252b.m42557b(c8425a.m35943a(), c8425a.m35944b(), c8425a.m35945c(), c8425a.m35946d(), c8425a.m35947e());
    }
}
