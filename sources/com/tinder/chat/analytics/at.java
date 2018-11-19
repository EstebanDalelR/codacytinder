package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.hm;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/chat/analytics/GifSearchHideEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "chatAnalyticsFactory", "Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/chat/analytics/ChatAnalyticsFactory;)V", "execute", "", "matchId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class at implements VoidUseCase<String> {
    /* renamed from: a */
    private final C2630h f34247a;
    /* renamed from: b */
    private final C10522a f34248b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GIFSearchHideEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.at$a */
    static final class C12685a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ at f40959a;

        C12685a(at atVar) {
            this.f40959a = atVar;
        }

        public /* synthetic */ Object call(Object obj) {
            m49978a((hm) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m49978a(hm hmVar) {
            this.f40959a.f34247a.a(hmVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.at$b */
    static final class C13678b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ String f43539a;

        C13678b(String str) {
            this.f43539a = str;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GifSearchHideEvent logged for matchId: ");
            stringBuilder.append(this.f43539a);
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.at$c */
    static final class C13679c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13679c f43540a = new C13679c();

        C13679c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53228a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53228a(Throwable th) {
            C0001a.c(th, "GifSearchHideEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public at(@NotNull C2630h c2630h, @NotNull C10522a c10522a) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10522a, "chatAnalyticsFactory");
        this.f34247a = c2630h;
        this.f34248b = c10522a;
    }

    public /* synthetic */ void execute(Object obj) {
        m42601a((String) obj);
    }

    /* renamed from: a */
    public void m42601a(@NotNull String str) {
        C2668g.b(str, "matchId");
        this.f34248b.m42554b(str).d(new C12685a(this)).b().b(Schedulers.io()).a(new C13678b(str), (Action1) C13679c.f43540a);
    }
}
