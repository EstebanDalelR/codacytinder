package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.hl;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/analytics/GifSearchEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/GifSearchEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/GIFSearchEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class as implements VoidUseCase<C8423a> {
    /* renamed from: a */
    private final C2630h f34245a;
    /* renamed from: b */
    private final C10522a f34246b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tinder/chat/analytics/GifSearchEventDispatcher$Request;", "", "matchId", "", "query", "count", "", "durationMs", "", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "getCount", "()I", "getDurationMs", "()J", "getMatchId", "()Ljava/lang/String;", "getQuery", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.as$a */
    public static final class C8423a {
        @NotNull
        /* renamed from: a */
        private final String f29901a;
        @NotNull
        /* renamed from: b */
        private final String f29902b;
        /* renamed from: c */
        private final int f29903c;
        /* renamed from: d */
        private final long f29904d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8423a) {
                C8423a c8423a = (C8423a) obj;
                if (C2668g.a(this.f29901a, c8423a.f29901a) && C2668g.a(this.f29902b, c8423a.f29902b)) {
                    if ((this.f29903c == c8423a.f29903c ? 1 : null) != null) {
                        if ((this.f29904d == c8423a.f29904d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f29901a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29902b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (((hashCode + i) * 31) + this.f29903c) * 31;
            long j = this.f29904d;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29901a);
            stringBuilder.append(", query=");
            stringBuilder.append(this.f29902b);
            stringBuilder.append(", count=");
            stringBuilder.append(this.f29903c);
            stringBuilder.append(", durationMs=");
            stringBuilder.append(this.f29904d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8423a(@NotNull String str, @NotNull String str2, int i, long j) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "query");
            this.f29901a = str;
            this.f29902b = str2;
            this.f29903c = i;
            this.f29904d = j;
        }

        @NotNull
        /* renamed from: a */
        public final String m35934a() {
            return this.f29901a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35935b() {
            return this.f29902b;
        }

        /* renamed from: c */
        public final int m35936c() {
            return this.f29903c;
        }

        /* renamed from: d */
        public final long m35937d() {
            return this.f29904d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GIFSearchEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.as$b */
    static final class C12684b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ as f40958a;

        C12684b(as asVar) {
            this.f40958a = asVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49977a((hl) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49977a(hl hlVar) {
            this.f40958a.f34245a.a(hlVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.as$c */
    static final class C13676c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8423a f43537a;

        C13676c(C8423a c8423a) {
            this.f43537a = c8423a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GifSearchEvent logged for query: ");
            stringBuilder.append('\'');
            stringBuilder.append(this.f43537a.m35935b());
            stringBuilder.append("', gifCount: ");
            stringBuilder.append(this.f43537a.m35936c());
            stringBuilder.append(", duration: ");
            stringBuilder.append(this.f43537a.m35937d());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.as$d */
    static final class C13677d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ as f43538a;

        C13677d(as asVar) {
            this.f43538a = asVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53227a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53227a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f43538a.getClass().getSimpleName());
            stringBuilder.append(" failed.");
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public as(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34245a = c2630h;
        this.f34246b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42599a((C8423a) obj);
    }

    /* renamed from: a */
    public void m42599a(@NotNull C8423a c8423a) {
        C2668g.b(c8423a, "request");
        m42598b(c8423a).d(new C12684b(this)).b().b(Schedulers.io()).a(new C13676c(c8423a), (Action1) new C13677d(this));
    }

    /* renamed from: b */
    private final Single<hl> m42598b(C8423a c8423a) {
        return this.f34246b.m42549a(c8423a.m35934a(), c8423a.m35935b(), c8423a.m35936c(), c8423a.m35937d());
    }
}
