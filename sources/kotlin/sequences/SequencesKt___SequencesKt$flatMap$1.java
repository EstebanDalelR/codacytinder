package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "R", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, k = 3, mv = {1, 1, 10})
final class SequencesKt___SequencesKt$flatMap$1 extends Lambda implements Function1<Sequence<? extends R>, Iterator<? extends R>> {
    /* renamed from: a */
    public static final SequencesKt___SequencesKt$flatMap$1 f59347a = new SequencesKt___SequencesKt$flatMap$1();

    SequencesKt___SequencesKt$flatMap$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68016a((Sequence) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Iterator<R> m68016a(@NotNull Sequence<? extends R> sequence) {
        C2668g.b(sequence, "it");
        return sequence.iterator();
    }
}
