package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dv;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatClientUnifiedEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatClientUnifiedEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.i */
public final class C10532i implements VoidUseCase<C8429a> {
    /* renamed from: a */
    private final C2630h f34263a;
    /* renamed from: b */
    private final C10522a f34264b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/analytics/ChatClientUnifiedEventDispatcher$Request;", "", "redshiftMapping", "", "matchId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getRedshiftMapping", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.i$a */
    public static final class C8429a {
        @NotNull
        /* renamed from: a */
        private final String f29921a;
        @NotNull
        /* renamed from: b */
        private final String f29922b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8429a) {
                    C8429a c8429a = (C8429a) obj;
                    if (C2668g.a(this.f29921a, c8429a.f29921a) && C2668g.a(this.f29922b, c8429a.f29922b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f29921a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29922b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(redshiftMapping=");
            stringBuilder.append(this.f29921a);
            stringBuilder.append(", matchId=");
            stringBuilder.append(this.f29922b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8429a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "redshiftMapping");
            C2668g.b(str2, "matchId");
            this.f29921a = str;
            this.f29922b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m35953a() {
            return this.f29921a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35954b() {
            return this.f29922b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ClientUnifiedEventEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.i$b */
    static final class C12692b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10532i f40973a;

        C12692b(C10532i c10532i) {
            this.f40973a = c10532i;
        }

        public /* synthetic */ Object call(Object obj) {
            m49991a((dv) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49991a(dv dvVar) {
            this.f40973a.f34263a.a(dvVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.i$c */
    static final class C13686c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8429a f43547a;

        C13686c(C8429a c8429a) {
            this.f43547a = c8429a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatClientUnifiedEvent logged matchId: ");
            stringBuilder.append(this.f43547a.m35954b());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.i$d */
    static final class C13687d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13687d f43548a = new C13687d();

        C13687d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53232a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53232a(Throwable th) {
            C0001a.c(th, "ChatClientUnifiedEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10532i(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34263a = c2630h;
        this.f34264b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42616a((C8429a) obj);
    }

    /* renamed from: a */
    public void m42616a(@NotNull C8429a c8429a) {
        C2668g.b(c8429a, "request");
        this.f34264b.m42556b(c8429a.m35953a(), c8429a.m35954b()).d(new C12692b(this)).b().b(Schedulers.io()).a(new C13686c(c8429a), (Action1) C13687d.f43548a);
    }
}
