package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qp;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesRecentPlaceCloseEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "add", "", "placeId", "", "numRecsRemaining", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.f */
public final class C10116f {
    @NotNull
    /* renamed from: a */
    private final C2630h f33085a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.f$a */
    static final class C14147a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10116f f44891a;
        /* renamed from: b */
        final /* synthetic */ String f44892b;
        /* renamed from: c */
        final /* synthetic */ Integer f44893c;

        C14147a(C10116f c10116f, String str, Integer num) {
            this.f44891a = c10116f;
            this.f44892b = str;
            this.f44893c = num;
        }

        public final void call() {
            this.f44891a.m41351a().a(qp.m45938a().m38628a(this.f44892b).m38627a((Number) this.f44893c).m38629a());
        }
    }

    @Inject
    public C10116f(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33085a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41351a() {
        return this.f33085a;
    }

    /* renamed from: a */
    public final void m41352a(@NotNull String str, @Nullable Integer num) {
        C2668g.b(str, "placeId");
        Completable.a(new C14147a(this, str, num)).b(RxUtils.a("AddPlacesRecentPlaceCloseEvent failed"));
    }
}
