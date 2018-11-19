package com.tinder.recs.api;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.response.RecsResponse;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import rx.Single;
import rx.Single$Transformer;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R?\u0010\u0007\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u0003 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/tinder/recs/api/ParseErrorBodyTransformer;", "Lrx/Single$Transformer;", "Lretrofit2/Response;", "Lcom/tinder/api/response/RecsResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "kotlin.jvm.PlatformType", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "call", "Lrx/Single;", "recsResponseSingle", "parseErrorResponseIfNeeded", "httpResponse", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ParseErrorBodyTransformer implements Single$Transformer<Response<RecsResponse>, RecsResponse> {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ParseErrorBodyTransformer.class), "adapter", "getAdapter()Lcom/squareup/moshi/JsonAdapter;"))};
    private final Lazy adapter$delegate;

    private final JsonAdapter<RecsResponse> getAdapter() {
        Lazy lazy = this.adapter$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (JsonAdapter) lazy.getValue();
    }

    public ParseErrorBodyTransformer(@NotNull C5987p c5987p) {
        C2668g.b(c5987p, "moshi");
        this.adapter$delegate = C15810e.m59833a(new ParseErrorBodyTransformer$adapter$2(c5987p));
    }

    @NotNull
    public Single<RecsResponse> call(@NotNull Single<Response<RecsResponse>> single) {
        C2668g.b(single, "recsResponseSingle");
        single = single.d(new ParseErrorBodyTransformer$sam$rx_functions_Func1$0(new ParseErrorBodyTransformer$call$1(this)));
        C2668g.a(single, "recsResponseSingle.map(t…rseErrorResponseIfNeeded)");
        return single;
    }

    private final RecsResponse parseErrorResponseIfNeeded(Response<RecsResponse> response) {
        if (response.isSuccessful()) {
            response = response.body();
            if (response == null) {
                C2668g.a();
            }
            return (RecsResponse) response;
        }
        try {
            JsonAdapter adapter = getAdapter();
            response = response.errorBody();
            response = adapter.fromJson(response != null ? response.source() : null);
            if (response == null) {
                C2668g.a();
            }
            return (RecsResponse) response;
        } catch (Response<RecsResponse> response2) {
            throw new RuntimeException("Cannot convert error body", (Throwable) response2);
        }
    }
}
