package com.tinder.recs.api;

import com.tinder.analytics.performance.C2635n;
import com.tinder.analytics.performance.C6242m;
import com.tinder.analytics.performance.C8151o;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.response.RecsResponse;
import com.tinder.api.response.RecsResponse.Data;
import com.tinder.managers.bj;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q;
import okhttp3.C15966s;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import rx.Single;
import rx.Single$Transformer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/recs/api/PerformanceTrackingTransformer;", "Lrx/Single$Transformer;", "Lretrofit2/Response;", "Lcom/tinder/api/response/RecsResponse;", "locale", "", "managerSettings", "Lcom/tinder/managers/ManagerSettings;", "recsEvent", "Lcom/tinder/analytics/performance/RecsEvent;", "(Ljava/lang/String;Lcom/tinder/managers/ManagerSettings;Lcom/tinder/analytics/performance/RecsEvent;)V", "call", "Lrx/Single;", "recsResponseSingle", "fireRecsV2PerformanceEvent", "", "timerKey", "response", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PerformanceTrackingTransformer implements Single$Transformer<Response<RecsResponse>, Response<RecsResponse>> {
    public static final Companion Companion = new Companion();
    private static final String GET_RECS_TIMER_KEY = "GET_RECS_TIMER_KEY";
    private final String locale;
    private final bj managerSettings;
    private final C8151o recsEvent;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/recs/api/PerformanceTrackingTransformer$Companion;", "", "()V", "GET_RECS_TIMER_KEY", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    public PerformanceTrackingTransformer(@NotNull String str, @NotNull bj bjVar, @NotNull C8151o c8151o) {
        C2668g.b(str, ManagerWebServices.PARAM_LOCALE);
        C2668g.b(bjVar, "managerSettings");
        C2668g.b(c8151o, "recsEvent");
        this.locale = str;
        this.managerSettings = bjVar;
        this.recsEvent = c8151o;
    }

    @NotNull
    public Single<Response<RecsResponse>> call(@NotNull Single<Response<RecsResponse>> single) {
        C2668g.b(single, "recsResponseSingle");
        single = single.a(new PerformanceTrackingTransformer$call$1(this)).d(new PerformanceTrackingTransformer$call$2(this));
        C2668g.a(single, "recsResponseSingle\n     …sponse)\n                }");
        return single;
    }

    private final void fireRecsV2PerformanceEvent(String str, Response<RecsResponse> response) {
        int size;
        String httpUrl;
        C6242m a;
        C8151o c8151o;
        String a2;
        C15966s raw;
        C15963q a3;
        String b;
        RecsResponse recsResponse = (RecsResponse) response.body();
        String message = response.message();
        if (message == null) {
            message = "";
        }
        if (recsResponse != null) {
            Data data = recsResponse.getData();
            if (data != null) {
                List results = data.getResults();
                if (results != null) {
                    size = results.size();
                    httpUrl = response.raw().m60553a().m60526a().toString();
                    a = C6242m.a().b(this.locale).d(size).c(message).a(this.managerSettings.b()).c(this.managerSettings.c()).b(this.managerSettings.d()).a();
                    c8151o = this.recsEvent;
                    a2 = C2635n.a(httpUrl);
                    raw = response.raw();
                    if (raw != null) {
                        a3 = raw.m60553a();
                        if (a3 != null) {
                            b = a3.m60527b();
                            c8151o.a(null, str, a2, b, response.code(), a);
                        }
                    }
                    b = null;
                    c8151o.a(null, str, a2, b, response.code(), a);
                }
            }
        }
        size = 0;
        httpUrl = response.raw().m60553a().m60526a().toString();
        a = C6242m.a().b(this.locale).d(size).c(message).a(this.managerSettings.b()).c(this.managerSettings.c()).b(this.managerSettings.d()).a();
        c8151o = this.recsEvent;
        a2 = C2635n.a(httpUrl);
        raw = response.raw();
        if (raw != null) {
            a3 = raw.m60553a();
            if (a3 != null) {
                b = a3.m60527b();
                c8151o.a(null, str, a2, b, response.code(), a);
            }
        }
        b = null;
        c8151o.a(null, str, a2, b, response.code(), a);
    }
}
