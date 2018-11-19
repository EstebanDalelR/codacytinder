package com.tinder.api.moshi;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.response.v2.EmptyResponse;
import com.tinder.api.response.v2.ResponseError;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import okhttp3.C15968t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R?\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/moshi/ResponseErrorAdapter;", "", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/tinder/api/response/v2/EmptyResponse;", "kotlin.jvm.PlatformType", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "fromBody", "Lcom/tinder/api/response/v2/ResponseError;", "errorBody", "Lokhttp3/ResponseBody;", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ResponseErrorAdapter {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(ResponseErrorAdapter.class), "adapter", "getAdapter()Lcom/squareup/moshi/JsonAdapter;"))};
    private final Lazy adapter$delegate;

    private final JsonAdapter<EmptyResponse> getAdapter() {
        Lazy lazy = this.adapter$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (JsonAdapter) lazy.getValue();
    }

    @Inject
    public ResponseErrorAdapter(@NotNull C5987p c5987p) {
        C2668g.b(c5987p, "moshi");
        this.adapter$delegate = C18451c.a(new ResponseErrorAdapter$adapter$2(c5987p));
    }

    @Nullable
    public final ResponseError fromBody(@NotNull C15968t c15968t) {
        C2668g.b(c15968t, "errorBody");
        EmptyResponse emptyResponse = (EmptyResponse) getAdapter().fromJson(c15968t.source());
        return emptyResponse != null ? emptyResponse.getError() : null;
    }
}
