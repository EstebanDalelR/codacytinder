package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.cx;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatCancelSendErrorOptionEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatCancelSendErrorOptionEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.g */
public final class C10531g implements VoidUseCase<C8428a> {
    /* renamed from: a */
    private final C2630h f34261a;
    /* renamed from: b */
    private final C10522a f34262b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tinder/chat/analytics/ChatCancelSendErrorOptionEventDispatcher$Request;", "", "matchId", "", "messageIndex", "", "buttonType", "(Ljava/lang/String;ILjava/lang/String;)V", "getButtonType", "()Ljava/lang/String;", "getMatchId", "getMessageIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.g$a */
    public static final class C8428a {
        @NotNull
        /* renamed from: a */
        private final String f29918a;
        /* renamed from: b */
        private final int f29919b;
        @NotNull
        /* renamed from: c */
        private final String f29920c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8428a) {
                C8428a c8428a = (C8428a) obj;
                if (C2668g.a(this.f29918a, c8428a.f29918a)) {
                    return (this.f29919b == c8428a.f29919b ? 1 : null) != null && C2668g.a(this.f29920c, c8428a.f29920c);
                }
            }
        }

        public int hashCode() {
            String str = this.f29918a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f29919b) * 31;
            String str2 = this.f29920c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29918a);
            stringBuilder.append(", messageIndex=");
            stringBuilder.append(this.f29919b);
            stringBuilder.append(", buttonType=");
            stringBuilder.append(this.f29920c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8428a(@NotNull String str, int i, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "buttonType");
            this.f29918a = str;
            this.f29919b = i;
            this.f29920c = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m35950a() {
            return this.f29918a;
        }

        /* renamed from: b */
        public final int m35951b() {
            return this.f29919b;
        }

        @NotNull
        /* renamed from: c */
        public final String m35952c() {
            return this.f29920c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/tinder/etl/event/ChatCancelSendErrorOptionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.g$b */
    static final class C12690b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10531g f40970a;

        C12690b(C10531g c10531g) {
            this.f40970a = c10531g;
        }

        public /* synthetic */ Object call(Object obj) {
            m49987a((cx) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49987a(cx cxVar) {
            this.f40970a.f34261a.a(cxVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.g$c */
    static final class C13684c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8428a f43545a;

        C13684c(C8428a c8428a) {
            this.f43545a = c8428a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatCancelSendErrorOptionEvent logged for matchId: ");
            stringBuilder.append(this.f43545a.m35950a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.g$d */
    static final class C13685d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13685d f43546a = new C13685d();

        C13685d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53231a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53231a(Throwable th) {
            C0001a.c(th, "ChatCancelSendErrorOptionEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10531g(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34261a = c2630h;
        this.f34262b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42614a((C8428a) obj);
    }

    /* renamed from: a */
    public void m42614a(@NotNull C8428a c8428a) {
        C2668g.b(c8428a, "request");
        this.f34262b.m42540a(c8428a.m35950a(), c8428a.m35951b(), c8428a.m35952c()).d(new C12690b(this)).b().b(Schedulers.io()).a(new C13684c(c8428a), (Action1) C13685d.f43546a);
    }
}
