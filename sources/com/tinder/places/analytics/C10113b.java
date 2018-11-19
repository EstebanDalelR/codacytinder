package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qk;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesExperimentToggleEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "add", "", "experimentEnabled", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.b */
public final class C10113b {
    @NotNull
    /* renamed from: a */
    private final C2630h f33082a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.b$a */
    static final class C14143a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10113b f44881a;
        /* renamed from: b */
        final /* synthetic */ boolean f44882b;

        C14143a(C10113b c10113b, boolean z) {
            this.f44881a = c10113b;
            this.f44882b = z;
        }

        public final void call() {
            this.f44881a.m41344a().a(qk.m45898a().m38611a(Boolean.valueOf(this.f44882b)).m38612a());
        }
    }

    @Inject
    public C10113b(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33082a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41344a() {
        return this.f33082a;
    }

    /* renamed from: a */
    public final void m41345a(boolean z) {
        Completable.a(new C14143a(this, z)).b(RxUtils.a("AddPlacesExperimentToggleEvent failed"));
    }
}
