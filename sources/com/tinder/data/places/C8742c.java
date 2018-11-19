package com.tinder.data.places;

import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.RecSource.Places;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Consume;
import com.tinder.domain.recs.model.RecsUpdate.Remove;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/places/PlaceIdRecsRemovalWorker;", "", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "dataStore", "Lcom/tinder/data/places/PlacesDataStore;", "(Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/data/places/PlacesDataStore;)V", "placeId", "", "getPlaceId", "()Ljava/lang/String;", "subscription", "Lrx/Subscription;", "start", "", "stop", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.c */
public final class C8742c {
    @NotNull
    /* renamed from: a */
    private final String f30724a;
    /* renamed from: b */
    private Subscription f30725b;
    /* renamed from: c */
    private final RecsEngine f30726c;
    /* renamed from: d */
    private final C8747h f30727d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.c$a */
    static final class C13048a<T, R> implements Func1<RecsUpdate, Boolean> {
        /* renamed from: a */
        public static final C13048a f41598a = new C13048a();

        C13048a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50802a((RecsUpdate) obj));
        }

        /* renamed from: a */
        public final boolean m50802a(RecsUpdate recsUpdate) {
            if (!(recsUpdate instanceof Consume)) {
                if ((recsUpdate instanceof Remove) == null) {
                    return null;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/data/places/PlaceWorkerRecsUpdate;", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.c$b */
    static final class C13049b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13049b f41599a = new C13049b();

        C13049b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50803a((RecsUpdate) obj);
        }

        @Nullable
        /* renamed from: a */
        public final C8743d m50803a(RecsUpdate recsUpdate) {
            int size = recsUpdate.getCurrentRecs().size();
            if (recsUpdate instanceof Consume) {
                recsUpdate = ((Consume) recsUpdate).getSwipe().getRec();
                if (recsUpdate != null) {
                    return new C8743d((PlacesUserRec) recsUpdate, size);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.PlacesUserRec");
            } else if (!(recsUpdate instanceof Remove)) {
                return null;
            } else {
                recsUpdate = ((Remove) recsUpdate).getRemovedRec();
                if (recsUpdate != null) {
                    return new C8743d((PlacesUserRec) recsUpdate, size);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.PlacesUserRec");
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "update", "Lcom/tinder/data/places/PlaceWorkerRecsUpdate;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.c$c */
    static final class C13863c<T> implements Action1<C8743d> {
        /* renamed from: a */
        final /* synthetic */ C8742c f43936a;

        C13863c(C8742c c8742c) {
            this.f43936a = c8742c;
        }

        public /* synthetic */ void call(Object obj) {
            m53403a((C8743d) obj);
        }

        /* renamed from: a */
        public final void m53403a(@Nullable C8743d c8743d) {
            C8747h a = this.f43936a.f30727d;
            if (c8743d == null) {
                C2668g.a();
            }
            a.m37264a(c8743d.m37254a().getPlaceId(), c8743d.m37254a().isNew(), c8743d.m37255b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.places.c$d */
    static final class C13864d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C8742c f43937a;

        C13864d(C8742c c8742c) {
            this.f43937a = c8742c;
        }

        public /* synthetic */ void call(Object obj) {
            m53404a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53404a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("failed to decrement visitor into for ");
            stringBuilder.append(this.f43937a.m37251a());
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    public C8742c(@NotNull RecsEngine recsEngine, @NotNull C8747h c8747h) {
        C2668g.b(recsEngine, "recsEngine");
        C2668g.b(c8747h, "dataStore");
        this.f30726c = recsEngine;
        this.f30727d = c8747h;
        recsEngine = this.f30726c.getRecSource();
        if (recsEngine == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecSource.Places");
        }
        this.f30724a = String.valueOf(((Places) recsEngine).getPlaceId());
    }

    @NotNull
    /* renamed from: a */
    public final String m37251a() {
        return this.f30724a;
    }

    /* renamed from: b */
    public final void m37252b() {
        Subscription subscription = this.f30725b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f30725b = this.f30726c.observeRecsUpdates().b(Schedulers.io()).f(C13048a.f41598a).k(C13049b.f41599a).a(new C13863c(this), new C13864d(this));
    }

    /* renamed from: c */
    public final void m37253c() {
        Subscription subscription = this.f30725b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }
}
