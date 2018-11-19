package com.tinder.api.networkperf.interceptor;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.networkperf.EmptyPerfEvent;
import com.tinder.api.networkperf.NetworkPerfEvent;
import com.tinder.api.networkperf.NetworkPerfEventDataModel;
import com.tinder.api.networkperf.ValidPerfEvent;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.common.logger.Logger;
import com.tinder.etl.event.du;
import com.tinder.etl.event.du.C9064a;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/api/networkperf/interceptor/NetworkPerfInterceptor;", "Lokhttp3/Interceptor;", "inspectors", "", "Lcom/tinder/api/networkperf/inspector/NetworkPerfInspector;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "responseErrorAdapter", "Lcom/tinder/api/moshi/ResponseErrorAdapter;", "logger", "Lcom/tinder/common/logger/Logger;", "(Ljava/util/Set;Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/api/moshi/ResponseErrorAdapter;Lcom/tinder/common/logger/Logger;)V", "inspectors$annotations", "()V", "createClientPerfEventBuilder", "Lcom/tinder/etl/event/ClientPerfEventEvent$Builder;", "response", "Lokhttp3/Response;", "extractErrorCode", "", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 1, 10})
public final class NetworkPerfInterceptor implements Interceptor {
    private final C2630h fireworks;
    private final Set<NetworkPerfInspector> inspectors;
    private final Logger logger;
    private final ResponseErrorAdapter responseErrorAdapter;

    @JvmSuppressWildcards
    private static /* synthetic */ void inspectors$annotations() {
    }

    @Inject
    public NetworkPerfInterceptor(@NotNull Set<? extends NetworkPerfInspector> set, @NotNull C2630h c2630h, @NotNull ResponseErrorAdapter responseErrorAdapter, @NotNull Logger logger) {
        C2668g.b(set, "inspectors");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(responseErrorAdapter, "responseErrorAdapter");
        C2668g.b(logger, "logger");
        this.inspectors = set;
        this.fireworks = c2630h;
        this.responseErrorAdapter = responseErrorAdapter;
        this.logger = logger;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        C15963q request = chain.request();
        chain = chain.proceed(request);
        for (NetworkPerfInspector networkPerfInspector : this.inspectors) {
            String httpUrl = request.a().toString();
            C2668g.a(httpUrl, "request.url().toString()");
            List k = request.a().k();
            C2668g.a(k, "request.url().pathSegments()");
            NetworkPerfEventDataModel networkPerfEventDataModel = new NetworkPerfEventDataModel(httpUrl, k);
            C2668g.a(chain, "response");
            NetworkPerfEvent inspect = networkPerfInspector.inspect(networkPerfEventDataModel, createClientPerfEventBuilder(chain));
            C15813i c15813i;
            if (inspect instanceof ValidPerfEvent) {
                this.fireworks.a(((ValidPerfEvent) inspect).getClientPerfEvent());
                c15813i = C15813i.f49016a;
            } else if (inspect instanceof EmptyPerfEvent) {
                c15813i = C15813i.f49016a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        C2668g.a(chain, "response");
        return chain;
    }

    private final C9064a createClientPerfEventBuilder(C15966s c15966s) {
        long n = c15966s.n() - c15966s.m();
        String extractErrorCode = extractErrorCode(c15966s);
        c15966s = du.m44962a().m38204b((Number) Long.valueOf(n)).m38206c(c15966s.a().b()).m38200a((Number) Integer.valueOf(c15966s.c())).m38208e(c15966s.g().a("X-Request-ID"));
        if ((C19303i.a(extractErrorCode) ^ 1) != 0) {
            c15966s.m38207d(extractErrorCode);
        }
        C2668g.a(c15966s, "ClientPerfEventEvent.bui… nsErrorCode(errorCode) }");
        return c15966s;
    }

    private final java.lang.String extractErrorCode(okhttp3.C15966s r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.d();
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        r4 = "";
        return r4;
    L_0x0009:
        r0 = r4.h();
        if (r0 == 0) goto L_0x0057;
    L_0x000f:
        r1 = r3.responseErrorAdapter;	 Catch:{ IOException -> 0x0030 }
        r2 = "responseBody";	 Catch:{ IOException -> 0x0030 }
        kotlin.jvm.internal.C2668g.a(r0, r2);	 Catch:{ IOException -> 0x0030 }
        r0 = r1.fromBody(r0);	 Catch:{ IOException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;	 Catch:{ IOException -> 0x0030 }
    L_0x001c:
        r0 = r0.getCode();	 Catch:{ IOException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;	 Catch:{ IOException -> 0x0030 }
    L_0x0022:
        r0 = r0.intValue();	 Catch:{ IOException -> 0x0030 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;	 Catch:{ IOException -> 0x0030 }
    L_0x002c:
        goto L_0x0056;	 Catch:{ IOException -> 0x0030 }
    L_0x002d:
        r0 = "";	 Catch:{ IOException -> 0x0030 }
        goto L_0x0056;
    L_0x0030:
        r0 = r3.logger;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Failed to extract error code from ";
        r1.append(r2);
        r4 = r4.c();
        r1.append(r4);
        r4 = " response ";
        r1.append(r4);
        r4 = "for network perf events";
        r1.append(r4);
        r4 = r1.toString();
        r0.error(r4);
        r0 = "";
    L_0x0056:
        return r0;
    L_0x0057:
        r4 = "";
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor.extractErrorCode(okhttp3.s):java.lang.String");
    }
}
