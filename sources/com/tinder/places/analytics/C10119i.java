package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qv;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesViewRecEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "add", "", "placeId", "", "otherId", "position", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.i */
public final class C10119i {
    /* renamed from: a */
    private final C2630h f33088a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.i$a */
    static final class C14150a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10119i f44900a;
        /* renamed from: b */
        final /* synthetic */ String f44901b;
        /* renamed from: c */
        final /* synthetic */ String f44902c;
        /* renamed from: d */
        final /* synthetic */ int f44903d;

        C14150a(C10119i c10119i, String str, String str2, int i) {
            this.f44900a = c10119i;
            this.f44901b = str;
            this.f44902c = str2;
            this.f44903d = i;
        }

        public final void call() {
            this.f44900a.f33088a.a(qv.m46006a().m38660b(this.f44901b).m38658a(this.f44902c).m38657a((Number) Integer.valueOf(this.f44903d)).m38659a());
        }
    }

    @Inject
    public C10119i(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33088a = c2630h;
    }

    /* renamed from: a */
    public final void m41358a(@NotNull String str, @Nullable String str2, int i) {
        C2668g.b(str, "placeId");
        Completable.a(new C14150a(this, str, str2, i)).b(RxUtils.a("AddPlacesViewRecEvent failed"));
    }
}
