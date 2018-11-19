package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dh;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.v */
public final class C10540v implements VoidUseCase<C8437a> {
    /* renamed from: a */
    private final C2630h f34279a;
    /* renamed from: b */
    private final C10522a f34280b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher$Request;", "", "matchId", "", "openProfileFrom", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getOpenProfileFrom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.v$a */
    public static final class C8437a {
        @NotNull
        /* renamed from: a */
        private final String f29965a;
        @NotNull
        /* renamed from: b */
        private final String f29966b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8437a) {
                    C8437a c8437a = (C8437a) obj;
                    if (C2668g.a(this.f29965a, c8437a.f29965a) && C2668g.a(this.f29966b, c8437a.f29966b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f29965a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29966b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29965a);
            stringBuilder.append(", openProfileFrom=");
            stringBuilder.append(this.f29966b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8437a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "openProfileFrom");
            this.f29965a = str;
            this.f29966b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m35997a() {
            return this.f29965a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35998b() {
            return this.f29966b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatOpenProfileEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.v$b */
    static final class C12705b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10540v f40991a;

        C12705b(C10540v c10540v) {
            this.f40991a = c10540v;
        }

        public /* synthetic */ Object call(Object obj) {
            m50014a((dh) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50014a(dh dhVar) {
            this.f40991a.f34279a.a(dhVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.v$c */
    static final class C13702c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8437a f43563a;

        C13702c(C8437a c8437a) {
            this.f43563a = c8437a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatOpenProfileEvent logged for matchId: ");
            stringBuilder.append(this.f43563a.m35997a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.v$d */
    static final class C13703d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13703d f43564a = new C13703d();

        C13703d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53243a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53243a(Throwable th) {
            C0001a.c(th, "ChatOpenProfileEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10540v(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34279a = c2630h;
        this.f34280b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42632a((C8437a) obj);
    }

    /* renamed from: a */
    public void m42632a(@NotNull C8437a c8437a) {
        C2668g.b(c8437a, "request");
        this.f34280b.m42548a(c8437a.m35997a(), c8437a.m35998b()).d(new C12705b(this)).b().b(Schedulers.io()).a(new C13702c(c8437a), (Action1) C13703d.f43564a);
    }
}
