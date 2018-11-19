package com.tinder.api.retrofit;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/squareup/moshi/JsonAdapter;", "T", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class RetrofitErrorBodyAwareTransformer$adapter$2 extends Lambda implements Function0<JsonAdapter<T>> {
    final /* synthetic */ Class $clazz;
    final /* synthetic */ C5987p $moshi;

    RetrofitErrorBodyAwareTransformer$adapter$2(C5987p c5987p, Class cls) {
        this.$moshi = c5987p;
        this.$clazz = cls;
        super(0);
    }

    public final JsonAdapter<T> invoke() {
        return this.$moshi.a(this.$clazz);
    }
}
