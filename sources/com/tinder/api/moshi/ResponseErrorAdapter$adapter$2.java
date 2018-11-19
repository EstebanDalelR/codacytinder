package com.tinder.api.moshi;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.response.v2.EmptyResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/tinder/api/response/v2/EmptyResponse;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class ResponseErrorAdapter$adapter$2 extends Lambda implements Function0<JsonAdapter<EmptyResponse>> {
    final /* synthetic */ C5987p $moshi;

    ResponseErrorAdapter$adapter$2(C5987p c5987p) {
        this.$moshi = c5987p;
        super(0);
    }

    public final JsonAdapter<EmptyResponse> invoke() {
        return this.$moshi.a(EmptyResponse.class);
    }
}
