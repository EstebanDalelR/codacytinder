package com.tinder.data.toppicks;

import com.tinder.domain.toppicks.TopPicksCountUpdater;
import com.tinder.domain.toppicks.TopPicksCountUpdatesObserver;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import io.reactivex.C3957b;
import io.reactivex.subjects.C19040a;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0017J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0017J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0017R?\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00078BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0004¢\u0006\u0002\n\u0000R?\u0010\u0010\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00078BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/tinder/data/toppicks/TopPicksCountUpdatesObserverAndUpdater;", "Lcom/tinder/domain/toppicks/TopPicksCountUpdater;", "Lcom/tinder/domain/toppicks/TopPicksCountUpdatesObserver;", "topPicksRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksRepository;", "(Lcom/tinder/domain/toppicks/repo/TopPicksRepository;)V", "sharedCountObservable", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "getSharedCountObservable", "()Lio/reactivex/Flowable;", "sharedCountObservable$delegate", "Lkotlin/Lazy;", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "topPicksResponseCountObserver", "getTopPicksResponseCountObserver", "topPicksResponseCountObserver$delegate", "decrement", "", "i", "increment", "observeTopPicksCount", "set", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.m */
public final class C11018m implements TopPicksCountUpdater, TopPicksCountUpdatesObserver {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f35764a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C11018m.class), "topPicksResponseCountObserver", "getTopPicksResponseCountObserver()Lio/reactivex/Flowable;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11018m.class), "sharedCountObservable", "getSharedCountObservable()Lio/reactivex/Flowable;"))};
    /* renamed from: b */
    private final C19040a<Integer> f35765b;
    /* renamed from: c */
    private final Lazy f35766c;
    /* renamed from: d */
    private final Lazy f35767d;

    /* renamed from: a */
    private final C3957b<Integer> m43682a() {
        Lazy lazy = this.f35766c;
        KProperty kProperty = f35764a[0];
        return (C3957b) lazy.getValue();
    }

    /* renamed from: b */
    private final C3957b<Integer> m43684b() {
        Lazy lazy = this.f35767d;
        KProperty kProperty = f35764a[1];
        return (C3957b) lazy.getValue();
    }

    public C11018m(@NotNull TopPicksRepository topPicksRepository) {
        C2668g.b(topPicksRepository, "topPicksRepository");
        C19040a a = C19040a.a(Integer.valueOf(topPicksRepository.retrieveTopPicksCountFromCache()));
        C2668g.a(a, "BehaviorSubject.createDe…TopPicksCountFromCache())");
        this.f35765b = a;
        this.f35766c = C18451c.a(new C13891x313f7a71(topPicksRepository));
        this.f35767d = C18451c.a(new TopPicksCountUpdatesObserverAndUpdater$sharedCountObservable$2(this, topPicksRepository));
    }

    @NotNull
    public C3957b<Integer> observeTopPicksCount() {
        C3957b<Integer> b = m43684b();
        C2668g.a(b, "sharedCountObservable");
        return b;
    }

    public synchronized void increment(int i) {
        this.f35765b.onNext(Integer.valueOf(((Number) this.f35765b.b()).intValue() + i));
    }

    public synchronized void decrement(int i) {
        this.f35765b.onNext(Integer.valueOf(Math.max(((Number) this.f35765b.b()).intValue() - i, 0)));
    }

    public synchronized void set(int i) {
        this.f35765b.onNext(Integer.valueOf(Math.max(i, 0)));
    }
}
