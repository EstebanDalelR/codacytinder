package com.tinder.recs.api;

import com.tinder.api.response.RecsResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/api/response/RecsResponse;", "p1", "Lretrofit2/Response;", "Lkotlin/ParameterName;", "name", "httpResponse", "invoke"}, k = 3, mv = {1, 1, 10})
final class ParseErrorBodyTransformer$call$1 extends FunctionReference implements Function1<Response<RecsResponse>, RecsResponse> {
    ParseErrorBodyTransformer$call$1(ParseErrorBodyTransformer parseErrorBodyTransformer) {
        super(1, parseErrorBodyTransformer);
    }

    public final String getName() {
        return "parseErrorResponseIfNeeded";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(ParseErrorBodyTransformer.class);
    }

    public final String getSignature() {
        return "parseErrorResponseIfNeeded(Lretrofit2/Response;)Lcom/tinder/api/response/RecsResponse;";
    }

    @NotNull
    public final RecsResponse invoke(@NotNull Response<RecsResponse> response) {
        C2668g.b(response, "p1");
        return ((ParseErrorBodyTransformer) this.receiver).parseErrorResponseIfNeeded(response);
    }
}
