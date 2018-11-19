package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qn;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesMapInteractionEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "add", "", "isZoomingIn", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.e */
public final class C10115e {
    /* renamed from: a */
    private final C2630h f33084a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.e$a */
    static final class C14146a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10115e f44889a;
        /* renamed from: b */
        final /* synthetic */ boolean f44890b;

        C14146a(C10115e c10115e, boolean z) {
            this.f44889a = c10115e;
            this.f44890b = z;
        }

        public final void call() {
            this.f44889a.f33084a.a(qn.m45927a().m38623a(this.f44890b ? "zoom_in" : "pinch").m38624a());
        }
    }

    @Inject
    public C10115e(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33084a = c2630h;
    }

    /* renamed from: a */
    public final void m41350a(boolean z) {
        Completable.a(new C14146a(this, z)).b(RxUtils.a("AddPlacesMapInteractionEvent failed"));
    }
}
