package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dp;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class af implements VoidUseCase<C8418a> {
    /* renamed from: a */
    private final C2630h f34220a;
    /* renamed from: b */
    private final C10522a f34221b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/analytics/ChatTapInputTypeEventDispatcher$Request;", "", "matchId", "", "buttonType", "(Ljava/lang/String;Ljava/lang/String;)V", "getButtonType", "()Ljava/lang/String;", "getMatchId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.af$a */
    public static final class C8418a {
        @NotNull
        /* renamed from: a */
        private final String f29883a;
        @NotNull
        /* renamed from: b */
        private final String f29884b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8418a) {
                    C8418a c8418a = (C8418a) obj;
                    if (C2668g.a(this.f29883a, c8418a.f29883a) && C2668g.a(this.f29884b, c8418a.f29884b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f29883a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29884b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29883a);
            stringBuilder.append(", buttonType=");
            stringBuilder.append(this.f29884b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8418a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "buttonType");
            this.f29883a = str;
            this.f29884b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m35910a() {
            return this.f29883a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35911b() {
            return this.f29884b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatTapInputTypeEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.af$b */
    static final class C12680b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ af f40942a;

        C12680b(af afVar) {
            this.f40942a = afVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49961a((dp) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49961a(dp dpVar) {
            this.f40942a.f34220a.a(dpVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.af$c */
    static final class C13668c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8418a f43529a;

        C13668c(C8418a c8418a) {
            this.f43529a = c8418a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChatTapInputTypeEvent logged for matchId:");
            stringBuilder.append(this.f43529a.m35910a());
            stringBuilder.append(' ');
            stringBuilder.append("with buttonType: ");
            stringBuilder.append(this.f43529a.m35911b());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.af$d */
    static final class C13669d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13669d f43530a = new C13669d();

        C13669d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53222a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53222a(Throwable th) {
            C0001a.c(th, "ChatTapInputTypeEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public af(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34220a = c2630h;
        this.f34221b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42569a((C8418a) obj);
    }

    /* renamed from: a */
    public void m42569a(@NotNull C8418a c8418a) {
        C2668g.b(c8418a, "request");
        this.f34221b.m42559c(c8418a.m35910a(), c8418a.m35911b()).d(new C12680b(this)).b().b(Schedulers.io()).a(new C13668c(c8418a), (Action1) C13669d.f43530a);
    }
}
