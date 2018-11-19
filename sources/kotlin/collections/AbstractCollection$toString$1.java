package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 1, 10})
final class AbstractCollection$toString$1 extends Lambda implements Function1<E, CharSequence> {
    /* renamed from: a */
    final /* synthetic */ C17545a f59330a;

    AbstractCollection$toString$1(C17545a c17545a) {
        this.f59330a = c17545a;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m67953a(obj);
    }

    @NotNull
    /* renamed from: a */
    public final CharSequence m67953a(E e) {
        return (CharSequence) (e == this.f59330a ? "(this Collection)" : String.valueOf(e));
    }
}
