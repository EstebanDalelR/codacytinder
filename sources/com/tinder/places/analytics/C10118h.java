package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qu;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesViewOptionsEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "add", "", "placeId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.h */
public final class C10118h {
    /* renamed from: a */
    private final C2630h f33087a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.h$a */
    static final class C14149a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10118h f44898a;
        /* renamed from: b */
        final /* synthetic */ String f44899b;

        C14149a(C10118h c10118h, String str) {
            this.f44898a = c10118h;
            this.f44899b = str;
        }

        public final void call() {
            this.f44898a.f33087a.a(qu.m46001a().m38655a(this.f44899b).m38656a());
        }
    }

    @Inject
    public C10118h(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33087a = c2630h;
    }

    /* renamed from: a */
    public final void m41356a(@NotNull String str) {
        C2668g.b(str, "placeId");
        Completable.a(new C14149a(this, str)).b(RxUtils.a("AddPlacesViewOptionsEvent failed"));
    }
}
