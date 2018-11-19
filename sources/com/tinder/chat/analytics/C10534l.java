package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.da;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatEndEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatEndEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.l */
public final class C10534l implements VoidUseCase<C8431a> {
    /* renamed from: a */
    private final C2630h f34267a;
    /* renamed from: b */
    private final C10522a f34268b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tinder/chat/analytics/ChatEndEventDispatcher$Request;", "", "matchId", "", "durationMs", "", "hasUnsentMessage", "", "(Ljava/lang/String;JZ)V", "getDurationMs", "()J", "getHasUnsentMessage", "()Z", "getMatchId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.l$a */
    public static final class C8431a {
        @NotNull
        /* renamed from: a */
        private final String f29930a;
        /* renamed from: b */
        private final long f29931b;
        /* renamed from: c */
        private final boolean f29932c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8431a) {
                C8431a c8431a = (C8431a) obj;
                if (C2668g.a(this.f29930a, c8431a.f29930a)) {
                    if ((this.f29931b == c8431a.f29931b ? 1 : null) != null) {
                        if ((this.f29932c == c8431a.f29932c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f29930a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.f29931b;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            int i = this.f29932c;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29930a);
            stringBuilder.append(", durationMs=");
            stringBuilder.append(this.f29931b);
            stringBuilder.append(", hasUnsentMessage=");
            stringBuilder.append(this.f29932c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8431a(@NotNull String str, long j, boolean z) {
            C2668g.b(str, "matchId");
            this.f29930a = str;
            this.f29931b = j;
            this.f29932c = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m35962a() {
            return this.f29930a;
        }

        /* renamed from: b */
        public final long m35963b() {
            return this.f29931b;
        }

        /* renamed from: c */
        public final boolean m35964c() {
            return this.f29932c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatEndEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.l$b */
    static final class C12695b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10534l f40977a;

        C12695b(C10534l c10534l) {
            this.f40977a = c10534l;
        }

        public /* synthetic */ Object call(Object obj) {
            m49996a((da) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49996a(da daVar) {
            this.f40977a.f34267a.a(daVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.l$c */
    static final class C13690c implements Action0 {
        /* renamed from: a */
        public static final C13690c f43551a = new C13690c();

        C13690c() {
        }

        public final void call() {
            C0001a.b("ChatEndEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.l$d */
    static final class C13691d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13691d f43552a = new C13691d();

        C13691d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53234a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53234a(Throwable th) {
            C0001a.c(th, "ChatEndEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10534l(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34267a = c2630h;
        this.f34268b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42620a((C8431a) obj);
    }

    /* renamed from: a */
    public void m42620a(@NotNull C8431a c8431a) {
        C2668g.b(c8431a, "request");
        this.f34268b.m42546a(c8431a.m35962a(), c8431a.m35963b(), c8431a.m35964c()).d(new C12695b(this)).b().b(Schedulers.io()).a(C13690c.f43551a, C13691d.f43552a);
    }
}
