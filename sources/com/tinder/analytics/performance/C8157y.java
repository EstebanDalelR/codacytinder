package com.tinder.analytics.performance;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.places.C8741b;
import com.tinder.data.places.C8741b.C10890a;
import com.tinder.data.places.C8741b.C10891b;
import com.tinder.data.places.C8741b.C10892c;
import com.tinder.data.places.ObservableApiEventClient;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.du;
import com.tinder.etl.event.du.C9064a;
import com.tinder.utils.RxUtils;
import io.reactivex.functions.Consumer;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JQ\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b¨\u0006\u001c"}, d2 = {"Lcom/tinder/analytics/performance/SimplePerformanceEventDispatcher;", "Lcom/tinder/analytics/performance/TimedInstrumentationEvent;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/core/experiment/AbTestUtility;)V", "add", "", "duration", "", "endPoint", "", "nsMethod", "statusCode", "", "map", "", "", "errorCode", "(JLjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Integer;)V", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "request", "Lcom/tinder/analytics/performance/AddInstrumentationEvent$InstrumentationRequest;", "subscribeToPerformanceClient", "apiClient", "Lcom/tinder/data/places/ObservableApiEventClient;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.performance.y */
public final class C8157y extends ag {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/data/places/PerformanceApiEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.performance.y$a */
    static final class C7338a<T> implements Consumer<C8741b> {
        /* renamed from: a */
        final /* synthetic */ C8157y f26502a;

        C7338a(C8157y c8157y) {
            this.f26502a = c8157y;
        }

        public /* synthetic */ void accept(Object obj) {
            m31316a((C8741b) obj);
        }

        /* renamed from: a */
        public final void m31316a(C8741b c8741b) {
            if (c8741b instanceof C10892c) {
                this.f26502a.m33922a(c8741b.a());
            } else if (c8741b instanceof C10891b) {
                this.f26502a.m33923b(c8741b.a());
                C10891b c10891b = (C10891b) c8741b;
                C8157y.m34565a(this.f26502a, this.f26502a.m33924c(c8741b.a()), c10891b.b(), c10891b.c(), c10891b.d(), c10891b.e(), null, 32, null);
            } else if (c8741b instanceof C10890a) {
                this.f26502a.m33923b(c8741b.a());
                C10890a c10890a = (C10890a) c8741b;
                this.f26502a.m34563a(this.f26502a.m33924c(c8741b.a()), c10890a.b(), c10890a.c(), c10890a.d(), c10890a.f(), c10890a.e());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.performance.y$b */
    static final class C7339b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C7339b f26503a = new C7339b();

        C7339b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m31317a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m31317a(Throwable th) {
            C0001a.c(th, "failed subscribeToPerformanceClient", new Object[0]);
        }
    }

    @Inject
    public C8157y(@NotNull C2630h c2630h, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(abTestUtility, "abTestUtility");
        super(c2630h, abTestUtility);
    }

    @NotNull
    /* renamed from: a */
    protected EtlEvent mo7429a(@NotNull InstrumentationRequest instrumentationRequest) {
        C2668g.b(instrumentationRequest, "request");
        C9064a b = du.a().b(instrumentationRequest.nsEndpoint()).c(instrumentationRequest.nsMethod()).a(instrumentationRequest.nsStatusCode()).d(instrumentationRequest.nsErrorCode()).b(instrumentationRequest.durationInMillis());
        instrumentationRequest = instrumentationRequest.payload();
        if (instrumentationRequest != null) {
            C2668g.a(instrumentationRequest, "it");
            b.a(instrumentationRequest.m26957b());
        }
        instrumentationRequest = b.a();
        C2668g.a(instrumentationRequest, "clientPerfEventEventBuilder.build()");
        return (EtlEvent) instrumentationRequest;
    }

    /* renamed from: a */
    static /* synthetic */ void m34565a(C8157y c8157y, long j, String str, String str2, int i, Map map, Integer num, int i2, Object obj) {
        c8157y.m34563a(j, str, str2, i, map, (i2 & 32) != 0 ? (Integer) null : num);
    }

    /* renamed from: a */
    private final void m34563a(long j, String str, String str2, int i, Map<String, ? extends Object> map, Integer num) {
        j = C7336a.m31303a().mo6805b(str).mo6801a((Number) Long.valueOf(j)).mo6804b((Number) Integer.valueOf(i)).mo6806c(num != null ? String.valueOf(num.intValue()) : null).mo6807d(str2);
        if (map != null) {
            j.mo6800a(new C6242m((Map) map));
        }
        m31305b(j.mo6803a()).b(RxUtils.a("add SimplePerformanceEventDispatcher failed"));
    }

    /* renamed from: a */
    public final void m34567a(@NotNull ObservableApiEventClient observableApiEventClient) {
        C2668g.b(observableApiEventClient, "apiClient");
        observableApiEventClient = observableApiEventClient.observeApiEvents();
        if (observableApiEventClient != null) {
            observableApiEventClient.a(new C7338a(this), C7339b.f26503a);
        }
    }
}
