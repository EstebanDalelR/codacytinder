package com.tinder.analytics.p152a;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.analytics.fireworks.C2633r;
import com.tinder.analytics.fireworks.EventAdapter;
import com.tinder.model.SparksEvent;
import java8.util.Maps;
import javax.inject.Inject;

/* renamed from: com.tinder.analytics.a.c */
public class C7309c implements EventAdapter<SparksEvent> {
    @NonNull
    public /* synthetic */ C2632i createFireworksEvent(@NonNull Object obj) {
        return m31211a((SparksEvent) obj);
    }

    @Inject
    C7309c() {
    }

    @NonNull
    /* renamed from: a */
    public C2632i m31211a(@NonNull SparksEvent sparksEvent) {
        String str = sparksEvent.name;
        sparksEvent = sparksEvent.params;
        C2631a a = C2632i.a(str);
        Maps.a(sparksEvent, new C7310d(a));
        return a.a();
    }

    /* renamed from: a */
    static final /* synthetic */ void m31210a(C2631a c2631a, String str, Object obj) {
        Class cls;
        if (obj instanceof Number) {
            cls = Number.class;
        } else {
            cls = obj.getClass();
        }
        c2631a.a(C2633r.a(str, cls), obj);
    }
}
