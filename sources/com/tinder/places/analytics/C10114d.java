package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.ql;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesLoadedRecentPlacesEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "error", "", "errorCode", "", "durationMillis", "", "success", "numPlaces", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.d */
public final class C10114d {
    @NotNull
    /* renamed from: a */
    private final C2630h f33083a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.d$a */
    static final class C14144a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10114d f44883a;
        /* renamed from: b */
        final /* synthetic */ int f44884b;
        /* renamed from: c */
        final /* synthetic */ long f44885c;

        C14144a(C10114d c10114d, int i, long j) {
            this.f44883a = c10114d;
            this.f44884b = i;
            this.f44885c = j;
        }

        public final void call() {
            this.f44883a.m41346a().a(ql.m45903a().m38615b(Integer.valueOf(this.f44884b)).m38613a(Long.valueOf(this.f44885c)).m38614a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.d$b */
    static final class C14145b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10114d f44886a;
        /* renamed from: b */
        final /* synthetic */ int f44887b;
        /* renamed from: c */
        final /* synthetic */ long f44888c;

        C14145b(C10114d c10114d, int i, long j) {
            this.f44886a = c10114d;
            this.f44887b = i;
            this.f44888c = j;
        }

        public final void call() {
            this.f44886a.m41346a().a(ql.m45903a().m38616c(Integer.valueOf(this.f44887b)).m38613a(Long.valueOf(this.f44888c)).m38614a());
        }
    }

    @Inject
    public C10114d(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33083a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41346a() {
        return this.f33083a;
    }

    /* renamed from: a */
    public final void m41347a(int i, long j) {
        Completable.a(new C14145b(this, i, j)).b(RxUtils.a("AddPlacesLoadedRecentPlacesEvent failed"));
    }

    /* renamed from: b */
    public final void m41348b(int i, long j) {
        Completable.a(new C14144a(this, i, j)).b(RxUtils.a("AddPlacesLoadedRecentPlacesEvent failed"));
    }
}
