package com.tinder.places.job;

import android.content.Context;
import android.os.Bundle;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;
import com.google.gson.Gson;
import com.tinder.analytics.performance.C8157y;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import com.tinder.common.logger.Logger;
import com.tinder.data.places.PlacesApiClient;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/tinder/places/job/SubmitVisitJob;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "apiClient", "Lcom/tinder/data/places/PlacesApiClient;", "getApiClient", "()Lcom/tinder/data/places/PlacesApiClient;", "setApiClient", "(Lcom/tinder/data/places/PlacesApiClient;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "logger", "Lcom/tinder/common/logger/Logger;", "getLogger", "()Lcom/tinder/common/logger/Logger;", "setLogger", "(Lcom/tinder/common/logger/Logger;)V", "simplePerformanceEventDispatcher", "Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;", "getSimplePerformanceEventDispatcher", "()Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;", "setSimplePerformanceEventDispatcher", "(Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;)V", "subscription", "Lrx/Subscription;", "getSubscription", "()Lrx/Subscription;", "setSubscription", "(Lrx/Subscription;)V", "onStartJob", "", "job", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SubmitVisitJob extends JobService {
    /* renamed from: e */
    public static final C10216a f39955e = new C10216a();
    @Inject
    @NotNull
    /* renamed from: a */
    public PlacesApiClient f39956a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8157y f39957b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Gson f39958c;
    @Inject
    @NotNull
    /* renamed from: d */
    public Logger f39959d;
    @Nullable
    /* renamed from: f */
    private Subscription f39960f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/job/SubmitVisitJob$Companion;", "", "()V", "VISIT_DATA_KEY", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.job.SubmitVisitJob$a */
    public static final class C10216a {
        private C10216a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.job.SubmitVisitJob$b */
    static final class C14205b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SubmitVisitJob f45005a;
        /* renamed from: b */
        final /* synthetic */ JobParameters f45006b;

        C14205b(SubmitVisitJob submitVisitJob, JobParameters jobParameters) {
            this.f45005a = submitVisitJob;
            this.f45006b = jobParameters;
        }

        public final void call() {
            this.f45005a.b(this.f45006b, false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.job.SubmitVisitJob$c */
    static final class C14206c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ SubmitVisitJob f45007a;
        /* renamed from: b */
        final /* synthetic */ JobParameters f45008b;

        C14206c(SubmitVisitJob submitVisitJob, JobParameters jobParameters) {
            this.f45007a = submitVisitJob;
            this.f45008b = jobParameters;
        }

        public /* synthetic */ void call(Object obj) {
            m53923a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53923a(Throwable th) {
            Logger a = this.f45007a.m48734a();
            C2668g.a(th, "it");
            a.error(th, "SubmitVisitJob API error");
            this.f45007a.b(this.f45008b, true);
        }
    }

    @NotNull
    /* renamed from: a */
    public final Logger m48734a() {
        Logger logger = this.f39959d;
        if (logger == null) {
            C2668g.b("logger");
        }
        return logger;
    }

    /* renamed from: a */
    public boolean m48735a(@NotNull JobParameters jobParameters) {
        C2668g.b(jobParameters, "job");
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) applicationContext).h().inject(this);
        C8157y c8157y = this.f39957b;
        if (c8157y == null) {
            C2668g.b("simplePerformanceEventDispatcher");
        }
        PlacesApiClient placesApiClient = this.f39956a;
        if (placesApiClient == null) {
            C2668g.b("apiClient");
        }
        c8157y.a(placesApiClient);
        Bundle extras = jobParameters.getExtras();
        if (extras == null) {
            Logger logger = this.f39959d;
            if (logger == null) {
                C2668g.b("logger");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bundle's extras were null for job ");
            stringBuilder.append(jobParameters.getTag());
            stringBuilder.append(". Cancelling Job.");
            logger.error(stringBuilder.toString());
            return null;
        }
        Gson gson = this.f39958c;
        if (gson == null) {
            C2668g.b("gson");
        }
        PlacesVisitRequest placesVisitRequest = (PlacesVisitRequest) gson.fromJson(extras.getString("VISIT"), PlacesVisitRequest.class);
        placesApiClient = this.f39956a;
        if (placesApiClient == null) {
            C2668g.b("apiClient");
        }
        C2668g.a(placesVisitRequest, "request");
        this.f39960f = placesApiClient.m43392a(placesVisitRequest).b(Schedulers.io()).a(C19397a.a()).a(new C14205b(this, jobParameters), new C14206c(this, jobParameters));
        return true;
    }

    /* renamed from: b */
    public boolean m48736b(@NotNull JobParameters jobParameters) {
        C2668g.b(jobParameters, "job");
        jobParameters = this.f39960f;
        if (jobParameters != null) {
            jobParameters.unsubscribe();
        }
        jobParameters = this.f39959d;
        if (jobParameters == null) {
            C2668g.b("logger");
        }
        jobParameters.error("SubmitVisitJob prematurely stopped");
        return true;
    }
}
