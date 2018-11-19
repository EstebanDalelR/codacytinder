package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.cw;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/analytics/ChatBlockEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/chat/analytics/ChatBlockEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;Lio/reactivex/Scheduler;)V", "addEvent", "Lio/reactivex/Completable;", "chatBlockEvent", "Lcom/tinder/etl/event/ChatBlockEvent;", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.d */
public final class C10529d implements VoidUseCase<C8427a> {
    /* renamed from: a */
    private final C2630h f34257a;
    /* renamed from: b */
    private final C10522a f34258b;
    /* renamed from: c */
    private final C15679f f34259c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/analytics/ChatBlockEventDispatcher$Request;", "", "matchId", "", "reasonType", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getReasonType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.d$a */
    public static final class C8427a {
        @NotNull
        /* renamed from: a */
        private final String f29916a;
        @NotNull
        /* renamed from: b */
        private final String f29917b;

        @NotNull
        /* renamed from: a */
        public final String m35948a() {
            return this.f29916a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35949b() {
            return this.f29917b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8427a) {
                    C8427a c8427a = (C8427a) obj;
                    if (C2668g.a(this.f29916a, c8427a.f29916a) && C2668g.a(this.f29917b, c8427a.f29917b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f29916a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f29917b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f29916a);
            stringBuilder.append(", reasonType=");
            stringBuilder.append(this.f29917b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8427a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "reasonType");
            this.f29916a = str;
            this.f29917b = str2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.d$b */
    static final class C10526b implements Action {
        /* renamed from: a */
        final /* synthetic */ C10529d f34253a;
        /* renamed from: b */
        final /* synthetic */ cw f34254b;

        C10526b(C10529d c10529d, cw cwVar) {
            this.f34253a = c10529d;
            this.f34254b = cwVar;
        }

        public final void run() {
            this.f34253a.f34257a.a(this.f34254b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.d$c */
    static final class C10527c implements Action {
        /* renamed from: a */
        public static final C10527c f34255a = new C10527c();

        C10527c() {
        }

        public final void run() {
            C0001a.b("ChatBlockEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.d$d */
    static final class C10528d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10528d f34256a = new C10528d();

        C10528d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42608a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42608a(Throwable th) {
            C0001a.c(th, "ChatBlockEvent failed to log.", new Object[0]);
        }
    }

    @Inject
    public C10529d(@NotNull C2630h c2630h, @NotNull C10522a c10522a, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        C2668g.b(c15679f, "ioScheduler");
        this.f34257a = c2630h;
        this.f34258b = c10522a;
        this.f34259c = c15679f;
    }

    public /* synthetic */ void execute(Object obj) {
        m42612a((C8427a) obj);
    }

    /* renamed from: a */
    public void m42612a(@NotNull C8427a c8427a) {
        C2668g.b(c8427a, "request");
        RxJavaInteropExtKt.toV2Single(this.f34258b.m42561d(c8427a.m35948a(), c8427a.m35949b())).d(new C10530e(new ChatBlockEventDispatcher$execute$1(this))).b(this.f34259c).a(C10527c.f34255a, C10528d.f34256a);
    }

    /* renamed from: a */
    private final C3956a m42611a(cw cwVar) {
        cwVar = C3956a.a(new C10526b(this, cwVar));
        C2668g.a(cwVar, "Completable.fromAction {…ddEvent(chatBlockEvent) }");
        return cwVar;
    }
}
