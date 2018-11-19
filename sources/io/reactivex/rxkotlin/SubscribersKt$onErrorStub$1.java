package io.reactivex.rxkotlin;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 6})
final class SubscribersKt$onErrorStub$1 extends Lambda implements Function1<Throwable, C15813i> {
    /* renamed from: a */
    public static final SubscribersKt$onErrorStub$1 f59134a = new SubscribersKt$onErrorStub$1();

    SubscribersKt$onErrorStub$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67680a((Throwable) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67680a(@NotNull Throwable th) {
        C2668g.b(th, "it");
        throw new OnErrorNotImplementedException(th);
    }
}
