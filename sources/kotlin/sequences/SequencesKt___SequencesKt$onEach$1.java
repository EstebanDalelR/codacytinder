package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements Function1<T, T> {
    /* renamed from: a */
    final /* synthetic */ Function1 f59348a;

    SequencesKt___SequencesKt$onEach$1(Function1 function1) {
        this.f59348a = function1;
        super(1);
    }

    public final T invoke(T t) {
        this.f59348a.invoke(t);
        return t;
    }
}
