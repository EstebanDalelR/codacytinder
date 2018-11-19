package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.de;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatMediaUnavailableDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatMediaUnavailableDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.s */
public final class C10538s implements VoidUseCase<C8435a> {
    /* renamed from: a */
    private final C2630h f34275a;
    /* renamed from: b */
    private final C10522a f34276b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lcom/tinder/chat/analytics/ChatMediaUnavailableDispatcher$Request;", "", "matchId", "", "message", "messageIndex", "", "contentId", "mediaId", "mediaType", "Lcom/tinder/chat/analytics/MediaType;", "url", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tinder/chat/analytics/MediaType;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getMatchId", "getMediaId", "getMediaType", "()Lcom/tinder/chat/analytics/MediaType;", "getMessage", "getMessageIndex", "()I", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.s$a */
    public static final class C8435a {
        @NotNull
        /* renamed from: a */
        private final String f29955a;
        @NotNull
        /* renamed from: b */
        private final String f29956b;
        /* renamed from: c */
        private final int f29957c;
        @NotNull
        /* renamed from: d */
        private final String f29958d;
        @NotNull
        /* renamed from: e */
        private final String f29959e;
        @NotNull
        /* renamed from: f */
        private final MediaType f29960f;
        @NotNull
        /* renamed from: g */
        private final String f29961g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8435a) {
                C8435a c8435a = (C8435a) obj;
                if (C2668g.a(this.f29955a, c8435a.f29955a) && C2668g.a(this.f29956b, c8435a.f29956b)) {
                    return (this.f29957c == c8435a.f29957c ? 1 : null) != null && C2668g.a(this.f29958d, c8435a.f29958d) && C2668g.a(this.f29959e, c8435a.f29959e) && C2668g.a(this.f29960f, c8435a.f29960f) && C2668g.a(this.f29961g, c8435a.f29961g);
                }
            }
        }

        public int hashCode() {
            String str = this.f29955a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29956b;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29957c) * 31;
            str2 = this.f29958d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29959e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            MediaType mediaType = this.f29960f;
            hashCode = (hashCode + (mediaType != null ? mediaType.hashCode() : 0)) * 31;
            str2 = this.f29961g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29955a);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29956b);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29957c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29958d);
            stringBuilder.append(", mediaId=");
            stringBuilder.append(this.f29959e);
            stringBuilder.append(", mediaType=");
            stringBuilder.append(this.f29960f);
            stringBuilder.append(", url=");
            stringBuilder.append(this.f29961g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8435a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull MediaType mediaType, @NotNull String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            C2668g.b(str4, "mediaId");
            C2668g.b(mediaType, "mediaType");
            C2668g.b(str5, "url");
            this.f29955a = str;
            this.f29956b = str2;
            this.f29957c = i;
            this.f29958d = str3;
            this.f29959e = str4;
            this.f29960f = mediaType;
            this.f29961g = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35987a() {
            return this.f29955a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35988b() {
            return this.f29956b;
        }

        /* renamed from: c */
        public final int m35989c() {
            return this.f29957c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35990d() {
            return this.f29958d;
        }

        @NotNull
        /* renamed from: e */
        public final String m35991e() {
            return this.f29959e;
        }

        @NotNull
        /* renamed from: f */
        public final MediaType m35992f() {
            return this.f29960f;
        }

        @NotNull
        /* renamed from: g */
        public final String m35993g() {
            return this.f29961g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatMediaUnavailableEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.s$b */
    static final class C12702b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10538s f40987a;

        C12702b(C10538s c10538s) {
            this.f40987a = c10538s;
        }

        public /* synthetic */ Object call(Object obj) {
            m50009a((de) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50009a(de deVar) {
            this.f40987a.f34275a.a(deVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.s$c */
    static final class C13698c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8435a f43559a;

        C13698c(C8435a c8435a) {
            this.f43559a = c8435a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatMediaUnavailableEvent logged for matchId: ");
            stringBuilder.append(this.f43559a);
            stringBuilder.append(".matchId");
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.s$d */
    static final class C13699d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13699d f43560a = new C13699d();

        C13699d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53241a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53241a(Throwable th) {
            C0001a.c(th, "ChatMediaUnavailableDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10538s(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34275a = c2630h;
        this.f34276b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42628a((C8435a) obj);
    }

    /* renamed from: a */
    public void m42628a(@NotNull C8435a c8435a) {
        C2668g.b(c8435a, "request");
        C10522a c10522a = this.f34276b;
        String a = c8435a.m35987a();
        String d = c8435a.m35990d();
        c10522a.m42550a(a, c8435a.m35988b(), c8435a.m35989c(), d, c8435a.m35991e(), c8435a.m35992f(), c8435a.m35993g()).d(new C12702b(this)).b().b(Schedulers.io()).a(new C13698c(c8435a), (Action1) C13699d.f43560a);
    }
}
