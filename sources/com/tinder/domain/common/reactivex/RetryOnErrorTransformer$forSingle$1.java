package com.tinder.domain.common.reactivex;

import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.SingleTransformer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "R", "kotlin.jvm.PlatformType", "T", "single", "apply"}, k = 3, mv = {1, 1, 10})
final class RetryOnErrorTransformer$forSingle$1<Upstream, Downstream> implements SingleTransformer<R, R> {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RetryOnErrorTransformer$forSingle$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final C3960g<R> apply(@NotNull C3960g<R> c3960g) {
        C2668g.b(c3960g, "single");
        return c3960g.g(new RetryOnErrorTransformer$sam$io_reactivex_functions_Function$0(new Function1<C3957b<? extends Throwable>, C3957b<?>>(this.this$0) {
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
        }));
    }
}
