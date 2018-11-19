package com.tinder.places.job;

import com.google.gson.Gson;
import com.tinder.analytics.performance.C8157y;
import com.tinder.common.logger.Logger;
import com.tinder.data.places.PlacesApiClient;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.job.a */
public final class C12348a implements MembersInjector<SubmitVisitJob> {
    /* renamed from: a */
    private final Provider<PlacesApiClient> f39961a;
    /* renamed from: b */
    private final Provider<C8157y> f39962b;
    /* renamed from: c */
    private final Provider<Gson> f39963c;
    /* renamed from: d */
    private final Provider<Logger> f39964d;

    public /* synthetic */ void injectMembers(Object obj) {
        m48741a((SubmitVisitJob) obj);
    }

    /* renamed from: a */
    public void m48741a(SubmitVisitJob submitVisitJob) {
        C12348a.m48740a(submitVisitJob, (PlacesApiClient) this.f39961a.get());
        C12348a.m48738a(submitVisitJob, (C8157y) this.f39962b.get());
        C12348a.m48737a(submitVisitJob, (Gson) this.f39963c.get());
        C12348a.m48739a(submitVisitJob, (Logger) this.f39964d.get());
    }

    /* renamed from: a */
    public static void m48740a(SubmitVisitJob submitVisitJob, PlacesApiClient placesApiClient) {
        submitVisitJob.f39956a = placesApiClient;
    }

    /* renamed from: a */
    public static void m48738a(SubmitVisitJob submitVisitJob, C8157y c8157y) {
        submitVisitJob.f39957b = c8157y;
    }

    /* renamed from: a */
    public static void m48737a(SubmitVisitJob submitVisitJob, Gson gson) {
        submitVisitJob.f39958c = gson;
    }

    /* renamed from: a */
    public static void m48739a(SubmitVisitJob submitVisitJob, Logger logger) {
        submitVisitJob.f39959d = logger;
    }
}
