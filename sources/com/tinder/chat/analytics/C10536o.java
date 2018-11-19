package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dc;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatLongPressMessageEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatLongPressMessageEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.o */
public final class C10536o implements VoidUseCase<C8433a> {
    /* renamed from: a */
    private final C2630h f34271a;
    /* renamed from: b */
    private final C10522a f34272b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tinder/chat/analytics/ChatLongPressMessageEventDispatcher$Request;", "", "matchId", "", "messageType", "", "message", "contentId", "messageIndex", "contentSource", "contentUrl", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentSource", "getContentUrl", "getMatchId", "getMessage", "getMessageIndex", "()I", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.o$a */
    public static final class C8433a {
        @NotNull
        /* renamed from: a */
        private final String f29940a;
        /* renamed from: b */
        private final int f29941b;
        @NotNull
        /* renamed from: c */
        private final String f29942c;
        @NotNull
        /* renamed from: d */
        private final String f29943d;
        /* renamed from: e */
        private final int f29944e;
        @Nullable
        /* renamed from: f */
        private final String f29945f;
        @Nullable
        /* renamed from: g */
        private final String f29946g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8433a) {
                C8433a c8433a = (C8433a) obj;
                if (C2668g.a(this.f29940a, c8433a.f29940a)) {
                    if ((this.f29941b == c8433a.f29941b ? 1 : null) != null && C2668g.a(this.f29942c, c8433a.f29942c) && C2668g.a(this.f29943d, c8433a.f29943d)) {
                        return (this.f29944e == c8433a.f29944e ? 1 : null) != null && C2668g.a(this.f29945f, c8433a.f29945f) && C2668g.a(this.f29946g, c8433a.f29946g);
                    }
                }
            }
        }

        public int hashCode() {
            String str = this.f29940a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29941b) * 31;
            String str2 = this.f29942c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29943d;
            hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f29944e) * 31;
            str2 = this.f29945f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29946g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29940a);
            stringBuilder.append(", messageType=");
            stringBuilder.append(this.f29941b);
            stringBuilder.append(", message=");
            stringBuilder.append(this.f29942c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f29943d);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29944e);
            stringBuilder.append(", contentSource=");
            stringBuilder.append(this.f29945f);
            stringBuilder.append(", contentUrl=");
            stringBuilder.append(this.f29946g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8433a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @Nullable String str5) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "message");
            C2668g.b(str3, "contentId");
            this.f29940a = str;
            this.f29941b = i;
            this.f29942c = str2;
            this.f29943d = str3;
            this.f29944e = i2;
            this.f29945f = str4;
            this.f29946g = str5;
        }

        @NotNull
        /* renamed from: a */
        public final String m35972a() {
            return this.f29940a;
        }

        /* renamed from: b */
        public final int m35973b() {
            return this.f29941b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35974c() {
            return this.f29942c;
        }

        @NotNull
        /* renamed from: d */
        public final String m35975d() {
            return this.f29943d;
        }

        /* renamed from: e */
        public final int m35976e() {
            return this.f29944e;
        }

        @Nullable
        /* renamed from: f */
        public final String m35977f() {
            return this.f29945f;
        }

        @Nullable
        /* renamed from: g */
        public final String m35978g() {
            return this.f29946g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatLongPressMessageEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.o$b */
    static final class C12698b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10536o f40981a;

        C12698b(C10536o c10536o) {
            this.f40981a = c10536o;
        }

        public /* synthetic */ Object call(Object obj) {
            m50001a((dc) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50001a(dc dcVar) {
            this.f40981a.f34271a.a(dcVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.o$c */
    static final class C13694c<T> implements Action1<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C8433a f43555a;

        C13694c(C8433a c8433a) {
            this.f43555a = c8433a;
        }

        public /* synthetic */ void call(Object obj) {
            m53237a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m53237a(C15813i c15813i) {
            c15813i = new StringBuilder();
            c15813i.append("ChatLongPressMessageEvent logged for matchId: ");
            c15813i.append(this.f43555a.m35972a());
            C0001a.b(c15813i.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.o$d */
    static final class C13695d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13695d f43556a = new C13695d();

        C13695d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53238a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53238a(Throwable th) {
            C0001a.c(th, "ChatLongPressMessageEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10536o(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34271a = c2630h;
        this.f34272b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42624a((C8433a) obj);
    }

    /* renamed from: a */
    public void m42624a(@NotNull C8433a c8433a) {
        C2668g.b(c8433a, "request");
        this.f34272b.m42558c(c8433a.m35972a(), c8433a.m35973b(), c8433a.m35974c(), c8433a.m35975d(), c8433a.m35976e(), c8433a.m35977f(), c8433a.m35978g()).d(new C12698b(this)).b(Schedulers.io()).a(new C13694c(c8433a), (Action1) C13695d.f43556a);
    }
}
