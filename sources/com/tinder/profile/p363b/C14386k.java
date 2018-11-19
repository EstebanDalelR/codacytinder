package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.sd;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/profile/interactor/AddProfileShareEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "event", "Lcom/tinder/etl/event/ProfileShareEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.b.k */
public final class C14386k {
    /* renamed from: a */
    private final C2630h f45585a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.b.k$a */
    static final class C16077a implements Action {
        /* renamed from: a */
        final /* synthetic */ C14386k f49992a;
        /* renamed from: b */
        final /* synthetic */ sd f49993b;

        C16077a(C14386k c14386k, sd sdVar) {
            this.f49992a = c14386k;
            this.f49993b = sdVar;
        }

        public final void run() {
            this.f49992a.f45585a.a(this.f49993b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.b.k$b */
    static final class C16078b implements Action {
        /* renamed from: a */
        public static final C16078b f49994a = new C16078b();

        C16078b() {
        }

        public final void run() {
            C0001a.b("Profile.Share successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.b.k$c */
    static final class C16079c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16079c f49995a = new C16079c();

        C16079c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60850a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60850a(Throwable th) {
            C0001a.c(th, "AddProfileShareEvent failed.", new Object[0]);
        }
    }

    @Inject
    public C14386k(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f45585a = c2630h;
    }

    /* renamed from: a */
    public final void m54805a(@NotNull sd sdVar) {
        C2668g.b(sdVar, "event");
        C3956a.a(new C16077a(this, sdVar)).b(C15756a.m59010b()).a(C16078b.f49994a, C16079c.f49995a);
    }
}
