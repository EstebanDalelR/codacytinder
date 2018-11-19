package com.tinder.api.retrofit;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "T", "p1", "Lretrofit2/Response;", "Lkotlin/ParameterName;", "name", "httpResponse", "invoke", "(Lretrofit2/Response;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
final class RetrofitErrorBodyAwareTransformer$call$1 extends FunctionReference implements Function1<Response<T>, T> {
    RetrofitErrorBodyAwareTransformer$call$1(RetrofitErrorBodyAwareTransformer retrofitErrorBodyAwareTransformer) {
        super(1, retrofitErrorBodyAwareTransformer);
    }

    public final String getName() {
        return "parseErrorResponseIfNeeded";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(RetrofitErrorBodyAwareTransformer.class);
    }

    public final String getSignature() {
        return "parseErrorResponseIfNeeded(Lretrofit2/Response;)Ljava/lang/Object;";
    }

    public final T invoke(@NotNull Response<T> response) {
        C2668g.b(response, "p1");
        return ((RetrofitErrorBodyAwareTransformer) this.receiver).parseErrorResponseIfNeeded(response);
    }
}
