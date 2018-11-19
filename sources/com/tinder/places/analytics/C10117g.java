package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qs;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesViewDetailEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "add", "", "placeId", "", "numNewRecs", "", "numRecsTotal", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.g */
public final class C10117g {
    /* renamed from: a */
    private final C2630h f33086a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.g$a */
    static final class C14148a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10117g f44894a;
        /* renamed from: b */
        final /* synthetic */ String f44895b;
        /* renamed from: c */
        final /* synthetic */ int f44896c;
        /* renamed from: d */
        final /* synthetic */ int f44897d;

        C14148a(C10117g c10117g, String str, int i, int i2) {
            this.f44894a = c10117g;
            this.f44895b = str;
            this.f44896c = i;
            this.f44897d = i2;
        }

        public final void call() {
            this.f44894a.f33086a.a(qs.m45980a().m38647a(this.f44895b).m38646a((Number) Integer.valueOf(this.f44896c)).m38649b(Integer.valueOf(this.f44897d)).m38648a());
        }
    }

    @Inject
    public C10117g(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33086a = c2630h;
    }

    /* renamed from: a */
    public final void m41354a(@NotNull String str, int i, int i2) {
        C2668g.b(str, "placeId");
        Completable.a(new C14148a(this, str, i, i2)).b(RxUtils.a("AddPlacesViewDetailEvent failed"));
    }
}
