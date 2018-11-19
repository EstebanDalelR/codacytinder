package com.tinder.domain.common.reactivex;

import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.CompletableTransformer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "T", "completable", "apply"}, k = 3, mv = {1, 1, 10})
final class RetryOnErrorTransformer$forCompletable$1 implements CompletableTransformer {
    final /* synthetic */ RetryOnErrorTransformer this$0;

    RetryOnErrorTransformer$forCompletable$1(RetryOnErrorTransformer retryOnErrorTransformer) {
        this.this$0 = retryOnErrorTransformer;
    }

    public final C3956a apply(@NotNull C3956a c3956a) {
        C2668g.b(c3956a, "completable");
        return c3956a.b(new RetryOnErrorTransformer$sam$io_reactivex_functions_Function$0(new Function1<C3957b<? extends Throwable>, C3957b<?>>(this.this$0) {
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
