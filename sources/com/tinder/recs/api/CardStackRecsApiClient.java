package com.tinder.recs.api;

import com.fernandocejas.frodo.annotation.RxLogObservable;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.response.RecsResponse;
import com.tinder.data.recs.C8786k;
import com.tinder.data.recs.C8786k.C10993a;
import com.tinder.data.recs.C8786k.C10994b;
import com.tinder.data.recs.C8786k.C10996d;
import com.tinder.data.recs.C8786k.C10998f;
import com.tinder.data.recs.C8786k.C10999g;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.ContextualInfo.Default.ExpectedError;
import com.tinder.domain.recs.model.ContextualInfo.Default.UnexpectedError;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.recs.api.ResponseParser.Result.Empty;
import com.tinder.recs.api.ResponseParser.Result.Error;
import com.tinder.recs.api.ResponseParser.Result.Success;
import com.tinder.recs.api.ResponseParser.Result.Timeout;
import com.tinder.recs.api.ResponseParser.Result.Type;
import com.tinder.recs.api.ResponseParser.Result.Type.MappedError;
import com.tinder.recs.api.ResponseParser.Result.Type.UnknownLocation;
import com.tinder.recs.api.ResponseParser.Result.Type.UnknownResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0017J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/recs/api/CardStackRecsApiClient;", "Lcom/tinder/domain/recs/RecsApiClient;", "tinderApi", "Lcom/tinder/api/TinderApi;", "locale", "", "responseParser", "Lcom/tinder/recs/api/ResponseParser;", "performaceTrackingTransformer", "Lcom/tinder/recs/api/PerformanceTrackingTransformer;", "parseErrorBodyTransformer", "Lcom/tinder/recs/api/ParseErrorBodyTransformer;", "timeoutTimer", "Lcom/tinder/recs/api/TimeoutTimer;", "(Lcom/tinder/api/TinderApi;Ljava/lang/String;Lcom/tinder/recs/api/ResponseParser;Lcom/tinder/recs/api/PerformanceTrackingTransformer;Lcom/tinder/recs/api/ParseErrorBodyTransformer;Lcom/tinder/recs/api/TimeoutTimer;)V", "recSource", "Lcom/tinder/domain/recs/model/RecSource$Core;", "getRecSource", "()Lcom/tinder/domain/recs/model/RecSource$Core;", "handleRecsResponse", "Lcom/tinder/data/recs/RecsFetchResults;", "httpResponse", "Lcom/tinder/api/response/RecsResponse;", "loadRecs", "Lrx/Single;", "reset", "", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class CardStackRecsApiClient implements RecsApiClient {
    private final String locale;
    private final ParseErrorBodyTransformer parseErrorBodyTransformer;
    private final PerformanceTrackingTransformer performaceTrackingTransformer;
    @NotNull
    private final Core recSource = Core.INSTANCE;
    private final ResponseParser responseParser;
    private final TimeoutTimer timeoutTimer;
    private final TinderApi tinderApi;

    public CardStackRecsApiClient(@NotNull TinderApi tinderApi, @NotNull String str, @NotNull ResponseParser responseParser, @NotNull PerformanceTrackingTransformer performanceTrackingTransformer, @NotNull ParseErrorBodyTransformer parseErrorBodyTransformer, @NotNull TimeoutTimer timeoutTimer) {
        C2668g.m10309b(tinderApi, "tinderApi");
        C2668g.m10309b(str, ManagerWebServices.PARAM_LOCALE);
        C2668g.m10309b(responseParser, "responseParser");
        C2668g.m10309b(performanceTrackingTransformer, "performaceTrackingTransformer");
        C2668g.m10309b(parseErrorBodyTransformer, "parseErrorBodyTransformer");
        C2668g.m10309b(timeoutTimer, "timeoutTimer");
        this.tinderApi = tinderApi;
        this.locale = str;
        this.responseParser = responseParser;
        this.performaceTrackingTransformer = performanceTrackingTransformer;
        this.parseErrorBodyTransformer = parseErrorBodyTransformer;
        this.timeoutTimer = timeoutTimer;
    }

    @NotNull
    public Core getRecSource() {
        return this.recSource;
    }

    public void reset(@NotNull ResetReason resetReason) {
        C2668g.m10309b(resetReason, "reason");
        this.timeoutTimer.reset();
    }

    @NotNull
    @RxLogObservable
    public synchronized Single<C8786k> loadRecs() {
        if (this.timeoutTimer.isInTimeout()) {
            Object a = Single.a(new C10994b(null, 1, null));
            C2668g.m10305a(a, "Single.just(NoMoreRecs())");
            return a;
        }
        a = this.tinderApi.fetchRecs(this.locale).a(this.performaceTrackingTransformer).a(this.parseErrorBodyTransformer).d(new CardStackRecsApiClientKt$sam$rx_functions_Func1$0(new CardStackRecsApiClient$loadRecs$1(this))).c(CardStackRecsApiClient$loadRecs$2.INSTANCE);
        C2668g.m10305a(a, "tinderApi.fetchRecs(loca…, \"Error loading recs\") }");
        return a;
    }

    private final synchronized C8786k handleRecsResponse(RecsResponse recsResponse) {
        recsResponse = this.responseParser.parseResponse(recsResponse);
        if (recsResponse instanceof Empty) {
            recsResponse = (C8786k) new C10994b(null, 1, null);
        } else if (recsResponse instanceof Success) {
            recsResponse = new C10996d(((Success) recsResponse).getRecs());
        } else if (recsResponse instanceof Timeout) {
            this.timeoutTimer.startTimeoutIfNeeded(((Timeout) recsResponse).getTimeoutMillis());
            recsResponse = (C8786k) new C10994b(null, 1, null);
        } else if (recsResponse instanceof Error) {
            Type type = ((Error) recsResponse).getType();
            if (type instanceof UnknownLocation) {
                recsResponse = (C8786k) C10999g.f35733a;
            } else if (type instanceof MappedError) {
                recsResponse = new C10993a(new ExpectedError(((MappedError) ((Error) recsResponse).getType()).getCode()));
            } else if ((type instanceof UnknownResponse) != null) {
                recsResponse = (C8786k) new C10998f(new UnexpectedError(new IllegalStateException("Unknown Response")));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return recsResponse;
    }
}
