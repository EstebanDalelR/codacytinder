package com.tinder.analytics.fireworks;

import android.support.annotation.NonNull;
import java.util.List;
import rx.C2671a;
import rx.Observable;

/* renamed from: com.tinder.analytics.fireworks.k */
public class C7330k implements EventQueue {
    @NonNull
    /* renamed from: a */
    private final FireworksRepository f26484a;
    @NonNull
    /* renamed from: b */
    private final C2671a f26485b;

    public C7330k(@NonNull FireworksRepository fireworksRepository, @NonNull C2671a c2671a) {
        this.f26484a = fireworksRepository;
        this.f26485b = c2671a;
    }

    @NonNull
    public Observable<List<C2632i>> flush() {
        return this.f26484a.loadEvents().v().b(new C8139l(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m31291a(List list) {
        if (list.isEmpty() == null) {
            m31290a();
        }
    }

    public void addEvent(@NonNull C2632i c2632i) {
        Observable.a(c2632i).h(new C8017m(this)).b().b(this.f26485b).a(new C8140n(c2632i), new C8141o(c2632i));
    }

    /* renamed from: b */
    final /* synthetic */ Observable m31292b(C2632i c2632i) {
        return this.f26484a.insertEvent(c2632i).e();
    }

    /* renamed from: a */
    public void m31290a() {
        this.f26484a.clear().a(C8142p.f29153a, C8143q.f29154a);
    }
}
