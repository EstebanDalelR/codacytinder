package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dd;
import com.tinder.model.analytics.AnalyticsConstants;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatLongPressOptionEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatLongPressOptionEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.q */
public final class C10537q implements VoidUseCase<C8434a> {
    /* renamed from: a */
    private final C2630h f34273a;
    /* renamed from: b */
    private final C10522a f34274b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006%"}, d2 = {"Lcom/tinder/chat/analytics/ChatLongPressOptionEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "contentId", "messageIndex", "button", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButton", "()Ljava/lang/String;", "getContentId", "getContentSource", "getContentUrl", "getMatchId", "getMessage", "getMessageIndex", "()I", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.q$a */
    public static final class C8434a {
        @NotNull
        /* renamed from: a */
        private final String f29947a;
        /* renamed from: b */
        private final int f29948b;
        @NotNull
        /* renamed from: c */
        private final String f29949c;
        @NotNull
        /* renamed from: d */
        private final String f29950d;
        /* renamed from: e */
        private final int f29951e;
        @NotNull
        /* renamed from: f */
        private final String f29952f;
        @Nullable
        /* renamed from: g */
        private final String f29953g;
        @Nullable
        /* renamed from: h */
        private final String f29954h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8434a) {
                C8434a c8434a = (C8434a) obj;
                if (C2668g.a(this.f29947a, c8434a.f29947a)) {
                    if ((this.f29948b == c8434a.f29948b ? 1 : null) != null && C2668g.a(this.f29949c, c8434a.f29949c) && C2668g.a(this.f29950d, c8434a.f29950d)) {
                        return (this.f29951e == c8434a.f29951e ? 1 : null) != null && C2668g.a(this.f29952f, c8434a.f29952f) && C2668g.a(this.f29953g, c8434a.f29953g) && C2668g.a(this.f29954h, c8434a.f29954h);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29947a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29948b) * 31;
            String str2 = this.f29949c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29950d;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29951e) * 31;
            str2 = this.f29952f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29953g;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29954h;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29947a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29948b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29949c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29950d);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29951e);
            stringBuilder.append(", button=");
            stringBuilder.append(this.f29952f);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29953g);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29954h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8434a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            C2668g.b(str4, AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON);
            this.f29947a = str;
            this.f29948b = i;
            this.f29949c = str2;
            this.f29950d = str3;
            this.f29951e = i2;
            this.f29952f = str4;
            this.f29953g = str5;
            this.f29954h = str6;
        }

        @NotNull
        /* renamed from: a */
        public final String m35979a() {
            return this.f29947a;
        }

        /* renamed from: b */
        public final int m35980b() {
            return this.f29948b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35981c() {
            return this.f29949c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35982d() {
            return this.f29950d;
        }

        /* renamed from: e */
        public final int m35983e() {
            return this.f29951e;
        }

        @NotNull
        /* renamed from: f */
        public final String m35984f() {
            return this.f29952f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35985g() {
            return this.f29953g;
        }

        @Nullable
        /* renamed from: h */
        public final String m35986h() {
            return this.f29954h;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatLongPressOptionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.q$b */
    static final class C12700b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10537q f40984a;

        C12700b(C10537q c10537q) {
            this.f40984a = c10537q;
        }

        public /* synthetic */ Object call(Object obj) {
            m50005a((dd) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50005a(dd ddVar) {
            this.f40984a.f34273a.a(ddVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.q$c */
    static final class C13696c<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C8434a f43557a;

        C13696c(C8434a c8434a) {
            this.f43557a = c8434a;
        }

        public /* synthetic */ void call(Object obj) {
            m53239a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m53239a(C15813i c15813i) {
            c15813i = new StringBuilder();
            c15813i.append("ChatLongPressOptionEvent logged for matchId: ");
            c15813i.append(this.f43557a.m35979a());
            C0001a.b(c15813i.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.q$d */
    static final class C13697d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13697d f43558a = new C13697d();

        C13697d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53240a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53240a(Throwable th) {
            C0001a.c(th, "ChatLongPressOptionEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10537q(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34273a = c2630h;
        this.f34274b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42626a((C8434a) obj);
    }

    /* renamed from: a */
    public void m42626a(@NotNull C8434a c8434a) {
        C2668g.b(c8434a, "request");
        this.f34274b.m42544a(c8434a.m35979a(), c8434a.m35980b(), c8434a.m35981c(), c8434a.m35982d(), c8434a.m35983e(), c8434a.m35984f(), c8434a.m35985g(), c8434a.m35986h()).d(new C12700b(this)).b(Schedulers.io()).a(new C13696c(c8434a), (Action1) C13697d.f43558a);
    }
}
