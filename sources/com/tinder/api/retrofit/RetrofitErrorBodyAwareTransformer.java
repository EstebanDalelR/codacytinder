package com.tinder.api.retrofit;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import kotlin.C18451c;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0011H\u0016J\u001b\u0010\u0013\u001a\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0002\u0010\u0015R?\u0010\t\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00018\u00008\u0000 \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/retrofit/RetrofitErrorBodyAwareTransformer;", "T", "Lrx/Single$Transformer;", "Lretrofit2/Response;", "moshi", "Lcom/squareup/moshi/Moshi;", "clazz", "Ljava/lang/Class;", "(Lcom/squareup/moshi/Moshi;Ljava/lang/Class;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "kotlin.jvm.PlatformType", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "call", "Lrx/Single;", "recsResponseSingle", "parseErrorResponseIfNeeded", "httpResponse", "(Lretrofit2/Response;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 1, 10})
public final class RetrofitErrorBodyAwareTransformer<T> implements Single$Transformer<Response<T>, T> {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(RetrofitErrorBodyAwareTransformer.class), "adapter", "getAdapter()Lcom/squareup/moshi/JsonAdapter;"))};
    private final Lazy adapter$delegate;

    private final JsonAdapter<T> getAdapter() {
        Lazy lazy = this.adapter$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (JsonAdapter) lazy.getValue();
    }

    public RetrofitErrorBodyAwareTransformer(@NotNull C5987p c5987p, @NotNull Class<T> cls) {
        C2668g.b(c5987p, "moshi");
        C2668g.b(cls, "clazz");
        this.adapter$delegate = C18451c.a(new RetrofitErrorBodyAwareTransformer$adapter$2(c5987p, cls));
    }

    @NotNull
    public Single<T> call(@NotNull Single<Response<T>> single) {
        C2668g.b(single, "recsResponseSingle");
        single = single.d(new RetrofitErrorBodyAwareTransformer$sam$rx_functions_Func1$0(new RetrofitErrorBodyAwareTransformer$call$1(this)));
        C2668g.a(single, "recsResponseSingle.map(t…rseErrorResponseIfNeeded)");
        return single;
    }

    private final T parseErrorResponseIfNeeded(Response<T> response) {
        if (response.isSuccessful()) {
            response = response.body();
            if (response == null) {
                C2668g.a();
            }
        } else {
            try {
                response = response.errorBody();
                response = response != null ? response.source() : null;
                if (response == null) {
                    C2668g.a();
                }
                response = getAdapter().fromJson(response);
                if (response == null) {
                    C2668g.a();
                }
            } catch (Response<T> response2) {
                throw ((Throwable) response2);
            }
        }
        return response2;
    }
}
