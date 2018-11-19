package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dm;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ab implements VoidUseCase<C8415a> {
    /* renamed from: a */
    private final C2630h f34214a;
    /* renamed from: b */
    private final C10522a f34215b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "messageIndex", "contentId", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "getMatchId", "getMessage", "getMessageIndex", "()I", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ab$a */
    public static final class C8415a {
        @NotNull
        /* renamed from: a */
        private final String f29860a;
        /* renamed from: b */
        private final int f29861b;
        @NotNull
        /* renamed from: c */
        private final String f29862c;
        /* renamed from: d */
        private final int f29863d;
        @NotNull
        /* renamed from: e */
        private final String f29864e;
        @Nullable
        /* renamed from: f */
        private final String f29865f;
        @Nullable
        /* renamed from: g */
        private final String f29866g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8415a) {
                C8415a c8415a = (C8415a) obj;
                if (C2668g.a(this.f29860a, c8415a.f29860a)) {
                    if ((this.f29861b == c8415a.f29861b ? 1 : null) != null && C2668g.a(this.f29862c, c8415a.f29862c)) {
                        return (this.f29863d == c8415a.f29863d ? 1 : null) != null && C2668g.a(this.f29864e, c8415a.f29864e) && C2668g.a(this.f29865f, c8415a.f29865f) && C2668g.a(this.f29866g, c8415a.f29866g);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29860a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29861b) * 31;
            String str2 = this.f29862c;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29863d) * 31;
            str2 = this.f29864e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29865f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29866g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29860a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29861b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29862c);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29863d);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29864e);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29865f);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29866g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8415a(@NotNull String str, int i, @NotNull String str2, int i2, @NotNull String str3, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            this.f29860a = str;
            this.f29861b = i;
            this.f29862c = str2;
            this.f29863d = i2;
            this.f29864e = str3;
            this.f29865f = str4;
            this.f29866g = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35887a() {
            return this.f29860a;
        }

        /* renamed from: b */
        public final int m35888b() {
            return this.f29861b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35889c() {
            return this.f29862c;
        }

        /* renamed from: d */
        public final int m35890d() {
            return this.f29863d;
        }

        @NotNull
        /* renamed from: e */
        public final String m35891e() {
            return this.f29864e;
        }

        public /* synthetic */ C8415a(String str, int i, String str2, int i2, String str3, String str4, String str5, int i3, C15823e c15823e) {
            this(str, i, str2, i2, str3, (i3 & 32) != 0 ? (String) null : str4, (i3 & 64) != 0 ? (String) null : str5);
        }

        @Nullable
        /* renamed from: f */
        public final String m35892f() {
            return this.f29865f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35893g() {
            return this.f29866g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatSendErrorOptionsEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ab$b */
    static final class C12677b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ ab f40937a;

        C12677b(ab abVar) {
            this.f40937a = abVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49955a((dm) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49955a(dm dmVar) {
            this.f40937a.f34214a.a(dmVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ab$c */
    static final class C13662c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8415a f43523a;

        C13662c(C8415a c8415a) {
            this.f43523a = c8415a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatSendErrorOptionsEvent logged for matchId: ");
            stringBuilder.append(this.f43523a.m35887a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.ab$d */
    static final class C13663d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13663d f43524a = new C13663d();

        C13663d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53219a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53219a(Throwable th) {
            C0001a.c(th, "ChatSendErrorOptionsEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public ab(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34214a = c2630h;
        this.f34215b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42563a((C8415a) obj);
    }

    /* renamed from: a */
    public void m42563a(@NotNull C8415a c8415a) {
        C2668g.b(c8415a, "request");
        this.f34215b.m42555b(c8415a.m35887a(), c8415a.m35888b(), c8415a.m35889c(), c8415a.m35891e(), c8415a.m35890d(), c8415a.m35892f(), c8415a.m35893g()).d(new C12677b(this)).b().b(Schedulers.io()).a(new C13662c(c8415a), (Action1) C13663d.f43524a);
    }
}
