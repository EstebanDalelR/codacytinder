package com.tinder.places.p311f;

import android.os.Bundle;
import com.firebase.jobdispatcher.C1886n;
import com.firebase.jobdispatcher.C3491i.C3490a;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.RetryStrategy;
import com.google.gson.Gson;
import com.tinder.analytics.performance.C8157y;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import com.tinder.common.logger.Logger;
import com.tinder.data.places.PlacesApiClient;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.places.job.SubmitVisitJob;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/places/usecase/SubmitVisit;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/api/model/places/request/PlacesVisitRequest;", "apiClient", "Lcom/tinder/data/places/PlacesApiClient;", "firebaseJobDispatcher", "Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;", "gson", "Lcom/google/gson/Gson;", "simplePerformanceEventDispatcher", "Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/data/places/PlacesApiClient;Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;Lcom/google/gson/Gson;Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;Lcom/tinder/common/logger/Logger;)V", "execute", "Lrx/Completable;", "request", "scheduleJob", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.f.j */
public final class C12346j implements CompletableUseCase<PlacesVisitRequest> {
    /* renamed from: a */
    private final PlacesApiClient f39949a;
    /* renamed from: b */
    private final FirebaseJobDispatcher f39950b;
    /* renamed from: c */
    private final Gson f39951c;
    /* renamed from: d */
    private final C8157y f39952d;
    /* renamed from: e */
    private final Logger f39953e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.f.j$a */
    static final class C13575a<T, R> implements Func1<Throwable, Completable> {
        /* renamed from: a */
        final /* synthetic */ C12346j f43311a;
        /* renamed from: b */
        final /* synthetic */ PlacesVisitRequest f43312b;

        C13575a(C12346j c12346j, PlacesVisitRequest placesVisitRequest) {
            this.f43311a = c12346j;
            this.f43312b = placesVisitRequest;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52995a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m52995a(Throwable th) {
            Logger a = this.f43311a.f39953e;
            C2668g.a(th, "it");
            a.error(th, "SubmitVisit initial request error");
            return this.f43311a.m48730b(this.f43312b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.f.j$b */
    static final class C14204b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C12346j f45003a;
        /* renamed from: b */
        final /* synthetic */ PlacesVisitRequest f45004b;

        C14204b(C12346j c12346j, PlacesVisitRequest placesVisitRequest) {
            this.f45003a = c12346j;
            this.f45004b = placesVisitRequest;
        }

        public final void call() {
            Bundle bundle = new Bundle();
            bundle.putString("VISIT", this.f45003a.f39951c.toJson(this.f45004b));
            C3490a a = this.f45003a.f39950b.a().a(SubmitVisitJob.class).a(new int[]{2}).a(C1886n.a(30, 30)).a(RetryStrategy.f5100a);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("places_visit_");
            stringBuilder.append(this.f45004b.getFoursquareVisitID());
            this.f45003a.f39950b.b(a.a(stringBuilder.toString()).a(2).a(bundle).a());
        }
    }

    @Inject
    public C12346j(@NotNull PlacesApiClient placesApiClient, @NotNull FirebaseJobDispatcher firebaseJobDispatcher, @NotNull Gson gson, @NotNull C8157y c8157y, @NotNull Logger logger) {
        C2668g.b(placesApiClient, "apiClient");
        C2668g.b(firebaseJobDispatcher, "firebaseJobDispatcher");
        C2668g.b(gson, "gson");
        C2668g.b(c8157y, "simplePerformanceEventDispatcher");
        C2668g.b(logger, "logger");
        this.f39949a = placesApiClient;
        this.f39950b = firebaseJobDispatcher;
        this.f39951c = gson;
        this.f39952d = c8157y;
        this.f39953e = logger;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m48732a((PlacesVisitRequest) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m48732a(@NotNull PlacesVisitRequest placesVisitRequest) {
        C2668g.b(placesVisitRequest, "request");
        this.f39952d.a(this.f39949a);
        placesVisitRequest = this.f39949a.m43392a(placesVisitRequest).b(new C13575a(this, placesVisitRequest));
        C2668g.a(placesVisitRequest, "apiClient.submitPlacesVi…ob(request)\n            }");
        return placesVisitRequest;
    }

    /* renamed from: b */
    private final Completable m48730b(PlacesVisitRequest placesVisitRequest) {
        placesVisitRequest = Completable.a(new C14204b(this, placesVisitRequest));
        C2668g.a(placesVisitRequest, "Completable.fromAction {…stSchedule(job)\n        }");
        return placesVisitRequest;
    }
}
