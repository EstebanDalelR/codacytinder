package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.dk;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/analytics/ChatReportEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatReportEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.x */
public final class C10541x implements VoidUseCase<C8438a> {
    /* renamed from: a */
    private final C2630h f34281a;
    /* renamed from: b */
    private final C10522a f34282b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tinder/chat/analytics/ChatReportEventDispatcher$Request;", "", "matchId", "", "reason", "other", "blocked", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBlocked", "()Z", "getMatchId", "()Ljava/lang/String;", "getOther", "getReason", "component1", "component2", "component3", "component4", "copy", "equals", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.x$a */
    public static final class C8438a {
        @NotNull
        /* renamed from: a */
        private final String f29967a;
        @NotNull
        /* renamed from: b */
        private final String f29968b;
        @Nullable
        /* renamed from: c */
        private final String f29969c;
        /* renamed from: d */
        private final boolean f29970d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8438a) {
                C8438a c8438a = (C8438a) obj;
                if (C2668g.a(this.f29967a, c8438a.f29967a) && C2668g.a(this.f29968b, c8438a.f29968b) && C2668g.a(this.f29969c, c8438a.f29969c)) {
                    if ((this.f29970d == c8438a.f29970d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f29967a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29968b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f29969c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f29970d;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29967a);
            stringBuilder.append(", reason=");
            stringBuilder.append(this.f29968b);
            stringBuilder.append(", other=");
            stringBuilder.append(this.f29969c);
            stringBuilder.append(", blocked=");
            stringBuilder.append(this.f29970d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8438a(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "reason");
            this.f29967a = str;
            this.f29968b = str2;
            this.f29969c = str3;
            this.f29970d = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m35999a() {
            return this.f29967a;
        }

        @NotNull
        /* renamed from: b */
        public final String m36000b() {
            return this.f29968b;
        }

        @Nullable
        /* renamed from: c */
        public final String m36001c() {
            return this.f29969c;
        }

        /* renamed from: d */
        public final boolean m36002d() {
            return this.f29970d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/ChatReportEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.x$b */
    static final class C12707b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10541x f40994a;

        C12707b(C10541x c10541x) {
            this.f40994a = c10541x;
        }

        public /* synthetic */ Object call(Object obj) {
            m50018a((dk) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m50018a(dk dkVar) {
            this.f40994a.f34281a.a(dkVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.x$c */
    static final class C13704c implements Action0 {
        /* renamed from: a */
        public static final C13704c f43565a = new C13704c();

        C13704c() {
        }

        public final void call() {
            C0001a.b("ChatReportEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.x$d */
    static final class C13705d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13705d f43566a = new C13705d();

        C13705d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53244a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53244a(Throwable th) {
            C0001a.c(th, "ChatReportEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C10541x(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34281a = c2630h;
        this.f34282b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42634a((C8438a) obj);
    }

    /* renamed from: a */
    public void m42634a(@NotNull C8438a c8438a) {
        C2668g.b(c8438a, "request");
        this.f34282b.m42553a(c8438a.m35999a(), c8438a.m36000b(), c8438a.m36001c(), c8438a.m36002d()).d(new C12707b(this)).b().b(Schedulers.io()).a(C13704c.f43565a, C13705d.f43566a);
    }
}
