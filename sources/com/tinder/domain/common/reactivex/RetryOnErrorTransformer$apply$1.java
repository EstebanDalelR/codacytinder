package com.tinder.domain.common.reactivex;

import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u00022\u001d\u0010\u0003\u001a\u0019\u0012\u0006\b\u0001\u0012\u00020\u00040\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "T", "p1", "", "Lkotlin/ParameterName;", "name", "errorFlowable", "invoke"}, k = 3, mv = {1, 1, 10})
final class RetryOnErrorTransformer$apply$1 extends FunctionReference implements Function1<C3957b<? extends Throwable>, C3957b<?>> {
    RetryOnErrorTransformer$apply$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        super(1, retryOnErrorTransformer);
    }

    public final String getName() {
        return "createRetryNotification";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(RetryOnErrorTransformer.class);
    }

    public final String getSignature() {
        return "createRetryNotification(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;";
    }

    @NotNull
    public final C3957b<?> invoke(@NotNull C3957b<? extends Throwable> c3957b) {
        C2668g.b(c3957b, "p1");
        return ((RetryOnErrorTransformer) this.receiver).createRetryNotification(c3957b);
    }
}
